package com.google.android.libraries.p579ar.sceneviewer.accountability;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.ar.sceneviewer.accountability.CameraAccessAttributionHandler */
/* compiled from: PG */
public final class CameraAccessAttributionHandler {
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.accountability.CameraAccessAttributionHandler");
    private final AppOpsManager appOpsManager;
    private final String attributionTag;
    private final Context context;
    private final AtomicBoolean isAttributingUsage = new AtomicBoolean(false);

    public CameraAccessAttributionHandler(Context context2, String str) {
        this.context = context2;
        this.attributionTag = str;
        this.appOpsManager = (AppOpsManager) context2.getSystemService("appops");
    }

    public boolean isAttributionActive() {
        return this.isAttributingUsage.get();
    }

    public void notifyCameraUsageStart() {
        if (this.appOpsManager == null) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42312)).mo56386p("Unable to get access to app ops manager");
        } else if (Build.VERSION.SDK_INT < 30) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42311)).mo56386p("Android version is lower than R, not notifying attribution change.");
        } else if (!this.isAttributingUsage.getAndSet(true)) {
            ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42310)).mo56386p("Attributing camera usage.");
            this.appOpsManager.startOp("android:camera", Process.myUid(), this.context.getPackageName(), this.attributionTag, (String) null);
        }
    }

    public void notifyCameraUsageStop() {
        if (this.appOpsManager == null) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42315)).mo56386p("Unable to get access to app ops manager");
        } else if (Build.VERSION.SDK_INT < 30) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42314)).mo56386p("Android version is lower than R, not notifying attribution change.");
        } else if (this.isAttributingUsage.getAndSet(false)) {
            ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42313)).mo56386p("Ending camera usage attribution.");
            this.appOpsManager.finishOp("android:camera", Process.myUid(), this.context.getPackageName(), this.attributionTag);
        }
    }
}

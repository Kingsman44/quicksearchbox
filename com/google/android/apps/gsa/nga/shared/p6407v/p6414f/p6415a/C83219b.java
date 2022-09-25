package com.google.android.apps.gsa.nga.shared.p6407v.p6414f.p6415a;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.f.a.b */
/* compiled from: PG */
public final class C83219b {

    /* renamed from: a */
    private final ActivityManager f226842a;

    public C83219b(Context context) {
        this.f226842a = (ActivityManager) context.getSystemService("activity");
    }

    /* renamed from: a */
    public final boolean mo76650a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f226842a.getRunningAppProcesses();
        return runningAppProcesses != null && Collection.EL.stream(runningAppProcesses).anyMatch(C83218a.f226841a);
    }
}

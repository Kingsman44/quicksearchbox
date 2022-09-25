package com.google.android.libraries.lens.sdk.p2038a;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.p1623at.p1632e.C19557e;

/* renamed from: com.google.android.libraries.lens.sdk.a.k */
/* compiled from: PG */
public final /* synthetic */ class C24836k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24838m f67872a;

    public /* synthetic */ C24836k(C24838m mVar) {
        this.f67872a = mVar;
    }

    public final void run() {
        String str = "com.google.android.googlequicksearchbox";
        C24838m mVar = this.f67872a;
        Log.d("LensSdk", "Binding to Lens service.");
        int i = mVar.f67877d;
        if (i == 2) {
            Log.e("LensSdk", "Attempting to bind service while currently binding.");
        } else if (C24838m.m45963e(i)) {
            Log.e("LensSdk", "Attempting to bind service when already bound.");
        } else {
            boolean z = false;
            try {
                PackageInfo packageInfo = mVar.f67880g.getPackageInfo(str, 0);
                if (packageInfo != null && packageInfo.versionCode >= 301165494) {
                    mVar.mo30041d(2);
                    Intent intent = new Intent("com.google.android.lens.BIND");
                    if ("userdebug".equals(Build.TYPE) && C19557e.m37301c()) {
                        z = true;
                    }
                    if (true == z) {
                        str = "com.google.android.apps.search.lens.standalone";
                    }
                    intent.setPackage(str);
                    try {
                        if (!mVar.f67876c.bindService(intent, mVar, 65)) {
                            Log.e("LensSdk", "Unable to bind.");
                            mVar.mo30039b();
                            mVar.mo30041d(6);
                            return;
                        }
                        mVar.mo30041d(3);
                        return;
                    } catch (SecurityException e) {
                        Log.e("LensSdk", "Unable to bind due to security exception.", e);
                        mVar.mo30039b();
                        mVar.mo30041d(6);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("AgsaVersionChecker", "Unable to find agsa package: com.google.android.googlequicksearchbox");
            }
            Log.e("LensSdk", "Google search app isn't up to date.");
            mVar.mo30041d(5);
            mVar.mo30039b();
        }
    }
}

package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.g.a */
/* compiled from: PG */
public final class C76890a {
    /* renamed from: a */
    static int m123509a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.apps.recorder", 0);
            if (packageManager.getLaunchIntentForPackage("com.google.android.apps.recorder") != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    static int m123510b(int i) {
        return i >= 12000513 ? 4 : 1;
    }
}

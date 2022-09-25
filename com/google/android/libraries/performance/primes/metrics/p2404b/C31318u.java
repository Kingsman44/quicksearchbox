package com.google.android.libraries.performance.primes.metrics.p2404b;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.u */
/* compiled from: PG */
public final class C31318u {

    /* renamed from: a */
    private static final C59071e f84338a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.b.u");

    /* renamed from: a */
    public static String m58390a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f84338a.mo56226d()).mo56382g(e)).mo56372aa(50366)).mo56389s("Failed to get PackageInfo for: %s", packageName);
            return null;
        }
    }
}

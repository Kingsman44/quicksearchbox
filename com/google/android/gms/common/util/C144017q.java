package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143701ac;
import com.google.android.gms.common.p10782e.C143873c;

/* renamed from: com.google.android.gms.common.util.q */
/* compiled from: PG */
public final class C144017q {
    /* renamed from: a */
    public static boolean m234197a(Context context, int i) {
        if (!C143873c.f389983a.mo119351a(context).mo119350d(i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C143701ac a = C143701ac.m233450a(context);
            if (packageInfo == null) {
                return false;
            }
            if (!C143701ac.m233452g(packageInfo, false)) {
                if (!C143701ac.m233452g(packageInfo, true)) {
                    return false;
                }
                if (!C143700ab.m233444f(a.f389604a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }
}

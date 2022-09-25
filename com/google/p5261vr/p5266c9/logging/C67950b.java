package com.google.p5261vr.p5266c9.logging;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.clearcut.C143658k;

/* renamed from: com.google.vr.c9.logging.b */
/* compiled from: PG */
public final class C67950b {

    /* renamed from: a */
    private static C143658k f184156a;

    private C67950b() {
    }

    /* renamed from: a */
    public static C143658k m98217a(Context context, String str) {
        C143658k kVar;
        synchronized (C67950b.class) {
            if (f184156a == null) {
                try {
                    f184156a = new C143658k(context.createPackageContext(context.getPackageName(), 3), "AR_STREAMING", str);
                } catch (PackageManager.NameNotFoundException e) {
                    String obj = e.toString();
                    Log.e("C9", "Failed to initialize Clearcut logger. " + obj);
                    return null;
                }
            }
            kVar = f184156a;
        }
        return kVar;
    }
}

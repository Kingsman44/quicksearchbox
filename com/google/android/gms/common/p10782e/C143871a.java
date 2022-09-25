package com.google.android.gms.common.p10782e;

import android.content.Context;

/* renamed from: com.google.android.gms.common.e.a */
/* compiled from: PG */
public final class C143871a {

    /* renamed from: a */
    private static Context f389980a;

    /* renamed from: b */
    private static Boolean f389981b;

    /* renamed from: a */
    public static synchronized boolean m233880a(Context context) {
        Boolean bool;
        synchronized (C143871a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f389980a;
            if (context2 == null || (bool = f389981b) == null || context2 != applicationContext) {
                f389981b = null;
                Boolean valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                f389981b = valueOf;
                f389980a = applicationContext;
                boolean booleanValue = valueOf.booleanValue();
                return booleanValue;
            }
            boolean booleanValue2 = bool.booleanValue();
            return booleanValue2;
        }
    }
}

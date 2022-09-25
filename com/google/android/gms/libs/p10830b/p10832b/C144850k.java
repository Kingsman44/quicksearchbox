package com.google.android.gms.libs.p10830b.p10832b;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.libs.p10841e.C144864a;
import com.google.android.gms.libs.p10841e.C144865b;
import com.google.android.gms.libs.p10841e.C144866c;

/* renamed from: com.google.android.gms.libs.b.b.k */
/* compiled from: PG */
final class C144850k {
    /* renamed from: a */
    public static String m235435a(String str) {
        try {
            Object a = C144866c.m235449a("get", C144865b.m235448a(str), C144865b.m235448a(BuildConfig.FLAVOR));
            if (a == null) {
                return BuildConfig.FLAVOR;
            }
            return (String) a;
        } catch (ReflectiveOperationException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: b */
    public static int m235436b() {
        try {
            Object a = C144866c.m235449a("getInt", C144865b.m235448a("ro.boot.flash.locked"), new C144864a(Integer.TYPE, -1));
            if (a == null) {
                return -1;
            }
            return ((Integer) a).intValue();
        } catch (ReflectiveOperationException unused) {
            return -1;
        }
    }
}

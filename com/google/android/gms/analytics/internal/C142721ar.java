package com.google.android.gms.analytics.internal;

import android.util.Log;

@Deprecated
/* renamed from: com.google.android.gms.analytics.internal.ar */
/* compiled from: PG */
public final class C142721ar {

    /* renamed from: a */
    public static volatile C142709af f387298a = new C142709af();

    /* renamed from: a */
    public static void m231569a(String str, Object obj) {
        C142722as asVar = C142722as.f387299a;
        if (asVar != null) {
            asVar.mo117536i(6, str, obj, (Object) null, (Object) null);
        } else if (m231570b()) {
            if (obj != null) {
                str = str + ":" + ((String) obj);
            }
            Log.e((String) C142715al.f387255b.mo117506a(), str);
        }
    }

    /* renamed from: b */
    public static boolean m231570b() {
        if (f387298a == null) {
            return false;
        }
        int i = f387298a.f387237a;
        return true;
    }
}

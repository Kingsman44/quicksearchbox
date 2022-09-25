package com.google.android.libraries.onegoogle.common;

import com.google.android.gms.common.api.C143842n;

/* renamed from: com.google.android.libraries.onegoogle.common.m */
/* compiled from: PG */
public final class C30926m {
    /* renamed from: a */
    public static String m57721a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        return simpleName.endsWith("Exception") ? simpleName.contains("$") ? simpleName.substring(simpleName.lastIndexOf(36) + 1) : simpleName : th instanceof C143842n ? "ApiException" : "ObfuscatedException";
    }

    /* renamed from: b */
    public static Throwable m57722b(Throwable th, Class cls) {
        if (th == null) {
            return null;
        }
        if (th.getClass().equals(cls)) {
            return th;
        }
        return m57722b(th.getCause(), cls);
    }
}

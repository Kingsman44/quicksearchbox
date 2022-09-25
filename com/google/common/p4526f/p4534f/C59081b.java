package com.google.common.p4526f.p4534f;

/* renamed from: com.google.common.f.f.b */
/* compiled from: PG */
public final class C59081b {
    /* renamed from: a */
    public static Object m91349a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    /* renamed from: b */
    public static void m91350b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    public static boolean m91351c(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}

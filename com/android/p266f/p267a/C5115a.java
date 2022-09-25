package com.android.p266f.p267a;

/* renamed from: com.android.f.a.a */
/* compiled from: PG */
public final class C5115a {
    /* renamed from: a */
    public static boolean m13989a(String str) {
        if (str != null) {
            return str.startsWith("audio/") || str.equalsIgnoreCase("application/ogg");
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m13990b(String str) {
        return str != null && str.startsWith("image/");
    }
}

package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.f */
/* compiled from: PG */
public final /* synthetic */ class C40446f {
    /* renamed from: a */
    public static String m70145a(C40448h hVar) {
        C40448h hVar2 = C40448h.GET;
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            return "GET";
        }
        if (ordinal == 1) {
            return "POST";
        }
        if (ordinal == 2) {
            return "PUT";
        }
        if (ordinal == 3) {
            return "DELETE";
        }
        if (ordinal == 4) {
            return "HEAD";
        }
        throw new IllegalArgumentException("Unrecognized HTTP method");
    }
}

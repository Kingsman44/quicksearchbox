package com.p278b.p279a;

/* renamed from: com.b.a.h */
/* compiled from: PG */
final class C5499h {
    /* renamed from: a */
    public static final String m14220a(String str) {
        if (!str.startsWith("lib") || !str.endsWith(".so")) {
            return System.mapLibraryName(str);
        }
        return str;
    }
}

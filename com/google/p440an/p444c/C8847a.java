package com.google.p440an.p444c;

/* renamed from: com.google.an.c.a */
/* compiled from: PG */
public final class C8847a {
    /* renamed from: a */
    public static boolean m23487a(int i) {
        return i <= 126 ? i >= 32 || i == 10 || i == 13 || i == 9 || i == 12 : i < 55296 ? i >= 160 : i < 64976 ? i > 57343 : i > 65007 && (i & 65534) != 65534 && i <= 1114111;
    }
}

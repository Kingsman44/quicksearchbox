package com.google.android.libraries.micore.learning.p2258a;

/* renamed from: com.google.android.libraries.micore.learning.a.c */
/* compiled from: PG */
public final class C29693c {
    /* renamed from: a */
    public static int m54784a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m54785b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }
}

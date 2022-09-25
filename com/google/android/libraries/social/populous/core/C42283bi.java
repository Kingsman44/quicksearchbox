package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.bi */
/* compiled from: PG */
public final class C42283bi {
    /* renamed from: a */
    public static int m74437a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            return (i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) ? 0 : 1;
        }
        throw null;
    }

    /* renamed from: b */
    public static boolean m74438b(int i, int i2) {
        if (i == i2) {
            return true;
        }
        if (i == 2 || i == 8) {
            return i2 == 2 || i2 == 8;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m74439c(int i) {
        return m74437a(i) == 0;
    }
}

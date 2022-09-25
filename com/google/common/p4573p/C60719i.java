package com.google.common.p4573p;

/* renamed from: com.google.common.p.i */
/* compiled from: PG */
public final class C60719i {
    /* renamed from: a */
    public static void m92653a(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new ArithmeticException("overflow: " + str + "(" + i + ", " + i2 + ")");
        }
    }

    /* renamed from: b */
    static void m92654b(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
        }
    }

    /* renamed from: c */
    public static void m92655c(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}

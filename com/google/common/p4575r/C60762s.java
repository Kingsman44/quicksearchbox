package com.google.common.p4575r;

import java.math.BigInteger;

/* renamed from: com.google.common.r.s */
/* compiled from: PG */
final class C60762s {

    /* renamed from: a */
    static final long[] f164806a = new long[37];

    /* renamed from: b */
    static final int[] f164807b = new int[37];

    /* renamed from: c */
    static final int[] f164808c = new int[37];

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++) {
            long j = (long) i;
            long j2 = -1;
            f164806a[i] = C60763t.m92765b(-1, j);
            int[] iArr = f164807b;
            if (j >= 0) {
                long j3 = Long.MAX_VALUE / j;
                j2 = -1 - ((j3 + j3) * j);
                if (C60763t.m92764a(j2, j) < 0) {
                    j = 0;
                }
            } else if (C60763t.m92764a(-1, j) < 0) {
                iArr[i] = (int) j2;
                f164808c[i] = bigInteger.toString(i).length() - 1;
            }
            j2 -= j;
            iArr[i] = (int) j2;
            f164808c[i] = bigInteger.toString(i).length() - 1;
        }
    }

    /* renamed from: a */
    static boolean m92763a(long j, int i, int i2) {
        if (j < 0) {
            return true;
        }
        long j2 = f164806a[i2];
        if (j < j2) {
            return false;
        }
        return j > j2 || i > f164807b[i2];
    }
}

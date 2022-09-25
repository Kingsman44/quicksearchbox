package com.google.common.p4573p;

/* renamed from: com.google.common.p.k */
/* compiled from: PG */
public final class C60721k {
    /* renamed from: a */
    public static void m92657a(int i, double[] dArr, int i2, int i3) {
        if (i == i2) {
            int i4 = i2;
            for (int i5 = i2 + 1; i5 <= i3; i5++) {
                if (dArr[i4] > dArr[i5]) {
                    i4 = i5;
                }
            }
            if (i4 != i2) {
                double d = dArr[i4];
                dArr[i4] = dArr[i2];
                dArr[i2] = d;
                return;
            }
            return;
        }
        while (i3 > i2) {
            boolean z = true;
            int i6 = (i2 + i3) >>> 1;
            double d2 = dArr[i3];
            double d3 = dArr[i6];
            boolean z2 = d2 < d3;
            double d4 = dArr[i2];
            boolean z3 = d3 < d4;
            if (d2 >= d4) {
                z = false;
            }
            if (z2 == z3) {
                dArr[i6] = d4;
                dArr[i2] = d3;
            } else if (z2 != z) {
                dArr[i2] = d2;
                dArr[i3] = d4;
            }
            double d5 = dArr[i2];
            int i7 = i3;
            int i8 = i7;
            while (i7 > i2) {
                double d6 = dArr[i7];
                if (d6 > d5) {
                    double d7 = dArr[i8];
                    dArr[i8] = d6;
                    dArr[i7] = d7;
                    i8--;
                }
                i7--;
            }
            double d8 = dArr[i2];
            dArr[i2] = dArr[i8];
            dArr[i8] = d8;
            if (i8 >= i) {
                i3 = i8 - 1;
            }
            if (i8 <= i) {
                i2 = i8 + 1;
            }
        }
    }
}

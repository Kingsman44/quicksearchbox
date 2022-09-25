package com.google.common.p4573p;

import com.google.common.base.C58838bb;
import java.math.RoundingMode;

/* renamed from: com.google.common.p.j */
/* compiled from: PG */
public final class C60720j {
    /* renamed from: a */
    public static final double m92656a(double[] dArr, int i, int i2) {
        C58838bb.m90869d(r0 > 0, "Cannot calculate quantiles of an empty dataset");
        for (double isNaN : dArr) {
            if (Double.isNaN(isNaN)) {
                return Double.NaN;
            }
        }
        int i3 = r0 - 1;
        long j = ((long) i2) * ((long) i3);
        long j2 = (long) i;
        int d = (int) C60718h.m92650d(j, j2, RoundingMode.DOWN);
        int i4 = (int) (j - (((long) d) * j2));
        C60721k.m92657a(d, dArr, 0, i3);
        if (i4 == 0) {
            return dArr[d];
        }
        int i5 = d + 1;
        C60721k.m92657a(i5, dArr, i5, i3);
        double d2 = dArr[d];
        double d3 = dArr[i5];
        double d4 = (double) i4;
        double d5 = (double) i;
        if (d2 == Double.NEGATIVE_INFINITY) {
            if (d3 == Double.POSITIVE_INFINITY) {
                return Double.NaN;
            }
            return Double.NEGATIVE_INFINITY;
        } else if (d3 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        } else {
            Double.isNaN(d4);
            Double.isNaN(d5);
            return d2 + (((d3 - d2) * d4) / d5);
        }
    }
}

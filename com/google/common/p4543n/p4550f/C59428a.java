package com.google.common.p4543n.p4550f;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.common.n.f.a */
/* compiled from: PG */
final class C59428a {
    /* renamed from: b */
    public static final double m92329b(int i, int i2, C59429b bVar) {
        if (bVar.f157654d[i2] != C59203do.f157270a) {
            return bVar.f157656f;
        }
        while (i2 > i) {
            i2--;
            if (bVar.f157654d[i2] != C59203do.f157270a) {
                return bVar.f157653c.mo56952a(i2);
            }
        }
        return bVar.f157653c.mo56953b(0);
    }

    /* renamed from: c */
    public static final double m92330c(int i, int i2, C59429b bVar) {
        if (i <= i2 && bVar.f157654d[i] != C59203do.f157270a) {
            return bVar.f157655e;
        }
        while (i < i2) {
            i++;
            if (bVar.f157654d[i] != C59203do.f157270a) {
                return bVar.f157653c.mo56953b(i);
            }
        }
        return Double.POSITIVE_INFINITY;
    }

    /* renamed from: a */
    public static final double m92328a(int i, double d, int i2, int i3, C59429b bVar) {
        double d2;
        double d3;
        double d4;
        double d5;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        C59429b bVar2 = bVar;
        if (i4 == i5) {
            d2 = bVar2.f157655e;
        } else {
            d2 = Math.min(bVar2.f157653c.mo56953b(i4), bVar2.f157656f);
        }
        if (i4 == i6) {
            d3 = bVar2.f157656f;
        } else {
            d3 = Math.max(bVar2.f157653c.mo56952a(i4), bVar2.f157655e);
        }
        double d6 = bVar2.f157654d[i4];
        if (i4 == i5) {
            d4 = d - 4.0d;
            d5 = d6 - 4.0d;
            if (i4 == i6) {
                d5 -= 4.0d;
                if (d5 <= C59203do.f157270a) {
                    double d7 = d5 * 0.5d;
                    if (d4 < d7) {
                        return d2;
                    }
                    return (d4 > d7 || (d2 == Double.NEGATIVE_INFINITY && d3 == Double.POSITIVE_INFINITY)) ? d3 : (d2 + d3) * 0.5d;
                } else if (d4 >= d5) {
                    return d3;
                }
            }
            if (d4 <= C59203do.f157270a) {
                return d2;
            }
        } else {
            if (i4 == i6) {
                d6 -= 4.0d;
                if (d >= d6) {
                    return d3;
                }
            }
            d4 = d;
        }
        if (d2 == d3) {
            return d2;
        }
        if (d2 == Double.NEGATIVE_INFINITY) {
            return (d3 != Double.POSITIVE_INFINITY || d4 < d5 * 0.5d) ? d2 : d3;
        }
        return d2 + (((d3 - d2) * d4) / d5);
    }
}

package com.google.common.p4543n.p4550f;

import com.google.common.p4535g.C59203do;
import java.util.Arrays;
import p3186j$.util.Objects;

/* renamed from: com.google.common.n.f.b */
/* compiled from: PG */
public final class C59429b {

    /* renamed from: a */
    public static final double f157651a = Math.pow(2.0d, -52.0d);

    /* renamed from: b */
    public static final C59440m f157652b = new C59440m();

    /* renamed from: c */
    final C59436i f157653c;

    /* renamed from: d */
    double[] f157654d;

    /* renamed from: e */
    double f157655e;

    /* renamed from: f */
    double f157656f;

    /* renamed from: g */
    double f157657g;

    /* renamed from: h */
    double f157658h;

    /* renamed from: i */
    double f157659i;

    public C59429b(C59436i iVar) {
        this.f157653c = iVar;
        int i = 1;
        while (i < this.f157653c.f157680a.mo56946b() && this.f157653c.mo56953b(i) == this.f157653c.mo56953b(0)) {
            i++;
        }
        this.f157654d = new double[i];
        this.f157655e = Double.POSITIVE_INFINITY;
        this.f157656f = this.f157653c.mo56953b(0);
        this.f157657g = C59203do.f157270a;
        this.f157658h = C59203do.f157270a;
        this.f157659i = C59203do.f157270a;
    }

    /* renamed from: c */
    private final double[] m92331c() {
        int a = this.f157653c.f157680a.mo56945a(this.f157656f) + 1;
        double[] dArr = this.f157654d;
        return dArr.length == a ? dArr : Arrays.copyOf(dArr, a);
    }

    /* renamed from: a */
    public final double mo56931a(double d) {
        double d2 = (this.f157657g * d) / 100.0d;
        int a = this.f157653c.f157680a.mo56945a(this.f157655e);
        int a2 = this.f157653c.f157680a.mo56945a(this.f157656f);
        if (d2 <= C59203do.f157270a || d2 >= this.f157657g) {
            if (d2 > C59203do.f157270a) {
                return C59428a.m92329b(a, a2, this);
            }
            if (d2 >= this.f157657g) {
                return Double.NaN;
            }
            return C59428a.m92330c(a, a2, this);
        } else if (Double.isNaN(d2)) {
            return d2;
        } else {
            double d3 = this.f157657g;
            if (d2 <= d3 * 0.5d) {
                int i = a;
                double d4 = 0.0d;
                while (i <= a2) {
                    double[] dArr = this.f157654d;
                    d4 += dArr[i];
                    i++;
                    if (d4 >= d2) {
                        if (d4 == d2) {
                            int i2 = i - 1;
                            double max = Math.max(this.f157653c.mo56952a(i2), this.f157655e);
                            if (i2 == a && this.f157654d[i2] <= 1.0d) {
                                max = this.f157655e;
                            }
                            while (i <= a2 && this.f157654d[i] == C59203do.f157270a) {
                                i++;
                            }
                            if (i > a2) {
                                return C59428a.m92329b(a, a2, this);
                            }
                            double min = Math.min(this.f157653c.mo56953b(i), this.f157656f);
                            if (i == a2 && this.f157654d[i] <= 1.0d) {
                                min = this.f157656f;
                            }
                            return (max + min) * 0.5d;
                        }
                        int i3 = i - 1;
                        return C59428a.m92328a(i3, d2 - (d4 - dArr[i3]), a, a2, this);
                    }
                }
                return C59428a.m92329b(a, a2, this);
            }
            double d5 = d3 - d2;
            int i4 = a2;
            double d6 = 0.0d;
            while (i4 >= a) {
                d6 += this.f157654d[i4];
                i4--;
                if (d6 >= d5) {
                    if (d6 != d5) {
                        return C59428a.m92328a(i4 + 1, d6 - d5, a, a2, this);
                    }
                    int i5 = i4 + 1;
                    double min2 = Math.min(this.f157653c.mo56953b(i5), this.f157656f);
                    if (i5 == a2 && this.f157654d[i5] <= 1.0d) {
                        min2 = this.f157656f;
                    }
                    while (i4 >= a && this.f157654d[i4] == C59203do.f157270a) {
                        i4--;
                    }
                    if (i4 < a) {
                        return C59428a.m92330c(a, a2, this);
                    }
                    double max2 = Math.max(this.f157653c.mo56952a(i4), this.f157655e);
                    if (i4 == a && this.f157654d[i4] <= 1.0d) {
                        max2 = this.f157655e;
                    }
                    return (max2 + min2) * 0.5d;
                }
            }
            return C59428a.m92330c(a, a2, this);
        }
    }

    /* renamed from: b */
    public final boolean mo56932b() {
        return this.f157657g == C59203do.f157270a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59429b) {
            C59429b bVar = (C59429b) obj;
            if (this.f157655e == bVar.f157655e && this.f157656f == bVar.f157656f && this.f157657g == bVar.f157657g && this.f157658h == bVar.f157658h && this.f157659i == bVar.f157659i && this.f157653c.mo56954c(bVar.f157653c) && Arrays.equals(m92331c(), bVar.m92331c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.f157655e), Double.valueOf(this.f157656f), Double.valueOf(this.f157657g), Double.valueOf(this.f157658h), Double.valueOf(this.f157659i), Integer.valueOf(Arrays.hashCode(m92331c())), this.f157653c);
    }

    public final String toString() {
        return f157652b.mo56957a(this);
    }
}

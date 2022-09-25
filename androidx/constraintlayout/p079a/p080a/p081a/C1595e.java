package androidx.constraintlayout.p079a.p080a.p081a;

import com.google.common.p4535g.C59203do;

/* renamed from: androidx.constraintlayout.a.a.a.e */
/* compiled from: PG */
final class C1595e extends C1596f {

    /* renamed from: a */
    final double f4394a;

    /* renamed from: b */
    final double f4395b;

    /* renamed from: c */
    final double f4396c;

    /* renamed from: d */
    final double f4397d;

    public C1595e(String str) {
        this.f4400g = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f4394a = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        int indexOf3 = str.indexOf(44, i);
        this.f4395b = Double.parseDouble(str.substring(i, indexOf3).trim());
        int i2 = indexOf3 + 1;
        int indexOf4 = str.indexOf(44, i2);
        this.f4396c = Double.parseDouble(str.substring(i2, indexOf4).trim());
        int i3 = indexOf4 + 1;
        this.f4397d = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    /* renamed from: d */
    private final double m4242d(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        return (this.f4394a * d2 * d3 * d) + (this.f4396c * d3 * d * d) + (d * d * d);
    }

    /* renamed from: e */
    private final double m4243e(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        return (this.f4395b * d2 * d3 * d) + (this.f4397d * d3 * d * d) + (d * d * d);
    }

    /* renamed from: a */
    public final double mo4521a(double d) {
        if (d <= C59203do.f157270a) {
            return C59203do.f157270a;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 0.01d) {
            d2 *= 0.5d;
            d3 = m4242d(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = m4242d(d4);
        double d6 = d3 + d2;
        double d7 = m4242d(d6);
        double e = m4243e(d4);
        return (((m4243e(d6) - e) * (d - d5)) / (d7 - d5)) + e;
    }

    /* renamed from: b */
    public final double mo4522b(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            d3 = m4242d(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        return (m4243e(d5) - m4243e(d4)) / (m4242d(d5) - m4242d(d4));
    }
}

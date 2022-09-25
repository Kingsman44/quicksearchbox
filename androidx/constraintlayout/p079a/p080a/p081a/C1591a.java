package androidx.constraintlayout.p079a.p080a.p081a;

import com.google.common.p4535g.C59203do;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.a.a.a */
/* compiled from: PG */
final class C1591a {

    /* renamed from: s */
    private static final double[] f4370s = new double[91];

    /* renamed from: a */
    double[] f4371a;

    /* renamed from: b */
    double f4372b;

    /* renamed from: c */
    double f4373c;

    /* renamed from: d */
    double f4374d;

    /* renamed from: e */
    double f4375e;

    /* renamed from: f */
    double f4376f;

    /* renamed from: g */
    double f4377g;

    /* renamed from: h */
    double f4378h;

    /* renamed from: i */
    double f4379i;

    /* renamed from: j */
    double f4380j;

    /* renamed from: k */
    double f4381k;

    /* renamed from: l */
    double f4382l;

    /* renamed from: m */
    double f4383m;

    /* renamed from: n */
    double f4384n;

    /* renamed from: o */
    double f4385o;

    /* renamed from: p */
    double f4386p;

    /* renamed from: q */
    boolean f4387q;

    /* renamed from: r */
    boolean f4388r = false;

    public C1591a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
        boolean z;
        int i2 = i;
        double d7 = d;
        double d8 = d2;
        double d9 = d3;
        double d10 = d4;
        double d11 = d5;
        double d12 = d6;
        boolean z2 = false;
        this.f4387q = i2 == 1 ? true : z2;
        this.f4373c = d7;
        this.f4374d = d8;
        this.f4379i = 1.0d / (d8 - d7);
        if (i2 == 3) {
            this.f4388r = true;
            z = true;
        } else {
            z = false;
        }
        double d13 = d11 - d9;
        double d14 = d12 - d10;
        if (z || Math.abs(d13) < 0.001d || Math.abs(d14) < 0.001d) {
            this.f4388r = true;
            this.f4375e = d9;
            this.f4376f = d5;
            this.f4377g = d10;
            this.f4378h = d12;
            double hypot = Math.hypot(d14, d13);
            this.f4372b = hypot;
            this.f4384n = hypot * this.f4379i;
            double d15 = this.f4374d - this.f4373c;
            this.f4382l = d13 / d15;
            this.f4383m = d14 / d15;
            return;
        }
        this.f4371a = new double[101];
        boolean z3 = this.f4387q;
        double d16 = (double) (true != z3 ? 1 : -1);
        Double.isNaN(d16);
        this.f4380j = d16 * d13;
        double d17 = (double) (true != z3 ? -1 : 1);
        Double.isNaN(d17);
        this.f4381k = d14 * d17;
        this.f4382l = true == z3 ? d5 : d9;
        this.f4383m = true != z3 ? d12 : d10;
        double d18 = d10 - d12;
        double d19 = C59203do.f157270a;
        double d20 = 0.0d;
        double d21 = 0.0d;
        double d22 = 0.0d;
        int i3 = 0;
        while (i3 < 91) {
            double d23 = (double) i3;
            Double.isNaN(d23);
            double radians = Math.toRadians((d23 * 90.0d) / 90.0d);
            double sin = Math.sin(radians) * d13;
            double cos = Math.cos(radians) * d18;
            if (i3 > 0) {
                d20 += Math.hypot(sin - d21, cos - d22);
                f4370s[i3] = d20;
            }
            i3++;
            d22 = cos;
            d21 = sin;
        }
        this.f4372b = d20;
        int i4 = 0;
        while (true) {
            double[] dArr = f4370s;
            if (i4 >= 91) {
                break;
            }
            dArr[i4] = dArr[i4] / d20;
            i4++;
        }
        int i5 = 0;
        while (true) {
            int length = this.f4371a.length;
            if (i5 < 101) {
                double d24 = (double) i5;
                Double.isNaN(d24);
                double d25 = d24 / 100.0d;
                double[] dArr2 = f4370s;
                int binarySearch = Arrays.binarySearch(dArr2, d25);
                if (binarySearch >= 0) {
                    double[] dArr3 = this.f4371a;
                    double d26 = (double) binarySearch;
                    Double.isNaN(d26);
                    dArr3[i5] = d26 / 90.0d;
                } else if (binarySearch == -1) {
                    this.f4371a[i5] = d19;
                } else {
                    int i6 = -binarySearch;
                    int i7 = i6 - 2;
                    double d27 = dArr2[i7];
                    double d28 = dArr2[i6 - 1];
                    double[] dArr4 = this.f4371a;
                    double d29 = (double) i7;
                    Double.isNaN(d29);
                    dArr4[i5] = (d29 + ((d25 - d27) / (d28 - d27))) / 90.0d;
                }
                i5++;
                d19 = C59203do.f157270a;
            } else {
                this.f4384n = this.f4372b * this.f4379i;
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final double mo4509a() {
        double d = this.f4380j * this.f4386p;
        double d2 = this.f4381k;
        double hypot = this.f4384n / Math.hypot(d, (-d2) * this.f4385o);
        if (this.f4387q) {
            d = -d;
        }
        return d * hypot;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final double mo4510b() {
        double d = this.f4380j;
        double d2 = this.f4386p;
        double d3 = (-this.f4381k) * this.f4385o;
        double hypot = this.f4384n / Math.hypot(d * d2, d3);
        return this.f4387q ? (-d3) * hypot : d3 * hypot;
    }

    /* renamed from: c */
    public final double mo4511c(double d) {
        double d2 = this.f4373c;
        double d3 = this.f4379i;
        double d4 = this.f4375e;
        return d4 + ((d - d2) * d3 * (this.f4376f - d4));
    }

    /* renamed from: d */
    public final double mo4512d(double d) {
        double d2 = this.f4373c;
        double d3 = this.f4379i;
        double d4 = this.f4377g;
        return d4 + ((d - d2) * d3 * (this.f4378h - d4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final double mo4513e() {
        return this.f4382l + (this.f4380j * this.f4385o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final double mo4514f() {
        return this.f4383m + (this.f4381k * this.f4386p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo4515g(double d) {
        double d2;
        if (this.f4387q) {
            d2 = this.f4374d - d;
        } else {
            d2 = d - this.f4373c;
        }
        double d3 = d2 * this.f4379i;
        double d4 = C59203do.f157270a;
        if (d3 > C59203do.f157270a) {
            d4 = 1.0d;
            if (d3 < 1.0d) {
                double[] dArr = this.f4371a;
                int length = dArr.length;
                double d5 = d3 * 100.0d;
                int i = (int) d5;
                double d6 = dArr[i];
                double d7 = (double) i;
                Double.isNaN(d7);
                d4 = d6 + ((d5 - d7) * (dArr[i + 1] - d6));
            }
        }
        double d8 = d4 * 1.5707963267948966d;
        this.f4385o = Math.sin(d8);
        this.f4386p = Math.cos(d8);
    }
}

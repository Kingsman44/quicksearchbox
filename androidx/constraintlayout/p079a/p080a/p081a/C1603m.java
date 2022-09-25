package androidx.constraintlayout.p079a.p080a.p081a;

import com.google.common.p4535g.C59203do;
import java.lang.reflect.Array;

/* renamed from: androidx.constraintlayout.a.a.a.m */
/* compiled from: PG */
public final class C1603m extends C1594d {

    /* renamed from: a */
    double[] f4425a;

    /* renamed from: b */
    private double[] f4426b;

    /* renamed from: c */
    private double[][] f4427c;

    /* renamed from: d */
    private double[][] f4428d;

    /* renamed from: e */
    private boolean f4429e = true;

    public C1603m(double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        double[][] dArr4 = dArr2;
        int length = dArr3.length;
        int length2 = dArr4[0].length;
        this.f4425a = new double[length2];
        int i = length - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i;
        double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr3[i4];
                double d2 = dArr3[i3];
                double[] dArr7 = dArr5[i3];
                double d3 = (dArr4[i4][i2] - dArr4[i3][i2]) / (d - d2);
                dArr7[i2] = d3;
                if (i3 == 0) {
                    dArr6[0][i2] = dArr5[0][i2];
                } else {
                    dArr6[i3][i2] = (dArr5[i3 - 1][i2] + d3) * 0.5d;
                }
                i3 = i4;
            }
            dArr6[i][i2] = dArr5[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d4 = dArr5[i5][i6];
                if (d4 == C59203do.f157270a) {
                    dArr6[i5][i6] = 0.0d;
                    dArr6[i5 + 1][i6] = 0.0d;
                } else {
                    double d5 = dArr6[i5][i6] / d4;
                    int i7 = i5 + 1;
                    double d6 = dArr6[i7][i6] / d4;
                    double hypot = Math.hypot(d5, d6);
                    if (hypot > 9.0d) {
                        double d7 = 3.0d / hypot;
                        double[] dArr8 = dArr6[i5];
                        double[] dArr9 = dArr5[i5];
                        dArr8[i6] = d5 * d7 * dArr9[i6];
                        dArr6[i7][i6] = d7 * d6 * dArr9[i6];
                    }
                }
            }
        }
        this.f4426b = dArr3;
        this.f4427c = dArr4;
        this.f4428d = dArr6;
    }

    /* renamed from: h */
    private static double m4259h(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 3.0d * d;
        return (((((((((-6.0d * d7) * d4) + (d8 * d4)) + ((6.0d * d7) * d3)) - (d8 * d3)) + ((d9 * d6) * d7)) + ((d9 * d5) * d7)) - (((d + d) * d6) * d2)) - (((4.0d * d) * d5) * d2)) + (d * d5);
    }

    /* renamed from: i */
    private static double m4260i(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d * d6;
        double d11 = d * d5;
        return ((((((((((-2.0d * d8) * d4) + (d9 * d4)) + ((d8 + d8) * d3)) - (d9 * d3)) + d3) + (d10 * d8)) + (d8 * d11)) - (d10 * d7)) - (((d + d) * d5) * d7)) + (d11 * d2);
    }

    /* renamed from: a */
    public final void mo4516a(double d, double[] dArr) {
        double[] dArr2 = this.f4426b;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f4427c[0].length;
        if (this.f4429e) {
            double d2 = dArr2[0];
            if (d <= d2) {
                mo4518c(d2, this.f4425a);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f4427c[0][i2] + ((d - this.f4426b[0]) * this.f4425a[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                mo4518c(d3, this.f4425a);
                while (i < length2) {
                    dArr[i] = this.f4427c[i3][i] + ((d - this.f4426b[i3]) * this.f4425a[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f4427c[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f4427c[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f4426b[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f4427c[i6][i7];
                }
            }
            double[] dArr3 = this.f4426b;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr4 = this.f4427c;
                    double d8 = dArr4[i6][i];
                    double d9 = dArr4[i8][i];
                    double[][] dArr5 = this.f4428d;
                    dArr[i] = m4260i(d6, d7, d8, d9, dArr5[i6][i], dArr5[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: b */
    public final void mo4517b(double d, float[] fArr) {
        double[] dArr = this.f4426b;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f4427c[0].length;
        if (this.f4429e) {
            double d2 = dArr[0];
            if (d <= d2) {
                mo4518c(d2, this.f4425a);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f4427c[0][i2] + ((d - this.f4426b[0]) * this.f4425a[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                mo4518c(d3, this.f4425a);
                while (i < length2) {
                    fArr[i] = (float) (this.f4427c[i3][i] + ((d - this.f4426b[i3]) * this.f4425a[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f4427c[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f4427c[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f4426b[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f4427c[i6][i7];
                }
            }
            double[] dArr2 = this.f4426b;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr3 = this.f4427c;
                    double d8 = dArr3[i6][i];
                    double d9 = dArr3[i8][i];
                    double[][] dArr4 = this.f4428d;
                    fArr[i] = (float) m4260i(d6, d7, d8, d9, dArr4[i6][i], dArr4[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: c */
    public final void mo4518c(double d, double[] dArr) {
        double[] dArr2 = this.f4426b;
        int length = dArr2.length;
        int length2 = this.f4427c[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.f4426b;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d2 <= d3) {
                double d4 = dArr3[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.f4427c;
                    double d7 = dArr4[i][i3];
                    double d8 = dArr4[i2][i3];
                    double[][] dArr5 = this.f4428d;
                    dArr[i3] = m4259h(d5, d6, d7, d8, dArr5[i][i3], dArr5[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public final double[] mo4519d() {
        return this.f4426b;
    }

    /* renamed from: e */
    public final double mo4520e(double d) {
        double[] dArr = this.f4426b;
        int length = dArr.length;
        if (this.f4429e) {
            double d2 = dArr[0];
            if (d <= d2) {
                return this.f4427c[0][0] + ((d - d2) * mo4531g(d2));
            }
            int i = length - 1;
            double d3 = dArr[i];
            if (d >= d3) {
                return this.f4427c[i][0] + ((d - d3) * mo4531g(d3));
            }
        } else if (d <= dArr[0]) {
            return this.f4427c[0][0];
        } else {
            int i2 = length - 1;
            if (d >= dArr[i2]) {
                return this.f4427c[i2][0];
            }
        }
        int i3 = 0;
        while (i3 < length - 1) {
            double[] dArr2 = this.f4426b;
            double d4 = dArr2[i3];
            if (d == d4) {
                return this.f4427c[i3][0];
            }
            int i4 = i3 + 1;
            double d5 = dArr2[i4];
            if (d >= d5) {
                i3 = i4;
            } else {
                double d6 = d5 - d4;
                double[][] dArr3 = this.f4427c;
                double d7 = dArr3[i3][0];
                double d8 = dArr3[i4][0];
                double[][] dArr4 = this.f4428d;
                return m4260i(d6, (d - d4) / d6, d7, d8, dArr4[i3][0], dArr4[i4][0]);
            }
        }
        return C59203do.f157270a;
    }

    /* renamed from: g */
    public final double mo4531g(double d) {
        double[] dArr = this.f4426b;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr2 = this.f4426b;
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d2 > d3) {
                i = i2;
            } else {
                double d4 = dArr2[i];
                double d5 = d3 - d4;
                double[][] dArr3 = this.f4427c;
                double d6 = dArr3[i][0];
                double d7 = dArr3[i2][0];
                double[][] dArr4 = this.f4428d;
                return m4259h(d5, (d2 - d4) / d5, d6, d7, dArr4[i][0], dArr4[i2][0]) / d5;
            }
        }
        return C59203do.f157270a;
    }
}

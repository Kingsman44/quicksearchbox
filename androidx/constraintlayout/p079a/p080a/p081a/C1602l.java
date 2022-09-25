package androidx.constraintlayout.p079a.p080a.p081a;

import com.google.common.p4535g.C59203do;

/* renamed from: androidx.constraintlayout.a.a.a.l */
/* compiled from: PG */
public final class C1602l extends C1594d {

    /* renamed from: a */
    double[] f4421a;

    /* renamed from: b */
    private double[] f4422b;

    /* renamed from: c */
    private double[][] f4423c;

    /* renamed from: d */
    private boolean f4424d = true;

    public C1602l(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f4421a = new double[length2];
        this.f4422b = dArr;
        this.f4423c = dArr2;
        if (length2 > 2) {
            double d = C59203do.f157270a;
            double d2 = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double d3 = dArr2[i][0];
                if (i > 0) {
                    Math.hypot(d3 - d, d3 - d2);
                }
                i++;
                d = d3;
                d2 = d;
            }
        }
    }

    /* renamed from: a */
    public final void mo4516a(double d, double[] dArr) {
        double[] dArr2 = this.f4422b;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f4423c[0].length;
        if (this.f4424d) {
            double d2 = dArr2[0];
            if (d <= d2) {
                mo4518c(d2, this.f4421a);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f4423c[0][i2] + ((d - this.f4422b[0]) * this.f4421a[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                mo4518c(d3, this.f4421a);
                while (i < length2) {
                    dArr[i] = this.f4423c[i3][i] + ((d - this.f4422b[i3]) * this.f4421a[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f4423c[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f4423c[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f4422b[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f4423c[i6][i7];
                }
            }
            double[] dArr3 = this.f4422b;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr4 = this.f4423c;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d6)) + (dArr4[i8][i] * d6);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: b */
    public final void mo4517b(double d, float[] fArr) {
        double[] dArr = this.f4422b;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f4423c[0].length;
        if (this.f4424d) {
            double d2 = dArr[0];
            if (d <= d2) {
                mo4518c(d2, this.f4421a);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f4423c[0][i2] + ((d - this.f4422b[0]) * this.f4421a[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                mo4518c(d3, this.f4421a);
                while (i < length2) {
                    fArr[i] = (float) (this.f4423c[i3][i] + ((d - this.f4422b[i3]) * this.f4421a[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f4423c[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f4423c[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f4422b[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f4423c[i6][i7];
                }
            }
            double[] dArr2 = this.f4422b;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr3 = this.f4423c;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d6)) + (dArr3[i8][i] * d6));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r13 >= r4) goto L_0x000f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4518c(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f4422b
            int r1 = r0.length
            double[][] r2 = r12.f4423c
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0011
        L_0x000f:
            r13 = r4
            goto L_0x001a
        L_0x0011:
            int r4 = r1 + -1
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            r0 = 0
        L_0x001b:
            int r4 = r1 + -1
            if (r0 >= r4) goto L_0x0041
            double[] r4 = r12.f4422b
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x003f
            r13 = r4[r0]
            double r6 = r6 - r13
        L_0x002c:
            if (r3 >= r2) goto L_0x0041
            double[][] r13 = r12.f4423c
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L_0x002c
        L_0x003f:
            r0 = r5
            goto L_0x001b
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p080a.p081a.C1602l.mo4518c(double, double[]):void");
    }

    /* renamed from: d */
    public final double[] mo4519d() {
        return this.f4422b;
    }

    /* renamed from: e */
    public final double mo4520e(double d) {
        double d2;
        double d3;
        double g;
        double[] dArr = this.f4422b;
        int length = dArr.length;
        if (this.f4424d) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.f4423c[0][0];
                d3 = d - d4;
                g = mo4530g(d4);
            } else {
                int i = length - 1;
                double d5 = dArr[i];
                if (d >= d5) {
                    d2 = this.f4423c[i][0];
                    d3 = d - d5;
                    g = mo4530g(d5);
                }
            }
            return d2 + (d3 * g);
        } else if (d <= dArr[0]) {
            return this.f4423c[0][0];
        } else {
            int i2 = length - 1;
            if (d >= dArr[i2]) {
                return this.f4423c[i2][0];
            }
        }
        int i3 = 0;
        while (i3 < length - 1) {
            double[] dArr2 = this.f4422b;
            double d6 = dArr2[i3];
            if (d == d6) {
                return this.f4423c[i3][0];
            }
            int i4 = i3 + 1;
            double d7 = dArr2[i4];
            if (d >= d7) {
                i3 = i4;
            } else {
                double d8 = (d - d6) / (d7 - d6);
                double[][] dArr3 = this.f4423c;
                return (dArr3[i3][0] * (1.0d - d8)) + (dArr3[i4][0] * d8);
            }
        }
        return C59203do.f157270a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r10 >= r3) goto L_0x000a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double mo4530g(double r10) {
        /*
            r9 = this;
            double[] r0 = r9.f4422b
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x000c
        L_0x000a:
            r10 = r3
            goto L_0x0015
        L_0x000c:
            int r3 = r1 + -1
            r3 = r0[r3]
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            r0 = 0
        L_0x0016:
            int r3 = r1 + -1
            if (r0 >= r3) goto L_0x0036
            double[] r3 = r9.f4422b
            int r4 = r0 + 1
            r5 = r3[r4]
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0026
            r0 = r4
            goto L_0x0016
        L_0x0026:
            r10 = r3[r0]
            double[][] r1 = r9.f4423c
            r0 = r1[r0]
            r7 = r0[r2]
            r0 = r1[r4]
            r1 = r0[r2]
            double r1 = r1 - r7
            double r5 = r5 - r10
            double r1 = r1 / r5
            return r1
        L_0x0036:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p080a.p081a.C1602l.mo4530g(double):double");
    }
}

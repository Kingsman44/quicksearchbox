package androidx.constraintlayout.p079a.p080a.p081a;

/* renamed from: androidx.constraintlayout.a.a.a.b */
/* compiled from: PG */
public final class C1592b extends C1594d {

    /* renamed from: a */
    C1591a[] f4389a;

    /* renamed from: b */
    private final double[] f4390b;

    /* renamed from: c */
    private boolean f4391c = true;

    public C1592b(int[] iArr, double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        this.f4390b = dArr3;
        this.f4389a = new C1591a[(dArr3.length - 1)];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C1591a[] aVarArr = this.f4389a;
            if (i < aVarArr.length) {
                int i4 = iArr[i];
                if (i4 == 0) {
                    i3 = 3;
                } else if (i4 == 1) {
                    i2 = 1;
                    i3 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                    i3 = 2;
                } else if (i4 == 3) {
                    i2 = i2 == 1 ? 2 : 1;
                    i3 = i2;
                }
                double d = dArr3[i];
                int i5 = i + 1;
                double d2 = dArr3[i5];
                double[] dArr4 = dArr2[i];
                double d3 = dArr4[0];
                double d4 = dArr4[1];
                double[] dArr5 = dArr2[i5];
                aVarArr[i] = new C1591a(i3, d, d2, d3, d4, dArr5[0], dArr5[1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo4516a(double d, double[] dArr) {
        if (this.f4391c) {
            C1591a[] aVarArr = this.f4389a;
            C1591a aVar = aVarArr[0];
            double d2 = aVar.f4373c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f4388r) {
                    double c = aVar.mo4511c(d2);
                    C1591a aVar2 = this.f4389a[0];
                    dArr[0] = c + (aVar2.f4382l * d3);
                    dArr[1] = aVar2.mo4512d(d2) + (d3 * this.f4389a[0].f4383m);
                    return;
                }
                aVar.mo4515g(d2);
                dArr[0] = this.f4389a[0].mo4513e() + (this.f4389a[0].mo4509a() * d3);
                dArr[1] = this.f4389a[0].mo4514f() + (d3 * this.f4389a[0].mo4510b());
                return;
            }
            int length = aVarArr.length - 1;
            C1591a aVar3 = aVarArr[length];
            double d4 = aVar3.f4374d;
            if (d > d4) {
                double d5 = d - d4;
                if (aVar3.f4388r) {
                    double c2 = aVar3.mo4511c(d4);
                    C1591a aVar4 = this.f4389a[length];
                    dArr[0] = c2 + (aVar4.f4382l * d5);
                    dArr[1] = aVar4.mo4512d(d4) + (d5 * this.f4389a[length].f4383m);
                    return;
                }
                aVar3.mo4515g(d);
                dArr[0] = this.f4389a[length].mo4513e() + (this.f4389a[length].mo4509a() * d5);
                dArr[1] = this.f4389a[length].mo4514f() + (d5 * this.f4389a[length].mo4510b());
                return;
            }
        } else {
            C1591a[] aVarArr2 = this.f4389a;
            double d6 = aVarArr2[0].f4373c;
            if (d < d6) {
                d = d6;
            }
            double d7 = aVarArr2[aVarArr2.length - 1].f4374d;
            if (d > d7) {
                d = d7;
            }
        }
        int i = 0;
        while (true) {
            C1591a[] aVarArr3 = this.f4389a;
            if (i < aVarArr3.length) {
                C1591a aVar5 = aVarArr3[i];
                if (d > aVar5.f4374d) {
                    i++;
                } else if (aVar5.f4388r) {
                    dArr[0] = aVar5.mo4511c(d);
                    dArr[1] = this.f4389a[i].mo4512d(d);
                    return;
                } else {
                    aVar5.mo4515g(d);
                    dArr[0] = this.f4389a[i].mo4513e();
                    dArr[1] = this.f4389a[i].mo4514f();
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c7, code lost:
        if (r11 > r3) goto L_0x00bc;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4517b(double r11, float[] r13) {
        /*
            r10 = this;
            boolean r0 = r10.f4391c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00b2
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r3 = r0[r2]
            double r4 = r3.f4373c
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0066
            double r11 = r11 - r4
            boolean r0 = r3.f4388r
            if (r0 == 0) goto L_0x0036
            double r6 = r3.mo4511c(r4)
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r0 = r0[r2]
            double r8 = r0.f4382l
            double r8 = r8 * r11
            double r6 = r6 + r8
            float r3 = (float) r6
            r13[r2] = r3
            double r3 = r0.mo4512d(r4)
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r0 = r0[r2]
            double r5 = r0.f4383m
            double r11 = r11 * r5
            double r3 = r3 + r11
            float r11 = (float) r3
            r13[r1] = r11
            return
        L_0x0036:
            r3.mo4515g(r4)
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r0 = r0[r2]
            double r3 = r0.mo4513e()
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r0 = r0[r2]
            double r5 = r0.mo4509a()
            double r5 = r5 * r11
            double r3 = r3 + r5
            float r0 = (float) r3
            r13[r2] = r0
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r0 = r0[r2]
            double r3 = r0.mo4514f()
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r0 = r0[r2]
            double r5 = r0.mo4510b()
            double r11 = r11 * r5
            double r3 = r3 + r11
            float r11 = (float) r3
            r13[r1] = r11
            return
        L_0x0066:
            int r3 = r0.length
            int r3 = r3 + -1
            r0 = r0[r3]
            double r4 = r0.f4374d
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ca
            double r6 = r11 - r4
            boolean r8 = r0.f4388r
            if (r8 == 0) goto L_0x0098
            double r11 = r0.mo4511c(r4)
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r0 = r0[r3]
            double r8 = r0.f4382l
            double r8 = r8 * r6
            double r11 = r11 + r8
            float r11 = (float) r11
            r13[r2] = r11
            double r11 = r0.mo4512d(r4)
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r0 = r0[r3]
            double r2 = r0.f4383m
            double r6 = r6 * r2
            double r11 = r11 + r6
            float r11 = (float) r11
            r13[r1] = r11
            return
        L_0x0098:
            r0.mo4515g(r11)
            androidx.constraintlayout.a.a.a.a[] r11 = r10.f4389a
            r11 = r11[r3]
            double r11 = r11.mo4513e()
            float r11 = (float) r11
            r13[r2] = r11
            androidx.constraintlayout.a.a.a.a[] r11 = r10.f4389a
            r11 = r11[r3]
            double r11 = r11.mo4514f()
            float r11 = (float) r11
            r13[r1] = r11
            return
        L_0x00b2:
            androidx.constraintlayout.a.a.a.a[] r0 = r10.f4389a
            r3 = r0[r2]
            double r3 = r3.f4373c
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00be
        L_0x00bc:
            r11 = r3
            goto L_0x00ca
        L_0x00be:
            int r3 = r0.length
            int r3 = r3 + -1
            r0 = r0[r3]
            double r3 = r0.f4374d
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ca
            goto L_0x00bc
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            androidx.constraintlayout.a.a.a.a[] r3 = r10.f4389a
            int r4 = r3.length
            if (r0 >= r4) goto L_0x010c
            r3 = r3[r0]
            double r4 = r3.f4374d
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0109
            boolean r4 = r3.f4388r
            if (r4 == 0) goto L_0x00ef
            double r3 = r3.mo4511c(r11)
            float r3 = (float) r3
            r13[r2] = r3
            androidx.constraintlayout.a.a.a.a[] r2 = r10.f4389a
            r0 = r2[r0]
            double r11 = r0.mo4512d(r11)
            float r11 = (float) r11
            r13[r1] = r11
            return
        L_0x00ef:
            r3.mo4515g(r11)
            androidx.constraintlayout.a.a.a.a[] r11 = r10.f4389a
            r11 = r11[r0]
            double r11 = r11.mo4513e()
            float r11 = (float) r11
            r13[r2] = r11
            androidx.constraintlayout.a.a.a.a[] r11 = r10.f4389a
            r11 = r11[r0]
            double r11 = r11.mo4514f()
            float r11 = (float) r11
            r13[r1] = r11
            return
        L_0x0109:
            int r0 = r0 + 1
            goto L_0x00cb
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p080a.p081a.C1592b.mo4517b(double, float[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r7 > r2) goto L_0x000b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4518c(double r7, double[] r9) {
        /*
            r6 = this;
            androidx.constraintlayout.a.a.a.a[] r0 = r6.f4389a
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.f4373c
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x000d
        L_0x000b:
            r7 = r2
            goto L_0x0019
        L_0x000d:
            int r2 = r0.length
            int r2 = r2 + -1
            r0 = r0[r2]
            double r2 = r0.f4374d
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            goto L_0x000b
        L_0x0019:
            r0 = 0
        L_0x001a:
            androidx.constraintlayout.a.a.a.a[] r2 = r6.f4389a
            int r3 = r2.length
            if (r0 >= r3) goto L_0x0050
            r2 = r2[r0]
            double r3 = r2.f4374d
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x004d
            boolean r3 = r2.f4388r
            r4 = 1
            if (r3 == 0) goto L_0x0035
            double r7 = r2.f4382l
            r9[r1] = r7
            double r7 = r2.f4383m
            r9[r4] = r7
            return
        L_0x0035:
            r2.mo4515g(r7)
            androidx.constraintlayout.a.a.a.a[] r7 = r6.f4389a
            r7 = r7[r0]
            double r7 = r7.mo4509a()
            r9[r1] = r7
            androidx.constraintlayout.a.a.a.a[] r7 = r6.f4389a
            r7 = r7[r0]
            double r7 = r7.mo4510b()
            r9[r4] = r7
            return
        L_0x004d:
            int r0 = r0 + 1
            goto L_0x001a
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p080a.p081a.C1592b.mo4518c(double, double[]):void");
    }

    /* renamed from: d */
    public final double[] mo4519d() {
        return this.f4390b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r7 > r2) goto L_0x005b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double mo4520e(double r7) {
        /*
            r6 = this;
            boolean r0 = r6.f4391c
            r1 = 0
            if (r0 == 0) goto L_0x0051
            androidx.constraintlayout.a.a.a.a[] r0 = r6.f4389a
            r2 = r0[r1]
            double r3 = r2.f4373c
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0036
            double r7 = r7 - r3
            boolean r0 = r2.f4388r
            if (r0 == 0) goto L_0x0022
            double r2 = r2.mo4511c(r3)
            androidx.constraintlayout.a.a.a.a[] r0 = r6.f4389a
            r0 = r0[r1]
            double r0 = r0.f4382l
        L_0x001e:
            double r7 = r7 * r0
            double r2 = r2 + r7
            return r2
        L_0x0022:
            r2.mo4515g(r3)
            androidx.constraintlayout.a.a.a.a[] r0 = r6.f4389a
            r0 = r0[r1]
            double r2 = r0.mo4513e()
            androidx.constraintlayout.a.a.a.a[] r0 = r6.f4389a
            r0 = r0[r1]
            double r0 = r0.mo4509a()
            goto L_0x001e
        L_0x0036:
            int r2 = r0.length
            int r2 = r2 + -1
            r0 = r0[r2]
            double r3 = r0.f4374d
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0042
            goto L_0x0069
        L_0x0042:
            double r0 = r0.mo4511c(r3)
            double r7 = r7 - r3
            androidx.constraintlayout.a.a.a.a[] r3 = r6.f4389a
            r2 = r3[r2]
            double r2 = r2.f4382l
            double r7 = r7 * r2
            double r0 = r0 + r7
            return r0
        L_0x0051:
            androidx.constraintlayout.a.a.a.a[] r0 = r6.f4389a
            r2 = r0[r1]
            double r2 = r2.f4373c
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x005d
        L_0x005b:
            r7 = r2
            goto L_0x0069
        L_0x005d:
            int r2 = r0.length
            int r2 = r2 + -1
            r0 = r0[r2]
            double r2 = r0.f4374d
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
            goto L_0x005b
        L_0x0069:
            androidx.constraintlayout.a.a.a.a[] r0 = r6.f4389a
            int r2 = r0.length
            if (r1 >= r2) goto L_0x008e
            r0 = r0[r1]
            double r2 = r0.f4374d
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x008b
            boolean r2 = r0.f4388r
            if (r2 == 0) goto L_0x007f
            double r7 = r0.mo4511c(r7)
            return r7
        L_0x007f:
            r0.mo4515g(r7)
            androidx.constraintlayout.a.a.a.a[] r7 = r6.f4389a
            r7 = r7[r1]
            double r7 = r7.mo4513e()
            return r7
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0069
        L_0x008e:
            r7 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p080a.p081a.C1592b.mo4520e(double):double");
    }
}

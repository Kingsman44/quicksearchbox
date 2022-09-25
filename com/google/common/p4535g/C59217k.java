package com.google.common.p4535g;

/* renamed from: com.google.common.g.k */
/* compiled from: PG */
final class C59217k extends Number {

    /* renamed from: b */
    private static final double f157295b;
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final double[] f157296a;

    static {
        double d = 1.0d;
        do {
            d *= 0.5d;
        } while (d + 1.0d != 1.0d);
        f157295b = (double) ((1 << ((((int) Math.round((-Math.log(d)) / Math.log(2.0d))) + 1) / 2)) + 1);
    }

    private C59217k(double... dArr) {
        this.f157296a = dArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4535g.C59217k m91862a(com.google.common.p4535g.C59217k r24, com.google.common.p4535g.C59217k r25, boolean r26) {
        /*
            r0 = r24
            r1 = r25
            r2 = 1
            r3 = r26
            if (r2 == r3) goto L_0x000c
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x000e
        L_0x000c:
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x000e:
            double[] r5 = r0.f157296a
            int r6 = r5.length
            double[] r7 = r1.f157296a
            int r8 = r7.length
            int r9 = r6 + r8
            double[] r10 = new double[r9]
            r11 = 0
            r12 = r5[r11]
            r14 = r7[r11]
            boolean r16 = m91865e(r12, r14)
            if (r16 == 0) goto L_0x0026
            r14 = 1
            r15 = 0
            goto L_0x002a
        L_0x0026:
            double r12 = r3 * r14
            r14 = 0
            r15 = 1
        L_0x002a:
            r16 = 0
            if (r14 >= r6) goto L_0x0089
            if (r15 >= r8) goto L_0x0089
            r18 = r12
            r11 = r5[r14]
            r5 = r7[r15]
            boolean r7 = m91865e(r11, r5)
            if (r7 == 0) goto L_0x003f
            int r14 = r14 + 1
            goto L_0x0043
        L_0x003f:
            int r15 = r15 + 1
            double r11 = r3 * r5
        L_0x0043:
            double r5 = r11 + r18
            double r7 = r5 - r11
            double r12 = r18 - r7
            int r7 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x0052
            r7 = 0
            r10[r7] = r12
            r12 = r5
            goto L_0x0055
        L_0x0052:
            r7 = 0
            r12 = r5
            r2 = 0
        L_0x0055:
            double[] r5 = r0.f157296a
            int r6 = r5.length
            if (r14 >= r6) goto L_0x008c
            double[] r6 = r1.f157296a
            int r8 = r6.length
            if (r15 >= r8) goto L_0x008c
            r7 = r5[r14]
            r5 = r6[r15]
            boolean r11 = m91865e(r7, r5)
            if (r11 == 0) goto L_0x006c
            int r14 = r14 + 1
            goto L_0x0070
        L_0x006c:
            int r15 = r15 + 1
            double r7 = r3 * r5
        L_0x0070:
            double r5 = r12 + r7
            double r18 = r5 - r12
            double r20 = r5 - r18
            double r12 = r12 - r20
            double r7 = r7 - r18
            double r12 = r12 + r7
            int r7 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x0086
            int r7 = r2 + 1
            r10[r2] = r12
            r12 = r5
            r2 = r7
            goto L_0x0087
        L_0x0086:
            r12 = r5
        L_0x0087:
            r7 = 0
            goto L_0x0055
        L_0x0089:
            r18 = r12
            r2 = 0
        L_0x008c:
            double[] r5 = r0.f157296a
            int r6 = r5.length
            if (r14 >= r6) goto L_0x00ad
            int r6 = r14 + 1
            r7 = r5[r14]
            double r18 = r12 + r7
            double r20 = r18 - r12
            double r22 = r18 - r20
            double r12 = r12 - r22
            double r7 = r7 - r20
            double r12 = r12 + r7
            int r5 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x00a9
            int r5 = r2 + 1
            r10[r2] = r12
            r2 = r5
        L_0x00a9:
            r14 = r6
            r12 = r18
            goto L_0x008c
        L_0x00ad:
            double[] r0 = r1.f157296a
            int r5 = r0.length
            if (r15 >= r5) goto L_0x00cf
            int r5 = r15 + 1
            r6 = r0[r15]
            double r6 = r6 * r3
            double r14 = r12 + r6
            double r18 = r14 - r12
            double r20 = r14 - r18
            double r12 = r12 - r20
            double r6 = r6 - r18
            double r12 = r12 + r6
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00cc
            int r0 = r2 + 1
            r10[r2] = r12
            r2 = r0
        L_0x00cc:
            r12 = r14
            r15 = r5
            goto L_0x00ad
        L_0x00cf:
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00d7
            if (r2 != 0) goto L_0x00dc
            r11 = 0
            goto L_0x00d8
        L_0x00d7:
            r11 = r2
        L_0x00d8:
            int r2 = r11 + 1
            r10[r11] = r12
        L_0x00dc:
            if (r9 <= r2) goto L_0x00e2
            double[] r10 = m91866f(r10, r2)
        L_0x00e2:
            com.google.common.g.k r0 = new com.google.common.g.k
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59217k.m91862a(com.google.common.g.k, com.google.common.g.k, boolean):com.google.common.g.k");
    }

    /* renamed from: c */
    public static C59217k m91863c(double d, double d2) {
        double d3 = d * d2;
        double d4 = f157295b * d2;
        double d5 = d4 - (d4 - d2);
        return new C59217k(m91864d(d, d5, d2 - d5, d3), d3);
    }

    /* renamed from: d */
    private static double m91864d(double d, double d2, double d3, double d4) {
        double d5 = f157295b * d;
        double d6 = d5 - (d5 - d);
        double d7 = d - d6;
        return (d7 * d3) - (((d4 - (d6 * d2)) - (d7 * d2)) - (d6 * d3));
    }

    /* renamed from: e */
    private static boolean m91865e(double d, double d2) {
        return ((d2 > d ? 1 : (d2 == d ? 0 : -1)) > 0) == ((d2 > (-d) ? 1 : (d2 == (-d) ? 0 : -1)) > 0);
    }

    /* renamed from: f */
    private static double[] m91866f(double[] dArr, int i) {
        double[] dArr2 = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr2[i2] = dArr[i2];
        }
        return dArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        if (r17 == 0) goto L_0x0071;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4535g.C59217k mo56605b(double r26) {
        /*
            r25 = this;
            r0 = r25
            double[] r1 = r0.f157296a
            int r2 = r1.length
            int r2 = r2 + r2
            double[] r3 = new double[r2]
            double r4 = f157295b
            double r4 = r4 * r26
            double r6 = r4 - r26
            double r4 = r4 - r6
            double r6 = r26 - r4
            r16 = 0
            r8 = r1[r16]
            double r17 = r8 * r26
            r10 = r4
            r12 = r6
            r14 = r17
            double r8 = m91864d(r8, r10, r12, r14)
            r1 = 1
            r19 = 0
            int r10 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r10 == 0) goto L_0x002a
            r3[r16] = r8
            r8 = 1
            goto L_0x002b
        L_0x002a:
            r8 = 0
        L_0x002b:
            r21 = r17
            r17 = r8
        L_0x002f:
            double[] r8 = r0.f157296a
            int r9 = r8.length
            if (r1 >= r9) goto L_0x0068
            r9 = r8[r1]
            double r23 = r9 * r26
            r8 = r9
            r10 = r4
            r12 = r6
            r14 = r23
            double r8 = m91864d(r8, r10, r12, r14)
            double r10 = r21 + r8
            double r12 = r10 - r21
            double r14 = r10 - r12
            double r21 = r21 - r14
            double r8 = r8 - r12
            double r21 = r21 + r8
            int r8 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x0056
            int r8 = r17 + 1
            r3[r17] = r21
            r17 = r8
        L_0x0056:
            double r21 = r23 + r10
            double r8 = r21 - r23
            double r10 = r10 - r8
            int r8 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x0065
            int r8 = r17 + 1
            r3[r17] = r10
            r17 = r8
        L_0x0065:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x0068:
            int r1 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x006f
            if (r17 != 0) goto L_0x0075
            goto L_0x0071
        L_0x006f:
            r16 = r17
        L_0x0071:
            int r17 = r16 + 1
            r3[r16] = r21
        L_0x0075:
            r1 = r17
            if (r2 <= r1) goto L_0x007d
            double[] r3 = m91866f(r3, r1)
        L_0x007d:
            com.google.common.g.k r1 = new com.google.common.g.k
            r1.<init>(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59217k.mo56605b(double):com.google.common.g.k");
    }

    public final double doubleValue() {
        double d = 0.0d;
        for (double d2 : this.f157296a) {
            d += d2;
        }
        return d;
    }

    public final float floatValue() {
        return (float) doubleValue();
    }

    public final int intValue() {
        return (int) Math.round(doubleValue());
    }

    public final long longValue() {
        return Math.round(doubleValue());
    }

    public final String toString() {
        return Double.toString(doubleValue());
    }
}

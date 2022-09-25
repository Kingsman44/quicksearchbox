package com.google.common.p4543n.p4550f;

import com.google.common.p4535g.C59203do;
import java.util.Arrays;
import java.util.Map;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.common.n.f.g */
/* compiled from: PG */
public final class C59434g {

    /* renamed from: b */
    private static final Map f157665b = DesugarCollections.synchronizedMap(new C59431d());

    /* renamed from: a */
    public final double[] f157666a;

    /* renamed from: c */
    private long f157667c;

    /* renamed from: d */
    private int f157668d;

    /* renamed from: e */
    private short[] f157669e;

    /* renamed from: f */
    private long f157670f;

    /* renamed from: g */
    private int f157671g;

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0178, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139 A[LOOP:5: B:59:0x0133->B:61:0x0139, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C59434g(com.google.common.p4543n.p4550f.C59435h r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r23.<init>()
            double r2 = r1.f157673b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x028a
            int r6 = r1.f157679h
            double r7 = r1.f157674c
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0276
            double r9 = r1.f157676e
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 < 0) goto L_0x025d
            int r1 = r1.f157677f
            r11 = -1
            if (r1 != r11) goto L_0x0255
            r12 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r1 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x024d
            int r1 = r6 + -1
            if (r6 == 0) goto L_0x024b
            if (r1 != 0) goto L_0x0243
            double r1 = m92342f(r2)
            double r6 = m92342f(r7)
            r14 = r6
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0039:
            r20 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            int r3 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x0046
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r18 = r18 * r14
            double r14 = r6 * r18
            goto L_0x0039
        L_0x0046:
            double r6 = r18 * r4
            double r6 = java.lang.Math.floor(r6)
            double r9 = r9 * r18
            double r8 = java.lang.Math.floor(r9)
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0058
            r3 = -1
            goto L_0x005a
        L_0x0058:
            r3 = 10
        L_0x005a:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r3)
            r20 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            int r3 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x006a
            double r6 = java.lang.Math.nextUp(r6)
            goto L_0x0077
        L_0x006a:
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0077
            java.lang.Double r1 = java.lang.Double.valueOf(r12)
            r10.add(r1)
            goto L_0x0127
        L_0x0077:
            com.google.common.n.f.f r3 = new com.google.common.n.f.f
            r3.<init>()
            r3.mo56944a(r14)
            double r14 = r3.f157663a
            double r14 = r6 / r14
            double r14 = java.lang.Math.floor(r14)
            double r4 = r3.f157663a
            double r14 = r14 * r4
            double r14 = r6 - r14
            double r4 = r4 - r14
            double r4 = r4 + r6
            int r22 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r22 == 0) goto L_0x0094
            double r6 = r6 - r14
        L_0x0094:
            double r4 = r6 * r1
            double r14 = r3.f157663a
            int r22 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r22 >= 0) goto L_0x00d3
            double r4 = r6 / r18
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r10.add(r4)
            int r4 = r10.size()
            if (r4 != r11) goto L_0x00ad
            goto L_0x0127
        L_0x00ad:
            double r4 = r3.f157663a
            double r6 = r6 + r4
        L_0x00b0:
            double r4 = r6 / r18
            int r14 = r10.size()
            int r14 = r14 + r11
            java.lang.Object r14 = r10.get(r14)
            java.lang.Double r14 = (java.lang.Double) r14
            double r14 = r14.doubleValue()
            int r22 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r22 != 0) goto L_0x00ca
            double r6 = java.lang.Math.nextUp(r6)
            goto L_0x00b0
        L_0x00ca:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0127
            int r4 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0127
            goto L_0x0094
        L_0x00d3:
            double r4 = r6 / r18
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r10.add(r4)
            int r4 = r10.size()
            if (r4 == r11) goto L_0x0127
            double r4 = r6 * r1
            double r14 = r3.f157663a
            r3.mo56944a(r4)
            double r4 = r4 + r6
            double r12 = r3.f157663a
            double r4 = m92340d(r4, r12)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 >= 0) goto L_0x00ff
            double r6 = r6 + r14
            int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x00ff
            double r4 = m92340d(r6, r14)
        L_0x00ff:
            r6 = r4
        L_0x0100:
            double r4 = r6 / r18
            int r14 = r10.size()
            int r14 = r14 + r11
            java.lang.Object r14 = r10.get(r14)
            java.lang.Double r14 = (java.lang.Double) r14
            double r14 = r14.doubleValue()
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x011a
            double r6 = java.lang.Math.nextUp(r6)
            goto L_0x0100
        L_0x011a:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0127
            r4 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x0127
            r12 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x00d3
        L_0x0127:
            int r1 = r10.size()
            r2 = 1
            int r1 = r1 + r2
            double[] r1 = new double[r1]
            r0.f157666a = r1
            r1 = 0
            r3 = 0
        L_0x0133:
            int r4 = r10.size()
            if (r3 >= r4) goto L_0x014a
            double[] r4 = r0.f157666a
            java.lang.Object r5 = r10.get(r3)
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r4[r3] = r5
            int r3 = r3 + 1
            goto L_0x0133
        L_0x014a:
            double[] r3 = r0.f157666a
            int r4 = r10.size()
            r5 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r3[r4] = r5
            r3 = 0
            r0.f157667c = r3
            r5 = 63
            r0.f157668d = r5
            r0.f157670f = r3
            r0.f157671g = r1
            double[] r3 = r0.f157666a
            r4 = r3[r1]
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0242
            r1 = 1
        L_0x016b:
            double r3 = (double) r1
            double[] r5 = r0.f157666a
            int r6 = r5.length
            int r6 = r6 + r11
            if (r1 != r6) goto L_0x017b
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r0.f157667c = r3
        L_0x0178:
            int r1 = r1 + -1
            goto L_0x0193
        L_0x017b:
            r6 = r5[r1]
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x023e
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x018c
            long r3 = java.lang.Double.doubleToRawLongBits(r6)
            r0.f157667c = r3
            goto L_0x0193
        L_0x018c:
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r0.f157667c = r3
            goto L_0x0178
        L_0x0193:
            double[] r3 = r0.f157666a
            int r3 = r3.length
            int r3 = r3 + -2
            r4 = 32768(0x8000, float:4.5918E-41)
            int r3 = java.lang.Math.min(r3, r4)
            r0.f157671g = r3
            int r4 = r1 + 1
            if (r4 >= r3) goto L_0x01f2
            double[] r3 = r0.f157666a
            int r5 = r3.length
            int r5 = r5 + r11
            int r5 = r5 * 4
            int r5 = r5 + 1024
            long r5 = (long) r5
            r7 = r3[r4]
            long r7 = java.lang.Double.doubleToRawLongBits(r7)
            r3 = r4
        L_0x01b5:
            int r4 = r0.f157671g
            if (r3 >= r4) goto L_0x01f1
            int r4 = r3 + 1
            double[] r9 = r0.f157666a
            r12 = r9[r4]
            long r9 = java.lang.Double.doubleToRawLongBits(r12)
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x01ca
            r0.f157671g = r3
            goto L_0x01f2
        L_0x01ca:
            int r12 = r0.f157668d
        L_0x01cc:
            long r13 = r0.m92341e(r9)
            long r15 = r0.m92341e(r7)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x01de
            int r13 = r0.f157668d
            int r13 = r13 + r11
            r0.f157668d = r13
            goto L_0x01cc
        L_0x01de:
            long r7 = r0.m92341e(r9)
            r13 = 1
            long r7 = r7 + r13
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x01ee
            r0.f157668d = r12
            r0.f157671g = r3
            goto L_0x01f2
        L_0x01ee:
            r3 = r4
            r7 = r9
            goto L_0x01b5
        L_0x01f1:
            r3 = r4
        L_0x01f2:
            double[] r4 = r0.f157666a
            r3 = r4[r3]
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r0.f157670f = r3
            long r5 = r0.f157667c
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0242
            long r3 = r0.m92341e(r3)
            int r4 = (int) r3
            int r4 = r4 + r2
            short[] r2 = new short[r4]
            r0.f157669e = r2
        L_0x020c:
            int r2 = r0.f157671g
            if (r1 >= r2) goto L_0x0231
            int r2 = r1 + 1
            double[] r3 = r0.f157666a
            r7 = r3[r2]
            long r3 = java.lang.Double.doubleToRawLongBits(r7)
            long r7 = r0.m92341e(r3)
            int r8 = (int) r7
            long r5 = r0.m92341e(r5)
            int r6 = (int) r5
        L_0x0224:
            if (r6 >= r8) goto L_0x022e
            short[] r5 = r0.f157669e
            short r7 = (short) r1
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0224
        L_0x022e:
            r1 = r2
            r5 = r3
            goto L_0x020c
        L_0x0231:
            short[] r1 = r0.f157669e
            long r3 = r0.f157670f
            long r3 = r0.m92341e(r3)
            int r4 = (int) r3
            short r2 = (short) r2
            r1[r4] = r2
            return
        L_0x023e:
            int r1 = r1 + 1
            goto L_0x016b
        L_0x0242:
            return
        L_0x0243:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Unknown bucket style: DECIMAL"
            r1.<init>(r2)
            throw r1
        L_0x024b:
            r1 = 0
            throw r1
        L_0x024d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Either maxBucketStart or maxBuckets must impose a finite limit"
            r1.<init>(r2)
            throw r1
        L_0x0255:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Expected maxBuckets > 0 or == -1, found 0"
            r1.<init>(r2)
            throw r1
        L_0x025d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected maxBucketStart >= minValue, found "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r3 = " vs. 0.0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0276:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected initialDelta >= 0.0, found "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x028a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Expected resolution >= 0, found "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            goto L_0x029f
        L_0x029e:
            throw r1
        L_0x029f:
            goto L_0x029e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4543n.p4550f.C59434g.<init>(com.google.common.n.f.h):void");
    }

    /* renamed from: c */
    public static C59434g m92339c(C59435h hVar) {
        C59432e eVar = new C59432e(hVar);
        Map map = f157665b;
        C59434g gVar = (C59434g) map.get(eVar);
        if (gVar != null) {
            return gVar;
        }
        C59434g gVar2 = new C59434g(hVar);
        map.put(eVar, gVar2);
        return gVar2;
    }

    /* renamed from: d */
    private static double m92340d(double d, double d2) {
        double d3 = d + (0.5d * d2);
        return d3 == Double.POSITIVE_INFINITY ? d3 : Math.floor(d3 / d2) * d2;
    }

    /* renamed from: e */
    private final long m92341e(long j) {
        return (j - this.f157667c) >> this.f157668d;
    }

    /* renamed from: f */
    private static double m92342f(double d) {
        int exponent = Math.getExponent(d) + 1;
        return Math.scalb(Math.floor(Math.scalb(d, 8 - exponent) + 0.5d), exponent - 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo56945a(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        short s = 0;
        if (doubleToRawLongBits >= 0) {
            if (doubleToRawLongBits < this.f157667c) {
                return (int) d;
            }
            if (doubleToRawLongBits < this.f157670f) {
                short s2 = this.f157669e[(int) m92341e(doubleToRawLongBits)];
                if (d < this.f157666a[s2]) {
                    s = 1;
                }
                return s2 - s;
            }
        }
        if (doubleToRawLongBits == Long.MIN_VALUE) {
            return mo56945a(C59203do.f157270a);
        }
        int i = this.f157671g;
        int length = (this.f157666a.length - i) - 1;
        while (length > 0) {
            int i2 = length >> 1;
            if (d >= this.f157666a[i + i2]) {
                int i3 = i2 + 1;
                i += i3;
                length -= i3;
            } else {
                length = i2;
            }
        }
        if (i != this.f157671g) {
            return i - 1;
        }
        throw new IllegalArgumentException("Value " + d + " is out of histogram domain, should be >= " + this.f157666a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo56946b() {
        return this.f157666a.length - 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59434g)) {
            return false;
        }
        C59434g gVar = (C59434g) obj;
        return this == gVar || Arrays.equals(this.f157666a, gVar.f157666a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f157666a);
    }

    private C59434g() {
        throw null;
    }
}

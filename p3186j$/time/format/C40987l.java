package p3186j$.time.format;

import p3186j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.l */
class C40987l implements C40982g {

    /* renamed from: f */
    static final long[] f107346f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    final TemporalField f107347a;

    /* renamed from: b */
    final int f107348b;

    /* renamed from: c */
    final int f107349c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C40973F f107350d;

    /* renamed from: e */
    final int f107351e;

    C40987l(TemporalField temporalField, int i, int i2, C40973F f) {
        this.f107347a = temporalField;
        this.f107348b = i;
        this.f107349c = i2;
        this.f107350d = f;
        this.f107351e = 0;
    }

    protected C40987l(TemporalField temporalField, int i, int i2, C40973F f, int i3) {
        this.f107347a = temporalField;
        this.f107348b = i;
        this.f107349c = i2;
        this.f107350d = f;
        this.f107351e = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f A[LOOP:0: B:30:0x0097->B:32:0x009f, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43294b(p3186j$.time.format.C41001z r14, java.lang.StringBuilder r15) {
        /*
            r13 = this;
            j$.time.temporal.TemporalField r0 = r13.f107347a
            java.lang.Long r1 = r14.mo43343e(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            long r3 = r1.longValue()
            long r3 = r13.mo43306c(r14, r3)
            j$.time.format.C r14 = r14.mo43340b()
            r5 = -9223372036854775808
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x001f
            java.lang.String r1 = "9223372036854775808"
            goto L_0x0027
        L_0x001f:
            long r5 = java.lang.Math.abs(r3)
            java.lang.String r1 = java.lang.Long.toString(r5)
        L_0x0027:
            int r5 = r1.length()
            java.lang.String r6 = " cannot be printed as the value "
            java.lang.String r7 = "Field "
            int r8 = r13.f107349c
            if (r5 > r8) goto L_0x00ab
            r14.getClass()
            r14 = 1
            r8 = 0
            int r5 = r13.f107348b
            r10 = 2
            j$.time.format.F r11 = r13.f107350d
            int r12 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r12 < 0) goto L_0x005e
            int[] r0 = p3186j$.time.format.C40979d.f107336a
            int r6 = r11.ordinal()
            r0 = r0[r6]
            if (r0 == r14) goto L_0x004f
            if (r0 == r10) goto L_0x005b
            goto L_0x0097
        L_0x004f:
            r0 = 19
            if (r5 >= r0) goto L_0x0097
            long[] r0 = f107346f
            r6 = r0[r5]
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
        L_0x005b:
            r0 = 43
            goto L_0x0094
        L_0x005e:
            int[] r8 = p3186j$.time.format.C40979d.f107336a
            int r9 = r11.ordinal()
            r8 = r8[r9]
            if (r8 == r14) goto L_0x0092
            if (r8 == r10) goto L_0x0092
            r9 = 3
            if (r8 == r9) goto L_0x0092
            r9 = 4
            if (r8 == r9) goto L_0x0071
            goto L_0x0097
        L_0x0071:
            j$.time.DateTimeException r14 = new j$.time.DateTimeException
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r0.append(r15)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r15 = " cannot be negative according to the SignStyle"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r14.<init>(r15)
            throw r14
        L_0x0092:
            r0 = 45
        L_0x0094:
            r15.append(r0)
        L_0x0097:
            int r0 = r1.length()
            int r0 = r5 - r0
            if (r2 >= r0) goto L_0x00a7
            r0 = 48
            r15.append(r0)
            int r2 = r2 + 1
            goto L_0x0097
        L_0x00a7:
            r15.append(r1)
            return r14
        L_0x00ab:
            j$.time.DateTimeException r14 = new j$.time.DateTimeException
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r0.append(r15)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r15 = " exceeds the maximum print width of "
            r0.append(r15)
            r0.append(r8)
            java.lang.String r15 = r0.toString()
            r14.<init>(r15)
            goto L_0x00d0
        L_0x00cf:
            throw r14
        L_0x00d0:
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.format.C40987l.mo43294b(j$.time.format.z, java.lang.StringBuilder):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo43306c(C41001z zVar, long j) {
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x018d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo43295d(p3186j$.time.format.C40999x r21, java.lang.CharSequence r22, int r23) {
        /*
            r20 = this;
            r6 = r20
            r0 = r23
            int r1 = r22.length()
            if (r0 != r1) goto L_0x000d
            r0 = r0 ^ -1
            return r0
        L_0x000d:
            char r2 = r22.charAt(r23)
            j$.time.format.C r3 = r21.mo43323g()
            r3.getClass()
            r3 = 4
            r4 = 0
            r5 = 1
            r7 = 43
            int r8 = r6.f107349c
            j$.time.format.F r9 = r6.f107350d
            int r10 = r6.f107348b
            if (r2 != r7) goto L_0x004d
            boolean r2 = r21.mo43328l()
            if (r10 != r8) goto L_0x002d
            r7 = 1
            goto L_0x002e
        L_0x002d:
            r7 = 0
        L_0x002e:
            int r11 = r9.ordinal()
            if (r11 == 0) goto L_0x0040
            if (r11 == r5) goto L_0x003c
            if (r11 == r3) goto L_0x003c
            if (r2 != 0) goto L_0x003e
            if (r7 != 0) goto L_0x003e
        L_0x003c:
            r2 = 1
            goto L_0x0043
        L_0x003e:
            r2 = 0
            goto L_0x0043
        L_0x0040:
            if (r2 != 0) goto L_0x003e
            goto L_0x003c
        L_0x0043:
            if (r2 != 0) goto L_0x0048
            r0 = r0 ^ -1
            return r0
        L_0x0048:
            int r0 = r0 + r5
            r7 = r0
            r0 = 1
            r2 = 0
            goto L_0x008b
        L_0x004d:
            j$.time.format.C r7 = r21.mo43323g()
            r7.getClass()
            r7 = 45
            if (r2 != r7) goto L_0x007b
            boolean r2 = r21.mo43328l()
            if (r10 != r8) goto L_0x0060
            r7 = 1
            goto L_0x0061
        L_0x0060:
            r7 = 0
        L_0x0061:
            int r11 = r9.ordinal()
            if (r11 == 0) goto L_0x006f
            if (r11 == r5) goto L_0x006f
            if (r11 == r3) goto L_0x006f
            if (r2 != 0) goto L_0x0071
            if (r7 != 0) goto L_0x0071
        L_0x006f:
            r2 = 1
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            if (r2 != 0) goto L_0x0077
            r0 = r0 ^ -1
            return r0
        L_0x0077:
            int r0 = r0 + 1
            r2 = 1
            goto L_0x0089
        L_0x007b:
            j$.time.format.F r2 = p3186j$.time.format.C40973F.ALWAYS
            if (r9 != r2) goto L_0x0088
            boolean r2 = r21.mo43328l()
            if (r2 == 0) goto L_0x0088
            r0 = r0 ^ -1
            return r0
        L_0x0088:
            r2 = 0
        L_0x0089:
            r7 = r0
            r0 = 0
        L_0x008b:
            boolean r3 = r21.mo43328l()
            if (r3 != 0) goto L_0x009a
            boolean r3 = r20.mo43299e(r21)
            if (r3 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r3 = 1
            goto L_0x009b
        L_0x009a:
            r3 = r10
        L_0x009b:
            int r11 = r7 + r3
            if (r11 <= r1) goto L_0x00a2
            r0 = r7 ^ -1
            return r0
        L_0x00a2:
            boolean r12 = r21.mo43328l()
            if (r12 != 0) goto L_0x00b1
            boolean r12 = r20.mo43299e(r21)
            if (r12 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r8 = 9
        L_0x00b1:
            int r12 = r6.f107351e
            int r13 = java.lang.Math.max(r12, r4)
            int r13 = r13 + r8
        L_0x00b8:
            r8 = 2
            r16 = 0
            if (r4 >= r8) goto L_0x011d
            int r13 = r13 + r7
            int r8 = java.lang.Math.min(r13, r1)
            r13 = r7
            r17 = 0
        L_0x00c5:
            if (r13 >= r8) goto L_0x0109
            int r19 = r13 + 1
            r14 = r22
            char r13 = r14.charAt(r13)
            j$.time.format.C r15 = r21.mo43323g()
            int r13 = r15.mo43252a(r13)
            if (r13 >= 0) goto L_0x00e0
            int r13 = r19 + -1
            if (r13 >= r11) goto L_0x0109
            r0 = r7 ^ -1
            return r0
        L_0x00e0:
            int r15 = r19 - r7
            r5 = 18
            if (r15 <= r5) goto L_0x00fe
            if (r16 != 0) goto L_0x00ec
            java.math.BigInteger r16 = java.math.BigInteger.valueOf(r17)
        L_0x00ec:
            r5 = r16
            java.math.BigInteger r15 = java.math.BigInteger.TEN
            java.math.BigInteger r5 = r5.multiply(r15)
            long r13 = (long) r13
            java.math.BigInteger r13 = java.math.BigInteger.valueOf(r13)
            java.math.BigInteger r16 = r5.add(r13)
            goto L_0x0105
        L_0x00fe:
            r14 = 10
            long r17 = r17 * r14
            long r13 = (long) r13
            long r17 = r17 + r13
        L_0x0105:
            r13 = r19
            r5 = 1
            goto L_0x00c5
        L_0x0109:
            if (r12 <= 0) goto L_0x0117
            if (r4 != 0) goto L_0x0117
            int r13 = r13 - r7
            int r13 = r13 - r12
            int r13 = java.lang.Math.max(r3, r13)
            int r4 = r4 + 1
            r5 = 1
            goto L_0x00b8
        L_0x0117:
            r5 = r13
            r1 = r16
            r3 = r17
            goto L_0x0122
        L_0x011d:
            r5 = r7
            r1 = r16
            r3 = 0
        L_0x0122:
            if (r2 == 0) goto L_0x0152
            if (r1 == 0) goto L_0x013f
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0139
            boolean r0 = r21.mo43328l()
            if (r0 == 0) goto L_0x0139
            r0 = 1
            int r7 = r7 - r0
            r0 = r7 ^ -1
            return r0
        L_0x0139:
            java.math.BigInteger r0 = r1.negate()
            r1 = r0
            goto L_0x016c
        L_0x013f:
            r0 = 1
            r8 = 0
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0150
            boolean r2 = r21.mo43328l()
            if (r2 == 0) goto L_0x0150
            int r7 = r7 - r0
            r0 = r7 ^ -1
            return r0
        L_0x0150:
            long r2 = -r3
            goto L_0x016d
        L_0x0152:
            j$.time.format.F r2 = p3186j$.time.format.C40973F.EXCEEDS_PAD
            if (r9 != r2) goto L_0x016c
            boolean r2 = r21.mo43328l()
            if (r2 == 0) goto L_0x016c
            int r2 = r5 - r7
            if (r0 == 0) goto L_0x0167
            if (r2 > r10) goto L_0x016c
            r0 = 1
            int r7 = r7 - r0
            r0 = r7 ^ -1
            return r0
        L_0x0167:
            if (r2 <= r10) goto L_0x016c
            r0 = r7 ^ -1
            return r0
        L_0x016c:
            r2 = r3
        L_0x016d:
            if (r1 == 0) goto L_0x018d
            int r0 = r1.bitLength()
            r2 = 63
            if (r0 <= r2) goto L_0x017f
            java.math.BigInteger r0 = java.math.BigInteger.TEN
            java.math.BigInteger r1 = r1.divide(r0)
            int r5 = r5 + -1
        L_0x017f:
            long r2 = r1.longValue()
            r0 = r20
            r1 = r21
            r4 = r7
            int r0 = r0.mo43307f(r1, r2, r4, r5)
            return r0
        L_0x018d:
            r0 = r20
            r1 = r21
            r4 = r7
            int r0 = r0.mo43307f(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.format.C40987l.mo43295d(j$.time.format.x, java.lang.CharSequence, int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo43299e(C40999x xVar) {
        int i = this.f107351e;
        return i == -1 || (i > 0 && this.f107348b == this.f107349c && this.f107350d == C40973F.NOT_NEGATIVE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo43307f(C40999x xVar, long j, int i, int i2) {
        return xVar.mo43331o(this.f107347a, j, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C40987l mo43300g() {
        return this.f107351e == -1 ? this : new C40987l(this.f107347a, this.f107348b, this.f107349c, this.f107350d, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C40987l mo43301h(int i) {
        return new C40987l(this.f107347a, this.f107348b, this.f107349c, this.f107350d, this.f107351e + i);
    }

    public String toString() {
        C40973F f = this.f107350d;
        TemporalField temporalField = this.f107347a;
        int i = this.f107349c;
        int i2 = this.f107348b;
        if (i2 == 1 && i == 19 && f == C40973F.NORMAL) {
            String valueOf = String.valueOf(temporalField);
            return "Value(" + valueOf + ")";
        } else if (i2 == i && f == C40973F.NOT_NEGATIVE) {
            String valueOf2 = String.valueOf(temporalField);
            return "Value(" + valueOf2 + "," + i2 + ")";
        } else {
            String valueOf3 = String.valueOf(temporalField);
            String valueOf4 = String.valueOf(f);
            return "Value(" + valueOf3 + "," + i2 + "," + i + "," + valueOf4 + ")";
        }
    }
}

package com.p232a.p233a;

/* renamed from: com.a.a.j */
/* compiled from: PG */
public final class C4763j {

    /* renamed from: b */
    private static final float[] f15083b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* renamed from: c */
    private static final float[] f15084c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* renamed from: a */
    int f15085a;

    /* JADX WARNING: Removed duplicated region for block: B:102:0x008a A[EDGE_INSN: B:102:0x008a->B:37:0x008a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo9677a(java.lang.String r23, int r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r0.f15085a = r2
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r2 < r3) goto L_0x000f
            return r4
        L_0x000f:
            char r2 = r23.charAt(r24)
            r5 = 45
            r6 = 43
            r8 = 1
            if (r2 == r6) goto L_0x0020
            if (r2 == r5) goto L_0x001e
            r2 = 0
            goto L_0x0026
        L_0x001e:
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            int r9 = r0.f15085a
            int r9 = r9 + r8
            r0.f15085a = r9
        L_0x0026:
            int r9 = r0.f15085a
            r10 = 0
            r14 = r10
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0033:
            int r7 = r0.f15085a
            r5 = 57
            r6 = 48
            if (r7 >= r3) goto L_0x008a
            char r7 = r1.charAt(r7)
            if (r7 != r6) goto L_0x0049
            if (r12 != 0) goto L_0x0046
            int r18 = r18 + 1
            goto L_0x0080
        L_0x0046:
            int r13 = r13 + 1
            goto L_0x0080
        L_0x0049:
            r6 = 49
            if (r7 < r6) goto L_0x0073
            if (r7 > r5) goto L_0x0073
            int r12 = r12 + r13
        L_0x0050:
            r5 = 10
            r19 = 922337203685477580(0xccccccccccccccc, double:5.1488004017107686E-247)
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r13 <= 0) goto L_0x0063
            if (r21 <= 0) goto L_0x005e
            return r4
        L_0x005e:
            long r14 = r14 * r5
            int r13 = r13 + -1
            goto L_0x0050
        L_0x0063:
            if (r21 <= 0) goto L_0x0066
            return r4
        L_0x0066:
            long r14 = r14 * r5
            int r7 = r7 + -48
            long r5 = (long) r7
            long r14 = r14 + r5
            int r12 = r12 + r8
            int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            return r4
        L_0x0073:
            r6 = 46
            if (r7 != r6) goto L_0x008a
            if (r16 == 0) goto L_0x007a
            goto L_0x008a
        L_0x007a:
            int r5 = r0.f15085a
            int r17 = r5 - r9
            r16 = 1
        L_0x0080:
            int r5 = r0.f15085a
            int r5 = r5 + r8
            r0.f15085a = r5
            r5 = 45
            r6 = 43
            goto L_0x0033
        L_0x008a:
            if (r16 == 0) goto L_0x0094
            int r6 = r0.f15085a
            int r7 = r17 + 1
            if (r6 == r7) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            return r4
        L_0x0094:
            if (r12 != 0) goto L_0x009b
            if (r18 == 0) goto L_0x009a
            r12 = 1
            goto L_0x009b
        L_0x009a:
            return r4
        L_0x009b:
            if (r16 == 0) goto L_0x00a1
            int r17 = r17 - r18
            int r13 = r17 - r12
        L_0x00a1:
            int r6 = r0.f15085a
            if (r6 >= r3) goto L_0x0105
            char r6 = r1.charAt(r6)
            r7 = 69
            if (r6 == r7) goto L_0x00b1
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L_0x0105
        L_0x00b1:
            int r6 = r0.f15085a
            int r6 = r6 + r8
            r0.f15085a = r6
            if (r6 != r3) goto L_0x00b9
            return r4
        L_0x00b9:
            char r6 = r1.charAt(r6)
            r7 = 43
            if (r6 == r7) goto L_0x00d6
            r7 = 45
            if (r6 == r7) goto L_0x00d4
            switch(r6) {
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00d1;
                case 52: goto L_0x00d1;
                case 53: goto L_0x00d1;
                case 54: goto L_0x00d1;
                case 55: goto L_0x00d1;
                case 56: goto L_0x00d1;
                case 57: goto L_0x00d1;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            int r6 = r0.f15085a
            int r6 = r6 + -1
            r0.f15085a = r6
            r6 = 0
            r7 = 1
            goto L_0x00dd
        L_0x00d1:
            r6 = 0
        L_0x00d2:
            r7 = 0
            goto L_0x00dd
        L_0x00d4:
            r6 = 1
            goto L_0x00d7
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            int r7 = r0.f15085a
            int r7 = r7 + r8
            r0.f15085a = r7
            goto L_0x00d2
        L_0x00dd:
            if (r7 != 0) goto L_0x0105
            int r7 = r0.f15085a
            r9 = 0
        L_0x00e2:
            int r10 = r0.f15085a
            if (r10 >= r3) goto L_0x00fb
            char r10 = r1.charAt(r10)
            r11 = 48
            if (r10 < r11) goto L_0x00fb
            if (r10 > r5) goto L_0x00fb
            int r9 = r9 * 10
            int r10 = r10 + -48
            int r9 = r9 + r10
            int r10 = r0.f15085a
            int r10 = r10 + r8
            r0.f15085a = r10
            goto L_0x00e2
        L_0x00fb:
            int r1 = r0.f15085a
            if (r1 != r7) goto L_0x0100
            return r4
        L_0x0100:
            if (r6 == 0) goto L_0x0104
            int r13 = r13 - r9
            goto L_0x0105
        L_0x0104:
            int r13 = r13 + r9
        L_0x0105:
            int r12 = r12 + r13
            r1 = 39
            if (r12 > r1) goto L_0x013d
            r1 = -44
            if (r12 >= r1) goto L_0x010f
            goto L_0x013d
        L_0x010f:
            float r1 = (float) r14
            r3 = 0
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0139
            if (r13 <= 0) goto L_0x011f
            float[] r3 = f15083b
            r3 = r3[r13]
        L_0x011c:
            float r1 = r1 * r3
            goto L_0x0139
        L_0x011f:
            if (r13 >= 0) goto L_0x0139
            r3 = -38
            if (r13 >= r3) goto L_0x0133
            double r3 = (double) r1
            r5 = 4307583784117748259(0x3bc79ca10c924223, double:1.0E-20)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            float r1 = (float) r3
            int r13 = r13 + 20
        L_0x0133:
            float[] r3 = f15084c
            int r4 = -r13
            r3 = r3[r4]
            goto L_0x011c
        L_0x0139:
            if (r2 == 0) goto L_0x013c
            float r1 = -r1
        L_0x013c:
            return r1
        L_0x013d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4763j.mo9677a(java.lang.String, int, int):float");
    }
}

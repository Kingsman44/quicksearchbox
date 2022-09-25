package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.na */
/* compiled from: PG */
final class C7137na {

    /* renamed from: a */
    private static final int[] f23032a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m21211a(C7050jv jvVar) {
        return m21213c(jvVar, true);
    }

    /* renamed from: b */
    public static boolean m21212b(C7050jv jvVar) {
        return m21213c(jvVar, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fa, code lost:
        r7 = false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21213c(com.google.ads.interactivemedia.p367v3.internal.C7050jv r21, boolean r22) {
        /*
            r0 = r21
            long r1 = r21.mo16100m()
            r3 = 4096(0x1000, double:2.0237E-320)
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0014
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            int r4 = (int) r3
            com.google.ads.interactivemedia.v3.internal.aee r3 = new com.google.ads.interactivemedia.v3.internal.aee
            r7 = 64
            r3.<init>((int) r7)
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x001f:
            r10 = 1
            if (r8 >= r4) goto L_0x00fa
            r11 = 8
            r3.mo14547a(r11)
            byte[] r12 = r3.mo14555i()
            boolean r12 = r0.mo16093f(r12, r7, r11, r10)
            if (r12 != 0) goto L_0x0033
            goto L_0x00fb
        L_0x0033:
            long r12 = r3.mo14566t()
            int r14 = r3.mo14568v()
            r15 = 1
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x0053
            byte[] r12 = r3.mo14555i()
            r0.mo16094g(r12, r11, r11)
            r12 = 16
            r3.mo14552f(r12)
            long r15 = r3.mo14570x()
            r10 = r15
            goto L_0x006c
        L_0x0053:
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x0069
            long r15 = r21.mo16100m()
            int r17 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r17 == 0) goto L_0x0069
            long r12 = r21.mo16098k()
            long r15 = r15 - r12
            r12 = 8
            long r12 = r12 + r15
        L_0x0069:
            r10 = r12
            r12 = 8
        L_0x006c:
            long r5 = (long) r12
            int r18 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r18 >= 0) goto L_0x0072
            return r7
        L_0x0072:
            int r8 = r8 + r12
            r12 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r14 != r12) goto L_0x0089
            int r5 = (int) r10
            int r4 = r4 + r5
            r16 = -1
            int r5 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0086
            long r5 = (long) r4
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0086
            int r4 = (int) r1
        L_0x0086:
            r5 = r16
            goto L_0x001f
        L_0x0089:
            r16 = -1
            r12 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r14 == r12) goto L_0x00f8
            r12 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r14 != r12) goto L_0x0097
            goto L_0x00f8
        L_0x0097:
            r12 = r14
            long r13 = (long) r8
            long r13 = r13 + r10
            long r13 = r13 - r5
            r19 = r8
            long r7 = (long) r4
            int r20 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r20 < 0) goto L_0x00a3
            goto L_0x00fa
        L_0x00a3:
            long r10 = r10 - r5
            int r5 = (int) r10
            int r8 = r19 + r5
            r6 = 1718909296(0x66747970, float:2.8862439E23)
            if (r12 != r6) goto L_0x00ee
            r6 = 8
            if (r5 >= r6) goto L_0x00b2
            r6 = 0
            return r6
        L_0x00b2:
            r6 = 0
            r3.mo14547a(r5)
            byte[] r7 = r3.mo14555i()
            r0.mo16094g(r7, r6, r5)
            int r5 = r5 >> 2
            r6 = 0
        L_0x00c0:
            if (r6 >= r5) goto L_0x00e9
            r7 = 1
            if (r6 != r7) goto L_0x00ca
            r7 = 4
            r3.mo14557k(r7)
            goto L_0x00e6
        L_0x00ca:
            int r7 = r3.mo14568v()
            int r10 = r7 >>> 8
            r11 = 3368816(0x336770, float:4.720717E-39)
            if (r10 != r11) goto L_0x00d7
        L_0x00d5:
            r9 = 1
            goto L_0x00e9
        L_0x00d7:
            int[] r10 = f23032a
            r11 = 0
        L_0x00da:
            r12 = 28
            if (r11 >= r12) goto L_0x00e6
            r12 = r10[r11]
            if (r12 != r7) goto L_0x00e3
            goto L_0x00d5
        L_0x00e3:
            int r11 = r11 + 1
            goto L_0x00da
        L_0x00e6:
            int r6 = r6 + 1
            goto L_0x00c0
        L_0x00e9:
            if (r9 == 0) goto L_0x00ec
            goto L_0x00f3
        L_0x00ec:
            r5 = 0
            return r5
        L_0x00ee:
            if (r5 == 0) goto L_0x00f3
            r0.mo16096i(r5)
        L_0x00f3:
            r5 = r16
            r7 = 0
            goto L_0x001f
        L_0x00f8:
            r7 = 1
            goto L_0x00fb
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            if (r9 == 0) goto L_0x0103
            r0 = r22
            if (r0 != r7) goto L_0x0103
            r0 = 1
            return r0
        L_0x0103:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7137na.m21213c(com.google.ads.interactivemedia.v3.internal.jv, boolean):boolean");
    }
}

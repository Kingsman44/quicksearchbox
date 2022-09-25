package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ast */
/* compiled from: PG */
public final class ast {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (((r10 & r12) | r0) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r4 <= 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r11 > 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r11 < 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        return r2 + ((long) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m19542a(long r10, java.math.RoundingMode r12) {
        /*
            com.google.ads.interactivemedia.p367v3.internal.aqd.m19282j(r12)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r10 / r0
            long r4 = r2 * r0
            long r4 = r10 - r4
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0012
            return r2
        L_0x0012:
            long r10 = r10 ^ r0
            r8 = 63
            long r10 = r10 >> r8
            int r11 = (int) r10
            r10 = 1
            r11 = r11 | r10
            int[] r8 = com.google.ads.interactivemedia.p367v3.internal.ass.f21506a
            int r9 = r12.ordinal()
            r8 = r8[r9]
            switch(r8) {
                case 1: goto L_0x0062;
                case 2: goto L_0x0066;
                case 3: goto L_0x005d;
                case 4: goto L_0x005f;
                case 5: goto L_0x005a;
                case 6: goto L_0x002a;
                case 7: goto L_0x002a;
                case 8: goto L_0x002a;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L_0x002a:
            long r4 = java.lang.Math.abs(r4)
            long r0 = java.lang.Math.abs(r0)
            long r0 = r0 - r4
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            r1 = 0
            if (r12 != r0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r4) goto L_0x0046
            r12 = 1
            goto L_0x0047
        L_0x0046:
            r12 = 0
        L_0x0047:
            r4 = 1
            long r4 = r4 & r2
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r10 = 0
        L_0x0050:
            r10 = r10 & r12
            r10 = r10 | r0
            if (r10 == 0) goto L_0x0066
            goto L_0x005f
        L_0x0055:
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 > 0) goto L_0x005f
            goto L_0x0066
        L_0x005a:
            if (r11 <= 0) goto L_0x0066
            goto L_0x005f
        L_0x005d:
            if (r11 >= 0) goto L_0x0066
        L_0x005f:
            long r10 = (long) r11
            long r2 = r2 + r10
            return r2
        L_0x0062:
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0067
        L_0x0066:
            return r2
        L_0x0067:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "mode was UNNECESSARY, but rounding was necessary"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.ast.m19542a(long, java.math.RoundingMode):long");
    }
}

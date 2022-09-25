package com.google.common.p4573p;

/* renamed from: com.google.common.p.h */
/* compiled from: PG */
public final class C60718h {
    /* renamed from: a */
    public static long m92647a(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j ^ j2) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        C60719i.m92654b(z2 | z, "checkedAdd", j, j2);
        return j3;
    }

    /* renamed from: b */
    public static long m92648b(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ -1) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(-1 ^ j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        C60719i.m92654b(numberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        long j3 = j * j2;
        C60719i.m92654b(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    /* renamed from: c */
    public static long m92649c(long j, long j2) {
        long j3 = j - j2;
        boolean z = true;
        boolean z2 = (j ^ j2) >= 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        C60719i.m92654b(z2 | z, "checkedSubtract", j, j2);
        return j3;
    }

    /* renamed from: e */
    public static long m92651e(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    /* renamed from: f */
    public static long m92652f(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        return z2 | z ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r9 > 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r9 < 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r8 != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        return r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m92650d(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0010
            return r0
        L_0x0010:
            long r8 = r8 ^ r10
            r6 = 63
            long r8 = r8 >> r6
            int r9 = (int) r8
            r8 = 1
            r9 = r9 | r8
            int[] r6 = com.google.common.p4573p.C60717g.f164726a
            int r7 = r12.ordinal()
            r6 = r6[r7]
            r7 = 0
            switch(r6) {
                case 1: goto L_0x0058;
                case 2: goto L_0x005b;
                case 3: goto L_0x004f;
                case 4: goto L_0x0055;
                case 5: goto L_0x004c;
                case 6: goto L_0x0029;
                case 7: goto L_0x0029;
                case 8: goto L_0x0029;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L_0x0029:
            long r2 = java.lang.Math.abs(r2)
            long r10 = java.lang.Math.abs(r10)
            long r10 = r10 - r2
            long r2 = r2 - r10
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0047
            java.math.RoundingMode r10 = java.math.RoundingMode.HALF_UP
            if (r12 == r10) goto L_0x0053
            java.math.RoundingMode r10 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r10) goto L_0x0052
            r10 = 1
            long r10 = r10 & r0
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0047:
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0052
            goto L_0x0053
        L_0x004c:
            if (r9 <= 0) goto L_0x0052
            goto L_0x0053
        L_0x004f:
            if (r9 >= 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r8 = 0
        L_0x0053:
            if (r8 == 0) goto L_0x005b
        L_0x0055:
            long r8 = (long) r9
            long r0 = r0 + r8
            return r0
        L_0x0058:
            com.google.common.p4573p.C60719i.m92655c(r7)
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4573p.C60718h.m92650d(long, long, java.math.RoundingMode):long");
    }
}

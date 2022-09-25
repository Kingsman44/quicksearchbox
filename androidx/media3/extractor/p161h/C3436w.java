package androidx.media3.extractor.p161h;

/* renamed from: androidx.media3.extractor.h.w */
/* compiled from: PG */
public final class C3436w {

    /* renamed from: a */
    private static final int[] f10575a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ff, code lost:
        r7 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m9957a(androidx.media3.extractor.C3327ab r21, boolean r22) {
        /*
            r0 = r21
            long r1 = r21.mo7311d()
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
            androidx.media3.common.b.ac r3 = new androidx.media3.common.b.ac
            r7 = 64
            r3.<init>((int) r7)
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x001f:
            r10 = 1
            if (r8 >= r4) goto L_0x00ff
            r11 = 8
            r3.mo6156x(r11)
            byte[] r12 = r3.f7234a
            boolean r12 = r0.mo7320o(r12, r7, r11, r10)
            if (r12 != 0) goto L_0x0031
            goto L_0x0100
        L_0x0031:
            long r12 = r3.mo6146n()
            int r14 = r3.mo6134b()
            r15 = 1
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x004f
            byte[] r12 = r3.f7234a
            r0.mo7315j(r12, r11, r11)
            r12 = 16
            r3.mo6158z(r12)
            long r15 = r3.mo6145m()
            r10 = r15
            goto L_0x0068
        L_0x004f:
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x0065
            long r15 = r21.mo7311d()
            int r17 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r17 == 0) goto L_0x0065
            long r12 = r21.mo7312e()
            long r15 = r15 - r12
            r12 = 8
            long r12 = r12 + r15
        L_0x0065:
            r10 = r12
            r12 = 8
        L_0x0068:
            long r5 = (long) r12
            int r18 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r18 >= 0) goto L_0x006e
            return r7
        L_0x006e:
            int r8 = r8 + r12
            r12 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r14 != r12) goto L_0x0085
            int r5 = (int) r10
            int r4 = r4 + r5
            r16 = -1
            int r5 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0082
            long r5 = (long) r4
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0082
            int r4 = (int) r1
        L_0x0082:
            r5 = r16
            goto L_0x001f
        L_0x0085:
            r16 = -1
            r12 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r14 == r12) goto L_0x00fd
            r12 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r14 != r12) goto L_0x0093
            goto L_0x00fd
        L_0x0093:
            r12 = r14
            long r13 = (long) r8
            long r13 = r13 + r10
            long r13 = r13 - r5
            r19 = r8
            long r7 = (long) r4
            int r20 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r20 < 0) goto L_0x009f
            goto L_0x00ff
        L_0x009f:
            long r10 = r10 - r5
            int r5 = (int) r10
            int r8 = r19 + r5
            r6 = 1718909296(0x66747970, float:2.8862439E23)
            if (r12 != r6) goto L_0x00f3
            r6 = 8
            if (r5 >= r6) goto L_0x00ae
            r6 = 0
            return r6
        L_0x00ae:
            r6 = 0
            r3.mo6156x(r5)
            byte[] r7 = r3.f7234a
            r0.mo7315j(r7, r6, r5)
            int r5 = r5 >> 2
            r6 = 0
        L_0x00ba:
            if (r6 >= r5) goto L_0x00ee
            r7 = 1
            if (r6 != r7) goto L_0x00c7
            int r7 = r3.f7235b
            int r7 = r7 + 4
            r3.mo6131A(r7)
            goto L_0x00eb
        L_0x00c7:
            int r7 = r3.mo6134b()
            int r10 = r7 >>> 8
            r11 = 3368816(0x336770, float:4.720717E-39)
            if (r10 != r11) goto L_0x00d4
        L_0x00d2:
            r9 = 1
            goto L_0x00ee
        L_0x00d4:
            r10 = 1751476579(0x68656963, float:4.333464E24)
            if (r7 != r10) goto L_0x00dc
            r7 = 1751476579(0x68656963, float:4.333464E24)
        L_0x00dc:
            int[] r10 = f10575a
            r11 = 0
        L_0x00df:
            r12 = 29
            if (r11 >= r12) goto L_0x00eb
            r12 = r10[r11]
            if (r12 != r7) goto L_0x00e8
            goto L_0x00d2
        L_0x00e8:
            int r11 = r11 + 1
            goto L_0x00df
        L_0x00eb:
            int r6 = r6 + 1
            goto L_0x00ba
        L_0x00ee:
            if (r9 == 0) goto L_0x00f1
            goto L_0x00f8
        L_0x00f1:
            r5 = 0
            return r5
        L_0x00f3:
            if (r5 == 0) goto L_0x00f8
            r0.mo7314g(r5)
        L_0x00f8:
            r5 = r16
            r7 = 0
            goto L_0x001f
        L_0x00fd:
            r7 = 1
            goto L_0x0100
        L_0x00ff:
            r7 = 0
        L_0x0100:
            if (r9 == 0) goto L_0x0108
            r0 = r22
            if (r0 != r7) goto L_0x0108
            r0 = 1
            return r0
        L_0x0108:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p161h.C3436w.m9957a(androidx.media3.extractor.ab, boolean):boolean");
    }
}

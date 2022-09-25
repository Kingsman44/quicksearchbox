package androidx.media3.extractor;

import androidx.media3.common.p136b.C2604ac;

/* renamed from: androidx.media3.extractor.ah */
/* compiled from: PG */
public final class C3333ah {
    /* renamed from: a */
    public static int m9651a(C2604ac acVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return acVar.mo6139g() + 1;
            case 7:
                return acVar.mo6142j() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public static boolean m9652b(C2604ac acVar, C3337al alVar, boolean z, C3332ag agVar) {
        try {
            long p = acVar.mo6148p();
            if (!z) {
                p *= (long) alVar.f10060b;
            }
            agVar.f10054a = p;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r7 != r1.f10064f) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if ((r17.mo6139g() * 1000) == r3) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        if (r4 == r3) goto L_0x009b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m9653c(androidx.media3.common.p136b.C2604ac r17, androidx.media3.extractor.C3337al r18, int r19, androidx.media3.extractor.C3332ag r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r0.f7235b
            long r3 = r17.mo6146n()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0017
            return r9
        L_0x0017:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0021
            r5 = 1
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            r11 = 7
            r13 = -1
            if (r6 > r11) goto L_0x0049
            int r11 = r1.f10065g
            int r11 = r11 + r13
            if (r6 != r11) goto L_0x00ab
            goto L_0x0052
        L_0x0049:
            r11 = 10
            if (r6 > r11) goto L_0x00ab
            int r6 = r1.f10065g
            r11 = 2
            if (r6 != r11) goto L_0x00ab
        L_0x0052:
            if (r8 != 0) goto L_0x0057
        L_0x0054:
            r14 = 1
            goto L_0x005c
        L_0x0057:
            int r6 = r1.f10067i
            if (r8 != r6) goto L_0x00ab
            goto L_0x0054
        L_0x005c:
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x00ab
            r3 = r20
            boolean r3 = m9652b(r0, r1, r5, r3)
            if (r3 == 0) goto L_0x00ab
            int r3 = m9651a(r0, r12)
            if (r3 == r13) goto L_0x00ab
            int r4 = r1.f10060b
            if (r3 > r4) goto L_0x00ab
            int r3 = r1.f10063e
            if (r7 != 0) goto L_0x0077
            goto L_0x009b
        L_0x0077:
            r4 = 11
            if (r7 > r4) goto L_0x0080
            int r1 = r1.f10064f
            if (r7 == r1) goto L_0x009b
            goto L_0x00ab
        L_0x0080:
            r1 = 12
            if (r7 != r1) goto L_0x008d
            int r1 = r17.mo6139g()
            int r1 = r1 * 1000
            if (r1 != r3) goto L_0x00ab
            goto L_0x009b
        L_0x008d:
            r1 = 14
            if (r7 > r1) goto L_0x00ab
            int r4 = r17.mo6142j()
            if (r7 != r1) goto L_0x0099
            int r4 = r4 * 10
        L_0x0099:
            if (r4 != r3) goto L_0x00ab
        L_0x009b:
            int r1 = r17.mo6139g()
            int r3 = r0.f7235b
            byte[] r0 = r0.f7234a
            int r3 = r3 + r13
            int r0 = androidx.media3.common.p136b.C2612ak.m6975ay(r0, r2, r3)
            if (r1 != r0) goto L_0x00ab
            return r10
        L_0x00ab:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.C3333ah.m9653c(androidx.media3.common.b.ac, androidx.media3.extractor.al, int, androidx.media3.extractor.ag):boolean");
    }
}

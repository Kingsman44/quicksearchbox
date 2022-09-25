package androidx.media3.extractor.p173l;

import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.l.d */
/* compiled from: PG */
public final class C3578d implements C3326aa {

    /* renamed from: a */
    private C3329ad f11399a;

    /* renamed from: b */
    private C3368bf f11400b;

    /* renamed from: c */
    private int f11401c = 0;

    /* renamed from: d */
    private long f11402d = -1;

    /* renamed from: e */
    private C3576b f11403e;

    /* renamed from: f */
    private int f11404f = -1;

    /* renamed from: g */
    private long f11405g = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0172, code lost:
        if (r2 != 65534) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r26, androidx.media3.extractor.C3350ay r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            androidx.media3.extractor.bf r2 = r0.f11400b
            androidx.media3.common.p136b.C2601a.m6829a(r2)
            int r2 = androidx.media3.common.p136b.C2612ak.f7249a
            int r2 = r0.f11401c
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x01e1
            r7 = 2
            r8 = -1
            r10 = 8
            if (r2 == r5) goto L_0x01b1
            r11 = 3
            if (r2 == r7) goto L_0x00c0
            if (r2 == r11) goto L_0x003f
            long r10 = r0.f11405g
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            androidx.media3.common.p136b.C2601a.m6832d(r5)
            long r4 = r0.f11405g
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r7 = r2.f11566c
            long r4 = r4 - r7
            androidx.media3.extractor.l.b r2 = r0.f11403e
            r2.getClass()
            boolean r1 = r2.mo7486c(r1, r4)
            if (r1 == 0) goto L_0x003e
            return r3
        L_0x003e:
            return r6
        L_0x003f:
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            r2.f11568e = r6
            androidx.media3.common.b.ac r3 = new androidx.media3.common.b.ac
            r3.<init>((int) r10)
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            androidx.media3.extractor.l.f r1 = androidx.media3.extractor.p173l.C3581g.m10365a(r5, r1, r3)
            r2.mo7639q(r10)
            long r10 = r2.f11566c
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            long r10 = r1.f11413b
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            android.util.Pair r1 = android.util.Pair.create(r3, r1)
            java.lang.Object r3 = r1.first
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            r0.f11404f = r3
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r10 = r1.longValue()
            long r12 = r0.f11402d
            int r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0085
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0085
            r10 = r12
        L_0x0085:
            int r1 = r0.f11404f
            long r12 = (long) r1
            long r12 = r12 + r10
            r0.f11405g = r12
            long r1 = r2.f11565b
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00b3
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Data exceeds input length: "
            r3.<init>(r5)
            r3.append(r12)
            java.lang.String r5 = ", "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = "WavExtractor"
            java.lang.String r3 = r3.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r5, r3)
            r0.f11405g = r1
            r12 = r1
        L_0x00b3:
            androidx.media3.extractor.l.b r1 = r0.f11403e
            r1.getClass()
            int r2 = r0.f11404f
            r1.mo7484a(r2, r12)
            r0.f11401c = r4
            return r6
        L_0x00c0:
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            r3 = 16
            r2.<init>((int) r3)
            r7 = 1718449184(0x666d7420, float:2.8033575E23)
            androidx.media3.extractor.l.f r7 = androidx.media3.extractor.p173l.C3581g.m10365a(r7, r1, r2)
            long r8 = r7.f11413b
            r12 = 16
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x00d8
            r8 = 1
            goto L_0x00d9
        L_0x00d8:
            r8 = 0
        L_0x00d9:
            androidx.media3.common.p136b.C2601a.m6832d(r8)
            byte[] r8 = r2.f7234a
            r9 = r1
            androidx.media3.extractor.q r9 = (androidx.media3.extractor.C3627q) r9
            r9.mo7320o(r8, r6, r3, r6)
            r2.mo6131A(r6)
            int r13 = r2.mo6137e()
            int r14 = r2.mo6137e()
            int r15 = r2.mo6136d()
            r2.mo6136d()
            int r16 = r2.mo6137e()
            int r17 = r2.mo6137e()
            long r2 = r7.f11413b
            int r3 = (int) r2
            int r3 = r3 + -16
            if (r3 <= 0) goto L_0x010b
            byte[] r2 = new byte[r3]
            r9.mo7320o(r2, r6, r3, r6)
            goto L_0x010d
        L_0x010b:
            byte[] r2 = androidx.media3.common.p136b.C2612ak.f7254f
        L_0x010d:
            r18 = r2
            long r1 = r26.mo7312e()
            long r7 = r9.f11566c
            long r1 = r1 - r7
            int r2 = (int) r1
            r9.mo7639q(r2)
            androidx.media3.extractor.l.e r1 = new androidx.media3.extractor.l.e
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            int r2 = r1.f11406a
            r3 = 17
            if (r2 != r3) goto L_0x0133
            androidx.media3.extractor.l.a r2 = new androidx.media3.extractor.l.a
            androidx.media3.extractor.ad r3 = r0.f11399a
            androidx.media3.extractor.bf r4 = r0.f11400b
            r2.<init>(r3, r4, r1)
            r0.f11403e = r2
            goto L_0x019b
        L_0x0133:
            r3 = 6
            if (r2 != r3) goto L_0x014e
            androidx.media3.extractor.l.c r2 = new androidx.media3.extractor.l.c
            androidx.media3.extractor.ad r3 = r0.f11399a
            androidx.media3.extractor.bf r4 = r0.f11400b
            java.lang.String r23 = "audio/g711-alaw"
            r24 = -1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            r0.f11403e = r2
            goto L_0x019b
        L_0x014e:
            r3 = 7
            if (r2 != r3) goto L_0x0169
            androidx.media3.extractor.l.c r2 = new androidx.media3.extractor.l.c
            androidx.media3.extractor.ad r3 = r0.f11399a
            androidx.media3.extractor.bf r4 = r0.f11400b
            java.lang.String r23 = "audio/g711-mlaw"
            r24 = -1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            r0.f11403e = r2
            goto L_0x019b
        L_0x0169:
            int r3 = r1.f11410e
            if (r2 == r5) goto L_0x017e
            if (r2 == r11) goto L_0x0177
            r4 = 65534(0xfffe, float:9.1833E-41)
            if (r2 == r4) goto L_0x017e
        L_0x0174:
            r24 = 0
            goto L_0x0184
        L_0x0177:
            r5 = 32
            if (r3 != r5) goto L_0x0174
            r24 = 4
            goto L_0x0184
        L_0x017e:
            int r4 = androidx.media3.common.p136b.C2612ak.m6988m(r3)
            r24 = r4
        L_0x0184:
            if (r24 == 0) goto L_0x019e
            androidx.media3.extractor.l.c r2 = new androidx.media3.extractor.l.c
            androidx.media3.extractor.ad r3 = r0.f11399a
            androidx.media3.extractor.bf r4 = r0.f11400b
            java.lang.String r23 = "audio/raw"
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            r0.f11403e = r2
        L_0x019b:
            r0.f11401c = r11
            return r6
        L_0x019e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported WAV format type: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6822d(r1)
            throw r1
        L_0x01b1:
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            r2.<init>((int) r10)
            androidx.media3.extractor.l.f r3 = androidx.media3.extractor.p173l.C3580f.m10364a(r1, r2)
            int r4 = r3.f11412a
            r5 = 1685272116(0x64733634, float:1.7945858E22)
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            if (r4 == r5) goto L_0x01c6
            r1.f11568e = r6
            goto L_0x01dc
        L_0x01c6:
            r1.mo7319n(r10, r6)
            r2.mo6131A(r6)
            byte[] r4 = r2.f7234a
            r1.mo7320o(r4, r6, r10, r6)
            long r8 = r2.mo6143k()
            long r2 = r3.f11413b
            int r3 = (int) r2
            int r3 = r3 + r10
            r1.mo7639q(r3)
        L_0x01dc:
            r0.f11402d = r8
            r0.f11401c = r7
            return r6
        L_0x01e1:
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r7 = r2.f11566c
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x01ee
            r7 = 1
            goto L_0x01ef
        L_0x01ee:
            r7 = 0
        L_0x01ef:
            androidx.media3.common.p136b.C2601a.m6832d(r7)
            int r7 = r0.f11404f
            if (r7 == r3) goto L_0x01fc
            r2.mo7639q(r7)
            r0.f11401c = r4
            goto L_0x020f
        L_0x01fc:
            boolean r3 = androidx.media3.extractor.p173l.C3581g.m10366b(r26)
            if (r3 == 0) goto L_0x0210
            long r3 = r26.mo7312e()
            long r7 = r2.f11566c
            long r3 = r3 - r7
            int r1 = (int) r3
            r2.mo7639q(r1)
            r0.f11401c = r5
        L_0x020f:
            return r6
        L_0x0210:
            java.lang.String r1 = "Unsupported or unrecognized wav file type."
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            goto L_0x0219
        L_0x0218:
            throw r1
        L_0x0219:
            goto L_0x0218
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p173l.C3578d.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        this.f11401c = j == 0 ? 0 : 4;
        C3576b bVar = this.f11403e;
        if (bVar != null) {
            bVar.mo7485b(j2);
        }
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        return C3581g.m10366b(abVar);
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f11399a = adVar;
        this.f11400b = adVar.mo6987eZ(0, 1);
        adVar.mo6988fa();
    }
}

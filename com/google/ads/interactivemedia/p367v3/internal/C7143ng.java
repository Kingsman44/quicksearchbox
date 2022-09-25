package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ng */
/* compiled from: PG */
final class C7143ng implements C7150nn {

    /* renamed from: a */
    private final C7149nm f23077a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f23078b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f23079c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7154nr f23080d;

    /* renamed from: e */
    private int f23081e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f23082f;

    /* renamed from: g */
    private long f23083g;

    /* renamed from: h */
    private long f23084h;

    /* renamed from: i */
    private long f23085i;

    /* renamed from: j */
    private long f23086j;

    /* renamed from: k */
    private long f23087k;

    /* renamed from: l */
    private long f23088l;

    public C7143ng(C7154nr nrVar, long j, long j2, long j3, long j4, boolean z) {
        ary.m19462o(j >= 0 && j2 > j);
        this.f23080d = nrVar;
        this.f23078b = j;
        this.f23079c = j2;
        if (j3 == j2 - j || z) {
            this.f23082f = j4;
            this.f23081e = 4;
        } else {
            this.f23081e = 0;
        }
        this.f23077a = new C7149nm();
    }

    /* renamed from: a */
    public final void mo16193a(long j) {
        this.f23084h = aeu.m18491I(j, 0, -1 + this.f23082f);
        this.f23081e = 2;
        this.f23085i = this.f23078b;
        this.f23086j = this.f23079c;
        this.f23087k = 0;
        this.f23088l = this.f23082f;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C7070ko mo16194b() {
        if (this.f23082f != 0) {
            return new C7142nf(this);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo16195g(com.google.ads.interactivemedia.p367v3.internal.C7050jv r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f23081e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00f6
            if (r2 == r3) goto L_0x0108
            r3 = 2
            r8 = 3
            r9 = -1
            if (r2 == r3) goto L_0x0015
            if (r2 == r8) goto L_0x00bd
            return r9
        L_0x0015:
            long r2 = r0.f23085i
            long r11 = r0.f23086j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0021
        L_0x001d:
            r2 = r9
            r11 = r2
            goto L_0x00b5
        L_0x0021:
            long r2 = r24.mo16099l()
            com.google.ads.interactivemedia.v3.internal.nm r11 = r0.f23077a
            long r12 = r0.f23086j
            boolean r11 = r11.mo16207c(r1, r12)
            if (r11 != 0) goto L_0x0040
            long r11 = r0.f23085i
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0038
            r2 = r9
            goto L_0x00b5
        L_0x0038:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0040:
            com.google.ads.interactivemedia.v3.internal.nm r11 = r0.f23077a
            r11.mo16208d(r1, r4)
            r24.mo16097j()
            long r11 = r0.f23084h
            com.google.ads.interactivemedia.v3.internal.nm r13 = r0.f23077a
            long r14 = r13.f23108c
            long r11 = r11 - r14
            int r6 = r13.f23110e
            int r7 = r13.f23111f
            int r6 = r6 + r7
            r16 = 0
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 < 0) goto L_0x0062
            r18 = 72000(0x11940, double:3.55727E-319)
            int r7 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x0062
            goto L_0x001d
        L_0x0062:
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x006b
            r0.f23086j = r2
            r0.f23088l = r14
            goto L_0x0079
        L_0x006b:
            long r2 = r24.mo16099l()
            long r13 = (long) r6
            long r2 = r2 + r13
            r0.f23085i = r2
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            long r2 = r2.f23108c
            r0.f23087k = r2
        L_0x0079:
            long r2 = r0.f23086j
            long r13 = r0.f23085i
            long r2 = r2 - r13
            r18 = 100000(0x186a0, double:4.94066E-319)
            int r7 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x008a
            r0.f23086j = r13
            r2 = r9
            r11 = r13
            goto L_0x00b5
        L_0x008a:
            long r2 = (long) r6
            int r6 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r6 > 0) goto L_0x0092
            r6 = 2
            goto L_0x0094
        L_0x0092:
            r6 = 1
        L_0x0094:
            long r13 = r24.mo16099l()
            long r4 = r0.f23086j
            long r8 = r0.f23085i
            long r2 = r2 * r6
            long r13 = r13 - r2
            long r2 = r4 - r8
            long r11 = r11 * r2
            long r2 = r0.f23088l
            long r6 = r0.f23087k
            long r2 = r2 - r6
            long r11 = r11 / r2
            long r17 = r13 + r11
            r2 = -1
            long r21 = r4 + r2
            r19 = r8
            long r11 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18491I(r17, r19, r21)
        L_0x00b5:
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ba
            return r11
        L_0x00ba:
            r2 = 3
            r0.f23081e = r2
        L_0x00bd:
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            r2.mo16206b(r1)
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            r3 = 0
            r2.mo16208d(r1, r3)
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            long r3 = r2.f23108c
            long r5 = r0.f23084h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00df
            r24.mo16097j()
            r1 = 4
            r0.f23081e = r1
            long r1 = r0.f23087k
            r3 = 2
            long r1 = r1 + r3
            long r1 = -r1
            return r1
        L_0x00df:
            r3 = 2
            int r5 = r2.f23110e
            int r2 = r2.f23111f
            int r5 = r5 + r2
            r1.mo16091d(r5)
            long r5 = r24.mo16099l()
            r0.f23085i = r5
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            long r5 = r2.f23108c
            r0.f23087k = r5
            goto L_0x00bd
        L_0x00f6:
            long r4 = r24.mo16099l()
            r0.f23083g = r4
            r0.f23081e = r3
            long r2 = r0.f23079c
            r6 = -65307(0xffffffffffff00e5, double:NaN)
            long r2 = r2 + r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x014f
        L_0x0108:
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            r2.mo16205a()
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            boolean r2 = r2.mo16206b(r1)
            if (r2 == 0) goto L_0x0149
        L_0x0115:
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            r3 = 0
            r2.mo16208d(r1, r3)
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            int r4 = r2.f23110e
            int r2 = r2.f23111f
            int r4 = r4 + r2
            r1.mo16091d(r4)
            com.google.ads.interactivemedia.v3.internal.nm r2 = r0.f23077a
            int r4 = r2.f23107b
            r5 = 4
            r4 = r4 & r5
            if (r4 == r5) goto L_0x013d
            boolean r2 = r2.mo16206b(r1)
            if (r2 == 0) goto L_0x013d
            long r4 = r24.mo16099l()
            long r6 = r0.f23079c
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0115
        L_0x013d:
            com.google.ads.interactivemedia.v3.internal.nm r1 = r0.f23077a
            long r1 = r1.f23108c
            r0.f23082f = r1
            r1 = 4
            r0.f23081e = r1
            long r1 = r0.f23083g
            return r1
        L_0x0149:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x014f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7143ng.mo16195g(com.google.ads.interactivemedia.v3.internal.jv):long");
    }
}

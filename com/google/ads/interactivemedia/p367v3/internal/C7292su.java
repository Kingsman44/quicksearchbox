package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.su */
/* compiled from: PG */
final class C7292su implements C7335uj {

    /* renamed from: a */
    private final C7058kc f23769a;

    /* renamed from: b */
    private C7053jy f23770b;

    /* renamed from: c */
    private C7050jv f23771c;

    public C7292su(C7058kc kcVar) {
        this.f23769a = kcVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r0.mo16099l() != r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r0.mo16099l() != r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        r1 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16486a(com.google.ads.interactivemedia.p367v3.internal.abu r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.ads.interactivemedia.p367v3.internal.C7056ka r15) {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.jv r6 = new com.google.ads.interactivemedia.v3.internal.jv
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f23771c = r6
            com.google.ads.interactivemedia.v3.internal.jy r8 = r7.f23770b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.ads.interactivemedia.v3.internal.kc r8 = r7.f23769a
            com.google.ads.interactivemedia.v3.internal.jy[] r8 = r8.mo15119b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f23770b = r8
            goto L_0x007f
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 >= r10) goto L_0x007b
            r1 = r8[r0]
            boolean r2 = r1.mo16111g(r6)     // Catch:{ EOFException -> 0x0061, all -> 0x004c }
            if (r2 == 0) goto L_0x003f
            r7.f23770b = r1     // Catch:{ EOFException -> 0x0061, all -> 0x004c }
            if (r1 != 0) goto L_0x0037
            long r0 = r6.mo16099l()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0038
        L_0x0037:
            r13 = 1
        L_0x0038:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r13)
            r6.mo16097j()
            goto L_0x007b
        L_0x003f:
            com.google.ads.interactivemedia.v3.internal.jy r1 = r7.f23770b
            if (r1 != 0) goto L_0x0071
            long r1 = r6.mo16099l()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x006f
            goto L_0x0071
        L_0x004c:
            r8 = move-exception
            com.google.ads.interactivemedia.v3.internal.jy r9 = r7.f23770b
            if (r9 != 0) goto L_0x0059
            long r9 = r6.mo16099l()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x005a
        L_0x0059:
            r13 = 1
        L_0x005a:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r13)
            r6.mo16097j()
            throw r8
        L_0x0061:
            com.google.ads.interactivemedia.v3.internal.jy r1 = r7.f23770b
            if (r1 != 0) goto L_0x0071
            long r1 = r6.mo16099l()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = 0
            goto L_0x0072
        L_0x0071:
            r1 = 1
        L_0x0072:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r1)
            r6.mo16097j()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x007b:
            com.google.ads.interactivemedia.v3.internal.jy r10 = r7.f23770b
            if (r10 == 0) goto L_0x0085
        L_0x007f:
            com.google.ads.interactivemedia.v3.internal.jy r8 = r7.f23770b
            r8.mo16108d(r15)
            return
        L_0x0085:
            com.google.ads.interactivemedia.v3.internal.vk r10 = new com.google.ads.interactivemedia.v3.internal.vk
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18501S(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r12 = r8.length()
            int r12 = r12 + 58
            r11.<init>(r12)
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r9)
            r10.<init>(r8)
            goto L_0x00af
        L_0x00ae:
            throw r10
        L_0x00af:
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7292su.mo16486a(com.google.ads.interactivemedia.v3.internal.abu, android.net.Uri, java.util.Map, long, long, com.google.ads.interactivemedia.v3.internal.ka):void");
    }

    /* renamed from: b */
    public final void mo16487b() {
        if (this.f23770b != null) {
            this.f23770b = null;
        }
        this.f23771c = null;
    }

    /* renamed from: c */
    public final void mo16488c() {
        C7053jy jyVar = this.f23770b;
        if (jyVar instanceof C7107ly) {
            ((C7107ly) jyVar).mo16165a();
        }
    }

    /* renamed from: d */
    public final long mo16489d() {
        C7050jv jvVar = this.f23771c;
        if (jvVar != null) {
            return jvVar.mo16099l();
        }
        return -1;
    }

    /* renamed from: e */
    public final void mo16490e(long j, long j2) {
        C7053jy jyVar = this.f23770b;
        ary.m19467t(jyVar);
        jyVar.mo16109e(j, j2);
    }

    /* renamed from: f */
    public final int mo16491f(C7067kl klVar) {
        C7053jy jyVar = this.f23770b;
        ary.m19467t(jyVar);
        C7050jv jvVar = this.f23771c;
        ary.m19467t(jvVar);
        return jyVar.mo16112h(jvVar, klVar);
    }
}

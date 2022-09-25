package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lf */
/* compiled from: PG */
public final class C7088lf implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f22706a = 0;

    /* renamed from: b */
    private final aee f22707b = new aee(4);

    /* renamed from: c */
    private final aee f22708c = new aee(9);

    /* renamed from: d */
    private final aee f22709d = new aee(11);

    /* renamed from: e */
    private final aee f22710e = new aee();

    /* renamed from: f */
    private final C7089lg f22711f = new C7089lg();

    /* renamed from: g */
    private C7056ka f22712g;

    /* renamed from: h */
    private int f22713h = 1;

    /* renamed from: i */
    private boolean f22714i;

    /* renamed from: j */
    private long f22715j;

    /* renamed from: k */
    private int f22716k;

    /* renamed from: l */
    private int f22717l;

    /* renamed from: m */
    private int f22718m;

    /* renamed from: n */
    private long f22719n;

    /* renamed from: o */
    private boolean f22720o;

    /* renamed from: p */
    private C7086ld f22721p;

    /* renamed from: q */
    private C7092lj f22722q;

    static {
        int i = C7087le.f22705b;
    }

    /* renamed from: a */
    private final void m21012a() {
        if (!this.f22720o) {
            this.f22712g.mo16115am(new C7069kn(-9223372036854775807L));
            this.f22720o = true;
        }
    }

    /* renamed from: b */
    private final aee m21013b(C7050jv jvVar) {
        if (this.f22718m > this.f22710e.mo14556j()) {
            aee aee = this.f22710e;
            int j = aee.mo14556j();
            aee.mo14549c(new byte[Math.max(j + j, this.f22718m)], 0);
        } else {
            this.f22710e.mo14554h(0);
        }
        this.f22710e.mo14552f(this.f22718m);
        jvVar.mo16090c(this.f22710e.mo14555i(), 0, this.f22718m);
        return this.f22710e;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f22712g = kaVar;
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        if (j == 0) {
            this.f22713h = 1;
            this.f22714i = false;
        } else {
            this.f22713h = 3;
        }
        this.f22716k = 0;
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        jvVar.mo16094g(this.f22707b.mo14555i(), 0, 3);
        this.f22707b.mo14554h(0);
        if (this.f22707b.mo14564r() != 4607062) {
            return false;
        }
        jvVar.mo16094g(this.f22707b.mo14555i(), 0, 2);
        this.f22707b.mo14554h(0);
        if ((this.f22707b.mo14561o() & 250) != 0) {
            return false;
        }
        jvVar.mo16094g(this.f22707b.mo14555i(), 0, 4);
        this.f22707b.mo14554h(0);
        int v = this.f22707b.mo14568v();
        jvVar.mo16097j();
        jvVar.mo16096i(v);
        jvVar.mo16094g(this.f22707b.mo14555i(), 0, 4);
        this.f22707b.mo14554h(0);
        if (this.f22707b.mo14568v() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16112h(com.google.ads.interactivemedia.p367v3.internal.C7050jv r17, com.google.ads.interactivemedia.p367v3.internal.C7067kl r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.ads.interactivemedia.v3.internal.ka r2 = r0.f22712g
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r2)
        L_0x0009:
            int r2 = r0.f22713h
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x011d
            r10 = 3
            if (r2 == r6) goto L_0x0112
            if (r2 == r10) goto L_0x00ca
            if (r2 != r7) goto L_0x00c4
            boolean r2 = r0.f22714i
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.f22715j
            long r14 = r0.f22719n
            long r2 = r2 + r14
            goto L_0x003b
        L_0x002c:
            com.google.ads.interactivemedia.v3.internal.lg r2 = r0.f22711f
            long r2 = r2.mo16143c()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0039
            r2 = 0
            goto L_0x003b
        L_0x0039:
            long r2 = r0.f22719n
        L_0x003b:
            int r14 = r0.f22717l
            if (r14 != r4) goto L_0x0052
            com.google.ads.interactivemedia.v3.internal.ld r14 = r0.f22721p
            if (r14 == 0) goto L_0x0053
            r16.m21012a()
            com.google.ads.interactivemedia.v3.internal.ld r4 = r0.f22721p
            com.google.ads.interactivemedia.v3.internal.aee r5 = r16.m21013b(r17)
            boolean r2 = r4.mo16146f(r5, r2)
        L_0x0050:
            r3 = 1
            goto L_0x00a3
        L_0x0052:
            r4 = r14
        L_0x0053:
            if (r4 != r5) goto L_0x0067
            com.google.ads.interactivemedia.v3.internal.lj r4 = r0.f22722q
            if (r4 == 0) goto L_0x009c
            r16.m21012a()
            com.google.ads.interactivemedia.v3.internal.lj r4 = r0.f22722q
            com.google.ads.interactivemedia.v3.internal.aee r5 = r16.m21013b(r17)
            boolean r2 = r4.mo16146f(r5, r2)
            goto L_0x0050
        L_0x0067:
            r5 = 18
            if (r4 != r5) goto L_0x009c
            boolean r4 = r0.f22720o
            if (r4 != 0) goto L_0x009c
            com.google.ads.interactivemedia.v3.internal.lg r4 = r0.f22711f
            com.google.ads.interactivemedia.v3.internal.aee r5 = r16.m21013b(r17)
            boolean r2 = r4.mo16146f(r5, r2)
            com.google.ads.interactivemedia.v3.internal.lg r3 = r0.f22711f
            long r3 = r3.mo16143c()
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0050
            com.google.ads.interactivemedia.v3.internal.ka r5 = r0.f22712g
            com.google.ads.interactivemedia.v3.internal.kk r14 = new com.google.ads.interactivemedia.v3.internal.kk
            com.google.ads.interactivemedia.v3.internal.lg r15 = r0.f22711f
            long[] r15 = r15.mo16145e()
            com.google.ads.interactivemedia.v3.internal.lg r10 = r0.f22711f
            long[] r10 = r10.mo16144d()
            r14.<init>(r15, r10, r3)
            r5.mo16115am(r14)
            r0.f22720o = r9
            goto L_0x0050
        L_0x009c:
            int r2 = r0.f22718m
            r1.mo16091d(r2)
            r2 = 0
            r3 = 0
        L_0x00a3:
            boolean r4 = r0.f22714i
            if (r4 != 0) goto L_0x00bd
            if (r2 == 0) goto L_0x00bd
            r0.f22714i = r9
            com.google.ads.interactivemedia.v3.internal.lg r2 = r0.f22711f
            long r4 = r2.mo16143c()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00b9
            long r4 = r0.f22719n
            long r10 = -r4
            goto L_0x00bb
        L_0x00b9:
            r10 = 0
        L_0x00bb:
            r0.f22715j = r10
        L_0x00bd:
            r0.f22716k = r7
            r0.f22713h = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00c4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00ca:
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22709d
            byte[] r2 = r2.mo14555i()
            r4 = 11
            boolean r2 = r1.mo16089b(r2, r8, r4, r9)
            if (r2 != 0) goto L_0x00d9
            return r3
        L_0x00d9:
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22709d
            r2.mo14554h(r8)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22709d
            int r2 = r2.mo14560n()
            r0.f22717l = r2
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22709d
            int r2 = r2.mo14564r()
            r0.f22718m = r2
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22709d
            int r2 = r2.mo14564r()
            long r2 = (long) r2
            r0.f22719n = r2
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22709d
            int r2 = r2.mo14560n()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.f22719n
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.f22719n = r2
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22709d
            r2.mo14557k(r10)
            r0.f22713h = r7
            goto L_0x0009
        L_0x0112:
            int r2 = r0.f22716k
            r1.mo16091d(r2)
            r0.f22716k = r8
            r0.f22713h = r10
            goto L_0x0009
        L_0x011d:
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22708c
            byte[] r2 = r2.mo14555i()
            boolean r2 = r1.mo16089b(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x012a
            return r3
        L_0x012a:
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22708c
            r2.mo14554h(r8)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22708c
            r2.mo14557k(r7)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22708c
            int r2 = r2.mo14560n()
            r3 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0150
            com.google.ads.interactivemedia.v3.internal.ld r2 = r0.f22721p
            if (r2 != 0) goto L_0x0150
            com.google.ads.interactivemedia.v3.internal.ld r2 = new com.google.ads.interactivemedia.v3.internal.ld
            com.google.ads.interactivemedia.v3.internal.ka r7 = r0.f22712g
            com.google.ads.interactivemedia.v3.internal.kr r4 = r7.mo16113ak(r4, r9)
            r2.<init>(r4)
            r0.f22721p = r2
        L_0x0150:
            if (r3 == 0) goto L_0x0163
            com.google.ads.interactivemedia.v3.internal.lj r2 = r0.f22722q
            if (r2 != 0) goto L_0x0163
            com.google.ads.interactivemedia.v3.internal.lj r2 = new com.google.ads.interactivemedia.v3.internal.lj
            com.google.ads.interactivemedia.v3.internal.ka r3 = r0.f22712g
            com.google.ads.interactivemedia.v3.internal.kr r3 = r3.mo16113ak(r5, r6)
            r2.<init>(r3)
            r0.f22722q = r2
        L_0x0163:
            com.google.ads.interactivemedia.v3.internal.ka r2 = r0.f22712g
            r2.mo16114al()
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22708c
            int r2 = r2.mo14568v()
            int r2 = r2 + -5
            r0.f22716k = r2
            r0.f22713h = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7088lf.mo16112h(com.google.ads.interactivemedia.v3.internal.jv, com.google.ads.interactivemedia.v3.internal.kl):int");
    }
}

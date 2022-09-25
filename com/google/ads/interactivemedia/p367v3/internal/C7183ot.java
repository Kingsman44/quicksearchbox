package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ot */
/* compiled from: PG */
public final class C7183ot implements C7171oh {

    /* renamed from: a */
    private final String f23374a;

    /* renamed from: b */
    private final aee f23375b;

    /* renamed from: c */
    private final aed f23376c;

    /* renamed from: d */
    private C7073kr f23377d;

    /* renamed from: e */
    private String f23378e;

    /* renamed from: f */
    private C6864cy f23379f;

    /* renamed from: g */
    private int f23380g;

    /* renamed from: h */
    private int f23381h;

    /* renamed from: i */
    private int f23382i;

    /* renamed from: j */
    private int f23383j;

    /* renamed from: k */
    private long f23384k;

    /* renamed from: l */
    private boolean f23385l;

    /* renamed from: m */
    private int f23386m;

    /* renamed from: n */
    private int f23387n;

    /* renamed from: o */
    private int f23388o;

    /* renamed from: p */
    private boolean f23389p;

    /* renamed from: q */
    private long f23390q;

    /* renamed from: r */
    private int f23391r;

    /* renamed from: s */
    private long f23392s;

    /* renamed from: t */
    private int f23393t;

    /* renamed from: u */
    private String f23394u;

    public C7183ot(String str) {
        this.f23374a = str;
        aee aee = new aee(1024);
        this.f23375b = aee;
        this.f23376c = new aed(aee.mo14555i());
    }

    /* renamed from: f */
    private final int m21410f(aed aed) {
        int c = aed.mo14526c();
        C6960gm b = C6961gn.m20511b(aed, true);
        this.f23394u = b.f22202c;
        this.f23391r = b.f22200a;
        this.f23393t = b.f22201b;
        return c - aed.mo14526c();
    }

    /* renamed from: g */
    private static long m21411g(aed aed) {
        return (long) aed.mo14532i((aed.mo14532i(2) + 1) * 8);
    }

    /* renamed from: a */
    public final void mo16215a() {
        this.f23380g = 0;
        this.f23385l = false;
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23377d = kaVar.mo16113ak(pqVar.mo16279b(), 1);
        this.f23378e = pqVar.mo16280c();
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23384k = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0156, code lost:
        if (r13.f23385l == false) goto L_0x01b2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16218d(com.google.ads.interactivemedia.p367v3.internal.aee r14) {
        /*
            r13 = this;
            com.google.ads.interactivemedia.v3.internal.kr r0 = r13.f23377d
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r0)
        L_0x0005:
            int r0 = r14.mo14550d()
            if (r0 <= 0) goto L_0x0217
            int r0 = r13.f23380g
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x020d
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x01f7
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L_0x01ca
            int r0 = r14.mo14550d()
            int r3 = r13.f23382i
            int r6 = r13.f23381h
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.ads.interactivemedia.v3.internal.aed r3 = r13.f23376c
            byte[] r3 = r3.f20421a
            int r6 = r13.f23381h
            r14.mo14559m(r3, r6, r0)
            int r3 = r13.f23381h
            int r3 = r3 + r0
            r13.f23381h = r3
            int r0 = r13.f23382i
            if (r3 != r0) goto L_0x0005
            com.google.ads.interactivemedia.v3.internal.aed r0 = r13.f23376c
            r0.mo14528e(r4)
            com.google.ads.interactivemedia.v3.internal.aed r0 = r13.f23376c
            boolean r3 = r0.mo14531h()
            if (r3 != 0) goto L_0x0154
            r13.f23385l = r2
            int r3 = r0.mo14532i(r2)
            if (r3 != r2) goto L_0x0055
            int r3 = r0.mo14532i(r2)
            r6 = 1
            goto L_0x0057
        L_0x0055:
            r6 = r3
            r3 = 0
        L_0x0057:
            r13.f23386m = r3
            if (r3 != 0) goto L_0x014e
            if (r6 != r2) goto L_0x0061
            m21411g(r0)
            r6 = 1
        L_0x0061:
            boolean r3 = r0.mo14531h()
            if (r3 == 0) goto L_0x0148
            r3 = 6
            int r7 = r0.mo14532i(r3)
            r13.f23387n = r7
            r7 = 4
            int r8 = r0.mo14532i(r7)
            int r9 = r0.mo14532i(r1)
            if (r8 != 0) goto L_0x0142
            if (r9 != 0) goto L_0x0142
            if (r6 != 0) goto L_0x00d7
            int r8 = r0.mo14527d()
            int r9 = r13.m21410f(r0)
            r0.mo14528e(r8)
            int r8 = r9 + 7
            int r8 = r8 / r5
            byte[] r8 = new byte[r8]
            r0.mo14536m(r8, r9)
            com.google.ads.interactivemedia.v3.internal.cx r9 = new com.google.ads.interactivemedia.v3.internal.cx
            r9.<init>()
            java.lang.String r10 = r13.f23378e
            r9.mo15617S(r10)
            java.lang.String r10 = "audio/mp4a-latm"
            r9.mo15630ae(r10)
            java.lang.String r10 = r13.f23394u
            r9.mo15607I(r10)
            int r10 = r13.f23393t
            r9.mo15606H(r10)
            int r10 = r13.f23391r
            r9.mo15631af(r10)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r9.mo15618T(r8)
            java.lang.String r8 = r13.f23374a
            r9.mo15620V(r8)
            com.google.ads.interactivemedia.v3.internal.cy r8 = r9.mo15625a()
            com.google.ads.interactivemedia.v3.internal.cy r9 = r13.f23379f
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x00e4
            r13.f23379f = r8
            int r9 = r8.f21826z
            long r9 = (long) r9
            r11 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r11 = r11 / r9
            r13.f23392s = r11
            com.google.ads.interactivemedia.v3.internal.kr r9 = r13.f23377d
            r9.mo16102a(r8)
            goto L_0x00e4
        L_0x00d7:
            long r8 = m21411g(r0)
            int r9 = (int) r8
            int r8 = r13.m21410f(r0)
            int r9 = r9 - r8
            r0.mo14530g(r9)
        L_0x00e4:
            int r8 = r0.mo14532i(r1)
            r13.f23388o = r8
            if (r8 == 0) goto L_0x010f
            if (r8 == r2) goto L_0x0109
            if (r8 == r1) goto L_0x0105
            if (r8 == r7) goto L_0x0105
            r1 = 5
            if (r8 == r1) goto L_0x0105
            if (r8 == r3) goto L_0x0101
            r1 = 7
            if (r8 != r1) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L_0x0101:
            r0.mo14530g(r2)
            goto L_0x0112
        L_0x0105:
            r0.mo14530g(r3)
            goto L_0x0112
        L_0x0109:
            r1 = 9
            r0.mo14530g(r1)
            goto L_0x0112
        L_0x010f:
            r0.mo14530g(r5)
        L_0x0112:
            boolean r1 = r0.mo14531h()
            r13.f23389p = r1
            r7 = 0
            r13.f23390q = r7
            if (r1 == 0) goto L_0x0138
            if (r6 == r2) goto L_0x0132
        L_0x0120:
            boolean r1 = r0.mo14531h()
            long r2 = r13.f23390q
            long r2 = r2 << r5
            int r6 = r0.mo14532i(r5)
            long r6 = (long) r6
            long r2 = r2 + r6
            r13.f23390q = r2
            if (r1 != 0) goto L_0x0120
            goto L_0x0138
        L_0x0132:
            long r1 = m21411g(r0)
            r13.f23390q = r1
        L_0x0138:
            boolean r1 = r0.mo14531h()
            if (r1 == 0) goto L_0x0159
            r0.mo14530g(r5)
            goto L_0x0159
        L_0x0142:
            com.google.ads.interactivemedia.v3.internal.dt r14 = new com.google.ads.interactivemedia.v3.internal.dt
            r14.<init>()
            throw r14
        L_0x0148:
            com.google.ads.interactivemedia.v3.internal.dt r14 = new com.google.ads.interactivemedia.v3.internal.dt
            r14.<init>()
            throw r14
        L_0x014e:
            com.google.ads.interactivemedia.v3.internal.dt r14 = new com.google.ads.interactivemedia.v3.internal.dt
            r14.<init>()
            throw r14
        L_0x0154:
            boolean r1 = r13.f23385l
            if (r1 != 0) goto L_0x0159
            goto L_0x01b2
        L_0x0159:
            int r1 = r13.f23386m
            if (r1 != 0) goto L_0x01c4
            int r1 = r13.f23387n
            if (r1 != 0) goto L_0x01be
            int r1 = r13.f23388o
            if (r1 != 0) goto L_0x01b8
            r1 = 0
        L_0x0166:
            int r2 = r0.mo14532i(r5)
            int r10 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01b6
            int r1 = r0.mo14527d()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x0180
            com.google.ads.interactivemedia.v3.internal.aee r2 = r13.f23375b
            int r1 = r1 >> 3
            r2.mo14554h(r1)
            goto L_0x0190
        L_0x0180:
            com.google.ads.interactivemedia.v3.internal.aee r1 = r13.f23375b
            byte[] r1 = r1.mo14555i()
            int r2 = r10 * 8
            r0.mo14536m(r1, r2)
            com.google.ads.interactivemedia.v3.internal.aee r1 = r13.f23375b
            r1.mo14554h(r4)
        L_0x0190:
            com.google.ads.interactivemedia.v3.internal.kr r1 = r13.f23377d
            com.google.ads.interactivemedia.v3.internal.aee r2 = r13.f23375b
            r1.mo16105d(r2, r10)
            com.google.ads.interactivemedia.v3.internal.kr r6 = r13.f23377d
            long r7 = r13.f23384k
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo16103b(r7, r9, r10, r11, r12)
            long r1 = r13.f23384k
            long r5 = r13.f23392s
            long r1 = r1 + r5
            r13.f23384k = r1
            boolean r1 = r13.f23389p
            if (r1 == 0) goto L_0x01b2
            long r1 = r13.f23390q
            int r2 = (int) r1
            r0.mo14530g(r2)
        L_0x01b2:
            r13.f23380g = r4
            goto L_0x0005
        L_0x01b6:
            r1 = r10
            goto L_0x0166
        L_0x01b8:
            com.google.ads.interactivemedia.v3.internal.dt r14 = new com.google.ads.interactivemedia.v3.internal.dt
            r14.<init>()
            throw r14
        L_0x01be:
            com.google.ads.interactivemedia.v3.internal.dt r14 = new com.google.ads.interactivemedia.v3.internal.dt
            r14.<init>()
            throw r14
        L_0x01c4:
            com.google.ads.interactivemedia.v3.internal.dt r14 = new com.google.ads.interactivemedia.v3.internal.dt
            r14.<init>()
            throw r14
        L_0x01ca:
            int r0 = r13.f23383j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r5
            int r2 = r14.mo14560n()
            r0 = r0 | r2
            r13.f23382i = r0
            com.google.ads.interactivemedia.v3.internal.aee r2 = r13.f23375b
            byte[] r2 = r2.mo14555i()
            int r2 = r2.length
            if (r0 <= r2) goto L_0x01f1
            int r0 = r13.f23382i
            com.google.ads.interactivemedia.v3.internal.aee r2 = r13.f23375b
            r2.mo14547a(r0)
            com.google.ads.interactivemedia.v3.internal.aed r0 = r13.f23376c
            com.google.ads.interactivemedia.v3.internal.aee r2 = r13.f23375b
            byte[] r2 = r2.mo14555i()
            r0.mo14524a(r2)
        L_0x01f1:
            r13.f23381h = r4
            r13.f23380g = r1
            goto L_0x0005
        L_0x01f7:
            int r0 = r14.mo14560n()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0207
            r13.f23383j = r0
            r13.f23380g = r3
            goto L_0x0005
        L_0x0207:
            if (r0 == r1) goto L_0x0005
            r13.f23380g = r4
            goto L_0x0005
        L_0x020d:
            int r0 = r14.mo14560n()
            if (r0 != r1) goto L_0x0005
            r13.f23380g = r2
            goto L_0x0005
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7183ot.mo16218d(com.google.ads.interactivemedia.v3.internal.aee):void");
    }

    /* renamed from: e */
    public final void mo16219e() {
    }
}

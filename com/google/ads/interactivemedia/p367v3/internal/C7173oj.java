package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oj */
/* compiled from: PG */
public final class C7173oj implements C7171oh {

    /* renamed from: c */
    private static final double[] f23249c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f23250a;

    /* renamed from: b */
    private C7073kr f23251b;

    /* renamed from: d */
    private final C7209ps f23252d;

    /* renamed from: e */
    private final aee f23253e;

    /* renamed from: f */
    private final C7185ov f23254f;

    /* renamed from: g */
    private final boolean[] f23255g;

    /* renamed from: h */
    private final C7172oi f23256h;

    /* renamed from: i */
    private long f23257i;

    /* renamed from: j */
    private boolean f23258j;

    /* renamed from: k */
    private boolean f23259k;

    /* renamed from: l */
    private long f23260l;

    /* renamed from: m */
    private long f23261m;

    /* renamed from: n */
    private long f23262n;

    /* renamed from: o */
    private long f23263o;

    /* renamed from: p */
    private boolean f23264p;

    /* renamed from: q */
    private boolean f23265q;

    public C7173oj() {
        this((C7209ps) null);
    }

    /* renamed from: a */
    public final void mo16215a() {
        aec.m18366d(this.f23255g);
        this.f23256h.mo16225a();
        C7185ov ovVar = this.f23254f;
        if (ovVar != null) {
            ovVar.mo16250a();
        }
        this.f23257i = 0;
        this.f23258j = false;
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23250a = pqVar.mo16280c();
        this.f23251b = kaVar.mo16113ak(pqVar.mo16279b(), 2);
        C7209ps psVar = this.f23252d;
        if (psVar != null) {
            psVar.mo16281a(kaVar, pqVar);
        }
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23261m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16218d(com.google.ads.interactivemedia.p367v3.internal.aee r21) {
        /*
            r20 = this;
            r0 = r20
            com.google.ads.interactivemedia.v3.internal.kr r1 = r0.f23251b
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r1)
            int r1 = r21.mo14553g()
            int r2 = r21.mo14551e()
            byte[] r3 = r21.mo14555i()
            long r4 = r0.f23257i
            int r6 = r21.mo14550d()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f23257i = r4
            com.google.ads.interactivemedia.v3.internal.kr r4 = r0.f23251b
            int r5 = r21.mo14550d()
            r6 = r21
            r4.mo16105d(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f23255g
            int r4 = com.google.ads.interactivemedia.p367v3.internal.aec.m18365c(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f23259k
            if (r4 != 0) goto L_0x0039
            com.google.ads.interactivemedia.v3.internal.oi r4 = r0.f23256h
            r4.mo16227c(r3, r1, r2)
        L_0x0039:
            com.google.ads.interactivemedia.v3.internal.ov r4 = r0.f23254f
            if (r4 == 0) goto L_0x0040
            r4.mo16253d(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            int r5 = r4 + 3
            byte[] r7 = r21.mo14555i()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f23259k
            if (r9 != 0) goto L_0x012f
            if (r8 <= 0) goto L_0x0058
            com.google.ads.interactivemedia.v3.internal.oi r9 = r0.f23256h
            r9.mo16227c(r3, r1, r4)
        L_0x0058:
            if (r8 >= 0) goto L_0x005c
            int r9 = -r8
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.google.ads.interactivemedia.v3.internal.oi r14 = r0.f23256h
            boolean r9 = r14.mo16226b(r7, r9)
            if (r9 == 0) goto L_0x012f
            com.google.ads.interactivemedia.v3.internal.oi r9 = r0.f23256h
            java.lang.String r14 = r0.f23250a
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r14)
            byte[] r15 = r9.f23247c
            int r10 = r9.f23245a
            byte[] r10 = java.util.Arrays.copyOf(r15, r10)
            r11 = 4
            byte r15 = r10[r11]
            r16 = 5
            byte r12 = r10[r16]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r11
            int r17 = r12 >> 4
            r15 = r15 | r17
            r12 = r12 & 15
            r13 = 8
            int r12 = r12 << r13
            r18 = 6
            byte r13 = r10[r18]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r12 = r12 | r13
            r13 = 7
            byte r11 = r10[r13]
            r11 = r11 & 240(0xf0, float:3.36E-43)
            r13 = 4
            int r11 = r11 >> r13
            r13 = 2
            if (r11 == r13) goto L_0x00af
            r13 = 3
            if (r11 == r13) goto L_0x00a9
            r13 = 4
            if (r11 == r13) goto L_0x00a3
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b6
        L_0x00a3:
            int r11 = r12 * 121
            float r11 = (float) r11
            int r13 = r15 * 100
            goto L_0x00b4
        L_0x00a9:
            int r11 = r12 * 16
            float r11 = (float) r11
            int r13 = r15 * 9
            goto L_0x00b4
        L_0x00af:
            int r11 = r12 * 4
            float r11 = (float) r11
            int r13 = r15 * 3
        L_0x00b4:
            float r13 = (float) r13
            float r11 = r11 / r13
        L_0x00b6:
            com.google.ads.interactivemedia.v3.internal.cx r13 = new com.google.ads.interactivemedia.v3.internal.cx
            r13.<init>()
            r13.mo15617S(r14)
            java.lang.String r14 = "video/mpeg2"
            r13.mo15630ae(r14)
            r13.mo15635aj(r15)
            r13.mo15615Q(r12)
            r13.mo15626aa(r11)
            java.util.List r11 = java.util.Collections.singletonList(r10)
            r13.mo15618T(r11)
            com.google.ads.interactivemedia.v3.internal.cy r11 = r13.mo15625a()
            r12 = 7
            byte r12 = r10[r12]
            r12 = r12 & 15
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x010f
            r13 = 8
            if (r12 >= r13) goto L_0x010f
            double[] r13 = f23249c
            r12 = r13[r12]
            int r9 = r9.f23246b
            int r9 = r9 + 9
            byte r9 = r10[r9]
            r10 = r9 & 96
            int r10 = r10 >> 5
            r9 = r9 & 31
            if (r10 == r9) goto L_0x0107
            double r14 = (double) r10
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r14)
            double r14 = r14 + r18
            int r9 = r9 + 1
            double r9 = (double) r9
            java.lang.Double.isNaN(r9)
            double r14 = r14 / r9
            double r12 = r12 * r14
        L_0x0107:
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r9 = r9 / r12
            long r9 = (long) r9
            goto L_0x0111
        L_0x010f:
            r9 = 0
        L_0x0111:
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r11, r9)
            com.google.ads.interactivemedia.v3.internal.kr r10 = r0.f23251b
            java.lang.Object r11 = r9.first
            com.google.ads.interactivemedia.v3.internal.cy r11 = (com.google.ads.interactivemedia.p367v3.internal.C6864cy) r11
            r10.mo16102a(r11)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            r0.f23260l = r9
            r9 = 1
            r0.f23259k = r9
        L_0x012f:
            com.google.ads.interactivemedia.v3.internal.ov r9 = r0.f23254f
            if (r9 == 0) goto L_0x0177
            if (r8 <= 0) goto L_0x013a
            r9.mo16253d(r3, r1, r4)
            r1 = 0
            goto L_0x013b
        L_0x013a:
            int r1 = -r8
        L_0x013b:
            com.google.ads.interactivemedia.v3.internal.ov r8 = r0.f23254f
            boolean r1 = r8.mo16254e(r1)
            if (r1 == 0) goto L_0x0161
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23254f
            byte[] r8 = r1.f23407a
            int r1 = r1.f23408b
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aec.m18363a(r8, r1)
            com.google.ads.interactivemedia.v3.internal.aee r8 = r0.f23253e
            int r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            com.google.ads.interactivemedia.v3.internal.ov r9 = r0.f23254f
            byte[] r9 = r9.f23407a
            r8.mo14549c(r9, r1)
            com.google.ads.interactivemedia.v3.internal.ps r1 = r0.f23252d
            long r8 = r0.f23263o
            com.google.ads.interactivemedia.v3.internal.aee r10 = r0.f23253e
            r1.mo16282b(r8, r10)
        L_0x0161:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x0177
            byte[] r7 = r21.mo14555i()
            int r8 = r4 + 2
            byte r7 = r7[r8]
            r8 = 1
            if (r7 != r8) goto L_0x0175
            com.google.ads.interactivemedia.v3.internal.ov r7 = r0.f23254f
            r7.mo16252c(r1)
        L_0x0175:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x0177:
            if (r7 == 0) goto L_0x0186
            r1 = 179(0xb3, float:2.51E-43)
            if (r7 != r1) goto L_0x017e
            goto L_0x0186
        L_0x017e:
            r1 = 184(0xb8, float:2.58E-43)
            if (r7 != r1) goto L_0x01e5
            r1 = 1
            r0.f23264p = r1
            goto L_0x01e5
        L_0x0186:
            int r1 = r2 - r4
            boolean r4 = r0.f23258j
            if (r4 == 0) goto L_0x01ac
            boolean r4 = r0.f23265q
            if (r4 == 0) goto L_0x01ac
            boolean r4 = r0.f23259k
            if (r4 == 0) goto L_0x01ac
            boolean r11 = r0.f23264p
            long r8 = r0.f23257i
            long r12 = r0.f23262n
            com.google.ads.interactivemedia.v3.internal.kr r4 = r0.f23251b
            long r14 = r0.f23263o
            long r8 = r8 - r12
            int r9 = (int) r8
            int r12 = r9 - r1
            r16 = 0
            r8 = r4
            r9 = r14
            r13 = r1
            r14 = r16
            r8.mo16103b(r9, r11, r12, r13, r14)
        L_0x01ac:
            boolean r4 = r0.f23258j
            if (r4 == 0) goto L_0x01b8
            boolean r8 = r0.f23265q
            if (r8 == 0) goto L_0x01b5
            goto L_0x01b8
        L_0x01b5:
            r1 = 0
            r4 = 1
            goto L_0x01de
        L_0x01b8:
            long r8 = r0.f23257i
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.f23262n = r8
            long r8 = r0.f23261m
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x01ca
            goto L_0x01d4
        L_0x01ca:
            if (r4 == 0) goto L_0x01d2
            long r8 = r0.f23263o
            long r12 = r0.f23260l
            long r8 = r8 + r12
            goto L_0x01d4
        L_0x01d2:
            r8 = 0
        L_0x01d4:
            r0.f23263o = r8
            r1 = 0
            r0.f23264p = r1
            r0.f23261m = r10
            r4 = 1
            r0.f23258j = r4
        L_0x01de:
            if (r7 != 0) goto L_0x01e2
            r12 = 1
            goto L_0x01e3
        L_0x01e2:
            r12 = 0
        L_0x01e3:
            r0.f23265q = r12
        L_0x01e5:
            r1 = r5
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7173oj.mo16218d(com.google.ads.interactivemedia.v3.internal.aee):void");
    }

    /* renamed from: e */
    public final void mo16219e() {
    }

    public C7173oj(C7209ps psVar) {
        aee aee;
        this.f23252d = psVar;
        this.f23255g = new boolean[4];
        this.f23256h = new C7172oi();
        if (psVar != null) {
            this.f23254f = new C7185ov(178);
            aee = new aee();
        } else {
            aee = null;
            this.f23254f = null;
        }
        this.f23253e = aee;
    }
}

package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.om */
/* compiled from: PG */
public final class C7176om implements C7171oh {

    /* renamed from: a */
    private static final float[] f23280a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: b */
    private final C7209ps f23281b;

    /* renamed from: c */
    private final aee f23282c;

    /* renamed from: d */
    private final boolean[] f23283d;

    /* renamed from: e */
    private final C7174ok f23284e;

    /* renamed from: f */
    private final C7185ov f23285f;

    /* renamed from: g */
    private C7175ol f23286g;

    /* renamed from: h */
    private long f23287h;

    /* renamed from: i */
    private String f23288i;

    /* renamed from: j */
    private C7073kr f23289j;

    /* renamed from: k */
    private boolean f23290k;

    /* renamed from: l */
    private long f23291l;

    public C7176om() {
        this((C7209ps) null);
    }

    /* renamed from: a */
    public final void mo16215a() {
        aec.m18366d(this.f23283d);
        this.f23284e.mo16228a();
        C7175ol olVar = this.f23286g;
        if (olVar != null) {
            olVar.mo16231a();
        }
        C7185ov ovVar = this.f23285f;
        if (ovVar != null) {
            ovVar.mo16250a();
        }
        this.f23287h = 0;
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23288i = pqVar.mo16280c();
        this.f23289j = kaVar.mo16113ak(pqVar.mo16279b(), 2);
        this.f23286g = new C7175ol(this.f23289j);
        C7209ps psVar = this.f23281b;
        if (psVar != null) {
            psVar.mo16281a(kaVar, pqVar);
        }
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23291l = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d1 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16218d(com.google.ads.interactivemedia.p367v3.internal.aee r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.ads.interactivemedia.v3.internal.ol r1 = r0.f23286g
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r1)
            com.google.ads.interactivemedia.v3.internal.kr r1 = r0.f23289j
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r1)
            int r1 = r19.mo14553g()
            int r2 = r19.mo14551e()
            byte[] r3 = r19.mo14555i()
            long r4 = r0.f23287h
            int r6 = r19.mo14550d()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f23287h = r4
            com.google.ads.interactivemedia.v3.internal.kr r4 = r0.f23289j
            int r5 = r19.mo14550d()
            r6 = r19
            r4.mo16105d(r6, r5)
        L_0x002d:
            boolean[] r4 = r0.f23283d
            int r4 = com.google.ads.interactivemedia.p367v3.internal.aec.m18365c(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x004b
            boolean r4 = r0.f23290k
            if (r4 != 0) goto L_0x003e
            com.google.ads.interactivemedia.v3.internal.ok r4 = r0.f23284e
            r4.mo16230c(r3, r1, r2)
        L_0x003e:
            com.google.ads.interactivemedia.v3.internal.ol r4 = r0.f23286g
            r4.mo16233c(r3, r1, r2)
            com.google.ads.interactivemedia.v3.internal.ov r4 = r0.f23285f
            if (r4 == 0) goto L_0x004a
            r4.mo16253d(r3, r1, r2)
        L_0x004a:
            return
        L_0x004b:
            int r5 = r4 + 3
            byte[] r7 = r19.mo14555i()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f23290k
            if (r9 != 0) goto L_0x0182
            if (r8 <= 0) goto L_0x0062
            com.google.ads.interactivemedia.v3.internal.ok r9 = r0.f23284e
            r9.mo16230c(r3, r1, r4)
        L_0x0062:
            if (r8 >= 0) goto L_0x0066
            int r9 = -r8
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            com.google.ads.interactivemedia.v3.internal.ok r12 = r0.f23284e
            boolean r9 = r12.mo16229b(r7, r9)
            if (r9 == 0) goto L_0x0182
            com.google.ads.interactivemedia.v3.internal.kr r9 = r0.f23289j
            com.google.ads.interactivemedia.v3.internal.ok r12 = r0.f23284e
            int r13 = r12.f23268b
            java.lang.String r14 = r0.f23288i
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r14)
            byte[] r15 = r12.f23269c
            int r12 = r12.f23267a
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.ads.interactivemedia.v3.internal.aed r15 = new com.google.ads.interactivemedia.v3.internal.aed
            r15.<init>(r12)
            r15.mo14534k(r13)
            r13 = 4
            r15.mo14534k(r13)
            r15.mo14529f()
            r10 = 8
            r15.mo14530g(r10)
            boolean r16 = r15.mo14531h()
            r11 = 3
            if (r16 == 0) goto L_0x00a3
            r15.mo14530g(r13)
            r15.mo14530g(r11)
        L_0x00a3:
            int r13 = r15.mo14532i(r13)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r10 = "H263Reader"
            r17 = r5
            r5 = 15
            if (r13 != r5) goto L_0x00c8
            r5 = 8
            int r13 = r15.mo14532i(r5)
            int r5 = r15.mo14532i(r5)
            if (r5 != 0) goto L_0x00c3
            android.util.Log.w(r10, r11)
            goto L_0x00d5
        L_0x00c3:
            float r11 = (float) r13
            float r5 = (float) r5
            float r16 = r11 / r5
            goto L_0x00cf
        L_0x00c8:
            r5 = 7
            if (r13 >= r5) goto L_0x00d2
            float[] r5 = f23280a
            r16 = r5[r13]
        L_0x00cf:
            r5 = r16
            goto L_0x00d7
        L_0x00d2:
            android.util.Log.w(r10, r11)
        L_0x00d5:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00d7:
            boolean r11 = r15.mo14531h()
            r13 = 2
            if (r11 == 0) goto L_0x0111
            r15.mo14530g(r13)
            r11 = 1
            r15.mo14530g(r11)
            boolean r11 = r15.mo14531h()
            if (r11 == 0) goto L_0x0111
            r11 = 15
            r15.mo14530g(r11)
            r15.mo14529f()
            r15.mo14530g(r11)
            r15.mo14529f()
            r15.mo14530g(r11)
            r15.mo14529f()
            r13 = 3
            r15.mo14530g(r13)
            r13 = 11
            r15.mo14530g(r13)
            r15.mo14529f()
            r15.mo14530g(r11)
            r15.mo14529f()
        L_0x0111:
            r11 = 2
            int r11 = r15.mo14532i(r11)
            if (r11 == 0) goto L_0x011d
            java.lang.String r11 = "Unhandled video object layer shape"
            android.util.Log.w(r10, r11)
        L_0x011d:
            r15.mo14529f()
            r11 = 16
            int r11 = r15.mo14532i(r11)
            r15.mo14529f()
            boolean r13 = r15.mo14531h()
            if (r13 == 0) goto L_0x0144
            if (r11 != 0) goto L_0x0137
            java.lang.String r11 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r10, r11)
            goto L_0x0144
        L_0x0137:
            int r11 = r11 + -1
            r10 = 0
        L_0x013a:
            if (r11 <= 0) goto L_0x0141
            int r10 = r10 + 1
            int r11 = r11 >> 1
            goto L_0x013a
        L_0x0141:
            r15.mo14530g(r10)
        L_0x0144:
            r15.mo14529f()
            r10 = 13
            int r11 = r15.mo14532i(r10)
            r15.mo14529f()
            int r10 = r15.mo14532i(r10)
            r15.mo14529f()
            r15.mo14529f()
            com.google.ads.interactivemedia.v3.internal.cx r13 = new com.google.ads.interactivemedia.v3.internal.cx
            r13.<init>()
            r13.mo15617S(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.mo15630ae(r14)
            r13.mo15635aj(r11)
            r13.mo15615Q(r10)
            r13.mo15626aa(r5)
            java.util.List r5 = java.util.Collections.singletonList(r12)
            r13.mo15618T(r5)
            com.google.ads.interactivemedia.v3.internal.cy r5 = r13.mo15625a()
            r9.mo16102a(r5)
            r5 = 1
            r0.f23290k = r5
            goto L_0x0184
        L_0x0182:
            r17 = r5
        L_0x0184:
            com.google.ads.interactivemedia.v3.internal.ol r5 = r0.f23286g
            r5.mo16233c(r3, r1, r4)
            com.google.ads.interactivemedia.v3.internal.ov r5 = r0.f23285f
            if (r5 == 0) goto L_0x01d1
            if (r8 <= 0) goto L_0x0194
            r5.mo16253d(r3, r1, r4)
            r10 = 0
            goto L_0x0195
        L_0x0194:
            int r10 = -r8
        L_0x0195:
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23285f
            boolean r1 = r1.mo16254e(r10)
            if (r1 == 0) goto L_0x01bb
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23285f
            byte[] r5 = r1.f23407a
            int r1 = r1.f23408b
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aec.m18363a(r5, r1)
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23282c
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            com.google.ads.interactivemedia.v3.internal.ov r8 = r0.f23285f
            byte[] r8 = r8.f23407a
            r5.mo14549c(r8, r1)
            com.google.ads.interactivemedia.v3.internal.ps r1 = r0.f23281b
            long r8 = r0.f23291l
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23282c
            r1.mo16282b(r8, r5)
        L_0x01bb:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x01d1
            byte[] r5 = r19.mo14555i()
            int r7 = r4 + 2
            byte r5 = r5[r7]
            r7 = 1
            if (r5 != r7) goto L_0x01cf
            com.google.ads.interactivemedia.v3.internal.ov r5 = r0.f23285f
            r5.mo16252c(r1)
        L_0x01cf:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x01d1:
            int r1 = r2 - r4
            long r4 = r0.f23287h
            com.google.ads.interactivemedia.v3.internal.ol r8 = r0.f23286g
            long r9 = (long) r1
            long r4 = r4 - r9
            boolean r9 = r0.f23290k
            r8.mo16234d(r4, r1, r9)
            com.google.ads.interactivemedia.v3.internal.ol r1 = r0.f23286g
            long r4 = r0.f23291l
            r1.mo16232b(r7, r4)
            r1 = r17
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7176om.mo16218d(com.google.ads.interactivemedia.v3.internal.aee):void");
    }

    /* renamed from: e */
    public final void mo16219e() {
    }

    public C7176om(C7209ps psVar) {
        this.f23281b = psVar;
        this.f23283d = new boolean[4];
        this.f23284e = new C7174ok();
        this.f23285f = new C7185ov(178);
        this.f23282c = new aee();
    }
}

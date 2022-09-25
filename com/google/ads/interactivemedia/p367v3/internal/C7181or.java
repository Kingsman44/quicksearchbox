package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.or */
/* compiled from: PG */
public final class C7181or implements C7171oh {

    /* renamed from: a */
    private final C7196pf f23354a;

    /* renamed from: b */
    private String f23355b;

    /* renamed from: c */
    private C7073kr f23356c;

    /* renamed from: d */
    private C7180oq f23357d;

    /* renamed from: e */
    private boolean f23358e;

    /* renamed from: f */
    private final boolean[] f23359f = new boolean[3];

    /* renamed from: g */
    private final C7185ov f23360g = new C7185ov(32);

    /* renamed from: h */
    private final C7185ov f23361h = new C7185ov(33);

    /* renamed from: i */
    private final C7185ov f23362i = new C7185ov(34);

    /* renamed from: j */
    private final C7185ov f23363j = new C7185ov(39);

    /* renamed from: k */
    private final C7185ov f23364k = new C7185ov(40);

    /* renamed from: l */
    private long f23365l;

    /* renamed from: m */
    private long f23366m;

    /* renamed from: n */
    private final aee f23367n = new aee();

    public C7181or(C7196pf pfVar) {
        this.f23354a = pfVar;
    }

    /* renamed from: f */
    private final void m21399f(byte[] bArr, int i, int i2) {
        this.f23357d.mo16248c(bArr, i, i2);
        if (!this.f23358e) {
            this.f23360g.mo16253d(bArr, i, i2);
            this.f23361h.mo16253d(bArr, i, i2);
            this.f23362i.mo16253d(bArr, i, i2);
        }
        this.f23363j.mo16253d(bArr, i, i2);
        this.f23364k.mo16253d(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo16215a() {
        this.f23365l = 0;
        aec.m18366d(this.f23359f);
        this.f23360g.mo16250a();
        this.f23361h.mo16250a();
        this.f23362i.mo16250a();
        this.f23363j.mo16250a();
        this.f23364k.mo16250a();
        C7180oq oqVar = this.f23357d;
        if (oqVar != null) {
            oqVar.mo16246a();
        }
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23355b = pqVar.mo16280c();
        this.f23356c = kaVar.mo16113ak(pqVar.mo16279b(), 2);
        this.f23357d = new C7180oq(this.f23356c);
        this.f23354a.mo16272a(kaVar, pqVar);
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23366m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16218d(com.google.ads.interactivemedia.p367v3.internal.aee r29) {
        /*
            r28 = this;
            r0 = r28
            com.google.ads.interactivemedia.v3.internal.kr r1 = r0.f23356c
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r1)
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
        L_0x0009:
            int r1 = r29.mo14550d()
            if (r1 <= 0) goto L_0x036c
            int r1 = r29.mo14553g()
            int r2 = r29.mo14551e()
            byte[] r3 = r29.mo14555i()
            long r4 = r0.f23365l
            int r6 = r29.mo14550d()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f23365l = r4
            com.google.ads.interactivemedia.v3.internal.kr r4 = r0.f23356c
            int r5 = r29.mo14550d()
            r6 = r29
            r4.mo16105d(r6, r5)
        L_0x0030:
            if (r1 >= r2) goto L_0x0009
            boolean[] r4 = r0.f23359f
            int r4 = com.google.ads.interactivemedia.p367v3.internal.aec.m18365c(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x0369
            int r5 = r4 + 3
            byte r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r4 - r1
            if (r9 <= 0) goto L_0x0049
            r0.m21399f(r3, r1, r4)
        L_0x0049:
            int r12 = r2 - r4
            long r10 = r0.f23365l
            long r13 = (long) r12
            long r10 = r10 - r13
            if (r9 >= 0) goto L_0x0053
            int r4 = -r9
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            long r13 = r0.f23366m
            com.google.ads.interactivemedia.v3.internal.oq r9 = r0.f23357d
            boolean r15 = r0.f23358e
            r9.mo16249d(r10, r12, r15)
            boolean r9 = r0.f23358e
            if (r9 != 0) goto L_0x02d0
            com.google.ads.interactivemedia.v3.internal.ov r9 = r0.f23360g
            r9.mo16254e(r4)
            com.google.ads.interactivemedia.v3.internal.ov r9 = r0.f23361h
            r9.mo16254e(r4)
            com.google.ads.interactivemedia.v3.internal.ov r9 = r0.f23362i
            r9.mo16254e(r4)
            com.google.ads.interactivemedia.v3.internal.ov r9 = r0.f23360g
            boolean r9 = r9.mo16251b()
            if (r9 == 0) goto L_0x02d0
            com.google.ads.interactivemedia.v3.internal.ov r9 = r0.f23361h
            boolean r9 = r9.mo16251b()
            if (r9 == 0) goto L_0x02d0
            com.google.ads.interactivemedia.v3.internal.ov r9 = r0.f23362i
            boolean r9 = r9.mo16251b()
            if (r9 == 0) goto L_0x02d0
            com.google.ads.interactivemedia.v3.internal.kr r9 = r0.f23356c
            java.lang.String r15 = r0.f23355b
            com.google.ads.interactivemedia.v3.internal.ov r8 = r0.f23360g
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23361h
            r18 = r5
            com.google.ads.interactivemedia.v3.internal.ov r5 = r0.f23362i
            int r6 = r8.f23408b
            r19 = r2
            int r2 = r1.f23408b
            int r2 = r2 + r6
            r20 = r3
            int r3 = r5.f23408b
            int r2 = r2 + r3
            byte[] r2 = new byte[r2]
            byte[] r3 = r8.f23407a
            r21 = r7
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r2, r7, r6)
            byte[] r3 = r1.f23407a
            int r6 = r8.f23408b
            r17 = r12
            int r12 = r1.f23408b
            java.lang.System.arraycopy(r3, r7, r2, r6, r12)
            byte[] r3 = r5.f23407a
            int r6 = r8.f23408b
            int r8 = r1.f23408b
            int r6 = r6 + r8
            int r5 = r5.f23408b
            java.lang.System.arraycopy(r3, r7, r2, r6, r5)
            com.google.ads.interactivemedia.v3.internal.aef r3 = new com.google.ads.interactivemedia.v3.internal.aef
            byte[] r5 = r1.f23407a
            int r1 = r1.f23408b
            r3.<init>(r5, r7, r1)
            r1 = 44
            r3.mo14575c(r1)
            r1 = 3
            int r5 = r3.mo14578f(r1)
            r3.mo14574b()
            r6 = 88
            r3.mo14575c(r6)
            r6 = 8
            r3.mo14575c(r6)
            r8 = 0
            r12 = 0
        L_0x00e3:
            if (r8 >= r5) goto L_0x00f8
            boolean r22 = r3.mo14577e()
            if (r22 == 0) goto L_0x00ed
            int r12 = r12 + 89
        L_0x00ed:
            boolean r22 = r3.mo14577e()
            if (r22 == 0) goto L_0x00f5
            int r12 = r12 + 8
        L_0x00f5:
            int r8 = r8 + 1
            goto L_0x00e3
        L_0x00f8:
            r3.mo14575c(r12)
            if (r5 <= 0) goto L_0x0103
            int r8 = 8 - r5
            int r8 = r8 + r8
            r3.mo14575c(r8)
        L_0x0103:
            r3.mo14580h()
            int r8 = r3.mo14580h()
            if (r8 != r1) goto L_0x0110
            r3.mo14574b()
            r8 = 3
        L_0x0110:
            int r12 = r3.mo14580h()
            int r22 = r3.mo14580h()
            boolean r23 = r3.mo14577e()
            r7 = 2
            if (r23 == 0) goto L_0x014c
            int r23 = r3.mo14580h()
            int r24 = r3.mo14580h()
            int r25 = r3.mo14580h()
            int r26 = r3.mo14580h()
            r6 = 1
            if (r8 == r6) goto L_0x0139
            if (r8 != r7) goto L_0x0136
            r8 = 2
            goto L_0x0139
        L_0x0136:
            r27 = 1
            goto L_0x013b
        L_0x0139:
            r27 = 2
        L_0x013b:
            if (r8 != r6) goto L_0x013f
            r6 = 2
            goto L_0x0140
        L_0x013f:
            r6 = 1
        L_0x0140:
            int r23 = r23 + r24
            int r27 = r27 * r23
            int r12 = r12 - r27
            int r25 = r25 + r26
            int r6 = r6 * r25
            int r22 = r22 - r6
        L_0x014c:
            r6 = r22
            r3.mo14580h()
            r3.mo14580h()
            int r8 = r3.mo14580h()
            boolean r7 = r3.mo14577e()
            r1 = 1
            if (r7 == r1) goto L_0x0161
            r1 = r5
            goto L_0x0162
        L_0x0161:
            r1 = 0
        L_0x0162:
            if (r1 > r5) goto L_0x0170
            r3.mo14580h()
            r3.mo14580h()
            r3.mo14580h()
            int r1 = r1 + 1
            goto L_0x0162
        L_0x0170:
            r3.mo14580h()
            r3.mo14580h()
            r3.mo14580h()
            r3.mo14580h()
            r3.mo14580h()
            r3.mo14580h()
            boolean r1 = r3.mo14577e()
            if (r1 == 0) goto L_0x01d4
            boolean r1 = r3.mo14577e()
            if (r1 == 0) goto L_0x01d4
            r1 = 0
        L_0x018f:
            r5 = 4
            if (r1 >= r5) goto L_0x01d4
            r7 = 0
        L_0x0193:
            r5 = 6
            if (r7 >= r5) goto L_0x01ce
            boolean r5 = r3.mo14577e()
            if (r5 != 0) goto L_0x01a5
            r3.mo14580h()
            r25 = r10
            r5 = 3
            r24 = 4
            goto L_0x01c5
        L_0x01a5:
            int r5 = r1 + r1
            r24 = 4
            int r5 = r5 + 4
            r25 = r10
            r10 = 1
            int r5 = r10 << r5
            r11 = 64
            int r5 = java.lang.Math.min(r11, r5)
            if (r1 <= r10) goto L_0x01bb
            r3.mo14581i()
        L_0x01bb:
            r10 = 0
        L_0x01bc:
            if (r10 >= r5) goto L_0x01c4
            r3.mo14581i()
            int r10 = r10 + 1
            goto L_0x01bc
        L_0x01c4:
            r5 = 3
        L_0x01c5:
            if (r1 != r5) goto L_0x01c9
            r10 = 3
            goto L_0x01ca
        L_0x01c9:
            r10 = 1
        L_0x01ca:
            int r7 = r7 + r10
            r10 = r25
            goto L_0x0193
        L_0x01ce:
            r25 = r10
            r5 = 3
            int r1 = r1 + 1
            goto L_0x018f
        L_0x01d4:
            r25 = r10
            r1 = 2
            r3.mo14575c(r1)
            boolean r1 = r3.mo14577e()
            if (r1 == 0) goto L_0x01ee
            r1 = 8
            r3.mo14575c(r1)
            r3.mo14580h()
            r3.mo14580h()
            r3.mo14574b()
        L_0x01ee:
            int r1 = r3.mo14580h()
            r5 = 0
            r7 = 0
            r10 = 0
        L_0x01f5:
            if (r5 >= r1) goto L_0x0242
            if (r5 == 0) goto L_0x01fd
            boolean r7 = r3.mo14577e()
        L_0x01fd:
            if (r7 == 0) goto L_0x0217
            r3.mo14574b()
            r3.mo14580h()
            r11 = 0
        L_0x0206:
            if (r11 > r10) goto L_0x0214
            boolean r23 = r3.mo14577e()
            if (r23 == 0) goto L_0x0211
            r3.mo14574b()
        L_0x0211:
            int r11 = r11 + 1
            goto L_0x0206
        L_0x0214:
            r24 = r1
            goto L_0x023d
        L_0x0217:
            int r10 = r3.mo14580h()
            int r11 = r3.mo14580h()
            int r23 = r10 + r11
            r24 = r1
            r1 = 0
        L_0x0224:
            if (r1 >= r10) goto L_0x022f
            r3.mo14580h()
            r3.mo14574b()
            int r1 = r1 + 1
            goto L_0x0224
        L_0x022f:
            r1 = 0
        L_0x0230:
            if (r1 >= r11) goto L_0x023b
            r3.mo14580h()
            r3.mo14574b()
            int r1 = r1 + 1
            goto L_0x0230
        L_0x023b:
            r10 = r23
        L_0x023d:
            int r5 = r5 + 1
            r1 = r24
            goto L_0x01f5
        L_0x0242:
            boolean r1 = r3.mo14577e()
            if (r1 == 0) goto L_0x0258
            r1 = 0
        L_0x0249:
            int r5 = r3.mo14580h()
            if (r1 >= r5) goto L_0x0258
            r5 = 5
            int r7 = r8 + 5
            r3.mo14575c(r7)
            int r1 = r1 + 1
            goto L_0x0249
        L_0x0258:
            r1 = 2
            r3.mo14575c(r1)
            boolean r1 = r3.mo14577e()
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x02a8
            boolean r1 = r3.mo14577e()
            if (r1 == 0) goto L_0x02a8
            r1 = 8
            int r1 = r3.mo14578f(r1)
            r7 = 255(0xff, float:3.57E-43)
            if (r1 != r7) goto L_0x0287
            r1 = 16
            int r7 = r3.mo14578f(r1)
            int r1 = r3.mo14578f(r1)
            if (r7 == 0) goto L_0x02a8
            if (r1 == 0) goto L_0x02a8
            float r3 = (float) r7
            float r1 = (float) r1
            float r5 = r3 / r1
            goto L_0x02a8
        L_0x0287:
            r3 = 17
            if (r1 >= r3) goto L_0x0290
            float[] r3 = com.google.ads.interactivemedia.p367v3.internal.aec.f20418b
            r5 = r3[r1]
            goto L_0x02a8
        L_0x0290:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r7 = 46
            r3.<init>(r7)
            java.lang.String r7 = "Unexpected aspect_ratio_idc value: "
            r3.append(r7)
            r3.append(r1)
            java.lang.String r1 = "H265Reader"
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r1, r3)
        L_0x02a8:
            com.google.ads.interactivemedia.v3.internal.cx r1 = new com.google.ads.interactivemedia.v3.internal.cx
            r1.<init>()
            r1.mo15617S(r15)
            java.lang.String r3 = "video/hevc"
            r1.mo15630ae(r3)
            r1.mo15635aj(r12)
            r1.mo15615Q(r6)
            r1.mo15626aa(r5)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.mo15618T(r2)
            com.google.ads.interactivemedia.v3.internal.cy r1 = r1.mo15625a()
            r9.mo16102a(r1)
            r1 = 1
            r0.f23358e = r1
            goto L_0x02dc
        L_0x02d0:
            r19 = r2
            r20 = r3
            r18 = r5
            r21 = r7
            r25 = r10
            r17 = r12
        L_0x02dc:
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23363j
            boolean r1 = r1.mo16254e(r4)
            if (r1 == 0) goto L_0x0304
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23363j
            byte[] r2 = r1.f23407a
            int r1 = r1.f23408b
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aec.m18363a(r2, r1)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23367n
            com.google.ads.interactivemedia.v3.internal.ov r3 = r0.f23363j
            byte[] r3 = r3.f23407a
            r2.mo14549c(r3, r1)
            com.google.ads.interactivemedia.v3.internal.aee r1 = r0.f23367n
            r2 = 5
            r1.mo14557k(r2)
            com.google.ads.interactivemedia.v3.internal.pf r1 = r0.f23354a
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23367n
            r1.mo16273b(r13, r2)
        L_0x0304:
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23364k
            boolean r1 = r1.mo16254e(r4)
            if (r1 == 0) goto L_0x032c
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23364k
            byte[] r2 = r1.f23407a
            int r1 = r1.f23408b
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aec.m18363a(r2, r1)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23367n
            com.google.ads.interactivemedia.v3.internal.ov r3 = r0.f23364k
            byte[] r3 = r3.f23407a
            r2.mo14549c(r3, r1)
            com.google.ads.interactivemedia.v3.internal.aee r1 = r0.f23367n
            r2 = 5
            r1.mo14557k(r2)
            com.google.ads.interactivemedia.v3.internal.pf r1 = r0.f23354a
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23367n
            r1.mo16273b(r13, r2)
        L_0x032c:
            long r14 = r0.f23366m
            com.google.ads.interactivemedia.v3.internal.oq r9 = r0.f23357d
            boolean r1 = r0.f23358e
            r10 = r25
            r12 = r17
            r13 = r21
            r16 = r1
            r9.mo16247b(r10, r12, r13, r14, r16)
            boolean r1 = r0.f23358e
            if (r1 != 0) goto L_0x0353
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23360g
            r2 = r21
            r1.mo16252c(r2)
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23361h
            r1.mo16252c(r2)
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23362i
            r1.mo16252c(r2)
            goto L_0x0355
        L_0x0353:
            r2 = r21
        L_0x0355:
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23363j
            r1.mo16252c(r2)
            com.google.ads.interactivemedia.v3.internal.ov r1 = r0.f23364k
            r1.mo16252c(r2)
            r6 = r29
            r1 = r18
            r2 = r19
            r3 = r20
            goto L_0x0030
        L_0x0369:
            r0.m21399f(r3, r1, r2)
        L_0x036c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7181or.mo16218d(com.google.ads.interactivemedia.v3.internal.aee):void");
    }

    /* renamed from: e */
    public final void mo16219e() {
    }
}

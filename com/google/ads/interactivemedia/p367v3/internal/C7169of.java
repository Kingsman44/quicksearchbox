package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.of */
/* compiled from: PG */
public final class C7169of implements C7171oh {

    /* renamed from: a */
    private final aee f23227a = new aee(new byte[18]);

    /* renamed from: b */
    private final String f23228b;

    /* renamed from: c */
    private String f23229c;

    /* renamed from: d */
    private C7073kr f23230d;

    /* renamed from: e */
    private int f23231e = 0;

    /* renamed from: f */
    private int f23232f;

    /* renamed from: g */
    private int f23233g;

    /* renamed from: h */
    private long f23234h;

    /* renamed from: i */
    private C6864cy f23235i;

    /* renamed from: j */
    private int f23236j;

    /* renamed from: k */
    private long f23237k;

    public C7169of(String str) {
        this.f23228b = str;
    }

    /* renamed from: a */
    public final void mo16215a() {
        this.f23231e = 0;
        this.f23232f = 0;
        this.f23233g = 0;
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23229c = pqVar.mo16280c();
        this.f23230d = kaVar.mo16113ak(pqVar.mo16279b(), 1);
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23237k = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0009 A[EDGE_INSN: B:55:0x0009->B:49:0x0009 ?: BREAK  , SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16218d(com.google.ads.interactivemedia.p367v3.internal.aee r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.ads.interactivemedia.v3.internal.kr r2 = r0.f23230d
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r2)
        L_0x0009:
            int r2 = r19.mo14550d()
            if (r2 <= 0) goto L_0x0188
            int r2 = r0.f23231e
            r3 = 8
            r4 = 3
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 4
            if (r2 == 0) goto L_0x0136
            if (r2 == r7) goto L_0x004b
            int r2 = r19.mo14550d()
            int r3 = r0.f23236j
            int r4 = r0.f23232f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            com.google.ads.interactivemedia.v3.internal.kr r3 = r0.f23230d
            r3.mo16105d(r1, r2)
            int r3 = r0.f23232f
            int r3 = r3 + r2
            r0.f23232f = r3
            int r10 = r0.f23236j
            if (r3 != r10) goto L_0x0009
            com.google.ads.interactivemedia.v3.internal.kr r6 = r0.f23230d
            long r7 = r0.f23237k
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo16103b(r7, r9, r10, r11, r12)
            long r2 = r0.f23237k
            long r6 = r0.f23234h
            long r2 = r2 + r6
            r0.f23237k = r2
            r0.f23231e = r5
            goto L_0x0009
        L_0x004b:
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23227a
            byte[] r2 = r2.mo14555i()
            int r9 = r19.mo14550d()
            int r10 = r0.f23232f
            r11 = 18
            int r10 = 18 - r10
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r0.f23232f
            r1.mo14559m(r2, r10, r9)
            int r2 = r0.f23232f
            int r2 = r2 + r9
            r0.f23232f = r2
            if (r2 != r11) goto L_0x0009
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23227a
            byte[] r2 = r2.mo14555i()
            com.google.ads.interactivemedia.v3.internal.cy r9 = r0.f23235i
            if (r9 != 0) goto L_0x0084
            java.lang.String r9 = r0.f23229c
            java.lang.String r10 = r0.f23228b
            com.google.ads.interactivemedia.v3.internal.cy r9 = com.google.ads.interactivemedia.p367v3.internal.C7007if.m20719a(r2, r9, r10)
            r0.f23235i = r9
            com.google.ads.interactivemedia.v3.internal.kr r10 = r0.f23230d
            r10.mo16102a(r9)
        L_0x0084:
            int r9 = com.google.ads.interactivemedia.p367v3.internal.C7007if.f22408a
            byte r9 = r2[r5]
            r10 = 31
            r12 = -1
            r13 = -2
            r14 = 5
            r15 = 6
            r16 = 7
            if (r9 == r13) goto L_0x00cd
            if (r9 == r12) goto L_0x00b7
            if (r9 == r10) goto L_0x00a4
            byte r3 = r2[r14]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            byte r4 = r2[r16]
            goto L_0x00da
        L_0x00a4:
            byte r17 = r2[r15]
            r4 = r17 & 3
            int r4 = r4 << 12
            byte r11 = r2[r16]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << r8
            r4 = r4 | r11
            byte r3 = r2[r3]
            r3 = r3 & 60
            int r3 = r3 >> r6
            r3 = r3 | r4
            goto L_0x00ca
        L_0x00b7:
            byte r3 = r2[r16]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            r4 = 9
            byte r4 = r2[r4]
            r4 = r4 & 60
            int r4 = r4 >> r6
            r3 = r3 | r4
        L_0x00ca:
            int r3 = r3 + r7
            r4 = 1
            goto L_0x00e0
        L_0x00cd:
            byte r3 = r2[r8]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r16]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            byte r4 = r2[r15]
        L_0x00da:
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >> r8
            r3 = r3 | r4
            int r3 = r3 + r7
            r4 = 0
        L_0x00e0:
            if (r4 == 0) goto L_0x00e6
            int r3 = r3 * 16
            int r3 = r3 / 14
        L_0x00e6:
            r0.f23236j = r3
            if (r9 == r13) goto L_0x0107
            if (r9 == r12) goto L_0x00fd
            if (r9 == r10) goto L_0x00f5
            byte r3 = r2[r8]
            r3 = r3 & r7
            int r3 = r3 << r15
            byte r2 = r2[r14]
            goto L_0x010d
        L_0x00f5:
            byte r3 = r2[r14]
            r3 = r3 & 7
            int r3 = r3 << r8
            byte r2 = r2[r15]
            goto L_0x0104
        L_0x00fd:
            byte r3 = r2[r8]
            r3 = r3 & 7
            int r3 = r3 << r8
            byte r2 = r2[r16]
        L_0x0104:
            r2 = r2 & 60
            goto L_0x010f
        L_0x0107:
            byte r3 = r2[r14]
            r3 = r3 & r7
            int r3 = r3 << r15
            byte r2 = r2[r8]
        L_0x010d:
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L_0x010f:
            int r2 = r2 >> r6
            r2 = r2 | r3
            int r2 = r2 + r7
            int r2 = r2 * 32
            long r2 = (long) r2
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r7
            com.google.ads.interactivemedia.v3.internal.cy r4 = r0.f23235i
            int r4 = r4.f21826z
            long r7 = (long) r4
            long r2 = r2 / r7
            int r3 = (int) r2
            long r2 = (long) r3
            r0.f23234h = r2
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23227a
            r2.mo14554h(r5)
            com.google.ads.interactivemedia.v3.internal.kr r2 = r0.f23230d
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f23227a
            r4 = 18
            r2.mo16105d(r3, r4)
            r0.f23231e = r6
            goto L_0x0009
        L_0x0136:
            int r2 = r19.mo14550d()
            if (r2 <= 0) goto L_0x0009
            int r2 = r0.f23233g
            int r2 = r2 << r3
            r0.f23233g = r2
            int r9 = r19.mo14560n()
            r2 = r2 | r9
            r0.f23233g = r2
            int r9 = com.google.ads.interactivemedia.p367v3.internal.C7007if.f22408a
            r9 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r9) goto L_0x015e
            r9 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r9) goto L_0x015e
            r9 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r9) goto L_0x015e
            r9 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r9) goto L_0x0136
        L_0x015e:
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23227a
            byte[] r2 = r2.mo14555i()
            int r3 = r0.f23233g
            int r9 = r3 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r5] = r9
            int r9 = r3 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r7] = r9
            int r9 = r3 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2[r4] = r3
            r0.f23232f = r8
            r0.f23233g = r5
            r0.f23231e = r7
            goto L_0x0009
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7169of.mo16218d(com.google.ads.interactivemedia.v3.internal.aee):void");
    }

    /* renamed from: e */
    public final void mo16219e() {
    }
}

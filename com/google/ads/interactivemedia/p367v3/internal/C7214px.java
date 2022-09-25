package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.px */
/* compiled from: PG */
public final class C7214px implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f23549a = 0;

    /* renamed from: b */
    private C7056ka f23550b;

    /* renamed from: c */
    private C7073kr f23551c;

    /* renamed from: d */
    private C7212pv f23552d;

    /* renamed from: e */
    private int f23553e = -1;

    /* renamed from: f */
    private long f23554f = -1;

    static {
        int i = C7210pt.f23526b;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f23550b = kaVar;
        this.f23551c = kaVar.mo16113ak(0, 1);
        kaVar.mo16114al();
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        C7212pv pvVar = this.f23552d;
        if (pvVar != null) {
            pvVar.mo16283a(j2);
        }
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        return C7218qa.m21532a(jvVar) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r15 != 65534) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16112h(com.google.ads.interactivemedia.p367v3.internal.C7050jv r14, com.google.ads.interactivemedia.p367v3.internal.C7067kl r15) {
        /*
            r13 = this;
            com.google.ads.interactivemedia.v3.internal.kr r15 = r13.f23551c
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r15)
            int r15 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            com.google.ads.interactivemedia.v3.internal.pv r15 = r13.f23552d
            r0 = 1
            r1 = 0
            if (r15 != 0) goto L_0x0098
            com.google.ads.interactivemedia.v3.internal.py r5 = com.google.ads.interactivemedia.p367v3.internal.C7218qa.m21532a(r14)
            if (r5 == 0) goto L_0x0090
            int r15 = r5.f23555a
            r2 = 17
            if (r15 != r2) goto L_0x0026
            com.google.ads.interactivemedia.v3.internal.pu r15 = new com.google.ads.interactivemedia.v3.internal.pu
            com.google.ads.interactivemedia.v3.internal.ka r2 = r13.f23550b
            com.google.ads.interactivemedia.v3.internal.kr r3 = r13.f23551c
            r15.<init>(r2, r3, r5)
            r13.f23552d = r15
            goto L_0x0098
        L_0x0026:
            r2 = 6
            if (r15 != r2) goto L_0x0039
            com.google.ads.interactivemedia.v3.internal.pw r15 = new com.google.ads.interactivemedia.v3.internal.pw
            com.google.ads.interactivemedia.v3.internal.ka r3 = r13.f23550b
            com.google.ads.interactivemedia.v3.internal.kr r4 = r13.f23551c
            java.lang.String r6 = "audio/g711-alaw"
            r7 = -1
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f23552d = r15
            goto L_0x0098
        L_0x0039:
            r2 = 7
            if (r15 != r2) goto L_0x004c
            com.google.ads.interactivemedia.v3.internal.pw r15 = new com.google.ads.interactivemedia.v3.internal.pw
            com.google.ads.interactivemedia.v3.internal.ka r3 = r13.f23550b
            com.google.ads.interactivemedia.v3.internal.kr r4 = r13.f23551c
            java.lang.String r6 = "audio/g711-mlaw"
            r7 = -1
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f23552d = r15
            goto L_0x0098
        L_0x004c:
            int r2 = r5.f23559e
            if (r15 == r0) goto L_0x0061
            r3 = 3
            if (r15 == r3) goto L_0x005a
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r15 == r3) goto L_0x0061
        L_0x0058:
            r7 = 0
            goto L_0x0066
        L_0x005a:
            r3 = 32
            if (r2 != r3) goto L_0x0058
            r2 = 4
            r7 = 4
            goto L_0x0066
        L_0x0061:
            int r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18505W(r2)
            r7 = r2
        L_0x0066:
            if (r7 == 0) goto L_0x0077
            com.google.ads.interactivemedia.v3.internal.pw r15 = new com.google.ads.interactivemedia.v3.internal.pw
            com.google.ads.interactivemedia.v3.internal.ka r3 = r13.f23550b
            com.google.ads.interactivemedia.v3.internal.kr r4 = r13.f23551c
            java.lang.String r6 = "audio/raw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f23552d = r15
            goto L_0x0098
        L_0x0077:
            com.google.ads.interactivemedia.v3.internal.dt r14 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Unsupported WAV format type: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r14.<init>((java.lang.String) r15)
            throw r14
        L_0x0090:
            com.google.ads.interactivemedia.v3.internal.dt r14 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r15 = "Unsupported or unrecognized wav header."
            r14.<init>((java.lang.String) r15)
            throw r14
        L_0x0098:
            int r15 = r13.f23553e
            r2 = -1
            r4 = -1
            if (r15 != r4) goto L_0x0167
            r14.mo16097j()
            com.google.ads.interactivemedia.v3.internal.aee r15 = new com.google.ads.interactivemedia.v3.internal.aee
            r5 = 8
            r15.<init>((int) r5)
            com.google.ads.interactivemedia.v3.internal.pz r6 = com.google.ads.interactivemedia.p367v3.internal.C7216pz.m21531a(r14, r15)
        L_0x00ad:
            int r7 = r6.f23561a
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r9 = "WavHeaderReader"
            if (r7 == r8) goto L_0x010a
            r8 = 1380533830(0x52494646, float:2.16116855E11)
            if (r7 == r8) goto L_0x00d6
            r10 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r7 == r10) goto L_0x00d6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 39
            r10.<init>(r11)
            java.lang.String r11 = "Ignoring unknown WAV chunk: "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            android.util.Log.w(r9, r7)
        L_0x00d6:
            long r9 = r6.f23562b
            r11 = 8
            long r9 = r9 + r11
            int r6 = r6.f23561a
            if (r6 != r8) goto L_0x00e1
            r9 = 12
        L_0x00e1:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x00f1
            int r6 = (int) r9
            r14.mo16091d(r6)
            com.google.ads.interactivemedia.v3.internal.pz r6 = com.google.ads.interactivemedia.p367v3.internal.C7216pz.m21531a(r14, r15)
            goto L_0x00ad
        L_0x00f1:
            com.google.ads.interactivemedia.v3.internal.dt r14 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 51
            r15.<init>(r0)
            java.lang.String r0 = "Chunk is too large (~2GB+) to skip; id: "
            r15.append(r0)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            r14.<init>((java.lang.String) r15)
            throw r14
        L_0x010a:
            r14.mo16091d(r5)
            long r7 = r14.mo16099l()
            long r5 = r6.f23562b
            long r5 = r5 + r7
            long r10 = r14.mo16100m()
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x013f
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x013f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r12 = 69
            r15.<init>(r12)
            java.lang.String r12 = "Data exceeds input length: "
            r15.append(r12)
            r15.append(r5)
            java.lang.String r5 = ", "
            r15.append(r5)
            r15.append(r10)
            java.lang.String r15 = r15.toString()
            android.util.Log.w(r9, r15)
            r5 = r10
        L_0x013f:
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            android.util.Pair r15 = android.util.Pair.create(r15, r5)
            java.lang.Object r5 = r15.first
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r13.f23553e = r5
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r5 = r15.longValue()
            r13.f23554f = r5
            com.google.ads.interactivemedia.v3.internal.pv r15 = r13.f23552d
            int r7 = r13.f23553e
            r15.mo16284b(r7, r5)
            goto L_0x0176
        L_0x0167:
            long r5 = r14.mo16099l()
            r7 = 0
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x0176
            int r15 = r13.f23553e
            r14.mo16091d(r15)
        L_0x0176:
            long r5 = r13.f23554f
            int r15 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r0 = 0
        L_0x017e:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r0)
            long r2 = r13.f23554f
            long r5 = r14.mo16099l()
            com.google.ads.interactivemedia.v3.internal.pv r15 = r13.f23552d
            long r2 = r2 - r5
            boolean r14 = r15.mo16285c(r14, r2)
            if (r14 == 0) goto L_0x0191
            return r4
        L_0x0191:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7214px.mo16112h(com.google.ads.interactivemedia.v3.internal.jv, com.google.ads.interactivemedia.v3.internal.kl):int");
    }
}

package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nz */
/* compiled from: PG */
public final class C7162nz implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f23168a = 0;

    /* renamed from: b */
    private final C7164oa f23169b = new C7164oa((String) null);

    /* renamed from: c */
    private final aee f23170c = new aee(16384);

    /* renamed from: d */
    private boolean f23171d;

    static {
        int i = C7161ny.f23167b;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f23169b.mo16216b(kaVar, new C7207pq(0, 1));
        kaVar.mo16114al();
        kaVar.mo16115am(new C7069kn(-9223372036854775807L));
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        this.f23171d = false;
        this.f23169b.mo16215a();
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        r15.mo16097j();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        if ((r4 - r3) < 8192) goto L_0x004a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16111g(com.google.ads.interactivemedia.p367v3.internal.C7050jv r15) {
        /*
            r14 = this;
            com.google.ads.interactivemedia.v3.internal.aee r0 = new com.google.ads.interactivemedia.v3.internal.aee
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo14555i()
            r15.mo16094g(r4, r2, r1)
            r0.mo14554h(r2)
            int r4 = r0.mo14564r()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L_0x0096
            r15.mo16097j()
            r15.mo16096i(r3)
            r4 = r3
        L_0x0024:
            r1 = 0
        L_0x0025:
            byte[] r5 = r0.mo14555i()
            r7 = 7
            r15.mo16094g(r5, r2, r7)
            r0.mo14554h(r2)
            int r5 = r0.mo14561o()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L_0x004e
            if (r5 == r9) goto L_0x004e
            r15.mo16097j()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x004a
            return r2
        L_0x004a:
            r15.mo16096i(r4)
            goto L_0x0024
        L_0x004e:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L_0x0054
            return r8
        L_0x0054:
            byte[] r8 = r0.mo14555i()
            int r11 = com.google.ads.interactivemedia.p367v3.internal.C6965gr.f22222a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L_0x0060
            r11 = -1
            goto L_0x008d
        L_0x0060:
            r11 = 2
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            byte r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L_0x0087
            byte r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            byte r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L_0x0088
        L_0x0087:
            r7 = 4
        L_0x0088:
            if (r5 != r9) goto L_0x008c
            int r7 = r7 + 2
        L_0x008c:
            int r11 = r11 + r7
        L_0x008d:
            if (r11 != r12) goto L_0x0090
            return r2
        L_0x0090:
            int r11 = r11 + -7
            r15.mo16096i(r11)
            goto L_0x0025
        L_0x0096:
            r0.mo14557k(r6)
            int r4 = r0.mo14537A()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.mo16096i(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7162nz.mo16111g(com.google.ads.interactivemedia.v3.internal.jv):boolean");
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        int a = jvVar.mo14388a(this.f23170c.mo14555i(), 0, 16384);
        if (a == -1) {
            return -1;
        }
        this.f23170c.mo14554h(0);
        this.f23170c.mo14552f(a);
        if (!this.f23171d) {
            this.f23169b.mo16217c(0, 4);
            this.f23171d = true;
        }
        this.f23169b.mo16218d(this.f23170c);
        return 0;
    }
}

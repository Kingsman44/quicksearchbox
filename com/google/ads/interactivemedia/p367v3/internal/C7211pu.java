package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pu */
/* compiled from: PG */
final class C7211pu implements C7212pv {

    /* renamed from: a */
    private static final int[] f23527a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: b */
    private static final int[] f23528b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: c */
    private final C7056ka f23529c;

    /* renamed from: d */
    private final C7073kr f23530d;

    /* renamed from: e */
    private final C7215py f23531e;

    /* renamed from: f */
    private final int f23532f;

    /* renamed from: g */
    private final byte[] f23533g;

    /* renamed from: h */
    private final aee f23534h;

    /* renamed from: i */
    private final int f23535i;

    /* renamed from: j */
    private final C6864cy f23536j;

    /* renamed from: k */
    private int f23537k;

    /* renamed from: l */
    private long f23538l;

    /* renamed from: m */
    private int f23539m;

    /* renamed from: n */
    private long f23540n;

    public C7211pu(C7056ka kaVar, C7073kr krVar, C7215py pyVar) {
        this.f23529c = kaVar;
        this.f23530d = krVar;
        this.f23531e = pyVar;
        int max = Math.max(1, pyVar.f23557c / 10);
        this.f23535i = max;
        aee aee = new aee(pyVar.f23560f);
        aee.mo14562p();
        int p = aee.mo14562p();
        this.f23532f = p;
        int i = pyVar.f23556b;
        int i2 = (((pyVar.f23558d - (i * 4)) * 8) / (pyVar.f23559e * i)) + 1;
        if (p == i2) {
            int F = aeu.m18488F(max, p);
            this.f23533g = new byte[(pyVar.f23558d * F)];
            this.f23534h = new aee(F * m21516g(p, i));
            int i3 = ((pyVar.f23557c * pyVar.f23558d) * 8) / p;
            C6863cx cxVar = new C6863cx();
            cxVar.mo15630ae("audio/raw");
            cxVar.mo15605G(i3);
            cxVar.mo15624Z(i3);
            cxVar.mo15621W(m21516g(max, i));
            cxVar.mo15606H(pyVar.f23556b);
            cxVar.mo15631af(pyVar.f23557c);
            cxVar.mo15623Y(2);
            this.f23536j = cxVar.mo15625a();
            return;
        }
        StringBuilder sb = new StringBuilder(56);
        sb.append("Expected frames per block: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(p);
        throw new C6886dt(sb.toString());
    }

    /* renamed from: d */
    private final void m21513d(int i) {
        long j = this.f23538l;
        long N = aeu.m18496N(this.f23540n, 1000000, (long) this.f23531e.f23557c);
        int f = m21515f(i);
        this.f23530d.mo16103b(j + N, 1, f, this.f23539m - f, (C7072kq) null);
        this.f23540n += (long) i;
        this.f23539m -= f;
    }

    /* renamed from: e */
    private final int m21514e(int i) {
        int i2 = this.f23531e.f23556b;
        return i / (i2 + i2);
    }

    /* renamed from: f */
    private final int m21515f(int i) {
        return m21516g(i, this.f23531e.f23556b);
    }

    /* renamed from: g */
    private static int m21516g(int i, int i2) {
        return (i + i) * i2;
    }

    /* renamed from: a */
    public final void mo16283a(long j) {
        this.f23537k = 0;
        this.f23538l = j;
        this.f23539m = 0;
        this.f23540n = 0;
    }

    /* renamed from: b */
    public final void mo16284b(int i, long j) {
        this.f23529c.mo16115am(new C7219qb(this.f23531e, this.f23532f, (long) i, j));
        this.f23530d.mo16102a(this.f23536j);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0044 A[EDGE_INSN: B:38:0x0044->B:10:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* renamed from: c */
    public final boolean mo16285c(com.google.ads.interactivemedia.p367v3.internal.C7050jv r20, long r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r3 = r0.f23535i
            int r4 = r0.f23539m
            int r4 = r0.m21514e(r4)
            int r3 = r3 - r4
            int r4 = r0.f23532f
            int r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18488F(r3, r4)
            com.google.ads.interactivemedia.v3.internal.py r4 = r0.f23531e
            int r4 = r4.f23558d
            int r3 = r3 * r4
            r4 = 0
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0021
        L_0x001f:
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 != 0) goto L_0x0044
            int r5 = r0.f23537k
            if (r5 >= r3) goto L_0x0044
            int r5 = r3 - r5
            long r8 = (long) r5
            long r8 = java.lang.Math.min(r8, r1)
            byte[] r5 = r0.f23533g
            int r10 = r0.f23537k
            int r9 = (int) r8
            r8 = r20
            int r5 = r8.mo14388a(r5, r10, r9)
            r9 = -1
            if (r5 != r9) goto L_0x003e
            goto L_0x001f
        L_0x003e:
            int r9 = r0.f23537k
            int r9 = r9 + r5
            r0.f23537k = r9
            goto L_0x0022
        L_0x0044:
            int r1 = r0.f23537k
            com.google.ads.interactivemedia.v3.internal.py r2 = r0.f23531e
            int r2 = r2.f23558d
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x014c
            byte[] r2 = r0.f23533g
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f23534h
            r5 = 0
        L_0x0052:
            if (r5 >= r1) goto L_0x0119
            r8 = 0
        L_0x0055:
            com.google.ads.interactivemedia.v3.internal.py r9 = r0.f23531e
            int r9 = r9.f23556b
            if (r8 >= r9) goto L_0x0110
            byte[] r9 = r3.mo14555i()
            com.google.ads.interactivemedia.v3.internal.py r10 = r0.f23531e
            int r11 = r10.f23558d
            int r10 = r10.f23556b
            int r12 = r5 * r11
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r10 * 4
            int r13 = r13 + r12
            int r11 = r11 / r10
            int r11 = r11 + -4
            int r14 = r12 + 1
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            byte r15 = r2[r12]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r14 = r14 | r15
            short r14 = (short) r14
            int r12 = r12 + 2
            byte r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = 88
            int r12 = java.lang.Math.min(r12, r15)
            int[] r16 = f23528b
            r16 = r16[r12]
            int r6 = r0.f23532f
            int r6 = r6 * r5
            int r6 = r6 * r10
            int r6 = r6 + r8
            int r6 = r6 + r6
            r15 = r14 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r9[r6] = r15
            int r15 = r6 + 1
            int r7 = r14 >> 8
            byte r7 = (byte) r7
            r9[r15] = r7
            r7 = 0
        L_0x00a3:
            int r15 = r11 + r11
            if (r7 >= r15) goto L_0x0107
            int r15 = r7 / 8
            int r15 = r15 * r10
            int r15 = r15 * 4
            int r15 = r15 + r13
            int r18 = r7 / 2
            int r18 = r18 % 4
            int r15 = r15 + r18
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r18 = r7 % 2
            if (r18 != 0) goto L_0x00bf
            r15 = r15 & 15
            goto L_0x00c1
        L_0x00bf:
            int r15 = r15 >> 4
        L_0x00c1:
            r18 = r15 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r2
            int r2 = r18 >> 3
            r18 = r15 & 8
            if (r18 == 0) goto L_0x00d4
            int r2 = -r2
        L_0x00d4:
            int r14 = r14 + r2
            r2 = -32768(0xffffffffffff8000, float:NaN)
            r21 = r11
            r11 = 32767(0x7fff, float:4.5916E-41)
            int r14 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18490H(r14, r2, r11)
            int r2 = r10 + r10
            int r6 = r6 + r2
            r2 = r14 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r6] = r2
            int r2 = r6 + 1
            int r11 = r14 >> 8
            byte r11 = (byte) r11
            r9[r2] = r11
            int[] r2 = f23527a
            r2 = r2[r15]
            int r12 = r12 + r2
            r2 = 88
            r11 = 0
            int r12 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18490H(r12, r11, r2)
            int[] r15 = f23528b
            r15 = r15[r12]
            int r7 = r7 + 1
            r11 = r21
            r2 = r16
            r16 = r15
            goto L_0x00a3
        L_0x0107:
            r16 = r2
            r11 = 0
            r17 = 1
            int r8 = r8 + 1
            goto L_0x0055
        L_0x0110:
            r16 = r2
            r11 = 0
            r17 = 1
            int r5 = r5 + 1
            goto L_0x0052
        L_0x0119:
            int r2 = r0.f23532f
            int r2 = r2 * r1
            int r2 = r0.m21515f(r2)
            r3.mo14547a(r2)
            int r2 = r0.f23537k
            com.google.ads.interactivemedia.v3.internal.py r3 = r0.f23531e
            int r3 = r3.f23558d
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.f23537k = r2
            com.google.ads.interactivemedia.v3.internal.aee r1 = r0.f23534h
            int r1 = r1.mo14551e()
            com.google.ads.interactivemedia.v3.internal.kr r2 = r0.f23530d
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f23534h
            r2.mo16105d(r3, r1)
            int r2 = r0.f23539m
            int r2 = r2 + r1
            r0.f23539m = r2
            int r1 = r0.m21514e(r2)
            int r2 = r0.f23535i
            if (r1 < r2) goto L_0x014c
            r0.m21513d(r2)
        L_0x014c:
            if (r4 == 0) goto L_0x0159
            int r1 = r0.f23539m
            int r1 = r0.m21514e(r1)
            if (r1 <= 0) goto L_0x0159
            r0.m21513d(r1)
        L_0x0159:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7211pu.mo16285c(com.google.ads.interactivemedia.v3.internal.jv, long):boolean");
    }
}

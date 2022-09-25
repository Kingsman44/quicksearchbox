package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kx */
/* compiled from: PG */
public final class C7079kx implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f22651a = 0;

    /* renamed from: b */
    private static final int[] f22652b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f22653c;

    /* renamed from: d */
    private static final byte[] f22654d = aeu.m18555y("#!AMR\n");

    /* renamed from: e */
    private static final byte[] f22655e = aeu.m18555y("#!AMR-WB\n");

    /* renamed from: f */
    private static final int f22656f;

    /* renamed from: g */
    private final byte[] f22657g;

    /* renamed from: h */
    private boolean f22658h;

    /* renamed from: i */
    private long f22659i;

    /* renamed from: j */
    private int f22660j;

    /* renamed from: k */
    private int f22661k;

    /* renamed from: l */
    private boolean f22662l;

    /* renamed from: m */
    private int f22663m;

    /* renamed from: n */
    private int f22664n;

    /* renamed from: o */
    private long f22665o;

    /* renamed from: p */
    private C7056ka f22666p;

    /* renamed from: q */
    private C7073kr f22667q;

    /* renamed from: r */
    private C7070ko f22668r;

    /* renamed from: s */
    private boolean f22669s;

    static {
        int i = C7078kw.f22650b;
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f22653c = iArr;
        f22656f = iArr[8];
    }

    public C7079kx() {
        this((byte[]) null);
    }

    public C7079kx(byte[] bArr) {
        this.f22657g = new byte[1];
        this.f22663m = -1;
    }

    /* renamed from: a */
    private final boolean m20986a(C7050jv jvVar) {
        byte[] bArr = f22654d;
        if (m20987b(jvVar, bArr)) {
            this.f22658h = false;
            jvVar.mo16091d(bArr.length);
            return true;
        }
        byte[] bArr2 = f22655e;
        if (!m20987b(jvVar, bArr2)) {
            return false;
        }
        this.f22658h = true;
        jvVar.mo16091d(bArr2.length);
        return true;
    }

    /* renamed from: b */
    private static boolean m20987b(C7050jv jvVar, byte[] bArr) {
        jvVar.mo16097j();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        jvVar.mo16094g(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035 A[Catch:{ EOFException -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[Catch:{ EOFException -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m20988c(com.google.ads.interactivemedia.p367v3.internal.C7050jv r10) {
        /*
            r9 = this;
            int r0 = r9.f22661k
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L_0x0097
            r10.mo16097j()     // Catch:{ EOFException -> 0x0096 }
            byte[] r0 = r9.f22657g     // Catch:{ EOFException -> 0x0096 }
            r10.mo16094g(r0, r1, r3)     // Catch:{ EOFException -> 0x0096 }
            byte[] r0 = r9.f22657g     // Catch:{ EOFException -> 0x0096 }
            byte r0 = r0[r1]     // Catch:{ EOFException -> 0x0096 }
            r4 = r0 & 131(0x83, float:1.84E-43)
            if (r4 > 0) goto L_0x007d
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r9.f22658h     // Catch:{ EOFException -> 0x0096 }
            if (r4 == 0) goto L_0x0028
            r5 = 10
            if (r0 < r5) goto L_0x0033
            r5 = 13
            if (r0 <= r5) goto L_0x0028
            goto L_0x0033
        L_0x0028:
            if (r4 != 0) goto L_0x0051
            r5 = 12
            if (r0 < r5) goto L_0x0033
            r5 = 14
            if (r0 > r5) goto L_0x0033
            goto L_0x0051
        L_0x0033:
            if (r4 == 0) goto L_0x003a
            int[] r4 = f22653c     // Catch:{ EOFException -> 0x0096 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0096 }
            goto L_0x003e
        L_0x003a:
            int[] r4 = f22652b     // Catch:{ EOFException -> 0x0096 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0096 }
        L_0x003e:
            r9.f22660j = r0     // Catch:{ EOFException -> 0x0096 }
            r9.f22661k = r0
            int r4 = r9.f22663m
            if (r4 != r2) goto L_0x0049
            r9.f22663m = r0
            r4 = r0
        L_0x0049:
            if (r4 != r0) goto L_0x0097
            int r4 = r9.f22664n
            int r4 = r4 + r3
            r9.f22664n = r4
            goto L_0x0097
        L_0x0051:
            com.google.ads.interactivemedia.v3.internal.dt r10 = new com.google.ads.interactivemedia.v3.internal.dt     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r1 = "WB"
            java.lang.String r5 = "NB"
            if (r3 == r4) goto L_0x005a
            r1 = r5
        L_0x005a:
            int r3 = r1.length()     // Catch:{ EOFException -> 0x0096 }
            int r3 = r3 + 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0096 }
            r4.<init>(r3)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r3 = "Illegal AMR "
            r4.append(r3)     // Catch:{ EOFException -> 0x0096 }
            r4.append(r1)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r1 = " frame type "
            r4.append(r1)     // Catch:{ EOFException -> 0x0096 }
            r4.append(r0)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r0 = r4.toString()     // Catch:{ EOFException -> 0x0096 }
            r10.<init>((java.lang.String) r0)     // Catch:{ EOFException -> 0x0096 }
            throw r10     // Catch:{ EOFException -> 0x0096 }
        L_0x007d:
            com.google.ads.interactivemedia.v3.internal.dt r10 = new com.google.ads.interactivemedia.v3.internal.dt     // Catch:{ EOFException -> 0x0096 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0096 }
            r3 = 42
            r1.<init>(r3)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r3 = "Invalid padding bits for frame header "
            r1.append(r3)     // Catch:{ EOFException -> 0x0096 }
            r1.append(r0)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x0096 }
            r10.<init>((java.lang.String) r0)     // Catch:{ EOFException -> 0x0096 }
            throw r10     // Catch:{ EOFException -> 0x0096 }
        L_0x0096:
            return r2
        L_0x0097:
            com.google.ads.interactivemedia.v3.internal.kr r4 = r9.f22667q
            int r10 = r4.mo16104c(r10, r0, r3)
            if (r10 != r2) goto L_0x00a0
            return r2
        L_0x00a0:
            int r0 = r9.f22661k
            int r0 = r0 - r10
            r9.f22661k = r0
            if (r0 <= 0) goto L_0x00a8
            return r1
        L_0x00a8:
            com.google.ads.interactivemedia.v3.internal.kr r2 = r9.f22667q
            long r3 = r9.f22665o
            long r5 = r9.f22659i
            long r3 = r3 + r5
            r5 = 1
            int r6 = r9.f22660j
            r7 = 0
            r8 = 0
            r2.mo16103b(r3, r5, r6, r7, r8)
            long r2 = r9.f22659i
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.f22659i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7079kx.m20988c(com.google.ads.interactivemedia.v3.internal.jv):int");
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f22666p = kaVar;
        this.f22667q = kaVar.mo16113ak(0, 1);
        kaVar.mo16114al();
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        this.f22659i = 0;
        this.f22660j = 0;
        this.f22661k = 0;
        this.f22665o = 0;
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        return m20986a(jvVar);
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        ary.m19466s(this.f22667q);
        int i = aeu.f20466a;
        if (jvVar.mo16099l() != 0 || m20986a(jvVar)) {
            if (!this.f22669s) {
                this.f22669s = true;
                boolean z = this.f22658h;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                C7073kr krVar = this.f22667q;
                C6863cx cxVar = new C6863cx();
                cxVar.mo15630ae(str);
                cxVar.mo15621W(f22656f);
                cxVar.mo15606H(1);
                cxVar.mo15631af(i2);
                krVar.mo16102a(cxVar.mo15625a());
            }
            int c = m20988c(jvVar);
            if (!this.f22662l) {
                C7069kn knVar = new C7069kn(-9223372036854775807L);
                this.f22668r = knVar;
                this.f22666p.mo16115am(knVar);
                this.f22662l = true;
            }
            return c;
        }
        throw new C6886dt("Could not find AMR header.");
    }
}

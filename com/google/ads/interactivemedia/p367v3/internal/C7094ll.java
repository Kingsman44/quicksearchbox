package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayDeque;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ll */
/* compiled from: PG */
final class C7094ll {

    /* renamed from: a */
    private final byte[] f22735a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque f22736b = new ArrayDeque();

    /* renamed from: c */
    private final C7102lt f22737c = new C7102lt();

    /* renamed from: d */
    private C7095lm f22738d;

    /* renamed from: e */
    private int f22739e;

    /* renamed from: f */
    private int f22740f;

    /* renamed from: g */
    private long f22741g;

    /* renamed from: d */
    private final long m21035d(C7050jv jvVar, int i) {
        jvVar.mo16090c(this.f22735a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f22735a[i2] & 255));
        }
        return j;
    }

    /* renamed from: a */
    public final void mo16147a(C7095lm lmVar) {
        this.f22738d = lmVar;
    }

    /* renamed from: b */
    public final void mo16148b() {
        this.f22739e = 0;
        this.f22736b.clear();
        this.f22737c.mo16162a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        if (r0 == 1) goto L_0x0096;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16149c(com.google.ads.interactivemedia.p367v3.internal.C7050jv r13) {
        /*
            r12 = this;
            com.google.ads.interactivemedia.v3.internal.lm r0 = r12.f22738d
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r0)
        L_0x0005:
            java.util.ArrayDeque r0 = r12.f22736b
            java.lang.Object r0 = r0.peek()
            com.google.ads.interactivemedia.v3.internal.lk r0 = (com.google.ads.interactivemedia.p367v3.internal.C7093lk) r0
            r1 = 1
            if (r0 == 0) goto L_0x0033
            long r2 = r13.mo16099l()
            long r4 = r0.f22734b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            com.google.ads.interactivemedia.v3.internal.lm r13 = r12.f22738d
            java.util.ArrayDeque r0 = r12.f22736b
            java.lang.Object r0 = r0.pop()
            com.google.ads.interactivemedia.v3.internal.lk r0 = (com.google.ads.interactivemedia.p367v3.internal.C7093lk) r0
            int r0 = r0.f22733a
            com.google.ads.interactivemedia.v3.internal.lo r13 = (com.google.ads.interactivemedia.p367v3.internal.C7097lo) r13
            com.google.ads.interactivemedia.v3.internal.lr r13 = r13.f22744a
            r13.mo16156b(r0)
            return r1
        L_0x0033:
            int r0 = r12.f22739e
            r2 = 4
            r3 = 0
            if (r0 != 0) goto L_0x0094
            com.google.ads.interactivemedia.v3.internal.lt r0 = r12.f22737c
            long r4 = r0.mo16164e(r13, r1, r3, r2)
            r6 = -2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0087
            r13.mo16097j()
        L_0x0048:
            byte[] r0 = r12.f22735a
            r13.mo16094g(r0, r3, r2)
            byte[] r0 = r12.f22735a
            byte r0 = r0[r3]
            int r0 = com.google.ads.interactivemedia.p367v3.internal.C7102lt.m21078c(r0)
            r4 = -1
            if (r0 == r4) goto L_0x0083
            if (r0 > r2) goto L_0x0083
            byte[] r4 = r12.f22735a
            long r4 = com.google.ads.interactivemedia.p367v3.internal.C7102lt.m21079d(r4, r0, r3)
            int r5 = (int) r4
            com.google.ads.interactivemedia.v3.internal.lm r4 = r12.f22738d
            com.google.ads.interactivemedia.v3.internal.lo r4 = (com.google.ads.interactivemedia.p367v3.internal.C7097lo) r4
            com.google.ads.interactivemedia.v3.internal.lr r4 = r4.f22744a
            r4 = 357149030(0x1549a966, float:4.072526E-26)
            if (r5 == r4) goto L_0x007e
            r4 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r5 == r4) goto L_0x007e
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r5 == r4) goto L_0x007e
            r4 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r5 != r4) goto L_0x0083
            r5 = 374648427(0x1654ae6b, float:1.718026E-25)
        L_0x007e:
            r13.mo16091d(r0)
            long r4 = (long) r5
            goto L_0x0087
        L_0x0083:
            r13.mo16091d(r1)
            goto L_0x0048
        L_0x0087:
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x008e
            return r3
        L_0x008e:
            int r0 = (int) r4
            r12.f22740f = r0
            r12.f22739e = r1
            goto L_0x0096
        L_0x0094:
            if (r0 != r1) goto L_0x00a3
        L_0x0096:
            com.google.ads.interactivemedia.v3.internal.lt r0 = r12.f22737c
            r4 = 8
            long r4 = r0.mo16164e(r13, r3, r1, r4)
            r12.f22741g = r4
            r0 = 2
            r12.f22739e = r0
        L_0x00a3:
            com.google.ads.interactivemedia.v3.internal.lm r0 = r12.f22738d
            int r4 = r12.f22740f
            com.google.ads.interactivemedia.v3.internal.lo r0 = (com.google.ads.interactivemedia.p367v3.internal.C7097lo) r0
            com.google.ads.interactivemedia.v3.internal.lr r5 = r0.f22744a
            r6 = 8
            switch(r4) {
                case 131: goto L_0x016a;
                case 134: goto L_0x0126;
                case 136: goto L_0x016a;
                case 155: goto L_0x016a;
                case 159: goto L_0x016a;
                case 160: goto L_0x0103;
                case 161: goto L_0x00fa;
                case 163: goto L_0x00fa;
                case 165: goto L_0x00fa;
                case 166: goto L_0x0103;
                case 174: goto L_0x0103;
                case 176: goto L_0x016a;
                case 179: goto L_0x016a;
                case 181: goto L_0x00ba;
                case 183: goto L_0x0103;
                case 186: goto L_0x016a;
                case 187: goto L_0x0103;
                case 215: goto L_0x016a;
                case 224: goto L_0x0103;
                case 225: goto L_0x0103;
                case 231: goto L_0x016a;
                case 238: goto L_0x016a;
                case 241: goto L_0x016a;
                case 251: goto L_0x016a;
                case 16868: goto L_0x0103;
                case 16871: goto L_0x016a;
                case 16877: goto L_0x00fa;
                case 16980: goto L_0x016a;
                case 16981: goto L_0x00fa;
                case 17026: goto L_0x0126;
                case 17029: goto L_0x016a;
                case 17143: goto L_0x016a;
                case 17545: goto L_0x00ba;
                case 18401: goto L_0x016a;
                case 18402: goto L_0x00fa;
                case 18407: goto L_0x0103;
                case 18408: goto L_0x016a;
                case 19899: goto L_0x0103;
                case 20529: goto L_0x016a;
                case 20530: goto L_0x016a;
                case 20532: goto L_0x0103;
                case 20533: goto L_0x0103;
                case 21358: goto L_0x0126;
                case 21419: goto L_0x00fa;
                case 21420: goto L_0x016a;
                case 21432: goto L_0x016a;
                case 21680: goto L_0x016a;
                case 21682: goto L_0x016a;
                case 21690: goto L_0x016a;
                case 21930: goto L_0x016a;
                case 21936: goto L_0x0103;
                case 21945: goto L_0x016a;
                case 21946: goto L_0x016a;
                case 21947: goto L_0x016a;
                case 21948: goto L_0x016a;
                case 21949: goto L_0x016a;
                case 21968: goto L_0x0103;
                case 21969: goto L_0x00ba;
                case 21970: goto L_0x00ba;
                case 21971: goto L_0x00ba;
                case 21972: goto L_0x00ba;
                case 21973: goto L_0x00ba;
                case 21974: goto L_0x00ba;
                case 21975: goto L_0x00ba;
                case 21976: goto L_0x00ba;
                case 21977: goto L_0x00ba;
                case 21978: goto L_0x00ba;
                case 21998: goto L_0x016a;
                case 22186: goto L_0x016a;
                case 22203: goto L_0x016a;
                case 25152: goto L_0x0103;
                case 25188: goto L_0x016a;
                case 25506: goto L_0x00fa;
                case 28032: goto L_0x0103;
                case 30113: goto L_0x0103;
                case 30320: goto L_0x0103;
                case 30321: goto L_0x016a;
                case 30322: goto L_0x00fa;
                case 30323: goto L_0x00ba;
                case 30324: goto L_0x00ba;
                case 30325: goto L_0x00ba;
                case 2274716: goto L_0x0126;
                case 2352003: goto L_0x016a;
                case 2807729: goto L_0x016a;
                case 290298740: goto L_0x0103;
                case 357149030: goto L_0x0103;
                case 374648427: goto L_0x0103;
                case 408125543: goto L_0x0103;
                case 440786851: goto L_0x0103;
                case 475249515: goto L_0x0103;
                case 524531317: goto L_0x0103;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            long r0 = r12.f22741g
            int r1 = (int) r0
            r13.mo16091d(r1)
            r12.f22739e = r3
            goto L_0x0005
        L_0x00ba:
            long r8 = r12.f22741g
            r10 = 4
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00e0
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00c7
            goto L_0x00e0
        L_0x00c7:
            com.google.ads.interactivemedia.v3.internal.dt r13 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Invalid float size: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r13.<init>((java.lang.String) r0)
            throw r13
        L_0x00e0:
            int r5 = (int) r8
            long r6 = r12.m21035d(r13, r5)
            if (r5 != r2) goto L_0x00ee
            int r13 = (int) r6
            float r13 = java.lang.Float.intBitsToFloat(r13)
            double r5 = (double) r13
            goto L_0x00f2
        L_0x00ee:
            double r5 = java.lang.Double.longBitsToDouble(r6)
        L_0x00f2:
            com.google.ads.interactivemedia.v3.internal.lr r13 = r0.f22744a
            r13.mo16158i(r4, r5)
            r12.f22739e = r3
            return r1
        L_0x00fa:
            long r6 = r12.f22741g
            int r0 = (int) r6
            r5.mo16160n(r4, r0, r13)
            r12.f22739e = r3
            return r1
        L_0x0103:
            long r8 = r13.mo16099l()
            long r4 = r12.f22741g
            java.util.ArrayDeque r13 = r12.f22736b
            com.google.ads.interactivemedia.v3.internal.lk r0 = new com.google.ads.interactivemedia.v3.internal.lk
            int r2 = r12.f22740f
            long r4 = r4 + r8
            r0.<init>(r2, r4)
            r13.push(r0)
            com.google.ads.interactivemedia.v3.internal.lm r13 = r12.f22738d
            int r7 = r12.f22740f
            long r10 = r12.f22741g
            com.google.ads.interactivemedia.v3.internal.lo r13 = (com.google.ads.interactivemedia.p367v3.internal.C7097lo) r13
            com.google.ads.interactivemedia.v3.internal.lr r6 = r13.f22744a
            r6.mo16155a(r7, r8, r10)
            r12.f22739e = r3
            return r1
        L_0x0126:
            long r5 = r12.f22741g
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0151
            int r2 = (int) r5
            if (r2 != 0) goto L_0x0135
            java.lang.String r13 = ""
            goto L_0x0149
        L_0x0135:
            byte[] r5 = new byte[r2]
            r13.mo16090c(r5, r3, r2)
        L_0x013a:
            if (r2 <= 0) goto L_0x0144
            int r13 = r2 + -1
            byte r6 = r5[r13]
            if (r6 != 0) goto L_0x0144
            r2 = r13
            goto L_0x013a
        L_0x0144:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r5, r3, r2)
        L_0x0149:
            com.google.ads.interactivemedia.v3.internal.lr r0 = r0.f22744a
            r0.mo16159j(r4, r13)
            r12.f22739e = r3
            return r1
        L_0x0151:
            com.google.ads.interactivemedia.v3.internal.dt r13 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 41
            r0.<init>(r1)
            java.lang.String r1 = "String element size: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r13.<init>((java.lang.String) r0)
            throw r13
        L_0x016a:
            long r8 = r12.f22741g
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x017d
            int r2 = (int) r8
            long r5 = r12.m21035d(r13, r2)
            com.google.ads.interactivemedia.v3.internal.lr r13 = r0.f22744a
            r13.mo16157c(r4, r5)
            r12.f22739e = r3
            return r1
        L_0x017d:
            com.google.ads.interactivemedia.v3.internal.dt r13 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 42
            r0.<init>(r1)
            java.lang.String r1 = "Invalid integer size: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r13.<init>((java.lang.String) r0)
            goto L_0x0197
        L_0x0196:
            throw r13
        L_0x0197:
            goto L_0x0196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7094ll.mo16149c(com.google.ads.interactivemedia.v3.internal.jv):boolean");
    }
}

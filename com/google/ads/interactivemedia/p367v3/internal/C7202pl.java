package com.google.ads.interactivemedia.p367v3.internal;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pl */
/* compiled from: PG */
final class C7202pl implements C7194pd {

    /* renamed from: a */
    final /* synthetic */ C7203pm f23487a;

    /* renamed from: b */
    private final aed f23488b = new aed(new byte[5]);

    /* renamed from: c */
    private final SparseArray f23489c = new SparseArray();

    /* renamed from: d */
    private final SparseIntArray f23490d = new SparseIntArray();

    /* renamed from: e */
    private final int f23491e;

    public C7202pl(C7203pm pmVar, int i) {
        this.f23487a = pmVar;
        this.f23491e = i;
    }

    /* renamed from: a */
    public final void mo16255a(aes aes, C7056ka kaVar, C7207pq pqVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016e, code lost:
        if (r26.mo14560n() == r14) goto L_0x014a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0247 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16256b(com.google.ads.interactivemedia.p367v3.internal.aee r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r26.mo14560n()
            r3 = 2
            if (r2 == r3) goto L_0x000c
            return
        L_0x000c:
            com.google.ads.interactivemedia.v3.internal.pm r2 = r0.f23487a
            int r2 = r2.f23493b
            r4 = 0
            r5 = 1
            if (r2 == r5) goto L_0x0046
            com.google.ads.interactivemedia.v3.internal.pm r2 = r0.f23487a
            int r2 = r2.f23493b
            if (r2 == r3) goto L_0x0046
            com.google.ads.interactivemedia.v3.internal.pm r2 = r0.f23487a
            int r2 = r2.f23505n
            if (r2 != r5) goto L_0x0027
            goto L_0x0046
        L_0x0027:
            com.google.ads.interactivemedia.v3.internal.aes r2 = new com.google.ads.interactivemedia.v3.internal.aes
            com.google.ads.interactivemedia.v3.internal.pm r6 = r0.f23487a
            java.util.List r6 = r6.f23495d
            java.lang.Object r6 = r6.get(r4)
            com.google.ads.interactivemedia.v3.internal.aes r6 = (com.google.ads.interactivemedia.p367v3.internal.aes) r6
            long r6 = r6.mo14598b()
            r2.<init>(r6)
            com.google.ads.interactivemedia.v3.internal.pm r6 = r0.f23487a
            java.util.List r6 = r6.f23495d
            r6.add(r2)
            goto L_0x0052
        L_0x0046:
            com.google.ads.interactivemedia.v3.internal.pm r2 = r0.f23487a
            java.util.List r2 = r2.f23495d
            java.lang.Object r2 = r2.get(r4)
            com.google.ads.interactivemedia.v3.internal.aes r2 = (com.google.ads.interactivemedia.p367v3.internal.aes) r2
        L_0x0052:
            int r6 = r26.mo14560n()
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x005b
            return
        L_0x005b:
            r1.mo14557k(r5)
            int r6 = r26.mo14561o()
            r7 = 3
            r1.mo14557k(r7)
            com.google.ads.interactivemedia.v3.internal.aed r8 = r0.f23488b
            r1.mo14558l(r8, r3)
            com.google.ads.interactivemedia.v3.internal.aed r8 = r0.f23488b
            r8.mo14530g(r7)
            com.google.ads.interactivemedia.v3.internal.pm r8 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.aed r9 = r0.f23488b
            r10 = 13
            int r9 = r9.mo14532i(r10)
            r8.f23511t = r9
            com.google.ads.interactivemedia.v3.internal.aed r8 = r0.f23488b
            r1.mo14558l(r8, r3)
            com.google.ads.interactivemedia.v3.internal.aed r8 = r0.f23488b
            r9 = 4
            r8.mo14530g(r9)
            com.google.ads.interactivemedia.v3.internal.aed r8 = r0.f23488b
            r11 = 12
            int r8 = r8.mo14532i(r11)
            r1.mo14557k(r8)
            com.google.ads.interactivemedia.v3.internal.pm r8 = r0.f23487a
            int r8 = r8.f23493b
            r12 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            r14 = 21
            if (r8 != r3) goto L_0x00d0
            com.google.ads.interactivemedia.v3.internal.pm r8 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.pr r8 = r8.f23509r
            if (r8 != 0) goto L_0x00d0
            com.google.ads.interactivemedia.v3.internal.po r8 = new com.google.ads.interactivemedia.v3.internal.po
            byte[] r15 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20471f
            r8.<init>(r14, r13, r13, r15)
            com.google.ads.interactivemedia.v3.internal.pm r15 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.pp r13 = r15.f23498g
            com.google.ads.interactivemedia.v3.internal.pr r8 = r13.mo16224b(r14, r8)
            r15.f23509r = r8
            com.google.ads.interactivemedia.v3.internal.pm r8 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.pr r8 = r8.f23509r
            com.google.ads.interactivemedia.v3.internal.pm r13 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.ka r13 = r13.f23504m
            com.google.ads.interactivemedia.v3.internal.pq r15 = new com.google.ads.interactivemedia.v3.internal.pq
            r15.<init>(r6, r14, r12)
            r8.mo16257a(r2, r13, r15)
        L_0x00d0:
            android.util.SparseArray r8 = r0.f23489c
            r8.clear()
            android.util.SparseIntArray r8 = r0.f23490d
            r8.clear()
            int r8 = r26.mo14550d()
        L_0x00de:
            if (r8 <= 0) goto L_0x0256
            com.google.ads.interactivemedia.v3.internal.aed r15 = r0.f23488b
            r13 = 5
            r1.mo14558l(r15, r13)
            com.google.ads.interactivemedia.v3.internal.aed r15 = r0.f23488b
            r5 = 8
            int r5 = r15.mo14532i(r5)
            com.google.ads.interactivemedia.v3.internal.aed r15 = r0.f23488b
            r15.mo14530g(r7)
            com.google.ads.interactivemedia.v3.internal.aed r15 = r0.f23488b
            int r15 = r15.mo14532i(r10)
            com.google.ads.interactivemedia.v3.internal.aed r10 = r0.f23488b
            r10.mo14530g(r9)
            com.google.ads.interactivemedia.v3.internal.aed r10 = r0.f23488b
            int r10 = r10.mo14532i(r11)
            int r11 = r26.mo14553g()
            int r12 = r11 + r10
            r3 = -1
            r17 = 0
            r18 = 0
        L_0x010f:
            int r4 = r26.mo14553g()
            if (r4 >= r12) goto L_0x01d0
            int r4 = r26.mo14560n()
            int r16 = r26.mo14560n()
            int r19 = r26.mo14553g()
            int r9 = r19 + r16
            if (r9 <= r12) goto L_0x0127
            goto L_0x01d0
        L_0x0127:
            r16 = 172(0xac, float:2.41E-43)
            r19 = 135(0x87, float:1.89E-43)
            r20 = 129(0x81, float:1.81E-43)
            if (r4 != r13) goto L_0x0157
            long r21 = r26.mo14566t()
            r23 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x013b
            goto L_0x015b
        L_0x013b:
            r23 = 1161904947(0x45414333, double:5.74057318E-315)
            int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x0143
            goto L_0x0163
        L_0x0143:
            r23 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x014d
        L_0x014a:
            r3 = 172(0xac, float:2.41E-43)
            goto L_0x015d
        L_0x014d:
            r23 = 1212503619(0x48455643, double:5.990563836E-315)
            int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x015d
            r3 = 36
            goto L_0x015d
        L_0x0157:
            r13 = 106(0x6a, float:1.49E-43)
            if (r4 != r13) goto L_0x015f
        L_0x015b:
            r3 = 129(0x81, float:1.81E-43)
        L_0x015d:
            r7 = 4
            goto L_0x01c1
        L_0x015f:
            r13 = 122(0x7a, float:1.71E-43)
            if (r4 != r13) goto L_0x0166
        L_0x0163:
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x015d
        L_0x0166:
            r13 = 127(0x7f, float:1.78E-43)
            if (r4 != r13) goto L_0x0171
            int r4 = r26.mo14560n()
            if (r4 != r14) goto L_0x015d
            goto L_0x014a
        L_0x0171:
            r13 = 123(0x7b, float:1.72E-43)
            if (r4 != r13) goto L_0x0178
            r3 = 138(0x8a, float:1.93E-43)
            goto L_0x015d
        L_0x0178:
            r13 = 10
            if (r4 != r13) goto L_0x0185
            java.lang.String r4 = r1.mo14541E(r7)
            java.lang.String r17 = r4.trim()
            goto L_0x015d
        L_0x0185:
            r13 = 89
            if (r4 != r13) goto L_0x01ba
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x018e:
            int r4 = r26.mo14553g()
            if (r4 >= r9) goto L_0x01b4
            java.lang.String r4 = r1.mo14541E(r7)
            java.lang.String r4 = r4.trim()
            r26.mo14560n()
            r7 = 4
            byte[] r13 = new byte[r7]
            r14 = 0
            r1.mo14559m(r13, r14, r7)
            com.google.ads.interactivemedia.v3.internal.pn r14 = new com.google.ads.interactivemedia.v3.internal.pn
            r14.<init>(r4, r13)
            r3.add(r14)
            r7 = 3
            r13 = 89
            r14 = 21
            goto L_0x018e
        L_0x01b4:
            r7 = 4
            r18 = r3
            r3 = 89
            goto L_0x01c1
        L_0x01ba:
            r7 = 4
            r13 = 111(0x6f, float:1.56E-43)
            if (r4 != r13) goto L_0x01c1
            r3 = 257(0x101, float:3.6E-43)
        L_0x01c1:
            int r4 = r26.mo14553g()
            int r9 = r9 - r4
            r1.mo14557k(r9)
            r7 = 3
            r9 = 4
            r13 = 5
            r14 = 21
            goto L_0x010f
        L_0x01d0:
            r7 = 4
            r1.mo14554h(r12)
            com.google.ads.interactivemedia.v3.internal.po r4 = new com.google.ads.interactivemedia.v3.internal.po
            byte[] r9 = r26.mo14555i()
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r11, r12)
            r11 = r17
            r12 = r18
            r4.<init>(r3, r11, r12, r9)
            r3 = 6
            if (r5 == r3) goto L_0x01eb
            r3 = 5
            if (r5 != r3) goto L_0x01ed
        L_0x01eb:
            int r5 = r4.f23514a
        L_0x01ed:
            int r10 = r10 + 5
            int r8 = r8 - r10
            com.google.ads.interactivemedia.v3.internal.pm r3 = r0.f23487a
            int r3 = r3.f23493b
            r9 = 2
            if (r3 != r9) goto L_0x01fb
            r3 = r5
            goto L_0x01fc
        L_0x01fb:
            r3 = r15
        L_0x01fc:
            com.google.ads.interactivemedia.v3.internal.pm r10 = r0.f23487a
            android.util.SparseBooleanArray r10 = r10.f23500i
            boolean r10 = r10.get(r3)
            if (r10 == 0) goto L_0x020b
            r9 = 21
            goto L_0x0247
        L_0x020b:
            com.google.ads.interactivemedia.v3.internal.pm r10 = r0.f23487a
            int r10 = r10.f23493b
            if (r10 != r9) goto L_0x021e
            r9 = 21
            if (r5 != r9) goto L_0x0220
            com.google.ads.interactivemedia.v3.internal.pm r4 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.pr r4 = r4.f23509r
            goto L_0x022a
        L_0x021e:
            r9 = 21
        L_0x0220:
            com.google.ads.interactivemedia.v3.internal.pm r10 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.pp r10 = r10.f23498g
            com.google.ads.interactivemedia.v3.internal.pr r4 = r10.mo16224b(r5, r4)
        L_0x022a:
            com.google.ads.interactivemedia.v3.internal.pm r5 = r0.f23487a
            int r5 = r5.f23493b
            r10 = 2
            if (r5 != r10) goto L_0x023d
            android.util.SparseIntArray r5 = r0.f23490d
            r10 = 8192(0x2000, float:1.14794E-41)
            int r5 = r5.get(r3, r10)
            if (r15 >= r5) goto L_0x0247
        L_0x023d:
            android.util.SparseIntArray r5 = r0.f23490d
            r5.put(r3, r15)
            android.util.SparseArray r5 = r0.f23489c
            r5.put(r3, r4)
        L_0x0247:
            r3 = 2
            r4 = 0
            r5 = 1
            r7 = 3
            r9 = 4
            r10 = 13
            r11 = 12
            r12 = 8192(0x2000, float:1.14794E-41)
            r14 = 21
            goto L_0x00de
        L_0x0256:
            android.util.SparseIntArray r1 = r0.f23490d
            int r1 = r1.size()
            r14 = 0
        L_0x025d:
            if (r14 >= r1) goto L_0x02b2
            android.util.SparseIntArray r3 = r0.f23490d
            int r3 = r3.keyAt(r14)
            android.util.SparseIntArray r4 = r0.f23490d
            int r4 = r4.valueAt(r14)
            com.google.ads.interactivemedia.v3.internal.pm r5 = r0.f23487a
            android.util.SparseBooleanArray r5 = r5.f23500i
            r7 = 1
            r5.put(r3, r7)
            com.google.ads.interactivemedia.v3.internal.pm r5 = r0.f23487a
            android.util.SparseBooleanArray r5 = r5.f23501j
            r5.put(r4, r7)
            android.util.SparseArray r5 = r0.f23489c
            java.lang.Object r5 = r5.valueAt(r14)
            com.google.ads.interactivemedia.v3.internal.pr r5 = (com.google.ads.interactivemedia.p367v3.internal.C7208pr) r5
            if (r5 == 0) goto L_0x02ad
            com.google.ads.interactivemedia.v3.internal.pm r7 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.pr r7 = r7.f23509r
            if (r5 == r7) goto L_0x02a1
            com.google.ads.interactivemedia.v3.internal.pm r7 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.ka r7 = r7.f23504m
            com.google.ads.interactivemedia.v3.internal.pq r8 = new com.google.ads.interactivemedia.v3.internal.pq
            r9 = 8192(0x2000, float:1.14794E-41)
            r8.<init>(r6, r3, r9)
            r5.mo16257a(r2, r7, r8)
            goto L_0x02a3
        L_0x02a1:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x02a3:
            com.google.ads.interactivemedia.v3.internal.pm r3 = r0.f23487a
            android.util.SparseArray r3 = r3.f23499h
            r3.put(r4, r5)
            goto L_0x02af
        L_0x02ad:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x02af:
            int r14 = r14 + 1
            goto L_0x025d
        L_0x02b2:
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            int r1 = r1.f23493b
            r2 = 2
            if (r1 != r2) goto L_0x02d8
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            boolean r1 = r1.f23506o
            if (r1 != 0) goto L_0x0311
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.ka r1 = r1.f23504m
            r1.mo16114al()
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            r2 = 0
            r1.f23505n = r2
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            r1.f23506o = true
            return
        L_0x02d8:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            android.util.SparseArray r1 = r1.f23499h
            int r3 = r0.f23491e
            r1.remove(r3)
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            int r3 = r1.f23493b
            r4 = 1
            if (r3 != r4) goto L_0x02ef
            r4 = 0
            goto L_0x02f8
        L_0x02ef:
            com.google.ads.interactivemedia.v3.internal.pm r2 = r0.f23487a
            int r2 = r2.f23505n
            r3 = -1
            int r4 = r2 + -1
        L_0x02f8:
            r1.f23505n = r4
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            int r1 = r1.f23505n
            if (r1 != 0) goto L_0x0311
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            com.google.ads.interactivemedia.v3.internal.ka r1 = r1.f23504m
            r1.mo16114al()
            com.google.ads.interactivemedia.v3.internal.pm r1 = r0.f23487a
            r1.f23506o = true
        L_0x0311:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7202pl.mo16256b(com.google.ads.interactivemedia.v3.internal.aee):void");
    }
}

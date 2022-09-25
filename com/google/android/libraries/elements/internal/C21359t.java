package com.google.android.libraries.elements.internal;

import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.p370af.C7490c;
import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68037a;
import com.youtube.p5283a.p5284a.C68039ab;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68046ai;
import com.youtube.p5283a.p5284a.C68054aq;
import com.youtube.p5283a.p5284a.C68073bi;
import com.youtube.p5283a.p5284a.C68084f;
import com.youtube.p5283a.p5284a.C68085g;
import com.youtube.p5283a.p5284a.C68097s;
import com.youtube.p5283a.p5284a.C68100v;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.elements.internal.t */
/* compiled from: PG */
public final class C21359t {

    /* renamed from: a */
    private final C21259bb f59725a;

    public C21359t(C21259bb bbVar) {
        this.f59725a = bbVar;
    }

    /* renamed from: a */
    public static int m40376a(C7490c cVar, C68085g gVar) {
        int i;
        int i2;
        C7490c cVar2;
        C68085g gVar2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        C7490c cVar3 = cVar;
        C68085g gVar3 = gVar;
        int i6 = 0;
        if (gVar3 == null || gVar.mo60230y() == null) {
            return 0;
        }
        int b = cVar3.mo16894b(gVar.mo60230y());
        float g = gVar.mo60216g();
        int h = gVar.mo60217h();
        int p = gVar.mo60221p();
        if (gVar.mo60219j() == 0) {
            i = 0;
        } else {
            int[] iArr2 = new int[gVar.mo60219j()];
            for (int i7 = 0; i7 < gVar.mo60219j(); i7++) {
                C68097s t = gVar3.mo60225t(i7);
                int c = m40378c(cVar3, t.mo60249k());
                int c2 = m40378c(cVar3, t.mo60248j());
                iArr2[i7] = C68097s.m98424g(cVar, t.mo60247i(), t.mo60246h(), c, c2);
            }
            i = C68085g.m98390l(cVar3, iArr2);
        }
        if (gVar.mo60222q() == 0) {
            cVar2 = cVar3;
            i2 = 0;
        } else {
            int[] iArr3 = new int[gVar.mo60222q()];
            int i8 = 0;
            while (i8 < gVar.mo60222q()) {
                C68073bi w = gVar3.mo60228w(i8);
                long r = w.mo60189r();
                long q = w.mo60188q();
                if (w.mo60193v() == null) {
                    i4 = 0;
                } else {
                    i4 = cVar3.mo16894b(w.mo60193v());
                }
                float h2 = w.mo60180h();
                long p2 = w.mo60187p();
                int m = w.mo60184m();
                int o = m40389o(cVar3, w.mo60191t());
                float i9 = w.mo60181i();
                long s = w.mo60190s();
                int n = w.mo60185n();
                boolean w2 = w.mo60194w();
                int l = w.mo60183l();
                int j = w.mo60182j();
                if (w.mo60192u() == null) {
                    iArr = iArr3;
                    i5 = 0;
                } else {
                    iArr = iArr3;
                    i5 = cVar3.mo16894b(w.mo60192u());
                }
                int[] iArr4 = iArr;
                int i10 = i8;
                int k = C68073bi.m98348k(cVar, r, q, i4, h2, p2, m, o, i9, s, n, w2, l, j, i5, w.mo60186o(), w.mo60179g());
                int[] iArr5 = iArr4;
                iArr5[i10] = k;
                i8 = i10 + 1;
                cVar3 = cVar;
                gVar3 = gVar;
                iArr3 = iArr5;
            }
            cVar2 = cVar3;
            i2 = C68085g.m98392n(cVar2, iArr3);
        }
        if (gVar.mo60218i() == 0) {
            gVar2 = gVar;
            i3 = 0;
        } else {
            int[] iArr6 = new int[gVar.mo60218i()];
            for (int i11 = 0; i11 < gVar.mo60218i(); i11++) {
                C68084f s2 = gVar.mo60224s(i11);
                int b2 = m40377b(cVar2, s2.mo60215k());
                iArr6[i11] = C68084f.m98384h(cVar, s2.mo60214j(), s2.mo60213i(), b2, s2.mo60212g());
            }
            gVar2 = gVar;
            i3 = C68085g.m98389k(cVar2, iArr6);
        }
        boolean z = gVar.mo60231z();
        int r2 = gVar.mo60223r();
        if (gVar.mo60220o() != 0) {
            int[] iArr7 = new int[gVar.mo60220o()];
            for (int i12 = 0; i12 < gVar.mo60220o(); i12++) {
                iArr7[i12] = m40378c(cVar2, gVar2.mo60226u(i12).mo60255h());
            }
            int[] iArr8 = new int[gVar.mo60220o()];
            for (int i13 = 0; i13 < gVar.mo60220o(); i13++) {
                iArr8[i13] = C68100v.m98434g(cVar2, iArr7[i13]);
            }
            i6 = C68085g.m98391m(cVar2, iArr8);
        }
        return m40380e(cVar, b, g, h, p, i, i2, i3, z, r2, i6, m40379d(cVar2, gVar.mo60227v()));
    }

    /* renamed from: b */
    static int m40377b(C7490c cVar, C68039ab abVar) {
        int i;
        int i2 = 0;
        if (abVar == null) {
            return 0;
        }
        int c = m40378c(cVar, abVar.mo60097k());
        int o = m40389o(cVar, abVar.mo60099m());
        if (abVar.mo60095g() > 0) {
            int g = abVar.mo60095g();
            int[] iArr = new int[g];
            for (int i3 = 0; i3 < abVar.mo60095g(); i3++) {
                iArr[i3] = m40377b(cVar, abVar.mo60096i(i3));
            }
            cVar.mo16907o(4, g, 4);
            while (true) {
                g--;
                if (g < 0) {
                    break;
                }
                cVar.mo16900h(iArr[g]);
            }
            i = cVar.mo16896d();
        } else {
            i = 0;
        }
        if (abVar.mo60100n() != null) {
            i2 = cVar.mo16894b(abVar.mo60100n());
        }
        return C68039ab.m98252h(cVar, c, o, i, i2);
    }

    /* renamed from: c */
    static int m40378c(C7490c cVar, C68044ag agVar) {
        int i = 0;
        if (agVar == null) {
            return 0;
        }
        if (agVar.mo60105h() > 0) {
            byte[] bArr = new byte[agVar.mo60105h()];
            agVar.mo16918f(6).get(bArr);
            i = cVar.mo16893a(bArr);
        }
        return C68044ag.m98267g(cVar, agVar.mo60106i(), i, agVar.mo60107j());
    }

    /* renamed from: d */
    public static int m40379d(C7490c cVar, C68046ai aiVar) {
        if (aiVar == null) {
            return 0;
        }
        float g = aiVar.mo60111g();
        int a = aiVar.mo16913a(6);
        int i = a != 0 ? aiVar.f24704b.getInt(a + aiVar.f24703a) : 0;
        cVar.mo16906n(2);
        cVar.mo16909r(1, i);
        cVar.mo16908q(0, g);
        return cVar.mo16895c();
    }

    /* renamed from: e */
    public static int m40380e(C7490c cVar, int i, float f, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, int i9) {
        cVar.mo16906n(13);
        cVar.mo16910s(0, i);
        cVar.mo16908q(1, f);
        cVar.mo16909r(2, i2);
        cVar.mo16909r(3, i3);
        cVar.mo16910s(4, i4);
        cVar.mo16910s(5, i5);
        cVar.mo16910s(8, i6);
        cVar.mo16898f(9, z, true);
        cVar.mo16909r(10, i7);
        cVar.mo16910s(11, i8);
        cVar.mo16910s(12, i9);
        return cVar.mo16895c();
    }

    /* renamed from: f */
    public static IntersectionCriteria m40381f(C68054aq aqVar) {
        int a = aqVar.mo16913a(4);
        float f = a != 0 ? aqVar.f24704b.getFloat(a + aqVar.f24703a) : 0.0f;
        int a2 = aqVar.mo16913a(6);
        return new IntersectionCriteria(f, a2 == 0 || aqVar.f24704b.getInt(a2 + aqVar.f24703a) != 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x043f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.youtube.p5283a.p5284a.C68085g m40382h(com.youtube.p5283a.p5284a.C68085g r35, com.google.android.libraries.elements.interfaces.C21319z r36, com.google.android.libraries.elements.interfaces.C21259bb r37) {
        /*
            r0 = r35
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = r35.mo60230y()
            if (r2 != 0) goto L_0x000d
            return r0
        L_0x000d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r35.mo60218i()
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x001d
        L_0x001a:
            r9 = r1
            goto L_0x00e0
        L_0x001d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.PriorityQueue r7 = new java.util.PriorityQueue
            com.google.android.libraries.elements.internal.al r8 = com.google.android.libraries.elements.internal.C21332al.f59692a
            r7.<init>(r5, r8)
            r8 = 0
        L_0x002a:
            int r9 = r35.mo60218i()
            if (r8 >= r9) goto L_0x0048
            com.youtube.a.a.f r9 = r0.mo60224s(r8)
            long r10 = r9.mo60213i()
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0042
            r7.add(r9)
            goto L_0x0045
        L_0x0042:
            r4.add(r9)
        L_0x0045:
            int r8 = r8 + 1
            goto L_0x002a
        L_0x0048:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0070
            int r7 = r4.size()
            r8 = 0
        L_0x0053:
            if (r8 >= r7) goto L_0x001a
            java.lang.Object r9 = r4.get(r8)
            r11 = r9
            com.youtube.a.a.f r11 = (com.youtube.p5283a.p5284a.C68084f) r11
            com.google.android.libraries.elements.internal.an r9 = new com.google.android.libraries.elements.internal.an
            long r12 = r11.mo60214j()
            long r14 = r11.mo60213i()
            r10 = r9
            r10.<init>(r11, r12, r14)
            r3.add(r9)
            int r8 = r8 + 1
            goto L_0x0053
        L_0x0070:
            int r8 = r7.size()
            int[] r9 = new int[r8]
            r10 = 0
        L_0x0077:
            boolean r11 = r7.isEmpty()
            if (r11 != 0) goto L_0x00a7
            java.lang.Object r11 = r7.poll()
            r13 = r11
            com.youtube.a.a.f r13 = (com.youtube.p5283a.p5284a.C68084f) r13
            if (r13 == 0) goto L_0x0077
            long r11 = r13.mo60214j()
            int r12 = (int) r11
            r9[r10] = r12
            long r11 = r13.mo60214j()
            com.google.android.libraries.elements.internal.an r14 = new com.google.android.libraries.elements.internal.an
            int r12 = (int) r11
            int r12 = r12 + r10
            long r11 = (long) r12
            r16 = 1
            r18 = r11
            r12 = r14
            r11 = r14
            r14 = r18
            r12.<init>(r13, r14, r16)
            r3.add(r11)
            int r10 = r10 + 1
            goto L_0x0077
        L_0x00a7:
            if (r10 >= r8) goto L_0x00ad
            int[] r9 = java.util.Arrays.copyOf(r9, r10)
        L_0x00ad:
            int r7 = r4.size()
            r8 = 0
        L_0x00b2:
            if (r8 >= r7) goto L_0x00e0
            java.lang.Object r10 = r4.get(r8)
            r12 = r10
            com.youtube.a.a.f r12 = (com.youtube.p5283a.p5284a.C68084f) r12
            long r10 = r12.mo60214j()
            int r11 = (int) r10
            long r13 = r12.mo60213i()
            int r10 = (int) r13
            com.google.android.libraries.elements.internal.am r10 = com.google.android.libraries.elements.internal.C21335ao.m40342a(r11, r10, r9, r6)
            com.google.android.libraries.elements.internal.an r15 = new com.google.android.libraries.elements.internal.an
            int r11 = r10.f59693a
            long r13 = (long) r11
            int r10 = r10.f59694b
            long r10 = (long) r10
            r16 = r10
            r11 = r15
            r10 = r15
            r15 = r16
            r11.<init>(r12, r13, r15)
            r3.add(r10)
            int r8 = r8 + 1
            goto L_0x00b2
        L_0x00e0:
            if (r9 == 0) goto L_0x043f
            int r4 = r9.length
            if (r4 != 0) goto L_0x00e7
            goto L_0x043f
        L_0x00e7:
            com.google.af.c r7 = new com.google.af.c
            r8 = 1024(0x400, float:1.435E-42)
            r7.<init>(r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r2)
            int r2 = r2.length()
        L_0x00f7:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0107
            r11 = r9[r4]
            if (r11 < 0) goto L_0x00f7
            if (r11 > r2) goto L_0x00f7
            r12 = 32
            r10.insert(r11, r12)
            goto L_0x00f7
        L_0x0107:
            java.lang.String r2 = r10.toString()
            int r2 = r7.mo16894b(r2)
            float r4 = r35.mo60216g()
            int r32 = r35.mo60217h()
            int r33 = r35.mo60221p()
            int r10 = r35.mo60219j()
            if (r10 != 0) goto L_0x0125
            r34 = r2
            r1 = 0
            goto L_0x0189
        L_0x0125:
            int r10 = r35.mo60219j()
            int[] r15 = new int[r10]
            r13 = 0
        L_0x012c:
            int r10 = r35.mo60219j()
            if (r13 >= r10) goto L_0x0182
            com.youtube.a.a.s r10 = r0.mo60225t(r13)
            com.youtube.a.a.ag r11 = r10.mo60249k()
            int r16 = m40378c(r7, r11)
            com.youtube.a.a.ag r11 = r10.mo60248j()
            int r17 = m40378c(r7, r11)
            long r11 = r10.mo60247i()
            long r18 = r10.mo60246h()
            int r14 = r9.length
            if (r14 <= 0) goto L_0x0168
            long r11 = r10.mo60247i()
            int r12 = (int) r11
            long r10 = r10.mo60246h()
            int r11 = (int) r10
            com.google.android.libraries.elements.internal.am r10 = com.google.android.libraries.elements.internal.C21335ao.m40342a(r12, r11, r9, r6)
            int r11 = r10.f59693a
            long r11 = (long) r11
            int r10 = r10.f59694b
            r34 = r2
            long r1 = (long) r10
            goto L_0x016c
        L_0x0168:
            r34 = r2
            r1 = r18
        L_0x016c:
            r10 = r7
            r18 = r13
            r13 = r1
            r1 = r15
            r15 = r16
            r16 = r17
            int r2 = com.youtube.p5283a.p5284a.C68097s.m98424g(r10, r11, r13, r15, r16)
            r1[r18] = r2
            int r13 = r18 + 1
            r15 = r1
            r2 = r34
            r1 = 0
            goto L_0x012c
        L_0x0182:
            r34 = r2
            r1 = r15
            int r1 = com.youtube.p5283a.p5284a.C68085g.m98390l(r7, r1)
        L_0x0189:
            int r2 = r35.mo60222q()
            if (r2 != 0) goto L_0x0192
            r2 = 0
            goto L_0x022d
        L_0x0192:
            int r2 = r35.mo60222q()
            int[] r2 = new int[r2]
            r15 = 0
        L_0x0199:
            int r10 = r35.mo60222q()
            if (r15 >= r10) goto L_0x0229
            com.youtube.a.a.bi r10 = r0.mo60228w(r15)
            long r11 = r10.mo60189r()
            long r13 = r10.mo60188q()
            int r8 = r9.length
            if (r8 <= 0) goto L_0x01c2
            long r11 = r10.mo60189r()
            int r8 = (int) r11
            long r11 = r10.mo60188q()
            int r12 = (int) r11
            com.google.android.libraries.elements.internal.am r8 = com.google.android.libraries.elements.internal.C21335ao.m40342a(r8, r12, r9, r5)
            int r11 = r8.f59693a
            long r11 = (long) r11
            int r8 = r8.f59694b
            long r13 = (long) r8
        L_0x01c2:
            java.lang.String r8 = r10.mo60193v()
            if (r8 != 0) goto L_0x01ca
            r8 = 0
            goto L_0x01d2
        L_0x01ca:
            java.lang.String r8 = r10.mo60193v()
            int r8 = r7.mo16894b(r8)
        L_0x01d2:
            float r16 = r10.mo60180h()
            long r17 = r10.mo60187p()
            int r19 = r10.mo60184m()
            com.youtube.a.a.ah r5 = r10.mo60191t()
            int r20 = m40389o(r7, r5)
            float r21 = r10.mo60181i()
            long r22 = r10.mo60190s()
            int r24 = r10.mo60185n()
            boolean r25 = r10.mo60194w()
            int r26 = r10.mo60183l()
            int r27 = r10.mo60182j()
            java.lang.String r5 = r10.mo60192u()
            if (r5 != 0) goto L_0x0207
            r28 = 0
            goto L_0x0211
        L_0x0207:
            java.lang.String r5 = r10.mo60192u()
            int r5 = r7.mo16894b(r5)
            r28 = r5
        L_0x0211:
            long r29 = r10.mo60186o()
            float r31 = r10.mo60179g()
            r10 = r7
            r5 = r15
            r15 = r8
            int r8 = com.youtube.p5283a.p5284a.C68073bi.m98348k(r10, r11, r13, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r31)
            r2[r5] = r8
            int r15 = r5 + 1
            r5 = 1
            r8 = 1024(0x400, float:1.435E-42)
            goto L_0x0199
        L_0x0229:
            int r2 = com.youtube.p5283a.p5284a.C68085g.m98392n(r7, r2)
        L_0x022d:
            int r5 = r3.size()
        L_0x0231:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x023f
            java.lang.Object r8 = r3.get(r5)
            if (r8 != 0) goto L_0x023e
            r3.remove(r5)
        L_0x023e:
            goto L_0x0231
        L_0x023f:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0248
            r6 = r7
            r3 = 0
            goto L_0x028e
        L_0x0248:
            int r5 = r3.size()
            int[] r5 = new int[r5]
            r8 = 0
        L_0x024f:
            int r10 = r3.size()
            if (r8 >= r10) goto L_0x0289
            java.lang.Object r10 = r3.get(r8)
            com.google.android.libraries.elements.internal.an r10 = (com.google.android.libraries.elements.internal.C21334an) r10
            java.lang.Object r11 = r10.f59695a
            com.youtube.a.a.f r11 = (com.youtube.p5283a.p5284a.C68084f) r11
            com.youtube.a.a.ab r11 = r11.mo60215k()
            int r15 = m40377b(r7, r11)
            com.google.android.libraries.elements.internal.am r11 = r10.f59696b
            int r12 = r11.f59693a
            long r12 = (long) r12
            int r11 = r11.f59694b
            r22 = r7
            long r6 = (long) r11
            java.lang.Object r10 = r10.f59695a
            com.youtube.a.a.f r10 = (com.youtube.p5283a.p5284a.C68084f) r10
            int r16 = r10.mo60212g()
            r10 = r22
            r11 = r12
            r13 = r6
            int r6 = com.youtube.p5283a.p5284a.C68084f.m98384h(r10, r11, r13, r15, r16)
            r5[r8] = r6
            int r8 = r8 + 1
            r7 = r22
            r6 = 0
            goto L_0x024f
        L_0x0289:
            r6 = r7
            int r3 = com.youtube.p5283a.p5284a.C68085g.m98389k(r6, r5)
        L_0x028e:
            boolean r18 = r35.mo60231z()
            int r19 = r35.mo60223r()
            int r5 = r35.mo60220o()
            if (r5 != 0) goto L_0x02a8
            r24 = r1
            r23 = r2
            r22 = r3
            r25 = r4
            r20 = 0
            goto L_0x0401
        L_0x02a8:
            int r5 = r35.mo60220o()
            int[] r5 = new int[r5]
            r7 = 0
        L_0x02af:
            int r8 = r35.mo60220o()
            if (r7 >= r8) goto L_0x03f2
            com.youtube.a.a.v r8 = r0.mo60226u(r7)
            if (r8 == 0) goto L_0x02c0
            com.youtube.a.a.ag r8 = r8.mo60255h()
            goto L_0x02c1
        L_0x02c0:
            r8 = 0
        L_0x02c1:
            if (r8 == 0) goto L_0x03c6
            int r10 = r8.mo60106i()
            switch(r10) {
                case 381326004: goto L_0x03ae;
                case 381326005: goto L_0x03ae;
                case 389740320: goto L_0x02fa;
                default: goto L_0x02ca;
            }
        L_0x02ca:
            r24 = r1
            r23 = r2
            r22 = r3
            r25 = r4
            r26 = r5
            r20 = r9
            r1 = 1
            r12 = 0
            int r0 = m40378c(r6, r8)
            com.google.protos.youtube.elements.r r2 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INTERNAL_ERROR
            int r3 = r8.mo60106i()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unssuported TextDecorator adjustment. Extension: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = r36
            r5 = r37
            r8 = 0
            r5.mo25782a(r2, r3, r4, r8)
            goto L_0x03da
        L_0x02fa:
            r10 = 6
            java.nio.ByteBuffer r11 = r8.mo16918f(r10)
            com.youtube.a.a.ak r11 = com.youtube.p5283a.p5284a.C68048ak.m98276o(r11)
            long r12 = r11.mo60120n()
            long r14 = r11.mo60119m()
            int r10 = r9.length
            if (r10 <= 0) goto L_0x0323
            long r12 = r11.mo60120n()
            int r10 = (int) r12
            long r12 = r11.mo60119m()
            int r13 = (int) r12
            r12 = 0
            com.google.android.libraries.elements.internal.am r10 = com.google.android.libraries.elements.internal.C21335ao.m40342a(r10, r13, r9, r12)
            int r12 = r10.f59693a
            long r12 = (long) r12
            int r10 = r10.f59694b
            long r14 = (long) r10
        L_0x0323:
            com.google.af.c r10 = new com.google.af.c
            r20 = r9
            r9 = 1024(0x400, float:1.435E-42)
            r10.<init>(r9)
            r21 = r10
            long r9 = r11.mo60118l()
            float r0 = r11.mo60113g()
            r22 = r3
            float r3 = r11.mo60115i()
            r23 = r2
            float r2 = r11.mo60116j()
            r24 = r1
            float r1 = r11.mo60117k()
            float r11 = r11.mo60114h()
            r25 = r4
            r4 = 8
            r26 = r5
            r5 = r21
            r5.mo16906n(r4)
            r4 = 7
            r5.mo16908q(r4, r11)
            r4 = 6
            r5.mo16908q(r4, r1)
            r1 = 5
            r5.mo16908q(r1, r2)
            r1 = 4
            r5.mo16908q(r1, r3)
            r1 = 3
            r5.mo16908q(r1, r0)
            r0 = 2
            int r1 = (int) r9
            r5.mo16909r(r0, r1)
            int r0 = (int) r14
            r1 = 1
            r5.mo16909r(r1, r0)
            int r0 = (int) r12
            r12 = 0
            r5.mo16909r(r12, r0)
            int r0 = r5.mo16895c()
            r5.mo16911t(r0)
            int r0 = r5.f24689b
            java.nio.ByteBuffer r2 = r5.f24688a
            int r2 = r2.capacity()
            int r3 = r5.f24689b
            r5.mo16902j()
            int r2 = r2 - r3
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r3 = r5.f24688a
            java.nio.Buffer r0 = r3.position(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = r5.f24688a
            r0.get(r2)
            int r0 = r6.mo16893a(r2)
            int r2 = r8.mo60107j()
            r3 = 389740320(0x173af720, float:6.0411757E-25)
            int r0 = com.youtube.p5283a.p5284a.C68044ag.m98267g(r6, r3, r0, r2)
            goto L_0x03c0
        L_0x03ae:
            r24 = r1
            r23 = r2
            r22 = r3
            r25 = r4
            r26 = r5
            r20 = r9
            r1 = 1
            r12 = 0
            int r0 = m40378c(r6, r8)
        L_0x03c0:
            r4 = r36
            r5 = r37
            r8 = 0
            goto L_0x03da
        L_0x03c6:
            r24 = r1
            r23 = r2
            r22 = r3
            r25 = r4
            r26 = r5
            r20 = r9
            r1 = 1
            r8 = 0
            r12 = 0
            r4 = r36
            r5 = r37
            r0 = 0
        L_0x03da:
            int r0 = com.youtube.p5283a.p5284a.C68100v.m98434g(r6, r0)
            r26[r7] = r0
            int r7 = r7 + 1
            r0 = r35
            r9 = r20
            r3 = r22
            r2 = r23
            r1 = r24
            r4 = r25
            r5 = r26
            goto L_0x02af
        L_0x03f2:
            r24 = r1
            r23 = r2
            r22 = r3
            r25 = r4
            r0 = r5
            int r0 = com.youtube.p5283a.p5284a.C68085g.m98391m(r6, r0)
            r20 = r0
        L_0x0401:
            com.youtube.a.a.ai r0 = r35.mo60227v()
            int r21 = m40379d(r6, r0)
            r10 = r6
            r11 = r34
            r12 = r25
            r13 = r32
            r14 = r33
            r15 = r24
            r16 = r23
            r17 = r22
            int r0 = m40380e(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r6.mo16911t(r0)
            r6.mo16902j()
            java.nio.ByteBuffer r0 = r6.f24688a
            com.youtube.a.a.g r1 = new com.youtube.a.a.g
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r2)
            int r2 = r0.position()
            int r2 = r0.getInt(r2)
            int r3 = r0.position()
            int r2 = r2 + r3
            r1.mo16917e(r2, r0)
            return r1
        L_0x043f:
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.internal.C21359t.m40382h(com.youtube.a.a.g, com.google.android.libraries.elements.interfaces.z, com.google.android.libraries.elements.interfaces.bb):com.youtube.a.a.g");
    }

    /* renamed from: i */
    public static C68044ag m40383i(C68045ah ahVar, int i) {
        if (ahVar == null) {
            return null;
        }
        C68044ag agVar = new C68044ag();
        for (int i2 = 0; i2 < ahVar.mo60108g(); i2++) {
            ahVar.mo60110i(agVar, i2);
            if (agVar.mo60106i() == i) {
                return agVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m40384j(C68044ag agVar) {
        return String.format("(format:%d id:%d datalength:%d)", new Object[]{Integer.valueOf(agVar.mo60107j()), Integer.valueOf(agVar.mo60106i()), Integer.valueOf(agVar.mo60105h())});
    }

    /* renamed from: k */
    public static ByteBuffer m40385k(C68045ah ahVar, int i) {
        C68044ag i2 = m40383i(ahVar, i);
        if (i2 == null) {
            return null;
        }
        return i2.mo16918f(6);
    }

    /* renamed from: l */
    public static boolean m40386l(C68045ah ahVar, C7492e eVar, int i, C21358s sVar) {
        ByteBuffer k = m40385k(ahVar, i);
        if (k == null) {
            return false;
        }
        sVar.mo25887a(k, eVar);
        return true;
    }

    /* renamed from: m */
    public static boolean m40387m(C7492e eVar, C7492e eVar2) {
        if (eVar == null && eVar2 == null) {
            return true;
        }
        if (!(eVar == null || eVar2 == null)) {
            ByteBuffer byteBuffer = eVar.f24704b;
            ByteBuffer byteBuffer2 = eVar2.f24704b;
            if (byteBuffer == null && byteBuffer2 == null) {
                return true;
            }
            if (!(byteBuffer == null || byteBuffer2 == null)) {
                if (byteBuffer.hasArray() && byteBuffer2.hasArray() && byteBuffer.arrayOffset() == byteBuffer2.arrayOffset() && byteBuffer.capacity() == byteBuffer2.capacity() && byteBuffer.position() == byteBuffer2.position() && byteBuffer.remaining() == byteBuffer2.remaining() && byteBuffer.array() == byteBuffer2.array()) {
                    return true;
                }
                return eVar.f24704b.equals(eVar2.f24704b);
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m40388n(C68045ah ahVar, C68037a aVar) {
        return m40386l(ahVar, aVar, 168774763, C21353n.f59718a);
    }

    /* renamed from: o */
    private static int m40389o(C7490c cVar, C68045ah ahVar) {
        if (ahVar == null) {
            return 0;
        }
        int g = ahVar.mo60108g();
        int[] iArr = new int[g];
        for (int i = 0; i < ahVar.mo60108g(); i++) {
            iArr[i] = m40378c(cVar, ahVar.mo60109h(i));
        }
        cVar.mo16907o(4, g, 4);
        while (true) {
            g--;
            if (g >= 0) {
                cVar.mo16900h(iArr[g]);
            } else {
                int d = cVar.mo16896d();
                cVar.mo16906n(1);
                cVar.mo16910s(0, d);
                return cVar.mo16895c();
            }
        }
    }

    /* renamed from: g */
    public final C21357r mo26863g(C68044ag agVar, C21319z zVar) {
        if (agVar == null) {
            return null;
        }
        return new C21357r(agVar, this.f59725a, zVar);
    }
}

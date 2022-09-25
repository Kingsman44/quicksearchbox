package com.google.common.p4535g;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.g.ap */
/* compiled from: PG */
public final class C59123ap {

    /* renamed from: a */
    public static final C59218l f157123a = new C59218l(1.5E-15d);

    /* renamed from: b */
    public static final double f157124b = (C59222p.f157311c * 3.0d);

    /* renamed from: c */
    public static final double f157125c;

    /* renamed from: d */
    public static final double f157126d;

    /* renamed from: e */
    public static final double f157127e;

    static {
        double d = C59222p.f157309a;
        double d2 = C59222p.f157311c;
        f157125c = d * 9.0d * d2;
        f157126d = 2.25d * d2;
        f157127e = d2 * 8.0d;
    }

    /* renamed from: a */
    public static double m91581a(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3) {
        C58838bb.m90868c(!bbVar2.mo56506q(bbVar3));
        double a = bbVar.mo56496a(bbVar2);
        return a / (bbVar.mo56496a(bbVar3) + a);
    }

    /* renamed from: b */
    static double m91582b(C59136bb bbVar, C59136bb bbVar2, double d, C59136bb bbVar3, C59136bb bbVar4, C59122ao aoVar) {
        double d2;
        double d3;
        C59136bb o = C59136bb.m91672o(bbVar, bbVar3);
        C59136bb o2 = C59136bb.m91672o(bbVar, bbVar4);
        double e = o.mo56501e();
        double e2 = o2.mo56501e();
        if (e < e2 || (e == e2 && o.mo56507r(o2))) {
            double sqrt = Math.sqrt(e);
            d3 = o.mo56497b(bbVar2);
            d2 = sqrt;
        } else {
            d2 = Math.sqrt(e2);
            d3 = o2.mo56497b(bbVar2);
        }
        double d4 = C59222p.f157311c;
        double sqrt2 = Math.sqrt(3.0d);
        aoVar.f157122a = d4 * ((d2 * (((sqrt2 + sqrt2 + 3.5d) * d) + (Math.sqrt(3.0d) * 32.0d * C59222p.f157311c))) + (Math.abs(d3) * 1.5d));
        return d3;
    }

    /* renamed from: c */
    static double m91583c(double d, double d2, double d3, double d4, double d5) {
        return Math.abs(d2 - d) <= Math.abs(d3 - d) ? d4 + (((d5 - d4) * (d - d2)) / (d3 - d2)) : d5 + (((d4 - d5) * (d - d3)) / (d2 - d3));
    }

    /* renamed from: d */
    static int m91584d(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3, C59136bb bbVar4, C59136bb bbVar5, double d, C59216j jVar) {
        C59136bb bbVar6 = bbVar2;
        C59216j jVar2 = jVar;
        double d2 = 1.0d - f157125c;
        double d3 = bbVar6.f157164g;
        int i = 0;
        if (d3 > C59203do.f157270a) {
            double d4 = bbVar6.f157162e / d3;
            double d5 = bbVar6.f157163f;
            jVar2.f157293a = d4;
            jVar2.f157294b = d5 / d3;
            if (Math.max(Math.abs(d4), Math.abs(jVar2.f157294b)) <= d2) {
                return 0;
            }
        }
        m91591k(bbVar3, m91585e(bbVar3), jVar2);
        double d6 = jVar2.f157293a * d;
        jVar2.f157293a = d6;
        double d7 = jVar2.f157294b * d;
        jVar2.f157294b = d7;
        C59136bb bbVar7 = new C59136bb(d6, d7, 1.0d);
        if (C59136bb.m91672o(bbVar7, bbVar).mo56497b(bbVar4) < C59203do.f157270a) {
            i = 2;
        } else if (C59136bb.m91672o(bbVar7, bbVar6).mo56497b(bbVar5) < C59203do.f157270a) {
            i = 1;
        }
        if (i <= 0) {
            return i;
        }
        double d8 = bbVar6.f157164g;
        if (d8 <= C59203do.f157270a) {
            return 3;
        }
        double d9 = bbVar6.f157162e;
        double d10 = bbVar6.f157163f;
        jVar2.f157293a = d9 / d8;
        jVar2.f157294b = d10 / d8;
        return i;
    }

    /* renamed from: e */
    static int m91585e(C59136bb bbVar) {
        double abs = Math.abs(bbVar.f157162e);
        double abs2 = Math.abs(bbVar.f157163f);
        double abs3 = Math.abs(bbVar.f157164g);
        double d = abs - abs2;
        if (Math.abs(d) == abs3 ? !(abs < abs2 ? abs2 - abs3 < abs : abs - abs3 < abs2) : Math.abs(d) >= abs3) {
            return Math.abs(bbVar.f157162e) >= Math.abs(bbVar.f157163f) ? 1 : 0;
        }
        return ((bbVar.f157164g > C59203do.f157270a ? 1 : (bbVar.f157164g == C59203do.f157270a ? 0 : -1)) < 0) ^ (((bbVar.f157162e > C59203do.f157270a ? 1 : (bbVar.f157162e == C59203do.f157270a ? 0 : -1)) < 0) ^ ((bbVar.f157163f > C59203do.f157270a ? 1 : (bbVar.f157163f == C59203do.f157270a ? 0 : -1)) < 0)) ? 0 : 1;
    }

    /* renamed from: f */
    static int m91586f(C59136bb bbVar, C59136bb bbVar2, C59120am[] amVarArr) {
        int i;
        C59136bb bbVar3 = bbVar;
        C59136bb bbVar4 = bbVar2;
        C59120am amVar = amVarArr[0];
        int f = C59164cc.m91752f(bbVar);
        amVar.f157119a = f;
        C59164cc.m91761p(f, bbVar3, amVar.f157120b);
        int f2 = C59164cc.m91752f(bbVar2);
        C59164cc.m91761p(f2, bbVar4, amVar.f157121c);
        if (amVar.f157119a == f2) {
            return 1;
        }
        C59136bb h = C59222p.m91902h(bbVar, bbVar2);
        amVar.f157119a = m91587g(amVar.f157119a, bbVar3, h, amVar.f157120b);
        int g = m91587g(f2, bbVar4, C59136bb.m91670m(h), amVar.f157121c);
        amVarArr[5].f157121c.mo56601b(amVar.f157121c);
        int i2 = 1;
        while (true) {
            int i3 = amVar.f157119a;
            if (i3 != g) {
                C59136bb l = C59164cc.m91757l(i3, h);
                int e = m91585e(l);
                m91591k(l, e, amVar.f157121c);
                int i4 = amVar.f157119a;
                C59216j jVar = amVar.f157121c;
                int i5 = 1 - e;
                if (Math.abs(jVar.mo56600a(i5)) == 1.0d) {
                    if (C59164cc.f157202d[i4][i5][jVar.mo56600a(i5) > C59203do.f157270a ? (char) 1 : 0] == g) {
                        double d = jVar.f157293a * l.f157162e;
                        double d2 = jVar.f157294b * l.f157163f;
                        double d3 = -l.f157164g;
                        if (d + d2 == d3 && d == d3 - d2 && d2 == d3 - d) {
                            i = g;
                            C59136bb l2 = C59164cc.m91757l(i, C59164cc.m91755j(amVar.f157119a, amVar.f157121c));
                            int i6 = i2 + 1;
                            C59120am amVar2 = amVarArr[i2];
                            amVar2.f157119a = i;
                            C59216j jVar2 = amVar2.f157120b;
                            double d4 = l2.f157162e;
                            double d5 = l2.f157163f;
                            jVar2.f157293a = d4;
                            jVar2.f157294b = d5;
                            C59120am amVar3 = amVar2;
                            i2 = i6;
                            amVar = amVar3;
                        }
                    }
                }
                i = C59164cc.f157202d[i4][e][jVar.mo56600a(e) > C59203do.f157270a ? (char) 1 : 0];
                C59136bb l22 = C59164cc.m91757l(i, C59164cc.m91755j(amVar.f157119a, amVar.f157121c));
                int i62 = i2 + 1;
                C59120am amVar22 = amVarArr[i2];
                amVar22.f157119a = i;
                C59216j jVar22 = amVar22.f157120b;
                double d42 = l22.f157162e;
                double d52 = l22.f157163f;
                jVar22.f157293a = d42;
                jVar22.f157294b = d52;
                C59120am amVar32 = amVar22;
                i2 = i62;
                amVar = amVar32;
            } else {
                amVar.f157121c.mo56601b(amVarArr[5].f157121c);
                return i2;
            }
        }
    }

    /* renamed from: g */
    static int m91587g(int i, C59136bb bbVar, C59136bb bbVar2, C59216j jVar) {
        int i2;
        int i3 = i;
        C59136bb bbVar3 = bbVar;
        C59216j jVar2 = jVar;
        double d = f157125c;
        double d2 = jVar2.f157293a;
        double d3 = jVar2.f157294b;
        if (Math.max(Math.abs(d2), Math.abs(d3)) <= 1.0d - d) {
            return i3;
        }
        C59136bb l = C59164cc.m91757l(i3, bbVar2);
        if (m91593m(l)) {
            m91591k(l, m91585e(l), jVar2);
            C59136bb j = C59164cc.m91755j(i3, jVar2);
            if (C59136bb.m91672o(j, bbVar3).mo56497b(C59136bb.m91668k(C59136bb.m91671n(bbVar2), bbVar3)) >= (-f157124b)) {
                jVar2.f157293a = d2;
                jVar2.f157294b = d3;
                return i3;
            }
        }
        char c = 1;
        char c2 = 0;
        if (Math.abs(d2) >= Math.abs(d3)) {
            if (d2 <= C59203do.f157270a) {
                c = 0;
            }
            i2 = C59164cc.f157202d[i3][0][c];
        } else {
            if (d3 > C59203do.f157270a) {
                c2 = 1;
            }
            i2 = C59164cc.f157202d[i3][1][c2];
        }
        C59164cc.m91761p(i2, bbVar3, jVar2);
        double max = Math.max(-1.0d, Math.min(1.0d, jVar2.f157293a));
        double max2 = Math.max(-1.0d, Math.min(1.0d, jVar2.f157294b));
        jVar2.f157293a = max;
        jVar2.f157294b = max2;
        return i2;
    }

    /* renamed from: h */
    public static C59218l m91588h(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3) {
        double d;
        C58838bb.m90873h(C59222p.m91903i(bbVar), "S2Point not normalized: %s", bbVar);
        C58838bb.m90873h(C59222p.m91903i(bbVar2), "S2Point not normalized: %s", bbVar2);
        C58838bb.m90873h(C59222p.m91903i(bbVar3), "S2Point not normalized: %s", bbVar3);
        C59136bb h = C59222p.m91902h(bbVar2, bbVar3);
        if (!m91597q(h, bbVar2, bbVar) || !m91597q(bbVar, bbVar3, h)) {
            double asin = Math.asin(Math.min(1.0d, Math.sqrt(Math.min(m91595o(bbVar, bbVar2), m91595o(bbVar, bbVar3))) * 0.5d));
            d = asin + asin;
        } else {
            d = Math.asin(Math.min(1.0d, Math.abs(bbVar.mo56497b(h)) / Math.sqrt(h.mo56501e())));
        }
        return new C59218l(d);
    }

    /* renamed from: i */
    public static C59219m m91589i(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3, C59219m mVar) {
        C58838bb.m90873h(C59222p.m91903i(bbVar), "S2Point not normalized: %s", bbVar);
        C58838bb.m90873h(C59222p.m91903i(bbVar2), "S2Point not normalized: %s", bbVar2);
        C58838bb.m90873h(C59222p.m91903i(bbVar3), "S2Point not normalized: %s", bbVar3);
        double d = bbVar.mo56500d(bbVar2);
        double d2 = bbVar.mo56500d(bbVar3);
        double d3 = bbVar2.mo56500d(bbVar3);
        double min = Math.min(d, d2);
        if (d + d2 < d3 + min + min) {
            C59136bb h = C59222p.m91902h(bbVar2, bbVar3);
            double e = h.mo56501e();
            double b = bbVar.mo56497b(h);
            double d4 = b * b;
            if (d4 >= mVar.f157305f * e) {
                return mVar;
            }
            C59136bb k = C59136bb.m91668k(h, bbVar);
            if (bbVar2.mo56497b(k) < C59203do.f157270a && bbVar3.mo56497b(k) > C59203do.f157270a) {
                double sqrt = 1.0d - Math.sqrt(k.mo56501e() / e);
                min = (d4 / e) + (sqrt * sqrt);
            }
        }
        if (min >= mVar.f157305f) {
            return mVar;
        }
        return C59219m.m91873d(min);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r8.mo56507r(r9) == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0117 A[RETURN] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4535g.C59136bb m91590j(com.google.common.p4535g.C59136bb r17, com.google.common.p4535g.C59136bb r18, com.google.common.p4535g.C59136bb r19, com.google.common.p4535g.C59136bb r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            com.google.common.g.ao r4 = new com.google.common.g.ao
            r4.<init>()
            com.google.common.g.al r5 = new com.google.common.g.al
            r5.<init>(r0, r1, r2)
            int r5 = r5.mo56434a(r3)
            r6 = 0
            r7 = 1
            if (r5 <= 0) goto L_0x001c
            r5 = 1
            goto L_0x001d
        L_0x001c:
            r5 = 0
        L_0x001d:
            java.lang.String r8 = "Input edges a0a1 and b0b1 must have a true robustCrossing."
            com.google.common.base.C58838bb.m90869d(r5, r8)
            double r8 = r1.mo56500d(r0)
            double r10 = r3.mo56500d(r2)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x0061
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x005c
            boolean r5 = r1.mo56507r(r0)
            if (r7 == r5) goto L_0x003a
            r5 = r0
            goto L_0x003b
        L_0x003a:
            r5 = r1
        L_0x003b:
            boolean r8 = r3.mo56507r(r2)
            if (r7 == r8) goto L_0x0043
            r9 = r3
            goto L_0x0044
        L_0x0043:
            r9 = r2
        L_0x0044:
            if (r7 == r8) goto L_0x0048
            r8 = r2
            goto L_0x0049
        L_0x0048:
            r8 = r3
        L_0x0049:
            boolean r10 = r5.mo56507r(r8)
            if (r10 != 0) goto L_0x0061
            boolean r5 = r5.mo56506q(r8)
            if (r5 == 0) goto L_0x005c
            boolean r5 = r8.mo56507r(r9)
            if (r5 == 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            com.google.common.g.bb r5 = m91596p(r0, r1, r2, r3, r4)
            goto L_0x0065
        L_0x0061:
            com.google.common.g.bb r5 = m91596p(r2, r3, r0, r1, r4)
        L_0x0065:
            double r8 = r4.f157122a
            double r10 = f157127e
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x00fc
            com.google.common.g.a r4 = new com.google.common.g.a
            r4.<init>(r0)
            com.google.common.g.a r5 = new com.google.common.g.a
            r5.<init>(r1)
            com.google.common.g.a r4 = r4.mo56408a(r5)
            com.google.common.g.a r5 = new com.google.common.g.a
            r5.<init>(r2)
            com.google.common.g.a r8 = new com.google.common.g.a
            r8.<init>(r3)
            com.google.common.g.a r5 = r5.mo56408a(r8)
            com.google.common.g.a r8 = r4.mo56408a(r5)
            com.google.common.g.bb r8 = r8.mo56409b()
            com.google.common.g.bb r8 = com.google.common.p4535g.C59136bb.m91671n(r8)
            com.google.common.g.bb r9 = com.google.common.p4535g.C59136bb.f157158a
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00fb
            com.google.common.g.bb r8 = new com.google.common.g.bb
            r11 = 4621819117588971520(0x4024000000000000, double:10.0)
            r13 = 4621819117588971520(0x4024000000000000, double:10.0)
            r15 = 4621819117588971520(0x4024000000000000, double:10.0)
            r10 = r8
            r10.<init>(r11, r13, r15)
            com.google.common.g.bb r4 = r4.mo56409b()
            com.google.common.g.bb r4 = com.google.common.p4535g.C59136bb.m91671n(r4)
            com.google.common.g.bb r5 = r5.mo56409b()
            com.google.common.g.bb r5 = com.google.common.p4535g.C59136bb.m91671n(r5)
            com.google.common.g.bb r9 = com.google.common.p4535g.C59136bb.f157158a
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L_0x00ca
            com.google.common.g.bb r9 = com.google.common.p4535g.C59136bb.f157158a
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x00ca
            r6 = 1
        L_0x00ca:
            java.lang.String r7 = "Exactly antipodal edges not supported by getIntersectionExact"
            com.google.common.base.C58838bb.m90869d(r6, r7)
            com.google.common.g.ak r6 = new com.google.common.g.ak
            r6.<init>(r8)
            boolean r7 = com.google.common.p4535g.C59148bn.m91713b(r2, r0, r3, r5)
            if (r7 == 0) goto L_0x00dd
            r6.mo56433a(r8, r0)
        L_0x00dd:
            boolean r5 = com.google.common.p4535g.C59148bn.m91713b(r2, r1, r3, r5)
            if (r5 == 0) goto L_0x00e6
            r6.mo56433a(r8, r1)
        L_0x00e6:
            boolean r5 = com.google.common.p4535g.C59148bn.m91713b(r0, r2, r1, r4)
            if (r5 == 0) goto L_0x00ef
            r6.mo56433a(r8, r2)
        L_0x00ef:
            boolean r4 = com.google.common.p4535g.C59148bn.m91713b(r0, r3, r1, r4)
            if (r4 == 0) goto L_0x00f8
            r6.mo56433a(r8, r3)
        L_0x00f8:
            com.google.common.g.bb r5 = r6.f157108a
            goto L_0x00fc
        L_0x00fb:
            r5 = r8
        L_0x00fc:
            com.google.common.g.bb r0 = com.google.common.p4535g.C59136bb.m91667j(r17, r18)
            com.google.common.g.bb r1 = com.google.common.p4535g.C59136bb.m91667j(r19, r20)
            com.google.common.g.bb r0 = com.google.common.p4535g.C59136bb.m91667j(r0, r1)
            double r0 = r5.mo56497b(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0117
            com.google.common.g.bb r0 = com.google.common.p4535g.C59136bb.m91670m(r5)
            return r0
        L_0x0117:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59123ap.m91590j(com.google.common.g.bb, com.google.common.g.bb, com.google.common.g.bb, com.google.common.g.bb):com.google.common.g.bb");
    }

    /* renamed from: k */
    static void m91591k(C59136bb bbVar, int i, C59216j jVar) {
        double d = 1.0d;
        if (i == 0) {
            double d2 = bbVar.f157163f;
            if (d2 <= C59203do.f157270a) {
                d = -1.0d;
            }
            jVar.f157293a = d;
            jVar.f157294b = (((-d) * bbVar.f157162e) - bbVar.f157164g) / d2;
            return;
        }
        double d3 = bbVar.f157162e;
        if (d3 >= C59203do.f157270a) {
            d = -1.0d;
        }
        jVar.f157294b = d;
        jVar.f157293a = (((-d) * bbVar.f157163f) - bbVar.f157164g) / d3;
    }

    /* renamed from: l */
    public static boolean m91592l(C59136bb bbVar, C59136bb bbVar2, int i, double d, C59216j jVar, C59216j jVar2) {
        C59136bb bbVar3 = bbVar;
        C59136bb bbVar4 = bbVar2;
        int i2 = i;
        if (C59164cc.m91752f(bbVar) == i2 && C59164cc.m91752f(bbVar2) == i2) {
            C59164cc.m91761p(i2, bbVar3, jVar);
            C59164cc.m91761p(i2, bbVar4, jVar2);
            return true;
        }
        C59216j jVar3 = jVar;
        C59216j jVar4 = jVar2;
        C59136bb l = C59164cc.m91757l(i2, C59222p.m91902h(bbVar, bbVar2));
        C59136bb l2 = C59164cc.m91757l(i2, bbVar3);
        C59136bb l3 = C59164cc.m91757l(i2, bbVar4);
        double d2 = d + 1.0d;
        C59136bb bbVar5 = new C59136bb(d2 * l.f157162e, d2 * l.f157163f, l.f157164g);
        if (!m91593m(bbVar5)) {
            return false;
        }
        if (Math.max(Math.abs(l.f157162e), Math.max(Math.abs(l.f157163f), Math.abs(l.f157164g))) < Math.scalb(1.0d, -511)) {
            l = C59136bb.m91669l(l, Math.scalb(1.0d, 563));
        }
        C59136bb n = C59136bb.m91671n(l);
        C59136bb k = C59136bb.m91668k(n, l2);
        C59136bb k2 = C59136bb.m91668k(l3, n);
        double d3 = d2;
        if (m91584d(l3, l2, C59136bb.m91670m(bbVar5), k2, k, d3, jVar) + m91584d(l2, l3, bbVar5, k, k2, d3, jVar2) < 3) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    static boolean m91593m(C59136bb bbVar) {
        double abs = Math.abs(bbVar.f157162e);
        double abs2 = Math.abs(bbVar.f157163f);
        double abs3 = Math.abs(bbVar.f157164g);
        return abs2 >= abs3 - abs && abs >= abs3 - abs2;
    }

    /* renamed from: n */
    public static boolean m91594n(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3, C59136bb bbVar4) {
        if (!bbVar.mo56506q(bbVar2) && !bbVar3.mo56506q(bbVar4)) {
            if (bbVar.mo56506q(bbVar4)) {
                return C59148bn.m91713b(C59222p.m91901g(bbVar), bbVar3, bbVar2, bbVar);
            }
            if (bbVar2.mo56506q(bbVar3)) {
                return C59148bn.m91713b(C59222p.m91901g(bbVar2), bbVar4, bbVar, bbVar2);
            }
            if (bbVar.mo56506q(bbVar3)) {
                return C59148bn.m91713b(C59222p.m91901g(bbVar), bbVar4, bbVar2, bbVar);
            }
            if (bbVar2.mo56506q(bbVar4)) {
                return C59148bn.m91713b(C59222p.m91901g(bbVar2), bbVar3, bbVar, bbVar2);
            }
        }
        return false;
    }

    /* renamed from: o */
    private static final double m91595o(C59136bb bbVar, C59136bb bbVar2) {
        double d = bbVar.f157162e - bbVar2.f157162e;
        double d2 = bbVar.f157163f - bbVar2.f157163f;
        double d3 = bbVar.f157164g - bbVar2.f157164g;
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    /* renamed from: p */
    private static C59136bb m91596p(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3, C59136bb bbVar4, C59122ao aoVar) {
        C59136bb bbVar5 = bbVar3;
        C59136bb bbVar6 = bbVar4;
        C59122ao aoVar2 = aoVar;
        C59136bb h = C59222p.m91902h(bbVar, bbVar2);
        double sqrt = Math.sqrt(h.mo56501e());
        double sqrt2 = Math.sqrt(bbVar6.mo56500d(bbVar5));
        C59122ao aoVar3 = new C59122ao();
        C59136bb bbVar7 = h;
        double d = sqrt;
        C59136bb bbVar8 = bbVar;
        C59122ao aoVar4 = new C59122ao();
        double b = m91582b(bbVar3, bbVar7, d, bbVar8, bbVar2, aoVar3);
        double b2 = m91582b(bbVar4, bbVar7, d, bbVar8, bbVar2, aoVar4);
        double abs = Math.abs(b - b2);
        C59122ao aoVar5 = aoVar4;
        double d2 = sqrt2;
        double d3 = aoVar3.f157122a + aoVar5.f157122a;
        if (abs > d3) {
            C59136bb o = C59136bb.m91672o(C59136bb.m91669l(bbVar6, b), C59136bb.m91669l(bbVar5, b2));
            double e = o.mo56501e();
            if (e < Double.MIN_NORMAL) {
                aoVar2.f157122a = Double.POSITIVE_INFINITY;
                return C59136bb.f157158a;
            }
            double sqrt3 = Math.sqrt(e);
            double abs2 = Math.abs((aoVar5.f157122a * b) - (b2 * aoVar3.f157122a));
            double d4 = C59222p.f157311c;
            aoVar2.f157122a = ((((abs2 / (abs - d3)) * d2) + ((d4 + d4) * abs)) / sqrt3) + d4;
            return C59136bb.m91669l(o, 1.0d / sqrt3);
        }
        aoVar2.f157122a = Double.POSITIVE_INFINITY;
        return C59136bb.f157158a;
    }

    @Deprecated
    /* renamed from: q */
    private static boolean m91597q(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3) {
        return C59136bb.m91665f(bbVar2, bbVar3, bbVar) > C59203do.f157270a;
    }
}

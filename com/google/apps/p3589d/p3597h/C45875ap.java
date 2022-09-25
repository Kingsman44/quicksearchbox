package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45707x;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3593d.C45749h;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45757p;
import com.google.apps.p3589d.p3593d.C45759r;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3593d.C45766y;
import com.google.apps.p3589d.p3593d.C45767z;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3599j.C45910ah;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45938c;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.h.ap */
/* compiled from: PG */
public final class C45875ap {
    /* renamed from: a */
    public static C45880f m81868a(C45749h hVar, C45819v vVar, C45707x xVar) {
        C45763v d = hVar.mo49882d();
        if (d != null) {
            return m81871d(1, 2, d, false, C45946k.f120735e, vVar, false, xVar);
        }
        return m81872e(hVar.f120310b, vVar, false, xVar);
    }

    /* renamed from: b */
    static C45874ao m81869b(C45819v vVar, C45719j jVar) {
        return new C45874ao(C45946k.f120735e.mo50063i(jVar.mo49812a(C45872am.f120602a)), C45946k.m82043h(C59203do.f157270a, C45880f.m81887g(vVar), C59203do.f157270a, C45880f.m81888h(vVar)).mo50063i(jVar.mo49812a(C45873an.f120603a)));
    }

    /* renamed from: c */
    static C45894t m81870c(int i, C45763v vVar, C45819v vVar2, boolean z, C45707x xVar) {
        return m81871d(1, i, vVar, true, C45946k.f120735e, vVar2, z, xVar);
    }

    /* renamed from: d */
    public static C45894t m81871d(int i, int i2, C45763v vVar, boolean z, C45946k kVar, C45819v vVar2, boolean z2, C45707x xVar) {
        double d;
        double d2;
        double d3;
        C45719j jVar;
        int i3;
        C45880f fVar;
        int i4;
        C45763v vVar3 = vVar;
        boolean z3 = z2;
        C45707x xVar2 = xVar;
        boolean z4 = false;
        C45723n nVar = new C45723n(0);
        int i5 = i;
        C45819v vVar4 = vVar2;
        double d4 = 0.0d;
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (i6 < vVar3.f120342a.f120220a.size()) {
                C45755n a = vVar3.mo49895a(i6);
                int i8 = a.f120319h;
                int i9 = i8 - 1;
                if (i9 != 11) {
                    if (!(i9 == 16 || i9 == 17)) {
                        if (i9 == 21) {
                            i3 = i6;
                            d4 += (((C45766y) a).f120347a / 18.0d) * vVar4.f120480a;
                        } else if (i9 != 22) {
                            switch (i9) {
                                case 1:
                                case 2:
                                case 3:
                                case 6:
                                case 7:
                                case 8:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    i3 = i6;
                                    int i10 = i3 + 1;
                                    if (i10 < vVar3.f120342a.f120220a.size()) {
                                        i7 = vVar3.mo49895a(i10).f120319h;
                                    }
                                    if (!C45910ah.m81980a(i5) && i7 - 1 != 0 && i4 != 6 && i4 != 8 && i4 != 11) {
                                        fVar = C45889o.m81927e(a, vVar3.mo49895a(i3 - 1), vVar3.mo49895a(i10), vVar4, z2, xVar);
                                        break;
                                    } else {
                                        fVar = C45889o.m81929x(2, a, vVar4, z3, xVar2);
                                        break;
                                    }
                                default:
                                    i3 = i6;
                                    fVar = C45898x.m81953w(a, m81872e(a, vVar4, z3, xVar2), C59203do.f157270a, vVar4, z2, xVar);
                                    break;
                            }
                        } else {
                            i3 = i6;
                            vVar4 = C45819v.m81731j(((C45767z) a).f120348a);
                        }
                        i6 = i3 + 1;
                        xVar2 = xVar;
                    }
                    i3 = i6;
                    fVar = m81872e(a, vVar4, z3, xVar2);
                    double a2 = C45871al.m81864a(i5, fVar.mo50008t(), vVar4);
                    int u = fVar.mo50009u();
                    nVar.f120220a.add(new C45868ai(fVar, new C45937b(d4 + a2, C59203do.f157270a)));
                    C45946k r = fVar.mo50007r();
                    d4 += a2 + (r.mo50047a() - r.mo50049c());
                    i5 = u;
                    i6 = i3 + 1;
                    xVar2 = xVar;
                }
                i3 = i6;
                if (a instanceof C45757p) {
                    C45757p pVar = (C45757p) a;
                    fVar = C45898x.m81953w(a, C45866ag.m81844w(i8, a, vVar4, pVar.f120327a, vVar4.f120480a * pVar.f120328b.f120326f), C59203do.f157270a, vVar4, z2, xVar);
                } else {
                    fVar = C45889o.m81927e(a, vVar3.mo49896b(i3 - 1), vVar3.mo49896b(i3 + 1), vVar4, z2, xVar);
                }
                double a22 = C45871al.m81864a(i5, fVar.mo50008t(), vVar4);
                int u2 = fVar.mo50009u();
                nVar.f120220a.add(new C45868ai(fVar, new C45937b(d4 + a22, C59203do.f157270a)));
                C45946k r2 = fVar.mo50007r();
                d4 += a22 + (r2.mo50047a() - r2.mo50049c());
                i5 = u2;
                i6 = i3 + 1;
                xVar2 = xVar;
            } else {
                C45719j f = nVar.mo49829f();
                boolean z5 = vVar3.f120342a.f120220a.isEmpty() && xVar.mo49760e();
                C45874ao b = m81869b(vVar4, f);
                C45938c cVar = (C45938c) kVar;
                double max = Math.max(((C45938c) b.f120604a).f120730d, cVar.f120730d);
                double d5 = -Math.min(((C45938c) b.f120604a).f120728b, cVar.f120728b);
                if (z && z5) {
                    z4 = true;
                }
                if (vVar3.f120342a.f120220a.isEmpty()) {
                    C45868ai aiVar = new C45868ai(C45877c.m81877e(new C45759r(xVar.mo49758c(), C45763v.m81598f(C45755n.m81571d())), vVar4, z3, xVar), C45944i.f120734c);
                    double f2 = aiVar.mo50013f();
                    double i11 = aiVar.mo50014i();
                    if (z5) {
                        C45938c cVar2 = (C45938c) aiVar.f120581e;
                        d4 = cVar2.f120729c - cVar2.f120727a;
                        if (z) {
                            jVar = C45719j.m81477h(aiVar);
                            d2 = i11;
                            d = d4;
                            d3 = f2;
                        }
                    }
                    jVar = f;
                    d2 = i11;
                    d = d4;
                    d3 = f2;
                } else {
                    jVar = f;
                    d2 = d5;
                    d = d4;
                    d3 = max;
                }
                C45946k q = C45880f.m81891q(d3, d2, d);
                return new C45894t(vVar, i2, jVar, z4, vVar4, q, b.f120605b.mo50066l(q));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:197:0x07b1  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x07c6  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x07f2  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0838  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x08ba  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x08fa  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0985  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0990  */
    /* JADX WARNING: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02e5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.apps.p3589d.p3597h.C45880f m81872e(com.google.apps.p3589d.p3593d.C45755n r43, com.google.apps.p3589d.p3595f.C45819v r44, boolean r45, com.google.apps.p3589d.p3590a.C45707x r46) {
        /*
            r0 = r43
            r11 = r44
            r8 = r45
            r9 = r46
            int r1 = r0.f120319h
            int r2 = r1 + -1
            r7 = 4
            r10 = 0
            r5 = 0
            r4 = 1
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r2 == r7) goto L_0x0921
            r3 = 9
            r18 = 4641170522237829120(0x4068c00000000000, double:198.0)
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
            r22 = 4634344754052595712(0x4050800000000000, double:66.0)
            r14 = 2
            r15 = -1
            if (r2 == r3) goto L_0x0753
            r3 = 10
            r26 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            r28 = 0
            if (r2 == r3) goto L_0x05d1
            r29 = 4646624099911598080(0x407c200000000000, double:450.0)
            switch(r2) {
                case 12: goto L_0x0594;
                case 13: goto L_0x0539;
                case 14: goto L_0x04b0;
                case 15: goto L_0x04b0;
                case 16: goto L_0x03b1;
                case 17: goto L_0x03b1;
                case 18: goto L_0x0262;
                case 19: goto L_0x025b;
                case 20: goto L_0x004d;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r2 = "Unexpected atom type "
            java.lang.String r1 = com.google.apps.p3589d.p3593d.C45754m.m81569a(r1)
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x004d:
            r8 = r0
            com.google.apps.d.d.ae r8 = (com.google.apps.p3589d.p3593d.C45737ae) r8
            com.google.apps.d.d.v r15 = com.google.apps.p3589d.p3593d.C45763v.m81598f(r8)
            com.google.apps.d.d.ah r0 = r8.f120246a
            com.google.apps.d.d.ah r1 = com.google.apps.p3589d.p3593d.C45740ah.MATRIX
            if (r0 == r1) goto L_0x0063
            com.google.apps.d.d.ah r0 = r8.f120246a
            com.google.apps.d.d.ah r1 = com.google.apps.p3589d.p3593d.C45740ah.CASES
            if (r0 != r1) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r7 = r11
            goto L_0x0068
        L_0x0063:
            com.google.apps.d.f.v r0 = com.google.apps.p3589d.p3595f.C45819v.m81731j(r14)
            r7 = r0
        L_0x0068:
            com.google.apps.d.b.j r0 = r8.f120249j
            int r0 = com.google.apps.p3589d.p3593d.C45737ae.m81534n(r0)
            if (r0 == 0) goto L_0x024d
            com.google.apps.d.b.j r1 = r8.f120249j
            java.util.ArrayList r1 = r1.f120220a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x007c
            goto L_0x024d
        L_0x007c:
            com.google.apps.d.b.n r3 = new com.google.apps.d.b.n
            r3.<init>(r0)
            r1 = 0
        L_0x0082:
            if (r1 >= r0) goto L_0x0092
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            java.util.ArrayList r5 = r3.f120220a
            r5.add(r2)
            int r1 = r1 + 1
            r5 = 0
            goto L_0x0082
        L_0x0092:
            com.google.apps.d.b.n r6 = new com.google.apps.d.b.n
            r6.<init>(r10)
            com.google.apps.d.d.ah r5 = r8.f120246a
            com.google.apps.d.d.ah r0 = com.google.apps.p3589d.p3593d.C45740ah.MATRIX
            if (r5 != r0) goto L_0x00c0
            r0 = 40
            int r0 = com.google.apps.p3589d.p3595f.C45819v.m81729c(r0)
            double r1 = r7.f120480a
            double r1 = r1 / r16
            com.google.apps.d.k.k r0 = com.google.apps.p3589d.p3595f.C45819v.m81730i(r0, r1)
            r33 = 0
            com.google.apps.d.k.c r0 = (com.google.apps.p3589d.p3600k.C45938c) r0
            double r1 = r0.f120728b
            r37 = 0
            r43 = r15
            double r14 = r0.f120730d
            r35 = r1
            r39 = r14
            com.google.apps.d.k.k r0 = com.google.apps.p3589d.p3600k.C45946k.m82043h(r33, r35, r37, r39)
            goto L_0x00c4
        L_0x00c0:
            r43 = r15
            com.google.apps.d.k.k r0 = com.google.apps.p3589d.p3600k.C45946k.f120735e
        L_0x00c4:
            r14 = r0
            com.google.apps.d.b.j r0 = r8.f120249j
            com.google.apps.d.b.c r15 = new com.google.apps.d.b.c
            r15.<init>(r0)
        L_0x00cc:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r15.next()
            r2 = r0
            com.google.apps.d.b.j r2 = (com.google.apps.p3589d.p3591b.C45719j) r2
            com.google.apps.d.b.n r1 = new com.google.apps.d.b.n
            r1.<init>(r10)
            r0 = 0
        L_0x00df:
            java.util.ArrayList r10 = r2.f120220a
            int r10 = r10.size()
            if (r0 >= r10) goto L_0x0154
            java.lang.Object r10 = r2.mo49815d(r0)
            com.google.apps.d.d.v r10 = (com.google.apps.p3589d.p3593d.C45763v) r10
            com.google.apps.d.d.ah r12 = com.google.apps.p3589d.p3593d.C45740ah.ALIGN
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x00fb
            int r12 = r0 % 2
            if (r12 != r4) goto L_0x00fb
            r12 = 2
            goto L_0x00fc
        L_0x00fb:
            r12 = 1
        L_0x00fc:
            r13 = 2
            r18 = 1
            r19 = 0
            r42 = r0
            r0 = r12
            r12 = r1
            r1 = r13
            r13 = r2
            r2 = r10
            r10 = r3
            r3 = r18
            r45 = r15
            r15 = 1
            r4 = r14
            r18 = r5
            r5 = r7
            r15 = r6
            r6 = r19
            r19 = r13
            r13 = r7
            r7 = r46
            com.google.apps.d.h.t r0 = m81871d(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r42
            java.lang.Object r2 = r10.mo49815d(r1)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            com.google.apps.d.k.k r4 = r0.f120615d
            double r5 = r4.mo50047a()
            double r20 = r4.mo50049c()
            double r5 = r5 - r20
            double r2 = java.lang.Math.max(r2, r5)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r10.mo49830i(r1, r2)
            java.util.ArrayList r2 = r12.f120220a
            r2.add(r0)
            int r0 = r1 + 1
            r3 = r10
            r1 = r12
            r7 = r13
            r6 = r15
            r5 = r18
            r2 = r19
            r4 = 1
            r15 = r45
            goto L_0x00df
        L_0x0154:
            r12 = r1
            r10 = r3
            r18 = r5
            r13 = r7
            r45 = r15
            r15 = r6
            com.google.apps.d.b.j r0 = r12.mo49829f()
            java.util.ArrayList r1 = r15.f120220a
            r1.add(r0)
            r4 = 1
            r10 = 0
            r15 = r45
            goto L_0x00cc
        L_0x016b:
            r10 = r3
            r15 = r6
            r13 = r7
            com.google.apps.d.b.j r0 = r15.mo49829f()
            com.google.apps.d.b.j r1 = r10.mo49829f()
            com.google.apps.d.h.z r2 = new com.google.apps.d.h.z
            r2.<init>(r8, r1, r13)
            com.google.apps.d.b.j r0 = r0.mo49812a(r2)
            com.google.apps.d.d.ah r1 = r8.f120246a
            double r1 = r1.f120257g
            double r3 = r13.f120480a
            double r1 = r1 * r3
            r5 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r5 = r5 * r3
            double r5 = r5 + r1
            double r26 = r26 * r3
            double r26 = r1 + r26
            r14 = 0
            double r3 = r3 * r14
            double r1 = r1 + r3
            java.util.ArrayList r3 = r0.f120220a
            int r3 = r3.size()
            com.google.apps.d.b.n r4 = new com.google.apps.d.b.n
            r4.<init>(r3)
            com.google.apps.d.b.c r3 = new com.google.apps.d.b.c
            r3.<init>(r0)
            r9 = r14
            r18 = r9
            r31 = 1
        L_0x01ad:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0201
            java.lang.Object r7 = r3.next()
            com.google.apps.d.h.t r7 = (com.google.apps.p3589d.p3597h.C45894t) r7
            if (r31 == 0) goto L_0x01cd
            com.google.apps.d.k.i r12 = com.google.apps.p3589d.p3600k.C45944i.f120734c
            r45 = r3
            java.util.ArrayList r3 = r4.f120220a
            r3.add(r12)
            double r18 = r7.mo50013f()
            double r9 = r9 + r18
            r20 = r1
            goto L_0x01f6
        L_0x01cd:
            r45 = r3
            double r20 = r7.mo50013f()
            double r20 = r18 + r20
            double r20 = r5 - r20
            int r3 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x01e4
            double r20 = r7.mo50013f()
            double r18 = r18 + r20
            double r18 = r18 + r26
            goto L_0x01e6
        L_0x01e4:
            r18 = r5
        L_0x01e6:
            double r14 = r14 - r18
            com.google.apps.d.k.b r3 = new com.google.apps.d.k.b
            r20 = r1
            r1 = 0
            r3.<init>(r1, r14)
            java.util.ArrayList r1 = r4.f120220a
            r1.add(r3)
        L_0x01f6:
            double r18 = r7.mo50014i()
            r3 = r45
            r1 = r20
            r31 = 0
            goto L_0x01ad
        L_0x0201:
            double r1 = r11.f120480a
            com.google.apps.d.h.y r3 = new com.google.apps.d.h.y
            double r5 = -r14
            double r5 = r5 + r18
            double r9 = r9 - r5
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r9 = r9 * r5
            double r1 = r1 / r16
            r5 = 4643000109586448384(0x406f400000000000, double:250.0)
            double r1 = r1 * r5
            double r9 = r9 - r1
            r3.<init>(r4, r9)
            com.google.apps.d.b.n r0 = r0.mo49814c(r3)
            com.google.apps.d.b.j r0 = r0.mo49829f()
            com.google.apps.d.h.aa r3 = new com.google.apps.d.h.aa
            r1 = r43
            com.google.apps.d.h.t r0 = com.google.apps.p3589d.p3597h.C45894t.m81940x(r1, r0, r13)
            r3.<init>(r8, r0, r13)
            com.google.apps.d.d.ah r0 = com.google.apps.p3589d.p3593d.C45740ah.CASES
            com.google.apps.d.d.ah r1 = r8.f120246a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0238
            goto L_0x025a
        L_0x0238:
            com.google.apps.d.d.f r4 = com.google.apps.p3589d.p3593d.C45748g.f120279K
            com.google.apps.d.k.k r0 = r3.f120615d
            double r1 = r0.mo50048b()
            double r5 = r0.mo50050d()
            double r5 = r1 - r5
            r2 = r8
            r7 = r13
            com.google.apps.d.h.j r0 = com.google.apps.p3589d.p3597h.C45884j.m81915e(r2, r3, r4, r5, r7)
            return r0
        L_0x024d:
            r13 = r7
            r1 = r15
            com.google.apps.d.h.aa r3 = new com.google.apps.d.h.aa
            com.google.apps.d.b.j r0 = com.google.apps.p3589d.p3591b.C45719j.f120222b
            com.google.apps.d.h.t r0 = com.google.apps.p3589d.p3597h.C45894t.m81940x(r1, r0, r13)
            r3.<init>(r8, r0, r13)
        L_0x025a:
            return r3
        L_0x025b:
            com.google.apps.d.d.r r0 = (com.google.apps.p3589d.p3593d.C45759r) r0
            com.google.apps.d.h.c r0 = com.google.apps.p3589d.p3597h.C45877c.m81877e(r0, r11, r8, r9)
            return r0
        L_0x0262:
            r1 = -1
            r2 = r0
            com.google.apps.d.d.k r2 = (com.google.apps.p3589d.p3593d.C45752k) r2
            com.google.apps.d.d.v r0 = r2.f120344i
            r3 = 2
            r4 = 1
            com.google.apps.d.h.t r5 = m81870c(r3, r0, r11, r4, r9)
            java.lang.String r0 = r2.f120314c
            int r0 = r11.mo49969k(r0)
            com.google.apps.d.k.k r3 = r5.f120615d
            double r6 = r3.mo50047a()
            double r8 = r3.mo50049c()
            double r6 = r6 - r8
            boolean r3 = r2.f120312a
            if (r4 == r3) goto L_0x0286
            r3 = 0
            goto L_0x0287
        L_0x0286:
            r3 = r6
        L_0x0287:
            com.google.apps.d.h.h r0 = com.google.apps.p3589d.p3597h.C45891q.m81933e(r2, r0, r3, r11)
            com.google.apps.d.d.n r3 = com.google.apps.p3589d.p3597h.C45880f.m81889l(r2)
            if (r3 != 0) goto L_0x0294
            r3 = r28
            goto L_0x02a0
        L_0x0294:
            java.lang.String r3 = r3.mo49888f()
            int r3 = r11.mo49969k(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x02a0:
            int r4 = r2.f120313b
            int r8 = r4 + -1
            if (r4 == 0) goto L_0x03b0
            if (r8 == 0) goto L_0x02f5
            r9 = 1
            if (r8 == r9) goto L_0x02f5
            r9 = 2
            if (r8 != r9) goto L_0x02f0
            java.lang.String r4 = r2.f120314c
            int r8 = r4.hashCode()
            r9 = 807(0x327, float:1.131E-42)
            if (r8 == r9) goto L_0x02c7
            r9 = 824(0x338, float:1.155E-42)
            if (r8 == r9) goto L_0x02bd
            goto L_0x02d1
        L_0x02bd:
            java.lang.String r8 = "̸"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x02d1
            r4 = 1
            goto L_0x02d2
        L_0x02c7:
            java.lang.String r8 = "̧"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x02d1
            r4 = 0
            goto L_0x02d2
        L_0x02d1:
            r4 = -1
        L_0x02d2:
            if (r4 == 0) goto L_0x02e5
            r1 = 1
            if (r4 != r1) goto L_0x02e0
            com.google.apps.d.k.b r1 = new com.google.apps.d.k.b
            r8 = 0
            r1.<init>(r6, r8)
            goto L_0x035b
        L_0x02e0:
            java.lang.AssertionError r0 = com.google.apps.p3589d.p3600k.C45945j.m82039a()
            throw r0
        L_0x02e5:
            double r8 = r5.mo50014i()
            com.google.apps.d.k.b r1 = new com.google.apps.d.k.b
            double r8 = -r8
            r1.<init>(r6, r8)
            goto L_0x035b
        L_0x02f0:
            java.lang.AssertionError r0 = com.google.apps.p3589d.p3600k.C45945j.m82039a()
            throw r0
        L_0x02f5:
            r1 = 1
            if (r4 != r1) goto L_0x02fa
            r28 = r3
        L_0x02fa:
            boolean r1 = r0 instanceof com.google.apps.p3589d.p3597h.C45886l
            if (r1 == 0) goto L_0x0312
            r1 = r0
            com.google.apps.d.h.l r1 = (com.google.apps.p3589d.p3597h.C45886l) r1
            com.google.apps.d.f.y r1 = r1.f120626a
            com.google.apps.d.f.e r1 = (com.google.apps.p3589d.p3595f.C45802e) r1
            int r1 = r1.f120433a
            double r8 = com.google.apps.p3589d.p3595f.C45819v.m81728b(r1)
            double r12 = r11.f120480a
            double r12 = r12 / r16
            double r8 = r8 * r12
            goto L_0x0321
        L_0x0312:
            com.google.apps.d.k.k r1 = r0.mo50007r()
            double r8 = r1.mo50047a()
            double r12 = r1.mo50049c()
            double r8 = r8 - r12
            double r8 = r8 / r20
        L_0x0321:
            if (r28 == 0) goto L_0x0332
            int r1 = r28.intValue()
            double r6 = com.google.apps.p3589d.p3595f.C45819v.m81728b(r1)
            double r12 = r11.f120480a
            double r12 = r12 / r16
            double r6 = r6 * r12
            goto L_0x0334
        L_0x0332:
            double r6 = r6 / r20
        L_0x0334:
            double r6 = r6 - r8
            r1 = 1
            if (r4 != r1) goto L_0x0351
            double r8 = r5.mo50013f()
            double r12 = r11.f120480a
            double r12 = r12 / r16
            double r12 = r12 * r29
            double r8 = java.lang.Math.min(r8, r12)
            double r12 = r5.mo50013f()
            com.google.apps.d.k.b r1 = new com.google.apps.d.k.b
            double r12 = r12 - r8
            r1.<init>(r6, r12)
            goto L_0x035b
        L_0x0351:
            double r8 = r5.mo50014i()
            com.google.apps.d.k.b r1 = new com.google.apps.d.k.b
            double r8 = -r8
            r1.<init>(r6, r8)
        L_0x035b:
            double r6 = r5.mo50013f()
            double r8 = r1.f120726b
            double r12 = r0.mo50013f()
            double r8 = r8 + r12
            double r12 = java.lang.Math.max(r6, r8)
            double r6 = r5.mo50014i()
            double r8 = r1.f120726b
            double r14 = r0.mo50014i()
            double r8 = -r8
            double r8 = r8 + r14
            double r14 = java.lang.Math.max(r6, r8)
            com.google.apps.d.h.ai r4 = new com.google.apps.d.h.ai
            r4.<init>(r0, r1)
            com.google.apps.d.k.k r0 = r5.f120615d
            double r6 = r0.mo50047a()
            double r0 = r0.mo50049c()
            double r16 = r6 - r0
            com.google.apps.d.k.k r6 = com.google.apps.p3589d.p3597h.C45881g.m81891q(r12, r14, r16)
            if (r3 == 0) goto L_0x0394
            r31 = 1
            goto L_0x0396
        L_0x0394:
            r31 = 0
        L_0x0396:
            com.google.apps.d.h.g r8 = new com.google.apps.d.h.g
            com.google.apps.d.k.k r0 = r5.f120616e
            com.google.apps.d.k.k r0 = r0.mo50066l(r6)
            com.google.apps.d.k.k r1 = r4.f120582f
            com.google.apps.d.k.k r7 = r0.mo50066l(r1)
            r0 = r8
            r1 = r2
            r2 = r4
            r3 = r5
            r4 = r31
            r5 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L_0x03b0:
            throw r28
        L_0x03b1:
            r7 = r0
            com.google.apps.d.d.af r7 = (com.google.apps.p3589d.p3593d.C45738af) r7
            int r0 = com.google.apps.p3589d.p3597h.C45892r.f120640a
            com.google.apps.d.d.v r0 = r7.f120344i
            r1 = 2
            com.google.apps.d.h.t r0 = m81870c(r1, r0, r11, r8, r9)
            java.lang.String r1 = r7.f120314c
            int r1 = r11.mo49969k(r1)
            com.google.apps.d.k.k r2 = r0.f120615d
            double r3 = r2.mo50047a()
            double r5 = r2.mo50049c()
            double r3 = r3 - r5
            com.google.apps.d.h.h r1 = com.google.apps.p3589d.p3597h.C45891q.m81933e(r7, r1, r3, r11)
            int r2 = r7.f120319h
            r3 = 17
            if (r2 != r3) goto L_0x03de
            double r2 = r0.mo50014i()
            double r2 = -r2
            goto L_0x041a
        L_0x03de:
            boolean r2 = r1 instanceof com.google.apps.p3589d.p3597h.C45891q
            if (r2 == 0) goto L_0x0406
            r2 = r1
            com.google.apps.d.h.q r2 = (com.google.apps.p3589d.p3597h.C45891q) r2
            boolean r2 = r2.f120637a
            if (r2 == 0) goto L_0x0406
            double r2 = r0.mo50013f()
            double r4 = r11.f120480a
            double r4 = r4 / r16
            double r4 = r4 * r29
            double r2 = java.lang.Math.max(r2, r4)
            com.google.apps.d.k.k r4 = r1.mo50007r()
            double r5 = r4.mo50048b()
            double r12 = r4.mo50050d()
            double r5 = r5 - r12
            double r2 = r2 + r5
            goto L_0x041a
        L_0x0406:
            double r2 = r0.mo50013f()
            double r4 = r11.f120480a
            double r4 = r4 / r16
            double r4 = r4 * r29
            double r2 = java.lang.Math.min(r2, r4)
            double r4 = r0.mo50013f()
            double r2 = r4 - r2
        L_0x041a:
            double r4 = r0.mo50013f()
            double r12 = r1.mo50013f()
            double r12 = r12 + r2
            double r14 = java.lang.Math.max(r4, r12)
            double r4 = r0.mo50014i()
            double r12 = -r2
            double r16 = r1.mo50014i()
            double r12 = r12 + r16
            double r16 = java.lang.Math.max(r4, r12)
            com.google.apps.d.k.k r4 = r1.mo50007r()
            double r5 = r4.mo50047a()
            double r12 = r4.mo50049c()
            com.google.apps.d.k.k r4 = r0.f120615d
            double r5 = r5 - r12
            double r12 = r4.mo50047a()
            double r18 = r4.mo50049c()
            double r12 = r12 - r18
            double r5 = r5 - r12
            double r5 = r5 / r20
            double r12 = -r5
            r8 = 0
            double r12 = java.lang.Math.max(r12, r8)
            com.google.apps.d.k.b r4 = new com.google.apps.d.k.b
            r4.<init>(r12, r2)
            com.google.apps.d.h.ai r2 = new com.google.apps.d.h.ai
            r2.<init>(r1, r4)
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0473
            com.google.apps.d.h.ai r1 = new com.google.apps.d.h.ai
            com.google.apps.d.k.b r3 = new com.google.apps.d.k.b
            r3.<init>(r5, r8)
            r1.<init>(r0, r3)
            r3 = r1
            goto L_0x0474
        L_0x0473:
            r3 = r0
        L_0x0474:
            com.google.apps.d.k.k r0 = r3.mo50007r()
            double r4 = r0.mo50047a()
            double r0 = r0.mo50049c()
            com.google.apps.d.k.k r6 = r2.f120581e
            double r4 = r4 - r0
            com.google.apps.d.k.c r6 = (com.google.apps.p3589d.p3600k.C45938c) r6
            double r0 = r6.f120729c
            double r8 = r6.f120727a
            double r0 = r0 - r8
            double r18 = java.lang.Math.max(r4, r0)
            com.google.apps.d.k.k r5 = com.google.apps.p3589d.p3597h.C45892r.m81891q(r14, r16, r18)
            com.google.apps.d.h.r r8 = new com.google.apps.d.h.r
            com.google.apps.d.k.k r0 = r3.mo50005c()
            com.google.apps.d.k.k r6 = r5.mo50066l(r0)
            r0 = r8
            r1 = r7
            r4 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = 0
            r0 = r7
            r1 = r8
            r5 = r45
            r6 = r46
            com.google.apps.d.h.f r0 = com.google.apps.p3589d.p3597h.C45898x.m81952e(r0, r1, r2, r4, r5, r6)
            return r0
        L_0x04b0:
            r1 = r0
            com.google.apps.d.d.ag r1 = (com.google.apps.p3589d.p3593d.C45739ag) r1
            int r0 = com.google.apps.p3589d.p3597h.C45861ab.f120567a
            com.google.apps.d.d.v r0 = r1.f120344i
            r8 = r45
            r9 = r46
            r2 = 2
            com.google.apps.d.h.t r6 = m81870c(r2, r0, r11, r8, r9)
            int r0 = r1.f120319h
            r2 = 15
            if (r0 != r2) goto L_0x04c8
            r10 = 1
            goto L_0x04c9
        L_0x04c8:
            r10 = 0
        L_0x04c9:
            if (r10 == 0) goto L_0x04d8
            double r2 = r6.mo50014i()
            double r4 = r11.f120480a
            double r4 = r4 / r16
            double r4 = r4 * r18
            double r2 = r2 + r4
            double r2 = -r2
            goto L_0x04e3
        L_0x04d8:
            double r2 = r6.mo50013f()
            double r4 = r11.f120480a
            double r4 = r4 / r16
            double r4 = r4 * r18
            double r2 = r2 + r4
        L_0x04e3:
            if (r10 == 0) goto L_0x04e8
            r4 = 0
            goto L_0x04f2
        L_0x04e8:
            double r4 = r11.f120480a
            double r4 = r4 / r16
            double r7 = r4 * r18
            double r4 = r4 * r22
            double r7 = r7 + r4
            double r4 = r4 + r7
        L_0x04f2:
            if (r10 == 0) goto L_0x0501
            double r7 = r11.f120480a
            double r7 = r7 / r16
            double r18 = r18 * r7
            double r7 = r7 * r22
            double r18 = r18 + r7
            double r7 = r18 + r7
            goto L_0x0503
        L_0x0501:
            r7 = 0
        L_0x0503:
            double r12 = r6.mo50013f()
            double r14 = r6.mo50014i()
            com.google.apps.d.k.k r0 = r6.f120615d
            double r24 = r12 + r4
            double r26 = r14 + r7
            double r4 = r0.mo50047a()
            double r7 = r0.mo50049c()
            double r28 = r4 - r7
            com.google.apps.d.k.k r8 = com.google.apps.p3589d.p3597h.C45861ab.m81891q(r24, r26, r28)
            com.google.apps.d.h.ab r12 = new com.google.apps.d.h.ab
            if (r10 == 0) goto L_0x0526
            double r4 = r11.f120480a
            goto L_0x0528
        L_0x0526:
            double r4 = r11.f120480a
        L_0x0528:
            double r4 = r4 / r16
            double r4 = r4 * r22
            com.google.apps.d.k.k r0 = r6.f120616e
            com.google.apps.d.k.k r9 = r8.mo50066l(r0)
            r0 = r12
            r7 = r44
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return r12
        L_0x0539:
            r14 = r0
            com.google.apps.d.d.q r14 = (com.google.apps.p3589d.p3593d.C45758q) r14
            int r0 = com.google.apps.p3589d.p3597h.C45876b.f120606a
            com.google.apps.d.d.v r0 = r14.f120344i
            r1 = 2
            com.google.apps.d.h.t r0 = m81870c(r1, r0, r11, r8, r9)
            double r1 = r11.f120480a
            double r3 = r1 / r16
            double r16 = r3 * r22
            r3 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r1 = r1 * r3
            com.google.apps.d.k.k r3 = r0.f120615d
            com.google.apps.d.d.n r4 = com.google.apps.p3589d.p3597h.C45880f.m81889l(r14)
            if (r4 == 0) goto L_0x0572
            double r5 = r3.mo50049c()
            double r7 = r3.mo50050d()
            double r7 = r7 - r1
            double r9 = r3.mo50047a()
            double r3 = r3.mo50048b()
            double r11 = r3 + r1
            com.google.apps.d.k.k r1 = com.google.apps.p3589d.p3600k.C45946k.m82043h(r5, r7, r9, r11)
            goto L_0x058a
        L_0x0572:
            double r4 = r3.mo50049c()
            double r6 = r4 - r1
            double r8 = r3.mo50050d()
            double r4 = r3.mo50047a()
            double r10 = r4 + r1
            double r12 = r3.mo50048b()
            com.google.apps.d.k.k r1 = com.google.apps.p3589d.p3600k.C45946k.m82043h(r6, r8, r10, r12)
        L_0x058a:
            r15 = r1
            com.google.apps.d.h.b r1 = new com.google.apps.d.h.b
            r13 = r1
            r18 = r0
            r13.<init>(r14, r15, r16, r18)
            return r1
        L_0x0594:
            com.google.apps.d.d.t r0 = (com.google.apps.p3589d.p3593d.C45761t) r0
            int r1 = com.google.apps.p3589d.p3597h.C45884j.f120617a
            int r1 = r0.f120319h
            com.google.apps.d.d.v r2 = r0.f120344i
            com.google.apps.d.h.t r1 = m81870c(r1, r2, r11, r8, r9)
            double r2 = r11.f120480a
            double r2 = r2 / r16
            r4 = 4643000109586448384(0x406f400000000000, double:250.0)
            double r2 = r2 * r4
            double r4 = r1.mo50013f()
            double r4 = r4 - r2
            double r6 = r1.mo50014i()
            double r6 = r6 + r2
            double r2 = java.lang.Math.max(r4, r6)
            r4 = 4610794305701168546(0x3ffcd4fdf3b645a2, double:1.802)
            double r4 = r4 * r2
            double r2 = r2 + r2
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r2 = r2 + r6
            double r3 = java.lang.Math.max(r4, r2)
            com.google.apps.d.d.f r2 = r0.f120337a
            r5 = r44
            com.google.apps.d.h.j r0 = com.google.apps.p3589d.p3597h.C45884j.m81915e(r0, r1, r2, r3, r5)
            return r0
        L_0x05d1:
            r8 = r0
            com.google.apps.d.d.x r8 = (com.google.apps.p3589d.p3593d.C45765x) r8
            int r0 = com.google.apps.p3589d.p3597h.C45896v.f120650a
            com.google.apps.d.d.v r0 = r8.f120346b
            r1 = 2
            r2 = 1
            com.google.apps.d.h.t r10 = m81870c(r1, r0, r11, r2, r9)
            double r0 = r11.f120480a
            double r0 = r0 / r16
            r2 = 4635470653959438336(0x4054800000000000, double:82.0)
            double r2 = r2 * r0
            double r12 = r0 * r22
            com.google.apps.d.k.k r0 = r10.f120615d
            double r4 = r0.mo50048b()
            double r0 = r0.mo50050d()
            com.google.apps.d.h.u r6 = new com.google.apps.d.h.u
            r34 = r6
            r35 = r10
            r36 = r2
            r38 = r12
            r34.<init>(r35, r36, r38)
            double r4 = r4 - r0
            double r4 = r4 + r2
            double r2 = r4 + r12
            r0 = r8
            r1 = r44
            r4 = r12
            com.google.apps.d.h.h r0 = com.google.apps.p3589d.p3597h.C45866ag.m81843e(r0, r1, r2, r4, r6)
            double r5 = r0.mo50013f()
            double r1 = r12 / r20
            double r1 = r1 + r5
            double r3 = r11.f120480a
            double r3 = r3 / r16
            double r3 = r3 * r22
            double r1 = r1 + r3
            double r3 = r0.mo50014i()
            double r14 = r10.mo50014i()
            double r3 = java.lang.Math.max(r3, r14)
            com.google.apps.d.k.k r14 = r0.mo50007r()
            double r18 = r14.mo50047a()
            double r14 = r14.mo50049c()
            com.google.apps.d.k.k r7 = r10.f120615d
            double r18 = r18 - r14
            double r14 = r7.mo50047a()
            double r20 = r7.mo50049c()
            double r14 = r14 - r20
            double r18 = r18 + r14
            com.google.apps.d.k.i r7 = com.google.apps.p3589d.p3600k.C45944i.f120734c
            com.google.apps.d.d.v r14 = r8.f120345a
            if (r14 == 0) goto L_0x06df
            r15 = 4
            com.google.apps.d.f.v r7 = com.google.apps.p3589d.p3595f.C45819v.m81731j(r15)
            r24 = r12
            r12 = 2
            r15 = 0
            com.google.apps.d.h.t r7 = m81870c(r12, r14, r7, r15, r9)
            double r12 = r11.f120480a
            double r12 = r12 / r16
            r14 = 4643580651725914112(0x4071500000000000, double:277.0)
            double r14 = r14 * r12
            r29 = r5
            double r5 = r0.mo50014i()
            com.google.apps.d.k.k r9 = r0.mo50007r()
            double r5 = -r5
            double r16 = r9.mo50048b()
            double r18 = r9.mo50050d()
            double r16 = r16 - r18
            r18 = 4604480259023595111(0x3fe6666666666667, double:0.7000000000000001)
            double r16 = r16 * r18
            double r5 = r5 + r16
            com.google.apps.d.k.k r9 = r7.f120615d
            double r16 = r9.mo50047a()
            double r18 = r9.mo50049c()
            double r16 = r16 - r18
            double r16 = r14 + r16
            r18 = -4575278989408468992(0xc081580000000000, double:-555.0)
            double r12 = r12 * r18
            double r16 = r16 + r12
            r12 = 0
            int r9 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x06a1
            double r14 = r14 - r16
            r16 = 0
        L_0x06a1:
            com.google.apps.d.k.b r9 = new com.google.apps.d.k.b
            r9.<init>(r14, r5)
            com.google.apps.d.k.k r5 = r0.mo50007r()
            double r12 = r5.mo50047a()
            double r5 = r5.mo50049c()
            com.google.apps.d.k.k r14 = r10.f120615d
            double r12 = r12 - r5
            double r12 = r16 + r12
            double r5 = r14.mo50047a()
            double r14 = r14.mo50049c()
            double r5 = r5 - r14
            double r18 = r12 + r5
            double r5 = r7.mo50013f()
            double r12 = r9.f120726b
            double r5 = r5 + r12
            double r1 = java.lang.Math.max(r1, r5)
            double r5 = r7.mo50014i()
            double r12 = r9.f120726b
            double r5 = r5 - r12
            double r3 = java.lang.Math.max(r3, r5)
            r31 = r1
            r33 = r3
            r5 = r16
            goto L_0x06ec
        L_0x06df:
            r29 = r5
            r24 = r12
            r31 = r1
            r33 = r3
            r9 = r7
            r7 = r28
            r5 = 0
        L_0x06ec:
            com.google.apps.d.k.k r1 = r10.f120615d
            double r2 = r1.mo50047a()
            double r12 = r1.mo50049c()
            double r14 = r11.f120480a
            double r14 = r14 * r26
            double r2 = r2 - r12
            double r12 = r2 + r14
            double r35 = r18 + r14
            com.google.apps.d.h.ai r2 = new com.google.apps.d.h.ai
            com.google.apps.d.k.k r1 = r0.mo50007r()
            double r3 = r1.mo50047a()
            double r14 = r1.mo50049c()
            com.google.apps.d.k.b r1 = new com.google.apps.d.k.b
            double r3 = r3 - r14
            double r3 = r3 + r5
            r14 = 0
            r1.<init>(r3, r14)
            r2.<init>(r10, r1)
            com.google.apps.d.h.ai r3 = new com.google.apps.d.h.ai
            com.google.apps.d.k.b r1 = new com.google.apps.d.k.b
            r1.<init>(r5, r14)
            r3.<init>(r0, r1)
            if (r7 != 0) goto L_0x0728
            r4 = r28
            goto L_0x072e
        L_0x0728:
            com.google.apps.d.h.ai r0 = new com.google.apps.d.h.ai
            r0.<init>(r7, r9)
            r4 = r0
        L_0x072e:
            com.google.apps.d.k.k r14 = com.google.apps.p3589d.p3597h.C45896v.m81891q(r31, r33, r35)
            com.google.apps.d.k.k r0 = r2.f120582f
            com.google.apps.d.k.k r0 = r14.mo50066l(r0)
            if (r4 == 0) goto L_0x0740
            com.google.apps.d.k.k r1 = r4.f120582f
            com.google.apps.d.k.k r0 = r0.mo50066l(r1)
        L_0x0740:
            r15 = r0
            com.google.apps.d.h.v r16 = new com.google.apps.d.h.v
            r0 = r16
            r1 = r8
            r5 = r29
            r7 = r12
            r9 = r24
            r11 = r44
            r12 = r14
            r13 = r15
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13)
            return r16
        L_0x0753:
            r14 = r5
            r1 = -1
            com.google.apps.d.d.s r0 = (com.google.apps.p3589d.p3593d.C45760s) r0
            int r2 = com.google.apps.p3589d.p3597h.C45885k.f120621a
            int r2 = r0.f120336l
            if (r2 == 0) goto L_0x0762
            com.google.apps.d.f.v r2 = com.google.apps.p3589d.p3595f.C45819v.m81731j(r2)
            goto L_0x0763
        L_0x0762:
            r2 = r11
        L_0x0763:
            int r3 = r2.f120481b
            int r3 = r3 + r1
            if (r3 == 0) goto L_0x0779
            r1 = 1
            if (r3 == r1) goto L_0x0771
            r3 = 4
            com.google.apps.d.f.v r3 = com.google.apps.p3589d.p3595f.C45819v.m81731j(r3)
            goto L_0x0776
        L_0x0771:
            r3 = 3
            com.google.apps.d.f.v r3 = com.google.apps.p3589d.p3595f.C45819v.m81731j(r3)
        L_0x0776:
            r4 = r3
            r3 = 2
            goto L_0x077f
        L_0x0779:
            r1 = 1
            r3 = 2
            com.google.apps.d.f.v r4 = com.google.apps.p3589d.p3595f.C45819v.m81731j(r3)
        L_0x077f:
            com.google.apps.d.d.v r5 = r0.f120333i
            r6 = 0
            com.google.apps.d.h.t r5 = m81870c(r3, r5, r4, r6, r9)
            com.google.apps.d.d.v r6 = r0.f120334j
            com.google.apps.d.h.t r6 = m81870c(r3, r6, r4, r1, r9)
            boolean r3 = r0.f120331a
            r7 = 4648312949771862016(0x4082200000000000, double:580.0)
            r10 = 4647151865492930560(0x407e000000000000, double:480.0)
            if (r3 == 0) goto L_0x079e
            int r12 = r2.f120481b
            if (r12 != r1) goto L_0x07a9
            double r12 = r2.f120480a
            goto L_0x07a4
        L_0x079e:
            int r12 = r2.f120481b
            if (r12 != r1) goto L_0x07a9
            double r12 = r2.f120480a
        L_0x07a4:
            double r12 = r12 / r16
            double r12 = r12 * r7
            goto L_0x07af
        L_0x07a9:
            double r7 = r2.f120480a
            double r7 = r7 / r16
            double r12 = r7 * r10
        L_0x07af:
            if (r3 == 0) goto L_0x07c6
            int r7 = r2.f120481b
            if (r7 != r1) goto L_0x07bf
            double r7 = r2.f120480a
            double r7 = r7 / r16
            r10 = 4649368480934526976(0x4085e00000000000, double:700.0)
            goto L_0x07c3
        L_0x07bf:
            double r7 = r2.f120480a
            double r7 = r7 / r16
        L_0x07c3:
            double r7 = r7 * r10
            goto L_0x07dc
        L_0x07c6:
            int r1 = r2.f120481b
            r7 = 1
            if (r1 != r7) goto L_0x07d5
            double r7 = r2.f120480a
            double r7 = r7 / r16
            r10 = 4651127699538968576(0x408c200000000000, double:900.0)
            goto L_0x07c3
        L_0x07d5:
            double r7 = r2.f120480a
            double r7 = r7 / r16
            r10 = 4650248090236747776(0x4089000000000000, double:800.0)
            goto L_0x07c3
        L_0x07dc:
            double r10 = r2.f120480a
            double r10 = r10 / r16
            r24 = 4643000109586448384(0x406f400000000000, double:250.0)
            double r38 = r10 * r24
            if (r3 == 0) goto L_0x07ee
            double r10 = r10 * r22
            r36 = r10
            goto L_0x07f0
        L_0x07ee:
            r36 = r14
        L_0x07f0:
            if (r3 == 0) goto L_0x0838
            double r10 = r36 / r20
            double r14 = r5.mo50014i()
            double r14 = r12 - r14
            double r24 = r38 + r10
            double r14 = r14 - r24
            int r1 = r2.f120481b
            r3 = 1
            if (r1 != r3) goto L_0x080b
            r1 = r4
            double r3 = r2.f120480a
            double r3 = r3 / r16
            double r3 = r3 * r18
            goto L_0x0812
        L_0x080b:
            r1 = r4
            double r3 = r2.f120480a
            double r3 = r3 / r16
            double r3 = r3 * r22
        L_0x0812:
            int r24 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r24 >= 0) goto L_0x0818
            double r3 = r3 - r14
            double r12 = r12 + r3
        L_0x0818:
            double r3 = r38 - r10
            double r10 = r6.mo50013f()
            double r10 = r10 - r7
            double r3 = r3 - r10
            int r10 = r2.f120481b
            r11 = 1
            if (r10 != r11) goto L_0x082c
            double r10 = r2.f120480a
            double r10 = r10 / r16
            double r10 = r10 * r18
            goto L_0x0832
        L_0x082c:
            double r10 = r2.f120480a
            double r10 = r10 / r16
            double r10 = r10 * r22
        L_0x0832:
            int r14 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x0865
            double r10 = r10 - r3
            goto L_0x0864
        L_0x0838:
            r1 = r4
            double r3 = r5.mo50014i()
            double r3 = r12 - r3
            double r10 = r6.mo50013f()
            double r10 = r10 - r7
            double r3 = r3 - r10
            int r10 = r2.f120481b
            r11 = 1
            if (r10 != r11) goto L_0x0856
            double r10 = r2.f120480a
            double r10 = r10 / r16
            r14 = 4646835206144131072(0x407ce00000000000, double:462.0)
            double r10 = r10 * r14
            goto L_0x085c
        L_0x0856:
            double r10 = r2.f120480a
            double r10 = r10 / r16
            double r10 = r10 * r18
        L_0x085c:
            int r14 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x0865
            double r10 = r10 - r3
            double r10 = r10 / r20
            double r12 = r12 + r10
        L_0x0864:
            double r7 = r7 + r10
        L_0x0865:
            com.google.apps.d.k.k r3 = r5.f120615d
            double r10 = r3.mo50047a()
            double r3 = r3.mo50049c()
            com.google.apps.d.k.k r14 = r6.f120615d
            double r10 = r10 - r3
            double r3 = r14.mo50047a()
            double r14 = r14.mo50049c()
            double r3 = r3 - r14
            double r18 = java.lang.Math.max(r10, r3)
            com.google.apps.d.k.k r3 = r5.f120615d
            double r10 = r3.mo50047a()
            double r3 = r3.mo50049c()
            com.google.apps.d.k.b r14 = new com.google.apps.d.k.b
            double r10 = r10 - r3
            double r3 = r18 - r10
            double r3 = r3 / r20
            r14.<init>(r3, r12)
            com.google.apps.d.k.k r3 = r6.f120615d
            double r10 = r3.mo50047a()
            double r3 = r3.mo50049c()
            com.google.apps.d.k.b r12 = new com.google.apps.d.k.b
            double r10 = r10 - r3
            double r3 = r18 - r10
            double r3 = r3 / r20
            double r7 = -r7
            r12.<init>(r3, r7)
            com.google.apps.d.h.ai r3 = new com.google.apps.d.h.ai
            r3.<init>(r5, r14)
            com.google.apps.d.h.ai r4 = new com.google.apps.d.h.ai
            r4.<init>(r6, r12)
            double r5 = r3.mo50013f()
            boolean r7 = r0.f120332b
            if (r7 == 0) goto L_0x08d5
            com.google.apps.d.d.n r7 = com.google.apps.p3589d.p3593d.C45755n.m81571d()
            com.google.apps.d.d.v r7 = com.google.apps.p3589d.p3593d.C45763v.m81598f(r7)
            r8 = 2
            r10 = 1
            com.google.apps.d.h.t r1 = m81870c(r8, r7, r1, r10, r9)
            com.google.apps.d.h.ai r7 = new com.google.apps.d.h.ai
            r7.<init>(r1, r14)
            double r7 = r7.mo50013f()
            double r5 = java.lang.Math.max(r5, r7)
        L_0x08d5:
            r14 = r5
            com.google.apps.d.h.k r1 = new com.google.apps.d.h.k
            double r16 = r4.mo50014i()
            com.google.apps.d.k.k r41 = com.google.apps.p3589d.p3597h.C45885k.m81891q(r14, r16, r18)
            com.google.apps.d.k.k r5 = r3.f120582f
            com.google.apps.d.k.k r6 = r4.f120582f
            com.google.apps.d.k.k r42 = r5.mo50066l(r6)
            r32 = r1
            r33 = r0
            r34 = r3
            r35 = r4
            r40 = r2
            r32.<init>(r33, r34, r35, r36, r38, r40, r41, r42)
            boolean r3 = r0.f120332b
            if (r3 == 0) goto L_0x08fa
            goto L_0x0920
        L_0x08fa:
            com.google.apps.d.d.f r3 = r0.f120335k
            int r4 = r2.f120481b
            r5 = 1
            if (r4 != r5) goto L_0x0909
            double r4 = r2.f120480a
            r6 = 4612564220354725151(0x40031eb851eb851f, double:2.39)
            goto L_0x0910
        L_0x0909:
            double r4 = r2.f120480a
            r6 = 4607227454796291113(0x3ff028f5c28f5c29, double:1.01)
        L_0x0910:
            double r4 = r4 * r6
            r20 = r4
            r17 = r0
            r18 = r1
            r19 = r3
            r22 = r2
            com.google.apps.d.h.j r1 = com.google.apps.p3589d.p3597h.C45884j.m81915e(r17, r18, r19, r20, r22)
        L_0x0920:
            return r1
        L_0x0921:
            r14 = r5
            r10 = r0
            com.google.apps.d.d.u r10 = (com.google.apps.p3589d.p3593d.C45762u) r10
            int r0 = com.google.apps.p3589d.p3597h.C45889o.f120632a
            int r0 = r11.f120481b
            java.lang.String r1 = r10.f120314c
            int r2 = r1.length()
            r3 = 0
            int r1 = r1.codePointCount(r3, r2)
            r2 = 1
            if (r1 != r2) goto L_0x099e
            java.lang.String r1 = r10.f120314c
            int r1 = r11.mo49969k(r1)
            if (r0 != r2) goto L_0x094e
            if (r1 == 0) goto L_0x094d
            com.google.apps.d.b.l r2 = com.google.apps.p3589d.p3595f.C45811n.f120472b
            com.google.apps.d.f.t r3 = new com.google.apps.d.f.t
            r3.<init>(r1)
            com.google.apps.d.f.y r1 = r11.mo49968h(r2, r1, r3)
            goto L_0x0952
        L_0x094d:
            r1 = 0
        L_0x094e:
            com.google.apps.d.f.y r1 = r11.mo49967g(r1)
        L_0x0952:
            r2 = r1
            r1 = r2
            com.google.apps.d.f.e r1 = (com.google.apps.p3589d.p3595f.C45802e) r1
            int r1 = r1.f120433a
            double r3 = com.google.apps.p3589d.p3595f.C45819v.m81727a(r1)
            double r5 = r11.f120480a
            double r5 = r5 / r16
            double r12 = r3 * r5
            double r3 = r2.mo49970g()
            double r5 = r2.mo49971h()
            double r3 = r3 - r5
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r3 = r3 * r5
            double r5 = r11.f120480a
            double r5 = r5 / r16
            r14 = 4643000109586448384(0x406f400000000000, double:250.0)
            double r5 = r5 * r14
            double r3 = r3 - r5
            com.google.apps.d.d.v r1 = r10.f120316e
            if (r1 == 0) goto L_0x0990
            boolean r0 = r10.mo49894n(r0)
            if (r0 != 0) goto L_0x0990
            int r0 = r10.f120319h
            r1 = r10
            r5 = r12
            r7 = r44
            com.google.apps.d.h.l r0 = com.google.apps.p3589d.p3597h.C45886l.m81922e(r0, r1, r2, r3, r5, r7)
            goto L_0x099b
        L_0x0990:
            int r0 = r10.f120319h
            r5 = 0
            r1 = r10
            r7 = r44
            com.google.apps.d.h.l r0 = com.google.apps.p3589d.p3597h.C45886l.m81922e(r0, r1, r2, r3, r5, r7)
        L_0x099b:
            r1 = r0
            r2 = r12
            goto L_0x09a8
        L_0x099e:
            java.lang.String r0 = r10.f120314c
            int r1 = r10.f120319h
            com.google.apps.d.h.f r0 = com.google.apps.p3589d.p3597h.C45889o.m81928w(r10, r1, r0, r11)
            r1 = r0
            r2 = r14
        L_0x09a8:
            com.google.apps.d.d.v r0 = r10.f120316e
            if (r0 != 0) goto L_0x09b0
            com.google.apps.d.d.v r0 = r10.f120315d
            if (r0 == 0) goto L_0x09cf
        L_0x09b0:
            int r0 = r11.f120481b
            boolean r0 = r10.mo49894n(r0)
            if (r0 != 0) goto L_0x09c4
            r0 = r10
            r4 = r44
            r5 = r45
            r6 = r46
            com.google.apps.d.h.f r1 = com.google.apps.p3589d.p3597h.C45898x.m81953w(r0, r1, r2, r4, r5, r6)
            goto L_0x09cf
        L_0x09c4:
            r0 = r10
            r4 = r44
            r5 = r45
            r6 = r46
            com.google.apps.d.h.f r1 = com.google.apps.p3589d.p3597h.C45898x.m81952e(r0, r1, r2, r4, r5, r6)
        L_0x09cf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3597h.C45875ap.m81872e(com.google.apps.d.d.n, com.google.apps.d.f.v, boolean, com.google.apps.d.a.x):com.google.apps.d.h.f");
    }
}

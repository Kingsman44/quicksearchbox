package com.google.common.p4535g;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.common.g.do */
/* compiled from: PG */
public final class C59203do implements Serializable {

    /* renamed from: a */
    public static final double f157270a;
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    protected final List f157271b;

    /* renamed from: c */
    public volatile boolean f157272c;

    /* renamed from: d */
    private List f157273d = C58485gu.m89845m();

    /* renamed from: e */
    private int f157274e = 0;

    static {
        double d = C59123ap.f157125c + C59123ap.f157126d;
        f157270a = d + d;
    }

    public C59203do() {
        new ArrayList();
        this.f157272c = true;
        this.f157271b = new ArrayList();
    }

    /* renamed from: b */
    static final List m91829b(int i) {
        if (i < 256) {
            return new C59202dn(i);
        }
        return new C59201dm(i);
    }

    /* renamed from: d */
    static final int m91830d(C59136bb bbVar, C59136bb bbVar2) {
        double sqrt = Math.sqrt(bbVar.mo56500d(bbVar2));
        C59221o oVar = C59164cc.f157204f.f157208h;
        if (sqrt <= f157270a) {
            return 30;
        }
        return Math.max(0, Math.min(30, -Math.getExponent(sqrt / oVar.f157308a)));
    }

    /* renamed from: e */
    private static C59177cp m91831e(C59177cp cpVar, boolean z, double d, C59178cq cqVar) {
        C59177cp cpVar2 = cpVar;
        if (!z) {
            if (cpVar2.f157232b.f157291a.f157289a >= d) {
                return cpVar2;
            }
        } else if (cpVar2.f157232b.f157291a.f157290b <= d) {
            return cpVar2;
        }
        C59179cr crVar = cpVar2.f157231a;
        double a = cpVar2.f157232b.f157292b.mo56586a(C59123ap.m91583c(d, crVar.f157238d, crVar.f157240f, crVar.f157239e, crVar.f157241g));
        boolean z2 = false;
        if ((crVar.f157238d > crVar.f157240f) != (crVar.f157239e > crVar.f157241g)) {
            z2 = true;
        }
        return m91833g(cpVar, z, d, z2 ^ z, a, cqVar);
    }

    /* renamed from: f */
    private static C59177cp m91832f(C59177cp cpVar, boolean z, double d, C59178cq cqVar) {
        C59177cp cpVar2 = cpVar;
        if (!z) {
            if (cpVar2.f157232b.f157292b.f157289a >= d) {
                return cpVar2;
            }
        } else if (cpVar2.f157232b.f157292b.f157290b <= d) {
            return cpVar2;
        }
        C59179cr crVar = cpVar2.f157231a;
        double a = cpVar2.f157232b.f157291a.mo56586a(C59123ap.m91583c(d, crVar.f157239e, crVar.f157241g, crVar.f157238d, crVar.f157240f));
        boolean z2 = false;
        if ((crVar.f157238d > crVar.f157240f) != (crVar.f157239e > crVar.f157241g)) {
            z2 = true;
        }
        return m91833g(cpVar, z2 ^ z, a, z, d, cqVar);
    }

    /* renamed from: g */
    private static C59177cp m91833g(C59177cp cpVar, boolean z, double d, boolean z2, double d2, C59178cq cqVar) {
        if (cqVar.f157233a == cqVar.f157234b.size()) {
            cqVar.f157234b.add(new C59177cp());
        }
        List list = cqVar.f157234b;
        int i = cqVar.f157233a;
        cqVar.f157233a = i + 1;
        C59177cp cpVar2 = (C59177cp) list.get(i);
        cpVar2.f157231a = cpVar.f157231a;
        if (z) {
            C59214h hVar = cpVar2.f157232b.f157291a;
            hVar.f157289a = cpVar.f157232b.f157291a.f157289a;
            hVar.f157290b = d;
        } else {
            C59214h hVar2 = cpVar2.f157232b.f157291a;
            double d3 = cpVar.f157232b.f157291a.f157290b;
            hVar2.f157289a = d;
            hVar2.f157290b = d3;
        }
        if (z2) {
            C59214h hVar3 = cpVar2.f157232b.f157292b;
            hVar3.f157289a = cpVar.f157232b.f157292b.f157289a;
            hVar3.f157290b = d2;
        } else {
            C59214h hVar4 = cpVar2.f157232b.f157292b;
            double d4 = cpVar.f157232b.f157292b.f157290b;
            hVar4.f157289a = d2;
            hVar4.f157290b = d4;
        }
        return cpVar2;
    }

    /* renamed from: h */
    private static void m91834h(C59177cp cpVar, C59214h hVar, List list, List list2, C59178cq cqVar) {
        C59214h hVar2 = cpVar.f157232b.f157292b;
        if (hVar2.f157290b > hVar.f157289a) {
            double d = hVar2.f157289a;
            double d2 = hVar.f157290b;
            if (d >= d2) {
                list2.add(cpVar);
                return;
            }
            list.add(m91832f(cpVar, true, d2, cqVar));
            list2.add(m91832f(cpVar, false, hVar.f157289a, cqVar));
            return;
        }
        list.add(cpVar);
    }

    /* renamed from: i */
    private final void m91835i(C59226t tVar, C59226t tVar2, C59180cs csVar, C59178cq cqVar) {
        if (csVar.f157248e > 0) {
            C59227u uVar = new C59227u();
            uVar.f157335a.clear();
            while (tVar.compareTo(tVar2) < 0) {
                C59226t tVar3 = tVar;
                while (!tVar3.mo56660F() && tVar3.mo56675v().mo56678y().equals(tVar) && tVar3.mo56675v().mo56677x().compareTo(tVar2) < 0) {
                    tVar3 = tVar3.mo56675v();
                }
                uVar.f157335a.add(tVar3);
                tVar = tVar3.mo56677x().mo56674u();
            }
            C58485gu m = C58485gu.m89845m();
            for (int i = 0; i < uVar.f157335a.size(); i++) {
                m91836j(new C59135ba((C59226t) uVar.f157335a.get(i), f157270a), m, csVar, cqVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.google.common.g.co[]} */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r17v2, types: [com.google.common.g.cx] */
    /* JADX WARNING: type inference failed for: r17v3, types: [com.google.common.g.cw] */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m91836j(com.google.common.p4535g.C59135ba r26, java.util.List r27, com.google.common.p4535g.C59180cs r28, com.google.common.p4535g.C59178cq r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            boolean r5 = r27.isEmpty()
            if (r5 == 0) goto L_0x0018
            int r5 = r3.f157248e
            if (r5 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r8 = r0
            goto L_0x02a8
        L_0x0018:
            int r5 = r27.size()
            r6 = 10
            if (r5 <= r6) goto L_0x016b
            int r5 = r27.size()
            int r9 = r3.f157248e
            int r5 = r5 + r9
            double r9 = (double) r5
            r11 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r11
            int r5 = (int) r9
            int r5 = java.lang.Math.max(r6, r5)
            java.util.Iterator r6 = r27.iterator()
            r9 = 0
        L_0x003c:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x016b
            java.lang.Object r10 = r6.next()
            com.google.common.g.cp r10 = (com.google.common.p4535g.C59177cp) r10
            int r11 = r1.f157154e
            com.google.common.g.cr r10 = r10.f157231a
            int r10 = r10.f157237c
            if (r11 >= r10) goto L_0x0052
            r10 = 1
            goto L_0x0053
        L_0x0052:
            r10 = 0
        L_0x0053:
            int r9 = r9 + r10
            if (r9 <= r5) goto L_0x0166
            int r5 = r27.size()
            java.util.List r6 = m91829b(r5)
            java.util.List r9 = m91829b(r5)
            java.util.List r10 = m91829b(r5)
            java.util.List r11 = m91829b(r5)
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89849q(r6, r9, r10, r11)
            int r13 = r4.f157233a
            com.google.common.g.i r14 = r26.mo56493a()
            r15 = 0
        L_0x0075:
            if (r15 >= r5) goto L_0x011d
            java.lang.Object r16 = r2.get(r15)
            r7 = r16
            com.google.common.g.cp r7 = (com.google.common.p4535g.C59177cp) r7
            com.google.common.g.i r8 = r7.f157232b
            r18 = r5
            com.google.common.g.h r5 = r8.f157291a
            double r2 = r5.f157290b
            r19 = r13
            com.google.common.g.h r13 = r14.f157291a
            double r0 = r13.f157289a
            int r20 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r20 > 0) goto L_0x009b
            com.google.common.g.h r0 = r14.f157292b
            m91834h(r7, r0, r6, r9, r4)
        L_0x0096:
            r5 = r9
            r0 = r10
            r1 = r12
            goto L_0x010a
        L_0x009b:
            double r0 = r5.f157289a
            double r2 = r13.f157290b
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x00a9
            com.google.common.g.h r0 = r14.f157292b
            m91834h(r7, r0, r10, r11, r4)
            goto L_0x0096
        L_0x00a9:
            com.google.common.g.h r0 = r8.f157292b
            r1 = r12
            double r12 = r0.f157290b
            com.google.common.g.h r5 = r14.f157292b
            r20 = r9
            double r8 = r5.f157289a
            int r21 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r21 > 0) goto L_0x00d0
            r8 = 1
            com.google.common.g.cp r0 = m91831e(r7, r8, r2, r4)
            r6.add(r0)
            com.google.common.g.h r0 = r14.f157291a
            double r2 = r0.f157289a
            r9 = 0
            com.google.common.g.cp r0 = m91831e(r7, r9, r2, r4)
            r10.add(r0)
            r0 = r10
            r5 = r20
            goto L_0x010a
        L_0x00d0:
            r8 = 1
            r9 = 0
            double r12 = r0.f157289a
            r0 = r10
            double r9 = r5.f157290b
            int r5 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x00f1
            com.google.common.g.cp r2 = m91831e(r7, r8, r2, r4)
            r5 = r20
            r5.add(r2)
            com.google.common.g.h r2 = r14.f157291a
            double r2 = r2.f157289a
            r9 = 0
            com.google.common.g.cp r2 = m91831e(r7, r9, r2, r4)
            r11.add(r2)
            goto L_0x010a
        L_0x00f1:
            r5 = r20
            r9 = 0
            com.google.common.g.cp r2 = m91831e(r7, r8, r2, r4)
            com.google.common.g.h r3 = r14.f157292b
            m91834h(r2, r3, r6, r5, r4)
            com.google.common.g.h r2 = r14.f157291a
            double r2 = r2.f157289a
            com.google.common.g.cp r2 = m91831e(r7, r9, r2, r4)
            com.google.common.g.h r3 = r14.f157292b
            m91834h(r2, r3, r0, r11, r4)
        L_0x010a:
            int r15 = r15 + 1
            r2 = r27
            r3 = r28
            r10 = r0
            r12 = r1
            r9 = r5
            r5 = r18
            r13 = r19
            r0 = r25
            r1 = r26
            goto L_0x0075
        L_0x011d:
            r1 = r12
            r19 = r13
            r7 = 0
        L_0x0121:
            r0 = 4
            if (r7 >= r0) goto L_0x015f
            r0 = r26
            int r2 = r0.f157153d
            int[][] r3 = com.google.common.p4535g.C59222p.f157313e
            r2 = r3[r2]
            r2 = r2[r7]
            java.lang.Object r2 = r1.get(r2)
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0144
            r3 = r28
            int r5 = r3.f157248e
            if (r5 <= 0) goto L_0x0141
            goto L_0x0146
        L_0x0141:
            r8 = r25
            goto L_0x015c
        L_0x0144:
            r3 = r28
        L_0x0146:
            int r5 = r0.f157153d
            int[][] r6 = com.google.common.p4535g.C59222p.f157313e
            r5 = r6[r5]
            r5 = r5[r7]
            com.google.common.g.ba r6 = new com.google.common.g.ba
            int r8 = r5 >> 1
            r9 = 1
            r5 = r5 & r9
            r6.<init>(r0, r7, r8, r5)
            r8 = r25
            r8.m91836j(r6, r2, r3, r4)
        L_0x015c:
            int r7 = r7 + 1
            goto L_0x0121
        L_0x015f:
            r8 = r25
            r2 = r19
            r4.f157233a = r2
            return
        L_0x0166:
            r8 = r0
            r2 = r27
            goto L_0x003c
        L_0x016b:
            r8 = r0
            r0 = r1
            int r1 = r27.size()
            boolean r2 = r3.f157244a
            r4 = 2
            if (r2 == 0) goto L_0x0201
            if (r1 <= 0) goto L_0x0201
            com.google.common.g.t r2 = r0.f157150a
            com.google.common.g.t r2 = r2.mo56678y()
            long r5 = r2.f157334b
            com.google.common.g.t r2 = r3.f157246c
            long r9 = r2.f157334b
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0189
            goto L_0x01b2
        L_0x0189:
            int r2 = r0.f157151b
            int r5 = r0.f157152c
            int r6 = r0.f157153d
            r6 = r6 & r4
            if (r6 == 0) goto L_0x019a
            int r6 = r0.f157154e
            int r6 = com.google.common.p4535g.C59226t.m91930g(r6)
            int r2 = r2 + r6
            int r5 = r5 + r6
        L_0x019a:
            long r6 = (long) r2
            long r9 = (long) r5
            com.google.common.g.cc r18 = com.google.common.p4535g.C59164cc.f157204f
            com.google.common.g.t r2 = r0.f157150a
            int r19 = r2.mo56664b()
            long r20 = r6 + r6
            long r22 = r9 + r9
            com.google.common.g.bb r2 = r18.mo56544i(r19, r20, r22)
            com.google.common.g.bb r2 = com.google.common.p4535g.C59136bb.m91671n(r2)
            r3.f157245b = r2
        L_0x01b2:
            int r2 = r0.f157154e
            int r5 = r0.f157151b
            long r5 = (long) r5
            int r2 = com.google.common.p4535g.C59226t.m91930g(r2)
            long r9 = (long) r2
            int r2 = r0.f157152c
            long r11 = (long) r2
            com.google.common.g.cc r18 = com.google.common.p4535g.C59164cc.f157204f
            com.google.common.g.t r2 = r0.f157150a
            int r19 = r2.mo56664b()
            long r5 = r5 + r5
            long r20 = r5 + r9
            long r11 = r11 + r11
            long r22 = r11 + r9
            com.google.common.g.bb r2 = r18.mo56544i(r19, r20, r22)
            com.google.common.g.bb r2 = com.google.common.p4535g.C59136bb.m91671n(r2)
            r3.mo56555a(r2)
            r9 = 0
        L_0x01d9:
            if (r9 >= r1) goto L_0x0201
            r2 = r27
            java.lang.Object r5 = r2.get(r9)
            com.google.common.g.cp r5 = (com.google.common.p4535g.C59177cp) r5
            com.google.common.g.cr r5 = r5.f157231a
            java.util.List r6 = r8.f157271b
            int r7 = r5.f157235a
            java.lang.Object r6 = r6.get(r7)
            com.google.common.g.cl r6 = (com.google.common.p4535g.C59173cl) r6
            boolean r6 = r6.mo56423e()
            if (r6 == 0) goto L_0x01fe
            int r6 = r5.f157235a
            com.google.common.g.bb r7 = r5.f157242h
            com.google.common.g.bb r5 = r5.f157243i
            r3.mo56556b(r6, r7, r5)
        L_0x01fe:
            int r9 = r9 + 1
            goto L_0x01d9
        L_0x0201:
            r2 = r27
            com.google.common.g.t r5 = r0.f157150a
            java.util.List r6 = r8.f157271b
            int r6 = r6.size()
            r7 = 0
            r9 = 0
            r10 = 0
        L_0x020e:
            if (r9 < r1) goto L_0x02a9
            int r11 = r3.f157248e
            if (r7 >= r11) goto L_0x0216
            goto L_0x02a9
        L_0x0216:
            java.util.List r5 = r8.f157273d
            com.google.common.g.dl[] r6 = r3.f157249f
            r7 = 1
            if (r10 == r7) goto L_0x0237
            if (r10 == r4) goto L_0x022c
            com.google.common.g.cn r4 = new com.google.common.g.cn
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r10)
            com.google.common.g.dl[] r6 = (com.google.common.p4535g.C59200dl[]) r6
            r4.<init>(r6)
            r11 = 0
            goto L_0x023a
        L_0x022c:
            com.google.common.g.cm r4 = new com.google.common.g.cm
            r11 = 0
            r9 = r6[r11]
            r6 = r6[r7]
            r4.<init>(r9, r6)
            goto L_0x023a
        L_0x0237:
            r11 = 0
            r4 = r6[r11]
        L_0x023a:
            r5.add(r4)
            boolean r4 = r3.f157244a
            if (r4 == 0) goto L_0x02a8
            boolean r4 = r27.isEmpty()
            if (r4 != 0) goto L_0x02a8
            int r4 = r0.f157151b
            int r5 = r0.f157152c
            int r6 = r0.f157154e
            int r6 = com.google.common.p4535g.C59226t.m91930g(r6)
            int r7 = r0.f157153d
            if (r7 == 0) goto L_0x025b
            r9 = 3
            if (r7 != r9) goto L_0x0259
            goto L_0x025b
        L_0x0259:
            int r5 = r5 + r6
            goto L_0x025c
        L_0x025b:
            int r4 = r4 + r6
        L_0x025c:
            long r6 = (long) r4
            long r4 = (long) r5
            com.google.common.g.cc r12 = com.google.common.p4535g.C59164cc.f157204f
            com.google.common.g.t r9 = r0.f157150a
            int r13 = r9.mo56664b()
            long r14 = r6 + r6
            long r16 = r4 + r4
            com.google.common.g.bb r4 = r12.mo56544i(r13, r14, r16)
            com.google.common.g.bb r4 = com.google.common.p4535g.C59136bb.m91671n(r4)
            r3.mo56555a(r4)
            r7 = 0
        L_0x0276:
            if (r7 >= r1) goto L_0x029c
            java.lang.Object r4 = r2.get(r7)
            com.google.common.g.cp r4 = (com.google.common.p4535g.C59177cp) r4
            com.google.common.g.cr r4 = r4.f157231a
            java.util.List r5 = r8.f157271b
            int r6 = r4.f157235a
            java.lang.Object r5 = r5.get(r6)
            com.google.common.g.cl r5 = (com.google.common.p4535g.C59173cl) r5
            boolean r5 = r5.mo56423e()
            if (r5 == 0) goto L_0x0299
            int r5 = r4.f157235a
            com.google.common.g.bb r6 = r4.f157242h
            com.google.common.g.bb r4 = r4.f157243i
            r3.mo56556b(r5, r6, r4)
        L_0x0299:
            int r7 = r7 + 1
            goto L_0x0276
        L_0x029c:
            com.google.common.g.t r0 = r0.f157150a
            com.google.common.g.t r0 = r0.mo56677x()
            com.google.common.g.t r0 = r0.mo56674u()
            r3.f157246c = r0
        L_0x02a8:
            return
        L_0x02a9:
            r11 = 0
            if (r9 >= r1) goto L_0x02b7
            java.lang.Object r12 = r2.get(r9)
            com.google.common.g.cp r12 = (com.google.common.p4535g.C59177cp) r12
            com.google.common.g.cr r12 = r12.f157231a
            int r12 = r12.f157235a
            goto L_0x02b8
        L_0x02b7:
            r12 = r6
        L_0x02b8:
            int r13 = r3.f157248e
            if (r7 >= r13) goto L_0x02c1
            int[] r13 = r3.f157247d
            r13 = r13[r7]
            goto L_0x02c2
        L_0x02c1:
            r13 = r6
        L_0x02c2:
            if (r13 >= r12) goto L_0x02e3
            java.util.List r12 = r8.f157271b
            java.lang.Object r12 = r12.get(r13)
            com.google.common.g.cl r12 = (com.google.common.p4535g.C59173cl) r12
            if (r5 == 0) goto L_0x02d6
            long r13 = r5.f157334b
            com.google.common.g.ct r5 = new com.google.common.g.ct
            r5.<init>(r12, r13)
            goto L_0x02db
        L_0x02d6:
            com.google.common.g.cu r5 = new com.google.common.g.cu
            r5.<init>(r12)
        L_0x02db:
            int r7 = r7 + 1
            r16 = r1
            r24 = r6
            goto L_0x03c8
        L_0x02e3:
            r14 = r9
        L_0x02e4:
            if (r14 >= r1) goto L_0x02f5
            java.lang.Object r15 = r2.get(r14)
            com.google.common.g.cp r15 = (com.google.common.p4535g.C59177cp) r15
            com.google.common.g.cr r15 = r15.f157231a
            int r15 = r15.f157235a
            if (r15 != r12) goto L_0x02f5
            int r14 = r14 + 1
            goto L_0x02e4
        L_0x02f5:
            java.util.List r15 = r8.f157271b
            java.lang.Object r15 = r15.get(r12)
            com.google.common.g.cl r15 = (com.google.common.p4535g.C59173cl) r15
            int r4 = r14 - r9
            r11 = 1
            if (r4 != r11) goto L_0x0330
            java.lang.Object r4 = r2.get(r9)
            com.google.common.g.cp r4 = (com.google.common.p4535g.C59177cp) r4
            if (r5 == 0) goto L_0x031c
            r16 = r1
            long r0 = r5.f157334b
            if (r13 != r12) goto L_0x0316
            com.google.common.g.dg r5 = new com.google.common.g.dg
            r5.<init>(r15, r4, r0)
            goto L_0x032c
        L_0x0316:
            com.google.common.g.dh r5 = new com.google.common.g.dh
            r5.<init>(r15, r4, r0)
            goto L_0x032c
        L_0x031c:
            r16 = r1
            if (r13 != r12) goto L_0x0326
            com.google.common.g.di r0 = new com.google.common.g.di
            r0.<init>(r15, r4)
            goto L_0x032b
        L_0x0326:
            com.google.common.g.dj r0 = new com.google.common.g.dj
            r0.<init>(r15, r4)
        L_0x032b:
            r5 = r0
        L_0x032c:
            r24 = r6
            goto L_0x03c3
        L_0x0330:
            r16 = r1
            java.lang.Object r0 = r2.get(r9)
            com.google.common.g.cp r0 = (com.google.common.p4535g.C59177cp) r0
            com.google.common.g.cr r0 = r0.f157231a
            int r0 = r0.f157236b
            r1 = 1
        L_0x033d:
            if (r1 >= r4) goto L_0x038d
            int r11 = r0 + r1
            r24 = r6
            int r6 = r9 + r1
            java.lang.Object r6 = r2.get(r6)
            com.google.common.g.cp r6 = (com.google.common.p4535g.C59177cp) r6
            com.google.common.g.cr r6 = r6.f157231a
            int r6 = r6.f157236b
            if (r11 == r6) goto L_0x0387
            int[] r0 = new int[r4]
            r1 = 0
        L_0x0354:
            if (r1 >= r4) goto L_0x0367
            int r6 = r1 + r9
            java.lang.Object r6 = r2.get(r6)
            com.google.common.g.cp r6 = (com.google.common.p4535g.C59177cp) r6
            com.google.common.g.cr r6 = r6.f157231a
            int r6 = r6.f157236b
            r0[r1] = r6
            int r1 = r1 + 1
            goto L_0x0354
        L_0x0367:
            if (r5 == 0) goto L_0x0379
            long r4 = r5.f157334b
            if (r13 != r12) goto L_0x0373
            com.google.common.g.db r1 = new com.google.common.g.db
            r1.<init>(r15, r0, r4)
            goto L_0x03c2
        L_0x0373:
            com.google.common.g.dc r1 = new com.google.common.g.dc
            r1.<init>(r15, r0, r4)
            goto L_0x03c2
        L_0x0379:
            if (r13 != r12) goto L_0x0381
            com.google.common.g.dd r1 = new com.google.common.g.dd
            r1.<init>(r15, r0)
            goto L_0x03c2
        L_0x0381:
            com.google.common.g.de r1 = new com.google.common.g.de
            r1.<init>(r15, r0)
            goto L_0x03c2
        L_0x0387:
            int r1 = r1 + 1
            r6 = r24
            r11 = 1
            goto L_0x033d
        L_0x038d:
            r24 = r6
            if (r5 == 0) goto L_0x03b5
            long r5 = r5.f157334b
            if (r13 != r12) goto L_0x03a5
            com.google.common.g.cw r1 = new com.google.common.g.cw
            r17 = r1
            r18 = r15
            r19 = r0
            r20 = r4
            r21 = r5
            r17.<init>(r18, r19, r20, r21)
            goto L_0x03c2
        L_0x03a5:
            com.google.common.g.cx r1 = new com.google.common.g.cx
            r17 = r1
            r18 = r15
            r19 = r0
            r20 = r4
            r21 = r5
            r17.<init>(r18, r19, r20, r21)
            goto L_0x03c2
        L_0x03b5:
            if (r13 != r12) goto L_0x03bd
            com.google.common.g.cy r1 = new com.google.common.g.cy
            r1.<init>(r15, r0, r4)
            goto L_0x03c2
        L_0x03bd:
            com.google.common.g.cz r1 = new com.google.common.g.cz
            r1.<init>(r15, r0, r4)
        L_0x03c2:
            r5 = r1
        L_0x03c3:
            if (r13 != r12) goto L_0x03c7
            int r7 = r7 + 1
        L_0x03c7:
            r9 = r14
        L_0x03c8:
            int r0 = r10 + 1
            com.google.common.g.dl[] r1 = r3.f157249f
            r1[r10] = r5
            r5 = 0
            r10 = r0
            r1 = r16
            r6 = r24
            r4 = 2
            r0 = r26
            goto L_0x020e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59203do.m91836j(com.google.common.g.ba, java.util.List, com.google.common.g.cs, com.google.common.g.cq):void");
    }

    /* renamed from: a */
    public final C59126as mo56570a() {
        C59180cs csVar;
        boolean z;
        C59216j jVar;
        int i;
        C59173cl clVar;
        C59172ck ckVar;
        C59216j jVar2;
        C59216j jVar3;
        if (!this.f157272c) {
            synchronized (this) {
                if (!this.f157272c) {
                    C58838bb.m90884s(this.f157273d.isEmpty(), "Incremental updates not supported yet");
                    int i2 = 0;
                    for (int i3 = this.f157274e; i3 < this.f157271b.size(); i3++) {
                        i2 += ((C59173cl) this.f157271b.get(i3)).mo56420b();
                    }
                    this.f157273d = m91829b(((i2 * 3) / 10) / 4);
                    List b = m91829b(6);
                    for (int i4 = 0; i4 < 6; i4++) {
                        b.add(m91829b(i2));
                    }
                    C59180cs csVar2 = new C59180cs(this.f157271b.size() - this.f157274e);
                    for (int i5 = this.f157274e; i5 < this.f157271b.size(); i5++) {
                        C59173cl clVar2 = (C59173cl) this.f157271b.get(i5);
                        boolean e = clVar2.mo56423e();
                        if (e) {
                            csVar2.f157244a = true;
                            if (clVar2.mo56422d()) {
                                csVar2.mo56557c(i5);
                            }
                        }
                        int b2 = clVar2.mo56420b();
                        C59172ck ckVar2 = new C59172ck();
                        C59216j jVar4 = new C59216j(f157270a, f157270a);
                        C59216j jVar5 = new C59216j(f157270a, f157270a);
                        int i6 = 0;
                        while (i6 < b2) {
                            clVar2.mo56421c(i6, ckVar2);
                            if (e) {
                                csVar2.mo56556b(i5, ckVar2.f157226a, ckVar2.f157227b);
                            }
                            int f = C59164cc.m91752f(ckVar2.f157226a);
                            if (f == C59164cc.m91752f(ckVar2.f157227b)) {
                                C59164cc.m91761p(f, ckVar2.f157226a, jVar4);
                                C59164cc.m91761p(f, ckVar2.f157227b, jVar5);
                                double d = 1.0d - f157270a;
                                if (Math.abs(jVar4.f157293a) <= d && Math.abs(jVar4.f157294b) <= d && Math.abs(jVar5.f157293a) <= d && Math.abs(jVar5.f157294b) <= d) {
                                    C59136bb bbVar = ckVar2.f157226a;
                                    C59179cr crVar = r6;
                                    clVar = clVar2;
                                    List list = (List) b.get(f);
                                    i = i6;
                                    jVar = jVar5;
                                    jVar2 = jVar4;
                                    z = e;
                                    ckVar = ckVar2;
                                    C59179cr crVar2 = new C59179cr(i5, i6, bbVar, ckVar2.f157227b, jVar4, jVar);
                                    list.add(crVar);
                                    i6 = i + 1;
                                    ckVar2 = ckVar;
                                    jVar4 = jVar2;
                                    clVar2 = clVar;
                                    jVar5 = jVar;
                                    e = z;
                                }
                            }
                            i = i6;
                            jVar = jVar5;
                            jVar2 = jVar4;
                            clVar = clVar2;
                            z = e;
                            ckVar = ckVar2;
                            int i7 = 0;
                            while (i7 < 6) {
                                C59136bb bbVar2 = ckVar.f157226a;
                                if (C59123ap.m91592l(bbVar2, ckVar.f157227b, i7, f157270a, jVar2, jVar)) {
                                    C59216j jVar6 = jVar2;
                                    jVar3 = jVar2;
                                    C59179cr crVar3 = r6;
                                    C59179cr crVar4 = new C59179cr(i5, i, ckVar.f157226a, ckVar.f157227b, jVar6, jVar);
                                    ((List) b.get(i7)).add(crVar3);
                                } else {
                                    jVar3 = jVar2;
                                }
                                i7++;
                                jVar2 = jVar3;
                            }
                            i6 = i + 1;
                            ckVar2 = ckVar;
                            jVar4 = jVar2;
                            clVar2 = clVar;
                            jVar5 = jVar;
                            e = z;
                        }
                    }
                    int i8 = 0;
                    for (int i9 = 6; i8 < i9; i9 = 6) {
                        List list2 = (List) b.get(i8);
                        int size = list2.size();
                        if (size == 0) {
                            if (csVar2.f157248e == 0) {
                                csVar = csVar2;
                                b.set(i8, (Object) null);
                                i8++;
                                csVar2 = csVar;
                            } else {
                                size = 0;
                            }
                        }
                        List b3 = m91829b(size);
                        C59215i a = C59215i.m91857a();
                        int i10 = 0;
                        while (i10 < size) {
                            C59179cr crVar5 = (C59179cr) list2.get(i10);
                            C59177cp cpVar = new C59177cp();
                            cpVar.f157231a = crVar5;
                            cpVar.f157232b.f157291a.mo56588e(crVar5.f157238d, crVar5.f157240f);
                            cpVar.f157232b.f157292b.mo56588e(crVar5.f157239e, crVar5.f157241g);
                            List list3 = b3;
                            list3.add(cpVar);
                            C59215i iVar = cpVar.f157232b;
                            a.f157291a.mo56590f(iVar.f157291a);
                            a.f157292b.mo56590f(iVar.f157292b);
                            i10++;
                            b3 = list3;
                            csVar2 = csVar2;
                        }
                        C59180cs csVar3 = csVar2;
                        List list4 = b3;
                        C59226t q = C59226t.m91936q(i8);
                        double d2 = f157270a;
                        C59135ba baVar = new C59135ba(q, d2);
                        C59178cq cqVar = new C59178cq(list4.size());
                        if (size > 0) {
                            C59226t b4 = baVar.mo56494b(a);
                            if (b4.f157334b != baVar.f157150a.f157334b) {
                                csVar = csVar3;
                                m91835i(q.mo56678y(), b4.mo56678y(), csVar, cqVar);
                                m91836j(new C59135ba(b4, d2), list4, csVar, cqVar);
                                m91835i(b4.mo56677x().mo56674u(), q.mo56677x().mo56674u(), csVar, cqVar);
                                b.set(i8, (Object) null);
                                i8++;
                                csVar2 = csVar;
                            }
                        }
                        csVar = csVar3;
                        m91836j(baVar, list4, csVar, cqVar);
                        b.set(i8, (Object) null);
                        i8++;
                        csVar2 = csVar;
                    }
                    this.f157274e = this.f157271b.size();
                    this.f157272c = true;
                }
            }
        }
        return new C59126as(this.f157273d);
    }

    /* renamed from: c */
    public final void mo56571c(C59173cl clVar) {
        this.f157271b.add(clVar);
        this.f157272c = false;
    }
}

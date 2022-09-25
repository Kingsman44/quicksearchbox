package com.google.android.libraries.assistant.pcp.p1570j.p1571a.p1572a;

import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.j.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C18788f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18793k f52914a;

    /* renamed from: b */
    public final /* synthetic */ C49019dl f52915b;

    /* renamed from: c */
    public final /* synthetic */ C63042fg f52916c;

    /* renamed from: d */
    public final /* synthetic */ Set f52917d;

    /* renamed from: e */
    public final /* synthetic */ Optional f52918e;

    public /* synthetic */ C18788f(C18793k kVar, C49019dl dlVar, C63042fg fgVar, Set set, Optional optional) {
        this.f52914a = kVar;
        this.f52915b = dlVar;
        this.f52916c = fgVar;
        this.f52917d = set;
        this.f52918e = optional;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0173, code lost:
        if (r4.contains(r0.build()) == false) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            com.google.android.libraries.assistant.pcp.j.a.a.k r1 = r0.f52914a
            com.google.assistant.ag.c.dl r2 = r0.f52915b
            com.google.protobuf.fg r3 = r0.f52916c
            java.util.Set r4 = r0.f52917d
            j$.util.Optional r5 = r0.f52918e
            r6 = r24
            j$.util.Optional r6 = (p3186j$.util.Optional) r6
            com.google.android.libraries.assistant.pcp.j.a.a.g r7 = com.google.android.libraries.assistant.pcp.p1570j.p1571a.p1572a.C18789g.f52919a
            j$.util.Optional r7 = r6.map(r7)
            com.google.android.libraries.assistant.pcp.o.n r8 = new com.google.android.libraries.assistant.pcp.o.n
            r8.<init>(r2)
            j$.util.Optional r7 = r7.map(r8)
            com.google.android.libraries.assistant.pcp.o.q r8 = com.google.android.libraries.assistant.pcp.p1583o.C19040q.NEWER
            java.lang.Object r7 = r7.orElse(r8)
            com.google.android.libraries.assistant.pcp.o.q r7 = (com.google.android.libraries.assistant.pcp.p1583o.C19040q) r7
            com.google.android.libraries.assistant.pcp.o.q r8 = com.google.android.libraries.assistant.pcp.p1583o.C19040q.OBSOLETE
            boolean r8 = r7.equals(r8)
            r9 = 0
            if (r8 == 0) goto L_0x004a
            com.google.android.libraries.assistant.pcp.j.a.d r1 = com.google.android.libraries.assistant.pcp.p1570j.p1571a.C18797e.m36218c()
            java.lang.Object r2 = r6.get()
            com.google.android.libraries.assistant.pcp.m.y r2 = (com.google.android.libraries.assistant.pcp.p1578m.C18995y) r2
            r1.mo24122c(r2)
            r1.mo24121b(r9)
            com.google.android.libraries.assistant.pcp.j.a.e r1 = r1.mo24120a()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x05dc
        L_0x004a:
            com.google.android.libraries.assistant.pcp.o.q r8 = com.google.android.libraries.assistant.pcp.p1583o.C19040q.EQUAL
            boolean r7 = r7.equals(r8)
            r10 = 2
            r11 = 1
            if (r7 == 0) goto L_0x03b3
            java.lang.Object r6 = r6.get()
            com.google.android.libraries.assistant.pcp.m.y r6 = (com.google.android.libraries.assistant.pcp.p1578m.C18995y) r6
            com.google.assistant.ag.c.dl r7 = r6.f53369b
            if (r7 != 0) goto L_0x0060
            com.google.assistant.ag.c.dl r7 = com.google.assistant.p3803ag.p3809c.C49019dl.f126792f
        L_0x0060:
            com.google.assistant.ag.c.dl r12 = com.google.assistant.p3803ag.p3809c.C49019dl.f126792f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.ag.c.dk r12 = (com.google.assistant.p3803ag.p3809c.C49018dk) r12
            java.lang.String r13 = r7.f126796c
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.assistant.ag.c.dl r14 = (com.google.assistant.p3803ag.p3809c.C49019dl) r14
            r13.getClass()
            int r15 = r14.f126794a
            r15 = r15 | r10
            r14.f126794a = r15
            r14.f126796c = r13
            int r13 = r7.f126795b
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.assistant.ag.c.dl r14 = (com.google.assistant.p3803ag.p3809c.C49019dl) r14
            int r15 = r14.f126794a
            r15 = r15 | r11
            r14.f126794a = r15
            r14.f126795b = r13
            com.google.assistant.ag.c.ha r13 = r7.f126797d
            if (r13 != 0) goto L_0x0091
            com.google.assistant.ag.c.ha r13 = com.google.assistant.p3803ag.p3809c.C49116ha.f127027d
        L_0x0091:
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.assistant.ag.c.dl r14 = (com.google.assistant.p3803ag.p3809c.C49019dl) r14
            r13.getClass()
            r14.f126797d = r13
            int r13 = r14.f126794a
            r13 = r13 | 4
            r14.f126794a = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.google.protobuf.cq r14 = r2.f126798e
            j$.util.stream.Stream r14 = p3186j$.util.Collection.EL.stream(r14)
            com.google.android.libraries.assistant.pcp.j.a.a.e r15 = new com.google.android.libraries.assistant.pcp.j.a.a.e
            r15.<init>(r2)
            j$.util.function.Function r9 = p3186j$.util.function.Function.CC.identity()
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.m89402b(r15, r9)
            java.lang.Object r9 = r14.collect(r9)
            com.google.common.b.hd r9 = (com.google.common.p4522b.C58495hd) r9
            com.google.common.b.ih r14 = new com.google.common.b.ih
            r14.<init>()
            com.google.protobuf.cq r15 = r7.f126798e
            java.util.Iterator r15 = r15.iterator()
        L_0x00cc:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0182
            java.lang.Object r16 = r15.next()
            r8 = r16
            com.google.assistant.ag.c.gu r8 = (com.google.assistant.p3803ag.p3809c.C49109gu) r8
            com.google.android.libraries.assistant.pcp.m.s r10 = com.google.android.libraries.assistant.pcp.p1583o.C19041r.m36458a(r7, r8)
            java.lang.Object r17 = r9.get(r10)
            com.google.assistant.ag.c.gu r17 = (com.google.assistant.p3803ag.p3809c.C49109gu) r17
            j$.util.Optional r17 = p3186j$.util.Optional.ofNullable(r17)
            boolean r18 = r17.isPresent()
            if (r18 == 0) goto L_0x00ff
            java.lang.Object r11 = r17.get()
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x00fc
            r17 = r15
            goto L_0x0175
        L_0x00fc:
            r10 = 2
            r11 = 1
            goto L_0x00cc
        L_0x00ff:
            com.google.assistant.ag.c.do r8 = com.google.assistant.p3803ag.p3809c.C49022do.f126800d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.ag.c.dn r8 = (com.google.assistant.p3803ag.p3809c.C49021dn) r8
            int r11 = r10.f53358d
            com.google.assistant.s.a.j r11 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r11)
            if (r11 != 0) goto L_0x0111
            com.google.assistant.s.a.j r11 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x0111:
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.ag.c.do r0 = (com.google.assistant.p3803ag.p3809c.C49022do) r0
            int r11 = r11.f139793X
            r0.f126803b = r11
            int r11 = r0.f126802a
            r17 = 1
            r11 = r11 | 1
            r0.f126802a = r11
            com.google.protobuf.bv r0 = r8.build()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x017e
            com.google.assistant.ag.c.do r0 = com.google.assistant.p3803ag.p3809c.C49022do.f126800d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.ag.c.dn r0 = (com.google.assistant.p3803ag.p3809c.C49021dn) r0
            int r8 = r10.f53358d
            com.google.assistant.s.a.j r8 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r8)
            if (r8 != 0) goto L_0x0140
            com.google.assistant.s.a.j r8 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x0140:
            r0.copyOnWrite()
            com.google.protobuf.bv r11 = r0.instance
            com.google.assistant.ag.c.do r11 = (com.google.assistant.p3803ag.p3809c.C49022do) r11
            int r8 = r8.f139793X
            r11.f126803b = r8
            int r8 = r11.f126802a
            r17 = 1
            r8 = r8 | 1
            r11.f126802a = r8
            java.lang.String r8 = r10.f53359e
            r0.copyOnWrite()
            com.google.protobuf.bv r11 = r0.instance
            com.google.assistant.ag.c.do r11 = (com.google.assistant.p3803ag.p3809c.C49022do) r11
            r8.getClass()
            r17 = r15
            int r15 = r11.f126802a
            r16 = 2
            r15 = r15 | 2
            r11.f126802a = r15
            r11.f126804c = r8
            com.google.protobuf.bv r0 = r0.build()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0178
        L_0x0175:
            r14.mo55373c(r10)
        L_0x0178:
            r0 = r23
            r15 = r17
            goto L_0x00fc
        L_0x017e:
            r0 = r23
            goto L_0x00fc
        L_0x0182:
            com.google.common.b.ij r0 = r14.mo55486f()
            com.google.common.b.ik r8 = new com.google.common.b.ik
            r8.<init>()
            r10 = 0
        L_0x018c:
            com.google.protobuf.cq r11 = r7.f126798e
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x02c4
            com.google.protobuf.cq r11 = r7.f126798e
            java.lang.Object r11 = r11.get(r10)
            com.google.assistant.ag.c.gu r11 = (com.google.assistant.p3803ag.p3809c.C49109gu) r11
            com.google.protobuf.cq r14 = r6.f53371d
            java.lang.Object r14 = r14.get(r10)
            com.google.assistant.ag.c.dt r14 = (com.google.assistant.p3803ag.p3809c.C49027dt) r14
            com.google.android.libraries.assistant.pcp.m.s r15 = com.google.android.libraries.assistant.pcp.p1583o.C19041r.m36458a(r7, r11)
            boolean r17 = r0.contains(r15)
            if (r17 == 0) goto L_0x01c0
            r12.mo53209b(r11)
            r13.add(r14)
            r21 = r0
            r20 = r1
            r22 = r4
            r17 = r5
            r19 = r9
            goto L_0x02b6
        L_0x01c0:
            java.lang.Object r17 = r9.get(r15)
            com.google.assistant.ag.c.gu r17 = (com.google.assistant.p3803ag.p3809c.C49109gu) r17
            j$.util.Optional r17 = p3186j$.util.Optional.ofNullable(r17)
            boolean r19 = r17.isEmpty()
            if (r19 == 0) goto L_0x01f4
            int r14 = r14.f126815b
            int r14 = com.google.assistant.p3803ag.p3809c.C49026ds.m85348a(r14)
            r19 = r9
            if (r14 == 0) goto L_0x01ea
            r9 = 3
            if (r14 != r9) goto L_0x01ea
            int r9 = r11.f127016d
            com.google.assistant.s.a.j r9 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r9)
            if (r9 != 0) goto L_0x01e7
            com.google.assistant.s.a.j r9 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x01e7:
            r8.mo55495c(r9, r15)
        L_0x01ea:
            r21 = r0
            r20 = r1
            r22 = r4
            r17 = r5
            goto L_0x02b6
        L_0x01f4:
            r19 = r9
            java.lang.Object r9 = r17.get()
            com.google.assistant.ag.c.gu r9 = (com.google.assistant.p3803ag.p3809c.C49109gu) r9
            r17 = r5
            int r5 = r14.f126815b
            int r5 = com.google.assistant.p3803ag.p3809c.C49026ds.m85348a(r5)
            if (r5 != 0) goto L_0x0209
            r20 = r1
            goto L_0x0226
        L_0x0209:
            r20 = r1
            r1 = 3
            if (r5 != r1) goto L_0x0226
            com.google.assistant.ag.c.az r1 = r9.f127017e
            if (r1 != 0) goto L_0x0214
            com.google.assistant.ag.c.az r1 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0214:
            com.google.assistant.ag.c.az r5 = r11.f127017e
            if (r5 != 0) goto L_0x021a
            com.google.assistant.ag.c.az r5 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x021a:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0226
            r21 = r0
            r22 = r4
            r0 = r14
            goto L_0x028d
        L_0x0226:
            int r1 = r9.f127013a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x022e
            r1 = 2
            goto L_0x022f
        L_0x022e:
            r1 = 3
        L_0x022f:
            com.google.assistant.ag.c.dt r5 = com.google.assistant.p3803ag.p3809c.C49027dt.f126812e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ag.c.dq r5 = (com.google.assistant.p3803ag.p3809c.C49024dq) r5
            r5.copyOnWrite()
            r21 = r0
            com.google.protobuf.bv r0 = r5.instance
            com.google.assistant.ag.c.dt r0 = (com.google.assistant.p3803ag.p3809c.C49027dt) r0
            r22 = r4
            int r4 = r1 + -1
            r0.f126815b = r4
            int r4 = r0.f126814a
            r18 = 1
            r4 = r4 | 1
            r0.f126814a = r4
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.assistant.ag.c.dt r0 = (com.google.assistant.p3803ag.p3809c.C49027dt) r0
            r3.getClass()
            r0.f126816c = r3
            int r4 = r0.f126814a
            r16 = 2
            r4 = r4 | 2
            r0.f126814a = r4
            int r0 = r14.f126815b
            int r0 = com.google.assistant.p3803ag.p3809c.C49026ds.m85348a(r0)
            if (r0 != 0) goto L_0x026b
            r0 = 1
        L_0x026b:
            if (r0 != r1) goto L_0x0274
            com.google.protobuf.fg r0 = r14.f126817d
            if (r0 != 0) goto L_0x0275
            com.google.protobuf.fg r0 = com.google.protobuf.C63042fg.f170152c
            goto L_0x0275
        L_0x0274:
            r0 = r3
        L_0x0275:
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.assistant.ag.c.dt r1 = (com.google.assistant.p3803ag.p3809c.C49027dt) r1
            r0.getClass()
            r1.f126817d = r0
            int r0 = r1.f126814a
            r0 = r0 | 4
            r1.f126814a = r0
            com.google.protobuf.bv r0 = r5.build()
            com.google.assistant.ag.c.dt r0 = (com.google.assistant.p3803ag.p3809c.C49027dt) r0
        L_0x028d:
            r12.mo53209b(r9)
            r13.add(r0)
            int r1 = r14.f126815b
            int r1 = com.google.assistant.p3803ag.p3809c.C49026ds.m85348a(r1)
            if (r1 == 0) goto L_0x02b6
            r4 = 3
            if (r1 != r4) goto L_0x02b6
            int r0 = r0.f126815b
            int r0 = com.google.assistant.p3803ag.p3809c.C49026ds.m85348a(r0)
            if (r0 != 0) goto L_0x02a7
            goto L_0x02a9
        L_0x02a7:
            if (r0 == r4) goto L_0x02b6
        L_0x02a9:
            int r0 = r11.f127016d
            com.google.assistant.s.a.j r0 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r0)
            if (r0 != 0) goto L_0x02b3
            com.google.assistant.s.a.j r0 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x02b3:
            r8.mo55495c(r0, r15)
        L_0x02b6:
            int r10 = r10 + 1
            r5 = r17
            r9 = r19
            r1 = r20
            r0 = r21
            r4 = r22
            goto L_0x018c
        L_0x02c4:
            r21 = r0
            r20 = r1
            r22 = r4
            r17 = r5
            com.google.protobuf.cq r0 = r7.f126798e
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.assistant.pcp.j.a.a.c r1 = new com.google.android.libraries.assistant.pcp.j.a.a.c
            r1.<init>(r7)
            j$.util.stream.Stream r0 = r0.map(r1)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155947b
            java.lang.Object r0 = r0.collect(r1)
            com.google.common.b.ij r0 = (com.google.common.p4522b.C58528ij) r0
            com.google.protobuf.cq r1 = r2.f126798e
            java.util.Iterator r1 = r1.iterator()
        L_0x02e9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0352
            java.lang.Object r4 = r1.next()
            com.google.assistant.ag.c.gu r4 = (com.google.assistant.p3803ag.p3809c.C49109gu) r4
            com.google.android.libraries.assistant.pcp.m.s r5 = com.google.android.libraries.assistant.pcp.p1583o.C19041r.m36458a(r2, r4)
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L_0x02e9
            r12.mo53209b(r4)
            com.google.assistant.ag.c.dt r5 = com.google.assistant.p3803ag.p3809c.C49027dt.f126812e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ag.c.dq r5 = (com.google.assistant.p3803ag.p3809c.C49024dq) r5
            int r4 = r4.f127013a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0312
            r4 = 2
            goto L_0x0313
        L_0x0312:
            r4 = 3
        L_0x0313:
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.ag.c.dt r7 = (com.google.assistant.p3803ag.p3809c.C49027dt) r7
            int r4 = r4 + -1
            r7.f126815b = r4
            int r4 = r7.f126814a
            r9 = 1
            r4 = r4 | r9
            r7.f126814a = r4
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.ag.c.dt r4 = (com.google.assistant.p3803ag.p3809c.C49027dt) r4
            r3.getClass()
            r4.f126816c = r3
            int r7 = r4.f126814a
            r9 = 2
            r7 = r7 | r9
            r4.f126814a = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.ag.c.dt r4 = (com.google.assistant.p3803ag.p3809c.C49027dt) r4
            r3.getClass()
            r4.f126817d = r3
            int r7 = r4.f126814a
            r7 = r7 | 4
            r4.f126814a = r7
            com.google.protobuf.bv r4 = r5.build()
            com.google.assistant.ag.c.dt r4 = (com.google.assistant.p3803ag.p3809c.C49027dt) r4
            r13.add(r4)
            goto L_0x02e9
        L_0x0352:
            com.google.android.libraries.assistant.pcp.m.y r0 = com.google.android.libraries.assistant.pcp.p1578m.C18995y.f53366e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.pcp.m.x r0 = (com.google.android.libraries.assistant.pcp.p1578m.C18994x) r0
            com.google.protobuf.bv r1 = r12.build()
            com.google.assistant.ag.c.dl r1 = (com.google.assistant.p3803ag.p3809c.C49019dl) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.assistant.pcp.m.y r2 = (com.google.android.libraries.assistant.pcp.p1578m.C18995y) r2
            r1.getClass()
            r2.f53369b = r1
            int r1 = r2.f53368a
            r4 = 1
            r1 = r1 | r4
            r2.f53368a = r1
            com.google.assistant.ag.c.dt r1 = r6.f53370c
            if (r1 != 0) goto L_0x0378
            com.google.assistant.ag.c.dt r1 = com.google.assistant.p3803ag.p3809c.C49027dt.f126812e
        L_0x0378:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.assistant.pcp.m.y r2 = (com.google.android.libraries.assistant.pcp.p1578m.C18995y) r2
            r1.getClass()
            r2.f53370c = r1
            int r1 = r2.f53368a
            r4 = 2
            r1 = r1 | r4
            r2.f53368a = r1
            r0.mo24236a(r13)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.pcp.m.y r0 = (com.google.android.libraries.assistant.pcp.p1578m.C18995y) r0
            r1 = r22
            com.google.android.libraries.assistant.pcp.m.y r0 = com.google.android.libraries.assistant.pcp.p1583o.C19041r.m36459b(r0, r1, r3)
            com.google.android.libraries.assistant.pcp.j.a.a.a r1 = new com.google.android.libraries.assistant.pcp.j.a.a.a
            r1.<init>()
            r1.mo24125c(r0)
            r0 = r21
            r1.mo24126d(r0)
            com.google.common.b.in r0 = r8.mo55493a()
            r1.mo24124b(r0)
            com.google.android.libraries.assistant.pcp.j.a.a.j r0 = r1.mo24123a()
            goto L_0x053d
        L_0x03b3:
            r20 = r1
            r1 = r4
            r17 = r5
            com.google.assistant.ag.c.dt r0 = com.google.assistant.p3803ag.p3809c.C49027dt.f126812e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.ag.c.dq r0 = (com.google.assistant.p3803ag.p3809c.C49024dq) r0
            com.google.assistant.ag.c.ha r4 = r2.f126797d
            if (r4 != 0) goto L_0x03c6
            com.google.assistant.ag.c.ha r4 = com.google.assistant.p3803ag.p3809c.C49116ha.f127027d
        L_0x03c6:
            int r4 = r4.f127029a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x03ce
            r4 = 2
            goto L_0x03cf
        L_0x03ce:
            r4 = 3
        L_0x03cf:
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.ag.c.dt r5 = (com.google.assistant.p3803ag.p3809c.C49027dt) r5
            int r4 = r4 + -1
            r5.f126815b = r4
            int r4 = r5.f126814a
            r7 = 1
            r4 = r4 | r7
            r5.f126814a = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.ag.c.dt r4 = (com.google.assistant.p3803ag.p3809c.C49027dt) r4
            r3.getClass()
            r4.f126816c = r3
            int r5 = r4.f126814a
            r7 = 2
            r5 = r5 | r7
            r4.f126814a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.ag.c.dt r4 = (com.google.assistant.p3803ag.p3809c.C49027dt) r4
            r3.getClass()
            r4.f126817d = r3
            int r5 = r4.f126814a
            r5 = r5 | 4
            r4.f126814a = r5
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.ag.c.dt r0 = (com.google.assistant.p3803ag.p3809c.C49027dt) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            com.google.protobuf.cq r5 = r2.f126798e
            int r5 = r5.size()
            r4.<init>(r5)
            com.google.common.b.ih r5 = new com.google.common.b.ih
            r5.<init>()
            com.google.protobuf.cq r7 = r2.f126798e
            java.util.Iterator r7 = r7.iterator()
        L_0x0420:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0486
            java.lang.Object r8 = r7.next()
            com.google.assistant.ag.c.gu r8 = (com.google.assistant.p3803ag.p3809c.C49109gu) r8
            int r9 = r8.f127013a
            r9 = r9 & 8
            if (r9 == 0) goto L_0x0434
            r9 = 2
            goto L_0x0435
        L_0x0434:
            r9 = 3
        L_0x0435:
            com.google.assistant.ag.c.dt r10 = com.google.assistant.p3803ag.p3809c.C49027dt.f126812e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.ag.c.dq r10 = (com.google.assistant.p3803ag.p3809c.C49024dq) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.ag.c.dt r11 = (com.google.assistant.p3803ag.p3809c.C49027dt) r11
            int r12 = r9 + -1
            r11.f126815b = r12
            int r12 = r11.f126814a
            r13 = 1
            r12 = r12 | r13
            r11.f126814a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.ag.c.dt r11 = (com.google.assistant.p3803ag.p3809c.C49027dt) r11
            r3.getClass()
            r11.f126816c = r3
            int r12 = r11.f126814a
            r13 = 2
            r12 = r12 | r13
            r11.f126814a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.ag.c.dt r11 = (com.google.assistant.p3803ag.p3809c.C49027dt) r11
            r3.getClass()
            r11.f126817d = r3
            int r12 = r11.f126814a
            r12 = r12 | 4
            r11.f126814a = r12
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.ag.c.dt r10 = (com.google.assistant.p3803ag.p3809c.C49027dt) r10
            r4.add(r10)
            r10 = 3
            if (r9 != r10) goto L_0x0420
            com.google.android.libraries.assistant.pcp.m.s r8 = com.google.android.libraries.assistant.pcp.p1583o.C19041r.m36458a(r2, r8)
            r5.mo55373c(r8)
            goto L_0x0420
        L_0x0486:
            com.google.common.b.ik r7 = new com.google.common.b.ik
            r7.<init>()
            boolean r8 = r6.isPresent()
            if (r8 == 0) goto L_0x04ec
            com.google.common.b.ij r5 = r5.mo55486f()
            java.lang.Object r6 = r6.get()
            com.google.android.libraries.assistant.pcp.m.y r6 = (com.google.android.libraries.assistant.pcp.p1578m.C18995y) r6
            r9 = 0
        L_0x049c:
            com.google.assistant.ag.c.dl r8 = r6.f53369b
            if (r8 != 0) goto L_0x04a2
            com.google.assistant.ag.c.dl r8 = com.google.assistant.p3803ag.p3809c.C49019dl.f126792f
        L_0x04a2:
            com.google.protobuf.cq r8 = r8.f126798e
            int r8 = r8.size()
            if (r9 >= r8) goto L_0x04ec
            com.google.protobuf.cq r8 = r6.f53371d
            java.lang.Object r8 = r8.get(r9)
            com.google.assistant.ag.c.dt r8 = (com.google.assistant.p3803ag.p3809c.C49027dt) r8
            int r8 = r8.f126815b
            int r8 = com.google.assistant.p3803ag.p3809c.C49026ds.m85348a(r8)
            r10 = 3
            if (r8 != 0) goto L_0x04bc
            goto L_0x04e9
        L_0x04bc:
            if (r8 != r10) goto L_0x04e9
            com.google.assistant.ag.c.dl r8 = r6.f53369b
            if (r8 != 0) goto L_0x04c5
            com.google.assistant.ag.c.dl r11 = com.google.assistant.p3803ag.p3809c.C49019dl.f126792f
            goto L_0x04c6
        L_0x04c5:
            r11 = r8
        L_0x04c6:
            if (r8 != 0) goto L_0x04ca
            com.google.assistant.ag.c.dl r8 = com.google.assistant.p3803ag.p3809c.C49019dl.f126792f
        L_0x04ca:
            com.google.protobuf.cq r8 = r8.f126798e
            java.lang.Object r8 = r8.get(r9)
            com.google.assistant.ag.c.gu r8 = (com.google.assistant.p3803ag.p3809c.C49109gu) r8
            com.google.android.libraries.assistant.pcp.m.s r8 = com.google.android.libraries.assistant.pcp.p1583o.C19041r.m36458a(r11, r8)
            boolean r11 = r5.contains(r8)
            if (r11 != 0) goto L_0x04e9
            int r11 = r8.f53358d
            com.google.assistant.s.a.j r11 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r11)
            if (r11 != 0) goto L_0x04e6
            com.google.assistant.s.a.j r11 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x04e6:
            r7.mo55495c(r11, r8)
        L_0x04e9:
            int r9 = r9 + 1
            goto L_0x049c
        L_0x04ec:
            com.google.android.libraries.assistant.pcp.m.y r5 = com.google.android.libraries.assistant.pcp.p1578m.C18995y.f53366e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.pcp.m.x r5 = (com.google.android.libraries.assistant.pcp.p1578m.C18994x) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.assistant.pcp.m.y r6 = (com.google.android.libraries.assistant.pcp.p1578m.C18995y) r6
            r2.getClass()
            r6.f53369b = r2
            int r2 = r6.f53368a
            r8 = 1
            r2 = r2 | r8
            r6.f53368a = r2
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.libraries.assistant.pcp.m.y r2 = (com.google.android.libraries.assistant.pcp.p1578m.C18995y) r2
            r0.getClass()
            r2.f53370c = r0
            int r0 = r2.f53368a
            r6 = 2
            r0 = r0 | r6
            r2.f53368a = r0
            r5.mo24236a(r4)
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.libraries.assistant.pcp.m.y r0 = (com.google.android.libraries.assistant.pcp.p1578m.C18995y) r0
            com.google.android.libraries.assistant.pcp.m.y r0 = com.google.android.libraries.assistant.pcp.p1583o.C19041r.m36459b(r0, r1, r3)
            com.google.android.libraries.assistant.pcp.j.a.a.a r1 = new com.google.android.libraries.assistant.pcp.j.a.a.a
            r1.<init>()
            r1.mo24125c(r0)
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            r1.mo24126d(r0)
            com.google.common.b.in r0 = r7.mo55493a()
            r1.mo24124b(r0)
            com.google.android.libraries.assistant.pcp.j.a.a.j r0 = r1.mo24123a()
        L_0x053d:
            r1 = r20
            com.google.android.libraries.assistant.pcp.datastore.a.a.b r2 = r1.f52925c
            com.google.android.libraries.assistant.pcp.m.y r3 = r0.mo24127a()
            com.google.assistant.ag.c.dl r4 = r3.f53369b
            if (r4 != 0) goto L_0x054b
            com.google.assistant.ag.c.dl r4 = com.google.assistant.p3803ag.p3809c.C49019dl.f126792f
        L_0x054b:
            java.lang.String r5 = r4.f126796c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0564
            com.google.common.f.e r2 = com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18581b.f52604a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "The underlying DataElement has empty id"
            r4 = 47359(0xb8ff, float:6.6364E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x05cb
        L_0x0564:
            int r5 = r4.f126794a
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x05bb
            com.google.assistant.ag.c.dt r5 = r3.f53370c
            if (r5 != 0) goto L_0x0571
            com.google.assistant.ag.c.dt r7 = com.google.assistant.p3803ag.p3809c.C49027dt.f126812e
            goto L_0x0572
        L_0x0571:
            r7 = r5
        L_0x0572:
            int r7 = r7.f126814a
            r7 = r7 & r6
            if (r7 == 0) goto L_0x05aa
            com.google.android.libraries.assistant.pcp.datastore.room.h r2 = r2.f52605b
            if (r3 == 0) goto L_0x05a2
            int r7 = r4.f126795b
            java.lang.String r4 = r4.f126796c
            if (r4 == 0) goto L_0x059a
            if (r5 != 0) goto L_0x0585
            com.google.assistant.ag.c.dt r5 = com.google.assistant.p3803ag.p3809c.C49027dt.f126812e
        L_0x0585:
            int r5 = r5.f126815b
            int r5 = com.google.assistant.p3803ag.p3809c.C49026ds.m85348a(r5)
            if (r5 != 0) goto L_0x058f
            r11 = 1
            goto L_0x0590
        L_0x058f:
            r11 = r5
        L_0x0590:
            com.google.android.libraries.assistant.pcp.datastore.room.a r5 = new com.google.android.libraries.assistant.pcp.datastore.room.a
            r5.<init>(r7, r4, r3, r11)
            com.google.common.util.concurrent.cx r2 = r2.mo24088c(r5)
            goto L_0x05cb
        L_0x059a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null id"
            r0.<init>(r1)
            throw r0
        L_0x05a2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null storedElement"
            r0.<init>(r1)
            throw r0
        L_0x05aa:
            com.google.common.f.e r2 = com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18581b.f52604a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Provided StoredElement has no structured_data_state type"
            r4 = 47357(0xb8fd, float:6.6361E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x05cb
        L_0x05bb:
            com.google.common.f.e r2 = com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18581b.f52604a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "The underlying DataElement has no feature_type"
            r4 = 47358(0xb8fe, float:6.6363E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x05cb:
            com.google.android.libraries.assistant.pcp.j.a.a.h r3 = new com.google.android.libraries.assistant.pcp.j.a.a.h
            r4 = r17
            r3.<init>(r1, r0, r4)
            java.util.concurrent.Executor r0 = r1.f52924b
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r2, r1, r0)
        L_0x05dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.pcp.p1570j.p1571a.p1572a.C18788f.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}

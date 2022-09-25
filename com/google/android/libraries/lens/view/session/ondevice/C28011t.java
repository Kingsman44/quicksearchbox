package com.google.android.libraries.lens.view.session.ondevice;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.t */
/* compiled from: PG */
public final /* synthetic */ class C28011t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28014w f76221a;

    /* renamed from: b */
    public final /* synthetic */ C56244ay f76222b;

    /* renamed from: c */
    public final /* synthetic */ C27971i f76223c;

    public /* synthetic */ C28011t(C28014w wVar, C56244ay ayVar, C27971i iVar) {
        this.f76221a = wVar;
        this.f76222b = ayVar;
        this.f76223c = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0427  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r0 = r26
            com.google.android.libraries.lens.view.session.ondevice.w r1 = r0.f76221a
            com.google.bp.f.b.a.ay r2 = r0.f76222b
            com.google.android.libraries.lens.view.session.ondevice.i r8 = r0.f76223c
            com.google.android.libraries.lens.view.session.ondevice.z r1 = r1.f76228a
            com.google.android.libraries.lens.view.p2070an.C25387ay.m46760a()
            com.google.android.libraries.lens.view.session.ondevice.x r3 = r1.f76247j
            if (r3 == 0) goto L_0x070e
            com.google.bp.f.b.a.ay r3 = r3.f76230b
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x001b
            goto L_0x070e
        L_0x001b:
            com.google.android.libraries.lens.view.session.ondevice.x r5 = r1.f76247j
            com.google.android.libraries.lens.e.ad r2 = r5.f76229a
            com.google.android.libraries.lens.e.ae r2 = r2.mo29679b()
            com.google.bp.f.b.a.cg r2 = r2.mo29686c()
            com.google.bp.f.b.a.df r3 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            boolean r3 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r2, r3)
            r4 = 1
            if (r3 != 0) goto L_0x0179
            com.google.bp.f.b.a.df r3 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TEXT
            boolean r3 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r2, r3)
            if (r3 == 0) goto L_0x003a
            goto L_0x0179
        L_0x003a:
            com.google.bp.f.b.a.df r3 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.AUTO_FILTER
            boolean r3 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r2, r3)
            if (r3 == 0) goto L_0x0152
            android.util.Size r2 = r8.mo33382a()
            if (r2 != 0) goto L_0x0055
            com.google.android.libraries.lens.view.d.k r1 = r5.f76233e
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Engine result is missing Bitmap size"
            r2.<init>(r3)
            r1.mo30914d(r2)
            return
        L_0x0055:
            android.util.Size r3 = r5.f76232d
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0075
            com.google.common.f.a.d r3 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            r6 = 49980(0xc33c, float:7.0037E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r6)
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            java.lang.String r6 = "Engine result has unexpected size (%s output vs %s input)"
            android.util.Size r7 = r5.f76232d
            r3.mo56354G(r6, r2, r7)
        L_0x0075:
            com.google.bp.f.b.a.aa r2 = com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa.f149748b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bp.f.b.a.z r2 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56328z) r2
            com.google.bp.f.b.a.aa r3 = r8.mo33394k()
            if (r3 == 0) goto L_0x00a4
            com.google.bp.f.b.a.aa r3 = r8.mo33394k()
            r3.getClass()
            com.google.common.f.a.d r6 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.protobuf.cq r7 = r3.f149750a
            int r7 = r7.size()
            r9 = 49979(0xc33b, float:7.0035E-41)
            java.lang.String r10 = "Adding %d reconciled detection results"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r9)).mo56387q(r10, r7)
            com.google.protobuf.cq r3 = r3.f149750a
            r2.mo54356a(r3)
            goto L_0x00d9
        L_0x00a4:
            com.google.bp.f.b.a.aa r3 = r8.mo33395l()
            if (r3 == 0) goto L_0x00cb
            com.google.bp.f.b.a.aa r3 = r8.mo33395l()
            r3.getClass()
            com.google.common.f.a.d r6 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.protobuf.cq r7 = r3.f149750a
            int r7 = r7.size()
            r9 = 49978(0xc33a, float:7.0034E-41)
            java.lang.String r10 = "Adding %d unreconciled detection results"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r9)).mo56387q(r10, r7)
            com.google.protobuf.cq r3 = r3.f149750a
            r2.mo54356a(r3)
            goto L_0x00d9
        L_0x00cb:
            com.google.common.f.a.d r3 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r6 = "Hints cascade did not produce detections."
            r7 = 49977(0xc339, float:7.0033E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r7)).mo56386p(r6)
        L_0x00d9:
            com.google.protobuf.bv r2 = r2.build()
            com.google.bp.f.b.a.aa r2 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa) r2
            com.google.android.libraries.lens.view.an.a.h r1 = r1.f76243f
            com.google.android.libraries.lens.e.ad r3 = r5.f76229a
            com.google.android.libraries.lens.e.ae r3 = r3.mo29679b()
            com.google.bp.f.b.a.cg r3 = r3.mo29686c()
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            com.google.common.o.amc r1 = r1.mo30409c(r3, r6, r7)
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            com.google.bp.f.b.a.dd r7 = com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd.f150050b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.bp.f.b.a.dc r7 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56303dc) r7
            com.google.bp.f.b.a.db r9 = com.google.p4242bp.p4257f.p4260b.p4261a.C56302db.f150043e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.bp.f.b.a.ch r9 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56281ch) r9
            com.google.bp.f.b.a.df r10 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.AUTO_FILTER
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.bp.f.b.a.db r11 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56302db) r11
            int r10 = r10.f150068m
            r11.f150048d = r10
            int r10 = r11.f150045a
            r4 = r4 | r10
            r11.f150045a = r4
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.bp.f.b.a.dd r4 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd) r4
            com.google.protobuf.bv r9 = r9.build()
            com.google.bp.f.b.a.db r9 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56302db) r9
            r9.getClass()
            r4.mo54350a()
            com.google.protobuf.cq r4 = r4.f150052a
            r4.add(r9)
            com.google.protobuf.bv r4 = r7.build()
            com.google.bp.f.b.a.dd r4 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd) r4
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            com.google.android.libraries.lens.e.t r1 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52183o(r2, r1, r3, r6, r4)
            boolean r2 = r8.mo33396m()
            r1.mo29729i(r2)
            com.google.android.libraries.lens.e.u r1 = r1.mo29721a()
            r5.mo33464a(r1)
            return
        L_0x0152:
            com.google.bp.f.b.a.aa r3 = com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa.f149748b
            com.google.android.libraries.lens.view.an.a.h r1 = r1.f76243f
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            com.google.common.o.amc r1 = r1.mo30409c(r2, r4, r6)
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            com.google.android.libraries.lens.e.t r1 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52183o(r3, r1, r2, r4, r4)
            boolean r2 = r8.mo33396m()
            r1.mo29729i(r2)
            com.google.android.libraries.lens.e.u r1 = r1.mo29721a()
            r5.mo33464a(r1)
            return
        L_0x0179:
            com.google.bp.f.b.a.aa r2 = com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa.f149748b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bp.f.b.a.z r2 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56328z) r2
            com.google.bg.b.t r3 = r8.mo33392i()
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r3)
            com.google.bg.b.v r6 = r8.mo33393j()
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90833j(r6)
            com.google.android.libraries.lens.e.ad r7 = r5.f76229a
            com.google.android.libraries.lens.e.ae r7 = r7.mo29679b()
            com.google.bp.f.b.a.cg r7 = r7.mo29686c()
            com.google.bp.f.b.a.df r9 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            boolean r7 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r7, r9)
            if (r7 == 0) goto L_0x01d9
            com.google.android.libraries.lens.view.session.ondevice.ak r7 = r1.f76241d
            boolean r7 = r7.mo33380i()
            if (r7 != 0) goto L_0x01ac
            goto L_0x01d9
        L_0x01ac:
            boolean r7 = r6.mo56113h()
            if (r7 == 0) goto L_0x01c0
            com.google.android.libraries.lens.view.session.ondevice.ak r7 = r1.f76241d
            java.lang.Object r6 = r6.mo56107c()
            com.google.bg.b.v r6 = (com.google.p4172bg.p4174b.C55733v) r6
            com.google.bp.f.b.a.ay r9 = r5.f76230b
            r7.mo33381j(r6)
            goto L_0x01d9
        L_0x01c0:
            boolean r6 = r3.mo56113h()
            if (r6 == 0) goto L_0x01d9
            com.google.android.libraries.lens.view.session.ondevice.ak r6 = r1.f76241d
            java.lang.Object r7 = r3.mo56107c()
            com.google.bg.b.t r7 = (com.google.p4172bg.p4174b.C55731t) r7
            com.google.bg.b.v r7 = r7.f147066d
            if (r7 != 0) goto L_0x01d4
            com.google.bg.b.v r7 = com.google.p4172bg.p4174b.C55733v.f147070l
        L_0x01d4:
            com.google.bp.f.b.a.ay r9 = r5.f76230b
            r6.mo33381j(r7)
        L_0x01d9:
            com.google.lens.g.bd r6 = r8.mo33386e()
            r7 = 4
            if (r6 == 0) goto L_0x027b
            com.google.lens.g.bd r6 = r8.mo33386e()
            r6.getClass()
            com.google.bp.f.b.a.ay r10 = r5.f76230b
            r10.getClass()
            android.util.Size r11 = r5.f76232d
            com.google.protobuf.cq r12 = r6.f168143a
            int r12 = r12.size()
            if (r12 != 0) goto L_0x01fe
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89845m()
            r16 = r8
            goto L_0x0442
        L_0x01fe:
            com.google.common.b.gp r12 = new com.google.common.b.gp
            r12.<init>(r7)
            com.google.protobuf.cq r6 = r6.f168143a
            java.util.Iterator r6 = r6.iterator()
        L_0x0209:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0273
            java.lang.Object r13 = r6.next()
            com.google.lens.g.bb r13 = (com.google.lens.p4701g.C62279bb) r13
            com.google.protobuf.cq r14 = r13.f168138c
            j$.util.stream.Stream r14 = p3186j$.util.Collection.EL.stream(r14)
            com.google.android.libraries.lens.view.session.ondevice.ab r15 = new com.google.android.libraries.lens.view.session.ondevice.ab
            r15.<init>(r11)
            j$.util.stream.Stream r14 = r14.map(r15)
            j$.util.stream.Collector r15 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r14 = r14.collect(r15)
            com.google.common.b.gu r14 = (com.google.common.p4522b.C58485gu) r14
            com.google.bg.b.d r15 = r13.f168139d
            if (r15 != 0) goto L_0x0232
            com.google.bg.b.d r15 = com.google.p4172bg.p4174b.C55715d.f146997g
        L_0x0232:
            com.google.bp.f.b.a.ae r15 = com.google.android.libraries.lens.common.p1998a.C24093a.m44750f(r15, r11)
            r16 = r8
            long r7 = r10.f149807d
            java.lang.String r18 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r13.f168137b
            float r8 = r15.f149757c
            float r9 = r15.f149756b
            float r4 = r15.f149758d
            float r0 = r15.f149759e
            r25 = r6
            float r6 = r15.f149760f
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r4
            r23 = r0
            r24 = r6
            java.lang.String r0 = com.google.android.libraries.lens.common.p1999b.C24103a.m44779b(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r4 = r13.f168137b
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            com.google.android.libraries.lens.view.session.ondevice.c.a r6 = new com.google.android.libraries.lens.view.session.ondevice.c.a
            r6.<init>(r14, r15, r0, r4)
            r12.mo55395g(r6)
            r0 = r26
            r8 = r16
            r6 = r25
            r4 = 1
            r7 = 4
            goto L_0x0209
        L_0x0273:
            r16 = r8
            com.google.common.b.gu r6 = r12.mo55394f()
            goto L_0x0442
        L_0x027b:
            r16 = r8
            boolean r0 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52182l(r3)
            if (r0 == 0) goto L_0x043e
            com.google.android.libraries.lens.e.ad r0 = r5.f76229a
            com.google.android.libraries.lens.e.ae r0 = r0.mo29679b()
            com.google.bp.f.b.a.cg r0 = r0.mo29686c()
            boolean r0 = r1.mo33475n(r0)
            if (r0 != 0) goto L_0x0295
            goto L_0x043e
        L_0x0295:
            java.lang.Object r0 = r3.mo56107c()
            com.google.bg.b.t r0 = (com.google.p4172bg.p4174b.C55731t) r0
            com.google.common.f.a.d r4 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            r6 = 49968(0xc330, float:7.002E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            com.google.protobuf.cq r6 = r0.f147065c
            int r6 = r6.size()
            com.google.protobuf.cq r7 = r0.f147068f
            int r7 = r7.size()
            java.lang.String r8 = "extractText %d lines, %d blocks"
            r4.mo56393w(r8, r6, r7)
            com.google.protobuf.cq r4 = r0.f147065c
            com.google.common.b.gp r6 = new com.google.common.b.gp
            r7 = 4
            r6.<init>(r7)
            java.util.Iterator r7 = r4.iterator()
        L_0x02c9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x02de
            java.lang.Object r8 = r7.next()
            com.google.bg.b.j r8 = (com.google.p4172bg.p4174b.C55721j) r8
            p3186j$.util.Objects.requireNonNull(r8)
            p3186j$.util.Objects.requireNonNull(r8)
            float r8 = r8.f147023e
            goto L_0x02c9
        L_0x02de:
            com.google.protobuf.cq r7 = r0.f147068f
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x0388
            com.google.android.libraries.lens.view.session.ondevice.ak r7 = r1.f76241d
            com.google.common.base.ax r8 = r7.f76056o
            boolean r8 = r8.mo56113h()
            if (r8 == 0) goto L_0x0388
            com.google.protos.m.a.f r8 = r7.f76048g
            com.google.protobuf.cq r8 = r8.f178307a
            com.google.common.base.ax r7 = r7.f76056o
            java.lang.Object r7 = r7.mo56107c()
            boolean r7 = r8.contains(r7)
            if (r7 != 0) goto L_0x0388
            com.google.protobuf.cq r7 = r0.f147068f
            java.util.Iterator r7 = r7.iterator()
        L_0x0306:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x03f8
            java.lang.Object r8 = r7.next()
            com.google.bg.b.r r8 = (com.google.p4172bg.p4174b.C55729r) r8
            com.google.protobuf.ch r9 = r8.f147059c
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.android.libraries.lens.view.session.ondevice.n r10 = new com.google.android.libraries.lens.view.session.ondevice.n
            r10.<init>(r4)
            j$.util.stream.Stream r9 = r9.map(r10)
            j$.util.stream.Collector r10 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r9 = r9.collect(r10)
            com.google.common.b.gu r9 = (com.google.common.p4522b.C58485gu) r9
            com.google.bg.b.d r10 = r8.f147058b
            if (r10 != 0) goto L_0x0332
            com.google.bg.b.d r10 = com.google.p4172bg.p4174b.C55715d.f146997g
        L_0x0332:
            com.google.bp.f.b.a.ay r11 = r5.f76230b
            r11.getClass()
            long r11 = r11.f149807d
            java.lang.String r18 = java.lang.String.valueOf(r11)
            java.lang.String r19 = "lode_paragraph"
            int r11 = r10.f147000b
            float r11 = (float) r11
            int r12 = r10.f147001c
            float r12 = (float) r12
            int r13 = r10.f147002d
            float r13 = (float) r13
            int r14 = r10.f147003e
            float r14 = (float) r14
            float r10 = r10.f147004f
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r10
            java.lang.String r10 = com.google.android.libraries.lens.common.p1999b.C24103a.m44779b(r18, r19, r20, r21, r22, r23, r24)
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)
            com.google.android.libraries.lens.view.session.ondevice.o r11 = new com.google.android.libraries.lens.view.session.ondevice.o
            r11.<init>(r5)
            j$.util.stream.Stream r9 = r9.map(r11)
            j$.util.stream.Collector r11 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r9 = r9.collect(r11)
            com.google.common.b.gu r9 = (com.google.common.p4522b.C58485gu) r9
            com.google.bg.b.d r8 = r8.f147058b
            if (r8 != 0) goto L_0x0376
            com.google.bg.b.d r8 = com.google.p4172bg.p4174b.C55715d.f146997g
        L_0x0376:
            android.util.Size r11 = r5.f76232d
            com.google.bp.f.b.a.ae r8 = com.google.android.libraries.lens.common.p1998a.C24093a.m44750f(r8, r11)
            com.google.common.base.b r11 = com.google.common.base.C58836b.f156633a
            com.google.android.libraries.lens.view.session.ondevice.c.a r12 = new com.google.android.libraries.lens.view.session.ondevice.c.a
            r12.<init>(r9, r8, r10, r11)
            r6.mo55395g(r12)
            goto L_0x0306
        L_0x0388:
            java.util.Iterator r4 = r4.iterator()
        L_0x038c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x03f8
            java.lang.Object r7 = r4.next()
            com.google.bg.b.j r7 = (com.google.p4172bg.p4174b.C55721j) r7
            int r8 = r7.f147019a
            r9 = 1
            r8 = r8 & r9
            if (r8 == 0) goto L_0x03a5
            com.google.bg.b.d r8 = r7.f147021c
            if (r8 != 0) goto L_0x03b4
            com.google.bg.b.d r8 = com.google.p4172bg.p4174b.C55715d.f146997g
            goto L_0x03b4
        L_0x03a5:
            com.google.protobuf.cq r8 = r7.f147020b
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            com.google.bg.b.x r8 = (com.google.p4172bg.p4174b.C55735x) r8
            com.google.bg.b.d r8 = r8.f147086b
            if (r8 != 0) goto L_0x03b4
            com.google.bg.b.d r8 = com.google.p4172bg.p4174b.C55715d.f146997g
        L_0x03b4:
            com.google.bp.f.b.a.ay r9 = r5.f76230b
            r9.getClass()
            long r9 = r9.f149807d
            java.lang.String r18 = java.lang.String.valueOf(r9)
            int r9 = r8.f147000b
            int r10 = r8.f147001c
            int r11 = r8.f147002d
            int r12 = r8.f147003e
            float r13 = r8.f147004f
            java.lang.String r19 = "lode_line"
            float r9 = (float) r9
            float r10 = (float) r10
            float r11 = (float) r11
            float r12 = (float) r12
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r12
            r24 = r13
            java.lang.String r9 = com.google.android.libraries.lens.common.p1999b.C24103a.m44779b(r18, r19, r20, r21, r22, r23, r24)
            android.util.Size r10 = r5.f76232d
            com.google.android.libraries.lens.view.session.ondevice.c.q r7 = com.google.android.libraries.lens.view.session.ondevice.C27912ac.m51961a(r7, r10)
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89846n(r7)
            android.util.Size r10 = r5.f76232d
            com.google.bp.f.b.a.ae r8 = com.google.android.libraries.lens.common.p1998a.C24093a.m44750f(r8, r10)
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
            com.google.android.libraries.lens.view.session.ondevice.c.a r11 = new com.google.android.libraries.lens.view.session.ondevice.c.a
            r11.<init>(r7, r8, r9, r10)
            r6.mo55395g(r11)
            goto L_0x038c
        L_0x03f8:
            com.google.bg.b.v r0 = r0.f147066d
            if (r0 != 0) goto L_0x03fe
            com.google.bg.b.v r0 = com.google.p4172bg.p4174b.C55733v.f147070l
        L_0x03fe:
            java.lang.String r4 = r0.f147073b
            java.lang.String r4 = r0.f147075d
            com.google.protobuf.cq r4 = r0.f147077f
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x041e
            com.google.protobuf.cq r4 = r0.f147077f
            r7 = 0
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            com.google.protobuf.cg r4 = r0.f147078g
            r4.mo58859d(r7)
            com.google.protobuf.cg r4 = r0.f147079h
            r4.mo58859d(r7)
            goto L_0x041f
        L_0x041e:
            r7 = 0
        L_0x041f:
            com.google.protobuf.cq r4 = r0.f147080i
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0439
            com.google.protobuf.cq r4 = r0.f147080i
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            com.google.protobuf.cg r4 = r0.f147081j
            r4.mo58859d(r7)
            com.google.protobuf.cg r0 = r0.f147082k
            r0.mo58859d(r7)
        L_0x0439:
            com.google.common.b.gu r6 = r6.mo55394f()
            goto L_0x0442
        L_0x043e:
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0442:
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r6)
            com.google.android.libraries.lens.view.session.ondevice.k r4 = com.google.android.libraries.lens.view.session.ondevice.C27973k.f76134a
            j$.util.stream.Stream r0 = r0.map(r4)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r4)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2.mo54356a(r0)
            com.google.protobuf.bv r0 = r2.build()
            r7 = r0
            com.google.bp.f.b.a.aa r7 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa) r7
            com.google.android.libraries.lens.e.ad r0 = r5.f76229a
            com.google.android.libraries.lens.e.ae r0 = r0.mo29679b()
            com.google.bp.f.b.a.cg r0 = r0.mo29686c()
            boolean r2 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52182l(r3)
            if (r2 != 0) goto L_0x047e
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "No lines in TextImage"
            r3 = 49999(0xc34f, float:7.0064E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x047c:
            r9 = 0
            goto L_0x04ae
        L_0x047e:
            com.google.bp.f.b.a.df r2 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            boolean r0 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r0, r2)
            if (r0 == 0) goto L_0x047c
            com.google.android.libraries.lens.view.session.ondevice.ak r0 = r1.f76241d
            com.google.common.base.ax r0 = r0.f76056o
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x047c
            com.google.android.libraries.lens.view.session.ondevice.ak r0 = r1.f76241d
            com.google.common.base.ax r0 = r0.f76054m
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x047c
            com.google.android.libraries.lens.view.session.ondevice.ak r0 = r1.f76241d
            com.google.common.base.ax r2 = r0.f76056o
            com.google.common.base.ax r3 = r0.f76054m
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x04a8
            r9 = 1
            goto L_0x04ae
        L_0x04a8:
            com.google.common.base.ax r0 = r0.f76056o
            r0.mo56107c()
            goto L_0x047c
        L_0x04ae:
            com.google.lens.g.dj r0 = r16.mo33389g()
            if (r0 == 0) goto L_0x05d5
            com.google.lens.g.dj r0 = r16.mo33389g()
            r0.getClass()
            com.google.lens.g.ag r2 = r16.mo33385d()
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90833j(r2)
            com.google.android.libraries.lens.view.session.ondevice.x r3 = r1.f76247j
            if (r3 == r5) goto L_0x04c8
            return
        L_0x04c8:
            com.google.android.libraries.lens.view.session.ondevice.c.n r3 = r1.f76245h
            com.google.android.libraries.lens.view.session.ondevice.ak r4 = r1.f76241d
            com.google.common.base.ax r4 = r4.f76056o
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.libraries.lens.view.session.ondevice.ak r8 = r1.f76241d
            com.google.common.base.ax r8 = r8.f76054m
            java.lang.Object r8 = r8.mo56107c()
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r6)
            com.google.android.libraries.lens.view.session.ondevice.c.c r9 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27929c.f76083a
            j$.util.stream.Stream r8 = r8.filter(r9)
            com.google.android.libraries.lens.view.session.ondevice.c.e r9 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27931e.f76085a
            com.google.android.libraries.lens.view.session.ondevice.c.f r10 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27932f.f76086a
            com.google.android.libraries.lens.view.session.ondevice.c.g r11 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27933g.f76087a
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.m89403c(r9, r10, r11)
            java.lang.Object r8 = r8.collect(r9)
            r14 = r8
            com.google.common.b.hd r14 = (com.google.common.p4522b.C58495hd) r14
            com.google.lens.g.ag r8 = com.google.lens.p4701g.C62257ag.f168084d
            java.lang.Object r2 = r2.mo56109e(r8)
            com.google.lens.g.ag r2 = (com.google.lens.p4701g.C62257ag) r2
            com.google.protobuf.cq r2 = r2.f168087b
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.libraries.lens.view.session.ondevice.c.h r8 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27934h.f76088a
            j$.util.stream.Stream r2 = r2.filter(r8)
            com.google.android.libraries.lens.view.session.ondevice.c.i r8 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27935i.f76089a
            com.google.android.libraries.lens.view.session.ondevice.c.j r9 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27936j.f76090a
            com.google.android.libraries.lens.view.session.ondevice.c.k r10 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27937k.f76091a
            j$.util.stream.Collector r8 = com.google.common.p4522b.C58370cn.m89403c(r8, r9, r10)
            java.lang.Object r2 = r2.collect(r8)
            com.google.common.b.hd r2 = (com.google.common.p4522b.C58495hd) r2
            com.google.common.b.gp r13 = new com.google.common.b.gp
            r8 = 4
            r13.<init>(r8)
            com.google.protobuf.cq r0 = r0.f168299a
            java.util.Iterator r0 = r0.iterator()
        L_0x052a:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0594
            java.lang.Object r8 = r0.next()
            com.google.lens.g.df r8 = (com.google.lens.p4701g.C62337df) r8
            java.lang.String r9 = r8.f168292b
            boolean r9 = r14.containsKey(r9)
            if (r9 == 0) goto L_0x0574
            java.lang.String r9 = r8.f168292b
            java.lang.Object r10 = r14.get(r9)
            com.google.android.libraries.lens.view.session.ondevice.c.p r10 = (com.google.android.libraries.lens.view.session.ondevice.p2168c.C27942p) r10
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89845m()
            java.lang.Object r9 = r2.getOrDefault(r9, r11)
            r17 = r9
            com.google.common.b.gu r17 = (com.google.common.p4522b.C58485gu) r17
            java.lang.String r9 = r10.mo33402d()
            java.lang.String r11 = r8.f168293c
            com.google.common.b.gu r18 = r10.mo33400b()
            r8 = r3
            r10 = r11
            r11 = r4
            r12 = r15
            r19 = r0
            r0 = r13
            r13 = r18
            r18 = r14
            r14 = r17
            com.google.lens.e.d r8 = r8.mo33412a(r9, r10, r11, r12, r13, r14)
            r0.mo55395g(r8)
            r13 = r0
            r14 = r18
            goto L_0x0591
        L_0x0574:
            r19 = r0
            r0 = r13
            r18 = r14
            com.google.common.f.a.d r9 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27940n.f76094a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9
            r10 = 50118(0xc3c6, float:7.023E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r10)
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9
            java.lang.String r10 = "Could not find ocr paragraphs for translation with id='%s'"
            java.lang.String r8 = r8.f168292b
            r9.mo56389s(r10, r8)
        L_0x0591:
            r0 = r19
            goto L_0x052a
        L_0x0594:
            r0 = r13
            com.google.common.b.gu r0 = r0.mo55394f()
            com.google.common.base.ax r2 = r1.f76244g
            com.google.android.libraries.lens.view.session.ondevice.p2168c.C27940n.m52003d(r2, r6, r0)
            com.google.android.libraries.lens.view.an.a.h r2 = r1.f76243f
            com.google.android.libraries.lens.e.ad r3 = r5.f76229a
            com.google.android.libraries.lens.e.ae r3 = r3.mo29679b()
            com.google.bp.f.b.a.cg r3 = r3.mo29686c()
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            com.google.common.o.amc r2 = r2.mo30409c(r3, r4, r6)
            com.google.common.base.ax r3 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52181b(r16)
            com.google.android.libraries.lens.view.session.ondevice.ak r1 = r1.f76241d
            com.google.common.base.ax r4 = r1.f76055n
            com.google.common.base.ax r1 = r1.f76057p
            com.google.common.base.ax r1 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52180a(r4, r1)
            com.google.android.libraries.lens.e.t r0 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52183o(r7, r2, r0, r3, r1)
            boolean r1 = r16.mo33396m()
            r0.mo29729i(r1)
            com.google.android.libraries.lens.e.u r0 = r0.mo29721a()
            r5.mo33464a(r0)
            return
        L_0x05d5:
            if (r9 != 0) goto L_0x065d
            boolean r0 = r1.f76246i
            if (r0 == 0) goto L_0x05dd
            goto L_0x065d
        L_0x05dd:
            com.google.android.libraries.lens.e.ad r0 = r5.f76229a
            com.google.android.libraries.lens.e.ae r0 = r0.mo29679b()
            com.google.bp.f.b.a.cg r0 = r0.mo29686c()
            com.google.bp.f.b.a.df r2 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            boolean r0 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r0, r2)
            if (r0 == 0) goto L_0x0620
            com.google.android.libraries.lens.view.session.ondevice.ak r0 = r1.f76241d
            boolean r0 = r0.mo33377f()
            if (r0 != 0) goto L_0x0620
            com.google.android.libraries.lens.view.session.ondevice.ak r0 = r1.f76241d
            boolean r0 = r0.mo33379h()
            if (r0 != 0) goto L_0x0620
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0620
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Translation failure: detected text but can't translate."
            r3 = 49981(0xc33d, float:7.0038E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "GENERIC_TRANSLATION_ERROR_STATE"
            r0.<init>(r2)
            r2 = r16
            r1.mo33469g(r5, r2, r0)
            return
        L_0x0620:
            r2 = r16
            com.google.android.libraries.lens.view.an.a.h r0 = r1.f76243f
            com.google.android.libraries.lens.e.ad r3 = r5.f76229a
            com.google.android.libraries.lens.e.ae r3 = r3.mo29679b()
            com.google.bp.f.b.a.cg r3 = r3.mo29686c()
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            com.google.common.o.amc r0 = r0.mo30409c(r3, r4, r6)
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.ax r4 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52181b(r2)
            com.google.android.libraries.lens.view.session.ondevice.ak r1 = r1.f76241d
            com.google.common.base.ax r6 = r1.f76055n
            com.google.common.base.ax r1 = r1.f76057p
            com.google.common.base.ax r1 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52180a(r6, r1)
            com.google.android.libraries.lens.e.t r0 = com.google.android.libraries.lens.view.session.ondevice.C28017z.m52183o(r7, r0, r3, r4, r1)
            boolean r1 = r2.mo33396m()
            r0.mo29729i(r1)
            com.google.android.libraries.lens.e.u r0 = r0.mo29721a()
            r5.mo33464a(r0)
            return
        L_0x065d:
            r2 = r16
            com.google.bp.f.b.a.ay r0 = r5.f76230b
            r0.getClass()
            com.google.android.libraries.lens.view.session.ondevice.d.b r8 = new com.google.android.libraries.lens.view.session.ondevice.d.b
            r8.<init>(r0, r6)
            com.google.android.libraries.lens.view.session.ondevice.ak r0 = r1.f76241d
            boolean r0 = r0.mo33377f()
            java.lang.String r3 = "MISSING_SOURCE_OR_TARGET_LANGUAGE"
            if (r0 != 0) goto L_0x068f
            boolean r0 = r1.f76246i
            if (r0 == 0) goto L_0x0678
            goto L_0x068f
        L_0x0678:
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r4 = "Translation failure: source and/or target language not available"
            r6 = 49997(0xc34d, float:7.0061E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r6)).mo56386p(r4)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            r1.mo33469g(r5, r2, r0)
            return
        L_0x068f:
            com.google.android.libraries.lens.view.session.ondevice.ak r0 = r1.f76241d
            boolean r4 = r0.f76050i
            if (r4 == 0) goto L_0x06b6
            com.google.android.libraries.lens.view.af.ao r4 = r0.f76051j
            if (r4 == 0) goto L_0x06b6
            com.google.android.libraries.lens.view.session.ondevice.d.u r6 = r0.f76043b
            boolean r6 = r6.mo33428f()
            com.google.common.base.cr r4 = r4.f68264p
            java.lang.Object r4 = r4.mo6453a()
            com.google.android.libraries.au.d r4 = (com.google.android.libraries.p1635au.C19567d) r4
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r10 = 0
            r9[r10] = r6
            r10 = 1
            r4.mo24822a(r10, r9)
        L_0x06b6:
            boolean r4 = r0.f76049h
            if (r4 != 0) goto L_0x06d4
            com.google.common.base.ax r4 = r0.f76056o
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x06ca
            com.google.common.base.ax r4 = r0.f76054m
            boolean r4 = r4.mo56113h()
            if (r4 != 0) goto L_0x06d4
        L_0x06ca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x06fb
        L_0x06d4:
            com.google.android.libraries.lens.view.session.ondevice.d.u r3 = r0.f76043b
            com.google.common.base.ax r4 = r0.f76056o
            java.lang.String r6 = ""
            java.lang.Object r4 = r4.mo56109e(r6)
            java.lang.String r4 = (java.lang.String) r4
            com.google.common.base.ax r9 = r0.f76054m
            java.lang.Object r6 = r9.mo56109e(r6)
            java.lang.String r6 = (java.lang.String) r6
            com.google.common.util.concurrent.cx r3 = r3.mo33423a(r4, r6, r8)
            com.google.android.libraries.lens.view.session.ondevice.aj r4 = new com.google.android.libraries.lens.view.session.ondevice.aj
            r4.<init>(r0, r8)
            java.util.concurrent.Executor r0 = r0.f76046e
            com.google.common.base.ah r4 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r3, r4, r0)
        L_0x06fb:
            com.google.android.libraries.lens.view.session.ondevice.p r9 = new com.google.android.libraries.lens.view.session.ondevice.p
            r3 = r9
            r4 = r1
            r6 = r8
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r1 = r1.f76239b
            com.google.common.util.concurrent.bz r2 = com.google.apps.tiktok.tracing.C47810es.m84974n(r9)
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r2, r1)
            return
        L_0x070e:
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 49986(0xc342, float:7.0045E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r1 = "Ignoring obsolete engine result (%d)"
            long r2 = r2.f149807d
            r0.mo56388r(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.session.ondevice.C28011t.run():void");
    }
}

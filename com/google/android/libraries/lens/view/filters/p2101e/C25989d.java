package com.google.android.libraries.lens.view.filters.p2101e;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import com.google.android.libraries.lens.view.main.C27361cx;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.filters.e.d */
/* compiled from: PG */
public final class C25989d implements C27654a {

    /* renamed from: a */
    public final C25994i f70642a;

    /* renamed from: b */
    public C56280cg f70643b = C28130s.m52411b(C56306df.AUTO_FILTER);

    /* renamed from: c */
    public C27361cx f70644c;

    /* renamed from: d */
    private final Map f70645d;

    public C25989d(C25994i iVar, Map map) {
        this.f70642a = iVar;
        this.f70645d = map;
    }

    /* renamed from: a */
    public final C25981e mo31203a() {
        C25994i iVar = this.f70642a;
        return iVar.mo31209b(iVar.mo31208a(iVar.f70649b));
    }

    /* renamed from: b */
    public final C58833ax mo31204b(C56306df dfVar) {
        if (!mo31207f(dfVar)) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k((C56278ce) this.f70643b.f149994a.get(0));
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        for (C56306df dfVar : C56306df.values()) {
            if (mo31207f(dfVar)) {
                eVar.mo33150g("Filter");
                eVar.mo33148e("type", dfVar.name());
            }
        }
    }

    /* renamed from: d */
    public final void mo31205d(C25980d dVar) {
        this.f70642a.f70649b = dVar;
        mo31206e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0208, code lost:
        if (r3.f74777W.mo31207f(com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.EDUCATION) == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x020b, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x021b, code lost:
        if (r3.f74777W.mo31203a().mo31194k() != false) goto L_0x020b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31206e() {
        /*
            r16 = this;
            r0 = r16
            com.google.android.libraries.lens.view.filters.e.i r1 = r0.f70642a
            com.google.android.libraries.lens.view.filters.e.a.d r1 = r1.f70649b
            java.util.Map r2 = r0.f70645d
            java.lang.Object r2 = r2.get(r1)
            g.a.a r2 = (p5460g.p5461a.C69464a) r2
            java.lang.String r3 = "No module installed that provides FilterSettings of type %s"
            com.google.common.base.C58838bb.m90867b(r2, r3, r1)
            java.lang.Object r1 = r2.mo17428b()
            com.google.android.libraries.lens.view.filters.e.a.i r1 = (com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25985i) r1
            com.google.bp.f.b.a.ce r1 = r1.mo31042a()
            com.google.bp.f.b.a.cg r2 = com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg.f149992b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bp.f.b.a.cf r2 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56279cf) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.bp.f.b.a.cg r3 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg) r3
            r1.getClass()
            r3.mo54347a()
            com.google.protobuf.cq r3 = r3.f149994a
            r3.add(r1)
            com.google.protobuf.bv r1 = r2.build()
            com.google.bp.f.b.a.cg r1 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg) r1
            com.google.bp.f.b.a.cg r2 = r0.f70643b
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x03fd
            r0.f70643b = r1
            com.google.android.libraries.lens.view.main.cx r2 = r0.f70644c
            if (r2 == 0) goto L_0x03fd
            com.google.android.libraries.lens.view.main.dt r2 = r2.f74853a
            com.google.android.libraries.lens.view.main.bq r3 = r2.f74881C
            boolean r4 = r3.f74765K
            if (r4 != 0) goto L_0x0063
            com.google.common.f.e r3 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Ignoring change to filter selection while inactive"
            r6 = 49736(0xc248, float:6.9695E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r4)
            goto L_0x0363
        L_0x0063:
            com.google.android.libraries.lens.view.main.ae r4 = r3.f74816u
            r4.mo32840q()
            com.google.android.libraries.lens.view.main.ae r4 = r3.f74816u
            com.google.android.libraries.lens.view.d.g r4 = r4.f74675h
            java.lang.Object r4 = r4.mo3842a()
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4
            boolean r6 = r4.mo56113h()
            r7 = 2
            r8 = 0
            if (r6 == 0) goto L_0x01ca
            com.google.android.libraries.lens.view.at.ac r6 = r3.f74770P
            boolean r6 = r6.mo30525b()
            if (r6 != 0) goto L_0x0084
            goto L_0x01ca
        L_0x0084:
            boolean r6 = r3.f74759E
            if (r6 == 0) goto L_0x00d9
            com.google.android.libraries.lens.view.filters.e.d r6 = r3.f74777W
            com.google.android.libraries.lens.view.filters.e.a.e r6 = r6.mo31203a()
            boolean r6 = r6.mo31194k()
            if (r6 == 0) goto L_0x00d9
            com.google.android.libraries.lens.view.gleam.cj r6 = r3.f74767M
            com.google.common.base.ax r6 = r6.mo31769e()
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x00d9
            com.google.android.libraries.lens.view.gleam.cj r4 = r3.f74767M
            com.google.android.libraries.lens.view.gleam.dd r4 = (com.google.android.libraries.lens.view.gleam.C26526dd) r4
            com.google.android.libraries.lens.view.gleam.region.f r4 = r4.f72302l
            r4.getClass()
            com.google.android.libraries.lens.view.gleam.region.k r4 = (com.google.android.libraries.lens.view.gleam.region.C26620k) r4
            com.google.android.libraries.lens.view.gleam.region.RegionView r4 = r4.f72593f
            com.google.android.libraries.lens.view.gleam.region.e r4 = r4.f72553l
            boolean r4 = r4.mo31897c()
            if (r4 == 0) goto L_0x00b9
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            goto L_0x01cc
        L_0x00b9:
            com.google.android.libraries.lens.view.gleam.cj r4 = r3.f74767M
            com.google.common.base.ax r4 = r4.mo31769e()
            java.lang.Object r4 = r4.mo56107c()
            android.graphics.RectF r4 = (android.graphics.RectF) r4
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            com.google.android.libraries.lens.e.w r9 = com.google.android.libraries.lens.p2014e.C24231w.FILTER_SWITCH_SELECTION_RETENTION
            com.google.android.libraries.lens.view.at.ac r10 = r3.f74770P
            boolean r10 = r10.mo30525b()
            com.google.android.libraries.lens.view.session.bj r4 = com.google.android.libraries.lens.view.session.C27778bn.m51731c(r4, r6, r9, r10)
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x01cc
        L_0x00d9:
            boolean r6 = r3.f74760F
            if (r6 == 0) goto L_0x01c7
            com.google.android.libraries.lens.view.filters.e.d r6 = r3.f74777W
            com.google.android.libraries.lens.view.filters.e.a.e r6 = r6.mo31203a()
            boolean r6 = r6.mo31197n()
            if (r6 == 0) goto L_0x01c7
            com.google.android.libraries.lens.view.textoverlay.e r6 = r3.f74768N
            com.google.common.base.ax r6 = r6.mo33533b()
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x01c7
            boolean r6 = r3.mo32871D()
            if (r6 != 0) goto L_0x01c4
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.libraries.lens.view.session.bm r4 = (com.google.android.libraries.lens.view.session.C27777bm) r4
            com.google.android.libraries.lens.e.w r4 = r4.mo33256c()
            com.google.android.libraries.lens.e.w r6 = com.google.android.libraries.lens.p2014e.C24231w.TRANSLATED_TEXT
            if (r4 != r6) goto L_0x010b
            goto L_0x01c4
        L_0x010b:
            com.google.android.libraries.lens.view.textoverlay.e r4 = r3.f74768N
            com.google.common.base.ax r4 = r4.mo33533b()
            java.lang.Object r4 = r4.mo56107c()
            com.google.bp.f.b.a.aw r4 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw) r4
            com.google.android.libraries.lens.view.at.ac r6 = r3.f74770P
            boolean r6 = r6.mo30525b()
            com.google.android.libraries.lens.e.w r9 = com.google.android.libraries.lens.p2014e.C24231w.FILTER_SWITCH_SELECTION_RETENTION
            com.google.common.b.gp r10 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.bp.f.b.a.ag r11 = com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag.f149762e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.bp.f.b.a.af r11 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56225af) r11
            com.google.protobuf.cq r12 = r4.f149801a
            java.util.Iterator r12 = r12.iterator()
        L_0x0131:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0172
            java.lang.Object r13 = r12.next()
            com.google.bp.f.b.a.ap r13 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap) r13
            com.google.protobuf.cq r13 = r13.f149783b
            java.util.Iterator r13 = r13.iterator()
        L_0x0143:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0131
            java.lang.Object r14 = r13.next()
            com.google.bp.f.b.a.an r14 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56233an) r14
            com.google.protobuf.cq r14 = r14.f149778b
            java.util.Iterator r14 = r14.iterator()
        L_0x0155:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0143
            java.lang.Object r15 = r14.next()
            com.google.bp.f.b.a.av r15 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56241av) r15
            com.google.android.libraries.lens.e.a.p r5 = com.google.android.libraries.lens.view.utils.C28109ak.m52387a(r8, r15)
            r10.mo55395g(r5)
            com.google.bp.f.b.a.ae r5 = r15.f149797e
            if (r5 != 0) goto L_0x016e
            com.google.bp.f.b.a.ae r5 = com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae.f149753h
        L_0x016e:
            r11.mo54335a(r5)
            goto L_0x0155
        L_0x0172:
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
            java.lang.String r4 = com.google.android.libraries.lens.common.text.C24141q.m44839a(r4, r5)
            r11.copyOnWrite()
            com.google.protobuf.bv r5 = r11.instance
            com.google.bp.f.b.a.ag r5 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag) r5
            r4.getClass()
            int r12 = r5.f149764a
            r12 = r12 | r7
            r5.f149764a = r12
            r5.f149767d = r4
            r11.copyOnWrite()
            com.google.protobuf.bv r5 = r11.instance
            com.google.bp.f.b.a.ag r5 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag) r5
            r4.getClass()
            int r12 = r5.f149764a
            r13 = 1
            r12 = r12 | r13
            r5.f149764a = r12
            r5.f149766c = r4
            com.google.android.libraries.lens.view.session.bk r4 = com.google.android.libraries.lens.view.session.C27776bl.m51710g()
            com.google.common.b.gu r5 = r10.mo55394f()
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89842j(r5)
            r10 = r4
            com.google.android.libraries.lens.view.session.i r10 = (com.google.android.libraries.lens.view.session.C27789i) r10
            r10.f75817a = r5
            com.google.protobuf.bv r5 = r11.build()
            com.google.bp.f.b.a.ag r5 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag) r5
            r4.mo33283b(r5)
            r4.mo33285d(r6)
            r4.mo33284c(r9)
            com.google.android.libraries.lens.view.session.bl r4 = r4.mo33282a()
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x01cc
        L_0x01c4:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            goto L_0x01cc
        L_0x01c7:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            goto L_0x01cc
        L_0x01ca:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
        L_0x01cc:
            boolean r5 = r4.mo56113h()
            if (r5 != 0) goto L_0x01ee
            com.google.android.libraries.lens.view.at.ae r5 = r3.f74785ae
            com.google.android.libraries.lens.view.at.ad r6 = com.google.android.libraries.lens.view.p2078at.C25498ad.NONE
            r5.mo30528a(r6)
            com.google.android.libraries.lens.view.textoverlay.e r5 = r3.f74768N
            r5.mo33534c()
            r3.mo32890v()
            boolean r5 = r3.f74759E
            if (r5 != 0) goto L_0x01e9
            boolean r5 = r3.f74760F
            if (r5 == 0) goto L_0x01ee
        L_0x01e9:
            com.google.android.libraries.lens.view.bb.e r5 = r3.f74786af
            r5.mo30809k()
        L_0x01ee:
            com.google.android.libraries.lens.view.at.ac r5 = r3.f74770P
            boolean r5 = r5.mo30525b()
            if (r5 == 0) goto L_0x021e
            com.google.android.libraries.lens.view.flags.b r5 = r3.f74804i
            com.google.android.libraries.lens.view.flags.a r6 = com.google.android.libraries.lens.view.flags.C26239a.ENABLE_MATH_GLEAMS_IN_EDUCATION_FILTER
            boolean r5 = r5.mo31462g(r6)
            if (r5 == 0) goto L_0x020d
            com.google.bp.f.b.a.df r5 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.EDUCATION
            com.google.android.libraries.lens.view.filters.e.d r6 = r3.f74777W
            boolean r5 = r6.mo31207f(r5)
            if (r5 != 0) goto L_0x020b
            goto L_0x020d
        L_0x020b:
            r5 = 1
            goto L_0x021f
        L_0x020d:
            boolean r5 = r3.f74762H
            if (r5 == 0) goto L_0x021e
            com.google.android.libraries.lens.view.filters.e.d r5 = r3.f74777W
            com.google.android.libraries.lens.view.filters.e.a.e r5 = r5.mo31203a()
            boolean r5 = r5.mo31194k()
            if (r5 == 0) goto L_0x021e
            goto L_0x020b
        L_0x021e:
            r5 = 0
        L_0x021f:
            if (r5 != 0) goto L_0x0226
            com.google.android.libraries.lens.view.gleam.cj r6 = r3.f74767M
            r6.mo31771g()
        L_0x0226:
            r3.mo32894z()
            com.google.android.libraries.lens.view.h.f.c r6 = r3.f74775U
            r6.mo32187b(r1)
            r3.mo32878i()
            com.google.android.libraries.lens.view.at.ac r6 = r3.f74770P
            boolean r6 = r6.mo30525b()
            if (r6 == 0) goto L_0x031d
            com.google.lens.j.ds r6 = com.google.lens.p4707j.C62496ds.f168723e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.lens.j.dq r6 = (com.google.lens.p4707j.C62494dq) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.lens.j.ds r9 = (com.google.lens.p4707j.C62496ds) r9
            r10 = 3
            r9.f168726b = r10
            int r10 = r9.f168725a
            r11 = 1
            r10 = r10 | r11
            r9.f168725a = r10
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.lens.j.ds r9 = (com.google.lens.p4707j.C62496ds) r9
            int r10 = r9.f168725a
            r7 = r7 | r10
            r9.f168725a = r7
            r9.f168727c = r11
            com.google.protobuf.bv r6 = r6.build()
            com.google.lens.j.ds r6 = (com.google.lens.p4707j.C62496ds) r6
            boolean r7 = r3.f74765K
            if (r7 == 0) goto L_0x0363
            com.google.android.libraries.lens.view.at.ac r7 = r3.f74770P
            boolean r7 = r7.mo30525b()
            com.google.common.base.C58838bb.m90883r(r7)
            if (r5 == 0) goto L_0x02cd
            com.google.android.libraries.lens.view.main.ae r5 = r3.f74816u
            com.google.android.libraries.lens.view.ay.y r7 = r3.f74808m
            com.google.common.base.ax r9 = r7.f69788d
            boolean r9 = r9.mo56113h()
            if (r9 != 0) goto L_0x0283
            com.google.bp.f.b.a.aa r7 = com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa.f149748b
            goto L_0x02c8
        L_0x0283:
            com.google.common.base.ax r9 = r7.f69788d
            java.lang.Object r9 = r9.mo56107c()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            com.google.bp.f.b.a.aa r11 = com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa.f149748b
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.bp.f.b.a.z r11 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56328z) r11
            com.google.common.b.gu r12 = r7.mo30772f()
            j$.util.stream.Stream r12 = p3186j$.util.Collection.EL.stream(r12)
            com.google.android.libraries.lens.view.ay.t r13 = new com.google.android.libraries.lens.view.ay.t
            r13.<init>(r7)
            j$.util.stream.Stream r7 = r12.filter(r13)
            com.google.android.libraries.lens.view.ay.u r12 = new com.google.android.libraries.lens.view.ay.u
            r12.<init>(r9)
            j$.util.stream.Stream r7 = r7.filter(r12)
            com.google.android.libraries.lens.view.ay.v r9 = com.google.android.libraries.lens.view.p2087ay.C25661v.f69781a
            j$.util.stream.Stream r7 = r7.map(r9)
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r7 = r7.collect(r9)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r11.mo54356a(r7)
            com.google.protobuf.bv r7 = r11.build()
            com.google.bp.f.b.a.aa r7 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa) r7
        L_0x02c8:
            boolean r5 = r5.mo32847x(r6, r7)
            goto L_0x02d5
        L_0x02cd:
            com.google.android.libraries.lens.view.main.ae r5 = r3.f74816u
            com.google.bp.f.b.a.aa r7 = com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa.f149748b
            boolean r5 = r5.mo32847x(r6, r7)
        L_0x02d5:
            if (r5 != 0) goto L_0x02e7
            com.google.common.f.e r3 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "filter changed in frozen image mode without prefetch"
            r5 = 49748(0xc254, float:6.9712E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0363
        L_0x02e7:
            com.google.android.libraries.lens.view.main.bl r5 = r3.f74787ag
            r5.getClass()
            r5.mo32861k(r8)
            com.google.android.libraries.lens.view.main.ae r5 = r3.f74816u
            boolean r6 = r4.mo56113h()
            if (r6 == 0) goto L_0x02fe
            java.lang.Object r3 = r4.mo56107c()
            com.google.android.libraries.lens.view.session.bm r3 = (com.google.android.libraries.lens.view.session.C27777bm) r3
            goto L_0x0317
        L_0x02fe:
            boolean r4 = r3.f74806k
            if (r4 == 0) goto L_0x0310
            boolean r4 = r3.mo32870C()
            if (r4 == 0) goto L_0x0310
            com.google.android.libraries.lens.e.w r4 = com.google.android.libraries.lens.p2014e.C24231w.FILTER_SWITCH
            r6 = 1
            com.google.android.libraries.lens.view.session.bj r3 = r3.mo32875f(r4, r6)
            goto L_0x0317
        L_0x0310:
            r6 = 1
            com.google.android.libraries.lens.e.w r3 = com.google.android.libraries.lens.p2014e.C24231w.FILTER_SWITCH
            com.google.android.libraries.lens.view.session.bm r3 = com.google.android.libraries.lens.view.session.C27768bd.m51651a(r6, r3)
        L_0x0317:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            r5.mo32843t(r3, r4)
            goto L_0x0363
        L_0x031d:
            com.google.android.libraries.lens.view.at.ac r4 = r3.f74770P
            boolean r4 = r4.mo30526c()
            if (r4 == 0) goto L_0x0363
            boolean r4 = r3.f74758D
            if (r4 == 0) goto L_0x0363
            com.google.android.libraries.lens.view.main.ae r4 = r3.f74816u
            com.google.lens.j.ds r5 = com.google.lens.p4707j.C62496ds.f168723e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.lens.j.dq r5 = (com.google.lens.p4707j.C62494dq) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.lens.j.ds r6 = (com.google.lens.p4707j.C62496ds) r6
            r6.f168726b = r7
            int r9 = r6.f168725a
            r10 = 1
            r9 = r9 | r10
            r6.f168725a = r9
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.lens.j.ds r6 = (com.google.lens.p4707j.C62496ds) r6
            int r9 = r6.f168725a
            r7 = r7 | r9
            r6.f168725a = r7
            r6.f168727c = r8
            com.google.protobuf.bv r5 = r5.build()
            com.google.lens.j.ds r5 = (com.google.lens.p4707j.C62496ds) r5
            com.google.android.libraries.p1623at.p1632e.C19559g.m37304c()
            r4.f74681n = r5
            com.google.android.libraries.lens.view.h.d.q r3 = r3.f74766L
            r3.getClass()
            r3.mo32116g()
        L_0x0363:
            boolean r3 = r2.f74945ao
            if (r3 == 0) goto L_0x0379
            com.google.android.libraries.lens.view.ak.bd r3 = r2.f75003w
            com.google.android.libraries.lens.view.filters.e.d r4 = r2.f74892N
            com.google.android.libraries.lens.view.filters.e.i r4 = r4.f70642a
            com.google.android.libraries.lens.view.filters.e.a.d r4 = r4.f70649b
            com.google.android.libraries.lens.view.ak.bt r3 = r3.f68662a
            com.google.android.libraries.lens.view.ak.at r5 = new com.google.android.libraries.lens.view.ak.at
            r5.<init>(r4)
            r3.mo30363c(r5)
        L_0x0379:
            com.google.protobuf.cq r1 = r1.f149994a
            com.google.bp.f.b.a.ce r3 = com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce.f149986e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bp.f.b.a.bl r3 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56258bl) r3
            com.google.bp.f.b.a.df r4 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.EDUCATION
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.bp.f.b.a.ce r5 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce) r5
            int r4 = r4.f150068m
            r5.f149991d = r4
            int r4 = r5.f149988a
            r6 = 1
            r4 = r4 | r6
            r5.f149988a = r4
            com.google.protobuf.bv r3 = r3.build()
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x03ad
            dagger.a r1 = r2.f74895Q
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.libraries.lens.view.ag.d r1 = (com.google.android.libraries.lens.view.p2057ag.C25102d) r1
            com.google.android.libraries.lens.view.ag.c r3 = com.google.android.libraries.lens.view.p2057ag.C25101c.LENS_START
            r1.mo30258b(r3)
        L_0x03ad:
            com.google.android.libraries.lens.view.flags.b r1 = r2.f74995o
            com.google.android.libraries.lens.view.flags.a r3 = com.google.android.libraries.lens.view.flags.C26239a.SELECTION_STATE_ENABLED
            boolean r1 = r1.mo31462g(r3)
            if (r1 == 0) goto L_0x03bc
            com.google.android.libraries.lens.view.infopanel.a.p r1 = r2.f75005y
            r1.mo32442i()
        L_0x03bc:
            boolean r1 = r2.f74943am
            if (r1 == 0) goto L_0x03dd
            com.google.android.libraries.lens.view.at.ac r1 = r2.f74957ba
            boolean r1 = r1.mo30525b()
            if (r1 != 0) goto L_0x03d0
            com.google.android.libraries.lens.view.ris.e r1 = r2.mo32959y()
            java.lang.String r3 = ""
            r1.f75581a = r3
        L_0x03d0:
            com.google.android.libraries.lens.view.ris.e r1 = r2.mo32959y()
            com.google.android.libraries.lens.view.at.ac r3 = r2.f74957ba
            boolean r3 = r3.mo30525b()
            r1.mo33170b(r3)
        L_0x03dd:
            com.google.android.libraries.lens.view.filters.e.d r1 = r2.f74892N
            com.google.android.libraries.lens.view.filters.e.i r1 = r1.f70642a
            com.google.android.libraries.lens.view.filters.e.a.d r1 = r1.f70649b
            com.google.android.libraries.lens.view.filters.e.a.d r3 = com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d.TRANSLATE
            if (r1 != r3) goto L_0x03ec
            com.google.android.libraries.lens.view.bb.e r1 = r2.f74901W
            r1.mo30809k()
        L_0x03ec:
            g.a.a r1 = r2.f74940aj
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.lens.view.c.a r1 = (com.google.android.libraries.lens.view.p2092c.C25699a) r1
            com.google.android.libraries.lens.view.filters.e.d r2 = r2.f74892N
            com.google.android.libraries.lens.view.filters.e.i r2 = r2.f70642a
            com.google.android.libraries.lens.view.filters.e.a.d r2 = r2.f70649b
            r1.mo30829b(r2)
        L_0x03fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.filters.p2101e.C25989d.mo31206e():void");
    }

    /* renamed from: f */
    public final boolean mo31207f(C56306df dfVar) {
        C56306df a = C56306df.m87964a(((C56278ce) this.f70643b.f149994a.get(0)).f149991d);
        if (a == null) {
            a = C56306df.UNKNOWN_FILTER_TYPE;
        }
        return a.equals(dfVar);
    }
}

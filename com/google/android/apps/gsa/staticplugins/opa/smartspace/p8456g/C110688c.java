package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g;

import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.g.c */
/* compiled from: PG */
public final class C110688c {

    /* renamed from: c */
    private static final C59071e f308426c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.g.c");

    /* renamed from: a */
    public final C110692g f308427a;

    /* renamed from: b */
    public final C130895ag f308428b;

    /* renamed from: d */
    private final C83794j f308429d;

    /* renamed from: e */
    private final C22871g f308430e;

    public C110688c(C110692g gVar, C83794j jVar, C130895ag agVar, C22871g gVar2) {
        this.f308427a = gVar;
        this.f308429d = jVar;
        this.f308428b = agVar;
        this.f308430e = gVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x0803  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0823  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo98852a(com.google.android.apps.gsa.opa.smartspace.C83739ak r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            com.google.android.apps.gsa.opa.smartspace.aj r2 = r1.f228233b
            if (r2 != 0) goto L_0x000a
            com.google.android.apps.gsa.opa.smartspace.aj r2 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x000a:
            int r3 = r2.f228228a
            r4 = 4
            if (r3 != r4) goto L_0x0014
            java.lang.Object r2 = r2.f228229b
            com.google.assistant.s.a.es r2 = (com.google.assistant.p3994s.p3995a.C53190es) r2
            goto L_0x0016
        L_0x0014:
            com.google.assistant.s.a.es r2 = com.google.assistant.p3994s.p3995a.C53190es.f139393s
        L_0x0016:
            java.lang.String r3 = r1.f228242k
            com.google.android.apps.gsa.opa.smartspace.aj r5 = r1.f228233b
            if (r5 != 0) goto L_0x001e
            com.google.android.apps.gsa.opa.smartspace.aj r5 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x001e:
            int r6 = r5.f228228a
            if (r6 != r4) goto L_0x0027
            java.lang.Object r5 = r5.f228229b
            com.google.assistant.s.a.es r5 = (com.google.assistant.p3994s.p3995a.C53190es) r5
            goto L_0x0029
        L_0x0027:
            com.google.assistant.s.a.es r5 = com.google.assistant.p3994s.p3995a.C53190es.f139393s
        L_0x0029:
            r9 = r5
            int r5 = r1.f228232a
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0043
            com.google.android.apps.gsa.opa.smartspace.j r5 = r0.f308429d
            boolean r5 = r5.mo77182u()
            if (r5 == 0) goto L_0x0043
            int r1 = r1.f228237f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x0045
        L_0x0043:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x0045:
            com.google.android.apps.gsa.staticplugins.opa.smartspace.g.g r7 = r0.f308427a
            com.google.common.f.a.d r5 = r7.f308444g
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            r6 = 26666(0x682a, float:3.7367E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            com.google.assistant.s.a.eh r6 = r9.f139405j
            if (r6 != 0) goto L_0x005d
            com.google.assistant.s.a.eh r6 = com.google.assistant.p3994s.p3995a.C53179eh.f139366e
        L_0x005d:
            java.lang.String r6 = r6.f139370c
            int r8 = r9.f139406k
            java.lang.String r10 = "#buildSmartspaceCardProtoForFlightUpdate(): %s %s"
            r5.mo56352E(r10, r6, r8)
            com.google.android.apps.gsa.search.core.i.t r5 = r7.f308439b
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246734q
            boolean r11 = r5.mo79746e(r6)
            j$.util.Optional r5 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184394f(r9, r11)
            boolean r6 = r5.isPresent()
            if (r6 != 0) goto L_0x008b
            com.google.common.f.a.d r1 = r7.f308444g
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r3 = "Not building the card because Smartspace can not parse the departure time."
            r4 = 26669(0x682d, float:3.7371E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r4)).mo56386p(r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x0087:
            r22 = r2
            goto L_0x0801
        L_0x008b:
            java.lang.Object r5 = r5.get()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            boolean r8 = r7.mo98856k(r5)
            if (r8 != 0) goto L_0x00ab
            com.google.common.f.a.d r1 = r7.f308444g
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r3 = "Not building the card because flight status is inactive."
            r4 = 26668(0x682c, float:3.737E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r4)).mo56386p(r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0087
        L_0x00ab:
            long r12 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d.f358768d
            long r12 = r12 + r5
            long r14 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d.f358766b
            long r14 = r5 - r14
            long r16 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d.f358767c
            r26 = r11
            long r10 = r5 - r16
            boolean r8 = r1.mo56113h()
            if (r8 == 0) goto L_0x00cd
            java.lang.Object r1 = r1.mo56107c()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r22 = r2
            r23 = r10
            goto L_0x0125
        L_0x00cd:
            com.google.assistant.s.a.ep r1 = r9.f139401f
            if (r1 != 0) goto L_0x00d3
            com.google.assistant.s.a.ep r1 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x00d3:
            java.lang.String r1 = r1.f139386b
            com.google.assistant.s.a.ep r8 = r9.f139402g
            if (r8 != 0) goto L_0x00db
            com.google.assistant.s.a.ep r8 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x00db:
            java.lang.String r8 = r8.f139386b
            com.google.assistant.s.a.eh r4 = r9.f139405j
            if (r4 != 0) goto L_0x00e3
            com.google.assistant.s.a.eh r4 = com.google.assistant.p3994s.p3995a.C53179eh.f139366e
        L_0x00e3:
            java.lang.String r4 = r4.f139370c
            r22 = r2
            int r2 = r9.f139406k
            com.google.common.f.a.d r0 = r7.f308444g
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r23 = r10
            r10 = 26662(0x6826, float:3.7361E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r10)
            r16 = r0
            com.google.common.f.a.a r16 = (com.google.common.p4526f.p4527a.C58970a) r16
            java.lang.String r17 = "Flight Status has departure airport: %s, arrival airport: %s, airline: %s, flight number: %s"
            java.lang.Integer r21 = java.lang.Integer.valueOf(r2)
            r18 = r1
            r19 = r8
            r20 = r4
            r16.mo56360M(r17, r18, r19, r20, r21)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r8)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r0.hashCode()
        L_0x0125:
            com.google.common.f.a.d r0 = r7.f308444g
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "Smartspace card id is: %s"
            r4 = 26667(0x682b, float:3.7368E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r4)).mo56387q(r2, r1)
            com.google.assistant.c.do r0 = com.google.assistant.p3886c.C50818do.f132293H
            com.google.protobuf.bn r0 = r0.createBuilder()
            r8 = r0
            com.google.assistant.c.cn r8 = (com.google.assistant.p3886c.C50790cn) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r2 = r0.f132304a
            r4 = 4
            r2 = r2 | r4
            r0.f132304a = r2
            r0.f132307d = r1
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r1 = r0.f132304a
            r2 = 1
            r1 = r1 | r2
            r0.f132304a = r1
            r1 = 0
            r0.f132305b = r1
            com.google.assistant.c.cp r0 = com.google.assistant.p3886c.C50792cp.PRIMARY
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            int r0 = r0.f132174e
            r4.f132306c = r0
            int r0 = r4.f132304a
            r10 = 2
            r0 = r0 | r10
            r4.f132304a = r0
            com.google.assistant.c.b.n r0 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.b.m r0 = (com.google.assistant.p3886c.p3888b.C50728m) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.c.b.n r4 = (com.google.assistant.p3886c.p3888b.C50729n) r4
            int r11 = r4.f132009a
            r11 = r11 | r2
            r4.f132009a = r11
            java.lang.String r11 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON"
            r4.f132010b = r11
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.c.b.n r0 = (com.google.assistant.p3886c.p3888b.C50729n) r0
            r0.getClass()
            r4.f132314k = r0
            int r0 = r4.f132304a
            r0 = r0 | 512(0x200, float:7.175E-43)
            r4.f132304a = r0
            com.google.assistant.c.cr r0 = com.google.assistant.p3886c.C50794cr.FLIGHT
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            int r0 = r0.f132222T
            r4.f132315l = r0
            int r0 = r4.f132304a
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r4.f132304a = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f308439b
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246715aw
            boolean r0 = r0.mo79746e(r4)
            if (r0 == 0) goto L_0x01bd
            com.google.assistant.c.b.p r0 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY
            goto L_0x01bf
        L_0x01bd:
            com.google.assistant.c.b.p r0 = com.google.assistant.p3886c.p3888b.C50731p.BROADCAST
        L_0x01bf:
            com.google.android.apps.gsa.search.core.i.t r4 = r7.f308439b
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246732o
            boolean r4 = r4.mo79746e(r11)
            if (r4 == 0) goto L_0x01dc
            boolean r4 = r7.mo98857l(r9)
            if (r4 == 0) goto L_0x01dc
            com.google.protobuf.cq r3 = r9.f139407l
            java.lang.Object r3 = r3.get(r1)
            com.google.assistant.s.a.en r3 = (com.google.assistant.p3994s.p3995a.C53185en) r3
            java.lang.String r3 = r3.f139381c
            r1 = 1
            goto L_0x029e
        L_0x01dc:
            com.google.android.apps.gsa.search.core.i.t r4 = r7.f308439b
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246660N
            boolean r4 = r4.mo79746e(r11)
            if (r4 == 0) goto L_0x0203
            android.content.Context r4 = r7.f308438a
            java.lang.String r11 = r9.f139410o
            boolean r16 = r11.isEmpty()
            if (r16 == 0) goto L_0x01fb
            android.content.res.Resources r4 = r4.getResources()
            r11 = 2132084046(0x7f15054e, float:1.9808251E38)
            java.lang.String r11 = r4.getString(r11)
        L_0x01fb:
            com.google.assistant.c.cr r4 = com.google.assistant.p3886c.C50794cr.FLIGHT
            android.content.Intent r4 = com.google.android.apps.gsa.smartspace.C92122r.m151192n(r11, r4, r0)
            goto L_0x0284
        L_0x0203:
            com.google.android.apps.gsa.search.core.i.t r4 = r7.f308439b
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246734q
            boolean r4 = r4.mo79746e(r11)
            com.google.assistant.s.a.ep r11 = r9.f139401f
            if (r11 != 0) goto L_0x0211
            com.google.assistant.s.a.ep r11 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x0211:
            com.google.assistant.s.a.ep r10 = r9.f139402g
            if (r10 != 0) goto L_0x0217
            com.google.assistant.s.a.ep r10 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x0217:
            java.lang.String r2 = r9.f139409n
            boolean r16 = r2.isEmpty()
            if (r16 == 0) goto L_0x0274
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.google.assistant.s.a.eh r1 = r9.f139405j
            if (r1 != 0) goto L_0x0228
            com.google.assistant.s.a.eh r1 = com.google.assistant.p3994s.p3995a.C53179eh.f139366e
        L_0x0228:
            java.lang.String r1 = r1.f139370c
            r16 = 0
            r2[r16] = r1
            int r1 = r9.f139406k
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r16 = 1
            r2[r16] = r1
            java.lang.String r1 = r11.f139386b
            r16 = 2
            r2[r16] = r1
            java.lang.String r1 = r10.f139386b
            r10 = 3
            r2[r10] = r1
            if (r4 == 0) goto L_0x025e
            com.google.assistant.s.a.el r1 = r9.f139403h
            if (r1 != 0) goto L_0x024b
            com.google.assistant.s.a.el r1 = com.google.assistant.p3994s.p3995a.C53183el.f139373c
        L_0x024b:
            java.lang.String r1 = r1.f139376b
            int r4 = r1.length()
            r10 = 10
            if (r4 >= r10) goto L_0x0258
            java.lang.String r1 = ""
            goto L_0x0268
        L_0x0258:
            r4 = 0
            java.lang.String r1 = r1.substring(r4, r10)
            goto L_0x0268
        L_0x025e:
            com.google.cg.d r1 = r11.f139389e
            if (r1 != 0) goto L_0x0264
            com.google.cg.d r1 = com.google.p4479cg.C58072d.f155218d
        L_0x0264:
            j$.time.LocalDate r1 = com.google.p4479cg.p4480a.C58068e.m88826d(r1)
        L_0x0268:
            r4 = 4
            r2[r4] = r1
            java.lang.String r1 = "%s %s %s %s %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r17 = r1
            goto L_0x0276
        L_0x0274:
            r17 = r2
        L_0x0276:
            r16 = 0
            r18 = 0
            com.google.assistant.c.cr r19 = com.google.assistant.p3886c.C50794cr.FLIGHT
            r21 = 1
            r20 = r0
            android.content.Intent r4 = com.google.android.apps.gsa.smartspace.C92122r.m151186d(r16, r17, r18, r19, r20, r21)
        L_0x0284:
            com.google.android.apps.gsa.search.core.i.t r1 = r7.f308439b
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247311ek
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0299
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA"
            r4.putExtra(r1, r3)
        L_0x0299:
            r1 = 1
            java.lang.String r3 = r4.toUri(r1)
        L_0x029e:
            com.google.assistant.c.b.r r2 = com.google.assistant.p3886c.p3888b.C50733r.f132021d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.c.b.q r2 = (com.google.assistant.p3886c.p3888b.C50732q) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.c.b.r r4 = (com.google.assistant.p3886c.p3888b.C50733r) r4
            int r0 = r0.f132020d
            r4.f132024b = r0
            int r0 = r4.f132023a
            r0 = r0 | r1
            r4.f132023a = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.c.b.r r0 = (com.google.assistant.p3886c.p3888b.C50733r) r0
            r3.getClass()
            int r1 = r0.f132023a
            r4 = 2
            r1 = r1 | r4
            r0.f132023a = r1
            r0.f132025c = r3
            com.google.protobuf.bv r0 = r2.build()
            com.google.assistant.c.b.r r0 = (com.google.assistant.p3886c.p3888b.C50733r) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            r0.getClass()
            r1.f132316m = r0
            int r0 = r1.f132304a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.f132304a = r0
            com.google.android.libraries.f.a r0 = r7.f308441d
            long r0 = r0.mo26870b()
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2
            int r3 = r2.f132304a
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r2.f132304a = r3
            r2.f132317n = r0
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r1 = r0.f132304a
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            r0.f132304a = r1
            r0.f132318o = r5
            long r0 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d.f358768d
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2
            int r3 = r2.f132304a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r2.f132304a = r3
            r2.f132319p = r0
            com.google.assistant.c.ct r0 = com.google.assistant.p3886c.C50796ct.f132223c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.cs r0 = (com.google.assistant.p3886c.C50795cs) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.c.ct r1 = (com.google.assistant.p3886c.C50796ct) r1
            int r2 = r1.f132225a
            r3 = 1
            r2 = r2 | r3
            r1.f132225a = r2
            r1.f132226b = r12
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.c.ct r0 = (com.google.assistant.p3886c.C50796ct) r0
            r0.getClass()
            r1.f132320q = r0
            int r0 = r1.f132304a
            r2 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r2
            r1.f132304a = r0
            com.google.assistant.c.dn r0 = com.google.assistant.p3886c.C50817dn.f132287e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.dk r0 = (com.google.assistant.p3886c.C50814dk) r0
            com.google.assistant.c.dm r1 = com.google.assistant.p3886c.C50816dm.f132281e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.c.dl r1 = (com.google.assistant.p3886c.C50815dl) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.c.dm r2 = (com.google.assistant.p3886c.C50816dm) r2
            int r3 = r2.f132283a
            r4 = 1
            r3 = r3 | r4
            r2.f132283a = r3
            r2.f132284b = r14
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.c.dm r2 = (com.google.assistant.p3886c.C50816dm) r2
            int r3 = r2.f132283a
            r4 = 2
            r3 = r3 | r4
            r2.f132283a = r3
            r2.f132285c = r12
            r5 = r23
            r1.mo53468a(r5)
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.c.dm r1 = (com.google.assistant.p3886c.C50816dm) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.c.dn r2 = (com.google.assistant.p3886c.C50817dn) r2
            r1.getClass()
            r2.f132292d = r1
            int r1 = r2.f132289a
            r1 = r1 | 8
            r2.f132289a = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.c.dn r0 = (com.google.assistant.p3886c.C50817dn) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            r0.getClass()
            r1.f132295A = r0
            int r0 = r1.f132304a
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 | r2
            r1.f132304a = r0
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r1 = r0.f132304a
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r2
            r0.f132304a = r1
            r1 = 1
            r0.f132321r = r1
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r2 = r0.f132304a
            r3 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r3
            r0.f132304a = r2
            r0.f132324u = r1
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f308439b
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246732o
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x04f8
            boolean r0 = r7.mo98857l(r9)
            com.google.android.libraries.f.a r1 = r7.f308441d
            long r1 = r1.mo26870b()
            com.google.assistant.s.a.ep r3 = r9.f139401f
            if (r3 != 0) goto L_0x03e5
            com.google.assistant.s.a.ep r3 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x03e5:
            long r3 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184392b(r3)
            boolean r5 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184396i(r9)
            if (r5 != 0) goto L_0x0414
            boolean r5 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184397j(r9)
            if (r5 == 0) goto L_0x0414
            com.google.android.apps.gsa.search.core.i.t r5 = r7.f308439b
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246710ar
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x0414
            long r3 = r3 - r1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            com.google.android.apps.gsa.search.core.i.t r2 = r7.f308439b
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246711as
            long r5 = r2.mo79743a(r5)
            long r1 = r1.toMillis(r5)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0414
            r1 = 1
            goto L_0x0415
        L_0x0414:
            r1 = 0
        L_0x0415:
            if (r0 != 0) goto L_0x041c
            if (r1 == 0) goto L_0x041a
            goto L_0x041c
        L_0x041a:
            r10 = 0
            goto L_0x041d
        L_0x041c:
            r10 = 1
        L_0x041d:
            r2 = 7
            if (r0 == 0) goto L_0x0495
            com.google.assistant.c.p r0 = com.google.assistant.p3886c.C50844p.f132387m
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.o r0 = (com.google.assistant.p3886c.C50843o) r0
            com.google.assistant.s.a.ep r1 = r9.f139401f
            if (r1 != 0) goto L_0x042e
            com.google.assistant.s.a.ep r1 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x042e:
            java.lang.String r1 = r1.f139387c
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.c.p r3 = (com.google.assistant.p3886c.C50844p) r3
            r1.getClass()
            int r4 = r3.f132389a
            r5 = 1
            r4 = r4 | r5
            r3.f132389a = r4
            r3.f132390b = r1
            com.google.protobuf.cq r1 = r9.f139407l
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0456
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.c.p r0 = (com.google.assistant.p3886c.C50844p) r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x04e6
        L_0x0456:
            com.google.protobuf.cq r1 = r9.f139407l
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            com.google.assistant.s.a.en r1 = (com.google.assistant.p3994s.p3995a.C53185en) r1
            int r3 = r1.f139379a
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0479
            java.lang.String r1 = r1.f139380b
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.c.p r3 = (com.google.assistant.p3886c.C50844p) r3
            r1.getClass()
            int r4 = r3.f132389a
            r5 = 2
            r4 = r4 | r5
            r3.f132389a = r4
            r3.f132391c = r1
        L_0x0479:
            com.google.android.libraries.gsa.k.g r1 = r7.f308442e
            com.google.android.apps.gsa.shared.y.au r3 = r7.f308445h
            java.lang.String r4 = "https://fonts.gstatic.com/s/i/googlematerialicons/qr_code/v11/gm_grey-48dp/2x/gm_qr_code_gm_grey_48dp.png"
            android.net.Uri r4 = android.net.Uri.parse(r4)
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r2 = r3.mo85425m(r4, r5, r2)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.g.f r3 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.g.f
            r3.<init>(r0)
            java.lang.String r0 = "loadBytesBoardingPassImage"
            com.google.common.util.concurrent.cx r0 = r1.mo28209i(r2, r0, r3)
            goto L_0x04e6
        L_0x0495:
            if (r1 == 0) goto L_0x04e0
            com.google.assistant.c.p r0 = com.google.assistant.p3886c.C50844p.f132387m
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.o r0 = (com.google.assistant.p3886c.C50843o) r0
            android.content.Context r1 = r7.f308438a
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2132085132(0x7f15098c, float:1.9810454E38)
            java.lang.String r1 = r1.getString(r3)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.c.p r3 = (com.google.assistant.p3886c.C50844p) r3
            r1.getClass()
            int r4 = r3.f132389a
            r4 = r4 | 16
            r3.f132389a = r4
            r3.f132394f = r1
            com.google.android.libraries.gsa.k.g r1 = r7.f308442e
            com.google.android.apps.gsa.shared.y.au r3 = r7.f308445h
            com.google.assistant.s.a.eh r4 = r9.f139405j
            if (r4 != 0) goto L_0x04c8
            com.google.assistant.s.a.eh r4 = com.google.assistant.p3994s.p3995a.C53179eh.f139366e
        L_0x04c8:
            java.lang.String r4 = r4.f139371d
            android.net.Uri r4 = android.net.Uri.parse(r4)
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r2 = r3.mo85425m(r4, r5, r2)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.g.d r3 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.g.d
            r3.<init>(r0)
            java.lang.String r0 = "loadBytesCheckinImage"
            com.google.common.util.concurrent.cx r0 = r1.mo28209i(r2, r0, r3)
            goto L_0x04e6
        L_0x04e0:
            com.google.assistant.c.p r0 = com.google.assistant.p3886c.C50844p.f132387m
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x04e6:
            com.google.android.libraries.gsa.k.g r1 = r7.f308443f
            com.google.android.apps.gsa.staticplugins.opa.smartspace.g.e r2 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.g.e
            r6 = r2
            r11 = r26
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r3 = "setFlightCard"
            com.google.common.util.concurrent.cx r1 = r1.mo28209i(r0, r3, r2)
            goto L_0x0801
        L_0x04f8:
            android.content.Context r0 = r7.f308438a
            com.google.assistant.c.cz r1 = com.google.assistant.p3886c.C50802cz.f132236g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.c.cy r1 = (com.google.assistant.p3886c.C50801cy) r1
            com.google.assistant.c.b.h r2 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.c.b.a r2 = (com.google.assistant.p3886c.p3888b.C50716a) r2
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = "%1$s"
            r6 = 0
            r5[r6] = r4
            java.lang.String r6 = "%2$s"
            r10 = 1
            r5[r10] = r6
            r11 = 2132083788(0x7f15044c, float:1.9807728E38)
            java.lang.String r3 = r3.getString(r11, r5)
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.c.b.h r5 = (com.google.assistant.p3886c.p3888b.C50723h) r5
            r3.getClass()
            int r11 = r5.f132001a
            r11 = r11 | r10
            r5.f132001a = r11
            r5.f132002b = r3
            com.google.assistant.s.a.ep r3 = r9.f139401f
            if (r3 != 0) goto L_0x0539
            com.google.assistant.s.a.ep r3 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x0539:
            java.lang.String r3 = r3.f139386b
            com.google.assistant.c.b.e r3 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184393c(r3)
            r2.mo53428a(r3)
            com.google.assistant.s.a.ep r3 = r9.f139402g
            if (r3 != 0) goto L_0x0548
            com.google.assistant.s.a.ep r3 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x0548:
            java.lang.String r3 = r3.f139386b
            com.google.assistant.c.b.e r3 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184393c(r3)
            r2.mo53428a(r3)
            com.google.assistant.c.b.g r3 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.c.b.h r5 = (com.google.assistant.p3886c.p3888b.C50723h) r5
            int r3 = r3.f131998e
            r5.f132003c = r3
            int r3 = r5.f132001a
            r10 = 2
            r3 = r3 | r10
            r5.f132001a = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.c.cz r3 = (com.google.assistant.p3886c.C50802cz) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.c.b.h r2 = (com.google.assistant.p3886c.p3888b.C50723h) r2
            r2.getClass()
            r3.f132239b = r2
            int r2 = r3.f132238a
            r5 = 1
            r2 = r2 | r5
            r3.f132238a = r2
            r2 = r26
            com.google.assistant.c.b.h r0 = r7.mo98854e(r0, r9, r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.c.cz r3 = (com.google.assistant.p3886c.C50802cz) r3
            r0.getClass()
            r3.f132241d = r0
            int r0 = r3.f132238a
            r5 = 4
            r0 = r0 | r5
            r3.f132238a = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.c.cz r0 = (com.google.assistant.p3886c.C50802cz) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            r0.getClass()
            r1.f132309f = r0
            int r0 = r1.f132304a
            r0 = r0 | 16
            r1.f132304a = r0
            android.content.Context r0 = r7.f308438a
            com.google.assistant.c.cz r1 = com.google.assistant.p3886c.C50802cz.f132236g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.c.cy r1 = (com.google.assistant.p3886c.C50801cy) r1
            com.google.assistant.c.b.e r3 = com.google.assistant.p3886c.p3888b.C50720e.f131985f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.b.b r3 = (com.google.assistant.p3886c.p3888b.C50717b) r3
            com.google.assistant.c.b.g r5 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.assistant.c.b.e r10 = (com.google.assistant.p3886c.p3888b.C50720e) r10
            int r5 = r5.f131998e
            r10.f131989c = r5
            int r5 = r10.f131987a
            r11 = 2
            r5 = r5 | r11
            r10.f131987a = r5
            com.google.assistant.c.b.d r5 = com.google.assistant.p3886c.p3888b.C50719d.EVENT_START_TIME
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.assistant.c.b.e r10 = (com.google.assistant.p3886c.p3888b.C50720e) r10
            int r5 = r5.f131984e
            r10.f131990d = r5
            int r5 = r10.f131987a
            r11 = 4
            r5 = r5 | r11
            r10.f131987a = r5
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.c.b.e r5 = (com.google.assistant.p3886c.p3888b.C50720e) r5
            int r10 = r5.f131987a
            r10 = r10 | 8
            r5.f131987a = r10
            r10 = 1
            r5.f131991e = r10
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.c.b.e r3 = (com.google.assistant.p3886c.p3888b.C50720e) r3
            com.google.assistant.c.b.h r5 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.b.a r5 = (com.google.assistant.p3886c.p3888b.C50716a) r5
            android.content.res.Resources r11 = r0.getResources()
            r12 = 3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r12 = 0
            r13[r12] = r4
            r13[r10] = r6
            java.lang.String r12 = "%3$s"
            r14 = 2
            r13[r14] = r12
            r14 = 2132083787(0x7f15044b, float:1.9807726E38)
            java.lang.String r11 = r11.getString(r14, r13)
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.assistant.c.b.h r13 = (com.google.assistant.p3886c.p3888b.C50723h) r13
            r11.getClass()
            int r14 = r13.f132001a
            r14 = r14 | r10
            r13.f132001a = r14
            r13.f132002b = r11
            com.google.assistant.s.a.ep r10 = r9.f139401f
            if (r10 != 0) goto L_0x0631
            com.google.assistant.s.a.ep r10 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x0631:
            java.lang.String r10 = r10.f139386b
            com.google.assistant.c.b.e r10 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184393c(r10)
            r5.mo53428a(r10)
            com.google.assistant.s.a.ep r10 = r9.f139402g
            if (r10 != 0) goto L_0x0640
            com.google.assistant.s.a.ep r10 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x0640:
            java.lang.String r10 = r10.f139386b
            com.google.assistant.c.b.e r10 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184393c(r10)
            r5.mo53428a(r10)
            r5.mo53428a(r3)
            com.google.assistant.c.b.g r3 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.assistant.c.b.h r10 = (com.google.assistant.p3886c.p3888b.C50723h) r10
            int r3 = r3.f131998e
            r10.f132003c = r3
            int r3 = r10.f132001a
            r11 = 2
            r3 = r3 | r11
            r10.f132001a = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.c.cz r3 = (com.google.assistant.p3886c.C50802cz) r3
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.c.b.h r5 = (com.google.assistant.p3886c.p3888b.C50723h) r5
            r5.getClass()
            r3.f132239b = r5
            int r5 = r3.f132238a
            r10 = 1
            r5 = r5 | r10
            r3.f132238a = r5
            com.google.assistant.c.b.h r0 = r7.mo98854e(r0, r9, r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.c.cz r3 = (com.google.assistant.p3886c.C50802cz) r3
            r0.getClass()
            r3.f132241d = r0
            int r0 = r3.f132238a
            r5 = 4
            r0 = r0 | r5
            r3.f132238a = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.c.cz r0 = (com.google.assistant.p3886c.C50802cz) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            r0.getClass()
            r1.f132308e = r0
            int r0 = r1.f132304a
            r0 = r0 | 8
            r1.f132304a = r0
            android.content.Context r0 = r7.f308438a
            com.google.assistant.c.cz r1 = com.google.assistant.p3886c.C50802cz.f132236g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.c.cy r1 = (com.google.assistant.p3886c.C50801cy) r1
            com.google.assistant.c.b.h r3 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.b.a r3 = (com.google.assistant.p3886c.p3888b.C50716a) r3
            r5 = 2
            com.google.assistant.c.b.e[] r10 = new com.google.assistant.p3886c.p3888b.C50720e[r5]
            com.google.assistant.s.a.ep r5 = r9.f139401f
            if (r5 != 0) goto L_0x06c0
            com.google.assistant.s.a.ep r5 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x06c0:
            com.google.assistant.s.a.ep r11 = r9.f139402g
            if (r11 != 0) goto L_0x06c6
            com.google.assistant.s.a.ep r11 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x06c6:
            int r13 = r5.f139385a
            r14 = 4
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0768
            android.content.res.Resources r10 = r0.getResources()
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r13 = 0
            r14[r13] = r4
            r4 = 1
            r14[r4] = r6
            r6 = 2
            r14[r6] = r12
            r6 = 2132083789(0x7f15044d, float:1.980773E38)
            java.lang.String r6 = r10.getString(r6, r14)
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.assistant.c.b.h r10 = (com.google.assistant.p3886c.p3888b.C50723h) r10
            r6.getClass()
            int r12 = r10.f132001a
            r12 = r12 | r4
            r10.f132001a = r12
            r10.f132002b = r6
            com.google.assistant.c.b.e r4 = com.google.assistant.p3886c.p3888b.C50720e.f131985f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.b.b r4 = (com.google.assistant.p3886c.p3888b.C50717b) r4
            java.lang.String r6 = r7.mo98855h(r0, r9, r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.assistant.c.b.e r10 = (com.google.assistant.p3886c.p3888b.C50720e) r10
            r6.getClass()
            int r12 = r10.f131987a
            r13 = 1
            r12 = r12 | r13
            r10.f131987a = r12
            r10.f131988b = r6
            com.google.assistant.c.b.g r6 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.assistant.c.b.e r10 = (com.google.assistant.p3886c.p3888b.C50720e) r10
            int r6 = r6.f131998e
            r10.f131989c = r6
            int r6 = r10.f131987a
            r12 = 2
            r6 = r6 | r12
            r10.f131987a = r6
            com.google.assistant.c.b.d r6 = com.google.assistant.p3886c.p3888b.C50719d.FIXED_STRING
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.assistant.c.b.e r10 = (com.google.assistant.p3886c.p3888b.C50720e) r10
            int r6 = r6.f131984e
            r10.f131990d = r6
            int r6 = r10.f131987a
            r12 = 4
            r6 = r6 | r12
            r10.f131987a = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.c.b.e r6 = (com.google.assistant.p3886c.p3888b.C50720e) r6
            int r10 = r6.f131987a
            r10 = r10 | 8
            r6.f131987a = r10
            r10 = 0
            r6.f131991e = r10
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.c.b.e r4 = (com.google.assistant.p3886c.p3888b.C50720e) r4
            r6 = 3
            com.google.assistant.c.b.e[] r10 = new com.google.assistant.p3886c.p3888b.C50720e[r6]
            r12 = 2
            r10[r12] = r4
            com.google.assistant.c.b.g r4 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.c.b.h r6 = (com.google.assistant.p3886c.p3888b.C50723h) r6
            int r4 = r4.f131998e
            r6.f132003c = r4
            int r4 = r6.f132001a
            r4 = r4 | r12
            r6.f132001a = r4
            r4 = 1
            goto L_0x078d
        L_0x0768:
            r12 = 2
            android.content.res.Resources r13 = r0.getResources()
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r14 = 0
            r12[r14] = r4
            r4 = 1
            r12[r4] = r6
            r6 = 2132083790(0x7f15044e, float:1.9807732E38)
            java.lang.String r6 = r13.getString(r6, r12)
            r3.copyOnWrite()
            com.google.protobuf.bv r12 = r3.instance
            com.google.assistant.c.b.h r12 = (com.google.assistant.p3886c.p3888b.C50723h) r12
            r6.getClass()
            int r13 = r12.f132001a
            r13 = r13 | r4
            r12.f132001a = r13
            r12.f132002b = r6
        L_0x078d:
            java.lang.String r5 = r5.f139386b
            com.google.assistant.c.b.e r5 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184393c(r5)
            r6 = 0
            r10[r6] = r5
            java.lang.String r5 = r11.f139386b
            com.google.assistant.c.b.e r5 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g.m184393c(r5)
            r10[r4] = r5
            java.util.List r4 = java.util.Arrays.asList(r10)
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.c.b.h r5 = (com.google.assistant.p3886c.p3888b.C50723h) r5
            r5.mo53431a()
            com.google.protobuf.cq r5 = r5.f132004d
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r5)
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.c.cz r4 = (com.google.assistant.p3886c.C50802cz) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.c.b.h r3 = (com.google.assistant.p3886c.p3888b.C50723h) r3
            r3.getClass()
            r4.f132239b = r3
            int r3 = r4.f132238a
            r5 = 1
            r3 = r3 | r5
            r4.f132238a = r3
            com.google.assistant.c.b.h r0 = r7.mo98854e(r0, r9, r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.c.cz r2 = (com.google.assistant.p3886c.C50802cz) r2
            r0.getClass()
            r2.f132241d = r0
            int r0 = r2.f132238a
            r3 = 4
            r0 = r0 | r3
            r2.f132238a = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.c.cz r0 = (com.google.assistant.p3886c.C50802cz) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            r0.getClass()
            r1.f132311h = r0
            int r0 = r1.f132304a
            r0 = r0 | 64
            r1.f132304a = r0
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0801:
            if (r1 != 0) goto L_0x0823
            com.google.common.f.e r0 = f308426c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "SSFlightInputHandler"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Error: null value should be wrapped in a ListenableFuture"
            r2 = 26660(0x6824, float:3.7359E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Flight card for Smartspace could not be constructed"
            r0.<init>(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            return r0
        L_0x0823:
            r0 = r25
            com.google.android.libraries.gsa.k.g r2 = r0.f308430e
            com.google.android.apps.gsa.staticplugins.opa.smartspace.g.b r3 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.g.b
            r4 = r22
            r3.<init>(r0, r4)
            java.lang.String r4 = "getSmartspaceCard"
            com.google.common.util.concurrent.cx r1 = r2.mo28210j(r1, r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110688c.mo98852a(com.google.android.apps.gsa.opa.smartspace.ak):com.google.common.util.concurrent.cx");
    }
}

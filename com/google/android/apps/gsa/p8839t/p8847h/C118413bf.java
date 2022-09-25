package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.t.h.bf */
/* compiled from: PG */
public final /* synthetic */ class C118413bf implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328651a;

    /* renamed from: b */
    public final /* synthetic */ C58974d f328652b;

    /* renamed from: c */
    public final /* synthetic */ C123777f f328653c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f328654d;

    /* renamed from: e */
    public final /* synthetic */ boolean f328655e;

    public /* synthetic */ C118413bf(C118426bs bsVar, C58974d dVar, C123777f fVar, C53306j jVar, boolean z) {
        this.f328651a = bsVar;
        this.f328652b = dVar;
        this.f328653c = fVar;
        this.f328654d = jVar;
        this.f328655e = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c3, code lost:
        if (r4 != 2) goto L_0x01c6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.apps.gsa.t.h.bs r1 = r0.f328651a
            com.google.common.f.a.d r2 = r0.f328652b
            com.google.android.apps.search.assistant.platform.pcp.f.f r11 = r0.f328653c
            com.google.assistant.s.a.j r12 = r0.f328654d
            boolean r13 = r0.f328655e
            r9 = r17
            java.lang.String r9 = (java.lang.String) r9
            com.google.common.f.x r3 = r2.mo56224b()
            java.lang.String r4 = "#getFilteredMediaApps() cached server preferred provider %s"
            r5 = 6990(0x1b4e, float:9.795E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56389s(r4, r9)
            com.google.protobuf.bt r3 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at.f341744i
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r11.mo58887l(r3)
            com.google.protobuf.bf r4 = r11.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 == 0) goto L_0x004f
            com.google.protobuf.bt r3 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at.f341744i
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r11.mo58887l(r3)
            com.google.protobuf.bf r4 = r11.f169962ag
            com.google.protobuf.bs r5 = r3.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x0044
            java.lang.Object r3 = r3.f169969b
            goto L_0x0048
        L_0x0044:
            java.lang.Object r3 = r3.mo58889c(r4)
        L_0x0048:
            com.google.android.apps.search.assistant.platform.pcp.f.at r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at) r3
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            goto L_0x0051
        L_0x004f:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
        L_0x0051:
            r14 = r3
            com.google.android.libraries.assistant.pcp.k.g r3 = r1.f328690k
            com.google.android.libraries.assistant.pcp.k.i r4 = com.google.android.libraries.assistant.pcp.p1573k.C18929i.MOSTLY_USED
            j$.time.Duration r5 = com.google.android.apps.gsa.p8839t.p8847h.C118426bs.m196610e(r12, r11)
            com.google.common.b.gu r15 = r3.mo24219c(r4, r5)
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r15)
            com.google.android.apps.gsa.t.h.z r4 = com.google.android.apps.gsa.p8839t.p8847h.C118450z.f328783a
            j$.util.stream.Collector r4 = p3186j$.util.stream.Collectors.groupingBy(r4)
            java.lang.Object r3 = r3.collect(r4)
            java.util.Map r3 = (java.util.Map) r3
            com.google.android.apps.gsa.t.h.ap r4 = new com.google.android.apps.gsa.t.h.ap
            r4.<init>(r3)
            com.google.common.base.ax r3 = r14.mo56106b(r4)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.lang.Object r3 = r3.mo56109e(r4)
            r5 = r3
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5
            com.google.common.f.x r3 = r2.mo56224b()
            java.lang.String r4 = "#getFilteredMediaApps() mostlyUsedMediaApps %s"
            r6 = 6991(0x1b4f, float:9.796E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r6)).mo56389s(r4, r15)
            com.google.common.f.x r3 = r2.mo56224b()
            java.lang.String r4 = "#getFilteredMediaApps() requestedMediaApps %s"
            r6 = 6992(0x1b50, float:9.798E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r6)).mo56389s(r4, r5)
            com.google.android.libraries.assistant.pcp.k.l r3 = r1.f328692m
            r10 = 1
            r4 = r15
            r6 = r12
            r7 = r11
            r8 = r13
            java.util.List r3 = r3.mo24191b(r4, r5, r6, r7, r8, r9, r10)
            r6 = 2
            r7 = 1
            r8 = 0
            if (r13 != 0) goto L_0x018b
            com.google.assistant.s.a.j r9 = com.google.assistant.p3994s.p3995a.C53306j.AMBIENT_ASSISTANT
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018b
            boolean r9 = r14.mo56113h()
            if (r9 == 0) goto L_0x018b
            java.lang.Object r9 = r14.mo56107c()
            com.google.android.apps.search.assistant.platform.pcp.f.at r9 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at) r9
            boolean r9 = r9.f341748c
            if (r9 == 0) goto L_0x018b
            java.lang.Object r9 = r14.mo56107c()
            com.google.android.apps.search.assistant.platform.pcp.f.at r9 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at) r9
            com.google.android.apps.gsa.search.core.i.t r10 = r1.f328696q
            com.google.android.apps.gsa.shared.m.h r13 = com.google.android.apps.gsa.shared.p7066m.C90069du.f249747y
            com.google.common.b.gu r10 = r10.mo79745c(r13)
            j$.util.stream.Stream r13 = p3186j$.util.Collection.EL.stream(r15)
            com.google.android.apps.gsa.t.h.z r14 = com.google.android.apps.gsa.p8839t.p8847h.C118450z.f328783a
            j$.util.stream.Stream r13 = r13.map(r14)
            p3186j$.util.Objects.requireNonNull(r10)
            com.google.android.apps.gsa.t.h.ak r14 = new com.google.android.apps.gsa.t.h.ak
            r14.<init>(r10)
            j$.util.stream.Stream r13 = r13.filter(r14)
            j$.util.Optional r13 = r13.findFirst()
            r14 = 0
            java.lang.Object r13 = r13.orElse(r14)
            java.lang.String r13 = (java.lang.String) r13
            j$.util.stream.Stream r15 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.gsa.t.h.z r4 = com.google.android.apps.gsa.p8839t.p8847h.C118450z.f328783a
            j$.util.stream.Stream r4 = r15.map(r4)
            p3186j$.util.Objects.requireNonNull(r10)
            com.google.android.apps.gsa.t.h.ak r5 = new com.google.android.apps.gsa.t.h.ak
            r5.<init>(r10)
            j$.util.stream.Stream r4 = r4.filter(r5)
            j$.util.Optional r4 = r4.findFirst()
            java.lang.Object r4 = r4.orElse(r14)
            java.lang.String r4 = (java.lang.String) r4
            com.google.protobuf.cq r5 = r9.f341747b
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.apps.gsa.t.h.av r9 = com.google.android.apps.gsa.p8839t.p8847h.C118402av.f328639a
            j$.util.stream.Stream r5 = r5.map(r9)
            p3186j$.util.Objects.requireNonNull(r10)
            com.google.android.apps.gsa.t.h.ak r9 = new com.google.android.apps.gsa.t.h.ak
            r9.<init>(r10)
            j$.util.stream.Stream r5 = r5.filter(r9)
            j$.util.Optional r5 = r5.findFirst()
            java.lang.Object r5 = r5.orElse(r14)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.apps.search.assistant.platform.pcp.i.bz r9 = r1.f328700u
            com.google.android.libraries.search.logging.d.kp r9 = r9.f342762a
            if (r13 == 0) goto L_0x013a
            r10 = 1
            goto L_0x013b
        L_0x013a:
            r10 = 0
        L_0x013b:
            if (r5 == 0) goto L_0x013f
            r14 = 1
            goto L_0x0140
        L_0x013f:
            r14 = 0
        L_0x0140:
            if (r4 == 0) goto L_0x0144
            r15 = 1
            goto L_0x0145
        L_0x0144:
            r15 = 0
        L_0x0145:
            if (r13 == 0) goto L_0x014f
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x014f
            r13 = 1
            goto L_0x0150
        L_0x014f:
            r13 = 0
        L_0x0150:
            if (r4 == 0) goto L_0x015a
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x015a
            r4 = 1
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            com.google.common.base.cr r5 = r9.f102828aL
            java.lang.Object r5 = r5.mo6453a()
            com.google.android.libraries.au.d r5 = (com.google.android.libraries.p1635au.C19567d) r5
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9[r8] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r14)
            r9[r7] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r15)
            r9[r6] = r10
            r10 = 3
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r9[r10] = r13
            r10 = 4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r9[r10] = r4
            r13 = 1
            r5.mo24822a(r13, r9)
        L_0x018b:
            com.google.protobuf.bt r4 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at.f341744i
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r11.mo58887l(r4)
            com.google.protobuf.bf r5 = r11.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x01c6
            com.google.protobuf.bt r4 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at.f341744i
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r11.mo58887l(r4)
            com.google.protobuf.bf r5 = r11.f169962ag
            com.google.protobuf.bs r9 = r4.f169971d
            java.lang.Object r5 = r5.mo58854l(r9)
            if (r5 != 0) goto L_0x01b4
            java.lang.Object r4 = r4.f169969b
            goto L_0x01b8
        L_0x01b4:
            java.lang.Object r4 = r4.mo58889c(r5)
        L_0x01b8:
            com.google.android.apps.search.assistant.platform.pcp.f.at r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at) r4
            int r4 = r4.f341750e
            int r4 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123725as.m203079a(r4)
            if (r4 != 0) goto L_0x01c3
            goto L_0x01c6
        L_0x01c3:
            if (r4 != r6) goto L_0x01c6
            goto L_0x01c7
        L_0x01c6:
            r7 = 0
        L_0x01c7:
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f328696q
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90069du.f249710D
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x01fb
            if (r7 == 0) goto L_0x01fb
            com.google.assistant.s.a.j r1 = com.google.assistant.p3994s.p3995a.C53306j.AMBIENT_ASSISTANT
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x01fb
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r3)
            r3 = 1
            j$.util.stream.Stream r1 = r1.limit(r3)
            j$.util.stream.Collector r3 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r3)
            java.util.List r1 = (java.util.List) r1
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "#getFilteredMediaApps() topFilteredApp %s"
            r4 = 6993(0x1b51, float:9.799E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56389s(r3, r1)
            return r1
        L_0x01fb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8839t.p8847h.C118413bf.mo17879a(java.lang.Object):java.lang.Object");
    }
}

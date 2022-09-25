package com.google.android.apps.gsa.staticplugins.p7778dd;

import com.google.android.apps.gsa.search.core.p6519al.p6632c.C85048a;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86201ak;
import com.google.android.apps.gsa.search.core.p6820r.C86387ai;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86376a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86378c;
import com.google.android.apps.gsa.search.core.p6820r.p6833e.C86428h;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.staticplugins.messages.C102711e;
import com.google.android.apps.gsa.staticplugins.p7371ae.C93802x;
import com.google.android.apps.gsa.staticplugins.p7421aw.C94396i;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8712a.C116532a;
import com.google.android.apps.gsa.staticplugins.webview.C118225ee;
import com.google.android.apps.gsa.staticplugins.webview.C118226ef;
import com.google.android.apps.gsa.staticplugins.webview.C118247f;
import com.google.common.base.C58833ax;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.dd.a */
/* compiled from: PG */
public final class C99374a {

    /* renamed from: a */
    public final C93802x f278036a;

    /* renamed from: b */
    private final C58833ax f278037b;

    /* renamed from: c */
    private final C68214a f278038c;

    /* renamed from: d */
    private final C85048a f278039d;

    /* renamed from: e */
    private final C86201ak f278040e;

    /* renamed from: f */
    private final C85089a f278041f;

    /* renamed from: g */
    private final C118247f f278042g;

    /* renamed from: h */
    private final C102711e f278043h;

    /* renamed from: i */
    private final C94396i f278044i;

    public C99374a(C118247f fVar, C58833ax axVar, C85089a aVar, C93802x xVar, C68214a aVar2, C102711e eVar, C85048a aVar3, C86201ak akVar, C94396i iVar) {
        this.f278037b = axVar;
        this.f278042g = fVar;
        this.f278036a = xVar;
        this.f278038c = aVar2;
        this.f278043h = eVar;
        this.f278039d = aVar3;
        this.f278040e = akVar;
        this.f278044i = iVar;
        this.f278041f = aVar;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [com.google.android.apps.gsa.search.core.r.ai] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0191, code lost:
        if (r5 > 0) goto L_0x0193;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.search.core.p6820r.C86387ai mo91416a(com.google.common.base.C58833ax r18, com.google.android.apps.gsa.shared.p7012bb.C89356b r19, com.google.android.apps.gsa.search.core.p6820r.p6833e.C86426f r20) {
        /*
            r17 = this;
            r0 = r17
            r11 = r19
            r12 = r20
            com.google.android.apps.gsa.search.shared.media.PlaybackStatus r1 = r12.f233581j
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90833j(r1)
            com.google.android.apps.gsa.search.core.al.c.a r1 = r0.f278039d
            com.google.android.apps.gsa.search.core.r.a.a.a r3 = r12.f233572a
            com.google.android.apps.gsa.search.core.r.a.a.c r4 = r12.f233573b
            com.google.android.apps.gsa.search.core.r.a.e.a r5 = r12.f233574c
            com.google.android.apps.gsa.search.core.r.a.a.e r6 = r12.f233575d
            r7 = r19
            com.google.common.util.concurrent.cx r1 = r1.mo78670a(r2, r3, r4, r5, r6, r7)
            com.google.android.apps.gsa.search.core.r.ab r2 = new com.google.android.apps.gsa.search.core.r.ab
            r2.<init>(r1)
            boolean r1 = r18.mo56113h()
            if (r1 == 0) goto L_0x0033
            com.google.android.apps.gsa.staticplugins.dd.a.a r1 = new com.google.android.apps.gsa.staticplugins.dd.a.a
            java.lang.Object r3 = r18.mo56107c()
            com.google.android.apps.gsa.search.core.r.ai r3 = (com.google.android.apps.gsa.search.core.p6820r.C86387ai) r3
            r1.<init>(r2, r3)
            r2 = r1
        L_0x0033:
            com.google.android.apps.gsa.staticplugins.messages.e r1 = r0.f278043h
            com.google.android.apps.gsa.search.core.r.a.g.a r3 = r20.mo80174c()
            com.google.android.apps.gsa.staticplugins.messages.g r1 = r1.f286737a
            com.google.android.apps.gsa.staticplugins.messages.f r4 = new com.google.android.apps.gsa.staticplugins.messages.f
            r3.getClass()
            g.a.a r1 = r1.f286741a
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.search.core.service.a.b.c r1 = (com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c) r1
            r1.getClass()
            r4.<init>(r2, r11, r3, r1)
            com.google.android.apps.gsa.staticplugins.aw.i r13 = r0.f278044i
            com.google.android.apps.gsa.search.core.r.a.d.a r5 = r12.f233576e
            com.google.android.apps.gsa.search.core.r.a.d.c r6 = r12.f233577f
            com.google.android.apps.gsa.search.core.r.a.d.e r14 = r20.mo80172a()
            com.google.android.apps.gsa.search.core.r.a.d.g r7 = r12.f233579h
            com.google.android.apps.gsa.search.core.r.a.d.i r8 = r12.f233580i
            com.google.android.apps.gsa.staticplugins.aw.a.au r1 = r13.f263914c
            com.google.android.apps.gsa.staticplugins.aw.a.at r15 = new com.google.android.apps.gsa.staticplugins.aw.a.at
            g.a.a r2 = r1.f263801a
            java.lang.Object r2 = r2.mo17428b()
            r9 = r2
            com.google.android.apps.gsa.shared.s.b.a r9 = (com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a) r9
            r9.getClass()
            g.a.a r2 = r1.f263802b
            java.lang.Object r2 = r2.mo17428b()
            r10 = r2
            com.google.android.apps.gsa.search.core.service.a.b.c r10 = (com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c) r10
            r10.getClass()
            g.a.a r1 = r1.f263803c
            java.lang.Object r1 = r1.mo17428b()
            r16 = r1
            com.google.android.apps.gsa.search.core.i.t r16 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r16
            r16.getClass()
            r1 = r15
            r2 = r4
            r3 = r19
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.google.android.apps.gsa.staticplugins.aw.y r1 = r13.f263913b
            com.google.android.apps.gsa.staticplugins.aw.x r7 = new com.google.android.apps.gsa.staticplugins.aw.x
            g.a.a r2 = r1.f263945a
            java.lang.Object r2 = r2.mo17428b()
            r4 = r2
            com.google.android.apps.gsa.search.core.service.a.b.c r4 = (com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c) r4
            r4.getClass()
            g.a.a r2 = r1.f263946b
            java.lang.Object r2 = r2.mo17428b()
            r5 = r2
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            r5.getClass()
            g.a.a r1 = r1.f263947c
            java.lang.Object r1 = r1.mo17428b()
            r6 = r1
            com.google.android.apps.gsa.search.core.al.cq.a r6 = (com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a) r6
            r6.getClass()
            r1 = r7
            r2 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.apps.gsa.staticplugins.aw.k r1 = r13.f263912a
            com.google.android.apps.gsa.staticplugins.aw.j r2 = new com.google.android.apps.gsa.staticplugins.aw.j
            r14.getClass()
            g.a.a r1 = r1.f263918a
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.search.core.service.a.b.c r1 = (com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c) r1
            r1.getClass()
            r2.<init>(r7, r11, r14, r1)
            com.google.android.apps.gsa.search.core.p.ak r1 = r0.f278040e
            com.google.android.apps.gsa.search.core.p.aj r3 = new com.google.android.apps.gsa.search.core.p.aj
            g.a.a r4 = r1.f232940a
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.apps.gsa.search.core.google.cm r4 = (com.google.android.apps.gsa.search.core.google.C85919cm) r4
            r4.getClass()
            g.a.a r1 = r1.f232941b
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.search.core.google.cw r1 = (com.google.android.apps.gsa.search.core.google.C85929cw) r1
            r1.getClass()
            r3.<init>(r2, r11, r4, r1)
            dagger.a r1 = r0.f278038c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90091ep.f250544g
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0105
            r2 = r3
            goto L_0x011c
        L_0x0105:
            com.google.android.apps.gsa.staticplugins.ae.x r1 = r0.f278036a
            com.google.android.apps.gsa.search.core.r.a.b.a r2 = r12.f233578g
            com.google.android.apps.gsa.staticplugins.ae.bj r1 = r1.f262018c
            com.google.android.apps.gsa.staticplugins.ae.bi r4 = new com.google.android.apps.gsa.staticplugins.ae.bi
            g.a.a r1 = r1.f261640a
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.search.core.al.aa.a r1 = (com.google.android.apps.gsa.search.core.p6519al.p6522aa.C84609a) r1
            r1.getClass()
            r4.<init>(r3, r11, r2, r1)
            r2 = r4
        L_0x011c:
            com.google.android.apps.gsa.staticplugins.ae.x r1 = r0.f278036a
            com.google.android.apps.gsa.search.core.r.a.f.a r4 = r20.mo80173b()
            com.google.android.apps.gsa.staticplugins.ae.aa r1 = r1.f262016a
            com.google.android.apps.gsa.staticplugins.ae.z r12 = new com.google.android.apps.gsa.staticplugins.ae.z
            r4.getClass()
            g.a.a r3 = r1.f261533a
            java.lang.Object r3 = r3.mo17428b()
            r5 = r3
            com.google.android.apps.gsa.search.core.ae.a.a r5 = (com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a) r5
            r5.getClass()
            g.a.a r3 = r1.f261534b
            java.lang.Object r3 = r3.mo17428b()
            r6 = r3
            com.google.android.apps.gsa.search.core.google.gaia.o r6 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r6
            r6.getClass()
            g.a.a r3 = r1.f261535c
            java.lang.Object r3 = r3.mo17428b()
            r7 = r3
            com.google.android.apps.gsa.search.core.service.a.b.c r7 = (com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c) r7
            r7.getClass()
            g.a.a r3 = r1.f261536d
            java.lang.Object r3 = r3.mo17428b()
            r8 = r3
            com.google.android.apps.gsa.location.ae r8 = (com.google.android.apps.gsa.location.C74637ae) r8
            r8.getClass()
            g.a.a r3 = r1.f261537e
            java.lang.Object r3 = r3.mo17428b()
            r9 = r3
            com.google.android.libraries.gcoreclient.c.a.i r9 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21461i) r9
            r9.getClass()
            g.a.a r1 = r1.f261538f
            java.lang.Object r1 = r1.mo17428b()
            r10 = r1
            com.google.android.libraries.gcoreclient.c.a.n r10 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21466n) r10
            r10.getClass()
            r1 = r12
            r3 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            dagger.a r1 = r0.f278038c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250630ab
            boolean r2 = r1.mo79746e(r2)
            if (r2 != 0) goto L_0x0193
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250597V
            long r1 = r1.mo79743a(r2)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x01a7
        L_0x0193:
            com.google.common.base.ax r1 = r0.f278037b
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x01a7
            com.google.common.base.ax r1 = r0.f278037b
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.core.j.c r1 = (com.google.android.apps.gsa.search.core.p6807j.C86134c) r1
            com.google.android.apps.gsa.search.core.r.ai r12 = r1.mo79785b(r12, r11)
        L_0x01a7:
            com.google.android.apps.gsa.search.core.al.cg.a r1 = r0.f278041f
            com.google.common.util.concurrent.cx r1 = r1.mo78697a(r12, r11)
            com.google.android.apps.gsa.search.core.r.ab r2 = new com.google.android.apps.gsa.search.core.r.ab
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7778dd.C99374a.mo91416a(com.google.common.base.ax, com.google.android.apps.gsa.shared.bb.b, com.google.android.apps.gsa.search.core.r.e.f):com.google.android.apps.gsa.search.core.r.ai");
    }

    /* renamed from: b */
    public final C86387ai mo91417b(long j, C89356b bVar, C86428h hVar) {
        C86428h hVar2 = hVar;
        C118247f fVar = this.f278042g;
        C116532a aVar = (C116532a) hVar2;
        C86376a aVar2 = aVar.f323133k;
        C86378c cVar = aVar.f323134l;
        C86372a aVar3 = hVar2.f233574c;
        C118226ef efVar = fVar.f328272a;
        C68214a a = C68219e.m98518a(((C68226l) efVar.f328211a).f184585a);
        a.getClass();
        C86602c cVar2 = (C86602c) efVar.f328212b.mo17428b();
        cVar2.getClass();
        C86124t tVar = (C86124t) efVar.f328213c.mo17428b();
        tVar.getClass();
        C85454d dVar = (C85454d) efVar.f328214d.mo17428b();
        dVar.getClass();
        return mo91416a(C58833ax.m90834k(new C118225ee(bVar, aVar2, cVar, aVar3, j, a, cVar2, tVar, dVar)), bVar, hVar2);
    }
}

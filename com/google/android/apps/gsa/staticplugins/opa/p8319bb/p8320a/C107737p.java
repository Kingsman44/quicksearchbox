package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80499b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80501d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80502e;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83611a;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83638b;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83651c;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83652d;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.C87023eq;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.search.core.state.C87140ih;
import com.google.android.apps.gsa.search.core.state.C87171z;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88477c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106221b;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107757h;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107758i;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109460f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.a.p */
/* compiled from: PG */
public final class C107737p implements C87138if {

    /* renamed from: b */
    private static final C58974d f299785b = C58974d.m91136j();

    /* renamed from: a */
    public final C87140ih f299786a;

    /* renamed from: c */
    private final C87052fn f299787c;

    /* renamed from: d */
    private final C87023eq f299788d;

    /* renamed from: e */
    private final C87171z f299789e;

    /* renamed from: f */
    private final C86792g f299790f;

    /* renamed from: g */
    private final C68214a f299791g;

    /* renamed from: h */
    private final C68214a f299792h;

    /* renamed from: i */
    private Query f299793i;

    /* renamed from: j */
    private boolean f299794j;

    public C107737p(Query query, C87140ih ihVar, C87052fn fnVar, C87023eq eqVar, C87171z zVar, C86792g gVar, C68214a aVar, C68214a aVar2) {
        this.f299793i = query;
        this.f299786a = ihVar;
        this.f299787c = fnVar;
        this.f299788d = eqVar;
        this.f299789e = zVar;
        this.f299790f = gVar;
        this.f299791g = aVar;
        this.f299792h = aVar2;
    }

    /* renamed from: b */
    private static C83614ac m178860b() {
        C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
        e eVar = e.f;
        abVar.copyOnWrite();
        C83614ac acVar = (C83614ac) abVar.instance;
        acVar.f227955c = eVar.ca;
        acVar.f227953a |= 2;
        abVar.copyOnWrite();
        C83614ac acVar2 = (C83614ac) abVar.instance;
        acVar2.f227954b = 1;
        acVar2.f227953a = 1 | acVar2.f227953a;
        return (C83614ac) abVar.build();
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return C86898ct.m140157al(50, 69, 51, 25);
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        C86251f fVar;
        C83614ac acVar;
        Query query = this.f299787c.f235177m;
        int i = 3;
        if (icVar.mo80754a(50)) {
            Query query2 = this.f299793i;
            if (!query2.mo84383cP(query)) {
                this.f299793i = query;
                ((C107759j) this.f299791g.mo27525b()).mo96276l(query2, query, 2);
            } else if (!this.f299793i.equals(query)) {
                this.f299793i = query;
                ((C107759j) this.f299791g.mo27525b()).mo96276l(query, query, 3);
            }
            C87052fn fnVar = this.f299787c;
            C58976aa aaVar = C58975e.f156826a;
            C58833ax axVar = fnVar.f235188x;
            fnVar.f235188x = C58836b.f156633a;
            if (axVar.mo56113h()) {
                Query query3 = (Query) axVar.mo56107c();
                if (query3.mo84392cY()) {
                    e a = e.a(query3.mo84263a("android.opa.extra.TRIGGERED_BY"));
                    String obj = query3.f252768g.toString();
                    C80499b bVar = (C80499b) C80502e.f220990d.createBuilder();
                    bVar.copyOnWrite();
                    C80502e eVar = (C80502e) bVar.instance;
                    eVar.f220993b = a.ca;
                    eVar.f220992a |= 2;
                    C80501d dVar = C80501d.KEYBOARD_INPUT;
                    bVar.copyOnWrite();
                    C80502e eVar2 = (C80502e) bVar.instance;
                    eVar2.f220994c = dVar.f220989h;
                    eVar2.f220992a |= 4;
                    ((C107759j) this.f299791g.mo27525b()).mo96268d(C109460f.m182157a(obj), (C80502e) bVar.build());
                } else {
                    C107759j jVar = (C107759j) this.f299791g.mo27525b();
                    byte[] dU = query3.mo84440dU("android.opa.extra.OPEN_MIC_EVENT_DATA");
                    if (dU == null) {
                        ((C58970a) ((C58970a) f299785b.mo56226d()).mo56372aa(26132)).mo56389s("Missing OpenMicEventData in %s, assuming DIALOG_FOLLOW_ON.", query3);
                        e a2 = e.a(query3.mo84263a("android.opa.extra.TRIGGERED_BY"));
                        if (a2 == e.aw) {
                            C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
                            abVar.copyOnWrite();
                            C83614ac acVar2 = (C83614ac) abVar.instance;
                            acVar2.f227955c = a2.ca;
                            acVar2.f227953a |= 2;
                            abVar.copyOnWrite();
                            C83614ac acVar3 = (C83614ac) abVar.instance;
                            acVar3.f227954b = 1;
                            acVar3.f227953a |= 1;
                            acVar = (C83614ac) abVar.build();
                        } else {
                            acVar = m178860b();
                        }
                    } else {
                        try {
                            acVar = (C83614ac) C62942bv.parseFrom((C62942bv) C83614ac.f227951e, dU, C62921ba.m95368a());
                        } catch (C62974ct e) {
                            ((C58970a) ((C58970a) ((C58970a) f299785b.mo56226d()).mo56382g(e)).mo56372aa(26131)).mo56389s("Invalid OpenMicEventData in %s, assuming DIALOG_FOLLOW_ON", query3);
                            acVar = m178860b();
                        }
                    }
                    jVar.mo96272h(acVar);
                }
            }
        }
        boolean z = false;
        if (icVar.mo80754a(69)) {
            C87023eq eqVar = this.f299788d;
            if (!((C87052fn) eqVar.f235038c.mo27525b()).f235177m.mo84383cP(query) || !eqVar.f235056u || (fVar = eqVar.f235055t) == null) {
                fVar = null;
            } else {
                eqVar.f235056u = false;
            }
            if (fVar != null) {
                C107759j jVar2 = (C107759j) this.f299791g.mo27525b();
                new C90873ag(fVar.f233152k, jVar2.f299831b, "notify nga that opastate changed", new C107757h(jVar2, fVar, query)).mo85223a(C107758i.f299829a);
            }
        }
        if (icVar.mo80754a(51)) {
            VoiceAction f = this.f299789e.mo80807f();
            if (f != null && f.mo81077p()) {
                z = true;
            }
            if (z != this.f299794j) {
                this.f299794j = z;
                C107759j jVar3 = (C107759j) this.f299791g.mo27525b();
                if (true == this.f299794j) {
                    i = 2;
                }
                jVar3.mo96277m(i);
                if (!this.f299794j) {
                    ((C107759j) this.f299791g.mo27525b()).mo96267c((Query) null);
                }
            }
        }
        if (icVar.mo80754a(25)) {
            C88477c f2 = this.f299790f.mo80447f();
            C83611a aVar = (C83611a) C83652d.f228026e.createBuilder();
            long c = this.f299790f.mo80445c();
            aVar.copyOnWrite();
            C83652d dVar2 = (C83652d) aVar.instance;
            dVar2.f228028a |= 1;
            dVar2.f228029b = c;
            amo amo = this.f299790f.mo80446e().f236951d;
            aVar.copyOnWrite();
            C83652d dVar3 = (C83652d) aVar.instance;
            dVar3.f228030c = amo.f159234au;
            dVar3.f228028a |= 2;
            C83638b bVar2 = (C83638b) C83651c.f228021d.createBuilder();
            long a3 = f2.mo81991a();
            bVar2.copyOnWrite();
            C83651c cVar = (C83651c) bVar2.instance;
            cVar.f228023a = 1 | cVar.f228023a;
            cVar.f228024b = a3;
            String b = f2.mo81992b();
            bVar2.copyOnWrite();
            C83651c cVar2 = (C83651c) bVar2.instance;
            b.getClass();
            cVar2.f228023a |= 2;
            cVar2.f228025c = b;
            C83651c cVar3 = (C83651c) bVar2.build();
            aVar.copyOnWrite();
            C83652d dVar4 = (C83652d) aVar.instance;
            cVar3.getClass();
            dVar4.f228031d = cVar3;
            dVar4.f228028a |= 4;
            ((C106221b) this.f299792h.mo27525b()).mo95443a((C83652d) aVar.build());
        }
    }
}

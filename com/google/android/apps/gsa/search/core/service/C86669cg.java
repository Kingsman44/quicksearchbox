package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.p6877t.C87175c;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86679b;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.search.core.service.p6848e.C86684f;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6848e.C86687i;
import com.google.android.apps.gsa.search.core.service.p6848e.C86688j;
import com.google.android.apps.gsa.search.core.service.p6848e.C86691m;
import com.google.android.apps.gsa.search.core.service.p6848e.C86693o;
import com.google.android.apps.gsa.search.core.service.p6848e.C86694p;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86678c;
import com.google.android.apps.gsa.search.core.service.p6848e.p6850b.C86680a;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88397b;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C89968ag;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58334be;
import com.google.common.p4522b.C58458fu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.service.cg */
/* compiled from: PG */
public final class C86669cg implements C86695q, C91007g {

    /* renamed from: a */
    public static final C59071e f234137a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.cg");

    /* renamed from: b */
    public final C86694p f234138b;

    /* renamed from: c */
    public final C58833ax f234139c;

    /* renamed from: d */
    public final C68214a f234140d;

    /* renamed from: e */
    final C58334be f234141e = new C58458fu(16);

    /* renamed from: f */
    final C58334be f234142f = new C58458fu(16);

    /* renamed from: g */
    private final C86688j f234143g;

    /* renamed from: h */
    private final C68214a f234144h;

    /* renamed from: i */
    private final C22871g f234145i;

    /* renamed from: j */
    private final C68214a f234146j;

    public C86669cg(C86688j jVar, C68214a aVar, C68214a aVar2, C22871g gVar, C86694p pVar, C58833ax axVar, C68214a aVar3) {
        this.f234143g = jVar;
        this.f234144h = aVar;
        this.f234146j = aVar2;
        this.f234145i = gVar;
        this.f234138b = pVar;
        this.f234139c = axVar;
        this.f234140d = aVar3;
    }

    /* renamed from: a */
    public final long mo80267a() {
        return ((C87175c) this.f234144h.mo27525b()).f235575a.incrementAndGet();
    }

    /* renamed from: b */
    public final C86684f mo80268b(long j, String str) {
        C58976aa aaVar = C58975e.f156826a;
        C86688j jVar = this.f234143g;
        C86679b bVar = new C86679b();
        C86683e eVar = new C86683e();
        C86678c cVar = new C86678c(jVar.f234172b);
        C69464a aVar = (C69464a) jVar.f234171a.get(str);
        if (aVar != null) {
            C86686h a = ((C86687i) aVar.mo17428b()).mo80300a(new C86691m(j, bVar, eVar, cVar));
            C21370a aVar2 = jVar.f234173c;
            C90476a aVar3 = jVar.f234174d;
            C89911f fVar = jVar.f234175e;
            C88397b bVar2 = jVar.f234176f;
            return new C86684f(a, bVar, eVar, cVar, str, aVar2, fVar, jVar.f234177g, jVar.f234178h);
        }
        throw new C86693o(str);
    }

    /* renamed from: c */
    public final void mo80269c(long j) {
        C22872h.m42742b(C86593a.class);
        C58976aa aaVar = C58975e.f156826a;
        C86684f fVar = (C86684f) this.f234141e.get(Long.valueOf(j));
        if (fVar != null && this.f234142f.containsValue(fVar)) {
            C59104x d = f234137a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SessionLifecycleManager");
            ((C59052c) ((C59052c) d).mo56372aa(8469)).mo56388r("Attempting to destroy session %d that has a primary client", j);
        } else if (fVar != null) {
            mo80270e((C86775r) null, fVar);
        }
    }

    /* renamed from: e */
    public final void mo80270e(C86775r rVar, C86684f fVar) {
        if (fVar != null) {
            if (rVar != null) {
                rVar.f234397s = null;
            }
            mo80273h(fVar);
            C86694p pVar = this.f234138b;
            if (pVar.f234188b == fVar) {
                pVar.f234188b = null;
                pVar.f234187a.notifyObservers(C86694p.m139653a((C86684f) null));
            }
        }
        this.f234141e.mo55027e().remove(fVar);
        this.f234142f.mo55027e().remove(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo80271f(C86775r rVar) {
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90884s(rVar.f234392n, "Only started clients can be activated");
        C86684f fVar = rVar.f234397s;
        C58838bb.m90866a(fVar, "SessionContainer shouldn't be null at this point");
        rVar.f234387i = true;
        mo80274i(rVar, fVar);
        this.f234138b.mo80302b(fVar);
        fVar.mo80289a("#onNewClient");
        fVar.mo80290b("#onNewClient");
        fVar.f234159b.f234155a = rVar.f234384f;
        fVar.f234160c.f234157a = rVar.f234383e;
        fVar.f234158a.mo80296i(rVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo80272g(C86775r rVar) {
        C58976aa aaVar = C58975e.f156826a;
        rVar.f234387i = false;
        C86684f fVar = rVar.f234397s;
        if (fVar != null) {
            boolean z = rVar.f234393o;
            Long l = fVar.f234164g;
            fVar.mo80289a("#onClientDeactivated");
            fVar.mo80290b("#onClientDeactivated");
            fVar.f234158a.mo80294g(z);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SessionLifecycleManager");
        for (C86684f n : this.f234141e.mo55028h()) {
            fVar.mo85287n(n);
        }
    }

    /* renamed from: h */
    public final void mo80273h(C86684f fVar) {
        C58833ax axVar;
        if (this.f234139c.mo56113h()) {
            C86686h hVar = fVar.f234158a;
            Long l = fVar.f234164g;
            fVar.mo80289a("#getDataToSave");
            fVar.mo80290b("#getDataToSave");
            C88432bc bcVar = (C88432bc) C88433bd.f239087e.createBuilder();
            if (!fVar.f234158a.mo80299l()) {
                axVar = C58836b.f156633a;
            } else {
                Long l2 = fVar.f234164g;
                l2.getClass();
                long longValue = l2.longValue();
                bcVar.copyOnWrite();
                C88433bd bdVar = (C88433bd) bcVar.instance;
                bdVar.f239089a |= 1;
                bdVar.f239090b = longValue;
                String str = fVar.f234163f;
                bcVar.copyOnWrite();
                C88433bd bdVar2 = (C88433bd) bcVar.instance;
                str.getClass();
                bdVar2.f239089a |= 4;
                bdVar2.f239092d = str;
                axVar = C58833ax.m90834k(bcVar);
            }
            if (axVar.mo56113h()) {
                C88432bc bcVar2 = (C88432bc) axVar.mo56107c();
                int intValue = ((Integer) this.f234146j.mo27525b()).intValue();
                bcVar2.copyOnWrite();
                C88433bd bdVar3 = (C88433bd) bcVar2.instance;
                bdVar3.f239089a |= 2;
                bdVar3.f239091c = intValue;
                ((C86680a) ((C68214a) this.f234139c.mo56107c()).mo27525b()).mo80286c((C88433bd) bcVar2.build());
            }
        }
        C86686h hVar2 = fVar.f234158a;
        Long l3 = fVar.f234164g;
        fVar.mo80289a("#onDestroy");
        fVar.mo80290b("#onDestroy");
        fVar.f234164g = -1L;
        fVar.f234158a.mo80295h();
        fVar.f234166i = true;
    }

    /* renamed from: i */
    public final void mo80274i(C86775r rVar, C86684f fVar) {
        ((C58458fu) this.f234142f).mo55338d(Long.valueOf(rVar.f234381c), fVar, true);
    }

    /* renamed from: j */
    public final void mo80275j(String str, C88431bb bbVar) {
        C58976aa aaVar = C58975e.f156826a;
        long a = mo80267a();
        C86684f b = mo80268b(a, str);
        if (C22872h.m42744d(C86593a.class)) {
            mo80276k(b, a, bbVar, C58836b.f156633a, false);
            return;
        }
        this.f234145i.mo28212l("SessionLifecycleManager [start session]", new C86668cf(this, b, a, bbVar));
    }

    /* renamed from: k */
    public final void mo80276k(C86684f fVar, long j, C88431bb bbVar, C58833ax axVar, boolean z) {
        C58334be beVar = this.f234141e;
        Long valueOf = Long.valueOf(j);
        ((C58458fu) beVar).mo55338d(valueOf, fVar, false);
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            this.f234138b.mo80302b(fVar);
        }
        if (bbVar == null) {
            bbVar = C88431bb.f239082a;
        }
        if (fVar.f234167j.mo79746e(C89968ag.f246517q)) {
            C62940bt r9 = C62942bv.checkIsLite(C38346a.f101532a);
            bbVar.mo58887l(r9);
            if (bbVar.f169962ag.mo58857o(r9.f169971d)) {
                C86684f.m139627c(fVar.f234163f, fVar.f234158a);
            }
        }
        fVar.f234164g = valueOf;
        C58838bb.m90887v(!fVar.f234165h, "Session with sessionId = %s is already started", fVar.f234164g);
        fVar.f234158a.mo80297j(j, bbVar, axVar);
        fVar.f234165h = true;
    }

    /* renamed from: l */
    public final boolean mo80277l(C86775r rVar) {
        if (!BitFlags.m148144f(rVar.f234384f.f236949b.f253762b, 562949953421312L)) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return true;
    }
}

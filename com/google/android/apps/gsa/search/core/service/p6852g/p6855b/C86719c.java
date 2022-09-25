package com.google.android.apps.gsa.search.core.service.p6852g.p6855b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6852g.C86699a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86723c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86725e;
import com.google.android.apps.gsa.search.core.service.p6852g.p6853a.C86706d;
import com.google.android.apps.gsa.shared.p7066m.C90111fi;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.b.c */
/* compiled from: PG */
public final class C86719c implements C86723c {

    /* renamed from: b */
    private static final C59071e f234248b = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.g.b.c");

    /* renamed from: a */
    public final Set f234249a = C58758qx.m90653k();

    /* renamed from: c */
    private final C58495hd f234250c;

    /* renamed from: d */
    private final C21370a f234251d;

    /* renamed from: e */
    private final C86124t f234252e;

    /* renamed from: f */
    private final C90931ca f234253f;

    /* renamed from: g */
    private final C68214a f234254g;

    /* renamed from: h */
    private C86725e f234255h = C86725e.m139700c(C86724d.IDLE);

    public C86719c(C90931ca caVar, C21370a aVar, C86124t tVar, C68214a aVar2) {
        this.f234253f = caVar;
        this.f234251d = aVar;
        this.f234252e = tVar;
        C58495hd r = tVar.mo79752r(C90111fi.f250722b);
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : r.entrySet()) {
            try {
                gzVar.mo55429h(C86724d.m139698a((String) entry.getKey()), Long.valueOf(Long.decode((String) entry.getValue()).longValue()));
            } catch (IllegalArgumentException unused) {
                C59104x c = f234248b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "UserAdvocateImpl");
                ((C59052c) ((C59052c) c).mo56372aa(8525)).mo56389s("Invalid UserScenario: %s", entry.getKey());
            }
        }
        this.f234250c = gzVar.mo55427f(false);
        this.f234254g = aVar2;
    }

    /* renamed from: f */
    private final synchronized C86725e m139686f() {
        C86725e eVar;
        eVar = ((C86722f) this.f234254g.mo27525b()).f234259b.f234274a;
        C58976aa aaVar = C58975e.f156826a;
        return eVar;
    }

    /* renamed from: g */
    private final synchronized void m139687g(C86725e eVar) {
        long j;
        C86724d dVar = ((C86699a) eVar).f234194a;
        if (this.f234250c.containsKey(dVar)) {
            j = ((Long) this.f234250c.get(dVar)).longValue();
        } else {
            j = dVar.f234272h;
        }
        this.f234253f.mo85137b(new C86717a(this, eVar), Long.valueOf(j).longValue());
    }

    /* renamed from: h */
    private final synchronized void m139688h(C86725e eVar) {
        if (!this.f234255h.equals(eVar)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f234255h = eVar;
            this.f234253f.mo85139d(new C86718b(this, "Notify listeners for the change in UserScenario, new scenario = ".concat(String.valueOf(String.valueOf(((C86699a) eVar).f234194a)))));
            if (((C86699a) eVar).f234194a != C86724d.IDLE) {
                m139687g(eVar);
            }
        }
    }

    /* renamed from: a */
    public final synchronized C86724d mo80329a() {
        mo80330b();
        return ((C86699a) this.f234255h).f234194a;
    }

    /* renamed from: b */
    public final synchronized void mo80330b() {
        C86725e f = m139686f();
        if (((C86699a) f).f234195b > ((C86699a) this.f234255h).f234195b) {
            m139688h(f);
        }
    }

    /* renamed from: c */
    public final void mo80331c(C86706d dVar) {
        this.f234249a.add(dVar);
    }

    /* renamed from: e */
    public final synchronized void mo80332e(C86725e eVar) {
        if (this.f234255h.equals(eVar)) {
            C58976aa aaVar = C58975e.f156826a;
            m139688h(new C86699a(C86724d.IDLE, this.f234251d.mo26871c()));
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("UserAdvocateImpl");
        synchronized (this) {
            fVar.mo85279c("mCurrentUserScenarioChange").mo85276a(C90752i.m148231e(this.f234255h));
        }
    }
}

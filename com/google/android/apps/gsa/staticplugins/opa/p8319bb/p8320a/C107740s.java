package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6491a.C84367m;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.C87023eq;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.search.core.state.C87140ih;
import com.google.android.apps.gsa.search.core.state.TtsState;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107555d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107508ab;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107509ac;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107510ad;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107850ab;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107851ac;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107852ad;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109455a;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113920x;
import com.google.android.libraries.gsa.p1864f.p1867b.C22814a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C59770f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.a.s */
/* compiled from: PG */
public final class C107740s implements C87138if {

    /* renamed from: d */
    private static final C87116hk f299795d = C86898ct.m140157al(50, 69, 52);

    /* renamed from: a */
    public final C87140ih f299796a;

    /* renamed from: b */
    public final Set f299797b = new HashSet();

    /* renamed from: c */
    public C107738q f299798c;

    /* renamed from: e */
    private final C87052fn f299799e;

    /* renamed from: f */
    private final C87023eq f299800f;

    /* renamed from: g */
    private final TtsState f299801g;

    /* renamed from: h */
    private final C68214a f299802h;

    /* renamed from: i */
    private final C68214a f299803i;

    /* renamed from: j */
    private final C113920x f299804j;

    /* renamed from: k */
    private Query f299805k = Query.f252741b;

    public C107740s(C87140ih ihVar, C87052fn fnVar, C87023eq eqVar, TtsState ttsState, C68214a aVar, C68214a aVar2, C113920x xVar) {
        this.f299796a = ihVar;
        this.f299799e = fnVar;
        this.f299800f = eqVar;
        this.f299801g = ttsState;
        this.f299802h = aVar;
        this.f299803i = aVar2;
        this.f299804j = xVar;
    }

    /* renamed from: c */
    private final void m178866c(int i) {
        C107555d dVar = (C107555d) C107556e.f299210c.createBuilder();
        dVar.copyOnWrite();
        C107556e eVar = (C107556e) dVar.instance;
        eVar.f299213b = i - 1;
        eVar.f299212a |= 1;
        C87684al alVar = new C87684al(C88244um.OPA_SESSION_SERVICE_EVENT);
        alVar.mo81965b(C107505a.f299120a, (C107556e) dVar.build());
        ((C107932g) this.f299803i.mo27525b()).mo96337a(alVar.mo81964a());
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return f299795d;
    }

    /* renamed from: b */
    public final void mo96265b(C107739r rVar) {
        this.f299797b.add(rVar);
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        C113919w wVar;
        C58833ax axVar;
        C86251f fVar;
        C107738q qVar;
        C87135ic icVar2 = icVar;
        C58976aa aaVar = C58975e.f156826a;
        Query query = this.f299799e.f235177m;
        if (query != null) {
            C113920x xVar = this.f299804j;
            long j = query.f252749G;
            long j2 = xVar.f315455b;
            xVar.f315455b = j;
        }
        if (icVar2.mo80754a(50) && query.mo84403cj() && !query.mo84397cd()) {
            if (!this.f299805k.mo84383cP(query)) {
                this.f299805k = query;
                if (query.mo84338bW() && query.mo84422dC() && !query.mo84412cs()) {
                    m178866c(8);
                }
                for (C107739r a : this.f299797b) {
                    a.mo96263a(query);
                }
            } else if (!this.f299805k.equals(query)) {
                this.f299805k = query;
                for (C107739r b : this.f299797b) {
                    b.mo96264b(query);
                }
            } else if (this.f299799e.mo80692M(query)) {
                m178866c(11);
            }
        }
        if (icVar2.mo80754a(69)) {
            if (this.f299800f.mo80640o(query)) {
                C87023eq eqVar = this.f299800f;
                C58838bb.m90869d(eqVar.mo80640o(query), "Trying to take result for a query which should be handled in the event bus.");
                if (!((C87052fn) eqVar.f235038c.mo27525b()).f235177m.mo84383cP(query) || eqVar.f235055t == null || eqVar.f235027H != 2) {
                    fVar = null;
                } else {
                    eqVar.f235027H = 4;
                    eqVar.mo80639n(!eqVar.f235037b.mo79746e(C90014bt.f247732mh) || !query.mo84393cZ() || !"and.opa.appinteg.youtube.mic".equals(query.mo84355bn()));
                    ((TtsState) eqVar.f235039d.mo27525b()).mo80413n(query);
                    C58838bb.m90869d(!((TtsState) eqVar.f235039d.mo27525b()).mo80421v(), "TtsState should release audio focus upon setDone().");
                    fVar = eqVar.f235055t;
                    if (fVar == null) {
                        throw null;
                    }
                }
                if (!(fVar == null || (qVar = this.f299798c) == null)) {
                    qVar.mo96262a(query, fVar);
                }
            }
            C87023eq eqVar2 = this.f299800f;
            byte[] bArr = eqVar2.f235059x;
            eqVar2.f235059x = null;
            if (bArr != null) {
                C107852ad adVar = (C107852ad) this.f299802h.mo27525b();
                if (!query.mo84457dk()) {
                    axVar = C58836b.f156633a;
                } else {
                    Query X = Query.f252741b.mo84244G(true).mo84302an("android.opa.extra.MINI_PLATE_ENABLED", true).mo84260X(query.mo84337bV());
                    String bf = query.mo84347bf("android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME");
                    if (!TextUtils.isEmpty(bf)) {
                        X = X.mo84278aO("android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME", bf);
                    }
                    if (query.mo84401ch()) {
                        X = X.mo84241D();
                    }
                    axVar = C58833ax.m90834k(new C84367m(X));
                }
                adVar.f300121b.mo77931a().mo77927i(C109455a.m182150a(bArr), axVar);
                new C90873ag(adVar.f300123d.mo78619c(), adVar.f300124e, "create OPA_KEEP_SCREEN_ON ServiceEventData", new C107850ab(adVar)).mo85223a(C107851ac.f300119a);
            }
            C87023eq eqVar3 = this.f299800f;
            C90456c cVar = eqVar3.f235048m;
            eqVar3.f235048m = null;
            if (cVar != null) {
                Query query2 = this.f299799e.f235177m;
                C107509ac acVar = (C107509ac) C107510ad.f299128e.createBuilder();
                C59753ej a2 = C22814a.m42629a(cVar.mo79843a(), cVar.mo79845c());
                acVar.copyOnWrite();
                C107510ad adVar2 = (C107510ad) acVar.instance;
                a2.getClass();
                adVar2.f299131b = a2;
                adVar2.f299130a |= 1;
                int b2 = cVar.mo79844b();
                acVar.copyOnWrite();
                C107510ad adVar3 = (C107510ad) acVar.instance;
                adVar3.f299130a |= 2;
                adVar3.f299132c = b2;
                List d = C90454b.m147154d(cVar);
                ArrayList arrayList = new ArrayList(d.size());
                int size = d.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    C90456c cVar2 = (C90456c) d.get(size);
                    C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
                    int b3 = cVar2.mo79844b();
                    eVar.copyOnWrite();
                    C59770f fVar2 = (C59770f) eVar.instance;
                    fVar2.f161503a |= 1;
                    fVar2.f161504b = b3;
                    int a3 = cVar2.mo79843a();
                    eVar.copyOnWrite();
                    C59770f fVar3 = (C59770f) eVar.instance;
                    fVar3.f161503a |= 2;
                    fVar3.f161505c = a3;
                    arrayList.add((C59770f) eVar.build());
                }
                acVar.copyOnWrite();
                C107510ad adVar4 = (C107510ad) acVar.instance;
                C62971cq cqVar = adVar4.f299133d;
                if (!cqVar.mo58948c()) {
                    adVar4.f299133d = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) arrayList, (List) adVar4.f299133d);
                C107555d dVar = (C107555d) C107556e.f299210c.createBuilder();
                dVar.copyOnWrite();
                C107556e eVar2 = (C107556e) dVar.instance;
                eVar2.f299213b = 5;
                eVar2.f299212a = 1 | eVar2.f299212a;
                dVar.mo58885m(C107508ab.f299127a, (C107510ad) acVar.build());
                C87684al alVar = new C87684al(C88244um.OPA_SESSION_SERVICE_EVENT);
                alVar.mo81965b(C107505a.f299120a, (C107556e) dVar.build());
                alVar.mo81966c(query2);
                ((C107932g) this.f299803i.mo27525b()).mo96337a(alVar.mo81964a());
                long j3 = query.f252749G;
                int b4 = cVar.mo79844b();
                int a4 = cVar.mo79843a();
                int a5 = C90454b.m147151a(a4, b4);
                if (a5 == 3) {
                    this.f299804j.mo100774c(j3, C113919w.NO_CONNECTIVITY);
                } else if (a5 == 9) {
                    this.f299804j.mo100774c(j3, C113919w.UNRELIABLE_NETWORK);
                } else if (b4 == 211) {
                    C113920x xVar2 = this.f299804j;
                    if (a4 == 524289) {
                        wVar = C113919w.RECOGNITION_ERROR;
                    } else {
                        wVar = C113919w.GENERIC_GSA_ERROR;
                    }
                    xVar2.mo100774c(j3, wVar);
                } else if (b4 == 212) {
                    this.f299804j.mo100774c(j3, C113919w.SERVER_ERROR);
                } else if (b4 != 216) {
                    this.f299804j.mo100774c(j3, C113919w.GENERIC_ERROR);
                } else {
                    this.f299804j.mo100774c(j3, C113919w.S3_ERROR);
                }
            }
        }
        if (icVar2.mo80754a(52) && this.f299801g.f234427h != null) {
            m178866c(9);
        }
    }
}

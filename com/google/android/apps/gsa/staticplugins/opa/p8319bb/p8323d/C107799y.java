package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6544al.C84701a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86244c;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88041mz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88043na;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88044nb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88099pc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88100pd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88101pe;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107738q;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107740s;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107761l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3917i.p3918a.C51481jh;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.y */
/* compiled from: PG */
public final class C107799y implements C107738q {

    /* renamed from: a */
    public final C107740s f299951a;

    /* renamed from: b */
    public final C107733l f299952b;

    /* renamed from: c */
    public final C107932g f299953c;

    /* renamed from: d */
    public final C22871g f299954d;

    /* renamed from: e */
    public final C22871g f299955e;

    /* renamed from: f */
    public final C107779e f299956f;

    /* renamed from: g */
    public final C107787m f299957g;

    /* renamed from: h */
    public final C107773ai f299958h;

    /* renamed from: i */
    public final C84809b f299959i;

    /* renamed from: j */
    public final C87541c f299960j;

    /* renamed from: k */
    public final C107781g f299961k;

    /* renamed from: l */
    public final C86124t f299962l;

    /* renamed from: m */
    public final C84701a f299963m;

    /* renamed from: n */
    public final C107761l f299964n;

    /* renamed from: o */
    private final Object f299965o = new Object();

    /* renamed from: p */
    private final C85005h f299966p;

    /* renamed from: q */
    private C60870cx f299967q = C118826c.f331423b;

    public C107799y(C107740s sVar, C107733l lVar, C107932g gVar, C22871g gVar2, C22871g gVar3, C107779e eVar, C107787m mVar, C107773ai aiVar, C85005h hVar, C84809b bVar, C87541c cVar, C107781g gVar4, C86124t tVar, C84701a aVar, C107761l lVar2) {
        this.f299951a = sVar;
        this.f299952b = lVar;
        this.f299953c = gVar;
        this.f299954d = gVar2;
        this.f299955e = gVar3;
        this.f299956f = eVar;
        this.f299957g = mVar;
        this.f299958h = aiVar;
        this.f299966p = hVar;
        this.f299959i = bVar;
        this.f299960j = cVar;
        this.f299961k = gVar4;
        this.f299962l = tVar;
        this.f299963m = aVar;
        this.f299964n = lVar2;
    }

    /* renamed from: b */
    public static C58833ax m178977b(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if ("asst.conversation_ongoing_state_params".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.ConversationOngoingStateParam".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        return C58833ax.m90834k((C51481jh) C62942bv.parseFrom((C62942bv) C51481jh.f134137e, kaVar2.f137061c));
                    } catch (C62974ct unused) {
                        return C58836b.f156633a;
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: f */
    public static boolean m178978f(C51195j jVar) {
        C52081en enVar = jVar.f133275j;
        if (enVar == null) {
            enVar = C52081en.f136679i;
        }
        if ((enVar.f136681a & 16) != 0) {
            C52081en enVar2 = jVar.f133275j;
            if (enVar2 == null) {
                enVar2 = C52081en.f136679i;
            }
            C52091ex exVar = enVar2.f136685e;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            C58833ax b = m178977b(exVar);
            if (!b.mo56113h() || !((C51481jh) b.mo56107c()).f134140b) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo96262a(Query query, C86251f fVar) {
        if (query.mo84393cZ()) {
            C107773ai aiVar = this.f299958h;
            C22872h.m42743c(C86593a.class);
            aiVar.mo96279a(query);
            aiVar.f299885e.mo28211k(fVar.f233149h, "Get original query", new C107771ag(aiVar, fVar));
        }
        this.f299954d.mo28209i(C60922j.m93044g(fVar.f233146e, new C86244c(fVar), C60826bg.f164896a), "srp metadata", new C107794t(this));
        this.f299954d.mo28209i(fVar.f233144c, "action data optional", new C107795u(query));
        mo96285c();
        C60870cx j = this.f299955e.mo28210j(fVar.f233152k, "assistant response type", new C107797w(this, query, fVar));
        synchronized (this.f299965o) {
            this.f299967q = j;
        }
        this.f299954d.mo28209i(fVar.f233146e, "Done future", new C107793s(this, query));
    }

    /* renamed from: c */
    public final void mo96285c() {
        synchronized (this.f299965o) {
            this.f299967q.cancel(true);
        }
    }

    /* renamed from: d */
    public final void mo96286d(boolean z) {
        C107932g gVar = this.f299953c;
        C87684al alVar = new C87684al(C88244um.NOTIFY_ASSISTANT_CONVERSATION_ONGOING);
        C62940bt btVar = C88099pc.f238189a;
        C88100pd pdVar = (C88100pd) C88101pe.f238190c.createBuilder();
        pdVar.copyOnWrite();
        C88101pe peVar = (C88101pe) pdVar.instance;
        peVar.f238192a |= 1;
        peVar.f238193b = z;
        alVar.mo81965b(btVar, (C88101pe) pdVar.build());
        gVar.mo96337a(alVar.mo81964a());
    }

    /* renamed from: e */
    public final void mo96287e(C51195j jVar, Query query) {
        this.f299966p.mo78641z(jVar, query);
        C87684al alVar = new C87684al(C88244um.NEW_ASSISTANT_RESPONSE_RECEIVED);
        C62940bt btVar = C88041mz.f238074a;
        C88043na naVar = (C88043na) C88044nb.f238075c.createBuilder();
        naVar.copyOnWrite();
        C88044nb nbVar = (C88044nb) naVar.instance;
        jVar.getClass();
        nbVar.f238078b = jVar;
        nbVar.f238077a |= 1;
        alVar.mo81965b(btVar, (C88044nb) naVar.build());
        alVar.mo81966c(query);
        this.f299953c.mo96337a(alVar.mo81964a());
    }
}

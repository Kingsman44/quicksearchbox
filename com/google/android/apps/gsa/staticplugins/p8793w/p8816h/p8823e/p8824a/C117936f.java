package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import com.google.android.apps.gsa.binaries.satin.app.C74081ip;
import com.google.android.apps.gsa.binaries.satin.app.ir;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.service.p6848e.C86679b;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C118024cn;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C118027cq;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.f */
/* compiled from: PG */
public final class C117936f {

    /* renamed from: a */
    public C58817ah f327337a;

    /* renamed from: b */
    private final C86124t f327338b;

    /* renamed from: c */
    private final C86679b f327339c;

    /* renamed from: d */
    private final C89859i f327340d;

    /* renamed from: e */
    private final C118024cn f327341e;

    /* renamed from: f */
    private final C118027cq f327342f;

    /* renamed from: g */
    private final C84466a f327343g;

    /* renamed from: h */
    private final C74081ip f327344h;

    public C117936f(C86124t tVar, C84466a aVar, C74081ip ipVar, C86679b bVar, C89859i iVar, C118024cn cnVar, C118027cq cqVar) {
        this.f327338b = tVar;
        this.f327343g = aVar;
        this.f327344h = ipVar;
        this.f327339c = bVar;
        this.f327340d = iVar;
        this.f327341e = cnVar;
        this.f327342f = cqVar;
    }

    /* renamed from: a */
    public final void mo103484a(Query query) {
        if (query.f252760R == null) {
            this.f327339c.mo80283a();
            query = query.mo84272aI(this.f327339c.mo80283a().f236951d);
        }
        if (this.f327338b.mo79746e(C90086ek.f250467dg)) {
            C87684al alVar = new C87684al(C88244um.ASSISTANT_REQUEST_ID);
            alVar.mo81966c(query);
            this.f327342f.mo103503e(alVar.mo81964a());
        }
        C86251f fVar = new C86251f();
        C89356b b = this.f327343g.mo78026b("CarAssistantTextSearchGraph", C118575h.GRAPH_CAR_ASSISTANT_TEXT_SEARCH, C118575h.GRAPH_CAR_ASSISTANT_TEXT_SEARCH);
        C89859i iVar = this.f327340d;
        C89856f fVar2 = new C89856f();
        fVar2.f246201a = C89849ae.ASSISTANT_AUTO_TEXT_SEARCH_START;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String valueOf = String.valueOf(query.f252749G);
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        valueOf.getClass();
        cbVar.f160062a |= 4;
        cbVar.f160127h = valueOf;
        fVar2.f246203c = (C59687cb) ajVar.build();
        iVar.mo74236a(fVar2.mo83699a());
        C74081ip ipVar = this.f327344h;
        ipVar.f206376e = b;
        ipVar.f206375d = "assistant-voiceless";
        query.getClass();
        ipVar.f206377f = query;
        ipVar.f206378g = fVar;
        ipVar.f206379h = Long.valueOf(this.f327338b.mo79743a(C90114fl.f250731e));
        ipVar.f206380i = this.f327339c.mo80283a();
        C68225k.m98529a(ipVar.f206375d, String.class);
        C68225k.m98529a(ipVar.f206376e, C89356b.class);
        C68225k.m98529a(ipVar.f206377f, Query.class);
        C68225k.m98529a(ipVar.f206378g, C86251f.class);
        C68225k.m98529a(ipVar.f206379h, Long.class);
        C68225k.m98529a(ipVar.f206380i, ClientConfig.class);
        C60870cx gq = new ir(ipVar.f206372a, ipVar.f206373b, ipVar.f206374c, ipVar.f206375d, ipVar.f206376e, ipVar.f206377f, ipVar.f206378g, ipVar.f206379h, ipVar.f206380i).d.mo60297gq();
        this.f327341e.mo103497c(gq, query);
        this.f327337a = new C117935e(gq, b);
    }
}

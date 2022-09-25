package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.w */
/* compiled from: PG */
public final /* synthetic */ class C107797w implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107799y f299947a;

    /* renamed from: b */
    public final /* synthetic */ Query f299948b;

    /* renamed from: c */
    public final /* synthetic */ C86251f f299949c;

    public /* synthetic */ C107797w(C107799y yVar, Query query, C86251f fVar) {
        this.f299947a = yVar;
        this.f299948b = query;
        this.f299949c = fVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107799y yVar = this.f299947a;
        Query query = this.f299948b;
        C86251f fVar = this.f299949c;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56111f() == C86253h.CONVERSATION_DELTA) {
            yVar.f299959i.mo78497q(yVar.f299960j);
            C107779e eVar = yVar.f299956f;
            SettableFuture settableFuture = fVar.f233147f;
            C58976aa aaVar = C58975e.f156826a;
            C87684al alVar = new C87684al(C88244um.ASSISTANT_REQUEST_ID);
            alVar.mo81966c(query);
            eVar.f299901b.mo96337a(alVar.mo81964a());
            eVar.f299905f.mo83702b(C89849ae.OPA_CCL_RECEIVED_CONVERSATION_DELTA);
            SettableFuture settableFuture2 = fVar.f233143b;
            settableFuture2.mo4106b(new C107778d(eVar, settableFuture2, query), C60826bg.f164896a);
            C60870cx p = eVar.f299904e.mo78631p(fVar.f233151j);
            eVar.f299902c.mo77931a().mo77923e(C60922j.m93044g(fVar.f233143b, new C107776b(eVar, query), C60826bg.f164896a), eVar.f299903d.mo78369a(fVar.f233151j), C58833ax.m90834k(new C84349ah(query)), ((C58833ax) C90877ak.m148475i(fVar.f233143b, C58836b.f156633a)).mo56106b(C107777c.f299896a), settableFuture, C60856cj.m92900i(fVar.mo79945a()));
            return C60856cj.m92893b(p, yVar.f299954d.mo28209i(fVar.f233143b, "assistant response", new C107790p(yVar, query))).mo57334a(C47810es.m84978r(C107791q.f299937a), C60826bg.f164896a);
        } else if (axVar.mo56111f() == C86253h.LEGACY_ASSISTANT_RESPONSE) {
            C107733l lVar = yVar.f299952b;
            C58976aa aaVar2 = C58975e.f156826a;
            lVar.mo96260h(false);
            yVar.f299959i.mo78497q(yVar.f299960j);
            return yVar.f299955e.mo28209i(fVar.f233143b, "assistant response", new C107796v(yVar, query, fVar));
        } else if (axVar.mo56113h()) {
            return C118826c.f331423b;
        } else {
            C107733l lVar2 = yVar.f299952b;
            C58976aa aaVar3 = C58975e.f156826a;
            lVar2.mo96260h(false);
            return yVar.f299955e.mo28209i(fVar.f233148g, "search error future", new C107792r(yVar, query));
        }
    }
}

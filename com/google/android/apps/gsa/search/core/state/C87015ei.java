package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88041mz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88043na;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88044nb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.search.core.state.ei */
/* compiled from: PG */
public final /* synthetic */ class C87015ei implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87023eq f235005a;

    /* renamed from: b */
    public final /* synthetic */ Query f235006b;

    public /* synthetic */ C87015ei(C87023eq eqVar, Query query) {
        this.f235005a = eqVar;
        this.f235006b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C51195j jVar;
        C87023eq eqVar = this.f235005a;
        Query query = this.f235006b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && axVar.mo56107c() != null && eqVar.f235047l != (jVar = (C51195j) axVar.mo56107c()) && jVar != null) {
            eqVar.f235047l = jVar;
            eqVar.f235026G = 2;
            eqVar.mo80591ar();
            eqVar.f235043h.mo78641z(jVar, query);
            C85005h hVar = eqVar.f235043h;
            C87684al alVar = new C87684al(C88244um.NEW_ASSISTANT_RESPONSE_RECEIVED);
            C62940bt btVar = C88041mz.f238074a;
            C88043na naVar = (C88043na) C88044nb.f238075c.createBuilder();
            naVar.copyOnWrite();
            C88044nb nbVar = (C88044nb) naVar.instance;
            nbVar.f238078b = jVar;
            nbVar.f238077a |= 1;
            alVar.mo81965b(btVar, (C88044nb) naVar.build());
            alVar.mo81966c(query);
            hVar.mo78609E(alVar.mo81964a());
            eqVar.mo80633e(query);
        }
    }
}

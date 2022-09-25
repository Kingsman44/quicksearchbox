package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107728g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.s */
/* compiled from: PG */
public final /* synthetic */ class C107793s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107799y f299940a;

    /* renamed from: b */
    public final /* synthetic */ Query f299941b;

    public /* synthetic */ C107793s(C107799y yVar, Query query) {
        this.f299940a = yVar;
        this.f299941b = query;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107799y yVar = this.f299940a;
        Query query = this.f299941b;
        C118826c cVar = (C118826c) obj;
        C107733l lVar = yVar.f299952b;
        C58976aa aaVar = C58975e.f156826a;
        if (C22872h.m42744d(C86593a.class)) {
            lVar.f299774a.mo80717v(query);
        } else {
            lVar.f299775b.mo28212l("GlobalEventBusAccessor#onVoiceSearchResultsDone", new C107728g(lVar, query));
        }
        yVar.f299953c.mo96337a(new C87684al(C88244um.VOICE_SEARCH_DONE).mo81964a());
        return C118826c.f331422a;
    }
}

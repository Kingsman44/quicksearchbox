package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.service.p6859i.p6860a.C86750a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.state.fi */
/* compiled from: PG */
public final /* synthetic */ class C87047fi implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87052fn f235130a;

    /* renamed from: b */
    public final /* synthetic */ Query f235131b;

    public /* synthetic */ C87047fi(C87052fn fnVar, Query query) {
        this.f235130a = fnVar;
        this.f235131b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87052fn fnVar = this.f235130a;
        Query query = this.f235131b;
        C59104x c = C87052fn.f235141a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "QueryState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((C86750a) obj)).mo56372aa(8804)).mo56386p("SearchboxWork fillRootStatsAndAddProtoToQuery failed because the worker wasn't found.");
        fnVar.mo80462q(query);
    }
}

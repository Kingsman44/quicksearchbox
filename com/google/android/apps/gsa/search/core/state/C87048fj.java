package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.state.fj */
/* compiled from: PG */
public final /* synthetic */ class C87048fj implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87052fn f235132a;

    /* renamed from: b */
    public final /* synthetic */ Query f235133b;

    public /* synthetic */ C87048fj(C87052fn fnVar, Query query) {
        this.f235132a = fnVar;
        this.f235133b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87052fn fnVar = this.f235132a;
        Query query = this.f235133b;
        C59104x c = C87052fn.f235141a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "QueryState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(8805)).mo56386p("SearchboxWork fillRootStatsAndAddProtoToQuery failed.");
        fnVar.mo80462q(query);
    }
}

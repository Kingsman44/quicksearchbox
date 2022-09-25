package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gc */
/* compiled from: PG */
public final /* synthetic */ class C116727gc implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116735gk f323719a;

    /* renamed from: b */
    public final /* synthetic */ Query f323720b;

    public /* synthetic */ C116727gc(C116735gk gkVar, Query query) {
        this.f323719a = gkVar;
        this.f323720b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116735gk gkVar = this.f323719a;
        Query query = this.f323720b;
        C59104x c = C116735gk.f323734a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "S_QueryState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(32129)).mo56386p("SearchboxWork fillRootStatsAndAddProtoToQuery failed.");
        gkVar.mo80462q(query);
    }
}

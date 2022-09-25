package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.service.p6859i.p6860a.C86750a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gb */
/* compiled from: PG */
public final /* synthetic */ class C116726gb implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116735gk f323717a;

    /* renamed from: b */
    public final /* synthetic */ Query f323718b;

    public /* synthetic */ C116726gb(C116735gk gkVar, Query query) {
        this.f323717a = gkVar;
        this.f323718b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116735gk gkVar = this.f323717a;
        Query query = this.f323718b;
        C59104x c = C116735gk.f323734a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "S_QueryState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((C86750a) obj)).mo56372aa(32128)).mo56386p("SearchboxWork fillRootStatsAndAddProtoToQuery failed because the worker wasn't found.");
        gkVar.mo80462q(query);
    }
}

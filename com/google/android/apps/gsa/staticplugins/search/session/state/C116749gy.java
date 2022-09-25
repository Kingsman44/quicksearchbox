package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gy */
/* compiled from: PG */
public final /* synthetic */ class C116749gy implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116755hd f323843a;

    /* renamed from: b */
    public final /* synthetic */ Query f323844b;

    public /* synthetic */ C116749gy(C116755hd hdVar, Query query) {
        this.f323843a = hdVar;
        this.f323844b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116755hd hdVar = this.f323843a;
        Query query = this.f323844b;
        Exception exc = (Exception) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (query != null) {
            ((C116735gk) hdVar.f323872e.mo27525b()).mo80462q(query);
            hdVar.mo80591ar();
        }
    }
}

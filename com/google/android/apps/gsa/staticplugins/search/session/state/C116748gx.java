package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gx */
/* compiled from: PG */
public final /* synthetic */ class C116748gx implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116755hd f323841a;

    /* renamed from: b */
    public final /* synthetic */ Query f323842b;

    public /* synthetic */ C116748gx(C116755hd hdVar, Query query) {
        this.f323841a = hdVar;
        this.f323842b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116755hd hdVar = this.f323841a;
        Query query = this.f323842b;
        if (((Boolean) obj).booleanValue()) {
            new C90873ag(hdVar.f323878k.mo78628l(query), hdVar.f323879l, "Attempts to start OPA for voice search", new C116746gv(hdVar)).mo85223a(new C116747gw(hdVar, query));
        } else if (query != null) {
            ((C116735gk) hdVar.f323872e.mo27525b()).mo80462q(query);
            hdVar.mo80591ar();
        }
    }
}

package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.search.core.state.gd */
/* compiled from: PG */
public final /* synthetic */ class C87081gd implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87085gh f235295a;

    /* renamed from: b */
    public final /* synthetic */ Query f235296b;

    public /* synthetic */ C87081gd(C87085gh ghVar, Query query) {
        this.f235295a = ghVar;
        this.f235296b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87085gh ghVar = this.f235295a;
        Query query = this.f235296b;
        C58833ax axVar = (C58833ax) obj;
        if (((C87052fn) ghVar.f235302b.mo27525b()).f235177m.mo84383cP(query)) {
            ((C86903cy) ghVar.f235305e.mo27525b()).mo80563e(query, axVar);
            ((C86903cy) ghVar.f235305e.mo27525b()).mo80591ar();
        }
    }
}

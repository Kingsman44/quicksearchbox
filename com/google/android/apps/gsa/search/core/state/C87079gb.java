package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.search.core.state.gb */
/* compiled from: PG */
public final /* synthetic */ class C87079gb implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87085gh f235292a;

    /* renamed from: b */
    public final /* synthetic */ Query f235293b;

    public /* synthetic */ C87079gb(C87085gh ghVar, Query query) {
        this.f235292a = ghVar;
        this.f235293b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87085gh ghVar = this.f235292a;
        Query query = this.f235293b;
        C58833ax axVar = (C58833ax) obj;
        if (((C87052fn) ghVar.f235302b.mo27525b()).f235177m.mo84383cP(query)) {
            ((C87052fn) ghVar.f235302b.mo27525b()).mo80719y(query, axVar);
            ((C87052fn) ghVar.f235302b.mo27525b()).mo80591ar();
        }
    }
}

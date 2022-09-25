package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.state.ea */
/* compiled from: PG */
public final /* synthetic */ class C87007ea implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87023eq f234988a;

    /* renamed from: b */
    public final /* synthetic */ Query f234989b;

    /* renamed from: c */
    public final /* synthetic */ SearchError f234990c;

    public /* synthetic */ C87007ea(C87023eq eqVar, Query query, SearchError searchError) {
        this.f234988a = eqVar;
        this.f234989b = query;
        this.f234990c = searchError;
    }

    public final void run() {
        C87023eq eqVar = this.f234988a;
        Query query = this.f234989b;
        SearchError searchError = this.f234990c;
        eqVar.f235027H = 3;
        ((C87052fn) eqVar.f235038c.mo27525b()).mo80714s(query, searchError);
    }
}

package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.state.ee */
/* compiled from: PG */
public final /* synthetic */ class C87011ee implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87023eq f234997a;

    /* renamed from: b */
    public final /* synthetic */ Query f234998b;

    /* renamed from: c */
    public final /* synthetic */ C22869e f234999c;

    public /* synthetic */ C87011ee(C87023eq eqVar, Query query, C22869e eVar) {
        this.f234997a = eqVar;
        this.f234998b = query;
        this.f234999c = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87023eq eqVar = this.f234997a;
        Query query = this.f234998b;
        C22869e eVar = this.f234999c;
        Boolean bool = (Boolean) obj;
        if (!((C87052fn) eqVar.f235038c.mo27525b()).f235177m.mo84383cP(query)) {
            return;
        }
        if (!bool.booleanValue()) {
            eVar.run();
        } else if (eqVar.f235027H == 1) {
            eqVar.f235027H = 2;
            eqVar.mo80591ar();
        }
    }
}

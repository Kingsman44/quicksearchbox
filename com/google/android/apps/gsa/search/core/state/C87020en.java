package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.core.state.en */
/* compiled from: PG */
final class C87020en implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C86232bo f235015a;

    /* renamed from: b */
    final /* synthetic */ C87023eq f235016b;

    public C87020en(C87023eq eqVar, C86232bo boVar) {
        this.f235016b = eqVar;
        this.f235015a = boVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C87023eq.f235022a.mo56225c()).mo56382g(th)).mo56372aa(8759)).mo56386p("Failed to get original query");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Query query;
        C58833ax axVar = (C58833ax) obj;
        if (axVar == null) {
            query = null;
        } else {
            query = (Query) axVar.mo56111f();
        }
        if (query != null && query != this.f235016b.f235057v && !query.mo84435dP()) {
            C87023eq eqVar = this.f235016b;
            eqVar.f235045j.mo28211k(this.f235015a.mo79877M(), "Set zero typing suggest", new C87021eo(eqVar, query));
        }
    }
}

package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.ag */
/* compiled from: PG */
final class C107771ag implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C86251f f299877a;

    /* renamed from: b */
    final /* synthetic */ C107773ai f299878b;

    public C107771ag(C107773ai aiVar, C86251f fVar) {
        this.f299878b = aiVar;
        this.f299877a = fVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C107773ai.f299881a.mo56225c()).mo56382g(th)).mo56372aa(26195)).mo56386p("Failed to get original query");
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
        if (query != null && !query.equals(this.f299878b.f299887g) && !query.mo84435dP()) {
            C107773ai aiVar = this.f299878b;
            aiVar.f299885e.mo28211k(this.f299877a.f233150i, "Get zero typing suggest", new C107772ah(aiVar, query));
        }
    }
}

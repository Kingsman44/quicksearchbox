package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.p395al.p417d.p418a.C8575bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.ah */
/* compiled from: PG */
final class C107772ah implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Query f299879a;

    /* renamed from: b */
    final /* synthetic */ C107773ai f299880b;

    public C107772ah(C107773ai aiVar, Query query) {
        this.f299880b = aiVar;
        this.f299879a = query;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C107773ai.f299881a.mo56225c()).mo56382g(th)).mo56372aa(26196)).mo56386p("Failed to get zero typing suggest");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C8575bc bcVar;
        C58833ax axVar = (C58833ax) obj;
        if (axVar == null) {
            bcVar = null;
        } else {
            bcVar = (C8575bc) axVar.mo56111f();
        }
        if (bcVar != null) {
            C107773ai aiVar = this.f299880b;
            Query query = this.f299879a;
            aiVar.f299887g = query;
            aiVar.f299884d.mo78764e(query, bcVar);
        }
    }
}

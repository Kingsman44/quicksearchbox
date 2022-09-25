package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mw */
/* compiled from: PG */
public final class C109718mw implements C107698i {

    /* renamed from: a */
    final /* synthetic */ C109717mv f305677a;

    public C109718mw(C109717mv mvVar) {
        this.f305677a = mvVar;
    }

    /* renamed from: a */
    public final void mo96218a(Query query) {
        C88489j jVar = new C88489j(C87739bu.QUERY_COMMIT);
        jVar.mo82015c(query);
        mo96219b(jVar.mo82013a());
    }

    /* renamed from: b */
    public final void mo96219b(ClientEventData clientEventData) {
        this.f305677a.mo98047a().mo81937i(clientEventData);
    }
}

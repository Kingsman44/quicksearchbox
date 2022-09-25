package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8426b;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.b.a */
/* compiled from: PG */
final class C110055a implements C107698i {

    /* renamed from: a */
    final /* synthetic */ C87673aa f306635a;

    public C110055a(C87673aa aaVar) {
        this.f306635a = aaVar;
    }

    /* renamed from: a */
    public final void mo96218a(Query query) {
        C88489j jVar = new C88489j(C87739bu.QUERY_COMMIT);
        jVar.mo82015c(query);
        this.f306635a.mo81937i(jVar.mo82013a());
    }

    /* renamed from: b */
    public final void mo96219b(ClientEventData clientEventData) {
        this.f306635a.mo81937i(clientEventData);
    }
}

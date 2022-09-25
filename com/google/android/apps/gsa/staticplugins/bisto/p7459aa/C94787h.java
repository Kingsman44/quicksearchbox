package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.h */
/* compiled from: PG */
public final /* synthetic */ class C94787h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94794o f265039a;

    /* renamed from: b */
    public final /* synthetic */ Query f265040b;

    public /* synthetic */ C94787h(C94794o oVar, Query query) {
        this.f265039a = oVar;
        this.f265040b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94794o oVar = this.f265039a;
        Query query = this.f265040b;
        Exception exc = (Exception) obj;
        C88489j jVar = new C88489j(C87739bu.QUERY_COMMIT);
        jVar.mo82015c(query);
        oVar.mo88618a(jVar.mo82013a());
    }
}

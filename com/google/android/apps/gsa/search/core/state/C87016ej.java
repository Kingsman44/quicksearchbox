package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.search.core.state.ej */
/* compiled from: PG */
public final /* synthetic */ class C87016ej implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87023eq f235007a;

    /* renamed from: b */
    public final /* synthetic */ Query f235008b;

    public /* synthetic */ C87016ej(C87023eq eqVar, Query query) {
        this.f235007a = eqVar;
        this.f235008b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87023eq eqVar = this.f235007a;
        Query query = this.f235008b;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) ((C59052c) C87023eq.f235022a.mo56226d()).mo56382g(exc)).mo56372aa(8767)).mo56386p("assistantResponseFuture failed");
        if (exc instanceof C90456c) {
            eqVar.f235048m = (C90456c) exc;
        }
        C87042fd fdVar = (C87042fd) eqVar.f235040e.mo27525b();
        C60537to toVar = C60537to.GENERIC_GSA_ERROR;
        C90452a aVar = new C90452a(exc, 211, C89885b.CARD_SEARCH_COMPLETE_STREAM_FAILED_VALUE);
        long j = query.f252749G;
        if (fdVar.mo80671o()) {
            C87041fc fcVar = fdVar.f235115d;
            fcVar.getClass();
            if (fcVar.f235109b.f252749G == j) {
                C58838bb.m90883r(!fcVar.f235111d);
                fcVar.f235110c = aVar;
                fdVar.mo80665g(fcVar, 464, toVar);
                fdVar.mo80591ar();
            }
        }
    }
}

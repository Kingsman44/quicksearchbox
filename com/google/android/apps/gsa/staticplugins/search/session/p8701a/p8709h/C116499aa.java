package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import com.google.android.apps.gsa.search.shared.actions.errors.WebSearchConnectionError;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.aa */
/* compiled from: PG */
public final /* synthetic */ class C116499aa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116502ad f323001a;

    /* renamed from: b */
    public final /* synthetic */ long f323002b;

    /* renamed from: c */
    public final /* synthetic */ C90456c f323003c;

    public /* synthetic */ C116499aa(C116502ad adVar, long j, C90456c cVar) {
        this.f323001a = adVar;
        this.f323002b = j;
        this.f323003c = cVar;
    }

    public final void run() {
        C116502ad adVar = this.f323001a;
        long j = this.f323002b;
        C90456c cVar = this.f323003c;
        Query query = adVar.f323019j.f324189y;
        if (query.f252749G == j) {
            WebSearchConnectionError webSearchConnectionError = new WebSearchConnectionError(query, cVar);
            adVar.f323019j.mo102963r(webSearchConnectionError.f236023g, webSearchConnectionError);
        }
    }
}

package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.x */
/* compiled from: PG */
public final /* synthetic */ class C116525x implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116502ad f323098a;

    /* renamed from: b */
    public final /* synthetic */ long f323099b;

    /* renamed from: c */
    public final /* synthetic */ long f323100c;

    public /* synthetic */ C116525x(C116502ad adVar, long j, long j2) {
        this.f323098a = adVar;
        this.f323099b = j;
        this.f323100c = j2;
    }

    public final void run() {
        C116502ad adVar = this.f323098a;
        long j = this.f323099b;
        long j2 = this.f323100c;
        C116819jn jnVar = adVar.f323019j;
        Query query = jnVar.f324189y;
        if (query.f252749G == j) {
            if (!jnVar.mo102965t(query)) {
                jnVar.mo102957j("resultsPageRenderComplete", query);
            } else if (jnVar.f324184t) {
                jnVar.mo102959n(query, j2);
                jnVar.mo80591ar();
            } else {
                jnVar.f324144D = true;
            }
        }
    }
}

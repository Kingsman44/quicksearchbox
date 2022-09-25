package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.w */
/* compiled from: PG */
public final /* synthetic */ class C116524w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116502ad f323096a;

    /* renamed from: b */
    public final /* synthetic */ long f323097b;

    public /* synthetic */ C116524w(C116502ad adVar, long j) {
        this.f323096a = adVar;
        this.f323097b = j;
    }

    public final void run() {
        C116502ad adVar = this.f323096a;
        long j = this.f323097b;
        C116819jn jnVar = adVar.f323019j;
        Query query = jnVar.f324189y;
        if (j == query.f252749G) {
            C22872h.m42743c(C86593a.class);
            if (jnVar.mo102965t(query)) {
                jnVar.f324147G = true;
                jnVar.f324149L = false;
                return;
            }
            jnVar.mo102957j("resultsPageWebViewResponsive", query);
        }
    }
}

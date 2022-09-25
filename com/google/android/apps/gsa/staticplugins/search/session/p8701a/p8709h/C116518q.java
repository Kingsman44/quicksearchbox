package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.q */
/* compiled from: PG */
public final /* synthetic */ class C116518q implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C116502ad f323083a;

    /* renamed from: b */
    public final /* synthetic */ Query f323084b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f323085c;

    public /* synthetic */ C116518q(C116502ad adVar, Query query, Bundle bundle) {
        this.f323083a = adVar;
        this.f323084b = query;
        this.f323085c = bundle;
    }

    public final void run() {
        C116502ad adVar = this.f323083a;
        Query query = this.f323084b;
        Bundle bundle = this.f323085c;
        C116819jn jnVar = adVar.f323019j;
        if (!jnVar.f324189y.mo84383cP(query)) {
            C59104x d = C116819jn.f324140a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S_WebViewRenderState");
            ((C59052c) ((C59052c) d).mo56372aa(32421)).mo56386p("Failed to update current WebView history. User may commit a new query. The last history may be lost.");
            return;
        }
        jnVar.f324180p = bundle;
    }
}

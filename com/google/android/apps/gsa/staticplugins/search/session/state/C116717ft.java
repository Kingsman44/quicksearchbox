package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ft */
/* compiled from: PG */
public final /* synthetic */ class C116717ft implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116720fw f323686a;

    /* renamed from: b */
    public final /* synthetic */ C116719fv f323687b;

    /* renamed from: c */
    public final /* synthetic */ int f323688c;

    /* renamed from: d */
    public final /* synthetic */ C60537to f323689d;

    public /* synthetic */ C116717ft(C116720fw fwVar, C116719fv fvVar, int i, C60537to toVar) {
        this.f323686a = fwVar;
        this.f323687b = fvVar;
        this.f323688c = i;
        this.f323689d = toVar;
    }

    public final void run() {
        C116720fw fwVar = this.f323686a;
        C116719fv fvVar = this.f323687b;
        int i = this.f323688c;
        C60537to toVar = this.f323689d;
        Query query = fvVar.f323694b;
        fvVar.f323693a.mo80167b(query, i, toVar, fvVar.f323695c);
        C58976aa aaVar = C58975e.f156826a;
        fwVar.f323700d.add(new C116718fu(query.f252749G, i, toVar));
    }
}

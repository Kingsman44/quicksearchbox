package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.search.core.state.fa */
/* compiled from: PG */
public final /* synthetic */ class C87039fa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87042fd f235101a;

    /* renamed from: b */
    public final /* synthetic */ C87041fc f235102b;

    /* renamed from: c */
    public final /* synthetic */ int f235103c;

    /* renamed from: d */
    public final /* synthetic */ C60537to f235104d;

    public /* synthetic */ C87039fa(C87042fd fdVar, C87041fc fcVar, int i, C60537to toVar) {
        this.f235101a = fdVar;
        this.f235102b = fcVar;
        this.f235103c = i;
        this.f235104d = toVar;
    }

    public final void run() {
        C87042fd fdVar = this.f235101a;
        C87041fc fcVar = this.f235102b;
        int i = this.f235103c;
        C60537to toVar = this.f235104d;
        Query query = fcVar.f235109b;
        fcVar.f235108a.mo80167b(query, i, toVar, fcVar.f235110c);
        C58976aa aaVar = C58975e.f156826a;
        fdVar.f235114c.add(new C87040fb(query.f252749G, i, toVar));
    }
}

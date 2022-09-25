package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94642f;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.af */
/* compiled from: PG */
public final /* synthetic */ class C95069af implements C95284n {

    /* renamed from: a */
    public final /* synthetic */ C95073aj f265963a;

    /* renamed from: b */
    public final /* synthetic */ C95285o f265964b;

    /* renamed from: c */
    public final /* synthetic */ C95284n f265965c;

    public /* synthetic */ C95069af(C95073aj ajVar, C95285o oVar, C95284n nVar) {
        this.f265963a = ajVar;
        this.f265964b = oVar;
        this.f265965c = nVar;
    }

    /* renamed from: a */
    public final void mo88601a() {
        C95073aj ajVar = this.f265963a;
        C95285o oVar = this.f265964b;
        C95284n nVar = this.f265965c;
        C58976aa aaVar = C58975e.f156826a;
        String i = ajVar.f265973g.mo89216i(ajVar.f265972f, 16);
        if (i != null) {
            oVar.mo89203c(new C95209x(i), new C94642f(oVar, nVar));
            return;
        }
        C89655j.m145957a("No timeout2 prompt");
        nVar.mo88601a();
    }
}

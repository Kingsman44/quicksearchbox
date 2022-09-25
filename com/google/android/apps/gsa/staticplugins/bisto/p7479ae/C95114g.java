package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94642f;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.g */
/* compiled from: PG */
public final /* synthetic */ class C95114g implements C95284n {

    /* renamed from: a */
    public final /* synthetic */ C95118k f266111a;

    /* renamed from: b */
    public final /* synthetic */ C95285o f266112b;

    /* renamed from: c */
    public final /* synthetic */ C95284n f266113c;

    public /* synthetic */ C95114g(C95118k kVar, C95285o oVar, C95284n nVar) {
        this.f266111a = kVar;
        this.f266112b = oVar;
        this.f266113c = nVar;
    }

    /* renamed from: a */
    public final void mo88601a() {
        C95118k kVar = this.f266111a;
        C95285o oVar = this.f266112b;
        C95284n nVar = this.f266113c;
        C58976aa aaVar = C58975e.f156826a;
        String i = kVar.f266122h.mo89216i(kVar.f266121g, 16);
        if (i != null) {
            oVar.mo89203c(new C95209x(i), new C94642f(oVar, nVar));
            return;
        }
        C89655j.m145957a("No timeout2 prompt");
        nVar.mo88601a();
    }
}

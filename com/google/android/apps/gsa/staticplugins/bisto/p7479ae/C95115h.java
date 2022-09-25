package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94642f;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95208w;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.h */
/* compiled from: PG */
public final /* synthetic */ class C95115h implements C95284n {

    /* renamed from: a */
    public final /* synthetic */ C95118k f266114a;

    /* renamed from: b */
    public final /* synthetic */ C95285o f266115b;

    /* renamed from: c */
    public final /* synthetic */ C95284n f266116c;

    /* renamed from: d */
    public final /* synthetic */ C95284n f266117d;

    public /* synthetic */ C95115h(C95118k kVar, C95285o oVar, C95284n nVar, C95284n nVar2) {
        this.f266114a = kVar;
        this.f266115b = oVar;
        this.f266116c = nVar;
        this.f266117d = nVar2;
    }

    /* renamed from: a */
    public final void mo88601a() {
        String str;
        C95118k kVar = this.f266114a;
        C95285o oVar = this.f266115b;
        C95284n nVar = this.f266116c;
        C95284n nVar2 = this.f266117d;
        C58976aa aaVar = C58975e.f156826a;
        if (!kVar.f266123i || (str = kVar.f266119e) == null) {
            String i = kVar.f266122h.mo89216i(kVar.f266121g, 15);
            if (i != null) {
                oVar.mo89203c(new C95209x(i), new C94642f(oVar, nVar2));
                return;
            }
            C89655j.m145957a("No timeout1 prompt");
            nVar2.mo88601a();
            return;
        }
        kVar.f266120f.mo89035d(str);
        oVar.mo89203c(new C95208w(kVar.f266121g, R.string.transcript_sent, new Object[0]), new C95112e(nVar));
    }
}

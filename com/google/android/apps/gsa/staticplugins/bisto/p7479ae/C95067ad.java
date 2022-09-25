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

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.ad */
/* compiled from: PG */
public final /* synthetic */ class C95067ad implements C95284n {

    /* renamed from: a */
    public final /* synthetic */ C95073aj f265956a;

    /* renamed from: b */
    public final /* synthetic */ C95285o f265957b;

    /* renamed from: c */
    public final /* synthetic */ C95284n f265958c;

    /* renamed from: d */
    public final /* synthetic */ C95284n f265959d;

    public /* synthetic */ C95067ad(C95073aj ajVar, C95285o oVar, C95284n nVar, C95284n nVar2) {
        this.f265956a = ajVar;
        this.f265957b = oVar;
        this.f265958c = nVar;
        this.f265959d = nVar2;
    }

    /* renamed from: a */
    public final void mo88601a() {
        String str;
        C95073aj ajVar = this.f265956a;
        C95285o oVar = this.f265957b;
        C95284n nVar = this.f265958c;
        C95284n nVar2 = this.f265959d;
        C58976aa aaVar = C58975e.f156826a;
        if (!ajVar.f265975i || (str = ajVar.f265974h) == null) {
            String i = ajVar.f265973g.mo89216i(ajVar.f265972f, 15);
            if (i != null) {
                oVar.mo89203c(new C95209x(i), new C94642f(oVar, nVar2));
                return;
            }
            C89655j.m145957a("No timeout1 prompt");
            nVar2.mo88601a();
            return;
        }
        ajVar.mo89002o(str, ajVar.f265976j);
        oVar.mo89203c(new C95208w(ajVar.f265972f, R.string.transcript_sent, new Object[0]), new C95070ag(nVar));
    }
}

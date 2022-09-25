package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95702h;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95704j;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C95512ab implements C95284n {

    /* renamed from: a */
    public final /* synthetic */ C95515ae f267264a;

    /* renamed from: b */
    public final /* synthetic */ C95285o f267265b;

    /* renamed from: c */
    public final /* synthetic */ C95284n f267266c;

    public /* synthetic */ C95512ab(C95515ae aeVar, C95285o oVar, C95284n nVar) {
        this.f267264a = aeVar;
        this.f267265b = oVar;
        this.f267266c = nVar;
    }

    /* renamed from: a */
    public final void mo88601a() {
        C95516af afVar;
        C95515ae aeVar = this.f267264a;
        C95285o oVar = this.f267265b;
        C95284n nVar = this.f267266c;
        C58976aa aaVar = C58975e.f156826a;
        C60237lk lkVar = aeVar.f267277k;
        boolean z = false;
        if (aeVar.mo89418v() && (afVar = aeVar.f267279m) != null && afVar.f267285f) {
            z = true;
        }
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 16;
        loVar.f162985d = z;
        C90427h q = aeVar.mo89413q();
        if (aeVar.mo89405R() && q != null) {
            if (aeVar.f267279m == null) {
                aeVar.f264705a.mo83544b("No settings");
            }
            if (aeVar.mo89418v()) {
                C95706l lVar = aeVar.f267276j;
                lVar.f267948f.mo89592o(new C95704j(lVar, q));
            } else if (aeVar.mo89419w()) {
                C95706l lVar2 = aeVar.f267276j;
                lVar2.f267948f.mo89592o(new C95702h(lVar2, q));
            }
        }
        aeVar.mo89406U(oVar, nVar);
    }
}

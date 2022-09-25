package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95309o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.t */
/* compiled from: PG */
public final /* synthetic */ class C95545t implements C95284n {

    /* renamed from: a */
    public final /* synthetic */ C95551z f267388a;

    /* renamed from: b */
    public final /* synthetic */ C95309o f267389b;

    /* renamed from: c */
    public final /* synthetic */ C95285o f267390c;

    /* renamed from: d */
    public final /* synthetic */ C95284n f267391d;

    public /* synthetic */ C95545t(C95551z zVar, C95309o oVar, C95285o oVar2, C95284n nVar) {
        this.f267388a = zVar;
        this.f267389b = oVar;
        this.f267390c = oVar2;
        this.f267391d = nVar;
    }

    /* renamed from: a */
    public final void mo88601a() {
        C95551z zVar = this.f267388a;
        C95309o oVar = this.f267389b;
        C95285o oVar2 = this.f267390c;
        C95284n nVar = this.f267391d;
        C58976aa aaVar = C58975e.f156826a;
        oVar.mo89247a(zVar.f267277k);
        C95516af afVar = zVar.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
        }
        if (afVar != null && afVar.f267282c) {
            zVar.mo89443O(oVar2, nVar);
        } else if (zVar.mo89445S()) {
            zVar.mo89442N(oVar2, nVar);
        } else {
            nVar.mo88601a();
        }
    }
}

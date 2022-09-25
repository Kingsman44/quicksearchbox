package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.k */
/* compiled from: PG */
public final /* synthetic */ class C110551k implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110559s f308206a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f308207b;

    public /* synthetic */ C110551k(C110559s sVar, SettableFuture settableFuture) {
        this.f308206a = sVar;
        this.f308207b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110559s sVar = this.f308206a;
        SettableFuture settableFuture = this.f308207b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            ((C58970a) ((C58970a) sVar.f308227f.mo56224b()).mo56372aa(26556)).mo56386p("Local calendar data in OpaStore is valid.");
            settableFuture.mo57356n(axVar);
            if (sVar.f308226e.mo79746e(C89985ax.f246647A)) {
                new C90873ag(sVar.f308225d.mo77052a(sVar.f308226e.mo79743a(C90014bt.f247653lH)), sVar.f308224c, "compareNextEvent", new C110548h(sVar, sVar.mo98763d(axVar))).mo85223a(new C110550j(sVar));
                return;
            }
            return;
        }
        ((C58970a) ((C58970a) sVar.f308227f.mo56224b()).mo56372aa(26555)).mo56386p("Local calendar data in OpaStore is empty, fetch data again.");
        sVar.mo98764e(settableFuture, sVar.f308226e.mo79743a(C90014bt.f247653lH));
    }
}

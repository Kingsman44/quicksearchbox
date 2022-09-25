package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import com.google.android.libraries.gcoreclient.p1741ab.p1742a.C21416a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21435m;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21436n;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21438p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.ae */
/* compiled from: PG */
final class C115917ae implements Callable {

    /* renamed from: a */
    final /* synthetic */ C115918af f321419a;

    public C115917ae(C115918af afVar) {
        this.f321419a = afVar;
    }

    public final /* synthetic */ Object call() {
        C21416a a = this.f321419a.f321425f.mo26924a().mo26926b(new C21438p()).mo26927c().mo26925a();
        C115918af afVar = this.f321419a;
        C21436n nVar = (C21436n) afVar.f321430r.mo26933a(afVar.f253307n, a).mo26994a();
        if (nVar.mo26997c().mo27003f()) {
            C21435m a2 = nVar.mo26934a();
            C58976aa aaVar = C58975e.f156826a;
            return a2.f59894a.f395367a;
        }
        C59104x c = C115918af.f321420a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OPAWalletClient");
        ((C59052c) ((C59052c) c).mo56372aa(30162)).mo56389s("getClientToken failed: %s", nVar.mo26997c().mo27000d());
        return new byte[0];
    }
}

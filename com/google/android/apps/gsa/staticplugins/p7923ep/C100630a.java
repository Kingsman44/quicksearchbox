package com.google.android.apps.gsa.staticplugins.p7923ep;

import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21436n;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21438p;
import com.google.common.p4520a.C58206am;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.ep.a */
/* compiled from: PG */
public final /* synthetic */ class C100630a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C100631b f281398a;

    public /* synthetic */ C100630a(C100631b bVar) {
        this.f281398a = bVar;
    }

    public final Object call() {
        C100631b bVar = this.f281398a;
        C21436n nVar = (C21436n) bVar.f281402d.mo26933a(bVar.f253307n, bVar.f281401c.mo26924a().mo26926b(new C21438p()).mo26927c().mo26925a()).mo26994a();
        if (!nVar.mo26997c().mo27003f()) {
            C59104x c = C100631b.f281399a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WalletApiClientWrapper");
            ((C59052c) ((C59052c) c).mo56372aa(33728)).mo56389s("getClientToken failed: %s", nVar.mo26997c().mo27000d());
            return new byte[0];
        }
        byte[] bArr = nVar.mo26934a().f59894a.f395367a;
        C58976aa aaVar = C58975e.f156826a;
        ((C58206am) bVar.f281400b).f155647a.put(1, bArr);
        return bArr;
    }
}

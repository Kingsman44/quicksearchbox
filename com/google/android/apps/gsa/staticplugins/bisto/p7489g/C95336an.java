package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.an */
/* compiled from: PG */
public final /* synthetic */ class C95336an implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95393cq f266730a;

    /* renamed from: b */
    public final /* synthetic */ C22869e f266731b;

    public /* synthetic */ C95336an(C95393cq cqVar, C22869e eVar) {
        this.f266730a = cqVar;
        this.f266731b = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95393cq cqVar = this.f266730a;
        C22869e eVar = this.f266731b;
        C59104x c = C95345aw.f266745a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoBluetoothDevice");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(14940)).mo56389s("error with device request: %s", cqVar.mo89333c());
        eVar.run();
    }
}

package com.google.android.apps.search.fedora.p10110k.p10113c;

import com.google.android.apps.search.fedora.p10110k.p10112b.C133023m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.fedora.k.c.y */
/* compiled from: PG */
final class C133051y implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f362787a;

    public C133051y(C70862aj ajVar) {
        this.f362787a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C133027aa.f362747a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(39999)).mo56386p("Failed to unregister training.");
        this.f362787a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f362787a.mo20123c(C133023m.f362741a);
        this.f362787a.mo20121a();
        C59104x b = C133027aa.f362747a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) b).mo56372aa(40000)).mo56386p("Successfully unregistered training.");
    }
}

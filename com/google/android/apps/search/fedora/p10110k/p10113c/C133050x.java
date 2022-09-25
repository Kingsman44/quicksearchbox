package com.google.android.apps.search.fedora.p10110k.p10113c;

import com.google.android.apps.search.fedora.p10110k.p10112b.C133019i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.fedora.k.c.x */
/* compiled from: PG */
final class C133050x implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f362786a;

    public C133050x(C70862aj ajVar) {
        this.f362786a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C133027aa.f362747a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(39997)).mo56386p("Failed to register training.");
        this.f362786a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f362786a.mo20123c(C133019i.f362737a);
        this.f362786a.mo20121a();
        C59104x b = C133027aa.f362747a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) b).mo56372aa(39998)).mo56386p("Successfully registered training.");
    }
}

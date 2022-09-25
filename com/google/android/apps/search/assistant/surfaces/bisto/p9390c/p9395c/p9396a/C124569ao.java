package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeoutException;
import p3186j$.util.function.Consumer;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.ao */
/* compiled from: PG */
final class C124569ao implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Consumer f343656a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f343657b;

    public C124569ao(Consumer consumer, C70862aj ajVar) {
        this.f343656a = consumer;
        this.f343657b = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof TimeoutException) {
            C59104x d = C124571aq.f343658a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDeviceService");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(36248)).mo56386p("RPC Timeout");
            this.f343657b.mo20122b(Status.f186907e.mo61678e(th).asException());
        } else if (th instanceof C124551g) {
            C59104x d2 = C124571aq.f343658a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoDeviceService");
            ((C59052c) ((C59052c) d2).mo56372aa(36247)).mo56386p("Device not found");
            this.f343657b.mo20122b(Status.f186908f.mo61678e(th).asException());
        } else if (th.getMessage() != null) {
            C59104x d3 = C124571aq.f343658a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "BistoDeviceService");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(th)).mo56372aa(36246)).mo56386p("RPC Failed");
            C70862aj ajVar = this.f343657b;
            Status status = Status.f186905c;
            String message = th.getMessage();
            message.getClass();
            ajVar.mo20122b(status.withDescription(message).mo61678e(th).asException());
        } else {
            C59104x d4 = C124571aq.f343658a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "BistoDeviceService");
            ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(th)).mo56372aa(36245)).mo56386p("RPC Failed");
            this.f343657b.mo20122b(Status.f186905c.mo61678e(th).asException());
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f343656a.accept(obj);
    }
}

package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.cp */
/* compiled from: PG */
final class C122782cp implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C122859d f340100a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f340101b;

    /* renamed from: c */
    final /* synthetic */ Function f340102c;

    /* renamed from: d */
    final /* synthetic */ String f340103d;

    /* renamed from: e */
    final /* synthetic */ C122783cq f340104e;

    public C122782cp(C122783cq cqVar, C122859d dVar, C70862aj ajVar, Function function, String str) {
        this.f340104e = cqVar;
        this.f340100a = dVar;
        this.f340101b = ajVar;
        this.f340102c = function;
        this.f340103d = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) this.f340100a.mo105765d().mo56382g(th)).mo56372aa(34823)).mo56386p("RPC processing failed");
        this.f340101b.mo20122b(this.f340104e.f340105a.mo105845a(th, this.f340103d).asException());
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        ((C59052c) this.f340100a.mo105764c().mo56372aa(34824)).mo56386p("RPC processing completed");
        this.f340101b.mo20123c(this.f340102c.apply(obj));
        this.f340101b.mo20121a();
    }
}

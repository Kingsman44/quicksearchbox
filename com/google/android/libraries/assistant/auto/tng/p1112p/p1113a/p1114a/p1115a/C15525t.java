package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.t */
/* compiled from: PG */
public final /* synthetic */ class C15525t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15526u f46494a;

    /* renamed from: b */
    public final /* synthetic */ C70868g f46495b;

    public /* synthetic */ C15525t(C15526u uVar, C70868g gVar) {
        this.f46494a = uVar;
        this.f46495b = gVar;
    }

    public final void run() {
        C15526u uVar = this.f46494a;
        C70868g gVar = this.f46495b;
        C58976aa aaVar = C58975e.f156826a;
        C15520o oVar = new C15520o(uVar, gVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(oVar), uVar.f46498c), "Error to send the pending requests", new Object[0]);
    }
}

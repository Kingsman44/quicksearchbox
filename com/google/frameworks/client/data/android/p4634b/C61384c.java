package com.google.frameworks.client.data.android.p4634b;

import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import p5488io.grpc.C70286co;
import p5488io.grpc.binder.LifecycleOnDestroyHelper$1;

/* renamed from: com.google.frameworks.client.data.android.b.c */
/* compiled from: PG */
public final /* synthetic */ class C61384c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61387f f165975a;

    /* renamed from: b */
    public final /* synthetic */ C70286co f165976b;

    public /* synthetic */ C61384c(C61387f fVar, C70286co coVar) {
        this.f165975a = fVar;
        this.f165976b = coVar;
    }

    public final void run() {
        C61387f fVar = this.f165975a;
        C70286co coVar = this.f165976b;
        C2384o oVar = fVar.f165990c;
        if (oVar.mo5789a() == C2383n.DESTROYED) {
            coVar.mo61975g();
        } else {
            oVar.mo5790b(new LifecycleOnDestroyHelper$1(coVar));
        }
    }
}

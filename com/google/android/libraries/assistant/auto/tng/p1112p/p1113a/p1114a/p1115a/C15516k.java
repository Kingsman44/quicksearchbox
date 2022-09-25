package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p5488io.grpc.p5533i.C70869h;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C15516k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15519n f46474a;

    /* renamed from: b */
    public final /* synthetic */ String f46475b;

    public /* synthetic */ C15516k(C15519n nVar, String str) {
        this.f46474a = nVar;
        this.f46475b = str;
    }

    public final void run() {
        C15519n nVar = this.f46474a;
        String str = this.f46475b;
        if (!nVar.f46484e) {
            nVar.f46484e = true;
            nVar.f46483d = false;
            C58976aa aaVar = C58975e.f156826a;
            C15526u uVar = nVar.f46480a;
            C15521p pVar = new C15521p(uVar);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(pVar), uVar.f46497b), "#cancel processing failed.", new Object[0]);
            ((C70869h) nVar.f46481b).f189042b.mo27480d(str, (Throwable) null);
        }
    }
}

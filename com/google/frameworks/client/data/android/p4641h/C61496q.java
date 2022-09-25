package com.google.frameworks.client.data.android.p4641h;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.h.q */
/* compiled from: PG */
public final /* synthetic */ class C61496q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61471ad f166256a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f166257b;

    public /* synthetic */ C61496q(C61471ad adVar, Runnable runnable) {
        this.f166256a = adVar;
        this.f166257b = runnable;
    }

    public final void run() {
        C61471ad adVar = this.f166256a;
        try {
            this.f166257b.run();
        } catch (Throwable th) {
            adVar.f166193i = true;
            C70897l lVar = adVar.f166190f;
            if (lVar != null) {
                lVar.mo27484b(Status.m102100d(th), new C70334de());
                C70898m mVar = adVar.f166194j;
                if (mVar != null && adVar.f166189e.f166184e == 4) {
                    mVar.mo27480d((String) null, th);
                }
            }
        }
    }
}

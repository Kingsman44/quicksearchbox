package com.google.android.libraries.performance.primes.metrics.p2413g;

import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.performance.primes.metrics.g.i */
/* compiled from: PG */
public final /* synthetic */ class C31468i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31471l f84739a;

    public /* synthetic */ C31468i(C31471l lVar) {
        this.f84739a = lVar;
    }

    public final void run() {
        C31471l lVar = this.f84739a;
        lVar.f84752j.getClass();
        C31475p pVar = lVar.f84752j;
        if (pVar.f84766h && pVar.f84767i.get() != null) {
            pVar.f84766h = false;
            ((Future) pVar.f84767i.get()).cancel(false);
        }
    }
}

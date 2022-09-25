package com.google.p4449cd.p4456g.p4458b;

import java.util.concurrent.Callable;

/* renamed from: com.google.cd.g.b.b */
/* compiled from: PG */
public final /* synthetic */ class C57983b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C57986e f155045a;

    public /* synthetic */ C57983b(C57986e eVar) {
        this.f155045a = eVar;
    }

    public final Object call() {
        C57985d dVar;
        C57986e eVar = this.f155045a;
        synchronized (eVar.f155049a) {
            eVar.f155052d = true;
            if (eVar.f155050b.isEmpty() && (dVar = eVar.f155051c) != null && dVar.f155044c.get()) {
                eVar.f155051c.mo54584d(false);
                eVar.f155051c = null;
            }
        }
        return null;
    }
}

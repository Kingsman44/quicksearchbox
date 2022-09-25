package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.bv */
/* compiled from: PG */
final class C72489bv implements C72500cf {

    /* renamed from: a */
    final /* synthetic */ C72495ca f192867a;

    public C72489bv(C72495ca caVar) {
        this.f192867a = caVar;
    }

    /* renamed from: a */
    public final void mo64214a() {
        if (this.f192867a.f192881d.f192898g.compareAndSet(1, 4)) {
            C72495ca caVar = this.f192867a;
            C72522da daVar = caVar.f192878a;
            C72499ce ceVar = caVar.f192881d;
            daVar.f192969a.onResponseStarted(ceVar, ceVar.f192906o);
        }
    }
}

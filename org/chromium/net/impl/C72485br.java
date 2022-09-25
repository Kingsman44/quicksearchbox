package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.br */
/* compiled from: PG */
final class C72485br implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72500cf f192858a;

    /* renamed from: b */
    final /* synthetic */ C72499ce f192859b;

    public C72485br(C72499ce ceVar, C72500cf cfVar) {
        this.f192859b = ceVar;
        this.f192858a = cfVar;
    }

    public final void run() {
        try {
            this.f192858a.mo64214a();
        } catch (Throwable th) {
            this.f192859b.mo64246e(new C72534p("System error", th));
        }
    }
}

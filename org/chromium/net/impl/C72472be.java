package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.be */
/* compiled from: PG */
final class C72472be implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72500cf f192839a;

    /* renamed from: b */
    final /* synthetic */ C72499ce f192840b;

    public C72472be(C72499ce ceVar, C72500cf cfVar) {
        this.f192840b = ceVar;
        this.f192839a = cfVar;
    }

    public final void run() {
        try {
            this.f192839a.mo64214a();
        } catch (Throwable th) {
            this.f192840b.mo64247f(th);
        }
    }
}

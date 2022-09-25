package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.bs */
/* compiled from: PG */
final class C72486bs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72500cf f192860a;

    /* renamed from: b */
    final /* synthetic */ C72499ce f192861b;

    public C72486bs(C72499ce ceVar, C72500cf cfVar) {
        this.f192861b = ceVar;
        this.f192860a = cfVar;
    }

    public final void run() {
        try {
            this.f192860a.mo64214a();
        } catch (Throwable th) {
            this.f192861b.mo64246e(new C72494c("Exception received from UrlRequest.Callback", th));
        }
    }
}

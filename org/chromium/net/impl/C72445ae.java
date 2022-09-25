package org.chromium.net.impl;

import org.chromium.base.C72387m;

/* renamed from: org.chromium.net.impl.ae */
/* compiled from: PG */
final class C72445ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetUrlRequest f192791a;

    public C72445ae(CronetUrlRequest cronetUrlRequest) {
        this.f192791a = cronetUrlRequest;
    }

    public final void run() {
        synchronized (this.f192791a.f192722d) {
            CronetUrlRequest cronetUrlRequest = this.f192791a;
            if (!cronetUrlRequest.mo64181i()) {
                cronetUrlRequest.mo64175c(0);
                try {
                    CronetUrlRequest cronetUrlRequest2 = this.f192791a;
                    C72522da daVar = cronetUrlRequest2.f192723e;
                    daVar.f192969a.onSucceeded(cronetUrlRequest2, cronetUrlRequest2.f192726h);
                    this.f192791a.mo64176d();
                } catch (Exception e) {
                    C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception in onSucceeded method", e);
                }
            }
        }
    }
}

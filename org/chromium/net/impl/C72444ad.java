package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.ad */
/* compiled from: PG */
final class C72444ad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetUrlRequest f192790a;

    public C72444ad(CronetUrlRequest cronetUrlRequest) {
        this.f192790a = cronetUrlRequest;
    }

    public final void run() {
        this.f192790a.mo64174b();
        synchronized (this.f192790a.f192722d) {
            CronetUrlRequest cronetUrlRequest = this.f192790a;
            if (!cronetUrlRequest.mo64181i()) {
                cronetUrlRequest.f192721c = true;
                try {
                    CronetUrlRequest cronetUrlRequest2 = this.f192790a;
                    C72522da daVar = cronetUrlRequest2.f192723e;
                    daVar.f192969a.onResponseStarted(cronetUrlRequest2, cronetUrlRequest2.f192726h);
                } catch (Exception e) {
                    this.f192790a.mo64177e(e);
                }
            }
        }
    }
}

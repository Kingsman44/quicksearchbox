package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.ac */
/* compiled from: PG */
final class C72443ac implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72513cs f192787a;

    /* renamed from: b */
    final /* synthetic */ String f192788b;

    /* renamed from: c */
    final /* synthetic */ CronetUrlRequest f192789c;

    public C72443ac(CronetUrlRequest cronetUrlRequest, C72513cs csVar, String str) {
        this.f192789c = cronetUrlRequest;
        this.f192787a = csVar;
        this.f192788b = str;
    }

    public final void run() {
        this.f192789c.mo64174b();
        synchronized (this.f192789c.f192722d) {
            CronetUrlRequest cronetUrlRequest = this.f192789c;
            if (!cronetUrlRequest.mo64181i()) {
                cronetUrlRequest.f192720b = true;
                try {
                    CronetUrlRequest cronetUrlRequest2 = this.f192789c;
                    C72522da daVar = cronetUrlRequest2.f192723e;
                    daVar.f192969a.onRedirectReceived(cronetUrlRequest2, this.f192787a, this.f192788b);
                } catch (Exception e) {
                    this.f192789c.mo64177e(e);
                }
            }
        }
    }
}

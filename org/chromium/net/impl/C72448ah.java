package org.chromium.net.impl;

import org.chromium.base.C72387m;

/* renamed from: org.chromium.net.impl.ah */
/* compiled from: PG */
final class C72448ah implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetUrlRequest f192795a;

    public C72448ah(CronetUrlRequest cronetUrlRequest) {
        this.f192795a = cronetUrlRequest;
    }

    public final void run() {
        try {
            CronetUrlRequest cronetUrlRequest = this.f192795a;
            C72522da daVar = cronetUrlRequest.f192723e;
            daVar.f192969a.onFailed(cronetUrlRequest, cronetUrlRequest.f192726h, cronetUrlRequest.f192727i);
            this.f192795a.mo64176d();
        } catch (Exception e) {
            C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception in onFailed method", e);
        }
    }
}

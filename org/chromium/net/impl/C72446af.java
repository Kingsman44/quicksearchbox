package org.chromium.net.impl;

import org.chromium.base.C72387m;

/* renamed from: org.chromium.net.impl.af */
/* compiled from: PG */
final class C72446af implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetUrlRequest f192792a;

    public C72446af(CronetUrlRequest cronetUrlRequest) {
        this.f192792a = cronetUrlRequest;
    }

    public final void run() {
        try {
            CronetUrlRequest cronetUrlRequest = this.f192792a;
            C72522da daVar = cronetUrlRequest.f192723e;
            daVar.f192969a.onCanceled(cronetUrlRequest, cronetUrlRequest.f192726h);
            this.f192792a.mo64176d();
        } catch (Exception e) {
            C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception in onCanceled method", e);
        }
    }
}

package org.chromium.net.impl;

import org.chromium.net.RequestFinishedInfo;

/* renamed from: org.chromium.net.impl.ai */
/* compiled from: PG */
final class C72449ai implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RequestFinishedInfo f192796a;

    /* renamed from: b */
    final /* synthetic */ CronetUrlRequest f192797b;

    public C72449ai(CronetUrlRequest cronetUrlRequest, RequestFinishedInfo requestFinishedInfo) {
        this.f192797b = cronetUrlRequest;
        this.f192796a = requestFinishedInfo;
    }

    public final void run() {
        C72519cy cyVar = this.f192797b.f192724f;
        cyVar.f192965a.onRequestFinished(this.f192796a);
    }
}

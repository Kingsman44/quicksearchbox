package org.chromium.net.impl;

import org.chromium.net.RequestFinishedInfo;

/* renamed from: org.chromium.net.impl.ao */
/* compiled from: PG */
final class C72455ao implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72519cy f192809a;

    /* renamed from: b */
    final /* synthetic */ RequestFinishedInfo f192810b;

    public C72455ao(C72519cy cyVar, RequestFinishedInfo requestFinishedInfo) {
        this.f192809a = cyVar;
        this.f192810b = requestFinishedInfo;
    }

    public final void run() {
        C72519cy cyVar = this.f192809a;
        cyVar.f192965a.onRequestFinished(this.f192810b);
    }
}

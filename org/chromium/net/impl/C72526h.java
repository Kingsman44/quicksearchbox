package org.chromium.net.impl;

import org.chromium.net.CronetException;

/* renamed from: org.chromium.net.impl.h */
/* compiled from: PG */
final class C72526h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetException f192974a;

    /* renamed from: b */
    final /* synthetic */ CronetBidirectionalStream f192975b;

    public C72526h(CronetBidirectionalStream cronetBidirectionalStream, CronetException cronetException) {
        this.f192975b = cronetBidirectionalStream;
        this.f192974a = cronetException;
    }

    public final void run() {
        this.f192975b.mo64163a(this.f192974a);
    }
}

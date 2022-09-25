package org.chromium.net.impl;

import org.chromium.base.C72387m;

/* renamed from: org.chromium.net.impl.g */
/* compiled from: PG */
final class C72525g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetBidirectionalStream f192973a;

    public C72525g(CronetBidirectionalStream cronetBidirectionalStream) {
        this.f192973a = cronetBidirectionalStream;
    }

    public final void run() {
        try {
            CronetBidirectionalStream cronetBidirectionalStream = this.f192973a;
            C72515cu cuVar = cronetBidirectionalStream.f192665a;
            cuVar.f192961a.onCanceled(cronetBidirectionalStream, cronetBidirectionalStream.f192671g);
        } catch (Exception e) {
            C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception in onCanceled method", e);
        }
    }
}

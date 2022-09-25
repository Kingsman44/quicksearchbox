package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.e */
/* compiled from: PG */
final class C72523e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetBidirectionalStream f192970a;

    public C72523e(CronetBidirectionalStream cronetBidirectionalStream) {
        this.f192970a = cronetBidirectionalStream;
    }

    public final void run() {
        synchronized (this.f192970a.f192667c) {
            CronetBidirectionalStream cronetBidirectionalStream = this.f192970a;
            if (!cronetBidirectionalStream.mo64166e()) {
                cronetBidirectionalStream.f192669e = 2;
                try {
                    CronetBidirectionalStream cronetBidirectionalStream2 = this.f192970a;
                    C72515cu cuVar = cronetBidirectionalStream2.f192665a;
                    cuVar.f192961a.onResponseHeadersReceived(cronetBidirectionalStream2, cronetBidirectionalStream2.f192671g);
                } catch (Exception e) {
                    this.f192970a.mo64165c(e);
                }
            }
        }
    }
}

package org.chromium.net.impl;

import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.f */
/* compiled from: PG */
final class C72524f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo.HeaderBlock f192971a;

    /* renamed from: b */
    final /* synthetic */ CronetBidirectionalStream f192972b;

    public C72524f(CronetBidirectionalStream cronetBidirectionalStream, UrlResponseInfo.HeaderBlock headerBlock) {
        this.f192972b = cronetBidirectionalStream;
        this.f192971a = headerBlock;
    }

    public final void run() {
        synchronized (this.f192972b.f192667c) {
            if (!this.f192972b.mo64166e()) {
                try {
                    CronetBidirectionalStream cronetBidirectionalStream = this.f192972b;
                    C72515cu cuVar = cronetBidirectionalStream.f192665a;
                    cuVar.f192961a.onResponseTrailersReceived(cronetBidirectionalStream, cronetBidirectionalStream.f192671g, this.f192971a);
                } catch (Exception e) {
                    this.f192972b.mo64165c(e);
                }
            }
        }
    }
}

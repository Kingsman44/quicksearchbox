package org.chromium.net.impl;

import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.cu */
/* compiled from: PG */
public final class C72515cu extends BidirectionalStream.Callback {

    /* renamed from: a */
    public final BidirectionalStream.Callback f192961a;

    public C72515cu(BidirectionalStream.Callback callback) {
        this.f192961a = callback;
    }

    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.f192961a.onCanceled(bidirectionalStream, urlResponseInfo);
    }

    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f192961a.onFailed(bidirectionalStream, urlResponseInfo, cronetException);
    }

    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.f192961a.onReadCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
    }

    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.f192961a.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
    }

    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        this.f192961a.onResponseTrailersReceived(bidirectionalStream, urlResponseInfo, headerBlock);
    }

    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        this.f192961a.onStreamReady(bidirectionalStream);
    }

    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.f192961a.onSucceeded(bidirectionalStream, urlResponseInfo);
    }

    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.f192961a.onWriteCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
    }
}

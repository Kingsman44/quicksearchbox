package org.chromium.net.impl;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.da */
/* compiled from: PG */
public final class C72522da extends UrlRequest.Callback {

    /* renamed from: a */
    public final UrlRequest.Callback f192969a;

    public C72522da(UrlRequest.Callback callback) {
        this.f192969a = callback;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f192969a.onCanceled(urlRequest, urlResponseInfo);
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f192969a.onFailed(urlRequest, urlResponseInfo, cronetException);
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f192969a.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.f192969a.onRedirectReceived(urlRequest, urlResponseInfo, str);
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f192969a.onResponseStarted(urlRequest, urlResponseInfo);
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f192969a.onSucceeded(urlRequest, urlResponseInfo);
    }
}

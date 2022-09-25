package com.google.apps.tiktok.tracing.contrib.p3701c;

import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.google.apps.tiktok.tracing.contrib.c.a */
/* compiled from: PG */
public final class C47639a extends UrlRequest.Callback {

    /* renamed from: a */
    private final UrlRequest.Callback f123565a;

    /* renamed from: b */
    private final C47816ey f123566b = C47816ey.m84988b();

    public C47639a(UrlRequest.Callback callback) {
        this.f123565a = callback;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123566b.f123841a);
        try {
            this.f123565a.onCanceled(urlRequest, urlResponseInfo);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123566b.f123841a);
        try {
            this.f123565a.onFailed(urlRequest, urlResponseInfo, cronetException);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123566b.f123841a);
        try {
            this.f123565a.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123566b.f123841a);
        try {
            urlRequest.followRedirect();
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123566b.f123841a);
        try {
            this.f123565a.onResponseStarted(urlRequest, urlResponseInfo);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123566b.f123841a);
        try {
            this.f123565a.onSucceeded(urlRequest, urlResponseInfo);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }
}

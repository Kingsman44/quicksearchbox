package org.chromium.net.p5647a;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.a.g */
/* compiled from: PG */
final class C72423g extends UrlRequest.Callback {

    /* renamed from: a */
    final /* synthetic */ C72424h f192618a;

    public C72423g(C72424h hVar) {
        this.f192618a = hVar;
    }

    /* renamed from: a */
    private final void m107096a(IOException iOException) {
        C72424h hVar = this.f192618a;
        hVar.f192625f = iOException;
        C72426j jVar = hVar.f192622c;
        if (jVar != null) {
            jVar.f192639c = iOException;
            jVar.f192637a = true;
            jVar.f192638b = null;
        }
        C72427k kVar = hVar.f192623d;
        if (kVar != null) {
            kVar.f192641d = iOException;
            kVar.f192643f = true;
        }
        hVar.f192627h = true;
        hVar.f192620a.f192645a = false;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f192618a.f192624e = urlResponseInfo;
        m107096a(new IOException("disconnect() called"));
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (cronetException != null) {
            this.f192618a.f192624e = urlResponseInfo;
            m107096a(cronetException);
            return;
        }
        throw new IllegalStateException("Exception cannot be null in onFailed.");
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        C72424h hVar = this.f192618a;
        hVar.f192624e = urlResponseInfo;
        hVar.f192620a.f192645a = false;
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.f192618a.f192626g = true;
        try {
            URL url = new URL(str);
            boolean equals = url.getProtocol().equals(this.f192618a.url.getProtocol());
            if (this.f192618a.instanceFollowRedirects) {
                this.f192618a.url = url;
            }
            if (this.f192618a.instanceFollowRedirects && equals) {
                this.f192618a.f192621b.followRedirect();
                return;
            }
        } catch (MalformedURLException unused) {
        }
        C72424h hVar = this.f192618a;
        hVar.f192624e = urlResponseInfo;
        hVar.f192621b.cancel();
        m107096a((IOException) null);
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        C72424h hVar = this.f192618a;
        hVar.f192624e = urlResponseInfo;
        hVar.f192627h = true;
        hVar.f192620a.f192645a = false;
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f192618a.f192624e = urlResponseInfo;
        m107096a((IOException) null);
    }
}

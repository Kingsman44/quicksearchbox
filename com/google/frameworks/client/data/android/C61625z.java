package com.google.frameworks.client.data.android;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58585km;
import com.google.common.util.concurrent.SettableFuture;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.google.frameworks.client.data.android.z */
/* compiled from: PG */
final class C61625z extends UrlRequest.Callback {

    /* renamed from: a */
    final SettableFuture f166499a;

    /* renamed from: b */
    final C61620u f166500b = new C61620u();

    /* renamed from: c */
    final C61365ag f166501c;

    /* renamed from: d */
    public final List f166502d = new ArrayList();

    /* renamed from: e */
    private final Executor f166503e;

    public C61625z(SettableFuture settableFuture, Executor executor, C61365ag agVar) {
        this.f166499a = settableFuture;
        this.f166503e = executor;
        this.f166501c = agVar;
    }

    /* renamed from: b */
    public static final C58585km m94411b(Map map) {
        C58486gv gvVar = new C58486gv();
        for (Map.Entry entry : map.entrySet()) {
            for (String c : (List) entry.getValue()) {
                gvVar.mo55419c(C61362ad.m93870b((String) entry.getKey()), c);
            }
        }
        return gvVar.mo55417a();
    }

    /* renamed from: a */
    public final int mo58153a(UrlResponseInfo urlResponseInfo) {
        if ("head".equalsIgnoreCase(this.f166501c.f165944g)) {
            return 1;
        }
        Map allHeaders = urlResponseInfo.getAllHeaders();
        if (!allHeaders.containsKey("content-length")) {
            return 32768;
        }
        int parseInt = Integer.parseInt((String) ((List) allHeaders.get("content-length")).get(0));
        return allHeaders.containsKey("content-encoding") ? Math.max(Math.min(parseInt + parseInt, 32768), 1) : parseInt + 1;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f166503e.execute(new C61623x(this));
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f166503e.execute(new C61624y(this, cronetException));
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f166500b.mo58149a(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
        } else {
            urlRequest.read(ByteBuffer.allocateDirect(32768));
        }
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.f166501c.f165942e) {
            this.f166502d.add(str);
            urlRequest.followRedirect();
            return;
        }
        this.f166499a.mo57356n(new C61366ah(m94411b(urlResponseInfo.getAllHeaders()), ByteBuffer.allocateDirect(0), urlResponseInfo.getHttpStatusCode(), C58485gu.m89845m()));
        urlRequest.cancel();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mo58153a(urlResponseInfo));
        this.f166500b.mo58149a(allocateDirect);
        urlRequest.read(allocateDirect);
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f166503e.execute(new C61622w(this, urlResponseInfo));
    }
}

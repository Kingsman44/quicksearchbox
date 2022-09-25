package com.google.android.libraries.web.p3416i.p3417a;

import android.webkit.WebResourceResponse;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.i.a.b */
/* compiled from: PG */
public final class C43809b {

    /* renamed from: a */
    public final C43808a f114228a;

    /* renamed from: b */
    public final WebResourceResponse f114229b;

    public C43809b(WebResourceResponse webResourceResponse, Function function) {
        C43808a aVar = new C43808a(webResourceResponse.getData(), function);
        this.f114228a = aVar;
        WebResourceResponse webResourceResponse2 = new WebResourceResponse(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), aVar);
        this.f114229b = webResourceResponse2;
        if (webResourceResponse.getStatusCode() != 0) {
            webResourceResponse2.setStatusCodeAndReasonPhrase(webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
        if (webResourceResponse.getResponseHeaders() != null) {
            webResourceResponse2.setResponseHeaders(webResourceResponse.getResponseHeaders());
        }
    }
}

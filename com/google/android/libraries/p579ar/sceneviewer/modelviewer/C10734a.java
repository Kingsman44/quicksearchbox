package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.p4526f.C59052c;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.a */
/* compiled from: PG */
final class C10734a extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ Set f35671a;

    public C10734a(Set set) {
        this.f35671a = set;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (!this.f35671a.contains(webResourceRequest.getUrl().toString())) {
            return null;
        }
        try {
            WebResourceResponse webResourceResponse = new WebResourceResponse("application/javascript", "utf-8", new URL(webResourceRequest.getUrl().toString()).openConnection().getInputStream());
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", "*");
            webResourceResponse.setResponseHeaders(hashMap);
            return webResourceResponse;
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) WebModelView.logger.mo56225c()).mo56382g(e)).mo56372aa(42385)).mo56386p("Failed to load Url");
            return null;
        }
    }
}

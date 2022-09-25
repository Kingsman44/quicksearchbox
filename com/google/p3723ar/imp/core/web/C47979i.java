package com.google.p3723ar.imp.core.web;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.ar.imp.core.web.i */
/* compiled from: PG */
final class C47979i extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ ImpWebViewFragment f124178a;

    public C47979i(ImpWebViewFragment impWebViewFragment) {
        this.f124178a = impWebViewFragment;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f124178a.f124158a.injectScript();
    }
}

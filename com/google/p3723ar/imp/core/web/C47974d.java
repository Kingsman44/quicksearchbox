package com.google.p3723ar.imp.core.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.ar.imp.core.web.d */
/* compiled from: PG */
public final /* synthetic */ class C47974d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImpWebViewBridge f124171a;

    public /* synthetic */ C47974d(ImpWebViewBridge impWebViewBridge) {
        this.f124171a = impWebViewBridge;
    }

    public final void run() {
        ImpWebViewBridge impWebViewBridge = this.f124171a;
        WebView webView = impWebViewBridge.f124156c;
        String str = impWebViewBridge.f124155b;
        webView.evaluateJavascript("(()=>{" + str + "})();", (ValueCallback) null);
    }
}

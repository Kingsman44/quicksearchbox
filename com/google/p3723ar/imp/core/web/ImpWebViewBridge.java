package com.google.p3723ar.imp.core.web;

import android.webkit.WebView;

/* renamed from: com.google.ar.imp.core.web.ImpWebViewBridge */
/* compiled from: PG */
final class ImpWebViewBridge {

    /* renamed from: a */
    public final long f124154a;

    /* renamed from: b */
    public String f124155b;

    /* renamed from: c */
    public WebView f124156c;

    /* renamed from: d */
    public boolean f124157d;

    public ImpWebViewBridge(long j, WebView webView, String str, boolean z) {
        this.f124154a = j;
        this.f124156c = webView;
        if (z) {
            webView.clearCache(true);
        }
        m85149a(new C47973c(this));
        this.f124157d = false;
        this.f124155b = str;
    }

    /* renamed from: a */
    private final void m85149a(Runnable runnable) {
        this.f124156c.post(new C47972b(this, runnable));
    }

    static native void nPostMessage(long j, byte[] bArr);

    public void injectScript() {
        m85149a(new C47974d(this));
    }

    public void postMessage(String str) {
        m85149a(new C47975e(this, "window.javaScriptEntryPoint && window.javaScriptEntryPoint.incoming && window.javaScriptEntryPoint.incoming.postMessage(\"" + str + "\");"));
    }

    public void setInjectionScript(String str) {
        this.f124155b = str;
    }
}

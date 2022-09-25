package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.o */
/* compiled from: PG */
public final class C84020o extends WebViewClient {

    /* renamed from: a */
    private final C84019n f228866a;

    public C84020o(C84019n nVar) {
        this.f228866a = nVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        this.f228866a.mo77481a(true);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f228866a.mo77481a(false);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}

package com.google.android.apps.gsa.sidekick.main.endpoints;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.sidekick.main.endpoints.c */
/* compiled from: PG */
final class C91289c extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ GoogleServiceWebviewWrapper f254784a;

    public C91289c(GoogleServiceWebviewWrapper googleServiceWebviewWrapper) {
        this.f254784a = googleServiceWebviewWrapper;
    }

    public final void onProgressChanged(WebView webView, int i) {
        this.f254784a.setProgress(i * 100);
    }
}

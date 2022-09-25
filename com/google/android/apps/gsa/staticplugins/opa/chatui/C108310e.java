package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.p201w.C4370n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.e */
/* compiled from: PG */
final class C108310e extends WebViewClient {

    /* renamed from: a */
    private final C4370n f301306a;

    public C108310e(C4370n nVar) {
        this.f301306a = nVar;
    }

    /* renamed from: a */
    private static boolean m180043a(WebView webView, Uri uri) {
        if ("https://appassets.androidplatform.net/assets/www/amaunique.html".equals(uri.toString())) {
            return false;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f301306a.mo9291a(webResourceRequest.getUrl());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return m180043a(webView, webResourceRequest.getUrl());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m180043a(webView, Uri.parse(str));
    }
}

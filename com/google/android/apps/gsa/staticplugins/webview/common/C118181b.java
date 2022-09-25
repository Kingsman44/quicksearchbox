package com.google.android.apps.gsa.staticplugins.webview.common;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.common.b */
/* compiled from: PG */
public class C118181b extends WebViewClient {

    /* renamed from: b */
    public WebViewClient f328091b = new WebViewClient();

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f328091b.doUpdateVisitedHistory(webView, str, z);
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f328091b.onFormResubmission(webView, message, message2);
    }

    public final void onLoadResource(WebView webView, String str) {
        this.f328091b.onLoadResource(webView, str);
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        this.f328091b.onPageCommitVisible(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f328091b.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f328091b.onPageStarted(webView, str, bitmap);
    }

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f328091b.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f328091b.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f328091b.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f328091b.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f328091b.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f328091b.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f328091b.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        this.f328091b.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    public final void onScaleChanged(WebView webView, float f, float f2) {
        this.f328091b.onScaleChanged(webView, f, f2);
    }

    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        this.f328091b.onTooManyRedirects(webView, message, message2);
    }

    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.f328091b.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f328091b.shouldInterceptRequest(webView, str);
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.f328091b.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f328091b.shouldOverrideUrlLoading(webView, str);
    }
}

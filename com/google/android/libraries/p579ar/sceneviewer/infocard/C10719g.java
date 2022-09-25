package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.libraries.p11026am.C147762e;
import com.google.android.libraries.p11026am.C147764g;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.g */
/* compiled from: PG */
final class C10719g extends C147762e {

    /* renamed from: a */
    public int f35652a = 0;

    /* renamed from: b */
    final /* synthetic */ CardWebView f35653b;

    /* renamed from: d */
    private boolean f35654d = false;

    /* renamed from: e */
    private boolean f35655e = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10719g(CardWebView cardWebView, C147764g gVar, C147764g gVar2) {
        super(gVar, gVar2);
        this.f35653b = cardWebView;
    }

    /* renamed from: c */
    public final boolean mo18914c(WebResourceRequest webResourceRequest) {
        if (!this.f35655e) {
            this.f35654d = true;
        } else {
            this.f35655e = false;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo18915j(WebView webView, WebResourceRequest webResourceRequest) {
        ((C59052c) ((C59052c) CardWebView.logger.mo56226d()).mo56372aa(42342)).mo56354G("Non-allowlisted url: %s for parent: %s", webResourceRequest.getUrl(), C58837ba.m90858g(webView.getUrl()));
        return true;
    }

    public final synchronized void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (!this.f35655e) {
            if (this.f35654d) {
                this.f35654d = false;
                return;
            }
            if (webView.getTitle().contains("Error 404")) {
                ((C59052c) ((C59052c) CardWebView.logger.mo56224b()).mo56372aa(42338)).mo56386p("Caught a 404 page returned on page load finished, creating a WebResourceError");
                this.f35652a = 404;
            }
            this.f35653b.postVisualStateCallback(0, new C10718f(this, str));
            if (this.f35653b.transparentModeEnabled) {
                this.f35653b.enableTransparentMode(true);
            }
            if (!this.f35653b.modelEventTriggered.get()) {
                ((C59052c) ((C59052c) CardWebView.logger.mo56226d()).mo56372aa(42337)).mo56386p("Model event not sent when carousel is loaded! Manually triggering it.");
                this.f35653b.evaluateJavascript("const carousel = document.getElementsByClassName('carousel')[0];if (carousel != null) { const item = carousel.querySelector('.carousel-item'); if (item != null) {   item.click(); }}", (ValueCallback) null);
            }
            ((C59052c) ((C59052c) CardWebView.logger.mo56224b()).mo56372aa(42336)).mo56389s("Page loading finished on url: %s", str);
            this.f35655e = true;
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ((C59052c) ((C59052c) CardWebView.logger.mo56224b()).mo56372aa(42339)).mo56389s("Page load started on url %s", str);
        this.f35652a = 0;
        this.f35653b.modelEventTriggered.set(false);
        this.f35655e = false;
        this.f35654d = false;
        this.f35653b.setVisibility(4);
        this.f35653b.evaluateJavascript("window.addEventListener('message', (e) => {  const messageType = e.data.type;  if (messageType === 'carouselChange') {    window.Viewer      .carouselChange(JSON.stringify(e.data.detail));  }});", (ValueCallback) null);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        ((C59052c) ((C59052c) CardWebView.logger.mo56226d()).mo56372aa(42340)).mo56354G("Error received while loading url %s: %s", webResourceRequest.getUrl(), webResourceError.getDescription());
        this.f35652a = webResourceError.getErrorCode();
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String uri = webResourceRequest.getUrl().toString();
        ((C59052c) ((C59052c) CardWebView.logger.mo56226d()).mo56372aa(42341)).mo56352E("Error code received while loading url %s with status code %d", uri, webResourceResponse.getStatusCode());
        if (uri.contains("searchar/infocard")) {
            this.f35652a = webResourceResponse.getStatusCode();
        }
    }
}

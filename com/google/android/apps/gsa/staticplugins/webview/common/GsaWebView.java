package com.google.android.apps.gsa.staticplugins.webview.common;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public class GsaWebView extends WebView {

    /* renamed from: a */
    private C118180a f328086a;

    /* renamed from: b */
    private C118181b f328087b;

    public GsaWebView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo103585a(C118180a aVar) {
        this.f328086a = aVar;
        super.setWebChromeClient(aVar);
    }

    /* renamed from: b */
    public final void mo103586b(C118181b bVar) {
        this.f328087b = bVar;
        super.setWebViewClient(bVar);
    }

    public final WebChromeClient getWebChromeClient() {
        C58838bb.m90883r(this.f328086a != null);
        return this.f328086a.f328090c;
    }

    public final WebViewClient getWebViewClient() {
        C58838bb.m90883r(this.f328087b != null);
        return this.f328087b.f328091b;
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f328086a.f328090c = webChromeClient;
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f328087b.f328091b = webViewClient;
    }

    public GsaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GsaWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public GsaWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

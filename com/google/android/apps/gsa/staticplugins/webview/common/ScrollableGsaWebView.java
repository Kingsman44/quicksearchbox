package com.google.android.apps.gsa.staticplugins.webview.common;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.google.android.apps.gsa.shared.p7148ui.C90634aj;

/* compiled from: PG */
public class ScrollableGsaWebView extends C90634aj {

    /* renamed from: b */
    private C118180a f328088b;

    /* renamed from: c */
    private C118181b f328089c;

    public ScrollableGsaWebView(Context context) {
        super(context);
    }

    /* renamed from: d */
    public final void mo103591d(C118180a aVar) {
        this.f328088b = aVar;
        super.setWebChromeClient(aVar);
    }

    /* renamed from: e */
    public final void mo103592e(C118181b bVar) {
        this.f328089c = bVar;
        super.setWebViewClient(bVar);
    }

    public final void evaluateJavascript(String str, ValueCallback valueCallback) {
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (IllegalStateException | NoSuchMethodError unused) {
        }
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f328088b.f328090c = webChromeClient;
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f328089c.f328091b = webViewClient;
    }

    public ScrollableGsaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollableGsaWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

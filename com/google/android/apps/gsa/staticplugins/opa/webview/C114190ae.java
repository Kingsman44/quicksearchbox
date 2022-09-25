package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ae */
/* compiled from: PG */
public final /* synthetic */ class C114190ae implements C89688a {

    /* renamed from: a */
    public final /* synthetic */ WebView f316621a;

    public /* synthetic */ C114190ae(WebView webView) {
        this.f316621a = webView;
    }

    /* renamed from: a */
    public final void mo83590a(String str) {
        this.f316621a.evaluateJavascript(str, (ValueCallback) null);
    }
}

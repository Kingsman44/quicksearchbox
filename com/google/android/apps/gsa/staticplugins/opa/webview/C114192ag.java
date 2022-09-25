package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ag */
/* compiled from: PG */
public final /* synthetic */ class C114192ag implements C89688a {

    /* renamed from: a */
    public final /* synthetic */ WebView f316623a;

    public /* synthetic */ C114192ag(WebView webView) {
        this.f316623a = webView;
    }

    /* renamed from: a */
    public final void mo83590a(String str) {
        this.f316623a.evaluateJavascript(str, (ValueCallback) null);
    }
}

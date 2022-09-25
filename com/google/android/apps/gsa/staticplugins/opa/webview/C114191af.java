package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.af */
/* compiled from: PG */
public final /* synthetic */ class C114191af implements C89688a {

    /* renamed from: a */
    public final /* synthetic */ WebView f316622a;

    public /* synthetic */ C114191af(WebView webView) {
        this.f316622a = webView;
    }

    /* renamed from: a */
    public final void mo83590a(String str) {
        this.f316622a.evaluateJavascript(str, (ValueCallback) null);
    }
}

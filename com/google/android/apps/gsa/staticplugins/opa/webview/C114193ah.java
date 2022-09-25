package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ah */
/* compiled from: PG */
public final /* synthetic */ class C114193ah implements C89688a {

    /* renamed from: a */
    public final /* synthetic */ WebView f316624a;

    public /* synthetic */ C114193ah(WebView webView) {
        this.f316624a = webView;
    }

    /* renamed from: a */
    public final void mo83590a(String str) {
        this.f316624a.evaluateJavascript(str, (ValueCallback) null);
    }
}

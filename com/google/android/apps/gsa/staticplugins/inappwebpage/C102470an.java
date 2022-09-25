package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.an */
/* compiled from: PG */
final class C102470an extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C102475as f285983a;

    public C102470an(C102475as asVar) {
        this.f285983a = asVar;
    }

    public final void onCloseWindow(WebView webView) {
        this.f285983a.f285996h.mo93267d();
    }

    public final void onReceivedTitle(WebView webView, String str) {
        this.f285983a.f286003o = str;
        C102462af afVar = (C102462af) this.f285983a.f285996h;
        afVar.f285945b.f285956i.mo85151p(new C102499y(afVar));
    }
}

package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.a.x */
/* compiled from: PG */
final class C100457x extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C100458y f280807a;

    public C100457x(C100458y yVar) {
        this.f280807a = yVar;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f280807a.f280813d.mo28212l("update canGoBack", new C100453t(this, webView.canGoBack()));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.loadUrl("about:blank");
        this.f280807a.f280813d.mo28212l("update error", new C100456w(this));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f280807a.f280813d.mo28212l("update canGoBack", new C100454u(this));
        if (str.startsWith("https://www.google.com/preferences")) {
            return false;
        }
        this.f280807a.f280813d.mo28212l("open url in CCT", new C100455v(this, Uri.parse(str)));
        return true;
    }
}

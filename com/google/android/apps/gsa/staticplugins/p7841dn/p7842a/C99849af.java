package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.af */
/* compiled from: PG */
final class C99849af extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C99850ag f279338a;

    public C99849af(C99850ag agVar) {
        this.f279338a = agVar;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f279338a.f279341c.mo28212l("update canGoBack", new C99848ae(this, webView.canGoBack()));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.loadUrl("about:blank");
        this.f279338a.f279341c.mo28212l("update error", new C99847ad(this));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f279338a.f279341c.mo28212l("update canGoBack", new C99845ab(this));
        Uri parse = Uri.parse(str);
        if (this.f279338a.f279346h.mo79554e(parse, false)) {
            return false;
        }
        this.f279338a.f279341c.mo28212l("open url in CCT", new C99846ac(this, parse));
        return true;
    }
}

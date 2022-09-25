package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.ab */
/* compiled from: PG */
final class C99902ab extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C99908ah f279470a;

    public C99902ab(C99908ah ahVar) {
        this.f279470a = ahVar;
    }

    public final void onProgressChanged(WebView webView, int i) {
        this.f279470a.f279483d.mo28212l("update progress in model", new C99901aa(this, i));
    }
}

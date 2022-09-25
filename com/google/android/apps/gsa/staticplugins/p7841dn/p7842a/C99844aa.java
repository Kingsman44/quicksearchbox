package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.aa */
/* compiled from: PG */
final class C99844aa extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C99850ag f279331a;

    public C99844aa(C99850ag agVar) {
        this.f279331a = agVar;
    }

    public final void onProgressChanged(WebView webView, int i) {
        this.f279331a.f279341c.mo28212l("update progress in model", new C99882z(this, i));
    }
}

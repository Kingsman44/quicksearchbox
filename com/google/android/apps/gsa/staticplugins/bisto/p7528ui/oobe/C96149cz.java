package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.webkit.WebView;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cz */
/* compiled from: PG */
public final /* synthetic */ class C96149cz implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ WebView f269165a;

    public /* synthetic */ C96149cz(WebView webView) {
        this.f269165a = webView;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        this.f269165a.setWebViewClient(new C96152db(cVar));
        return "EmbeddedWebViewClient loadUrlWithFuture";
    }
}

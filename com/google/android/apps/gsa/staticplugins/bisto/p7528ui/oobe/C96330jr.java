package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.jr */
/* compiled from: PG */
final class C96330jr extends WebViewClient {

    /* renamed from: a */
    private final C96327jo f269543a;

    public C96330jr(C96327jo joVar) {
        this.f269543a = joVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f269543a.mo90070a();
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f269543a.mo90070a();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}

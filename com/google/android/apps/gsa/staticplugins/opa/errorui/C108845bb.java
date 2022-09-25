package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bb */
/* compiled from: PG */
final class C108845bb extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C108846bc f302647a;

    public C108845bb(C108846bc bcVar) {
        this.f302647a = bcVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        int i = C108846bc.f302648e;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f302647a.f302651d.getDisplayedChild() != 0) {
            this.f302647a.f302651d.setDisplayedChild(1);
            this.f302647a.mo97224e();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2 = C108846bc.f302648e;
        C58976aa aaVar = C58975e.f156826a;
        this.f302647a.mo97225g();
    }
}

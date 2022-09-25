package com.google.android.apps.gsa.staticplugins.webview;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.DummyParcelable;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.eu */
/* compiled from: PG */
public final /* synthetic */ class C118241eu implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328261a;

    /* renamed from: b */
    public final /* synthetic */ WebView f328262b;

    /* renamed from: c */
    public final /* synthetic */ long f328263c;

    public /* synthetic */ C118241eu(C118248fa faVar, WebView webView, long j) {
        this.f328261a = faVar;
        this.f328262b = webView;
        this.f328263c = j;
    }

    public final void run() {
        C118248fa faVar = this.f328261a;
        WebView webView = this.f328262b;
        long j = this.f328263c;
        C86610af afVar = faVar.f328276c;
        C87684al alVar = new C87684al(C88244um.ATTACH_WEBVIEW);
        alVar.mo81966c(new DummyParcelable(webView));
        afVar.mo80229j(j, alVar.mo81964a());
    }
}

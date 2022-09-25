package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.DummyParcelable;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.am */
/* compiled from: PG */
public final /* synthetic */ class C114198am implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114206au f316657a;

    /* renamed from: b */
    public final /* synthetic */ long f316658b;

    /* renamed from: c */
    public final /* synthetic */ WebView f316659c;

    public /* synthetic */ C114198am(C114206au auVar, long j, WebView webView) {
        this.f316657a = auVar;
        this.f316658b = j;
        this.f316659c = webView;
    }

    public final void run() {
        C114206au auVar = this.f316657a;
        long j = this.f316658b;
        WebView webView = this.f316659c;
        C86610af afVar = auVar.f316677f;
        C87684al alVar = new C87684al(C88244um.ATTACH_WEBVIEW);
        alVar.mo81966c(new DummyParcelable(webView));
        afVar.mo80229j(j, alVar.mo81964a());
    }
}

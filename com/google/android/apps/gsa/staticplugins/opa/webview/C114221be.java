package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.be */
/* compiled from: PG */
public final class C114221be {

    /* renamed from: a */
    public final OpaWebView f316728a;

    /* renamed from: b */
    private final C22871g f316729b;

    /* renamed from: c */
    private final C84411o f316730c;

    /* renamed from: d */
    private final C89688a f316731d;

    public C114221be(OpaWebView opaWebView, C89688a aVar, C22871g gVar, C84411o oVar) {
        this.f316728a = opaWebView;
        this.f316729b = gVar;
        this.f316730c = oVar;
        this.f316731d = aVar;
    }

    @JavascriptInterface
    public void enterLiteMode(String str, String str2) {
        this.f316729b.mo28212l("enterLiteMode", new C114220bd(this));
        this.f316730c.mo77963a(str, str2, this.f316731d).mo77962d("{}");
    }

    @JavascriptInterface
    public void exitLiteMode(String str, String str2) {
        this.f316729b.mo28212l("exitLiteMode", new C114219bc(this));
        this.f316730c.mo77963a(str, str2, this.f316731d).mo77962d("{}");
    }
}

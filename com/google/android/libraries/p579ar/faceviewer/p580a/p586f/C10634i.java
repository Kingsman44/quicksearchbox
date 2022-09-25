package com.google.android.libraries.p579ar.faceviewer.p580a.p586f;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10645j;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10646k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.f.i */
/* compiled from: PG */
public final class C10634i implements C10646k {

    /* renamed from: a */
    public static final C59071e f35519a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.a.f.i");

    /* renamed from: b */
    public WebView f35520b;

    /* renamed from: c */
    private C10645j f35521c;

    public C10634i(Context context) {
        C10632g gVar = new C10632g(context);
        this.f35520b = gVar;
        gVar.getSettings().setJavaScriptEnabled(true);
        this.f35520b.setWebViewClient(new C10633h());
        this.f35520b.setBackgroundColor(0);
        this.f35520b.addJavascriptInterface(this, "ytArAdsAndroidBridge");
    }

    /* renamed from: g */
    public final void mo18671g() {
        this.f35520b.destroy();
        this.f35520b = null;
    }

    /* renamed from: h */
    public final void mo18672h(String str) {
        WebView webView = this.f35520b;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    /* renamed from: i */
    public final void mo18673i(String str) {
        WebView webView = this.f35520b;
        if (webView != null) {
            webView.post(new C10631f(this, str));
        }
    }

    /* renamed from: j */
    public final void mo18674j(C10645j jVar) {
        this.f35521c = jVar;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C10645j jVar = this.f35521c;
        if (jVar == null) {
            ((C59052c) ((C59052c) f35519a.mo56225c()).mo56372aa(42303)).mo56386p("Received message before handler is initialized.");
        } else {
            jVar.mo18663a(str);
        }
    }
}

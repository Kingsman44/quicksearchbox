package com.google.p3723ar.imp.core.web;

/* renamed from: com.google.ar.imp.core.web.e */
/* compiled from: PG */
public final /* synthetic */ class C47975e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImpWebViewBridge f124172a;

    /* renamed from: b */
    public final /* synthetic */ String f124173b;

    public /* synthetic */ C47975e(ImpWebViewBridge impWebViewBridge, String str) {
        this.f124172a = impWebViewBridge;
        this.f124173b = str;
    }

    public final void run() {
        ImpWebViewBridge impWebViewBridge = this.f124172a;
        impWebViewBridge.f124156c.evaluateJavascript(this.f124173b, C47976f.f124174a);
    }
}

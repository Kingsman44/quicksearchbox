package com.google.p3723ar.imp.core.web;

/* renamed from: com.google.ar.imp.core.web.c */
/* compiled from: PG */
public final /* synthetic */ class C47973c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImpWebViewBridge f124170a;

    public /* synthetic */ C47973c(ImpWebViewBridge impWebViewBridge) {
        this.f124170a = impWebViewBridge;
    }

    public final void run() {
        ImpWebViewBridge impWebViewBridge = this.f124170a;
        impWebViewBridge.f124156c.addJavascriptInterface(new C47978h(impWebViewBridge), "nativeEntryPoint");
        impWebViewBridge.f124156c.reload();
    }
}

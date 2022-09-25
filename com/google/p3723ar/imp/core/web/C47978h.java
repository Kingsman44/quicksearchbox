package com.google.p3723ar.imp.core.web;

import android.util.Base64;
import android.webkit.JavascriptInterface;

/* renamed from: com.google.ar.imp.core.web.h */
/* compiled from: PG */
final class C47978h {

    /* renamed from: a */
    final /* synthetic */ ImpWebViewBridge f124177a;

    public C47978h(ImpWebViewBridge impWebViewBridge) {
        this.f124177a = impWebViewBridge;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ImpWebViewBridge impWebViewBridge = this.f124177a;
        if (impWebViewBridge.f124156c != null && !impWebViewBridge.f124157d) {
            byte[] decode = Base64.decode(str, 0);
            if (decode.length != 0) {
                this.f124177a.f124156c.post(new C47977g(this, decode));
            }
        }
    }
}

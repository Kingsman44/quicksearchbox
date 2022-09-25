package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.ValueCallback;
import androidx.p201w.C4372p;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.s */
/* compiled from: PG */
public final /* synthetic */ class C114240s implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ OpaWebView f316793a;

    public /* synthetic */ C114240s(OpaWebView opaWebView) {
        this.f316793a = opaWebView;
    }

    public final void onReceiveValue(Object obj) {
        OpaWebView opaWebView = this.f316793a;
        String str = (String) obj;
        C4372p.m12528g(opaWebView, new C114241t(opaWebView));
    }
}

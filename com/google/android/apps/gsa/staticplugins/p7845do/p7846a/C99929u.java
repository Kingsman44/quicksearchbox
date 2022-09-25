package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.u */
/* compiled from: PG */
public final /* synthetic */ class C99929u implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ WebView f279559a;

    /* renamed from: b */
    public final /* synthetic */ String f279560b;

    public /* synthetic */ C99929u(WebView webView, String str) {
        this.f279559a = webView;
        this.f279560b = str;
    }

    public final void run() {
        this.f279559a.evaluateJavascript(this.f279560b, (ValueCallback) null);
    }
}

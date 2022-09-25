package com.google.ads.interactivemedia.p367v3.internal;

import android.webkit.WebView;

/* renamed from: com.google.ads.interactivemedia.v3.internal.u */
/* compiled from: PG */
final class C7325u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebView f23868a;

    /* renamed from: b */
    final /* synthetic */ String f23869b;

    public C7325u(WebView webView, String str) {
        this.f23868a = webView;
        this.f23869b = str;
    }

    public final void run() {
        this.f23868a.loadUrl(this.f23869b);
    }
}

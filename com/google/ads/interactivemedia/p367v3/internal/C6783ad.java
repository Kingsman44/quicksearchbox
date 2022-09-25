package com.google.ads.interactivemedia.p367v3.internal;

import android.webkit.WebView;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ad */
/* compiled from: PG */
public final class C6783ad extends C6782ac {
    public C6783ad(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo14416c(webView);
    }
}

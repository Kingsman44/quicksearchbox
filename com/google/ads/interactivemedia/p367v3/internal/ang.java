package com.google.ads.interactivemedia.p367v3.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ang */
/* compiled from: PG */
final class ang extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ anj f21030a;

    public ang(anj anj) {
        this.f21030a = anj;
    }

    public final void onPageFinished(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C7458yy.m22580c(valueOf.length() != 0 ? "Finished ".concat(valueOf) : new String("Finished "));
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String valueOf = String.valueOf(str);
        C7458yy.m22580c(valueOf.length() != 0 ? "Started ".concat(valueOf) : new String("Started "));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Error: ");
        sb.append(i);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        C7458yy.m22580c(sb.toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith("gmsg://")) {
            return false;
        }
        this.f21030a.mo15019d(str);
        return true;
    }
}

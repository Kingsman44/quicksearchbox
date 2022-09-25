package com.google.android.libraries.parenttools.youtube;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.libraries.parenttools.youtube.x */
/* compiled from: PG */
final class C31118x extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C31119y f83815a;

    public C31118x(C31119y yVar) {
        this.f83815a = yVar;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f83815a.f83816a.startActivity(new Intent("android.intent.action.VIEW").setData(webResourceRequest.getUrl()));
        return true;
    }
}

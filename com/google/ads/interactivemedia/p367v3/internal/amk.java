package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amk */
/* compiled from: PG */
final class amk extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ Context f20973a;

    /* renamed from: b */
    final /* synthetic */ ane f20974b;

    /* renamed from: c */
    final /* synthetic */ List f20975c;

    public amk(Context context, ane ane, List list) {
        this.f20973a = context;
        this.f20974b = ane;
        this.f20975c = list;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        webViewTransport.setWebView(new WebView(this.f20973a));
        webViewTransport.getWebView().setWebViewClient(new amj(this));
        message.sendToTarget();
        return true;
    }
}

package com.google.android.libraries.parenttools.youtube;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.google.android.libraries.parenttools.youtube.y */
/* compiled from: PG */
final class C31119y extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C31093aa f83816a;

    public C31119y(C31093aa aaVar) {
        this.f83816a = aaVar;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (z) {
            return false;
        }
        WebView webView2 = new WebView(this.f83816a.getContext());
        webView.addView(webView2);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        webView2.setWebViewClient(new C31118x(this));
        return true;
    }
}

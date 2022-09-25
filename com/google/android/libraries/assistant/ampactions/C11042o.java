package com.google.android.libraries.assistant.ampactions;

import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.libraries.assistant.ampactions.AmpWebView;

/* renamed from: com.google.android.libraries.assistant.ampactions.o */
/* compiled from: PG */
public final /* synthetic */ class C11042o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AmpWebView.AmpActionsHost f36274a;

    public /* synthetic */ C11042o(AmpWebView.AmpActionsHost ampActionsHost) {
        this.f36274a = ampActionsHost;
    }

    public final void run() {
        AmpWebView.AmpActionsHost ampActionsHost = this.f36274a;
        Log.d("AmpWebView", "Completing handshake with Viewer");
        AmpWebView ampWebView = AmpWebView.this;
        WebView webView = ampWebView.f36228a;
        String str = ampWebView.f36230c;
        webView.evaluateJavascript("ampactions.android.finishHandshake('" + str + "');", (ValueCallback) null);
    }
}

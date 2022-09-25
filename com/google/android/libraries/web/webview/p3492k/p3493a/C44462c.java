package com.google.android.libraries.web.webview.p3492k.p3493a;

import android.webkit.WebChromeClient;

/* renamed from: com.google.android.libraries.web.webview.k.a.c */
/* compiled from: PG */
final /* synthetic */ class C44462c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebChromeClient.CustomViewCallback f115563a;

    public C44462c(WebChromeClient.CustomViewCallback customViewCallback) {
        this.f115563a = customViewCallback;
    }

    public final void run() {
        this.f115563a.onCustomViewHidden();
    }
}

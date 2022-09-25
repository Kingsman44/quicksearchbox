package com.google.p3723ar.imp.core.web;

import android.util.Log;

/* renamed from: com.google.ar.imp.core.web.b */
/* compiled from: PG */
public final /* synthetic */ class C47972b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImpWebViewBridge f124168a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f124169b;

    public /* synthetic */ C47972b(ImpWebViewBridge impWebViewBridge, Runnable runnable) {
        this.f124168a = impWebViewBridge;
        this.f124169b = runnable;
    }

    public final void run() {
        ImpWebViewBridge impWebViewBridge = this.f124168a;
        Runnable runnable = this.f124169b;
        if (impWebViewBridge.f124156c == null) {
            Log.e("ImpWeb Error", "Tried to post runnable to a null WebView.");
        }
        runnable.run();
    }
}

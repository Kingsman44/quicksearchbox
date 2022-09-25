package com.google.android.apps.gsa.assistant.settings.p526e;

import android.webkit.WebView;
import com.google.android.apps.gsa.assistant.settings.base.C9511m;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.g */
/* compiled from: PG */
public final /* synthetic */ class C9755g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9761m f33671a;

    /* renamed from: b */
    public final /* synthetic */ C9511m f33672b;

    public /* synthetic */ C9755g(C9761m mVar, C9511m mVar2) {
        this.f33671a = mVar;
        this.f33672b = mVar2;
    }

    public final void run() {
        C9761m mVar = this.f33671a;
        C9511m mVar2 = this.f33672b;
        WebView webView = mVar.f33686i;
        if (webView == null || !webView.canGoBack()) {
            mVar2.mo17823B();
        } else {
            mVar.f33686i.goBack();
        }
    }
}

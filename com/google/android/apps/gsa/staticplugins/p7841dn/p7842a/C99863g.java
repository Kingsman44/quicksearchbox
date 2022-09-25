package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.g */
/* compiled from: PG */
public final /* synthetic */ class C99863g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ WebView f279393a;

    /* renamed from: b */
    public final /* synthetic */ String f279394b;

    public /* synthetic */ C99863g(WebView webView, String str) {
        this.f279393a = webView;
        this.f279394b = str;
    }

    public final void run() {
        this.f279393a.evaluateJavascript(this.f279394b, (ValueCallback) null);
    }
}

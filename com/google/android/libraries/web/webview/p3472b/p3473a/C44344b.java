package com.google.android.libraries.web.webview.p3472b.p3473a;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.webview.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C44344b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f115323a = "JSON.parse(Array.from(document.scripts).filter(script => script.type==\"application/ld+json\")[0].textContent)";

    /* renamed from: b */
    public final /* synthetic */ ValueCallback f115324b;

    public /* synthetic */ C44344b(ValueCallback valueCallback) {
        this.f115324b = valueCallback;
    }

    public final void accept(Object obj) {
        ((WebView) obj).evaluateJavascript(this.f115323a, this.f115324b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.gsa.search.core.webview;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.p201w.C4370n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.search.core.webview.x */
/* compiled from: PG */
public final class C87278x {

    /* renamed from: e */
    private static final C59071e f235735e = C59071e.m91332i("com.google.android.apps.gsa.search.core.webview.x");

    /* renamed from: a */
    public final WebView f235736a;

    /* renamed from: b */
    public final AtomicInteger f235737b = new AtomicInteger(0);

    /* renamed from: c */
    public final AtomicInteger f235738c = new AtomicInteger(0);

    /* renamed from: d */
    public final C4370n f235739d;

    public C87278x(WebView webView, C4370n nVar) {
        this.f235736a = webView;
        this.f235739d = nVar;
    }

    /* renamed from: a */
    public final void mo80922a() {
        this.f235737b.incrementAndGet();
        this.f235736a.destroy();
    }

    /* renamed from: b */
    public final void mo80923b(String str, ValueCallback valueCallback) {
        try {
            this.f235736a.evaluateJavascript(str, valueCallback);
        } catch (IllegalStateException | NoSuchMethodError e) {
            ((C59052c) ((C59052c) ((C59052c) f235735e.mo56225c()).mo56382g(e)).mo56372aa(9518)).mo56386p("KK is not supported");
        }
    }

    /* renamed from: c */
    public final void mo80924c() {
        this.f235737b.incrementAndGet();
        this.f235736a.goBack();
    }

    /* renamed from: d */
    public final void mo80925d(String str) {
        this.f235737b.incrementAndGet();
        this.f235738c.incrementAndGet();
        this.f235736a.loadUrl(str);
    }
}

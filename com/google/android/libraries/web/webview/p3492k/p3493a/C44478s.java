package com.google.android.libraries.web.webview.p3492k.p3493a;

import android.webkit.WebView;
import com.google.android.libraries.web.base.p3348b.p3349a.C43239d;
import com.google.android.libraries.web.contrib.p3367d.p3370b.p3371a.C43467a;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3695e.C47605b;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3695e.C47606c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.k.a.s */
/* compiled from: PG */
public final class C44478s implements C43239d {

    /* renamed from: a */
    private final WebView f115626a;

    /* renamed from: b */
    private final C47606c f115627b;

    public C44478s(WebView webView, C47606c cVar) {
        this.f115626a = webView;
        this.f115627b = cVar;
    }

    /* renamed from: a */
    public final void mo46320a() {
        this.f115626a.clearMatches();
    }

    /* renamed from: b */
    public final void mo46321b(String str) {
        C69664n.m101061g(str, "query");
        this.f115626a.findAllAsync(str);
    }

    /* renamed from: c */
    public final void mo46322c() {
        this.f115626a.findNext(true);
    }

    /* renamed from: d */
    public final void mo46323d() {
        this.f115626a.findNext(false);
    }

    /* renamed from: e */
    public final boolean mo46324e(C43467a aVar) {
        this.f115626a.setFindListener(new C47605b(this.f115627b, new C44477r(aVar)));
        return true;
    }
}

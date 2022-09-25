package com.google.android.libraries.web.webview.p3487i.p3490b;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.libraries.web.webview.i.b.j */
/* compiled from: PG */
final class C44444j implements ValueCallback {

    /* renamed from: a */
    final /* synthetic */ C69577g f115526a;

    /* renamed from: b */
    final /* synthetic */ C44447m f115527b;

    /* renamed from: c */
    final /* synthetic */ CookieManager f115528c;

    public C44444j(C69577g gVar, C44447m mVar, CookieManager cookieManager) {
        this.f115526a = gVar;
        this.f115527b = mVar;
        this.f115528c = cookieManager;
    }

    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            this.f115526a.mo61338mb(C69714l.m101133a(new RuntimeException("Failed to remove cookies from WebView")));
        } else {
            this.f115527b.f115534b.mo46977a(C44443i.f115525a);
            this.f115526a.mo61338mb(C69788q.f186170a);
        }
        this.f115528c.flush();
    }
}

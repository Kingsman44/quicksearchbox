package com.google.android.libraries.p11026am;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.google.android.libraries.am.a */
/* compiled from: PG */
public abstract class C147758a extends WebViewClient {

    /* renamed from: a */
    private final C147764g f398701a;

    /* renamed from: b */
    private final C147764g f398702b;

    /* renamed from: c */
    public boolean f398703c = false;

    static {
        C58974d.m91134h("SaferWebViewClient");
    }

    public C147758a(C147764g gVar, C147764g gVar2) {
        this.f398701a = gVar;
        this.f398702b = gVar2;
    }

    /* renamed from: f */
    private static WebResourceResponse m240826f() {
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not allowlisted", (Map) null, (InputStream) null);
    }

    /* renamed from: g */
    private static boolean m240827g(WebView webView, boolean z, boolean z2) {
        if (z2) {
            return true;
        }
        if (z) {
            return false;
        }
        webView.loadUrl("about:invalid#zSaferWebViewz");
        return true;
    }

    /* renamed from: h */
    private final boolean m240828h(Uri uri) {
        boolean z = true;
        if (!C147763f.f398708a.matcher(uri.toString()).find() && !this.f398702b.mo124438c(uri)) {
            z = false;
        }
        if (!z) {
            C147763f.m240841b(uri);
        }
        return z;
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo18027b(String str) {
        return false;
    }

    /* renamed from: c */
    public boolean mo18914c(WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl().toString();
        return false;
    }

    @Deprecated
    /* renamed from: d */
    public boolean mo29447d(WebResourceRequest webResourceRequest) {
        return mo18027b(webResourceRequest.getUrl().toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract WebResourceResponse mo124432e();

    /* renamed from: j */
    public boolean mo18915j(WebView webView, WebResourceRequest webResourceRequest) {
        return mo29447d(webResourceRequest);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        WebResourceResponse e = mo124432e();
        if (e != null) {
            return e;
        }
        if (this.f398703c || m240828h(webResourceRequest.getUrl())) {
            return null;
        }
        return m240826f();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean c = this.f398701a.mo124438c(webResourceRequest.getUrl());
        return m240827g(webView, c, c ? mo18914c(webResourceRequest) : mo18915j(webView, webResourceRequest));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri.parse(str);
        WebResourceResponse e = mo124432e();
        if (e != null) {
            return e;
        }
        if (this.f398703c || m240828h(Uri.parse(str))) {
            return null;
        }
        return m240826f();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        boolean c = this.f398701a.mo124438c(Uri.parse(str));
        if (c) {
            z = false;
        } else {
            z = mo18027b(str);
        }
        return m240827g(webView, c, z);
    }
}

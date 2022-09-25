package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anj */
/* compiled from: PG */
final class anj {

    /* renamed from: a */
    private final anh f21031a;

    /* renamed from: b */
    private final WebView f21032b;

    /* renamed from: c */
    private final Handler f21033c;

    public anj(Handler handler, WebView webView, anh anh) {
        this.f21033c = handler;
        this.f21032b = webView;
        this.f21031a = anh;
        webView.setBackgroundColor(0);
        webView.getSettings().setMixedContentMode(0);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new ang(this));
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        instance.setAcceptThirdPartyCookies(webView, true);
    }

    /* renamed from: a */
    public final WebView mo15016a() {
        return this.f21032b;
    }

    /* renamed from: b */
    public final void mo15017b(String str) {
        this.f21032b.loadUrl(str);
    }

    /* renamed from: c */
    public final void mo15018c(amx amx) {
        this.f21033c.post(new anf(this, amx));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo15019d(String str) {
        try {
            amx a = amx.m19012a(str);
            String obj = a.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 32 + String.valueOf(str).length());
            sb.append("Received Javascript msg: ");
            sb.append(obj);
            sb.append("; URL: ");
            sb.append(str);
            C7458yy.m22580c(sb.toString());
            this.f21031a.mo14998d(a);
        } catch (IllegalArgumentException unused) {
            String valueOf = String.valueOf(str);
            C7458yy.m22581d(valueOf.length() != 0 ? "Invalid internal message. Please make sure the Google IMA SDK library is up to date. Message: ".concat(valueOf) : new String("Invalid internal message. Please make sure the Google IMA SDK library is up to date. Message: "));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(str);
            C7458yy.m22582e(valueOf2.length() != 0 ? "Invalid internal message. Message could not be be parsed: ".concat(valueOf2) : new String("Invalid internal message. Message could not be be parsed: "), e);
        }
    }

    /* renamed from: e */
    public final void mo15020e() {
        this.f21032b.destroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo15021f(amx amx) {
        String f = amx.mo14986f();
        String valueOf = String.valueOf(amx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(f).length());
        sb.append("Sending Javascript msg: ");
        sb.append(valueOf);
        sb.append("; URL: ");
        sb.append(f);
        C7458yy.m22580c(sb.toString());
        try {
            this.f21032b.evaluateJavascript(f, (ValueCallback) null);
        } catch (IllegalStateException unused) {
            this.f21032b.loadUrl(f);
        }
    }
}

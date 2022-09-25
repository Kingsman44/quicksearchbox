package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.p201w.C4370n;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6513aj.C84563w;
import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import com.google.android.apps.gsa.shared.util.C90763bg;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.ao */
/* compiled from: PG */
final class C102471ao extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C102475as f285984a;

    public C102471ao(C102475as asVar) {
        this.f285984a = asVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (this.f285984a.f285997i.mo93291b(str)) {
            this.f285984a.f285996h.mo93266c();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f285984a.f285996h.mo93265b(new C84563w("Page load failed: errorCode %d, description %s, failingUrl %s", Integer.valueOf(i), str, str2));
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f285984a.f285996h.mo93265b("Page load failed - received HTTP Auth request");
    }

    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f285984a.f285996h.mo93265b("Page load failed - received Login request");
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f285984a.f285996h.mo93265b("Page load failed - received SSL error");
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C4370n nVar = this.f285984a.f285991c.f235739d;
        if (nVar == null) {
            return null;
        }
        return nVar.mo9291a(webResourceRequest.getUrl());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C102475as asVar = this.f285984a;
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        if (!asVar.f285990b.mo79554e(parse, true) || !asVar.f285992d.mo79742A(uri)) {
            if (asVar.f285990b.mo79554e(parse, true)) {
                String uri2 = parse.toString();
                synchronized (asVar.f285999k) {
                    if (C90763bg.m148264d(uri2, asVar.f285999k)) {
                        return false;
                    }
                }
            }
            C102462af afVar = (C102462af) asVar.f285996h;
            afVar.f285945b.f285956i.mo85151p(new C102457aa(afVar, str));
            return true;
        }
        asVar.f285996h.mo93264a(new Request(parse, C58528ij.m90006F(asVar.f285999k), asVar.f285998j.f236602c));
        return true;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C102475as asVar = this.f285984a;
        C4370n nVar = asVar.f285991c.f235739d;
        if (nVar != null) {
            return nVar.mo9291a(Uri.parse(str));
        }
        if (!asVar.f285994f.equals(str)) {
            return null;
        }
        if (this.f285984a.f285995g.compareAndSet(false, true)) {
            return this.f285984a.f285993e.f285933a.mo81511a();
        }
        this.f285984a.mo93293a(new C84563w("Content for %s apparently requested multiple times", C85929cw.m138091v(str)));
        return null;
    }
}

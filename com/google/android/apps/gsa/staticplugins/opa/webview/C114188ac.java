package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7030bj.C89689b;
import com.google.android.apps.gsa.shared.p7030bj.C89691d;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90726aj;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114214b;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114215c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4522b.C58495hd;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ac */
/* compiled from: PG */
final class C114188ac extends WebViewClient {

    /* renamed from: a */
    public final C68214a f316601a;

    /* renamed from: b */
    public final C68214a f316602b;

    /* renamed from: c */
    public final C68214a f316603c;

    /* renamed from: d */
    public final C114214b f316604d;

    /* renamed from: e */
    public boolean f316605e;

    /* renamed from: f */
    public Query f316606f;

    /* renamed from: g */
    public C87504b f316607g;

    /* renamed from: h */
    final AtomicReference f316608h = new AtomicReference();

    /* renamed from: i */
    public final AtomicReference f316609i = new AtomicReference();

    /* renamed from: j */
    private final C86130z f316610j;

    /* renamed from: k */
    private final C22871g f316611k;

    /* renamed from: l */
    private final C22871g f316612l;

    /* renamed from: m */
    private String f316613m = "about:blank";

    public C114188ac(C86130z zVar, C22871g gVar, C22871g gVar2, C68214a aVar, C68214a aVar2, C68214a aVar3, C91097g gVar3, C114215c cVar) {
        this.f316610j = zVar;
        this.f316611k = gVar;
        this.f316612l = gVar2;
        this.f316601a = aVar;
        this.f316602b = aVar2;
        this.f316603c = aVar3;
        this.f316604d = cVar.mo101265a(gVar3);
    }

    /* renamed from: a */
    public static int m189438a(Map map, String str) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return Integer.parseInt(str2);
        }
        throw new NumberFormatException("null");
    }

    /* renamed from: f */
    private final void m189439f() {
        C114187ab abVar = (C114187ab) this.f316609i.get();
        abVar.getClass();
        abVar.f316598a.mo57356n(C118826c.f331422a);
    }

    /* renamed from: g */
    private final void m189440g(C89849ae aeVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        Query query = this.f316606f;
        query.getClass();
        fVar.mo83701c("rId", Long.toString(query.f252749G));
        ((C89859i) this.f316603c.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: h */
    private static void m189441h(WebView webView) {
        if (webView instanceof OpaWebView) {
            OpaWebView opaWebView = (OpaWebView) webView;
            if (opaWebView.f316493b != 0) {
                opaWebView.mo101226e(new C114240s(opaWebView));
            } else {
                opaWebView.mo101227f();
            }
            opaWebView.f316498g = true;
        }
    }

    /* renamed from: i */
    private final boolean m189442i(Uri uri) {
        String uri2 = uri.toString();
        if ("about:blank".equals(uri2)) {
            return false;
        }
        C87504b bVar = this.f316607g;
        bVar.getClass();
        if (C114209ax.m189476b(bVar.f236337b.f236331a.toString(), uri2)) {
            return true;
        }
        C114214b bVar2 = this.f316604d;
        Query query = this.f316606f;
        query.getClass();
        if (bVar2.mo101264a(query, uri2, (String) null)) {
            return true;
        }
        this.f316611k.mo28212l("HandleUrl", new C114186aa(this, uri));
        ((C89859i) this.f316603c.mo27525b()).mo83702b(C89849ae.OPA_SRP_RESULT_CLICK);
        return true;
    }

    /* renamed from: b */
    public final long mo101244b() {
        C87504b bVar = this.f316607g;
        bVar.getClass();
        String queryParameter = bVar.f236337b.f236331a.getQueryParameter("qsd");
        if (queryParameter == null) {
            return 0;
        }
        try {
            return (long) Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public final void mo101245c() {
        C89691d dVar = (C89691d) this.f316608h.getAndSet((Object) null);
        if (dVar != null) {
            dVar.mo83592a();
        }
    }

    /* renamed from: d */
    public final void mo101246d(C90456c cVar) {
        this.f316611k.mo28212l("handleGsaError", new C114245x(this, cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo101247e(C87504b bVar, Query query) {
        this.f316606f = query;
        this.f316607g = bVar;
        C114187ab abVar = (C114187ab) this.f316609i.getAndSet(new C114187ab(this.f316612l));
        if (abVar != null) {
            abVar.mo101243c();
        }
        mo101245c();
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        if (!"about:blank".equals(str)) {
            m189439f();
            m189441h(webView);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!"about:blank".equals(str)) {
            webView.evaluateJavascript(this.f316610j.mo79763b(), (ValueCallback) null);
            m189439f();
            C114187ab abVar = (C114187ab) this.f316609i.get();
            abVar.getClass();
            abVar.f316599b.mo57356n(C118826c.f331422a);
            m189441h(webView);
            if (C114209ax.m189476b(this.f316613m, str)) {
                m189440g(C89849ae.OPA_WEBVIEW_LOAD_END);
                this.f316613m = "about:blank";
            }
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!"about:blank".equals(str)) {
            this.f316605e = false;
            m189440g(C89849ae.OPA_WEBVIEW_LOAD_START);
            this.f316613m = str;
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        mo101246d(new C90457d(str, C89689b.m146069a(i)));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Optional optional;
        C87504b bVar = this.f316607g;
        bVar.getClass();
        Uri uri = bVar.f236337b.f236331a;
        Uri url = webResourceRequest.getUrl();
        if (!TextUtils.equals(url.getPath(), "/gen_204") || !TextUtils.equals(url.getQueryParameter("atyp"), "csi") || !TextUtils.equals(url.getQueryParameter(C59002s.f156871a), "web")) {
            optional = Optional.empty();
        } else {
            String queryParameter = url.getQueryParameter("rt");
            if (queryParameter == null) {
                optional = Optional.empty();
            } else {
                try {
                    C58495hd a = new C90726aj(",", "\\.").mo85085a(queryParameter);
                    if (a != null) {
                        optional = Optional.m71637of(new C114165a(TextUtils.equals(url.getQueryParameter(C42181t.f110467a), "aft"), a));
                    } else {
                        throw new NullPointerException("Null metrics");
                    }
                } catch (IllegalArgumentException unused) {
                    optional = Optional.empty();
                }
            }
        }
        optional.ifPresent(new C114246y(this));
        if (C114209ax.m189476b(uri.toString(), url.toString())) {
            m189440g(C89849ae.OPA_WEBVIEW_INJECT_RESPONSE);
            C87504b bVar2 = this.f316607g;
            bVar2.getClass();
            WebResourceResponse a2 = bVar2.mo81511a();
            if (a2 == null) {
                mo101246d(new C90457d("No page in cache", (int) C89885b.WEBVIEW_WEBRESOURCERESPONSE_UNAVAILABLE_VALUE));
            } else {
                C89691d dVar = new C89691d(a2.getData(), new C114247z(this));
                this.f316608h.set(dVar);
                a2.setData(dVar);
                return a2;
            }
        }
        m189439f();
        return null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return m189442i(webResourceRequest.getUrl());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m189442i(Uri.parse(str));
    }
}

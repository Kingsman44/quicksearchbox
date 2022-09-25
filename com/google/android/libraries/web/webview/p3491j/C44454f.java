package com.google.android.libraries.web.webview.p3491j;

import android.content.Context;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44468i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62934bn;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p5462h.p5463a.C69497an;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.j.f */
/* compiled from: PG */
public final class C44454f extends WebView {

    /* renamed from: c */
    private static final C59071e f115545c = C59071e.m91331h();

    /* renamed from: a */
    public C44451c f115546a;

    /* renamed from: b */
    public final Set f115547b = new LinkedHashSet();

    /* renamed from: d */
    private final Set f115548d = new LinkedHashSet();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44454f(Context context) {
        super(context);
        C69664n.m101061g(context, "context");
    }

    /* renamed from: g */
    private final Map m78514g() {
        C44451c cVar = this.f115546a;
        if (cVar == null) {
            return C69497an.f185919a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C44468i iVar = (C44468i) cVar;
        C43367l lVar = iVar.f115582a.mo46439a().f113335h;
        if (lVar == null) {
            lVar = C43367l.f113293h;
        }
        C62934bn builder = lVar.toBuilder();
        C69664n.m101060f(builder, "webStateModel.webState.pendingRequest.toBuilder()");
        iVar.mo47346b(linkedHashMap, (C43364i) builder);
        return C69505av.m100875q(linkedHashMap);
    }

    /* renamed from: a */
    public final void mo47307a(C44082a aVar, C44453e eVar) {
        C69664n.m101061g(aVar, "restricted");
        this.f115548d.add(eVar);
    }

    /* renamed from: b */
    public final void mo47308b(C44082a aVar, String str, Map map) {
        C69664n.m101061g(aVar, "restricted");
        C69664n.m101061g(str, "url");
        Map g = m78514g();
        if (map == null || map.isEmpty()) {
            map = g;
        } else if (!g.isEmpty()) {
            map = C69505av.m100876r(map);
            map.putAll(g);
        }
        mo47312f(str, map);
    }

    /* renamed from: c */
    public final void mo47309c(C44082a aVar, int i) {
        C69664n.m101061g(aVar, "restricted");
        super.setBackgroundColor(i);
    }

    /* renamed from: d */
    public final void mo47310d(C44082a aVar, WebChromeClient webChromeClient) {
        C69664n.m101061g(aVar, "restricted");
        super.setWebChromeClient(webChromeClient);
    }

    /* renamed from: e */
    public final void mo47311e(C44082a aVar, WebViewClient webViewClient) {
        C69664n.m101061g(aVar, "restricted");
        super.setWebViewClient(webViewClient);
    }

    /* renamed from: f */
    public final void mo47312f(String str, Map map) {
        if (map == null || map.isEmpty()) {
            super.loadUrl(str);
        } else {
            super.loadUrl(str, C69505av.m100876r(map));
        }
    }

    public final void goBack() {
        super.goBack();
        m78514g();
    }

    public final void goBackOrForward(int i) {
        m78514g();
        super.goBackOrForward(i);
    }

    public final void goForward() {
        super.goForward();
        m78514g();
    }

    public final void loadUrl(String str) {
        C69664n.m101061g(str, "url");
        C59052c cVar = (C59052c) f115545c.mo56226d();
        cVar.mo56379ah(new C59094n(54234));
        cVar.mo56386p("Calling WebView#loadUrl directly is deprecated, use WebController instead");
        mo47308b(C44082a.f114755a, str, (Map) null);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        for (C44453e f : this.f115548d) {
            f.mo47233f(i2);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        for (C44452d e : this.f115547b) {
            e.mo47232e(i2, i4, i6, z);
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public final void reload() {
        m78514g();
        super.reload();
    }

    public final WebBackForwardList restoreState(Bundle bundle) {
        C69664n.m101061g(bundle, "inState");
        return super.restoreState(bundle);
    }

    public final void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("Use one of the methods in com.google.android.libraries.web.base.WebConfig instead.");
    }

    public final void setDownloadListener(DownloadListener downloadListener) {
        throw new UnsupportedOperationException("Use download contrib package under libraries/web/webview/contrib/download instead.");
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        throw new UnsupportedOperationException("WebChromeClient is provided and managed by WebX. Consider using one of the callbacks in libraries/web/webview/callbacks or let agsa-web@ know if they do not cover your use-case.");
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        C69664n.m101061g(webViewClient, "client");
        throw new UnsupportedOperationException("WebViewClient is provided and managed by WebX. Consider using one of the callbacks in libraries/web/webview/callbacks or let agsa-web@ know if they do not cover your use-case.");
    }

    public final void loadUrl(String str, Map map) {
        C69664n.m101061g(str, "url");
        C69664n.m101061g(map, "additionalHttpHeaders");
        C59052c cVar = (C59052c) f115545c.mo56226d();
        cVar.mo56379ah(new C59094n(54235));
        cVar.mo56386p("Calling WebView#loadUrl directly is deprecated, use WebController instead");
        mo47308b(C44082a.f114755a, str, map);
    }
}

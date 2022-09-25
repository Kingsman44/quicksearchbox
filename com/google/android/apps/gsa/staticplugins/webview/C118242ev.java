package com.google.android.apps.gsa.staticplugins.webview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.webview.AutoValue_GsaWebViewContainer;
import com.google.android.apps.gsa.search.core.webview.C87260f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90776bt;
import com.google.android.apps.gsa.shared.util.C91033e;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.webview.common.C118180a;
import com.google.android.apps.gsa.staticplugins.webview.common.C118181b;
import com.google.android.apps.gsa.staticplugins.webview.common.GsaWebView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ev */
/* compiled from: PG */
public final /* synthetic */ class C118242ev implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328264a;

    /* renamed from: b */
    public final /* synthetic */ C87260f f328265b;

    public /* synthetic */ C118242ev(C118248fa faVar, C87260f fVar) {
        this.f328264a = faVar;
        this.f328265b = fVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118248fa faVar = this.f328264a;
        C87260f fVar = this.f328265b;
        long incrementAndGet = faVar.f328281j.f254534a.incrementAndGet();
        C118152bo boVar = faVar.f328278g;
        String l = Long.toString(incrementAndGet);
        C58976aa aaVar = C58975e.f156826a;
        C118186ct ctVar = (C118186ct) boVar.f327923b.mo27525b();
        C91033e eVar = new C91033e(ctVar.f328107a);
        C90476a aVar = C91018d.f254254a;
        LayoutInflater from = LayoutInflater.from(eVar);
        C85757cq cqVar = (C85757cq) ctVar.f328111e.mo27525b();
        GsaWebView gsaWebView = (GsaWebView) from.inflate(R.layout.simple_gsa_web_view, (ViewGroup) null, false);
        eVar.mo85312b(gsaWebView);
        cqVar.mo79412c(gsaWebView);
        WebSettings settings = gsaWebView.getSettings();
        settings.setUserAgentString(cqVar.mo6453a());
        settings.setAllowFileAccess(false);
        C90776bt.m148327a();
        gsaWebView.mo103585a(new C118180a());
        gsaWebView.mo103586b(new C118181b());
        gsaWebView.getSettings().setJavaScriptEnabled(true);
        CookieManager instance = CookieManager.getInstance();
        if (instance != null) {
            instance.setAcceptThirdPartyCookies(gsaWebView, true);
        } else {
            C59104x c = C118152bo.f327920a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaWebViewPool");
            ((C59052c) ((C59052c) c).mo56372aa(33827)).mo56386p("Cookie Manager is null");
        }
        boVar.mo103562d(fVar);
        AutoValue_GsaWebViewContainer autoValue_GsaWebViewContainer = new AutoValue_GsaWebViewContainer(gsaWebView, l);
        synchronized (boVar.f327930i) {
            boVar.f327931j.put(l, autoValue_GsaWebViewContainer);
        }
        return autoValue_GsaWebViewContainer;
    }
}

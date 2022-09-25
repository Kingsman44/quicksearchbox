package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.x */
/* compiled from: PG */
public final /* synthetic */ class C99880x implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C99850ag f279419a;

    /* renamed from: b */
    public final /* synthetic */ String f279420b;

    public /* synthetic */ C99880x(C99850ag agVar, String str) {
        this.f279419a = agVar;
        this.f279420b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C99850ag agVar = this.f279419a;
        String str = this.f279420b;
        GsaWebViewContainer gsaWebViewContainer = (GsaWebViewContainer) obj;
        WebView a = gsaWebViewContainer.mo80858a();
        C58893dc.m90996a(a);
        String b = gsaWebViewContainer.mo80859b();
        a.setFocusable(true);
        a.setFocusableInTouchMode(true);
        WebSettings settings = a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(false);
        a.loadUrl(str);
        if (agVar.mo91641q()) {
            agVar.f279350l.getClass();
            C99861e eVar = agVar.f279349k;
            b.getClass();
            C99852ai aiVar = (C99852ai) eVar.f279391a.mo17428b();
            aiVar.getClass();
            C99860d dVar = new C99860d(b, aiVar);
            C99869m mVar = new C99869m(agVar, a);
            C84411o oVar = (C84411o) ((C99856am) agVar.f279345g.mo27525b()).f279380a.mo17428b();
            oVar.getClass();
            a.addJavascriptInterface(new C99855al(dVar, mVar, oVar), "silk_pane_ext");
        } else {
            C99858b a2 = agVar.f279348j.mo91654a(b);
            C99879w wVar = new C99879w(agVar, a);
            C84411o oVar2 = (C84411o) ((C99854ak) agVar.f279344f.mo27525b()).f279378a.mo17428b();
            oVar2.getClass();
            a.addJavascriptInterface(new C99853aj(a2, wVar, oVar2), "silk_pane_ext");
        }
        a.addJavascriptInterface(agVar.f279348j.mo91654a(b).getClass(), "silk_close_ext");
        a.addJavascriptInterface(agVar.f279352n.mo91593a(), "silk_download_ext");
        a.addJavascriptInterface(agVar.f279351m.mo91596a(new C99875s(agVar, a)), "silk_geolocation_ext");
        a.addJavascriptInterface(agVar.f279353o.mo91614a(new C99870n(agVar, a)), "silk_share_ext");
        agVar.mo91638n(a);
        agVar.mo91639o(a);
        agVar.mo91640p(gsaWebViewContainer);
        return gsaWebViewContainer;
    }
}

package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.content.ClipboardManager;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.shared.p7066m.C90076ea;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7840o.C99841c;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7840o.C99842d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.r */
/* compiled from: PG */
public final /* synthetic */ class C99926r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279551a;

    /* renamed from: b */
    public final /* synthetic */ String f279552b;

    public /* synthetic */ C99926r(C99908ah ahVar, String str) {
        this.f279551a = ahVar;
        this.f279552b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C99908ah ahVar = this.f279551a;
        String str = this.f279552b;
        GsaWebViewContainer gsaWebViewContainer = (GsaWebViewContainer) obj;
        WebView a = gsaWebViewContainer.mo80858a();
        C58893dc.m90996a(a);
        a.getSettings().setMixedContentMode(2);
        a.setFocusable(true);
        a.setFocusableInTouchMode(true);
        WebSettings settings = a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(false);
        settings.setUserAgentString(String.valueOf(settings.getUserAgentString()).concat(" Taskhub"));
        a.loadUrl(str, ahVar.mo91673f());
        ahVar.mo91679m(a);
        ahVar.mo91680n(a);
        a.addJavascriptInterface(ahVar.f279499t.mo91593a(), "silk_download_ext");
        a.addJavascriptInterface(ahVar.f279498s.mo91596a(new C99921m(ahVar)), "silk_geolocation_ext");
        a.addJavascriptInterface(ahVar.f279500u.mo91614a(new C99921m(ahVar)), "silk_share_ext");
        a.addJavascriptInterface(ahVar.f279501v.mo91591a(new C99921m(ahVar)), "silk_collections_v2_ext");
        C99842d dVar = ahVar.f279502w;
        C91097g gVar = (C91097g) dVar.f279315a.mo17428b();
        gVar.getClass();
        ((C84411o) dVar.f279316b.mo17428b()).getClass();
        C22871g gVar2 = (C22871g) dVar.f279317c.mo17428b();
        gVar2.getClass();
        C86034c cVar = (C86034c) dVar.f279318d.mo17428b();
        cVar.getClass();
        Context context = (Context) dVar.f279319e.mo17428b();
        context.getClass();
        a.addJavascriptInterface(new C99841c(gVar, gVar2, cVar, context), "silk_signin_ext");
        if (ahVar.f279492m.mo79746e(C90076ea.f249784e)) {
            ClipboardManager clipboardManager = (ClipboardManager) ahVar.f279482c.getSystemService("clipboard");
            clipboardManager.getClass();
            a.addJavascriptInterface(new C99907ag(clipboardManager), "AgaCollectionsWriteToClipboardInterface");
        }
        return gsaWebViewContainer;
    }
}

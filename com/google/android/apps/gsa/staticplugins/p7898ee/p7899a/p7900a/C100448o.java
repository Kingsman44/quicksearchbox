package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.staticplugins.p7390am.C93953a;
import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7901b.C100463d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C100448o implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C100458y f280793a;

    /* renamed from: b */
    public final /* synthetic */ String f280794b;

    public /* synthetic */ C100448o(C100458y yVar, String str) {
        this.f280793a = yVar;
        this.f280794b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C100458y yVar = this.f280793a;
        String str = this.f280794b;
        GsaWebViewContainer gsaWebViewContainer = (GsaWebViewContainer) obj;
        WebView a = gsaWebViewContainer.mo80858a();
        if (a != null) {
            String b = gsaWebViewContainer.mo80859b();
            yVar.mo91928l(a);
            int i = 1;
            a.setFocusable(true);
            a.setFocusableInTouchMode(true);
            WebSettings settings = a.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(false);
            if (true == yVar.f280812c) {
                i = 2;
            }
            settings.setForceDark(i);
            UriRequest z = ((C85929cw) yVar.f280816g.mo27525b()).mo79581z(str);
            a.loadUrl(z.f236331a.toString(), z.mo81502a());
            C100436c cVar = yVar.f280820k;
            b.getClass();
            C100434aa aaVar = (C100434aa) cVar.f280781a.mo17428b();
            aaVar.getClass();
            a.addJavascriptInterface(new C100435b(b, aaVar).getClass(), "silk_close_ext");
            a.addJavascriptInterface(new C93953a(new C100438e(yVar)), "silk_discover_ext");
            yVar.mo91929m(gsaWebViewContainer);
        } else {
            ((C59052c) ((C59052c) C100458y.f280808a.mo56225c()).mo56372aa(33401)).mo56386p("No WebView found.");
            yVar.mo91927k(C100463d.INTERNAL_ERROR);
        }
        return gsaWebViewContainer;
    }
}

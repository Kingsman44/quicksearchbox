package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.t */
/* compiled from: PG */
public final /* synthetic */ class C99876t implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99850ag f279413a;

    public /* synthetic */ C99876t(C99850ag agVar) {
        this.f279413a = agVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99850ag agVar = this.f279413a;
        C58833ax axVar = (C58833ax) obj;
        GsaWebViewContainer gsaWebViewContainer = axVar.mo56113h() ? (GsaWebViewContainer) axVar.mo56107c() : null;
        if (gsaWebViewContainer != null) {
            ((C23251a) agVar.f279340b.mo91625k()).mo28730f(C58833ax.m90834k(gsaWebViewContainer), false);
            WebView a = gsaWebViewContainer.mo80858a();
            C58893dc.m90996a(a);
            agVar.mo91636l(a);
            return;
        }
        ((C59052c) ((C59052c) C99850ag.f279339a.mo56225c()).mo56372aa(32923)).mo56386p("Could not recover the existing WebView, creating a new one.");
        agVar.mo91632h();
    }
}

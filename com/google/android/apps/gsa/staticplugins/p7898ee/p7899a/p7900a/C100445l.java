package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C100445l implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C100458y f280790a;

    public /* synthetic */ C100445l(C100458y yVar) {
        this.f280790a = yVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C100458y yVar = this.f280790a;
        C58833ax axVar = (C58833ax) obj;
        GsaWebViewContainer gsaWebViewContainer = axVar.mo56113h() ? (GsaWebViewContainer) axVar.mo56107c() : null;
        if (gsaWebViewContainer != null) {
            ((C23251a) yVar.f280811b.mo91915c()).mo28730f(C58833ax.m90834k(gsaWebViewContainer), false);
            WebView a = gsaWebViewContainer.mo80858a();
            C58893dc.m90996a(a);
            yVar.mo91926j(a);
            return;
        }
        ((C59052c) ((C59052c) C100458y.f280808a.mo56225c()).mo56372aa(33404)).mo56386p("Could not recover the existing WebView, creating a new one.");
        yVar.mo91923f();
    }
}

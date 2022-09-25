package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.z */
/* compiled from: PG */
public final /* synthetic */ class C99934z implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279568a;

    public /* synthetic */ C99934z(C99908ah ahVar) {
        this.f279568a = ahVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99908ah ahVar = this.f279568a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            ((C23251a) ahVar.f279481b.mo91665g()).mo28730f(axVar, false);
            WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
            if (a != null) {
                ahVar.mo91679m(a);
                ahVar.mo91680n(a);
                ahVar.f279494o.mo83702b(C89849ae.SILKYTAB_WEBVIEW_CREATE_END);
                ahVar.mo91677k();
                return;
            }
            ahVar.f279494o.mo83702b(C89849ae.SILKYTAB_LOAD_FAILURE_RESTORE_WEBVIEW_NULL);
            return;
        }
        ahVar.mo91674h();
    }
}

package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.be */
/* compiled from: PG */
public final /* synthetic */ class C115235be implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115274cq f319776a;

    public /* synthetic */ C115235be(C115274cq cqVar) {
        this.f319776a = cqVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115274cq cqVar = this.f319776a;
        GsaWebViewContainer gsaWebViewContainer = (GsaWebViewContainer) obj;
        if (gsaWebViewContainer.mo80858a() != null) {
            ((C23251a) cqVar.f319849c.mo101996A()).mo28730f(C58833ax.m90834k(gsaWebViewContainer), false);
            return;
        }
        throw new IllegalStateException("Got an empty webview");
    }
}

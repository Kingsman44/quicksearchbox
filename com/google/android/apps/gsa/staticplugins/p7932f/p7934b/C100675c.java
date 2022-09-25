package com.google.android.apps.gsa.staticplugins.p7932f.p7934b;

import com.google.android.apps.gsa.shared.util.ViewReferenceParcelable;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.assistant.ampactions.AmpWebView;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.b.c */
/* compiled from: PG */
public final /* synthetic */ class C100675c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C100686n f281510a;

    public /* synthetic */ C100675c(C100686n nVar) {
        this.f281510a = nVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C100686n nVar = this.f281510a;
        AmpWebView ampWebView = (AmpWebView) obj;
        if (ampWebView != null) {
            nVar.f281528f.mo28212l("setWebView", new C100680h(nVar, ampWebView));
            ((C23251a) nVar.f281525c.mo92014h()).mo28730f(C58833ax.m90834k(new ViewReferenceParcelable(ampWebView.f36228a)), false);
            return;
        }
        ((C23251a) nVar.f281525c.mo92014h()).mo28730f(C58836b.f156633a, false);
    }
}

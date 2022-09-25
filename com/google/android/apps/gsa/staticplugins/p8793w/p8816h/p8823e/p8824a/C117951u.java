package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.p4449cd.p4456g.p4457a.C57975a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.u */
/* compiled from: PG */
final class C117951u extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C85700a f327372a;

    /* renamed from: b */
    final /* synthetic */ C86227bj f327373b;

    public C117951u(C85700a aVar, C86227bj bjVar) {
        this.f327372a = aVar;
        this.f327373b = bjVar;
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        this.f327372a.mo79322d(C89849ae.OPA_TEXT_SEARCH_NETWORK_DONE);
        if (z) {
            this.f327373b.mo79859L();
            this.f327373b.mo79858K(true);
        }
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        this.f327372a.mo79322d(C89849ae.OPA_TEXT_SEARCH_NETWORK_DONE);
        this.f327373b.mo79859L();
        this.f327373b.mo79858K(true);
    }
}

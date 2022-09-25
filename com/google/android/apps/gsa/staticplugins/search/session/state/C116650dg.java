package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.dg */
/* compiled from: PG */
final class C116650dg implements C116647dd {

    /* renamed from: a */
    final /* synthetic */ C116666dw f323515a;

    public C116650dg(C116666dw dwVar) {
        this.f323515a = dwVar;
    }

    /* renamed from: a */
    public final C87544b mo102820a() {
        return C87544b.GMM_INTENT;
    }

    /* renamed from: b */
    public final boolean mo102821b(SearchError searchError) {
        C116667dx dxVar = (C116667dx) this.f323515a.f323520c.mo27525b();
        Query query = dxVar.f323528d;
        dxVar.f323528d = null;
        return false;
    }
}

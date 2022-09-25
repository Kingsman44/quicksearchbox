package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7186u.C91101a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.it */
/* compiled from: PG */
public final /* synthetic */ class C116798it implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116800iv f324044a;

    /* renamed from: b */
    public final /* synthetic */ Query f324045b;

    public /* synthetic */ C116798it(C116800iv ivVar, Query query) {
        this.f324044a = ivVar;
        this.f324045b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116800iv ivVar = this.f324044a;
        Query query = this.f324045b;
        if (!((Boolean) obj).booleanValue()) {
            ivVar.f324053g = true;
        } else if (query.mo84392cY() && query.mo84339bX()) {
            if (C91101a.m148849a(((C116569ag) ivVar.f324048b.mo27525b()).f323267a)) {
                ivVar.f324050d.mo78426g();
            } else {
                ((C116735gk) ivVar.f324049c.mo27525b()).mo102865B();
            }
        }
    }
}

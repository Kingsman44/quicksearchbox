package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.common.base.C58839bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gh */
/* compiled from: PG */
final class C116732gh implements C58839bc {

    /* renamed from: a */
    final /* synthetic */ C116735gk f323725a;

    public C116732gh(C116735gk gkVar) {
        this.f323725a = gkVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z = !this.f323725a.f323784p.mo84418cy() && !this.f323725a.f323784p.mo84385cR();
        boolean cy = C116735gk.m193763m(bundle).mo84418cy();
        if (z && cy) {
            return false;
        }
        ActionData g = C116735gk.m193762g(bundle);
        return g == null || g.mo81089a() == 0 || !g.mo81099j();
    }
}

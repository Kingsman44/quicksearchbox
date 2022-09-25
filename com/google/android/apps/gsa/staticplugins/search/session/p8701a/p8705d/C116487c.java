package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8705d;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86366d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116628cl;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.d.c */
/* compiled from: PG */
public final class C116487c extends C86354a implements C86366d {

    /* renamed from: a */
    private final Query f322972a;

    /* renamed from: b */
    private final C116628cl f322973b;

    /* renamed from: c */
    private Double f322974c = null;

    public C116487c(Query query, C116628cl clVar) {
        this.f322972a = query;
        this.f322973b = clVar;
    }

    /* renamed from: a */
    public final void mo80136a(double d) {
        Double d2 = this.f322974c;
        if (d2 == null || d2.doubleValue() < d) {
            this.f322974c = Double.valueOf(d);
            C116628cl clVar = this.f322973b;
            Query query = this.f322972a;
            C58838bb.m90883r(query.mo84435dP());
            double abs = Math.abs(clVar.f323456g - d);
            if (clVar.f323450a.mo84383cP(query) && abs > 0.01d) {
                clVar.f323456g = d;
                clVar.mo80591ar();
            }
        }
    }
}

package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8702a;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86358d;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116836z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.a.c */
/* compiled from: PG */
public final class C116479c extends C86354a implements C86358d {

    /* renamed from: a */
    private final C116836z f322952a;

    /* renamed from: b */
    private final C116735gk f322953b;

    /* renamed from: c */
    private final Query f322954c;

    public C116479c(Query query, C116836z zVar, C116735gk gkVar) {
        this.f322954c = query;
        this.f322952a = zVar;
        this.f322953b = gkVar;
    }

    /* renamed from: a */
    public final void mo80118a(ActionData actionData) {
        this.f322953b.mo102869G(this.f322954c, C58833ax.m90834k(actionData));
        this.f322952a.mo102981K(this.f322954c, actionData);
    }

    /* renamed from: b */
    public final void mo80119b() {
        this.f322953b.mo102869G(this.f322954c, C58836b.f156633a);
        this.f322952a.mo102981K(this.f322954c, ActionData.f235991b);
    }
}

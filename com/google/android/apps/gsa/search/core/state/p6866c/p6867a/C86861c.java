package com.google.android.apps.gsa.search.core.state.p6866c.p6867a;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86358d;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.search.core.state.C87171z;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.search.core.state.c.a.c */
/* compiled from: PG */
public final class C86861c extends C86354a implements C86358d {

    /* renamed from: a */
    private final C87171z f234586a;

    /* renamed from: b */
    private final C87052fn f234587b;

    /* renamed from: c */
    private final Query f234588c;

    public C86861c(Query query, C87171z zVar, C87052fn fnVar) {
        this.f234588c = query;
        this.f234586a = zVar;
        this.f234587b = fnVar;
    }

    /* renamed from: a */
    public final void mo80118a(ActionData actionData) {
        this.f234587b.mo80719y(this.f234588c, C58833ax.m90834k(actionData));
        this.f234586a.mo80776H(this.f234588c, actionData);
    }

    /* renamed from: b */
    public final void mo80119b() {
        this.f234587b.mo80719y(this.f234588c, C58836b.f156633a);
        this.f234586a.mo80776H(this.f234588c, ActionData.f235991b);
    }
}

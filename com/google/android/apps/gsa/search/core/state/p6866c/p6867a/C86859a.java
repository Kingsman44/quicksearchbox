package com.google.android.apps.gsa.search.core.state.p6866c.p6867a;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86356b;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.search.core.state.C87171z;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87412e;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22872h;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.state.c.a.a */
/* compiled from: PG */
public final class C86859a implements C86356b {

    /* renamed from: a */
    private final Query f234581a;

    /* renamed from: b */
    private final C87171z f234582b;

    /* renamed from: c */
    private final C87052fn f234583c;

    protected C86859a(Query query, C87171z zVar, C87052fn fnVar) {
        this.f234581a = query;
        this.f234582b = zVar;
        this.f234583c = fnVar;
    }

    /* renamed from: a */
    public final void mo80114a() {
        this.f234582b.mo80814n(this.f234581a);
    }

    /* renamed from: b */
    public final boolean mo80115b(ActionData actionData) {
        List p = this.f234583c.mo80713p(actionData);
        return p != null && !p.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo80116c(ActionData actionData, C87412e eVar, MatchingProviderInfo matchingProviderInfo) {
        C22872h.m42743c(C86593a.class);
        return this.f234582b.mo80803ak(actionData, eVar, matchingProviderInfo);
    }
}

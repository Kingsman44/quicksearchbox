package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8702a;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86356b;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87412e;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116836z;
import com.google.android.libraries.gsa.p1876k.C22872h;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.a.a */
/* compiled from: PG */
public final class C116477a implements C86356b {

    /* renamed from: a */
    private final Query f322947a;

    /* renamed from: b */
    private final C116836z f322948b;

    /* renamed from: c */
    private final C116735gk f322949c;

    public C116477a(Query query, C116836z zVar, C116735gk gkVar) {
        this.f322947a = query;
        this.f322948b = zVar;
        this.f322949c = gkVar;
    }

    /* renamed from: a */
    public final void mo80114a() {
        this.f322948b.mo103021q(this.f322947a);
    }

    /* renamed from: b */
    public final boolean mo80115b(ActionData actionData) {
        List p = this.f322949c.mo102902p(actionData);
        return p != null && !p.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo80116c(ActionData actionData, C87412e eVar, MatchingProviderInfo matchingProviderInfo) {
        C22872h.m42743c(C86593a.class);
        return this.f322948b.mo103011ax(actionData, eVar, matchingProviderInfo);
    }
}

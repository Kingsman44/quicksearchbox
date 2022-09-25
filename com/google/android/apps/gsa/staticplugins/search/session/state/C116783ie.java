package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6820r.C86576v;
import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ie */
/* compiled from: PG */
final class C116783ie implements C86576v {

    /* renamed from: a */
    private final C116786ih f323989a;

    /* renamed from: b */
    private final Query f323990b;

    public C116783ie(Query query, C116786ih ihVar) {
        this.f323989a = ihVar;
        this.f323990b = query;
    }

    /* renamed from: a */
    public final void mo80195a() {
        this.f323989a.mo102940e(this.f323990b, false);
    }

    /* renamed from: b */
    public final void mo80196b() {
        this.f323989a.mo102940e(this.f323990b, true);
    }

    /* renamed from: c */
    public final void mo80197c() {
    }
}

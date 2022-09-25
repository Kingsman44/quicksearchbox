package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6820r.C86576v;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.in */
/* compiled from: PG */
final class C116792in implements C86576v {

    /* renamed from: a */
    private final C116667dx f324025a;

    /* renamed from: b */
    private final Query f324026b;

    public C116792in(Query query, C116667dx dxVar) {
        this.f324025a = dxVar;
        this.f324026b = query;
    }

    /* renamed from: a */
    public final void mo80195a() {
        this.f324025a.mo102824g(this.f324026b, C58485gu.m89845m());
    }

    /* renamed from: b */
    public final void mo80196b() {
        Query query = this.f324026b;
        if (query.mo84323bH()) {
            this.f324025a.mo102824g(query, C58485gu.m89846n(C87544b.RECONNECTING));
        }
    }

    /* renamed from: c */
    public final void mo80197c() {
    }
}

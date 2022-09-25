package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8707f;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6827f.C86374b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116632cp;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116633cq;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116634cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.f.a */
/* compiled from: PG */
public final class C116495a extends C86354a implements C86374b {

    /* renamed from: a */
    private final C116634cr f322989a;

    /* renamed from: b */
    private final Query f322990b;

    public C116495a(Query query, C116634cr crVar) {
        this.f322990b = query;
        this.f322989a = crVar;
    }

    /* renamed from: a */
    public final void mo80146a() {
        C116634cr crVar = this.f322989a;
        new C90873ag(crVar.f323484c.mo78512a(this.f322990b.f252770i, BuildConfig.FLAVOR), crVar.f323482a, "parse LocalIntentResult", new C116632cp()).mo85223a(C116633cq.f323480a);
    }
}

package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84570aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.dw */
/* compiled from: PG */
public final class C116666dw {

    /* renamed from: a */
    public final C58485gu f323518a = C58485gu.m89834D(new C116654dk(), new C116665dv(), new C116649df(), new C116660dq(), new C116662ds(), new C116646dc(), new C116648de(), new C116655dl(), new C116656dm(), new C116657dn(), new C116659dp(), new C116658do(), new C116663dt(), new C116661dr(), new C116664du(), new C116651dh());

    /* renamed from: b */
    public final C58485gu f323519b = C58485gu.m89848p(new C116650dg(this), new C116653dj(this), new C116652di(this));

    /* renamed from: c */
    public final C68214a f323520c;

    /* renamed from: d */
    public final C86127w f323521d;

    /* renamed from: e */
    public final String f323522e;

    /* renamed from: f */
    private final C86124t f323523f;

    /* renamed from: g */
    private final boolean f323524g;

    public C116666dw(C68214a aVar, C86124t tVar, C89994f fVar, C86127w wVar, boolean z) {
        this.f323520c = aVar;
        this.f323523f = tVar;
        this.f323521d = wVar;
        this.f323522e = fVar.mo83885ae();
        this.f323524g = z;
    }

    /* renamed from: a */
    public static boolean m193615a(SearchError searchError) {
        return searchError.mo81138R(16) || searchError.mo81138R(256) || searchError.f236026j.mo56113h();
    }

    /* renamed from: b */
    public final boolean mo102822b(SearchError searchError) {
        return C84570aa.m135301f(this.f323523f, this.f323524g, this.f323522e) && searchError.mo81138R(8);
    }
}

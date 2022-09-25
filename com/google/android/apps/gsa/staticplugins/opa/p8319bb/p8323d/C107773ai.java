package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.p6519al.p6699df.C85355a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7869b.C100230y;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.ai */
/* compiled from: PG */
public final class C107773ai {

    /* renamed from: a */
    public static final C59071e f299881a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.d.ai");

    /* renamed from: b */
    public static final C58528ij f299882b = C58528ij.m90012L(C87739bu.SUGGEST_RESPONSE_RENDERED, C87739bu.REMOVE_SUGGESTION, C87739bu.SUGGEST_FEEDBACK_CLICK);

    /* renamed from: c */
    public final C107733l f299883c;

    /* renamed from: d */
    public final C85171a f299884d;

    /* renamed from: e */
    public final C22871g f299885e;

    /* renamed from: f */
    public final C85355a f299886f;

    /* renamed from: g */
    public Query f299887g;

    /* renamed from: h */
    private Query f299888h;

    public C107773ai(C107733l lVar, C85171a aVar, C22871g gVar, C85355a aVar2) {
        this.f299883c = lVar;
        this.f299884d = aVar;
        this.f299886f = aVar2;
        this.f299885e = gVar;
    }

    /* renamed from: a */
    public final void mo96279a(Query query) {
        Query b = this.f299883c.mo96254b();
        this.f299884d.mo78761C(b, 7, query, this.f299888h, (C100230y) null);
        if (!b.mo84382cO()) {
            this.f299888h = b;
        }
    }
}

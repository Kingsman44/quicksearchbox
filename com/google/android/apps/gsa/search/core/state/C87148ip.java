package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.nga.api.C74715bp;
import com.google.android.apps.gsa.shared.p7066m.C90018bx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.search.core.state.ip */
/* compiled from: PG */
public final /* synthetic */ class C87148ip implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87151is f235473a;

    /* renamed from: b */
    public final /* synthetic */ Query f235474b;

    public /* synthetic */ C87148ip(C87151is isVar, Query query) {
        this.f235473a = isVar;
        this.f235474b = query;
    }

    public final void run() {
        C87151is isVar = this.f235473a;
        Query query = this.f235474b;
        if (isVar.f235489m.mo84383cP(query)) {
            if (isVar.f235486j.mo56113h() && query.mo84403cj() && query.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA") && ((C74715bp) isVar.f235486j.mo56107c()).mo71084e()) {
                isVar.mo80766g(isVar.f235485i.mo78553b(query, isVar.f235480d, ((C86812ai) isVar.f235481e.mo27525b()).f234471a));
            } else if (isVar.f235484h.mo79746e(C90018bx.f248050a) && query.mo84403cj() && query.mo84363bw("android.opa.extra.HANDOVER_FROM_APA")) {
                isVar.mo80766g(isVar.f235488l.mo78591a(query, isVar.f235480d));
            } else if (!((C87052fn) isVar.f235479c.mo27525b()).f235177m.mo84383cP(query)) {
                isVar.mo80765e(query, C60856cj.m92899h(new IllegalStateException("Query is not current commit.")));
            } else if (isVar.f235487k) {
                isVar.mo80765e(query, C90918bo.m148514a(isVar.f235483g.mo78929c(query, isVar.f235480d)));
            } else {
                isVar.mo80765e(query, C60856cj.m92900i(C58836b.f156633a));
            }
        }
    }
}

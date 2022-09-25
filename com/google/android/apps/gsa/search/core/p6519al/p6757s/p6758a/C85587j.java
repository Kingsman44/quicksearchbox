package com.google.android.apps.gsa.search.core.p6519al.p6757s.p6758a;

import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;

/* renamed from: com.google.android.apps.gsa.search.core.al.s.a.j */
/* compiled from: PG */
public final class C85587j extends C86731k {

    /* renamed from: c */
    private final C61752n f231407c;

    /* renamed from: d */
    private final Query f231408d;

    public C85587j(C61752n nVar, Query query) {
        super("offlineassistantresponse", "offlineassistantresponse::handleIntentQuery", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f231407c = nVar;
        this.f231408d = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85596b) obj).mo20303c(this.f231407c, this.f231408d);
    }
}

package com.google.android.apps.gsa.search.core.p6519al.p6550ao.p6551a;

import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ao.a.c */
/* compiled from: PG */
public final class C84717c extends C86731k {

    /* renamed from: c */
    private final Query f230350c;

    public C84717c(Query query) {
        super("gmmoffroadsearch", "gmmoffroadsearch::searchGmmOffroadWithoutPersonalResultsAsync", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230350c = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84715a) obj).mo78439b(this.f230350c);
    }
}

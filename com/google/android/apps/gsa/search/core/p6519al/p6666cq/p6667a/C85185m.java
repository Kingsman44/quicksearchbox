package com.google.android.apps.gsa.search.core.p6519al.p6666cq.p6667a;

import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8575bc;

/* renamed from: com.google.android.apps.gsa.search.core.al.cq.a.m */
/* compiled from: PG */
public final class C85185m extends C86731k {

    /* renamed from: c */
    private final Query f230936c;

    /* renamed from: d */
    private final C8575bc f230937d;

    public C85185m(Query query, C8575bc bcVar) {
        super("searchboxroot", "searchboxroot::onQueryWithZeroTypingSuggest", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_TEXT);
        this.f230936c = query;
        this.f230937d = bcVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85171a) obj).mo78764e(this.f230936c, this.f230937d);
    }
}

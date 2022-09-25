package com.google.android.apps.gsa.search.core.p6519al.p6666cq.p6667a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7869b.C100230y;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cq.a.d */
/* compiled from: PG */
public final class C85176d extends C86731k {

    /* renamed from: c */
    private final Query f230920c;

    /* renamed from: d */
    private final int f230921d;

    /* renamed from: e */
    private final Query f230922e;

    /* renamed from: f */
    private final Query f230923f;

    /* renamed from: g */
    private final C100230y f230924g;

    public C85176d(Query query, int i, Query query2, Query query3, C100230y yVar) {
        super("searchboxroot", "searchboxroot::fetchSuggestions", C86732l.FIRE_AND_FORGET, C86724d.STARTUP_QSB_TEXT);
        this.f230920c = query;
        this.f230921d = i;
        this.f230922e = query2;
        this.f230923f = query3;
        this.f230924g = yVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85171a) obj).mo78761C(this.f230920c, this.f230921d, this.f230922e, this.f230923f, this.f230924g);
        return C118826c.f331423b;
    }
}

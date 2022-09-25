package com.google.android.apps.gsa.search.core.p6519al.p6666cq.p6667a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cq.a.i */
/* compiled from: PG */
public final class C85181i extends C86731k {

    /* renamed from: c */
    private final Query f230929c;

    /* renamed from: d */
    private final boolean f230930d;

    public C85181i(Query query, boolean z) {
        super("searchboxroot", "searchboxroot::maybeLogAbandonmentForQuery", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230929c = query;
        this.f230930d = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85171a) obj).mo78776r(this.f230929c, this.f230930d);
        return C118826c.f331423b;
    }
}

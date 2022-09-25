package com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6607a.p6608a;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6607a.C84921a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bp.a.a.b */
/* compiled from: PG */
public final class C84923b extends C86731k {

    /* renamed from: c */
    private final Query f230591c;

    /* renamed from: d */
    private final C85422c f230592d;

    public C84923b(Query query, C85422c cVar) {
        super("apahandover", "apahandover::startApaHandover", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230591c = query;
        this.f230592d = cVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84921a) obj).mo78591a(this.f230591c, this.f230592d);
    }
}

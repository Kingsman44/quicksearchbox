package com.google.android.apps.gsa.search.core.p6519al.p6739j.p6740a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6739j.C85501a;
import com.google.android.apps.gsa.search.core.p6519al.p6739j.C85504b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.j.a.b */
/* compiled from: PG */
public final class C85503b extends C86731k {

    /* renamed from: c */
    private final Query f231348c;

    /* renamed from: d */
    private final C85501a f231349d;

    public C85503b(Query query, C85501a aVar) {
        super("assistanttextsearch", "assistanttextsearch::handleNewTextQuery", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231348c = query;
        this.f231349d = aVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85504b) obj).mo79025a(this.f231348c, this.f231349d);
        return C118826c.f331423b;
    }
}

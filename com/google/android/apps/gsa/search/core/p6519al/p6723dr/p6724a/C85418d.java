package com.google.android.apps.gsa.search.core.p6519al.p6723dr.p6724a;

import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85423d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dr.a.d */
/* compiled from: PG */
public final class C85418d extends C86731k {

    /* renamed from: c */
    private final Query f231226c;

    /* renamed from: d */
    private final C85422c f231227d;

    public C85418d(Query query, C85422c cVar) {
        super("voicesearch", "voicesearch::startAudioRequestListening", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_VOICE);
        this.f231226c = query;
        this.f231227d = cVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85423d) obj).mo78929c(this.f231226c, this.f231227d);
    }
}

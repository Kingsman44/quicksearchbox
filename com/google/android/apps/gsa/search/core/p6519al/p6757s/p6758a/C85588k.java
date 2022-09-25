package com.google.android.apps.gsa.search.core.p6519al.p6757s.p6758a;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.s.a.k */
/* compiled from: PG */
public final class C85588k extends C86731k {

    /* renamed from: c */
    private final b f231409c;

    /* renamed from: d */
    private final Query f231410d;

    public C85588k(b bVar, Query query) {
        super("offlineassistantresponse", "offlineassistantresponse::handlePumpkinTaggerResult", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f231409c = bVar;
        this.f231410d = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85596b) obj).mo20304d(this.f231409c, this.f231410d);
    }
}

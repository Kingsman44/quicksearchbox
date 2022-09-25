package com.google.android.apps.gsa.search.core.p6519al.p6723dr.p6724a;

import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85423d;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dr.a.c */
/* compiled from: PG */
public final class C85417c extends C86731k {

    /* renamed from: c */
    private final Query f231219c;

    /* renamed from: d */
    private final ClientConfig f231220d;

    /* renamed from: e */
    private final C85422c f231221e;

    /* renamed from: f */
    private final C86498a f231222f;

    /* renamed from: g */
    private final C89356b f231223g;

    /* renamed from: h */
    private final C58833ax f231224h;

    /* renamed from: i */
    private final C60870cx f231225i;

    public C85417c(Query query, ClientConfig clientConfig, C85422c cVar, C86498a aVar, C89356b bVar, C58833ax axVar, C60870cx cxVar) {
        super("voicesearch", "voicesearch::handleVoiceSearchQuery", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_VOICE);
        this.f231219c = query;
        this.f231220d = clientConfig;
        this.f231221e = cVar;
        this.f231222f = aVar;
        this.f231223g = bVar;
        this.f231224h = axVar;
        this.f231225i = cxVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85423d) obj).mo78928a(this.f231219c, this.f231220d, this.f231221e, this.f231222f, this.f231223g, this.f231224h, this.f231225i);
    }
}

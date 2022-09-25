package com.google.android.apps.gsa.search.core.p6519al.p6616bs.p6617a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6616bs.C85014a;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bs.a.b */
/* compiled from: PG */
public final class C85016b extends C86731k {

    /* renamed from: c */
    private final Query f230683c;

    /* renamed from: d */
    private final long f230684d;

    /* renamed from: e */
    private final C86498a f230685e;

    /* renamed from: f */
    private final C60870cx f230686f;

    /* renamed from: g */
    private final C89356b f230687g;

    public C85016b(Query query, long j, C86498a aVar, C60870cx cxVar, C89356b bVar) {
        super("opatosrptransition", "opatosrptransition::startSearch", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230683c = query;
        this.f230684d = j;
        this.f230685e = aVar;
        this.f230686f = cxVar;
        this.f230687g = bVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85014a) obj).mo78652a(this.f230683c, this.f230684d, this.f230685e, this.f230686f, this.f230687g);
        return C118826c.f331423b;
    }
}

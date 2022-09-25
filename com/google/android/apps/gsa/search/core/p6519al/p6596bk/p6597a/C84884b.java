package com.google.android.apps.gsa.search.core.p6519al.p6596bk.p6597a;

import com.google.android.apps.gsa.search.core.p6519al.p6596bk.C84882a;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bk.a.b */
/* compiled from: PG */
public final class C84884b extends C86731k {

    /* renamed from: c */
    private final Query f230555c;

    /* renamed from: d */
    private final C86498a f230556d;

    /* renamed from: e */
    private final C89356b f230557e;

    /* renamed from: f */
    private final C60870cx f230558f;

    public C84884b(Query query, C86498a aVar, C89356b bVar, C60870cx cxVar) {
        super("nonsearchpage", "nonsearchpage::startNonSearchPageLoad", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230555c = query;
        this.f230556d = aVar;
        this.f230557e = bVar;
        this.f230558f = cxVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84882a) obj).mo78558a(this.f230555c, this.f230556d, this.f230557e, this.f230558f);
    }
}

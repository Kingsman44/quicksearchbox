package com.google.android.apps.gsa.search.core.p6519al.p6666cq.p6667a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88329xq;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cq.a.g */
/* compiled from: PG */
public final class C85179g extends C86731k {

    /* renamed from: c */
    private final Response f230926c;

    /* renamed from: d */
    private final C88329xq f230927d;

    /* renamed from: e */
    private final Query f230928e;

    public C85179g(Response response, C88329xq xqVar, Query query) {
        super("searchboxroot", "searchboxroot::handleSuggestResponseRendered", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230926c = response;
        this.f230927d = xqVar;
        this.f230928e = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85171a) obj).mo78774p(this.f230926c, this.f230927d, this.f230928e);
        return C118826c.f331423b;
    }
}

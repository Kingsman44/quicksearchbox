package com.google.android.apps.gsa.search.core.p6519al.p6594bj.p6595a;

import com.google.android.apps.gsa.search.core.p6519al.p6594bj.C84874a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bj.a.d */
/* compiled from: PG */
public final class C84878d extends C86731k {

    /* renamed from: c */
    private final Query f230546c;

    /* renamed from: d */
    private final C85422c f230547d;

    /* renamed from: e */
    private final ClientConfig f230548e;

    public C84878d(Query query, C85422c cVar, ClientConfig clientConfig) {
        super("nga", "nga::startAssistantSearch", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230546c = query;
        this.f230547d = cVar;
        this.f230548e = clientConfig;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84874a) obj).mo78553b(this.f230546c, this.f230547d, this.f230548e);
    }
}

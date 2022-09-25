package com.google.android.apps.gsa.search.core.p6519al.p6723dr.p6724a;

import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85423d;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.dr.a.f */
/* compiled from: PG */
public final class C85420f implements C85423d {

    /* renamed from: a */
    private final C68214a f231229a;

    public C85420f(C68214a aVar) {
        this.f231229a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78928a(Query query, ClientConfig clientConfig, C85422c cVar, C86498a aVar, C89356b bVar, C58833ax axVar, C60870cx cxVar) {
        C85417c cVar2 = new C85417c(query, clientConfig, cVar, aVar, bVar, axVar, cxVar);
        ((C86727g) this.f231229a.mo27525b()).mo80313b(cVar2);
        return cVar2;
    }

    /* renamed from: c */
    public final C60870cx mo78929c(Query query, C85422c cVar) {
        C85418d dVar = new C85418d(query, cVar);
        ((C86727g) this.f231229a.mo27525b()).mo80313b(dVar);
        return dVar;
    }

    /* renamed from: e */
    public final void mo78930e(Query query) {
        ((C86727g) this.f231229a.mo27525b()).mo80313b(new C85415a(query));
    }
}

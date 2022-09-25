package com.google.android.apps.gsa.search.core.p6519al.p6713dm.p6714a;

import com.google.android.apps.gsa.search.core.p6519al.p6713dm.C85393a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.dm.a.d */
/* compiled from: PG */
public final class C85397d implements C85393a {

    /* renamed from: a */
    private final C68214a f231199a;

    public C85397d(C68214a aVar) {
        this.f231199a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78916a(ClientConfig clientConfig, int i, Query query, long j, boolean z) {
        C85394a aVar = new C85394a(clientConfig, i, query, j, z);
        ((C86727g) this.f231199a.mo27525b()).mo80313b(aVar);
        return aVar;
    }

    /* renamed from: b */
    public final void mo78917b(int i, Query query, long j) {
        ((C86727g) this.f231199a.mo27525b()).mo80313b(new C85395b(i, query, j));
    }

    /* renamed from: c */
    public final void mo78918c() {
        ((C86727g) this.f231199a.mo27525b()).mo80313b(new C85396c());
    }
}

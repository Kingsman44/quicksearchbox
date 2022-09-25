package com.google.android.apps.gsa.search.core.p6519al.p6620bu.p6621a;

import com.google.android.apps.gsa.search.core.p6519al.p6620bu.C85022a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7891nu;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.bu.a.e */
/* compiled from: PG */
public final class C85027e implements C85022a {

    /* renamed from: a */
    private final C68214a f230698a;

    public C85027e(C68214a aVar) {
        this.f230698a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78656a(String str, C7891nu nuVar) {
        C85023a aVar = new C85023a(str, nuVar);
        ((C86727g) this.f230698a.mo27525b()).mo80313b(aVar);
        return aVar;
    }

    /* renamed from: b */
    public final C60870cx mo78657b(String str) {
        C85024b bVar = new C85024b(str);
        ((C86727g) this.f230698a.mo27525b()).mo80313b(bVar);
        return bVar;
    }

    /* renamed from: c */
    public final void mo78658c(ClientEventData clientEventData) {
        ((C86727g) this.f230698a.mo27525b()).mo80313b(new C85025c(clientEventData));
    }

    /* renamed from: e */
    public final void mo78659e(C88158rh rhVar, int i) {
        ((C86727g) this.f230698a.mo27525b()).mo80313b(new C85026d(rhVar, i));
    }
}

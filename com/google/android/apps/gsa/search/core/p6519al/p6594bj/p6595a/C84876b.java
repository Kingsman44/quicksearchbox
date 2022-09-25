package com.google.android.apps.gsa.search.core.p6519al.p6594bj.p6595a;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80112b;
import com.google.android.apps.gsa.search.core.p6519al.p6594bj.C84874a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65811co;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.bj.a.b */
/* compiled from: PG */
public final class C84876b implements C84874a {

    /* renamed from: a */
    private final C68214a f230543a;

    public C84876b(C68214a aVar) {
        this.f230543a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78552a(C65811co coVar, String str) {
        C84875a aVar = new C84875a(coVar, str);
        ((C86727g) this.f230543a.mo27525b()).mo80313b(aVar);
        return aVar;
    }

    /* renamed from: b */
    public final C60870cx mo78553b(Query query, C85422c cVar, ClientConfig clientConfig) {
        C84878d dVar = new C84878d(query, cVar, clientConfig);
        ((C86727g) this.f230543a.mo27525b()).mo80313b(dVar);
        return dVar;
    }

    /* renamed from: c */
    public final C60870cx mo78554c() {
        C84879e eVar = new C84879e();
        ((C86727g) this.f230543a.mo27525b()).mo80313b(eVar);
        return eVar;
    }

    /* renamed from: d */
    public final C60870cx mo78555d(String str, int i) {
        C84880f fVar = new C84880f(str, i);
        ((C86727g) this.f230543a.mo27525b()).mo80313b(fVar);
        return fVar;
    }

    /* renamed from: e */
    public final C60870cx mo78556e(C65753ak akVar, C65768az azVar, boolean z) {
        C84881g gVar = new C84881g(akVar, azVar, z);
        ((C86727g) this.f230543a.mo27525b()).mo80313b(gVar);
        return gVar;
    }

    /* renamed from: f */
    public final void mo78557f(C80112b bVar, C58485gu guVar) {
        ((C86727g) this.f230543a.mo27525b()).mo80313b(new C84877c(bVar, guVar));
    }
}

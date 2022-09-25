package com.google.android.apps.gsa.staticplugins.p7773dc;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6668cr.C85199a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a;
import com.google.android.apps.gsa.search.core.p6820r.p6830b.C86392c;
import com.google.android.apps.gsa.search.core.p6820r.p6830b.C86393d;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.staticplugins.p7773dc.p7774a.C99327a;
import com.google.android.apps.gsa.staticplugins.p7773dc.p7774a.C99328b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.k */
/* compiled from: PG */
public final class C99368k extends C86734a implements C85199a {

    /* renamed from: a */
    private final C68214a f278021a;

    /* renamed from: b */
    private final C99328b f278022b;

    /* renamed from: c */
    private final C99363f f278023c;

    public C99368k(C68214a aVar, C99328b bVar, C99363f fVar) {
        super(C118575h.WORKER_SEARCH_GRAPH, "searchgraph");
        this.f278021a = aVar;
        this.f278022b = bVar;
        this.f278023c = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo78785a(C60870cx cxVar, C60870cx cxVar2, C89356b bVar, C86361a aVar) {
        C89356b bVar2 = bVar;
        C69464a aVar2 = C86393d.f233507a;
        C89066v vVar = C89066v.f241382a;
        vVar.getClass();
        bVar.getClass();
        C89012aj ajVar = (C89012aj) this.f278021a.mo27525b();
        ajVar.getClass();
        C68225k.m98529a(vVar, C89066v.class);
        C68225k.m98529a(bVar2, C89356b.class);
        C68225k.m98529a(ajVar, C89012aj.class);
        C68225k.m98529a(11, Integer.class);
        C86392c cVar = new C86392c(vVar, bVar2, ajVar, 11);
        C99328b bVar3 = this.f278022b;
        C86124t tVar = (C86124t) bVar3.f277903a.mo17428b();
        tVar.getClass();
        C89012aj ajVar2 = (C89012aj) bVar3.f277904b.mo17428b();
        ajVar2.getClass();
        C89037bh bhVar = (C89037bh) bVar3.f277905c.mo17428b();
        bhVar.getClass();
        C90476a aVar3 = (C90476a) bVar3.f277906d.mo17428b();
        aVar3.getClass();
        C90479a aVar4 = (C90479a) bVar3.f277907e.mo17428b();
        aVar4.getClass();
        C99327a aVar5 = new C99327a(cVar, bVar, tVar, ajVar2, bhVar, aVar3, aVar4);
        C99363f fVar = this.f278023c;
        return C60856cj.m92900i(new C99365h(aVar5, cxVar, bVar, cxVar2, aVar, fVar.f278003a, fVar.f278004b, fVar.f278005c, fVar.f278006d));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}

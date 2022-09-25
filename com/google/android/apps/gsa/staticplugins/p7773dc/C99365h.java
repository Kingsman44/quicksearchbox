package com.google.android.apps.gsa.staticplugins.p7773dc;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.C86420e;
import com.google.android.apps.gsa.search.core.p6820r.C86570p;
import com.google.android.apps.gsa.search.core.p6820r.C86574t;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7773dc.p7774a.C99327a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.h */
/* compiled from: PG */
public final class C99365h implements C86420e {

    /* renamed from: a */
    public final C60870cx f278010a;

    /* renamed from: b */
    public final C60870cx f278011b;

    /* renamed from: c */
    public final C90476a f278012c;

    /* renamed from: d */
    private final C89356b f278013d;

    /* renamed from: e */
    private final C86361a f278014e;

    /* renamed from: f */
    private final C86602c f278015f;

    /* renamed from: g */
    private final C86124t f278016g;

    /* renamed from: h */
    private final C90479a f278017h;

    /* renamed from: i */
    private final C99327a f278018i;

    public C99365h(C99327a aVar, C60870cx cxVar, C89356b bVar, C60870cx cxVar2, C86361a aVar2, C86602c cVar, C86124t tVar, C90476a aVar3, C90479a aVar4) {
        this.f278018i = aVar;
        this.f278010a = cxVar;
        this.f278013d = bVar;
        this.f278011b = cxVar2;
        this.f278014e = aVar2;
        this.f278015f = cVar;
        this.f278016g = tVar;
        this.f278012c = aVar3;
        this.f278017h = aVar4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo80170a() {
        SettableFuture settableFuture = new SettableFuture();
        return new C99364g(settableFuture, mo91415c(settableFuture), this);
    }

    /* renamed from: b */
    public final C86570p mo80194b(Query query) {
        return mo91415c(C60856cj.m92900i(query));
    }

    /* renamed from: c */
    public final C86570p mo91415c(C60870cx cxVar) {
        C60870cx a = C60856cj.m92895d(this.f278010a, this.f278011b).mo57334a(new C99362e(this), C60826bg.f164896a);
        this.f278012c.getClass();
        this.f278017h.getClass();
        C86361a aVar = this.f278014e;
        aVar.getClass();
        C99327a aVar2 = this.f278018i;
        C86602c cVar = this.f278015f;
        cVar.getClass();
        C86124t tVar = this.f278016g;
        tVar.getClass();
        C89356b bVar = this.f278013d;
        cxVar.getClass();
        return C86574t.m139457d(new C99326a(aVar, aVar2, cVar, a, tVar, bVar, cxVar).f277850a.mo60297gq());
    }
}

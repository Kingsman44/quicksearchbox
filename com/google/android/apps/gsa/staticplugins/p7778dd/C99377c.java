package com.google.android.apps.gsa.staticplugins.p7778dd;

import com.google.android.apps.gsa.location.z;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6522aa.C84609a;
import com.google.android.apps.gsa.search.core.p6519al.p6670cs.C85202a;
import com.google.android.apps.gsa.search.core.p6820r.C86387ai;
import com.google.android.apps.gsa.search.core.p6820r.p6833e.C86426f;
import com.google.android.apps.gsa.search.core.p6820r.p6833e.C86428h;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.p7371ae.C93732ar;
import com.google.android.apps.gsa.staticplugins.p7371ae.C93733as;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dd.c */
/* compiled from: PG */
public final class C99377c extends C86734a implements C85202a {

    /* renamed from: a */
    private final C68214a f278047a;

    public C99377c(C68214a aVar) {
        super(C118575h.WORKER_SEARCH_GRAPH, "searchgraphlegacy");
        this.f278047a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78786a(C89356b bVar, C86428h hVar, long j) {
        return C60856cj.m92900i(((C99374a) this.f278047a.mo27525b()).mo91417b(j, bVar, hVar));
    }

    /* renamed from: b */
    public final C60870cx mo78787b(C89356b bVar, C86426f fVar) {
        return C60856cj.m92900i(((C99374a) this.f278047a.mo27525b()).mo91416a(C58836b.f156633a, bVar, fVar));
    }

    /* renamed from: c */
    public final C60870cx mo78788c(C89356b bVar, C86428h hVar, long j) {
        C99374a aVar = (C99374a) this.f278047a.mo27525b();
        C86387ai b = aVar.mo91417b(j, bVar, hVar);
        C93733as asVar = aVar.f278036a.f262017b;
        C84609a aVar2 = (C84609a) asVar.f261594a.mo17428b();
        aVar2.getClass();
        z zVar = (z) asVar.f261595b.mo17428b();
        zVar.getClass();
        C90931ca caVar = (C90931ca) asVar.f261596c.mo17428b();
        caVar.getClass();
        return C60856cj.m92900i(new C93732ar(b, bVar, aVar2, zVar, caVar));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}

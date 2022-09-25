package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.binaries.satin.app.C74005eg;
import com.google.android.apps.gsa.binaries.satin.app.ei;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6820r.C86384af;
import com.google.android.apps.gsa.search.core.p6820r.C86386ah;
import com.google.android.apps.gsa.search.core.p6820r.p6836h.C86461a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.ab */
/* compiled from: PG */
public final class C94671ab extends C86461a {

    /* renamed from: a */
    private final C69464a f264782a;

    /* renamed from: b */
    private final C89356b f264783b;

    public C94671ab(C69464a aVar, C89356b bVar) {
        super(bVar);
        this.f264782a = aVar;
        this.f264783b = bVar;
    }

    /* renamed from: b */
    public final void mo80159b(Query query) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C86384af mo80175c(Query query, C86232bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        C74005eg egVar = (C74005eg) this.f264782a.mo17428b();
        query.getClass();
        egVar.f206002d = query;
        boVar.getClass();
        egVar.f206001c = boVar;
        C89356b bVar = this.f264783b;
        bVar.getClass();
        egVar.f206003e = bVar;
        C68225k.m98529a(egVar.f206001c, C86232bo.class);
        C68225k.m98529a(egVar.f206002d, Query.class);
        C68225k.m98529a(egVar.f206003e, C89356b.class);
        ei eiVar = new ei(egVar.f205999a, egVar.f206000b, egVar.f206001c, egVar.f206002d, egVar.f206003e);
        return new C86386ah(eiVar.b.mo60297gq(), eiVar.f.mo60297gq());
    }
}

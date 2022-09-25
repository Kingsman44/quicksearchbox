package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.binaries.satin.app.C74006ej;
import com.google.android.apps.gsa.binaries.satin.app.el;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6820r.C86384af;
import com.google.android.apps.gsa.search.core.p6820r.C86386ah;
import com.google.android.apps.gsa.search.core.p6820r.p6836h.C86461a;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bo */
/* compiled from: PG */
public final class C94711bo extends C86461a {

    /* renamed from: a */
    private final C89356b f264885a;

    /* renamed from: b */
    private final ClientConfig f264886b;

    /* renamed from: c */
    private final C69464a f264887c;

    public C94711bo(C89356b bVar, ClientConfig clientConfig, C69464a aVar) {
        super(bVar);
        this.f264885a = bVar;
        this.f264886b = clientConfig;
        this.f264887c = aVar;
    }

    /* renamed from: b */
    public final void mo80159b(Query query) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C86384af mo80175c(Query query, C86232bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        C74006ej ejVar = (C74006ej) this.f264887c.mo17428b();
        query.getClass();
        ejVar.f206008e = query;
        boVar.getClass();
        ejVar.f206007d = boVar;
        C89356b bVar = this.f264885a;
        bVar.getClass();
        ejVar.f206009f = bVar;
        ClientConfig clientConfig = this.f264886b;
        clientConfig.getClass();
        ejVar.f206010g = clientConfig;
        C68225k.m98529a(ejVar.f206007d, C86232bo.class);
        C68225k.m98529a(ejVar.f206008e, Query.class);
        C68225k.m98529a(ejVar.f206009f, C89356b.class);
        C68225k.m98529a(ejVar.f206010g, ClientConfig.class);
        el elVar = new el(ejVar.f206004a, ejVar.f206005b, ejVar.f206006c, ejVar.f206007d, ejVar.f206008e, ejVar.f206009f, ejVar.f206010g);
        return new C86386ah(elVar.b.mo60297gq(), elVar.f.mo60297gq());
    }
}

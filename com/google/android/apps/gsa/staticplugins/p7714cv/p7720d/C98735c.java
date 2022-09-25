package com.google.android.apps.gsa.staticplugins.p7714cv.p7720d;

import com.google.android.apps.gsa.binaries.satin.app.C74240qh;
import com.google.android.apps.gsa.binaries.satin.app.qj;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C118959b;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119062r;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.d.c */
/* compiled from: PG */
public final class C98735c extends C118959b implements C86569o {

    /* renamed from: a */
    public static final C59071e f275808a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.d.c");

    /* renamed from: b */
    public final C85422c f275809b;

    /* renamed from: c */
    private final C22871g f275810c;

    /* renamed from: d */
    private final C98734b f275811d;

    public C98735c(C89356b bVar, Query query, C119066v vVar, C85422c cVar, C58833ax axVar, C22871g gVar, C74240qh qhVar) {
        super(bVar);
        this.f275809b = cVar;
        this.f275810c = gVar;
        C58976aa aaVar = C58975e.f156826a;
        C89066v vVar2 = C89066v.f241382a;
        vVar2.getClass();
        qhVar.f207663b = vVar2;
        bVar.getClass();
        qhVar.f207664c = bVar;
        query.getClass();
        qhVar.f207665d = query;
        qhVar.f207666e = Integer.valueOf(true != query.mo84403cj() ? 14 : 53);
        vVar.getClass();
        qhVar.f207667f = vVar;
        axVar.getClass();
        qhVar.f207668g = axVar;
        C68225k.m98529a(qhVar.f207663b, C89066v.class);
        C68225k.m98529a(qhVar.f207664c, C89356b.class);
        C68225k.m98529a(qhVar.f207665d, Query.class);
        C68225k.m98529a(qhVar.f207666e, Integer.class);
        C68225k.m98529a(qhVar.f207667f, C119066v.class);
        C68225k.m98529a(qhVar.f207668g, C58833ax.class);
        this.f275811d = new qj(qhVar.f207662a, qhVar.f207663b, qhVar.f207664c, qhVar.f207665d, qhVar.f207666e, qhVar.f207667f, qhVar.f207668g);
    }

    /* renamed from: b */
    public final String mo79837b() {
        return "VoiceSearchFetcher with the hybrid graph";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C86497j mo91280c(Query query) {
        this.f275810c.mo28211k(this.f275811d.b.mo60297gq(), "Obtained ConnectivityContext.", new C98733a(this, query));
        return new C119062r(this.f275811d.f.mo60297gq());
    }
}

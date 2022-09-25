package com.google.android.apps.gsa.search.core.p6820r.p6838j;

import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118947a;
import com.google.android.apps.gsa.search.core.p6519al.p6668cr.C85199a;
import com.google.android.apps.gsa.search.core.p6820r.C86388aj;
import com.google.android.apps.gsa.search.core.p6820r.C86389b;
import com.google.android.apps.gsa.search.core.p6820r.C86394c;
import com.google.android.apps.gsa.search.core.p6820r.C86575u;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.search.core.p6820r.C86579y;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a;
import com.google.android.apps.gsa.search.core.p6820r.p6837i.C86494l;
import com.google.android.apps.gsa.search.core.p6820r.p6837i.C86495m;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.r.j.b */
/* compiled from: PG */
public class C86499b implements C86498a {

    /* renamed from: a */
    private final C86495m f233760a;

    /* renamed from: b */
    private final C68214a f233761b;

    /* renamed from: c */
    private final C85199a f233762c;

    /* renamed from: d */
    private final C86394c f233763d;

    /* renamed from: e */
    private final C86389b f233764e;

    /* renamed from: f */
    private final C86388aj f233765f;

    protected C86499b(C86495m mVar, C68214a aVar, C85199a aVar2, C86394c cVar, C86389b bVar, C86388aj ajVar) {
        this.f233760a = mVar;
        this.f233761b = aVar;
        this.f233762c = aVar2;
        this.f233763d = cVar;
        this.f233764e = bVar;
        this.f233765f = ajVar;
    }

    /* renamed from: i */
    public final C86577w mo80185i(Query query, C60870cx cxVar, C60870cx cxVar2, C89356b bVar) {
        return mo80186j(query, cxVar, cxVar2, C58485gu.m89845m(), bVar);
    }

    /* renamed from: j */
    public final C86577w mo80186j(Query query, C60870cx cxVar, C60870cx cxVar2, List list, C89356b bVar) {
        return mo80188l(query, new C86579y(this.f233762c.mo78785a(cxVar, cxVar2, bVar, (C86361a) this.f233761b.mo27525b())), list, bVar);
    }

    /* renamed from: k */
    public final C86577w mo80187k(Query query, C86575u uVar, C89356b bVar) {
        return mo80188l(query, uVar, C58485gu.m89845m(), bVar);
    }

    /* renamed from: l */
    public final C86577w mo80188l(Query query, C86575u uVar, List list, C89356b bVar) {
        C86495m mVar = this.f233760a;
        C86389b bVar2 = this.f233764e;
        C86394c cVar = this.f233763d;
        C86388aj ajVar = this.f233765f;
        query.getClass();
        list.getClass();
        C22871g gVar = (C22871g) mVar.f233749a.mo17428b();
        gVar.getClass();
        C22871g gVar2 = (C22871g) mVar.f233750b.mo17428b();
        gVar2.getClass();
        C22871g gVar3 = (C22871g) mVar.f233751c.mo17428b();
        gVar3.getClass();
        C68214a a = C68219e.m98518a(((C68226l) mVar.f233752d).f184585a);
        a.getClass();
        C118947a aVar = (C118947a) mVar.f233753e.mo17428b();
        aVar.getClass();
        return new C86494l(bVar, query, uVar, list, bVar2, cVar, ajVar, gVar, gVar2, gVar3, a, aVar);
    }
}

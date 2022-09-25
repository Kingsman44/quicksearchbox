package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9951d;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9950c.C131161g;
import com.google.android.libraries.mdi.download.p2248h.C29614k;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59127at;
import com.google.common.p4535g.C59218l;
import com.google.common.p4535g.C59224r;
import com.google.common.p4535g.C59225s;
import com.google.common.p4535g.C59226t;
import com.google.common.p4543n.p4551g.C59443c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.d.k */
/* compiled from: PG */
public final class C131175k implements C29614k {

    /* renamed from: a */
    public final C58974d f358700a;

    /* renamed from: b */
    public final C131161g f358701b;

    /* renamed from: c */
    public final Long f358702c;

    /* renamed from: d */
    public final Long f358703d;

    /* renamed from: e */
    public final Double f358704e;

    /* renamed from: f */
    private final C38683aa f358705f;

    /* renamed from: g */
    private final ExecutorService f358706g;

    public C131175k(C130603a aVar, C38683aa aaVar, C60887da daVar, C131161g gVar, Long l, Long l2, Double d) {
        this.f358700a = aVar.mo109740b(this);
        this.f358705f = aaVar;
        this.f358706g = daVar;
        this.f358701b = gVar;
        this.f358702c = l;
        this.f358703d = l2;
        this.f358704e = d;
    }

    /* renamed from: a */
    public static C58485gu m213688a(C58485gu guVar, C59127at atVar, long j) {
        if (!atVar.mo56454e()) {
            return C58485gu.m89845m();
        }
        C59224r c = C59224r.m91905c(atVar.mo56453d(), new C59218l(new C59443c((double) j).mo56958a() / 6371010.0d));
        ArrayList arrayList = new ArrayList();
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C59226t tVar = (C59226t) guVar.get(i2);
            if (c.mo56467g(new C59225s(tVar))) {
                arrayList.add(tVar);
            }
        }
        return C58485gu.m89842j(arrayList);
    }

    /* renamed from: b */
    public final C60870cx mo34749b(List list) {
        C60870cx d = this.f358705f.mo41550d(C39226b.TAG_ASSISTANT_AMBIENT, 1);
        C131174j jVar = new C131174j(this, list);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(jVar), this.f358706g);
        C131173i iVar = new C131173i(list);
        return C60922j.m93044g(g, C47810es.m84963c(iVar), this.f358706g);
    }
}

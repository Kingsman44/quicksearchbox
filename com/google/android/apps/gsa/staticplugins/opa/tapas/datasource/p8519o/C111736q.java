package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88347yh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121538g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.assistant.p3858ar.p3859a.C49736z;
import com.google.assistant.p4001w.p4002a.C53499f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.q */
/* compiled from: PG */
public final /* synthetic */ class C111736q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111739t f310583a;

    /* renamed from: b */
    public final /* synthetic */ C121538g f310584b;

    /* renamed from: c */
    public final /* synthetic */ C121492b f310585c;

    public /* synthetic */ C111736q(C111739t tVar, C121538g gVar, C121492b bVar) {
        this.f310583a = tVar;
        this.f310584b = gVar;
        this.f310585c = bVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111739t tVar = this.f310583a;
        C121538g gVar = this.f310584b;
        C121492b bVar = this.f310585c;
        C88347yh yhVar = (C88347yh) obj;
        C49736z zVar = yhVar.f238926b;
        if (zVar == null) {
            zVar = C49736z.f128420e;
        }
        C49728r rVar = zVar.f128424c;
        if (rVar == null) {
            rVar = C49728r.f128339j;
        }
        if ((yhVar.f238925a & 2) != 0) {
            C53499f fVar = yhVar.f238927c;
            if (fVar == null) {
                fVar = C53499f.f140392g;
            }
            gVar.mo105205b(fVar);
        }
        bVar.mo105191d();
        C112982q qVar = tVar.f310594c;
        C49736z zVar2 = yhVar.f238926b;
        if (zVar2 == null) {
            zVar2 = C49736z.f128420e;
        }
        qVar.mo99803d(zVar2.f128423b, C112976k.TAPAS_SERVER_FETCHER);
        return rVar;
    }
}

package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6616bs.C85014a;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.apps.gsa.search.core.p6816p.C86255j;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.search.core.p6820r.p6832d.C86418g;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8312ax.C107625a;
import com.google.android.apps.gsa.staticplugins.p7442bc.C94514g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.c */
/* compiled from: PG */
public final class C114275c extends C86734a implements C85014a {

    /* renamed from: a */
    C86577w f316885a;

    /* renamed from: b */
    private final C86255j f316886b;

    /* renamed from: c */
    private final C86237bt f316887c;

    /* renamed from: f */
    private final C22871g f316888f;

    /* renamed from: g */
    private final C94514g f316889g;

    public C114275c(C94514g gVar, C86255j jVar, C86237bt btVar, C22871g gVar2) {
        super(C118575h.WORKER_OPA_TO_SRP_TRANSITION, "opatosrptransition");
        this.f316889g = gVar;
        this.f316886b = jVar;
        this.f316887c = btVar;
        this.f316888f = gVar2;
    }

    /* renamed from: a */
    public final void mo78652a(Query query, long j, C86498a aVar, C60870cx cxVar, C89356b bVar) {
        C86577w i = aVar.mo80185i(query, C60856cj.m92900i(new C86418g(C58485gu.m89844l(new C86569o[]{new C107625a(this.f316888f, this.f316886b, this.f316887c), this.f316889g.mo88489a(j, bVar)}))), cxVar, bVar);
        i.mo80180a();
        this.f316885a = i;
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C60537to toVar = C60537to.UNKNOWN_STATE;
        C86577w wVar = this.f316885a;
        if (wVar != null) {
            wVar.mo80181b();
            this.f316885a = null;
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}

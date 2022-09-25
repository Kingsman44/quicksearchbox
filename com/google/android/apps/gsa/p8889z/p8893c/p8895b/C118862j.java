package com.google.android.apps.gsa.p8889z.p8893c.p8895b;

import com.google.android.apps.gsa.assistant.shared.k;
import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57975a;

/* renamed from: com.google.android.apps.gsa.z.c.b.j */
/* compiled from: PG */
final class C118862j extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C89859i f331512a;

    /* renamed from: b */
    final /* synthetic */ C89856f f331513b;

    /* renamed from: c */
    final /* synthetic */ C86227bj f331514c;

    public C118862j(C89859i iVar, C89856f fVar, C86227bj bjVar) {
        this.f331512a = iVar;
        this.f331513b = fVar;
        this.f331514c = bjVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C51195j jVar = (C51195j) obj;
        C89859i iVar = this.f331512a;
        C89856f fVar = this.f331513b;
        fVar.f246201a = C89849ae.ASSISTANT_RESULT_DOWNLOADED;
        iVar.mo74236a(fVar.mo83699a());
        C58976aa aaVar = C58975e.f156826a;
        if (!k.c(jVar)) {
            C89859i iVar2 = this.f331512a;
            C89856f fVar2 = this.f331513b;
            fVar2.f246201a = C89849ae.ASSISTANT_RESULT_S3_FETCH_TASK;
            iVar2.mo74236a(fVar2.mo83699a());
            this.f331514c.mo79850C(jVar);
        }
    }
}

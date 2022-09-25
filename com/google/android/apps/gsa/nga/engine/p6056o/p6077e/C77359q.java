package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.h.f;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.q */
/* compiled from: PG */
public final /* synthetic */ class C77359q implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f213337a;

    /* renamed from: b */
    public final /* synthetic */ df f213338b;

    /* renamed from: c */
    public final /* synthetic */ Optional f213339c;

    /* renamed from: d */
    public final /* synthetic */ C74965n f213340d;

    public /* synthetic */ C77359q(C76795ay ayVar, df dfVar, Optional optional, C74965n nVar) {
        this.f213337a = ayVar;
        this.f213338b = dfVar;
        this.f213339c = optional;
        this.f213340d = nVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C76795ay ayVar = this.f213337a;
        f fVar = this.f213338b;
        Optional optional = this.f213339c;
        C74965n nVar = this.f213340d;
        Optional optional2 = (Optional) obj;
        if (!optional2.isEmpty()) {
            return C80913i.m128774c(C80905at.m128759c(fVar.b, new C76780aj((y) optional2.get(), optional)));
        }
        ((C58970a) ((C58970a) C76795ay.f212177a.mo56226d()).mo56372aa(3664)).mo56386p("Punt, failed to choose a client to call with");
        ayVar.f212190l.mo76648a(nVar.mo71336k(), C82835ce.NO_POSSIBLE_CLIENT, C83044e.f226656a);
        return C80913i.m128772a(C118826c.f331423b);
    }
}

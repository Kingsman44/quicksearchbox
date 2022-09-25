package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.p */
/* compiled from: PG */
public final /* synthetic */ class C77358p implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f213333a;

    /* renamed from: b */
    public final /* synthetic */ df f213334b;

    /* renamed from: c */
    public final /* synthetic */ Optional f213335c;

    /* renamed from: d */
    public final /* synthetic */ C74965n f213336d;

    public /* synthetic */ C77358p(C76795ay ayVar, df dfVar, Optional optional, C74965n nVar) {
        this.f213333a = ayVar;
        this.f213334b = dfVar;
        this.f213335c = optional;
        this.f213336d = nVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C76795ay ayVar = this.f213333a;
        df dfVar = this.f213334b;
        Optional optional = this.f213335c;
        C74965n nVar = this.f213336d;
        Optional optional2 = (Optional) obj;
        if (optional2.isPresent()) {
            return C80913i.m128775d(optional2);
        }
        return C80913i.m128774c(ayVar.f212189k.mo28209i(C80905at.m128759c((C58485gu) Collection.EL.stream(ayVar.f212186h.values()).filter(C76775ae.f212151a).collect(C58370cn.f155946a), new C76776af(dfVar, optional)), "[NGA] chooseImplicitClient", new C76777ag(ayVar, nVar)));
    }
}

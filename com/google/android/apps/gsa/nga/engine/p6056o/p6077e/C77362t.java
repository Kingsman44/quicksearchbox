package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.t */
/* compiled from: PG */
public final /* synthetic */ class C77362t implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f213353a;

    /* renamed from: b */
    public final /* synthetic */ Optional f213354b;

    public /* synthetic */ C77362t(C76795ay ayVar, Optional optional) {
        this.f213353a = ayVar;
        this.f213354b = optional;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C76795ay ayVar = this.f213353a;
        Optional optional = this.f213354b;
        C58485gu guVar = (C58485gu) obj;
        if (optional.isPresent()) {
            guVar = (C58485gu) Collection.EL.stream(guVar).filter(new C76793aw(ayVar, C80884a.m128736a((CharSequence) optional.get()))).collect(C58370cn.f155946a);
        }
        return C80913i.m128775d(guVar);
    }
}

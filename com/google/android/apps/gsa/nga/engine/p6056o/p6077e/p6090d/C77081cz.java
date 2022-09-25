package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.cz */
/* compiled from: PG */
public final /* synthetic */ class C77081cz implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212737a;

    /* renamed from: b */
    public final /* synthetic */ C77140u f212738b;

    public /* synthetic */ C77081cz(C77089dg dgVar, C77140u uVar) {
        this.f212737a = dgVar;
        this.f212738b = uVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C77089dg dgVar = this.f212737a;
        C77140u uVar = this.f212738b;
        Optional map = ((Optional) obj).map(C77070co.f212704a);
        C58495hd hdVar = dgVar.f212748b;
        Objects.requireNonNull(hdVar);
        Optional map2 = map.map(new C77051bw(hdVar));
        if (map2.isPresent()) {
            return C80913i.m128775d((af) map2.get());
        }
        C77089dg.m123752h(uVar, C82835ce.AUM_PROVIDER_NOT_RESOLVED);
        return C80913i.m128773b(Optional.empty());
    }
}

package com.google.android.apps.gsa.staticplugins.nga.p8066i;

import com.google.android.apps.gsa.n.a.o;
import com.google.android.apps.gsa.n.e.d;
import com.google.android.apps.gsa.n.e.e;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.i.a */
/* compiled from: PG */
public final class C103298a implements C68220f {
    /* renamed from: a */
    public static C118549h m171190a(o oVar) {
        d createBuilder = e.h.createBuilder();
        createBuilder.b(C65753ak.PIE_ASSISTANT_USAGE_STATS);
        C65813cq cqVar = C65813cq.PERIODIC;
        createBuilder.copyOnWrite();
        e eVar = createBuilder.instance;
        eVar.f = cqVar.f178923h;
        eVar.a |= 2;
        createBuilder.copyOnWrite();
        e eVar2 = createBuilder.instance;
        eVar2.a |= 1;
        eVar2.e = "agsa";
        return oVar.a(createBuilder.build());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}

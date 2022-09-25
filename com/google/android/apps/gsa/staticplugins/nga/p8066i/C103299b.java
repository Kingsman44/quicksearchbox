package com.google.android.apps.gsa.staticplugins.nga.p8066i;

import com.google.android.apps.gsa.n.a.o;
import com.google.android.apps.gsa.n.e.d;
import com.google.android.apps.gsa.n.e.e;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.i.b */
/* compiled from: PG */
public final class C103299b implements C68220f {
    /* renamed from: a */
    public static C118549h m171192a(o oVar) {
        d createBuilder = e.h.createBuilder();
        createBuilder.copyOnWrite();
        e eVar = createBuilder.instance;
        eVar.a |= 1;
        eVar.e = "agsa";
        C65813cq cqVar = C65813cq.PERIODIC;
        createBuilder.copyOnWrite();
        e eVar2 = createBuilder.instance;
        eVar2.f = cqVar.f178923h;
        eVar2.a |= 2;
        createBuilder.a(C58485gu.m89849q(C65753ak.APP_VOICIFICATION, C65753ak.HANDBAG_PERSONALIZED_SLICE_INFO, C65753ak.JINN_ALL_DJ, C65753ak.JINN_STARLIGHT));
        createBuilder.copyOnWrite();
        e eVar3 = createBuilder.instance;
        eVar3.a |= 8;
        eVar3.g = true;
        return oVar.a(createBuilder.build());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}

package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9318j;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65137b;
import com.google.protos.p5129p.p5130a.C65734s;
import com.google.protos.p5129p.p5130a.C65735t;
import com.google.protos.p5129p.p5130a.C65736u;
import com.google.protos.p5129p.p5130a.C65737v;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.j.c */
/* compiled from: PG */
public final /* synthetic */ class C123264c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C65753ak f340990a;

    /* renamed from: b */
    public final /* synthetic */ C65734s f340991b;

    public /* synthetic */ C123264c(C65753ak akVar, C65734s sVar) {
        this.f340990a = akVar;
        this.f340991b = sVar;
    }

    public final Object apply(Object obj) {
        C65753ak akVar = this.f340990a;
        C65734s sVar = this.f340991b;
        C65033ar arVar = (C65033ar) obj;
        C59071e eVar = C123269h.f340998a;
        C65735t tVar = (C65735t) C65736u.f178580e.createBuilder();
        tVar.copyOnWrite();
        C65736u uVar = (C65736u) tVar.instance;
        uVar.f178583b = akVar.f178757bE;
        uVar.f178582a |= 1;
        C62971cq cqVar = arVar.f176113a;
        tVar.copyOnWrite();
        C65736u uVar2 = (C65736u) tVar.instance;
        C62971cq cqVar2 = uVar2.f178584c;
        if (!cqVar2.mo58948c()) {
            uVar2.f178584c = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) uVar2.f178584c);
        C65137b bVar = arVar.f176114b;
        if (bVar == null) {
            bVar = C65137b.f176302b;
        }
        tVar.copyOnWrite();
        C65736u uVar3 = (C65736u) tVar.instance;
        bVar.getClass();
        uVar3.f178585d = bVar;
        uVar3.f178582a |= 2;
        sVar.copyOnWrite();
        C65737v vVar = (C65737v) sVar.instance;
        C65736u uVar4 = (C65736u) tVar.build();
        C65737v vVar2 = C65737v.f178587b;
        uVar4.getClass();
        C62971cq cqVar3 = vVar.f178589a;
        if (!cqVar3.mo58948c()) {
            vVar.f178589a = C62942bv.mutableCopy(cqVar3);
        }
        vVar.f178589a.add(uVar4);
        return null;
    }
}

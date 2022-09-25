package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9318j;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5130a.C65702aa;
import com.google.protos.p5129p.p5130a.C65703ab;
import com.google.protos.p5129p.p5130a.C65704ac;
import com.google.protos.p5129p.p5130a.C65741z;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.j.g */
/* compiled from: PG */
public final /* synthetic */ class C123268g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f340997a;

    public /* synthetic */ C123268g(List list) {
        this.f340997a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f340997a;
        List list2 = (List) obj;
        C59071e eVar = C123269h.f340998a;
        C65741z zVar = (C65741z) C65704ac.f178511b.createBuilder();
        for (int i = 0; i < list2.size(); i++) {
            C58528ij ijVar = (C58528ij) list2.get(i);
            C65702aa aaVar = (C65702aa) C65703ab.f178506d.createBuilder();
            aaVar.copyOnWrite();
            C65703ab abVar = (C65703ab) aaVar.instance;
            abVar.f178509b = ((C65753ak) list.get(i)).f178757bE;
            abVar.f178508a |= 1;
            aaVar.copyOnWrite();
            C65703ab abVar2 = (C65703ab) aaVar.instance;
            C62971cq cqVar = abVar2.f178510c;
            if (!cqVar.mo58948c()) {
                abVar2.f178510c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) ijVar, (List) abVar2.f178510c);
            zVar.copyOnWrite();
            C65704ac acVar = (C65704ac) zVar.instance;
            C65703ab abVar3 = (C65703ab) aaVar.build();
            abVar3.getClass();
            C62971cq cqVar2 = acVar.f178513a;
            if (!cqVar2.mo58948c()) {
                acVar.f178513a = C62942bv.mutableCopy(cqVar2);
            }
            acVar.f178513a.add(abVar3);
        }
        return (C65704ac) zVar.build();
    }
}

package com.google.android.libraries.geller;

import com.google.common.base.C58817ah;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5130a.C65711aj;
import com.google.protos.p5129p.p5130a.C65712ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.libraries.geller.e */
/* compiled from: PG */
public final /* synthetic */ class C21775e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21877g f60084a;

    public /* synthetic */ C21775e(C21877g gVar) {
        this.f60084a = gVar;
    }

    public final Object apply(Object obj) {
        C21877g gVar = this.f60084a;
        C65033ar arVar = (C65033ar) obj;
        C65712ak akVar = gVar.f60371c;
        long j = (akVar.f178533a & 1) != 0 ? akVar.f178534b : Long.MAX_VALUE;
        for (C65768az azVar : arVar.f176113a) {
            gVar.f60369a.addLast(azVar);
            C65139d dVar = azVar.f178796b;
            if (dVar == null) {
                dVar = C65139d.f176307e;
            }
            j = Math.min(j, dVar.f176310b);
        }
        C65711aj ajVar = (C65711aj) gVar.f60371c.toBuilder();
        ajVar.copyOnWrite();
        C65712ak akVar2 = (C65712ak) ajVar.instance;
        akVar2.f178533a |= 1;
        akVar2.f178534b = j;
        gVar.f60371c = (C65712ak) ajVar.build();
        return null;
    }
}

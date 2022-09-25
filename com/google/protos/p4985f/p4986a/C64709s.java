package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.f.a.s */
/* compiled from: PG */
public final class C64709s extends C62934bn implements C63001dt {
    public C64709s() {
        super(C64710t.f175414b);
    }

    /* renamed from: a */
    public final void mo59305a(C64649ac acVar) {
        copyOnWrite();
        C64710t tVar = (C64710t) this.instance;
        C64650ad adVar = (C64650ad) acVar.build();
        C64710t tVar2 = C64710t.f175414b;
        adVar.getClass();
        C62971cq cqVar = tVar.f175416a;
        if (!cqVar.mo58948c()) {
            tVar.f175416a = C62942bv.mutableCopy(cqVar);
        }
        tVar.f175416a.add(adVar);
    }
}

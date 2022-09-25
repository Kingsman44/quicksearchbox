package com.google.p374ah;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.ah.c */
/* compiled from: PG */
public final class C7501c extends C62934bn implements C63001dt {
    public C7501c() {
        super(C7502d.f24717d);
    }

    /* renamed from: a */
    public final void mo16922a(C7507i iVar) {
        copyOnWrite();
        C7502d dVar = (C7502d) this.instance;
        C7502d dVar2 = C7502d.f24717d;
        iVar.getClass();
        C62971cq cqVar = dVar.f24721c;
        if (!cqVar.mo58948c()) {
            dVar.f24721c = C62942bv.mutableCopy(cqVar);
        }
        dVar.f24721c.add(iVar);
    }
}

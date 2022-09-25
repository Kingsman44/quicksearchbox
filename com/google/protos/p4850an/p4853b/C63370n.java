package com.google.protos.p4850an.p4853b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.an.b.n */
/* compiled from: PG */
public final class C63370n extends C62934bn implements C63001dt {
    public C63370n() {
        super(C63371o.f171261g);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo59210a(C63358b bVar) {
        copyOnWrite();
        C63371o oVar = (C63371o) this.instance;
        C63371o oVar2 = C63371o.f171261g;
        bVar.getClass();
        C62971cq cqVar = oVar.f171267e;
        if (!cqVar.mo58948c()) {
            oVar.f171267e = C62942bv.mutableCopy(cqVar);
        }
        oVar.f171267e.add(bVar);
    }
}

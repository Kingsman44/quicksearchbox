package com.google.p374ah;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.ah.e */
/* compiled from: PG */
public final class C7503e extends C62936bp implements C62938br {
    public C7503e() {
        super(C7504f.f24723b);
    }

    /* renamed from: a */
    public final void mo16923a(C7502d dVar) {
        copyOnWrite();
        C7504f fVar = (C7504f) this.instance;
        C7504f fVar2 = C7504f.f24723b;
        dVar.getClass();
        C62971cq cqVar = fVar.f24725a;
        if (!cqVar.mo58948c()) {
            fVar.f24725a = C62942bv.mutableCopy(cqVar);
        }
        fVar.f24725a.add(dVar);
    }
}

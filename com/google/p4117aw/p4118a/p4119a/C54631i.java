package com.google.p4117aw.p4118a.p4119a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.aw.a.a.i */
/* compiled from: PG */
public final class C54631i extends C62934bn implements C63001dt {
    public C54631i() {
        super(C54636n.f143450b);
    }

    /* renamed from: a */
    public final void mo54150a(C54634l lVar) {
        copyOnWrite();
        C54636n nVar = (C54636n) this.instance;
        C54635m mVar = (C54635m) lVar.build();
        C54636n nVar2 = C54636n.f143450b;
        mVar.getClass();
        C62971cq cqVar = nVar.f143452a;
        if (!cqVar.mo58948c()) {
            nVar.f143452a = C62942bv.mutableCopy(cqVar);
        }
        nVar.f143452a.add(mVar);
    }
}

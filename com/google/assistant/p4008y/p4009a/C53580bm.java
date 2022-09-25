package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.y.a.bm */
/* compiled from: PG */
public final class C53580bm extends C62934bn implements C63001dt {
    public C53580bm() {
        super(C53581bn.f140630d);
    }

    /* renamed from: a */
    public final void mo54003a(C53574bg bgVar) {
        copyOnWrite();
        C53581bn bnVar = (C53581bn) this.instance;
        C53575bh bhVar = (C53575bh) bgVar.build();
        C53581bn bnVar2 = C53581bn.f140630d;
        bhVar.getClass();
        C62971cq cqVar = bnVar.f140634c;
        if (!cqVar.mo58948c()) {
            bnVar.f140634c = C62942bv.mutableCopy(cqVar);
        }
        bnVar.f140634c.add(bhVar);
    }
}

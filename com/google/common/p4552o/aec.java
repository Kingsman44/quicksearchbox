package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.aec */
/* compiled from: PG */
public final class aec extends C62934bn implements C63001dt {
    public aec() {
        super(aef.f158453e);
    }

    /* renamed from: a */
    public final void mo56976a(aee aee) {
        copyOnWrite();
        aef aef = (aef) this.instance;
        aef aef2 = aef.f158453e;
        aee.getClass();
        C62971cq cqVar = aef.f158458d;
        if (!cqVar.mo58948c()) {
            aef.f158458d = C62942bv.mutableCopy(cqVar);
        }
        aef.f158458d.add(aee);
    }
}

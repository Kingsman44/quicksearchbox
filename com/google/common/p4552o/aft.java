package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.aft */
/* compiled from: PG */
public final class aft extends C62934bn implements C63001dt {
    public aft() {
        super(agg.f158622e);
    }

    /* renamed from: a */
    public final void mo56993a(C59579aga aga) {
        copyOnWrite();
        agg agg = (agg) this.instance;
        agf agf = (agf) aga.build();
        agg agg2 = agg.f158622e;
        agf.getClass();
        C62971cq cqVar = agg.f158625b;
        if (!cqVar.mo58948c()) {
            agg.f158625b = C62942bv.mutableCopy(cqVar);
        }
        agg.f158625b.add(agf);
    }
}

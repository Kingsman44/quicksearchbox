package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bv.f.a.a.a */
/* compiled from: PG */
public final class C57531a extends C62934bn implements C63001dt {
    public C57531a() {
        super(C57583b.f153841e);
    }

    /* renamed from: a */
    public final void mo54490a(C57569am amVar) {
        copyOnWrite();
        C57583b bVar = (C57583b) this.instance;
        C57583b bVar2 = C57583b.f153841e;
        amVar.getClass();
        C62971cq cqVar = bVar.f153845c;
        if (!cqVar.mo58948c()) {
            bVar.f153845c = C62942bv.mutableCopy(cqVar);
        }
        bVar.f153845c.add(amVar);
    }
}

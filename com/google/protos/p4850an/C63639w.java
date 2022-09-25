package com.google.protos.p4850an;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.an.w */
/* compiled from: PG */
public final class C63639w extends C62934bn implements C63001dt {
    public C63639w() {
        super(C63640x.f172108b);
    }

    /* renamed from: a */
    public final void mo59223a(int i, C63634r rVar) {
        copyOnWrite();
        C63640x xVar = (C63640x) this.instance;
        C63640x xVar2 = C63640x.f172108b;
        rVar.getClass();
        C62971cq cqVar = xVar.f172110a;
        if (!cqVar.mo58948c()) {
            xVar.f172110a = C62942bv.mutableCopy(cqVar);
        }
        xVar.f172110a.set(i, rVar);
    }
}

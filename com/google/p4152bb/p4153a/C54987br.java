package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bb.a.br */
/* compiled from: PG */
public final class C54987br extends C62934bn implements C63001dt {
    public C54987br() {
        super(C54988bs.f144680b);
    }

    /* renamed from: a */
    public final void mo54167a(C55422y yVar) {
        copyOnWrite();
        C54988bs bsVar = (C54988bs) this.instance;
        C55423z zVar = (C55423z) yVar.build();
        C54988bs bsVar2 = C54988bs.f144680b;
        zVar.getClass();
        C62971cq cqVar = bsVar.f144683a;
        if (!cqVar.mo58948c()) {
            bsVar.f144683a = C62942bv.mutableCopy(cqVar);
        }
        bsVar.f144683a.add(zVar);
    }
}

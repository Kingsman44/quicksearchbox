package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bb.a.dr */
/* compiled from: PG */
public final class C55041dr extends C62934bn implements C63001dt {
    public C55041dr() {
        super(C55042ds.f144811b);
    }

    /* renamed from: a */
    public final void mo54175a(C55043dt dtVar) {
        copyOnWrite();
        C55042ds dsVar = (C55042ds) this.instance;
        C55044du duVar = (C55044du) dtVar.build();
        C55042ds dsVar2 = C55042ds.f144811b;
        duVar.getClass();
        C62971cq cqVar = dsVar.f144813a;
        if (!cqVar.mo58948c()) {
            dsVar.f144813a = C62942bv.mutableCopy(cqVar);
        }
        dsVar.f144813a.add(duVar);
    }
}

package com.google.p4152bb.p4153a;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.bb.a.dm */
/* compiled from: PG */
public final class C55036dm extends C62936bp implements C62938br {
    public C55036dm() {
        super(C55047dx.f144820j);
    }

    /* renamed from: a */
    public final void mo54174a(C55041dr drVar) {
        copyOnWrite();
        C55047dx dxVar = (C55047dx) this.instance;
        C55042ds dsVar = (C55042ds) drVar.build();
        C55047dx dxVar2 = C55047dx.f144820j;
        dsVar.getClass();
        C62971cq cqVar = dxVar.f144825c;
        if (!cqVar.mo58948c()) {
            dxVar.f144825c = C62942bv.mutableCopy(cqVar);
        }
        dxVar.f144825c.add(dsVar);
    }
}

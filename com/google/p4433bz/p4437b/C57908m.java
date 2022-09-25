package com.google.p4433bz.p4437b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bz.b.m */
/* compiled from: PG */
public final class C57908m extends C62934bn implements C63001dt {
    public C57908m() {
        super(C57909n.f154891b);
    }

    /* renamed from: a */
    public final void mo54537a(C57906k kVar) {
        copyOnWrite();
        C57909n nVar = (C57909n) this.instance;
        C57907l lVar = (C57907l) kVar.build();
        C57909n nVar2 = C57909n.f154891b;
        lVar.getClass();
        C62971cq cqVar = nVar.f154893a;
        if (!cqVar.mo58948c()) {
            nVar.f154893a = C62942bv.mutableCopy(cqVar);
        }
        nVar.f154893a.add(lVar);
    }
}

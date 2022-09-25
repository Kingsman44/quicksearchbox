package com.google.android.p10712d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.d.m */
/* compiled from: PG */
public final class C142521m extends C62934bn implements C63001dt {
    public C142521m() {
        super(C142522n.f386743b);
    }

    /* renamed from: a */
    public final void mo117139a(C142520l lVar) {
        copyOnWrite();
        C142522n nVar = (C142522n) this.instance;
        C142522n nVar2 = C142522n.f386743b;
        lVar.getClass();
        C62971cq cqVar = nVar.f386745a;
        if (!cqVar.mo58948c()) {
            nVar.f386745a = C62942bv.mutableCopy(cqVar);
        }
        nVar.f386745a.add(lVar);
    }
}

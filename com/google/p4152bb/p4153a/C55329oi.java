package com.google.p4152bb.p4153a;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.bb.a.oi */
/* compiled from: PG */
public final class C55329oi extends C62936bp implements C62938br {
    public C55329oi() {
        super(C55330oj.f145769e);
    }

    /* renamed from: a */
    public final void mo54241a(C55317nx nxVar) {
        copyOnWrite();
        C55330oj ojVar = (C55330oj) this.instance;
        C55330oj ojVar2 = C55330oj.f145769e;
        nxVar.getClass();
        ojVar.mo54243a();
        ojVar.f145773c.add(nxVar);
    }

    /* renamed from: b */
    public final void mo54242b(C55305nl nlVar) {
        copyOnWrite();
        C55330oj ojVar = (C55330oj) this.instance;
        C55330oj ojVar2 = C55330oj.f145769e;
        C62971cq cqVar = ojVar.f145774d;
        if (!cqVar.mo58948c()) {
            ojVar.f145774d = C62942bv.mutableCopy(cqVar);
        }
        ojVar.f145774d.add(nlVar);
    }
}

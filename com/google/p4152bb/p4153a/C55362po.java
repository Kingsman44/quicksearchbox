package com.google.p4152bb.p4153a;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.bb.a.po */
/* compiled from: PG */
public final class C55362po extends C62936bp implements C62938br {
    public C55362po() {
        super(C55365pr.f145876l);
    }

    /* renamed from: a */
    public final C55367pt mo54250a(int i) {
        return (C55367pt) ((C55365pr) this.instance).f145888k.get(i);
    }

    /* renamed from: b */
    public final void mo54251b(int i, C55366ps psVar) {
        copyOnWrite();
        C55365pr prVar = (C55365pr) this.instance;
        C55367pt ptVar = (C55367pt) psVar.build();
        C55365pr prVar2 = C55365pr.f145876l;
        ptVar.getClass();
        C62971cq cqVar = prVar.f145888k;
        if (!cqVar.mo58948c()) {
            prVar.f145888k = C62942bv.mutableCopy(cqVar);
        }
        prVar.f145888k.set(i, ptVar);
    }
}

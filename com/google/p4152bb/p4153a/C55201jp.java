package com.google.p4152bb.p4153a;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.bb.a.jp */
/* compiled from: PG */
public final class C55201jp extends C62936bp implements C62938br {
    public C55201jp() {
        super(C55202jq.f145289f);
    }

    /* renamed from: a */
    public final void mo54206a(C55215kc kcVar) {
        copyOnWrite();
        C55202jq jqVar = (C55202jq) this.instance;
        C55202jq jqVar2 = C55202jq.f145289f;
        kcVar.getClass();
        C62971cq cqVar = jqVar.f145292b;
        if (!cqVar.mo58948c()) {
            jqVar.f145292b = C62942bv.mutableCopy(cqVar);
        }
        jqVar.f145292b.add(kcVar);
    }
}

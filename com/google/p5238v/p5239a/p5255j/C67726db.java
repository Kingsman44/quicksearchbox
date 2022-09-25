package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.v.a.j.db */
/* compiled from: PG */
public final class C67726db extends C62934bn implements C63001dt {
    public C67726db() {
        super(C67729de.f183760c);
    }

    /* renamed from: a */
    public final void mo59976a(C67728dd ddVar) {
        copyOnWrite();
        C67729de deVar = (C67729de) this.instance;
        C67729de deVar2 = C67729de.f183760c;
        ddVar.getClass();
        C62971cq cqVar = deVar.f183763b;
        if (!cqVar.mo58948c()) {
            deVar.f183763b = C62942bv.mutableCopy(cqVar);
        }
        deVar.f183763b.add(ddVar);
    }
}

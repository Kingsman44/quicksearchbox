package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bb.a.lm */
/* compiled from: PG */
public final class C55252lm extends C62934bn implements C63001dt {
    public C55252lm() {
        super(C55253ln.f145507e);
    }

    /* renamed from: a */
    public final void mo54221a(C55240la laVar) {
        copyOnWrite();
        C55253ln lnVar = (C55253ln) this.instance;
        C55253ln lnVar2 = C55253ln.f145507e;
        laVar.getClass();
        C62971cq cqVar = lnVar.f145510b;
        if (!cqVar.mo58948c()) {
            lnVar.f145510b = C62942bv.mutableCopy(cqVar);
        }
        lnVar.f145510b.add(laVar);
    }
}

package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.aeq */
/* compiled from: PG */
public final class aeq extends C62934bn implements C63001dt {
    public aeq() {
        super(aew.f158493e);
    }

    /* renamed from: a */
    public final void mo56982a(aes aes) {
        copyOnWrite();
        aew aew = (aew) this.instance;
        aew aew2 = aew.f158493e;
        aes.getClass();
        C62971cq cqVar = aew.f158496b;
        if (!cqVar.mo58948c()) {
            aew.f158496b = C62942bv.mutableCopy(cqVar);
        }
        aew.f158496b.add(aes);
    }
}

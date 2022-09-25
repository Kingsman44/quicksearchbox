package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.ahq */
/* compiled from: PG */
public final class ahq extends C62934bn implements C63001dt {
    public ahq() {
        super(ahr.f158774d);
    }

    /* renamed from: a */
    public final void mo57002a(String str) {
        copyOnWrite();
        ahr ahr = (ahr) this.instance;
        ahr ahr2 = ahr.f158774d;
        str.getClass();
        C62971cq cqVar = ahr.f158778c;
        if (!cqVar.mo58948c()) {
            ahr.f158778c = C62942bv.mutableCopy(cqVar);
        }
        ahr.f158778c.add(str);
    }
}

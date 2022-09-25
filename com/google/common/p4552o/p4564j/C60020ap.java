package com.google.common.p4552o.p4564j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.j.ap */
/* compiled from: PG */
public final class C60020ap extends C62934bn implements C63001dt {
    public C60020ap() {
        super(C60021aq.f162228b);
    }

    /* renamed from: a */
    public final void mo57063a(Iterable iterable) {
        copyOnWrite();
        C60021aq aqVar = (C60021aq) this.instance;
        C60021aq aqVar2 = C60021aq.f162228b;
        C62971cq cqVar = aqVar.f162230a;
        if (!cqVar.mo58948c()) {
            aqVar.f162230a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aqVar.f162230a);
    }
}

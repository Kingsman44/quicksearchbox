package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.ama */
/* compiled from: PG */
public final class ama extends C62934bn implements C63001dt {
    public ama() {
        super(amc.f159123i);
    }

    /* renamed from: a */
    public final void mo57023a(Iterable iterable) {
        copyOnWrite();
        amc amc = (amc) this.instance;
        amc amc2 = amc.f159123i;
        C62971cq cqVar = amc.f159127c;
        if (!cqVar.mo58948c()) {
            amc.f159127c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) amc.f159127c);
    }
}

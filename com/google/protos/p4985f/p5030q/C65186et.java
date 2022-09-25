package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.f.q.et */
/* compiled from: PG */
public final class C65186et extends C62934bn implements C63001dt {
    public C65186et() {
        super(C65187eu.f176405e);
    }

    /* renamed from: a */
    public final void mo59347a(Iterable iterable) {
        copyOnWrite();
        C65187eu euVar = (C65187eu) this.instance;
        C65187eu euVar2 = C65187eu.f176405e;
        C62971cq cqVar = euVar.f176408b;
        if (!cqVar.mo58948c()) {
            euVar.f176408b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) euVar.f176408b);
    }
}

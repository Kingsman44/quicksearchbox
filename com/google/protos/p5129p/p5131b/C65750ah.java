package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.p.b.ah */
/* compiled from: PG */
public final class C65750ah extends C62934bn implements C63001dt {
    public C65750ah() {
        super(C65751ai.f178617b);
    }

    /* renamed from: a */
    public final void mo59422a(Iterable iterable) {
        copyOnWrite();
        C65751ai aiVar = (C65751ai) this.instance;
        C65751ai aiVar2 = C65751ai.f178617b;
        C62971cq cqVar = aiVar.f178620a;
        if (!cqVar.mo58948c()) {
            aiVar.f178620a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aiVar.f178620a);
    }
}

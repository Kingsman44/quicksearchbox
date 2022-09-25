package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.an.c.a.f */
/* compiled from: PG */
public final class C49329f extends C62934bn implements C63001dt {
    public C49329f() {
        super(C49330g.f127488o);
    }

    /* renamed from: a */
    public final void mo53232a(Iterable iterable) {
        copyOnWrite();
        C49330g gVar = (C49330g) this.instance;
        C49330g gVar2 = C49330g.f127488o;
        C62971cq cqVar = gVar.f127500k;
        if (!cqVar.mo58948c()) {
            gVar.f127500k = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) gVar.f127500k);
    }
}

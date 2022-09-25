package com.google.assistant.p3980n.p3981a.p3982a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.n.a.a.c */
/* compiled from: PG */
public final class C53000c extends C62934bn implements C63001dt {
    public C53000c() {
        super(C53001d.f138931d);
    }

    /* renamed from: a */
    public final void mo53955a(C52998a aVar) {
        copyOnWrite();
        C53001d dVar = (C53001d) this.instance;
        C52999b bVar = (C52999b) aVar.build();
        C53001d dVar2 = C53001d.f138931d;
        bVar.getClass();
        C62971cq cqVar = dVar.f138935c;
        if (!cqVar.mo58948c()) {
            dVar.f138935c = C62942bv.mutableCopy(cqVar);
        }
        dVar.f138935c.add(bVar);
    }
}

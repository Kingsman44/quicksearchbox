package com.google.p4140ba.p4147b.p4148a.p4149a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.ba.b.a.a.a */
/* compiled from: PG */
public final class C54936a extends C62934bn implements C63001dt {
    public C54936a() {
        super(C54937b.f144428b);
    }

    /* renamed from: a */
    public final void mo54162a(C54938c cVar) {
        copyOnWrite();
        C54937b bVar = (C54937b) this.instance;
        C54940e eVar = (C54940e) cVar.build();
        C54937b bVar2 = C54937b.f144428b;
        eVar.getClass();
        C62971cq cqVar = bVar.f144430a;
        if (!cqVar.mo58948c()) {
            bVar.f144430a = C62942bv.mutableCopy(cqVar);
        }
        bVar.f144430a.add(eVar);
    }
}

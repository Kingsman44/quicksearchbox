package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.f.a.i */
/* compiled from: PG */
public final class C64699i extends C62934bn implements C63001dt {
    public C64699i() {
        super(C64700j.f175384b);
    }

    /* renamed from: a */
    public final void mo59296a(C64696f fVar) {
        copyOnWrite();
        C64700j jVar = (C64700j) this.instance;
        C64698h hVar = (C64698h) fVar.build();
        C64700j jVar2 = C64700j.f175384b;
        hVar.getClass();
        C62971cq cqVar = jVar.f175386a;
        if (!cqVar.mo58948c()) {
            jVar.f175386a = C62942bv.mutableCopy(cqVar);
        }
        jVar.f175386a.add(hVar);
    }
}

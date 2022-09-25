package com.google.protos.p4985f.p4986a.p4987a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.f.a.a.a */
/* compiled from: PG */
public final class C64645a extends C62934bn implements C63001dt {
    public C64645a() {
        super(C64646b.f175230g);
    }

    /* renamed from: a */
    public final void mo59288a(Iterable iterable) {
        copyOnWrite();
        C64646b bVar = (C64646b) this.instance;
        C64646b bVar2 = C64646b.f175230g;
        C62971cq cqVar = bVar.f175237f;
        if (!cqVar.mo58948c()) {
            bVar.f175237f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f175237f);
    }
}

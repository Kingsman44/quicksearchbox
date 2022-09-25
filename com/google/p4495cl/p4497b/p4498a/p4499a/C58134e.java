package com.google.p4495cl.p4497b.p4498a.p4499a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.cl.b.a.a.e */
/* compiled from: PG */
public final class C58134e extends C62934bn implements C63001dt {
    public C58134e() {
        super(C58135f.f155417f);
    }

    /* renamed from: a */
    public final void mo54677a(Iterable iterable) {
        copyOnWrite();
        C58135f fVar = (C58135f) this.instance;
        C58135f fVar2 = C58135f.f155417f;
        C62971cq cqVar = fVar.f155423e;
        if (!cqVar.mo58948c()) {
            fVar.f155423e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar.f155423e);
    }
}

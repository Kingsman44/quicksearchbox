package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.bv.j.b.a.b.c.a.a.a */
/* compiled from: PG */
public final class C57737a extends C62934bn implements C63001dt {
    public C57737a() {
        super(C57738b.f154252b);
    }

    /* renamed from: a */
    public final void mo54527a(Iterable iterable) {
        copyOnWrite();
        C57738b bVar = (C57738b) this.instance;
        C57738b bVar2 = C57738b.f154252b;
        C62971cq cqVar = bVar.f154254a;
        if (!cqVar.mo58948c()) {
            bVar.f154254a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f154254a);
    }
}

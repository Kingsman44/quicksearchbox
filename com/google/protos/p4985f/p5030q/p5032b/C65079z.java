package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.f.q.b.z */
/* compiled from: PG */
public final class C65079z extends C62934bn implements C63001dt {
    public C65079z() {
        super(C65016aa.f176065b);
    }

    /* renamed from: a */
    public final void mo59336a(Iterable iterable) {
        copyOnWrite();
        C65016aa aaVar = (C65016aa) this.instance;
        C65016aa aaVar2 = C65016aa.f176065b;
        C62971cq cqVar = aaVar.f176067a;
        if (!cqVar.mo58948c()) {
            aaVar.f176067a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aaVar.f176067a);
    }
}

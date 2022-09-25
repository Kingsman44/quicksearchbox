package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.am.b.a.n */
/* compiled from: PG */
public final class C8684n extends C62934bn implements C63001dt {
    public C8684n() {
        super(C8685o.f30009c);
    }

    /* renamed from: a */
    public final void mo17211a(Iterable iterable) {
        copyOnWrite();
        C8685o oVar = (C8685o) this.instance;
        C8685o oVar2 = C8685o.f30009c;
        C62971cq cqVar = oVar.f30011a;
        if (!cqVar.mo58948c()) {
            oVar.f30011a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) oVar.f30011a);
    }
}

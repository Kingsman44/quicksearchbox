package com.google.p343ac.p357d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.ac.d.a */
/* compiled from: PG */
public final class C6659a extends C62934bn implements C63001dt {
    public C6659a() {
        super(C6663e.f19901o);
    }

    /* renamed from: a */
    public final void mo13720a(Iterable iterable) {
        copyOnWrite();
        C6663e eVar = (C6663e) this.instance;
        C6663e eVar2 = C6663e.f19901o;
        C62971cq cqVar = eVar.f19910h;
        if (!cqVar.mo58948c()) {
            eVar.f19910h = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) eVar.f19910h);
    }
}

package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.g.d.o */
/* compiled from: PG */
public final class C9271o extends C62934bn implements C63001dt {
    public C9271o() {
        super(C9272p.f32079d);
    }

    /* renamed from: a */
    public final void mo17464a(Iterable iterable) {
        copyOnWrite();
        C9272p pVar = (C9272p) this.instance;
        C9272p pVar2 = C9272p.f32079d;
        C62971cq cqVar = pVar.f32082b;
        if (!cqVar.mo58948c()) {
            pVar.f32082b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) pVar.f32082b);
    }
}

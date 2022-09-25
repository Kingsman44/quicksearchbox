package com.google.assistant.p4001w.p4002a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.w.a.m */
/* compiled from: PG */
public final class C53506m extends C62934bn implements C63001dt {
    public C53506m() {
        super(C53507n.f140428l);
    }

    /* renamed from: a */
    public final void mo53987a(Iterable iterable) {
        copyOnWrite();
        C53507n nVar = (C53507n) this.instance;
        C53507n nVar2 = C53507n.f140428l;
        C62971cq cqVar = nVar.f140434e;
        if (!cqVar.mo58948c()) {
            nVar.f140434e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) nVar.f140434e);
    }
}

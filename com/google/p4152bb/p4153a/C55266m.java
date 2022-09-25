package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.bb.a.m */
/* compiled from: PG */
public final class C55266m extends C62934bn implements C63001dt {
    public C55266m() {
        super(C55293n.f145650k);
    }

    /* renamed from: a */
    public final void mo54228a(Iterable iterable) {
        copyOnWrite();
        C55293n nVar = (C55293n) this.instance;
        C55293n nVar2 = C55293n.f145650k;
        C62971cq cqVar = nVar.f145659h;
        if (!cqVar.mo58948c()) {
            nVar.f145659h = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) nVar.f145659h);
    }

    /* renamed from: b */
    public final void mo54229b(Iterable iterable) {
        copyOnWrite();
        C55293n nVar = (C55293n) this.instance;
        C55293n nVar2 = C55293n.f145650k;
        C62971cq cqVar = nVar.f145660i;
        if (!cqVar.mo58948c()) {
            nVar.f145660i = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) nVar.f145660i);
    }
}

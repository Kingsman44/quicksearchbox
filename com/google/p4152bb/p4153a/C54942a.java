package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.bb.a.a */
/* compiled from: PG */
public final class C54942a extends C62934bn implements C63001dt {
    public C54942a() {
        super(C54969b.f144589b);
    }

    /* renamed from: a */
    public final void mo54163a(Iterable iterable) {
        copyOnWrite();
        C54969b bVar = (C54969b) this.instance;
        C54969b bVar2 = C54969b.f144589b;
        C62971cq cqVar = bVar.f144591a;
        if (!cqVar.mo58948c()) {
            bVar.f144591a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f144591a);
    }
}

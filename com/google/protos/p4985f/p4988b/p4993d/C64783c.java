package com.google.protos.p4985f.p4988b.p4993d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.f.b.d.c */
/* compiled from: PG */
public final class C64783c extends C62934bn implements C63001dt {
    public C64783c() {
        super(C64784d.f175584d);
    }

    /* renamed from: a */
    public final void mo59310a(Iterable iterable) {
        copyOnWrite();
        C64784d dVar = (C64784d) this.instance;
        C64784d dVar2 = C64784d.f175584d;
        C62971cq cqVar = dVar.f175588c;
        if (!cqVar.mo58948c()) {
            dVar.f175588c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) dVar.f175588c);
    }
}

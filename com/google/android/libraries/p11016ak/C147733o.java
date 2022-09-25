package com.google.android.libraries.p11016ak;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.ak.o */
/* compiled from: PG */
public final class C147733o extends C62934bn implements C63001dt {
    public C147733o() {
        super(C147734p.f398651e);
    }

    /* renamed from: a */
    public final void mo124427a(Iterable iterable) {
        copyOnWrite();
        C147734p pVar = (C147734p) this.instance;
        C147734p pVar2 = C147734p.f398651e;
        C62971cq cqVar = pVar.f398654b;
        if (!cqVar.mo58948c()) {
            pVar.f398654b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) pVar.f398654b);
    }
}

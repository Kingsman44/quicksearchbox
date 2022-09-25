package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.uk */
/* compiled from: PG */
public final class C60560uk extends C62934bn implements C63001dt {
    public C60560uk() {
        super(C60561ul.f164283d);
    }

    /* renamed from: a */
    public final void mo57114a(Iterable iterable) {
        copyOnWrite();
        C60561ul ulVar = (C60561ul) this.instance;
        C60561ul ulVar2 = C60561ul.f164283d;
        C62971cq cqVar = ulVar.f164287c;
        if (!cqVar.mo58948c()) {
            ulVar.f164287c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) ulVar.f164287c);
    }
}

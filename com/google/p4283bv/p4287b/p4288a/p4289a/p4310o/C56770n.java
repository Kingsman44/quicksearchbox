package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.bv.b.a.a.o.n */
/* compiled from: PG */
public final class C56770n extends C62934bn implements C63001dt {
    public C56770n() {
        super(C56771o.f151498b);
    }

    /* renamed from: a */
    public final void mo54430a(Iterable iterable) {
        copyOnWrite();
        C56771o oVar = (C56771o) this.instance;
        C56771o oVar2 = C56771o.f151498b;
        C62971cq cqVar = oVar.f151500a;
        if (!cqVar.mo58948c()) {
            oVar.f151500a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) oVar.f151500a);
    }
}

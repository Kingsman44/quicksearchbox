package com.google.lens.p4701g;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.lens.g.bc */
/* compiled from: PG */
public final class C62280bc extends C62934bn implements C63001dt {
    public C62280bc() {
        super(C62281bd.f168141b);
    }

    /* renamed from: a */
    public final void mo58491a(C62278ba baVar) {
        copyOnWrite();
        C62281bd bdVar = (C62281bd) this.instance;
        C62279bb bbVar = (C62279bb) baVar.build();
        C62281bd bdVar2 = C62281bd.f168141b;
        bbVar.getClass();
        C62971cq cqVar = bdVar.f168143a;
        if (!cqVar.mo58948c()) {
            bdVar.f168143a = C62942bv.mutableCopy(cqVar);
        }
        bdVar.f168143a.add(bbVar);
    }
}

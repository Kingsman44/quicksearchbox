package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.s.a.p */
/* compiled from: PG */
public final class C53460p extends C62934bn implements C63001dt {
    public C53460p() {
        super(C53461q.f140313b);
    }

    /* renamed from: a */
    public final void mo53981a(String str) {
        copyOnWrite();
        C53461q qVar = (C53461q) this.instance;
        C53461q qVar2 = C53461q.f140313b;
        C62971cq cqVar = qVar.f140315a;
        if (!cqVar.mo58948c()) {
            qVar.f140315a = C62942bv.mutableCopy(cqVar);
        }
        qVar.f140315a.add(str);
    }
}

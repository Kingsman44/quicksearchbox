package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.j.jl */
/* compiled from: PG */
public final class C52214jl extends C62934bn implements C63001dt {
    public C52214jl() {
        super(C52215jm.f137024b);
    }

    /* renamed from: a */
    public final void mo53817a(Iterable iterable) {
        copyOnWrite();
        C52215jm jmVar = (C52215jm) this.instance;
        C52215jm jmVar2 = C52215jm.f137024b;
        C62971cq cqVar = jmVar.f137026a;
        if (!cqVar.mo58948c()) {
            jmVar.f137026a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) jmVar.f137026a);
    }
}

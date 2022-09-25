package com.google.p375ai.p378b;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.ai.b.ht */
/* compiled from: PG */
public final class C7728ht extends C62936bp implements C62938br {
    public C7728ht() {
        super(C7744ii.f27054p);
    }

    /* renamed from: a */
    public final void mo16952a(Iterable iterable) {
        copyOnWrite();
        C7744ii iiVar = (C7744ii) this.instance;
        C62962ci ciVar = C7744ii.f27053h;
        C62971cq cqVar = iiVar.f27067m;
        if (!cqVar.mo58948c()) {
            iiVar.f27067m = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) iiVar.f27067m);
    }
}

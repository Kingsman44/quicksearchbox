package com.google.p375ai.p378b;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.ai.b.hc */
/* compiled from: PG */
public final class C7711hc extends C62936bp implements C62938br {
    public C7711hc() {
        super(C7718hj.f26927af);
    }

    /* renamed from: a */
    public final void mo16938a(Iterable iterable) {
        copyOnWrite();
        C7718hj hjVar = (C7718hj) this.instance;
        C62962ci ciVar = C7718hj.f26926ac;
        C62971cq cqVar = hjVar.f26954Z;
        if (!cqVar.mo58948c()) {
            hjVar.f26954Z = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) hjVar.f26954Z);
    }
}

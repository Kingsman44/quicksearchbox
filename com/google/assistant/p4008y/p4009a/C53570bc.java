package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.y.a.bc */
/* compiled from: PG */
public final class C53570bc extends C62934bn implements C63001dt {
    public C53570bc() {
        super(C53571bd.f140604b);
    }

    /* renamed from: a */
    public final void mo53999a(C53582bo boVar) {
        copyOnWrite();
        C53571bd bdVar = (C53571bd) this.instance;
        C53583bp bpVar = (C53583bp) boVar.build();
        C53571bd bdVar2 = C53571bd.f140604b;
        bpVar.getClass();
        C62971cq cqVar = bdVar.f140606a;
        if (!cqVar.mo58948c()) {
            bdVar.f140606a = C62942bv.mutableCopy(cqVar);
        }
        bdVar.f140606a.add(bpVar);
    }
}

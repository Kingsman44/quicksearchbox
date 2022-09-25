package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.s.a.aj */
/* compiled from: PG */
public final class C53073aj extends C62934bn implements C63001dt {
    public C53073aj() {
        super(C53074ak.f139084d);
    }

    /* renamed from: a */
    public final void mo53959a(String str) {
        copyOnWrite();
        C53074ak akVar = (C53074ak) this.instance;
        C53074ak akVar2 = C53074ak.f139084d;
        str.getClass();
        C62971cq cqVar = akVar.f139088c;
        if (!cqVar.mo58948c()) {
            akVar.f139088c = C62942bv.mutableCopy(cqVar);
        }
        akVar.f139088c.add(str);
    }
}

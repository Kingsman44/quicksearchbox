package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.fw */
/* compiled from: PG */
public final class C59795fw extends C62934bn implements C63001dt {
    public C59795fw() {
        super(C59796fx.f161580r);
    }

    /* renamed from: a */
    public final void mo57058a(C59842hf hfVar) {
        copyOnWrite();
        C59796fx fxVar = (C59796fx) this.instance;
        C59796fx fxVar2 = C59796fx.f161580r;
        hfVar.getClass();
        C62971cq cqVar = fxVar.f161593l;
        if (!cqVar.mo58948c()) {
            fxVar.f161593l = C62942bv.mutableCopy(cqVar);
        }
        fxVar.f161593l.add(hfVar);
    }
}

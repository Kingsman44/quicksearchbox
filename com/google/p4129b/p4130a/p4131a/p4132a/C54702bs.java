package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.b.a.a.a.bs */
/* compiled from: PG */
public final class C54702bs extends C62934bn implements C63001dt {
    public C54702bs() {
        super(C54703bt.f143586c);
    }

    /* renamed from: a */
    public final void mo54151a(C54698bo boVar) {
        copyOnWrite();
        C54703bt btVar = (C54703bt) this.instance;
        C54699bp bpVar = (C54699bp) boVar.build();
        C54703bt btVar2 = C54703bt.f143586c;
        bpVar.getClass();
        C62971cq cqVar = btVar.f143589b;
        if (!cqVar.mo58948c()) {
            btVar.f143589b = C62942bv.mutableCopy(cqVar);
        }
        btVar.f143589b.add(bpVar);
    }
}

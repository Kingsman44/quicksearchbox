package com.google.protos.p4985f.p4988b.p4993d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.f.b.d.j */
/* compiled from: PG */
public final class C64790j extends C62934bn implements C63001dt {
    public C64790j() {
        super(C64791k.f175598d);
    }

    /* renamed from: a */
    public final void mo59312a(String str) {
        copyOnWrite();
        C64791k kVar = (C64791k) this.instance;
        C64791k kVar2 = C64791k.f175598d;
        str.getClass();
        C62971cq cqVar = kVar.f175602c;
        if (!cqVar.mo58948c()) {
            kVar.f175602c = C62942bv.mutableCopy(cqVar);
        }
        kVar.f175602c.add(str);
    }
}

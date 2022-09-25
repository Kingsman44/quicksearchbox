package com.google.p4242bp.p4243a.p4245b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bp.a.b.j */
/* compiled from: PG */
public final class C56151j extends C62934bn implements C63001dt {
    public C56151j() {
        super(C56152k.f149611f);
    }

    /* renamed from: a */
    public final void mo54328a(String str) {
        copyOnWrite();
        C56152k kVar = (C56152k) this.instance;
        C56152k kVar2 = C56152k.f149611f;
        C62971cq cqVar = kVar.f149617e;
        if (!cqVar.mo58948c()) {
            kVar.f149617e = C62942bv.mutableCopy(cqVar);
        }
        kVar.f149617e.add(str);
    }
}

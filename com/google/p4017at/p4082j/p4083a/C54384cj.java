package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.at.j.a.cj */
/* compiled from: PG */
public final class C54384cj extends C62934bn implements C63001dt {
    public C54384cj() {
        super(C54385ck.f142847b);
    }

    /* renamed from: a */
    public final void mo54112a(String str) {
        copyOnWrite();
        C54385ck ckVar = (C54385ck) this.instance;
        C54385ck ckVar2 = C54385ck.f142847b;
        str.getClass();
        C62971cq cqVar = ckVar.f142849a;
        if (!cqVar.mo58948c()) {
            ckVar.f142849a = C62942bv.mutableCopy(cqVar);
        }
        ckVar.f142849a.add(str);
    }
}

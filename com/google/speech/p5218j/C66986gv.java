package com.google.speech.p5218j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.speech.j.gv */
/* compiled from: PG */
public final class C66986gv extends C62934bn implements C63001dt {
    public C66986gv() {
        super(C66987gw.f182085b);
    }

    /* renamed from: a */
    public final void mo59760a(String str) {
        copyOnWrite();
        C66987gw gwVar = (C66987gw) this.instance;
        C66987gw gwVar2 = C66987gw.f182085b;
        str.getClass();
        C62971cq cqVar = gwVar.f182087a;
        if (!cqVar.mo58948c()) {
            gwVar.f182087a = C62942bv.mutableCopy(cqVar);
        }
        gwVar.f182087a.add(str);
    }
}

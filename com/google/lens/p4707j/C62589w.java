package com.google.lens.p4707j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.lens.j.w */
/* compiled from: PG */
public final class C62589w extends C62934bn implements C63001dt {
    public C62589w() {
        super(C62590x.f168982b);
    }

    /* renamed from: a */
    public final void mo58506a(String str) {
        copyOnWrite();
        C62590x xVar = (C62590x) this.instance;
        C62590x xVar2 = C62590x.f168982b;
        str.getClass();
        C62971cq cqVar = xVar.f168984a;
        if (!cqVar.mo58948c()) {
            xVar.f168984a = C62942bv.mutableCopy(cqVar);
        }
        xVar.f168984a.add(str);
    }
}

package com.google.lens.p4705i.p4706a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.lens.i.a.v */
/* compiled from: PG */
public final class C62391v extends C62934bn implements C63001dt {
    public C62391v() {
        super(C62392w.f168423d);
    }

    /* renamed from: a */
    public final void mo58494a(String str) {
        copyOnWrite();
        C62392w wVar = (C62392w) this.instance;
        C62392w wVar2 = C62392w.f168423d;
        C62971cq cqVar = wVar.f168425a;
        if (!cqVar.mo58948c()) {
            wVar.f168425a = C62942bv.mutableCopy(cqVar);
        }
        wVar.f168425a.add(str);
    }

    /* renamed from: b */
    public final void mo58495b(String str) {
        copyOnWrite();
        C62392w wVar = (C62392w) this.instance;
        C62392w wVar2 = C62392w.f168423d;
        C62971cq cqVar = wVar.f168426b;
        if (!cqVar.mo58948c()) {
            wVar.f168426b = C62942bv.mutableCopy(cqVar);
        }
        wVar.f168426b.add(str);
    }
}

package com.google.android.apps.gsa.shared.p6970ab;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.shared.ab.g */
/* compiled from: PG */
public final class C89077g extends C62934bn implements C63001dt {
    public C89077g() {
        super(C89078h.f241405b);
    }

    /* renamed from: a */
    public final void mo83056a(C89076f fVar) {
        copyOnWrite();
        C89078h hVar = (C89078h) this.instance;
        C89078h hVar2 = C89078h.f241405b;
        fVar.getClass();
        C62971cq cqVar = hVar.f241407a;
        if (!cqVar.mo58948c()) {
            hVar.f241407a = C62942bv.mutableCopy(cqVar);
        }
        hVar.f241407a.add(fVar);
    }
}

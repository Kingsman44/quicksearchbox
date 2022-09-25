package com.google.android.apps.gsa.shared.p6970ab;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.shared.ab.e */
/* compiled from: PG */
public final class C89075e extends C62934bn implements C63001dt {
    public C89075e() {
        super(C89076f.f241399e);
    }

    /* renamed from: a */
    public final void mo83055a(C89082l lVar) {
        copyOnWrite();
        C89076f fVar = (C89076f) this.instance;
        C89076f fVar2 = C89076f.f241399e;
        lVar.getClass();
        C62971cq cqVar = fVar.f241404d;
        if (!cqVar.mo58948c()) {
            fVar.f241404d = C62942bv.mutableCopy(cqVar);
        }
        fVar.f241404d.add(lVar);
    }
}

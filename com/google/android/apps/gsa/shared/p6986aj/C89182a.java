package com.google.android.apps.gsa.shared.p6986aj;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.shared.aj.a */
/* compiled from: PG */
public final class C89182a extends C62934bn implements C63001dt {
    public C89182a() {
        super(C89185d.f241801b);
    }

    /* renamed from: a */
    public final void mo83149a(C89184c cVar) {
        copyOnWrite();
        C89185d dVar = (C89185d) this.instance;
        C89185d dVar2 = C89185d.f241801b;
        cVar.getClass();
        C62971cq cqVar = dVar.f241803a;
        if (!cqVar.mo58948c()) {
            dVar.f241803a = C62942bv.mutableCopy(cqVar);
        }
        dVar.f241803a.add(cVar);
    }
}

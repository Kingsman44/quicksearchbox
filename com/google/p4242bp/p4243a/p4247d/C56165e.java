package com.google.p4242bp.p4243a.p4247d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bp.a.d.e */
/* compiled from: PG */
public final class C56165e extends C62934bn implements C63001dt {
    public C56165e() {
        super(C56166f.f149643c);
    }

    /* renamed from: a */
    public final void mo54329a(String str) {
        copyOnWrite();
        C56166f fVar = (C56166f) this.instance;
        C56166f fVar2 = C56166f.f149643c;
        str.getClass();
        C62971cq cqVar = fVar.f149646b;
        if (!cqVar.mo58948c()) {
            fVar.f149646b = C62942bv.mutableCopy(cqVar);
        }
        fVar.f149646b.add(str);
    }
}

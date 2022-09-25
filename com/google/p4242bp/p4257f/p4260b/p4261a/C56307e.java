package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bp.f.b.a.e */
/* compiled from: PG */
public final class C56307e extends C62934bn implements C63001dt {
    public C56307e() {
        super(C56308f.f150069b);
    }

    /* renamed from: a */
    public final void mo54352a(String str) {
        copyOnWrite();
        C56308f fVar = (C56308f) this.instance;
        C56308f fVar2 = C56308f.f150069b;
        C62971cq cqVar = fVar.f150071a;
        if (!cqVar.mo58948c()) {
            fVar.f150071a = C62942bv.mutableCopy(cqVar);
        }
        fVar.f150071a.add(str);
    }
}

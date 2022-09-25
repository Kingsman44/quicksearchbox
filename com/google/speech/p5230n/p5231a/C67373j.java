package com.google.speech.p5230n.p5231a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.speech.n.a.j */
/* compiled from: PG */
public final class C67373j extends C62934bn implements C63001dt {
    public C67373j() {
        super(C67374k.f183133d);
    }

    /* renamed from: a */
    public final void mo59844a(Iterable iterable) {
        copyOnWrite();
        C67374k kVar = (C67374k) this.instance;
        C67374k kVar2 = C67374k.f183133d;
        C62971cq cqVar = kVar.f183137c;
        if (!cqVar.mo58948c()) {
            kVar.f183137c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) kVar.f183137c);
    }
}

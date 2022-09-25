package com.google.speech.p5228m.p5229a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.speech.m.a.k */
/* compiled from: PG */
public final class C67262k extends C62934bn implements C63001dt {
    public C67262k() {
        super(C67263l.f182837d);
    }

    /* renamed from: a */
    public final void mo59782a(Iterable iterable) {
        copyOnWrite();
        C67263l lVar = (C67263l) this.instance;
        C67263l lVar2 = C67263l.f182837d;
        C62971cq cqVar = lVar.f182841c;
        if (!cqVar.mo58948c()) {
            lVar.f182841c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) lVar.f182841c);
    }
}

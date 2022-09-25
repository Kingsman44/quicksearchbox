package com.google.speech.p5195a.p5196a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.speech.a.a.e */
/* compiled from: PG */
public final class C66425e extends C62934bn implements C63001dt {
    public C66425e() {
        super(C66427g.f180621d);
    }

    /* renamed from: a */
    public final void mo59626a(Iterable iterable) {
        copyOnWrite();
        C66427g gVar = (C66427g) this.instance;
        C66427g gVar2 = C66427g.f180621d;
        C62971cq cqVar = gVar.f180625c;
        if (!cqVar.mo58948c()) {
            gVar.f180625c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) gVar.f180625c);
    }
}

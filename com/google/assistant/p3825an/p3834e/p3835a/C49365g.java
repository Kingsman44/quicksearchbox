package com.google.assistant.p3825an.p3834e.p3835a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.an.e.a.g */
/* compiled from: PG */
public final class C49365g extends C62934bn implements C63001dt {
    public C49365g() {
        super(C49366h.f127602b);
    }

    /* renamed from: a */
    public final void mo53238a(Iterable iterable) {
        copyOnWrite();
        C49366h hVar = (C49366h) this.instance;
        C49366h hVar2 = C49366h.f127602b;
        C62971cq cqVar = hVar.f127604a;
        if (!cqVar.mo58948c()) {
            hVar.f127604a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) hVar.f127604a);
    }
}

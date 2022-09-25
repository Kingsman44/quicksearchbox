package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.i.a.q */
/* compiled from: PG */
public final class C51627q extends C62934bn implements C63001dt {
    public C51627q() {
        super(C51628r.f134549b);
    }

    /* renamed from: a */
    public final void mo53666a(Iterable iterable) {
        copyOnWrite();
        C51628r rVar = (C51628r) this.instance;
        C51628r rVar2 = C51628r.f134549b;
        C62971cq cqVar = rVar.f134551a;
        if (!cqVar.mo58948c()) {
            rVar.f134551a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) rVar.f134551a);
    }
}

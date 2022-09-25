package com.google.p375ai.p378b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.ai.b.gt */
/* compiled from: PG */
public final class C7701gt extends C62934bn implements C63001dt {
    public C7701gt() {
        super(C7702gu.f26879c);
    }

    /* renamed from: a */
    public final void mo16937a(Iterable iterable) {
        copyOnWrite();
        C7702gu guVar = (C7702gu) this.instance;
        C7702gu guVar2 = C7702gu.f26879c;
        C62971cq cqVar = guVar.f26881a;
        if (!cqVar.mo58948c()) {
            guVar.f26881a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) guVar.f26881a);
    }
}

package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.an.c.a.ck */
/* compiled from: PG */
public final class C49319ck extends C62934bn implements C63001dt {
    public C49319ck() {
        super(C49320cl.f127467c);
    }

    /* renamed from: a */
    public final void mo53231a(Iterable iterable) {
        copyOnWrite();
        C49320cl clVar = (C49320cl) this.instance;
        C49320cl clVar2 = C49320cl.f127467c;
        C62971cq cqVar = clVar.f127470b;
        if (!cqVar.mo58948c()) {
            clVar.f127470b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) clVar.f127470b);
    }
}

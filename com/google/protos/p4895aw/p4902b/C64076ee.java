package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.aw.b.ee */
/* compiled from: PG */
public final class C64076ee extends C62934bn implements C63001dt {
    public C64076ee() {
        super(C64081ej.f173236h);
    }

    /* renamed from: a */
    public final void mo59253a(Iterable iterable) {
        copyOnWrite();
        C64081ej ejVar = (C64081ej) this.instance;
        C64081ej ejVar2 = C64081ej.f173236h;
        C62971cq cqVar = ejVar.f173240c;
        if (!cqVar.mo58948c()) {
            ejVar.f173240c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) ejVar.f173240c);
    }

    /* renamed from: b */
    public final void mo59254b(Iterable iterable) {
        copyOnWrite();
        C64081ej ejVar = (C64081ej) this.instance;
        C64081ej ejVar2 = C64081ej.f173236h;
        C62971cq cqVar = ejVar.f173242e;
        if (!cqVar.mo58948c()) {
            ejVar.f173242e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) ejVar.f173242e);
    }
}

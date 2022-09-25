package com.google.protos.p4850an.p4855d.p4862g;

import com.google.p4242bp.p4266g.C56364n;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.an.d.g.a */
/* compiled from: PG */
public final class C63564a extends C62934bn implements C63001dt {
    public C63564a() {
        super(C63565b.f171933j);
    }

    /* renamed from: a */
    public final void mo59216a(Iterable iterable) {
        copyOnWrite();
        C63565b bVar = (C63565b) this.instance;
        C63565b bVar2 = C63565b.f171933j;
        C62971cq cqVar = bVar.f171940f;
        if (!cqVar.mo58948c()) {
            bVar.f171940f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f171940f);
    }

    /* renamed from: b */
    public final void mo59217b(Iterable iterable) {
        copyOnWrite();
        C63565b bVar = (C63565b) this.instance;
        C63565b bVar2 = C63565b.f171933j;
        bVar.mo59219a();
        C62947c.addAll(iterable, (List) bVar.f171941g);
    }

    /* renamed from: c */
    public final void mo59218c(C56364n nVar) {
        copyOnWrite();
        C63565b bVar = (C63565b) this.instance;
        C63565b bVar2 = C63565b.f171933j;
        nVar.getClass();
        bVar.mo59219a();
        bVar.f171941g.add(nVar);
    }
}

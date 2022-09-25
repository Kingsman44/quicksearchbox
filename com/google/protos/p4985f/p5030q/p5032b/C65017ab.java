package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.f.q.b.ab */
/* compiled from: PG */
public final class C65017ab extends C62934bn implements C63001dt {
    public C65017ab() {
        super(C65018ac.f176068c);
    }

    /* renamed from: a */
    public final void mo59331a(Iterable iterable) {
        copyOnWrite();
        C65018ac acVar = (C65018ac) this.instance;
        C65018ac acVar2 = C65018ac.f176068c;
        C62971cq cqVar = acVar.f176071b;
        if (!cqVar.mo58948c()) {
            acVar.f176071b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) acVar.f176071b);
    }

    /* renamed from: b */
    public final void mo59332b(Iterable iterable) {
        copyOnWrite();
        C65018ac acVar = (C65018ac) this.instance;
        C65018ac acVar2 = C65018ac.f176068c;
        C62964ck ckVar = acVar.f176070a;
        if (!ckVar.mo58948c()) {
            acVar.f176070a = C62942bv.mutableCopy(ckVar);
        }
        C62947c.addAll(iterable, (List) acVar.f176070a);
    }
}

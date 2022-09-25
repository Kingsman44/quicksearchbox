package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.an.c.a.ad */
/* compiled from: PG */
public final class C49258ad extends C62934bn implements C63001dt {
    public C49258ad() {
        super(C49259ae.f127331b);
    }

    /* renamed from: a */
    public final void mo53223a(Iterable iterable) {
        copyOnWrite();
        C49259ae aeVar = (C49259ae) this.instance;
        C49259ae aeVar2 = C49259ae.f127331b;
        C62971cq cqVar = aeVar.f127333a;
        if (!cqVar.mo58948c()) {
            aeVar.f127333a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aeVar.f127333a);
    }
}

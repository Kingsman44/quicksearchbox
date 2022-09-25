package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.agk */
/* compiled from: PG */
public final class agk extends C62934bn implements C63001dt {
    public agk() {
        super(agn.f158655c);
    }

    /* renamed from: a */
    public final void mo56995a(Iterable iterable) {
        copyOnWrite();
        agn agn = (agn) this.instance;
        agn agn2 = agn.f158655c;
        C62971cq cqVar = agn.f158657a;
        if (!cqVar.mo58948c()) {
            agn.f158657a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) agn.f158657a);
    }

    /* renamed from: b */
    public final void mo56996b(Iterable iterable) {
        copyOnWrite();
        agn agn = (agn) this.instance;
        agn agn2 = agn.f158655c;
        C62971cq cqVar = agn.f158658b;
        if (!cqVar.mo58948c()) {
            agn.f158658b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) agn.f158658b);
    }
}

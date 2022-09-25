package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.afj */
/* compiled from: PG */
public final class afj extends C62934bn implements C63001dt {
    public afj() {
        super(afo.f158558g);
    }

    /* renamed from: a */
    public final void mo56987a(afm afm) {
        copyOnWrite();
        afo afo = (afo) this.instance;
        afn afn = (afn) afm.build();
        afo afo2 = afo.f158558g;
        afn.getClass();
        C62971cq cqVar = afo.f158564e;
        if (!cqVar.mo58948c()) {
            afo.f158564e = C62942bv.mutableCopy(cqVar);
        }
        afo.f158564e.add(afn);
    }

    /* renamed from: b */
    public final void mo56988b(ahs ahs) {
        copyOnWrite();
        afo afo = (afo) this.instance;
        afo afo2 = afo.f158558g;
        ahs.getClass();
        C62971cq cqVar = afo.f158563d;
        if (!cqVar.mo58948c()) {
            afo.f158563d = C62942bv.mutableCopy(cqVar);
        }
        afo.f158563d.add(ahs);
    }
}

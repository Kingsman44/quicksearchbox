package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.aex */
/* compiled from: PG */
public final class aex extends C62934bn implements C63001dt {
    public aex() {
        super(agh.f158629l);
    }

    /* renamed from: a */
    public final void mo56983a(ahc ahc) {
        copyOnWrite();
        agh agh = (agh) this.instance;
        agh agh2 = agh.f158629l;
        ahc.getClass();
        C62971cq cqVar = agh.f158634d;
        if (!cqVar.mo58948c()) {
            agh.f158634d = C62942bv.mutableCopy(cqVar);
        }
        agh.f158634d.add(ahc);
    }

    /* renamed from: b */
    public final void mo56984b(afj afj) {
        copyOnWrite();
        agh agh = (agh) this.instance;
        afo afo = (afo) afj.build();
        agh agh2 = agh.f158629l;
        afo.getClass();
        agh.f158639i = afo;
        agh.f158631a |= 128;
    }
}

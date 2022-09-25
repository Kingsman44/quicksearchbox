package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.lk */
/* compiled from: PG */
public final class C60237lk extends C62934bn implements C63001dt {
    public C60237lk() {
        super(C60241lo.f162980w);
    }

    /* renamed from: a */
    public final void mo57077a(C60239lm lmVar) {
        copyOnWrite();
        C60241lo loVar = (C60241lo) this.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        lmVar.getClass();
        C62971cq cqVar = loVar.f163001t;
        if (!cqVar.mo58948c()) {
            loVar.f163001t = C62942bv.mutableCopy(cqVar);
        }
        loVar.f163001t.add(lmVar);
    }

    /* renamed from: b */
    public final void mo57078b(C60305nr nrVar) {
        C60305nr nrVar2;
        copyOnWrite();
        C60241lo loVar = (C60241lo) this.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        nrVar.getClass();
        C60305nr nrVar3 = loVar.f162987f;
        if (!(nrVar3 == null || nrVar3 == (nrVar2 = C60305nr.f163179e))) {
            C60303np npVar = (C60303np) nrVar2.createBuilder(nrVar3);
            npVar.mergeFrom(nrVar);
            nrVar = (C60305nr) npVar.buildPartial();
        }
        loVar.f162987f = nrVar;
        loVar.f162982a |= 64;
    }
}

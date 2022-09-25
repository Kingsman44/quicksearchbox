package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.aio */
/* compiled from: PG */
public final class aio extends C62934bn implements C63001dt {
    public aio() {
        super(aiz.f129446d);
    }

    /* renamed from: a */
    public final void mo53362a(aix aix) {
        copyOnWrite();
        aiz aiz = (aiz) this.instance;
        aiy aiy = (aiy) aix.build();
        aiz aiz2 = aiz.f129446d;
        aiy.getClass();
        C62971cq cqVar = aiz.f129450c;
        if (!cqVar.mo58948c()) {
            aiz.f129450c = C62942bv.mutableCopy(cqVar);
        }
        aiz.f129450c.add(aiy);
    }
}

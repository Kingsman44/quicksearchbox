package com.google.p4281bu.p4282a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bu.a.ap */
/* compiled from: PG */
public final class C56505ap extends C62934bn implements C63001dt {
    public C56505ap() {
        super(C56506aq.f150913b);
    }

    /* renamed from: a */
    public final void mo54427a(C56513ax axVar) {
        copyOnWrite();
        C56506aq aqVar = (C56506aq) this.instance;
        C56506aq aqVar2 = C56506aq.f150913b;
        axVar.getClass();
        C62971cq cqVar = aqVar.f150915a;
        if (!cqVar.mo58948c()) {
            aqVar.f150915a = C62942bv.mutableCopy(cqVar);
        }
        aqVar.f150915a.add(axVar);
    }
}

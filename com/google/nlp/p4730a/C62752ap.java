package com.google.nlp.p4730a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.nlp.a.ap */
/* compiled from: PG */
public final class C62752ap extends C62934bn implements C63001dt {
    public C62752ap() {
        super(C62782ba.f169539b);
    }

    /* renamed from: a */
    public final void mo58631a(C62755as asVar) {
        copyOnWrite();
        C62782ba baVar = (C62782ba) this.instance;
        C62756at atVar = (C62756at) asVar.build();
        C62782ba baVar2 = C62782ba.f169539b;
        atVar.getClass();
        C62971cq cqVar = baVar.f169541a;
        if (!cqVar.mo58948c()) {
            baVar.f169541a = C62942bv.mutableCopy(cqVar);
        }
        baVar.f169541a.add(atVar);
    }
}

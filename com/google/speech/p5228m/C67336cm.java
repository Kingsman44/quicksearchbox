package com.google.speech.p5228m;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.speech.m.cm */
/* compiled from: PG */
public final class C67336cm extends C62934bn implements C63001dt {
    public C67336cm() {
        super(C67337cn.f183024e);
    }

    /* renamed from: a */
    public final void mo59783a(C67284ao aoVar) {
        copyOnWrite();
        C67337cn cnVar = (C67337cn) this.instance;
        C67337cn cnVar2 = C67337cn.f183024e;
        aoVar.getClass();
        C62971cq cqVar = cnVar.f183028c;
        if (!cqVar.mo58948c()) {
            cnVar.f183028c = C62942bv.mutableCopy(cqVar);
        }
        cnVar.f183028c.add(aoVar);
    }
}

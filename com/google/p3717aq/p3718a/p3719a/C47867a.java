package com.google.p3717aq.p3718a.p3719a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.aq.a.a.a */
/* compiled from: PG */
public final class C47867a extends C62934bn implements C63001dt {
    public C47867a() {
        super(C47868b.f123936f);
    }

    /* renamed from: a */
    public final void mo51701a(String str) {
        copyOnWrite();
        C47868b bVar = (C47868b) this.instance;
        C47868b bVar2 = C47868b.f123936f;
        str.getClass();
        C62971cq cqVar = bVar.f123940c;
        if (!cqVar.mo58948c()) {
            bVar.f123940c = C62942bv.mutableCopy(cqVar);
        }
        bVar.f123940c.add(str);
    }
}

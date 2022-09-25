package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.nt */
/* compiled from: PG */
public final class C50186nt extends C62934bn implements C63001dt {
    public C50186nt() {
        super(C50187nu.f130466e);
    }

    /* renamed from: a */
    public final void mo53381a(String str) {
        copyOnWrite();
        C50187nu nuVar = (C50187nu) this.instance;
        C50187nu nuVar2 = C50187nu.f130466e;
        C62971cq cqVar = nuVar.f130471d;
        if (!cqVar.mo58948c()) {
            nuVar.f130471d = C62942bv.mutableCopy(cqVar);
        }
        nuVar.f130471d.add(str);
    }
}

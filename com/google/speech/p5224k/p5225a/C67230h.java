package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.speech.k.a.h */
/* compiled from: PG */
public final class C67230h extends C62934bn implements C63001dt {
    public C67230h() {
        super(C67231i.f182719l);
    }

    /* renamed from: a */
    public final void mo59779a(String str) {
        copyOnWrite();
        C67231i iVar = (C67231i) this.instance;
        C67231i iVar2 = C67231i.f182719l;
        str.getClass();
        C62971cq cqVar = iVar.f182726f;
        if (!cqVar.mo58948c()) {
            iVar.f182726f = C62942bv.mutableCopy(cqVar);
        }
        iVar.f182726f.add(str);
    }
}

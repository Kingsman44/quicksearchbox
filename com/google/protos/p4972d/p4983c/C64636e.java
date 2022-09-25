package com.google.protos.p4972d.p4983c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.d.c.e */
/* compiled from: PG */
public final class C64636e extends C62934bn implements C63001dt {
    public C64636e() {
        super(C64637f.f175219c);
    }

    /* renamed from: a */
    public final void mo59283a(C64635d dVar) {
        copyOnWrite();
        C64637f fVar = (C64637f) this.instance;
        C64637f fVar2 = C64637f.f175219c;
        dVar.getClass();
        C62971cq cqVar = fVar.f175222b;
        if (!cqVar.mo58948c()) {
            fVar.f175222b = C62942bv.mutableCopy(cqVar);
        }
        fVar.f175222b.add(dVar);
    }

    /* renamed from: b */
    public final void mo59284b(int i) {
        copyOnWrite();
        C64637f fVar = (C64637f) this.instance;
        C64637f fVar2 = C64637f.f175219c;
        C62961ch chVar = fVar.f175221a;
        if (!chVar.mo58948c()) {
            fVar.f175221a = C62942bv.mutableCopy(chVar);
        }
        fVar.f175221a.mo58916g(i - 1);
    }
}

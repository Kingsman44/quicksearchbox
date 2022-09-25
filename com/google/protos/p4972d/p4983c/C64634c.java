package com.google.protos.p4972d.p4983c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.d.c.c */
/* compiled from: PG */
public final class C64634c extends C62934bn implements C63001dt {
    public C64634c() {
        super(C64635d.f175215c);
    }

    /* renamed from: a */
    public final void mo59281a(C64637f fVar) {
        copyOnWrite();
        C64635d dVar = (C64635d) this.instance;
        C64635d dVar2 = C64635d.f175215c;
        fVar.getClass();
        C62971cq cqVar = dVar.f175218b;
        if (!cqVar.mo58948c()) {
            dVar.f175218b = C62942bv.mutableCopy(cqVar);
        }
        dVar.f175218b.add(fVar);
    }

    /* renamed from: b */
    public final void mo59282b(int i) {
        copyOnWrite();
        C64635d dVar = (C64635d) this.instance;
        C64635d dVar2 = C64635d.f175215c;
        C62961ch chVar = dVar.f175217a;
        if (!chVar.mo58948c()) {
            dVar.f175217a = C62942bv.mutableCopy(chVar);
        }
        dVar.f175217a.mo58916g(i - 1);
    }
}

package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.aw.b.h */
/* compiled from: PG */
public final class C64090h extends C62934bn implements C63001dt {
    public C64090h() {
        super(C64091i.f173270i);
    }

    /* renamed from: a */
    public final void mo59256a(C63990b bVar) {
        copyOnWrite();
        C64091i iVar = (C64091i) this.instance;
        C64017c cVar = (C64017c) bVar.build();
        C64091i iVar2 = C64091i.f173270i;
        cVar.getClass();
        C62971cq cqVar = iVar.f173276e;
        if (!cqVar.mo58948c()) {
            iVar.f173276e = C62942bv.mutableCopy(cqVar);
        }
        iVar.f173276e.add(cVar);
    }

    /* renamed from: b */
    public final void mo59257b() {
        copyOnWrite();
        C64091i iVar = (C64091i) this.instance;
        C64091i iVar2 = C64091i.f173270i;
        C62971cq cqVar = iVar.f173277f;
        if (!cqVar.mo58948c()) {
            iVar.f173277f = C62942bv.mutableCopy(cqVar);
        }
        iVar.f173277f.add("https://www.googleapis.com/auth/webhistory");
    }
}

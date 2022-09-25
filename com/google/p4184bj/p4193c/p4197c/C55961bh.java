package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bj.c.c.bh */
/* compiled from: PG */
public final class C55961bh extends C62934bn implements C63001dt {
    public C55961bh() {
        super(C55964bk.f149032g);
    }

    /* renamed from: a */
    public final void mo54306a(C55962bi biVar) {
        copyOnWrite();
        C55964bk bkVar = (C55964bk) this.instance;
        C55963bj bjVar = (C55963bj) biVar.build();
        C55964bk bkVar2 = C55964bk.f149032g;
        bjVar.getClass();
        C62971cq cqVar = bkVar.f149035b;
        if (!cqVar.mo58948c()) {
            bkVar.f149035b = C62942bv.mutableCopy(cqVar);
        }
        bkVar.f149035b.add(bjVar);
    }
}

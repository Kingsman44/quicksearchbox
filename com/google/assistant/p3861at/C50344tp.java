package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.tp */
/* compiled from: PG */
public final class C50344tp extends C62934bn implements C63001dt {
    public C50344tp() {
        super(C50345tq.f131022d);
    }

    /* renamed from: a */
    public final void mo53399a(ado ado) {
        copyOnWrite();
        C50345tq tqVar = (C50345tq) this.instance;
        C50345tq tqVar2 = C50345tq.f131022d;
        ado.getClass();
        C62971cq cqVar = tqVar.f131026c;
        if (!cqVar.mo58948c()) {
            tqVar.f131026c = C62942bv.mutableCopy(cqVar);
        }
        tqVar.f131026c.add(ado);
    }
}

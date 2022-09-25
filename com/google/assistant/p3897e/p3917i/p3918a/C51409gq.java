package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.e.i.a.gq */
/* compiled from: PG */
public final class C51409gq extends C62934bn implements C63001dt {
    public C51409gq() {
        super(C51411gs.f133914b);
    }

    /* renamed from: a */
    public final C51408gp mo53612a() {
        return (C51408gp) ((C51411gs) this.instance).f133916a.get(0);
    }

    /* renamed from: b */
    public final void mo53613b(C51407go goVar) {
        copyOnWrite();
        C51411gs gsVar = (C51411gs) this.instance;
        C51408gp gpVar = (C51408gp) goVar.build();
        C51411gs gsVar2 = C51411gs.f133914b;
        gpVar.getClass();
        C62971cq cqVar = gsVar.f133916a;
        if (!cqVar.mo58948c()) {
            gsVar.f133916a = C62942bv.mutableCopy(cqVar);
        }
        gsVar.f133916a.set(0, gpVar);
    }
}

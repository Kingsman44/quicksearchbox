package com.google.assistant.p3886c.p3887a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.c.a.w */
/* compiled from: PG */
public final class C50687w extends C62934bn implements C63001dt {
    public C50687w() {
        super(C50688x.f131868b);
    }

    /* renamed from: a */
    public final void mo53424a(Iterable iterable) {
        copyOnWrite();
        C50688x xVar = (C50688x) this.instance;
        C50688x xVar2 = C50688x.f131868b;
        C62971cq cqVar = xVar.f131870a;
        if (!cqVar.mo58948c()) {
            xVar.f131870a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) xVar.f131870a);
    }
}

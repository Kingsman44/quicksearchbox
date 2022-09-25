package com.google.android.apps.gsa.tasks;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.tasks.ab */
/* compiled from: PG */
public final class C118467ab extends C62934bn implements C63001dt {
    public C118467ab() {
        super(C118468ac.f328813d);
    }

    /* renamed from: a */
    public final void mo103713a(String str) {
        copyOnWrite();
        C118468ac acVar = (C118468ac) this.instance;
        C118468ac acVar2 = C118468ac.f328813d;
        str.getClass();
        C62971cq cqVar = acVar.f328816b;
        if (!cqVar.mo58948c()) {
            acVar.f328816b = C62942bv.mutableCopy(cqVar);
        }
        acVar.f328816b.add(str);
    }
}

package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.g.d.ah */
/* compiled from: PG */
public final class C9145ah extends C62934bn implements C63001dt {
    public C9145ah() {
        super(C9146ai.f31566f);
    }

    /* renamed from: a */
    public final void mo17448a(Iterable iterable) {
        copyOnWrite();
        C9146ai aiVar = (C9146ai) this.instance;
        C9146ai aiVar2 = C9146ai.f31566f;
        C62971cq cqVar = aiVar.f31571d;
        if (!cqVar.mo58948c()) {
            aiVar.f31571d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aiVar.f31571d);
    }
}

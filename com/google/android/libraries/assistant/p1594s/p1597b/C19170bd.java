package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.s.b.bd */
/* compiled from: PG */
public final class C19170bd extends C62934bn implements C63001dt {
    public C19170bd() {
        super(C19171be.f53699b);
    }

    /* renamed from: a */
    public final void mo24304a(Iterable iterable) {
        copyOnWrite();
        C19171be beVar = (C19171be) this.instance;
        C19171be beVar2 = C19171be.f53699b;
        C62971cq cqVar = beVar.f53701a;
        if (!cqVar.mo58948c()) {
            beVar.f53701a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) beVar.f53701a);
    }
}

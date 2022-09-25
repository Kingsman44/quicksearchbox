package com.google.p4500cm.p4518d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.cm.d.a */
/* compiled from: PG */
public final class C58177a extends C62934bn implements C63001dt {
    public C58177a() {
        super(C58186c.f155565i);
    }

    /* renamed from: a */
    public final void mo54679a(Iterable iterable) {
        copyOnWrite();
        C58186c cVar = (C58186c) this.instance;
        C58186c cVar2 = C58186c.f155565i;
        C62971cq cqVar = cVar.f155572f;
        if (!cqVar.mo58948c()) {
            cVar.f155572f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) cVar.f155572f);
    }
}

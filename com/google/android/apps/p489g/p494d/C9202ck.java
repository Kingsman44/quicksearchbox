package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.g.d.ck */
/* compiled from: PG */
public final class C9202ck extends C62934bn implements C63001dt {
    public C9202ck() {
        super(C9203cl.f31796e);
    }

    /* renamed from: a */
    public final void mo17453a(Iterable iterable) {
        copyOnWrite();
        C9203cl clVar = (C9203cl) this.instance;
        C9203cl clVar2 = C9203cl.f31796e;
        C62971cq cqVar = clVar.f31801d;
        if (!cqVar.mo58948c()) {
            clVar.f31801d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) clVar.f31801d);
    }
}

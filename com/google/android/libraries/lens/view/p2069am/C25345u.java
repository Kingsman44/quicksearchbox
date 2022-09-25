package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.am.u */
/* compiled from: PG */
public final class C25345u extends C62934bn implements C63001dt {
    public C25345u() {
        super(C25346v.f68994b);
    }

    /* renamed from: a */
    public final void mo30374a(Iterable iterable) {
        copyOnWrite();
        C25346v vVar = (C25346v) this.instance;
        C25346v vVar2 = C25346v.f68994b;
        C62971cq cqVar = vVar.f68996a;
        if (!cqVar.mo58948c()) {
            vVar.f68996a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) vVar.f68996a);
    }
}

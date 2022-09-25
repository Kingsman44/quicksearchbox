package com.google.android.apps.gsa.sidekick.shared.p7238g;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.g.c */
/* compiled from: PG */
public final class C91733c extends C62934bn implements C63001dt {
    public C91733c() {
        super(C91734d.f255848e);
    }

    /* renamed from: a */
    public final void mo86232a(Iterable iterable) {
        copyOnWrite();
        C91734d dVar = (C91734d) this.instance;
        C91734d dVar2 = C91734d.f255848e;
        C62971cq cqVar = dVar.f255852c;
        if (!cqVar.mo58948c()) {
            dVar.f255852c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) dVar.f255852c);
    }
}

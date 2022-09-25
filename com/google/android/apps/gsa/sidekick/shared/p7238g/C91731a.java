package com.google.android.apps.gsa.sidekick.shared.p7238g;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.g.a */
/* compiled from: PG */
public final class C91731a extends C62934bn implements C63001dt {
    public C91731a() {
        super(C91732b.f255833m);
    }

    /* renamed from: a */
    public final void mo86230a(C91734d dVar) {
        copyOnWrite();
        C91732b bVar = (C91732b) this.instance;
        C91732b bVar2 = C91732b.f255833m;
        dVar.getClass();
        C62971cq cqVar = bVar.f255842h;
        if (!cqVar.mo58948c()) {
            bVar.f255842h = C62942bv.mutableCopy(cqVar);
        }
        bVar.f255842h.add(dVar);
    }
}

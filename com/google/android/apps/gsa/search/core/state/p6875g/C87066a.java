package com.google.android.apps.gsa.search.core.state.p6875g;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.state.g.a */
/* compiled from: PG */
public final class C87066a extends C62934bn implements C63001dt {
    public C87066a() {
        super(C87067b.f235250e);
    }

    /* renamed from: a */
    public final void mo80731a(C63088z zVar) {
        copyOnWrite();
        C87067b bVar = (C87067b) this.instance;
        C87067b bVar2 = C87067b.f235250e;
        zVar.getClass();
        C62971cq cqVar = bVar.f235255c;
        if (!cqVar.mo58948c()) {
            bVar.f235255c = C62942bv.mutableCopy(cqVar);
        }
        bVar.f235255c.add(zVar);
    }
}

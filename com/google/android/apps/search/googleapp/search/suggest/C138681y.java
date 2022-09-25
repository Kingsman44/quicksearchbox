package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.y */
/* compiled from: PG */
public final class C138681y extends C62934bn implements C63001dt {
    public C138681y() {
        super(C138015ag.f375479h);
    }

    /* renamed from: a */
    public final void mo114466a(C138030av avVar) {
        copyOnWrite();
        C138015ag agVar = (C138015ag) this.instance;
        C138015ag agVar2 = C138015ag.f375479h;
        avVar.getClass();
        C62971cq cqVar = agVar.f375483c;
        if (!cqVar.mo58948c()) {
            agVar.f375483c = C62942bv.mutableCopy(cqVar);
        }
        agVar.f375483c.add(avVar);
    }
}

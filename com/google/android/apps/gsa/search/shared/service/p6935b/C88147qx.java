package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.qx */
/* compiled from: PG */
public final class C88147qx extends C62934bn implements C63001dt {
    public C88147qx() {
        super(C88148qy.f238276d);
    }

    /* renamed from: a */
    public final void mo81988a(C88149qz qzVar) {
        copyOnWrite();
        C88148qy qyVar = (C88148qy) this.instance;
        C88151ra raVar = (C88151ra) qzVar.build();
        C88148qy qyVar2 = C88148qy.f238276d;
        raVar.getClass();
        C62971cq cqVar = qyVar.f238280c;
        if (!cqVar.mo58948c()) {
            qyVar.f238280c = C62942bv.mutableCopy(cqVar);
        }
        qyVar.f238280c.add(raVar);
    }
}

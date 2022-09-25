package com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.a.a.n */
/* compiled from: PG */
public final class C79892n extends C62934bn implements C63001dt {
    public C79892n() {
        super(C79893o.f218982d);
    }

    /* renamed from: a */
    public final void mo74272a(Iterable iterable) {
        copyOnWrite();
        C79893o oVar = (C79893o) this.instance;
        C79893o oVar2 = C79893o.f218982d;
        C62971cq cqVar = oVar.f218986c;
        if (!cqVar.mo58948c()) {
            oVar.f218986c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) oVar.f218986c);
    }
}

package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.k */
/* compiled from: PG */
public final class C80431k extends C62934bn implements C63001dt {
    public C80431k() {
        super(C80432l.f220749e);
    }

    /* renamed from: a */
    public final void mo74327a(Iterable iterable) {
        copyOnWrite();
        C80432l lVar = (C80432l) this.instance;
        C80432l lVar2 = C80432l.f220749e;
        C62971cq cqVar = lVar.f220752b;
        if (!cqVar.mo58948c()) {
            lVar.f220752b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) lVar.f220752b);
    }
}

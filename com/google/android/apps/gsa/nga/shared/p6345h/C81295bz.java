package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bz */
/* compiled from: PG */
public final class C81295bz extends C62934bn implements C63001dt {
    public C81295bz() {
        super(C81297ca.f222540b);
    }

    /* renamed from: a */
    public final void mo74985a(Iterable iterable) {
        copyOnWrite();
        C81297ca caVar = (C81297ca) this.instance;
        C81297ca caVar2 = C81297ca.f222540b;
        C62971cq cqVar = caVar.f222542a;
        if (!cqVar.mo58948c()) {
            caVar.f222542a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) caVar.f222542a);
    }
}

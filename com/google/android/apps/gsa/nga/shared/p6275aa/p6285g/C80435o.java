package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.o */
/* compiled from: PG */
public final class C80435o extends C62934bn implements C63001dt {
    public C80435o() {
        super(C80436p.f220766g);
    }

    /* renamed from: a */
    public final void mo74328a(Iterable iterable) {
        copyOnWrite();
        C80436p pVar = (C80436p) this.instance;
        C80436p pVar2 = C80436p.f220766g;
        C62971cq cqVar = pVar.f220769b;
        if (!cqVar.mo58948c()) {
            pVar.f220769b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) pVar.f220769b);
    }
}

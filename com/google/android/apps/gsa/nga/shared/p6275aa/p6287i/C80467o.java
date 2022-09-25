package com.google.android.apps.gsa.nga.shared.p6275aa.p6287i;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.i.o */
/* compiled from: PG */
public final class C80467o extends C62934bn implements C63001dt {
    public C80467o() {
        super(C80468p.f220849f);
    }

    /* renamed from: a */
    public final void mo74335a(Iterable iterable) {
        copyOnWrite();
        C80468p pVar = (C80468p) this.instance;
        C80468p pVar2 = C80468p.f220849f;
        C62971cq cqVar = pVar.f220853c;
        if (!cqVar.mo58948c()) {
            pVar.f220853c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) pVar.f220853c);
    }
}

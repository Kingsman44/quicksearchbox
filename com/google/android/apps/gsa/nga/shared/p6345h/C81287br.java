package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.br */
/* compiled from: PG */
public final class C81287br extends C62934bn implements C63001dt {
    public C81287br() {
        super(C81288bs.f222523c);
    }

    /* renamed from: a */
    public final void mo74981a(Iterable iterable) {
        copyOnWrite();
        C81288bs bsVar = (C81288bs) this.instance;
        C81288bs bsVar2 = C81288bs.f222523c;
        C62971cq cqVar = bsVar.f222526b;
        if (!cqVar.mo58948c()) {
            bsVar.f222526b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bsVar.f222526b);
    }

    /* renamed from: b */
    public final void mo74982b(Iterable iterable) {
        copyOnWrite();
        C81288bs bsVar = (C81288bs) this.instance;
        C81288bs bsVar2 = C81288bs.f222523c;
        C62971cq cqVar = bsVar.f222525a;
        if (!cqVar.mo58948c()) {
            bsVar.f222525a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bsVar.f222525a);
    }
}

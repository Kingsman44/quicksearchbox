package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bv */
/* compiled from: PG */
public final class C81291bv extends C62934bn implements C63001dt {
    public C81291bv() {
        super(C81292bw.f222532c);
    }

    /* renamed from: a */
    public final void mo74983a(Iterable iterable) {
        copyOnWrite();
        C81292bw bwVar = (C81292bw) this.instance;
        C81292bw bwVar2 = C81292bw.f222532c;
        C62971cq cqVar = bwVar.f222535b;
        if (!cqVar.mo58948c()) {
            bwVar.f222535b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bwVar.f222535b);
    }

    /* renamed from: b */
    public final void mo74984b(Iterable iterable) {
        copyOnWrite();
        C81292bw bwVar = (C81292bw) this.instance;
        C81292bw bwVar2 = C81292bw.f222532c;
        C62971cq cqVar = bwVar.f222534a;
        if (!cqVar.mo58948c()) {
            bwVar.f222534a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bwVar.f222534a);
    }
}

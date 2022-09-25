package com.google.android.apps.search.podcasts.p10576l;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.l.ab */
/* compiled from: PG */
public final class C140440ab extends C62934bn implements C63001dt {
    public C140440ab() {
        super(C140441ac.f381485d);
    }

    /* renamed from: a */
    public final void mo115674a(Iterable iterable) {
        copyOnWrite();
        C140441ac acVar = (C140441ac) this.instance;
        C140441ac acVar2 = C140441ac.f381485d;
        C62971cq cqVar = acVar.f381487a;
        if (!cqVar.mo58948c()) {
            acVar.f381487a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) acVar.f381487a);
    }
}

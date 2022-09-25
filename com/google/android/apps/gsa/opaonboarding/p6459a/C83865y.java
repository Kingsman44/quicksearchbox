package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.y */
/* compiled from: PG */
public final class C83865y extends C62934bn implements C63001dt {
    public C83865y() {
        super(C83823ad.f228441e);
    }

    /* renamed from: a */
    public final void mo77206a(Iterable iterable) {
        copyOnWrite();
        C83823ad adVar = (C83823ad) this.instance;
        C83823ad adVar2 = C83823ad.f228441e;
        C62971cq cqVar = adVar.f228444b;
        if (!cqVar.mo58948c()) {
            adVar.f228444b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) adVar.f228444b);
    }
}

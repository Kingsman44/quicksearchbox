package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.ac */
/* compiled from: PG */
public final class C111648ac extends C62934bn implements C63001dt {
    public C111648ac() {
        super(C111649ad.f310414d);
    }

    /* renamed from: a */
    public final void mo99201a(Iterable iterable) {
        copyOnWrite();
        C111649ad adVar = (C111649ad) this.instance;
        C111649ad adVar2 = C111649ad.f310414d;
        C62971cq cqVar = adVar.f310417b;
        if (!cqVar.mo58948c()) {
            adVar.f310417b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) adVar.f310417b);
    }
}

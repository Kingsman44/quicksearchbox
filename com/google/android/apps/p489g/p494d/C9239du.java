package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.g.d.du */
/* compiled from: PG */
public final class C9239du extends C62934bn implements C63001dt {
    public C9239du() {
        super(C9244dz.f31962i);
    }

    /* renamed from: a */
    public final void mo17456a(Iterable iterable) {
        copyOnWrite();
        C9244dz dzVar = (C9244dz) this.instance;
        C9244dz dzVar2 = C9244dz.f31962i;
        C62971cq cqVar = dzVar.f31969f;
        if (!cqVar.mo58948c()) {
            dzVar.f31969f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) dzVar.f31969f);
    }
}

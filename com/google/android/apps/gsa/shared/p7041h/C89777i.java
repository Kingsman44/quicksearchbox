package com.google.android.apps.gsa.shared.p7041h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.h.i */
/* compiled from: PG */
public final class C89777i extends C62934bn implements C63001dt {
    public C89777i() {
        super(C89778j.f242996b);
    }

    /* renamed from: a */
    public final void mo83622a(Iterable iterable) {
        copyOnWrite();
        C89778j jVar = (C89778j) this.instance;
        C89778j jVar2 = C89778j.f242996b;
        C62971cq cqVar = jVar.f242998a;
        if (!cqVar.mo58948c()) {
            jVar.f242998a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) jVar.f242998a);
    }
}

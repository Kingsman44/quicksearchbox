package com.google.android.libraries.p590as.p593b.p596b.p604g;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.as.b.b.g.h */
/* compiled from: PG */
public final class C10880h extends C62934bn implements C63001dt {
    public C10880h() {
        super(C10881i.f35965b);
    }

    /* renamed from: a */
    public final void mo19331a(Iterable iterable) {
        copyOnWrite();
        C10881i iVar = (C10881i) this.instance;
        C10881i iVar2 = C10881i.f35965b;
        C62971cq cqVar = iVar.f35967a;
        if (!cqVar.mo58948c()) {
            iVar.f35967a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) iVar.f35967a);
    }
}

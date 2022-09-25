package com.google.android.apps.gsa.shared.logger.p7055e;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.logger.e.a */
/* compiled from: PG */
public final class C89887a extends C62934bn implements C63001dt {
    public C89887a() {
        super(C89905b.f246328e);
    }

    /* renamed from: a */
    public final void mo83726a(Iterable iterable) {
        copyOnWrite();
        C89905b bVar = (C89905b) this.instance;
        C89905b bVar2 = C89905b.f246328e;
        C62971cq cqVar = bVar.f246331b;
        if (!cqVar.mo58948c()) {
            bVar.f246331b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f246331b);
    }
}

package com.google.android.libraries.gsa.actionusermodel.p1830c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.c.a */
/* compiled from: PG */
public final class C22098a extends C62934bn implements C63001dt {
    public C22098a() {
        super(C22099b.f60908d);
    }

    /* renamed from: a */
    public final void mo27353a(Iterable iterable) {
        copyOnWrite();
        C22099b bVar = (C22099b) this.instance;
        C22099b bVar2 = C22099b.f60908d;
        C62971cq cqVar = bVar.f60912c;
        if (!cqVar.mo58948c()) {
            bVar.f60912c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f60912c);
    }
}

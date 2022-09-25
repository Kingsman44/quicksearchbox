package com.google.android.apps.p464c.p465a.p466a.p467a.p468a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.c.a.a.a.a.a */
/* compiled from: PG */
public final class C9015a extends C62934bn implements C63001dt {
    public C9015a() {
        super(C9016b.f31143e);
    }

    /* renamed from: a */
    public final void mo17310a(Iterable iterable) {
        copyOnWrite();
        C9016b bVar = (C9016b) this.instance;
        C9016b bVar2 = C9016b.f31143e;
        C62971cq cqVar = bVar.f31148d;
        if (!cqVar.mo58948c()) {
            bVar.f31148d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f31148d);
    }
}

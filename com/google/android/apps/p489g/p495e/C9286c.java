package com.google.android.apps.p489g.p495e;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.g.e.c */
/* compiled from: PG */
public final class C9286c extends C62934bn implements C63001dt {
    public C9286c() {
        super(C9287d.f32233f);
    }

    /* renamed from: a */
    public final void mo17480a(Iterable iterable) {
        copyOnWrite();
        C9287d dVar = (C9287d) this.instance;
        C9287d dVar2 = C9287d.f32233f;
        C62971cq cqVar = dVar.f32239e;
        if (!cqVar.mo58948c()) {
            dVar.f32239e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) dVar.f32239e);
    }
}

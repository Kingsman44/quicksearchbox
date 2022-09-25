package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.g.d.eo */
/* compiled from: PG */
public final class C9260eo extends C62934bn implements C63001dt {
    public C9260eo() {
        super(C9261ep.f32026h);
    }

    /* renamed from: a */
    public final void mo17458a(Iterable iterable) {
        copyOnWrite();
        C9261ep epVar = (C9261ep) this.instance;
        C9261ep epVar2 = C9261ep.f32026h;
        C62971cq cqVar = epVar.f32034g;
        if (!cqVar.mo58948c()) {
            epVar.f32034g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) epVar.f32034g);
    }
}

package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.g.d.w */
/* compiled from: PG */
public final class C9279w extends C62934bn implements C63001dt {
    public C9279w() {
        super(C9280x.f32220d);
    }

    /* renamed from: a */
    public final void mo17466a(Iterable iterable) {
        copyOnWrite();
        C9280x xVar = (C9280x) this.instance;
        C9280x xVar2 = C9280x.f32220d;
        C62971cq cqVar = xVar.f32223b;
        if (!cqVar.mo58948c()) {
            xVar.f32223b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) xVar.f32223b);
    }
}

package com.google.android.libraries.componentview.components.elements.p1696a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.elements.a.e */
/* compiled from: PG */
public final class C20380e extends C62934bn implements C63001dt {
    public C20380e() {
        super(C20381f.f57303f);
    }

    /* renamed from: a */
    public final void mo25383a(Iterable iterable) {
        copyOnWrite();
        C20381f fVar = (C20381f) this.instance;
        C20381f fVar2 = C20381f.f57303f;
        C62971cq cqVar = fVar.f57307b;
        if (!cqVar.mo58948c()) {
            fVar.f57307b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar.f57307b);
    }
}

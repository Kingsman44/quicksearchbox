package com.google.android.libraries.componentview.components.p1685b.p1686a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.b.a.a */
/* compiled from: PG */
public final class C19889a extends C62934bn implements C63001dt {
    public C19889a() {
        super(C19892d.f55637k);
    }

    /* renamed from: a */
    public final void mo25165a(Iterable iterable) {
        copyOnWrite();
        C19892d dVar = (C19892d) this.instance;
        C19892d dVar2 = C19892d.f55637k;
        C62971cq cqVar = dVar.f55641b;
        if (!cqVar.mo58948c()) {
            dVar.f55641b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) dVar.f55641b);
    }
}

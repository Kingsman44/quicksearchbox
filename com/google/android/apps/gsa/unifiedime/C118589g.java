package com.google.android.apps.gsa.unifiedime;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.unifiedime.g */
/* compiled from: PG */
public final class C118589g extends C62934bn implements C63001dt {
    public C118589g() {
        super(C118590h.f330865d);
    }

    /* renamed from: a */
    public final void mo103774a(Iterable iterable) {
        copyOnWrite();
        C118590h hVar = (C118590h) this.instance;
        C118590h hVar2 = C118590h.f330865d;
        C62971cq cqVar = hVar.f330868b;
        if (!cqVar.mo58948c()) {
            hVar.f330868b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) hVar.f330868b);
    }
}

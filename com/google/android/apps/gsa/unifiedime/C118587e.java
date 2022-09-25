package com.google.android.apps.gsa.unifiedime;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.unifiedime.e */
/* compiled from: PG */
public final class C118587e extends C62934bn implements C63001dt {
    public C118587e() {
        super(C118588f.f330859e);
    }

    /* renamed from: a */
    public final void mo103773a(Iterable iterable) {
        copyOnWrite();
        C118588f fVar = (C118588f) this.instance;
        C118588f fVar2 = C118588f.f330859e;
        C62971cq cqVar = fVar.f330864d;
        if (!cqVar.mo58948c()) {
            fVar.f330864d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar.f330864d);
    }
}

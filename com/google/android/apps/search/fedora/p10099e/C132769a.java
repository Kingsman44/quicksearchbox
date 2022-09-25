package com.google.android.apps.search.fedora.p10099e;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.fedora.e.a */
/* compiled from: PG */
public final class C132769a extends C62934bn implements C63001dt {
    public C132769a() {
        super(C132798f.f362315o);
    }

    /* renamed from: a */
    public final void mo110905a(Iterable iterable) {
        copyOnWrite();
        C132798f fVar = (C132798f) this.instance;
        C132798f fVar2 = C132798f.f362315o;
        C62971cq cqVar = fVar.f362322f;
        if (!cqVar.mo58948c()) {
            fVar.f362322f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar.f362322f);
    }
}

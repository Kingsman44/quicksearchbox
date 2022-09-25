package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.bd */
/* compiled from: PG */
public final class C97905bd extends C62934bn implements C63001dt {
    public C97905bd() {
        super(C97908bg.f273364e);
    }

    /* renamed from: a */
    public final void mo90842a(Iterable iterable) {
        copyOnWrite();
        C97908bg bgVar = (C97908bg) this.instance;
        C97908bg bgVar2 = C97908bg.f273364e;
        C62971cq cqVar = bgVar.f273368c;
        if (!cqVar.mo58948c()) {
            bgVar.f273368c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bgVar.f273368c);
    }
}

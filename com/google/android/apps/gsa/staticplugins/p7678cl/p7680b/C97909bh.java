package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.bh */
/* compiled from: PG */
public final class C97909bh extends C62934bn implements C63001dt {
    public C97909bh() {
        super(C97910bi.f273370e);
    }

    /* renamed from: a */
    public final void mo90843a(Iterable iterable) {
        copyOnWrite();
        C97910bi biVar = (C97910bi) this.instance;
        C97910bi biVar2 = C97910bi.f273370e;
        C62971cq cqVar = biVar.f273374c;
        if (!cqVar.mo58948c()) {
            biVar.f273374c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) biVar.f273374c);
    }
}

package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.apw */
/* compiled from: PG */
public final class apw extends C62934bn implements C63001dt {
    public apw() {
        super(apx.f159707d);
    }

    /* renamed from: a */
    public final void mo57035a(Iterable iterable) {
        copyOnWrite();
        apx apx = (apx) this.instance;
        apx apx2 = apx.f159707d;
        C62971cq cqVar = apx.f159711c;
        if (!cqVar.mo58948c()) {
            apx.f159711c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) apx.f159711c);
    }
}

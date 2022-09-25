package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aal */
/* compiled from: PG */
public final class aal extends C62934bn implements C63001dt {
    public aal() {
        super(aam.f237086e);
    }

    /* renamed from: a */
    public final void mo81977a(Iterable iterable) {
        copyOnWrite();
        aam aam = (aam) this.instance;
        aam aam2 = aam.f237086e;
        C62971cq cqVar = aam.f237090c;
        if (!cqVar.mo58948c()) {
            aam.f237090c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aam.f237090c);
    }
}

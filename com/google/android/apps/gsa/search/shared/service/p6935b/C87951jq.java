package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jq */
/* compiled from: PG */
public final class C87951jq extends C62934bn implements C63001dt {
    public C87951jq() {
        super(C87952jr.f237869b);
    }

    /* renamed from: a */
    public final void mo81983a(Iterable iterable) {
        copyOnWrite();
        C87952jr jrVar = (C87952jr) this.instance;
        C87952jr jrVar2 = C87952jr.f237869b;
        C62971cq cqVar = jrVar.f237871a;
        if (!cqVar.mo58948c()) {
            jrVar.f237871a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) jrVar.f237871a);
    }
}

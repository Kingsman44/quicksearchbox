package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.pg */
/* compiled from: PG */
public final class C88103pg extends C62934bn implements C63001dt {
    public C88103pg() {
        super(C88104ph.f238195b);
    }

    /* renamed from: a */
    public final void mo81986a(String str) {
        copyOnWrite();
        C88104ph phVar = (C88104ph) this.instance;
        C88104ph phVar2 = C88104ph.f238195b;
        str.getClass();
        C62971cq cqVar = phVar.f238197a;
        if (!cqVar.mo58948c()) {
            phVar.f238197a = C62942bv.mutableCopy(cqVar);
        }
        phVar.f238197a.add(str);
    }
}

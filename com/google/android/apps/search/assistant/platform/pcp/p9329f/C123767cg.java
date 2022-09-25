package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.cg */
/* compiled from: PG */
public final class C123767cg extends C62934bn implements C63001dt {
    public C123767cg() {
        super(C123768ch.f341894d);
    }

    /* renamed from: a */
    public final void mo106129a(Iterable iterable) {
        copyOnWrite();
        C123768ch chVar = (C123768ch) this.instance;
        C123768ch chVar2 = C123768ch.f341894d;
        C62971cq cqVar = chVar.f341897b;
        if (!cqVar.mo58948c()) {
            chVar.f341897b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) chVar.f341897b);
    }
}

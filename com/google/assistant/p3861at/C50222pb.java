package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.pb */
/* compiled from: PG */
public final class C50222pb extends C62934bn implements C63001dt {
    public C50222pb() {
        super(C50236pp.f130618f);
    }

    /* renamed from: a */
    public final void mo53387a(C50235po poVar) {
        copyOnWrite();
        C50236pp ppVar = (C50236pp) this.instance;
        C50236pp ppVar2 = C50236pp.f130618f;
        poVar.getClass();
        C62971cq cqVar = ppVar.f130624e;
        if (!cqVar.mo58948c()) {
            ppVar.f130624e = C62942bv.mutableCopy(cqVar);
        }
        ppVar.f130624e.add(poVar);
    }
}

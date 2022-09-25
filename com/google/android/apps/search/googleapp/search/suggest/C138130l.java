package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.l */
/* compiled from: PG */
public final class C138130l extends C62934bn implements C63001dt {
    public C138130l() {
        super(C138131m.f375814f);
    }

    /* renamed from: a */
    public final void mo114162a(C138681y yVar) {
        copyOnWrite();
        C138131m mVar = (C138131m) this.instance;
        C138015ag agVar = (C138015ag) yVar.build();
        C138131m mVar2 = C138131m.f375814f;
        agVar.getClass();
        C62971cq cqVar = mVar.f375818c;
        if (!cqVar.mo58948c()) {
            mVar.f375818c = C62942bv.mutableCopy(cqVar);
        }
        mVar.f375818c.add(agVar);
    }
}

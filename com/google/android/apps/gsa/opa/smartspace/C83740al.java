package com.google.android.apps.gsa.opa.smartspace;

import com.google.assistant.p3886c.C50818do;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.al */
/* compiled from: PG */
public final class C83740al extends C62934bn implements C63001dt {
    public C83740al() {
        super(C83741am.f228248e);
    }

    /* renamed from: a */
    public final void mo77054a(C50818do doVar) {
        copyOnWrite();
        C83741am amVar = (C83741am) this.instance;
        C83741am amVar2 = C83741am.f228248e;
        doVar.getClass();
        C62971cq cqVar = amVar.f228253d;
        if (!cqVar.mo58948c()) {
            amVar.f228253d = C62942bv.mutableCopy(cqVar);
        }
        amVar.f228253d.add(doVar);
    }
}

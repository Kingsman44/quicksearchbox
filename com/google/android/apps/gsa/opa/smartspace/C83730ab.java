package com.google.android.apps.gsa.opa.smartspace;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.ab */
/* compiled from: PG */
public final class C83730ab extends C62934bn implements C63001dt {
    public C83730ab() {
        super(C83739ak.f228230q);
    }

    /* renamed from: a */
    public final void mo77053a(C83731ac acVar) {
        copyOnWrite();
        C83739ak akVar = (C83739ak) this.instance;
        C83734af afVar = (C83734af) acVar.build();
        C83739ak akVar2 = C83739ak.f228230q;
        afVar.getClass();
        C62971cq cqVar = akVar.f228243l;
        if (!cqVar.mo58948c()) {
            akVar.f228243l = C62942bv.mutableCopy(cqVar);
        }
        akVar.f228243l.add(afVar);
    }
}

package com.google.protos.youtube.elements;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.youtube.elements.cx */
/* compiled from: PG */
public final class C66179cx extends C62934bn implements C63001dt {
    public C66179cx() {
        super(C66180cy.f179956b);
    }

    /* renamed from: a */
    public final void mo59444a(C66181cz czVar) {
        copyOnWrite();
        C66180cy cyVar = (C66180cy) this.instance;
        C66187da daVar = (C66187da) czVar.build();
        C66180cy cyVar2 = C66180cy.f179956b;
        daVar.getClass();
        C62971cq cqVar = cyVar.f179958a;
        if (!cqVar.mo58948c()) {
            cyVar.f179958a = C62942bv.mutableCopy(cqVar);
        }
        cyVar.f179958a.add(daVar);
    }
}

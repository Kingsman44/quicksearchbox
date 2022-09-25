package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.speech.j.a.z */
/* compiled from: PG */
public final class C66759z extends C62934bn implements C63001dt {
    public C66759z() {
        super(C66697aa.f181436b);
    }

    /* renamed from: a */
    public final void mo59737a(String str) {
        copyOnWrite();
        C66697aa aaVar = (C66697aa) this.instance;
        C66697aa aaVar2 = C66697aa.f181436b;
        C62971cq cqVar = aaVar.f181438a;
        if (!cqVar.mo58948c()) {
            aaVar.f181438a = C62942bv.mutableCopy(cqVar);
        }
        aaVar.f181438a.add(str);
    }
}

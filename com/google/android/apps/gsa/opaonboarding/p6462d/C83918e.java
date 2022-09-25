package com.google.android.apps.gsa.opaonboarding.p6462d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.e */
/* compiled from: PG */
public final class C83918e extends C62934bn implements C63001dt {
    public C83918e() {
        super(C83919f.f228563e);
    }

    /* renamed from: a */
    public final void mo77329a(String str) {
        copyOnWrite();
        C83919f fVar = (C83919f) this.instance;
        C83919f fVar2 = C83919f.f228563e;
        str.getClass();
        C62971cq cqVar = fVar.f228566b;
        if (!cqVar.mo58948c()) {
            fVar.f228566b = C62942bv.mutableCopy(cqVar);
        }
        fVar.f228566b.add(str);
    }
}

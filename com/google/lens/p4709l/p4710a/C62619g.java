package com.google.lens.p4709l.p4710a;

import com.google.android.libraries.lens.ondevice.p2037n.C24775ah;
import com.google.android.libraries.lens.ondevice.p2037n.C24776ai;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.lens.l.a.g */
/* compiled from: PG */
public final class C62619g extends C62934bn implements C63001dt {
    public C62619g() {
        super(C62620h.f169066b);
    }

    /* renamed from: a */
    public final void mo58513a(C24775ah ahVar) {
        copyOnWrite();
        C62620h hVar = (C62620h) this.instance;
        C24776ai aiVar = (C24776ai) ahVar.build();
        C62620h hVar2 = C62620h.f169066b;
        aiVar.getClass();
        C62971cq cqVar = hVar.f169068a;
        if (!cqVar.mo58948c()) {
            hVar.f169068a = C62942bv.mutableCopy(cqVar);
        }
        hVar.f169068a.add(aiVar);
    }
}

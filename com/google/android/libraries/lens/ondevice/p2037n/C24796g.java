package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.lens.ondevice.n.g */
/* compiled from: PG */
public final class C24796g extends C62934bn implements C63001dt {
    public C24796g() {
        super(C24797h.f67760b);
    }

    /* renamed from: a */
    public final void mo30004a(C24810u uVar) {
        copyOnWrite();
        C24797h hVar = (C24797h) this.instance;
        C24797h hVar2 = C24797h.f67760b;
        uVar.getClass();
        C62971cq cqVar = hVar.f67762a;
        if (!cqVar.mo58948c()) {
            hVar.f67762a = C62942bv.mutableCopy(cqVar);
        }
        hVar.f67762a.add(uVar);
    }
}

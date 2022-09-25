package com.google.android.apps.gsa.search.core.p6805i;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.search.core.i.j */
/* compiled from: PG */
public final class C86114j extends C62934bn implements C63001dt {
    public C86114j() {
        super(C86115k.f232756b);
    }

    /* renamed from: a */
    public final void mo79733a(C86112h hVar) {
        copyOnWrite();
        C86115k kVar = (C86115k) this.instance;
        C86113i iVar = (C86113i) hVar.build();
        C86115k kVar2 = C86115k.f232756b;
        iVar.getClass();
        C62971cq cqVar = kVar.f232758a;
        if (!cqVar.mo58948c()) {
            kVar.f232758a = C62942bv.mutableCopy(cqVar);
        }
        kVar.f232758a.add(iVar);
    }
}

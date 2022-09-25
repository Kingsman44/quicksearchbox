package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.di */
/* compiled from: PG */
public final class C79813di extends C62934bn implements C63001dt {
    public C79813di() {
        super(C79814dj.f218834O);
    }

    /* renamed from: a */
    public final void mo74260a(C82889ee eeVar) {
        copyOnWrite();
        C79814dj djVar = (C79814dj) this.instance;
        C79814dj djVar2 = C79814dj.f218834O;
        eeVar.getClass();
        C62971cq cqVar = djVar.f218863m;
        if (!cqVar.mo58948c()) {
            djVar.f218863m = C62942bv.mutableCopy(cqVar);
        }
        djVar.f218863m.add(eeVar);
    }
}

package com.google.android.libraries.notifications.p2292g;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.notifications.g.i */
/* compiled from: PG */
public final class C30001i extends C62934bn implements C63001dt {
    public C30001i() {
        super(C30002j.f81213b);
    }

    /* renamed from: a */
    public final void mo35306a(C63070h hVar) {
        copyOnWrite();
        C30002j jVar = (C30002j) this.instance;
        C30002j jVar2 = C30002j.f81213b;
        hVar.getClass();
        C62971cq cqVar = jVar.f81215a;
        if (!cqVar.mo58948c()) {
            jVar.f81215a = C62942bv.mutableCopy(cqVar);
        }
        jVar.f81215a.add(hVar);
    }
}

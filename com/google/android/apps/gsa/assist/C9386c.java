package com.google.android.apps.gsa.assist;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.assist.c */
/* compiled from: PG */
public final class C9386c extends C62936bp implements C62938br {
    public C9386c() {
        super(C9405d.f32673k);
    }

    /* renamed from: a */
    public final void mo17578a(C9347ar arVar) {
        copyOnWrite();
        C9405d dVar = (C9405d) this.instance;
        C9405d dVar2 = C9405d.f32673k;
        arVar.getClass();
        C62971cq cqVar = dVar.f32677c;
        if (!cqVar.mo58948c()) {
            dVar.f32677c = C62942bv.mutableCopy(cqVar);
        }
        dVar.f32677c.add(arVar);
    }
}

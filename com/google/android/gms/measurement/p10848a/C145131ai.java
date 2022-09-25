package com.google.android.gms.measurement.p10848a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.gms.measurement.a.ai */
/* compiled from: PG */
public final class C145131ai extends C62934bn implements C63001dt {
    public C145131ai() {
        super(C145132aj.f392233b);
    }

    /* renamed from: a */
    public final void mo120669a(C145133ak akVar) {
        copyOnWrite();
        C145132aj ajVar = (C145132aj) this.instance;
        C145134al alVar = (C145134al) akVar.build();
        C145132aj ajVar2 = C145132aj.f392233b;
        alVar.getClass();
        C62971cq cqVar = ajVar.f392235a;
        if (!cqVar.mo58948c()) {
            ajVar.f392235a = C62942bv.mutableCopy(cqVar);
        }
        ajVar.f392235a.add(alVar);
    }
}

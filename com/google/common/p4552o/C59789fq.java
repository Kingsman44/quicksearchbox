package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.fq */
/* compiled from: PG */
public final class C59789fq extends C62934bn implements C63001dt {
    public C59789fq() {
        super(C59792ft.f161561h);
    }

    /* renamed from: a */
    public final void mo57056a(C59788fp fpVar) {
        copyOnWrite();
        C59792ft ftVar = (C59792ft) this.instance;
        C59792ft ftVar2 = C59792ft.f161561h;
        fpVar.getClass();
        C62971cq cqVar = ftVar.f161569g;
        if (!cqVar.mo58948c()) {
            ftVar.f161569g = C62942bv.mutableCopy(cqVar);
        }
        ftVar.f161569g.add(fpVar);
    }
}

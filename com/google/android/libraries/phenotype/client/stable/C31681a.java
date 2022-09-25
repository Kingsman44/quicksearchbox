package com.google.android.libraries.phenotype.client.stable;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.phenotype.client.stable.a */
/* compiled from: PG */
public final class C31681a extends C62934bn implements C63001dt {
    public C31681a() {
        super(C31708b.f85249d);
    }

    /* renamed from: a */
    public final void mo37319a(String str) {
        copyOnWrite();
        C31708b bVar = (C31708b) this.instance;
        C31708b bVar2 = C31708b.f85249d;
        str.getClass();
        C62971cq cqVar = bVar.f85252b;
        if (!cqVar.mo58948c()) {
            bVar.f85252b = C62942bv.mutableCopy(cqVar);
        }
        bVar.f85252b.add(str);
    }
}

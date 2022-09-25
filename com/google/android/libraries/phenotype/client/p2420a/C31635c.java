package com.google.android.libraries.phenotype.client.p2420a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.phenotype.client.a.c */
/* compiled from: PG */
public final class C31635c extends C62934bn implements C63001dt {
    public C31635c() {
        super(C31636d.f85117i);
    }

    /* renamed from: a */
    public final void mo37286a(C63088z zVar) {
        copyOnWrite();
        C31636d dVar = (C31636d) this.instance;
        C31636d dVar2 = C31636d.f85117i;
        C62971cq cqVar = dVar.f85121c;
        if (!cqVar.mo58948c()) {
            dVar.f85121c = C62942bv.mutableCopy(cqVar);
        }
        dVar.f85121c.add(zVar);
    }
}

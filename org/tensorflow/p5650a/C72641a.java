package org.tensorflow.p5650a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63088z;

/* renamed from: org.tensorflow.a.a */
/* compiled from: PG */
public final class C72641a extends C62934bn implements C63001dt {
    public C72641a() {
        super(C72642b.f193209b);
    }

    /* renamed from: a */
    public final void mo64490a(C63088z zVar) {
        copyOnWrite();
        C72642b bVar = (C72642b) this.instance;
        C72642b bVar2 = C72642b.f193209b;
        zVar.getClass();
        C62971cq cqVar = bVar.f193211a;
        if (!cqVar.mo58948c()) {
            bVar.f193211a = C62942bv.mutableCopy(cqVar);
        }
        bVar.f193211a.add(zVar);
    }
}

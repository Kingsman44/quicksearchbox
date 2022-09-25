package com.google.android.libraries.p11016ak;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.ak.a */
/* compiled from: PG */
public final class C147611a extends C62934bn implements C63001dt {
    public C147611a() {
        super(C147631b.f398465c);
    }

    /* renamed from: a */
    public final void mo124376a(Iterable iterable) {
        copyOnWrite();
        C147631b bVar = (C147631b) this.instance;
        C147631b bVar2 = C147631b.f398465c;
        C62971cq cqVar = bVar.f398467a;
        if (!cqVar.mo58948c()) {
            bVar.f398467a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f398467a);
    }
}

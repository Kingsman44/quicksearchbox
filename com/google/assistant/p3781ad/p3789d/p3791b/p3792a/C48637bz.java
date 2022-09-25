package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.ad.d.b.a.bz */
/* compiled from: PG */
public final class C48637bz extends C62934bn implements C63001dt {
    public C48637bz() {
        super(C48639ca.f125713c);
    }

    /* renamed from: a */
    public final void mo53163a(Iterable iterable) {
        copyOnWrite();
        C48639ca caVar = (C48639ca) this.instance;
        C48639ca caVar2 = C48639ca.f125713c;
        C62971cq cqVar = caVar.f125716b;
        if (!cqVar.mo58948c()) {
            caVar.f125716b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) caVar.f125716b);
    }
}

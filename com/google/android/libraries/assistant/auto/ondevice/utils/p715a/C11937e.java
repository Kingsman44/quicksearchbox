package com.google.android.libraries.assistant.auto.ondevice.utils.p715a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.a.e */
/* compiled from: PG */
public final class C11937e extends C62934bn implements C63001dt {
    public C11937e() {
        super(C11938f.f38347e);
    }

    /* renamed from: a */
    public final void mo20314a(Iterable iterable) {
        copyOnWrite();
        C11938f fVar = (C11938f) this.instance;
        C11938f fVar2 = C11938f.f38347e;
        C62971cq cqVar = fVar.f38352d;
        if (!cqVar.mo58948c()) {
            fVar.f38352d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar.f38352d);
    }
}

package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.r */
/* compiled from: PG */
public final class C121254r extends C62934bn implements C63001dt {
    public C121254r() {
        super(C121255s.f336817b);
    }

    /* renamed from: a */
    public final void mo105098a(Iterable iterable) {
        copyOnWrite();
        C121255s sVar = (C121255s) this.instance;
        C121255s sVar2 = C121255s.f336817b;
        C62971cq cqVar = sVar.f336819a;
        if (!cqVar.mo58948c()) {
            sVar.f336819a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) sVar.f336819a);
    }
}

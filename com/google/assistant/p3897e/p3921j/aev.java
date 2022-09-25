package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.j.aev */
/* compiled from: PG */
public final class aev extends C62934bn implements C63001dt {
    public aev() {
        super(aex.f134969f);
    }

    /* renamed from: a */
    public final void mo53685a(Iterable iterable) {
        copyOnWrite();
        aex aex = (aex) this.instance;
        aex aex2 = aex.f134969f;
        C62971cq cqVar = aex.f134972b;
        if (!cqVar.mo58948c()) {
            aex.f134972b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aex.f134972b);
    }
}

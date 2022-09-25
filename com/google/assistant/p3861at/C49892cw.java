package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.at.cw */
/* compiled from: PG */
public final class C49892cw extends C62934bn implements C63001dt {
    public C49892cw() {
        super(C49893cx.f129688b);
    }

    /* renamed from: a */
    public final void mo53369a(Iterable iterable) {
        copyOnWrite();
        C49893cx cxVar = (C49893cx) this.instance;
        C49893cx cxVar2 = C49893cx.f129688b;
        C62971cq cqVar = cxVar.f129690a;
        if (!cqVar.mo58948c()) {
            cxVar.f129690a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) cxVar.f129690a);
    }
}

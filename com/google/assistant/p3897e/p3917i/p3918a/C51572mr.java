package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.i.a.mr */
/* compiled from: PG */
public final class C51572mr extends C62934bn implements C63001dt {
    public C51572mr() {
        super(C51575mu.f134418e);
    }

    /* renamed from: a */
    public final void mo53640a(Iterable iterable) {
        copyOnWrite();
        C51575mu muVar = (C51575mu) this.instance;
        C51575mu muVar2 = C51575mu.f134418e;
        C62971cq cqVar = muVar.f134421b;
        if (!cqVar.mo58948c()) {
            muVar.f134421b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) muVar.f134421b);
    }
}

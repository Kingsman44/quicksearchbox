package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.i.a.ek */
/* compiled from: PG */
public final class C51349ek extends C62934bn implements C63001dt {
    public C51349ek() {
        super(C51350el.f133749b);
    }

    /* renamed from: a */
    public final void mo53590a(Iterable iterable) {
        copyOnWrite();
        C51350el elVar = (C51350el) this.instance;
        C51350el elVar2 = C51350el.f133749b;
        C62971cq cqVar = elVar.f133751a;
        if (!cqVar.mo58948c()) {
            elVar.f133751a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) elVar.f133751a);
    }
}

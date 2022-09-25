package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.y.a.aa */
/* compiled from: PG */
public final class C53541aa extends C62934bn implements C63001dt {
    public C53541aa() {
        super(C53542ab.f140509b);
    }

    /* renamed from: a */
    public final void mo53994a(Iterable iterable) {
        copyOnWrite();
        C53542ab abVar = (C53542ab) this.instance;
        C53542ab abVar2 = C53542ab.f140509b;
        C62971cq cqVar = abVar.f140511a;
        if (!cqVar.mo58948c()) {
            abVar.f140511a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) abVar.f140511a);
    }
}

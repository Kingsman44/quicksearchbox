package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.j.dh */
/* compiled from: PG */
public final class C51792dh extends C62934bn implements C63001dt {
    public C51792dh() {
        super(C51798dn.f135907e);
    }

    /* renamed from: a */
    public final void mo53727a(Iterable iterable) {
        copyOnWrite();
        C51798dn dnVar = (C51798dn) this.instance;
        C51798dn dnVar2 = C51798dn.f135907e;
        C62971cq cqVar = dnVar.f135911c;
        if (!cqVar.mo58948c()) {
            dnVar.f135911c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) dnVar.f135911c);
    }
}

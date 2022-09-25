package com.google.assistant.p3897e;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.e.a */
/* compiled from: PG */
public final class C50864a extends C62934bn implements C63001dt {
    public C50864a() {
        super(C50871b.f132454d);
    }

    /* renamed from: a */
    public final void mo53486a(String str) {
        copyOnWrite();
        C50871b bVar = (C50871b) this.instance;
        C50871b bVar2 = C50871b.f132454d;
        str.getClass();
        C62971cq cqVar = bVar.f132458c;
        if (!cqVar.mo58948c()) {
            bVar.f132458c = C62942bv.mutableCopy(cqVar);
        }
        bVar.f132458c.add(str);
    }
}

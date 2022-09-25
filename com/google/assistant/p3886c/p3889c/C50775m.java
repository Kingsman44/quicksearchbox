package com.google.assistant.p3886c.p3889c;

import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.c.c.m */
/* compiled from: PG */
public final class C50775m extends C62934bn implements C63001dt {
    public C50775m() {
        super(C50776n.f132135c);
    }

    /* renamed from: a */
    public final void mo53455a(C50716a aVar) {
        copyOnWrite();
        C50776n nVar = (C50776n) this.instance;
        C50723h hVar = (C50723h) aVar.build();
        C50776n nVar2 = C50776n.f132135c;
        hVar.getClass();
        C62971cq cqVar = nVar.f132138a;
        if (!cqVar.mo58948c()) {
            nVar.f132138a = C62942bv.mutableCopy(cqVar);
        }
        nVar.f132138a.add(hVar);
    }
}

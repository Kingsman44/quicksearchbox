package com.google.assistant.p3886c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.c.s */
/* compiled from: PG */
public final class C50847s extends C62934bn implements C63001dt {
    public C50847s() {
        super(C50851w.f132415e);
    }

    /* renamed from: a */
    public final void mo53485a(C50850v vVar) {
        copyOnWrite();
        C50851w wVar = (C50851w) this.instance;
        C50851w wVar2 = C50851w.f132415e;
        vVar.getClass();
        C62971cq cqVar = wVar.f132418b;
        if (!cqVar.mo58948c()) {
            wVar.f132418b = C62942bv.mutableCopy(cqVar);
        }
        wVar.f132418b.add(vVar);
    }
}

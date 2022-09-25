package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.b.a */
/* compiled from: PG */
public final class C121091a extends C62934bn implements C63001dt {
    public C121091a() {
        super(C121092b.f336504e);
    }

    /* renamed from: a */
    public final void mo105048a(String str) {
        copyOnWrite();
        C121092b bVar = (C121092b) this.instance;
        C121092b bVar2 = C121092b.f336504e;
        str.getClass();
        C62971cq cqVar = bVar.f336508c;
        if (!cqVar.mo58948c()) {
            bVar.f336508c = C62942bv.mutableCopy(cqVar);
        }
        bVar.f336508c.add(str);
    }
}

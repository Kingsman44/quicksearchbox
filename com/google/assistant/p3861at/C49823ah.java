package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.ah */
/* compiled from: PG */
public final class C49823ah extends C62934bn implements C63001dt {
    public C49823ah() {
        super(C49826ak.f129462q);
    }

    /* renamed from: a */
    public final void mo53361a(String str) {
        copyOnWrite();
        C49826ak akVar = (C49826ak) this.instance;
        C49826ak akVar2 = C49826ak.f129462q;
        str.getClass();
        C62971cq cqVar = akVar.f129465b;
        if (!cqVar.mo58948c()) {
            akVar.f129465b = C62942bv.mutableCopy(cqVar);
        }
        akVar.f129465b.add(str);
    }
}

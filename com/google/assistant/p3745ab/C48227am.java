package com.google.assistant.p3745ab;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.ab.am */
/* compiled from: PG */
public final class C48227am extends C62934bn implements C63001dt {
    public C48227am() {
        super(C48228an.f124774c);
    }

    /* renamed from: a */
    public final void mo53149a(C48225ak akVar) {
        copyOnWrite();
        C48228an anVar = (C48228an) this.instance;
        C48226al alVar = (C48226al) akVar.build();
        C48228an anVar2 = C48228an.f124774c;
        alVar.getClass();
        C62971cq cqVar = anVar.f124776a;
        if (!cqVar.mo58948c()) {
            anVar.f124776a = C62942bv.mutableCopy(cqVar);
        }
        anVar.f124776a.add(alVar);
    }
}

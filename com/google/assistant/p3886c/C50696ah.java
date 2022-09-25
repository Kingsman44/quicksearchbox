package com.google.assistant.p3886c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.c.ah */
/* compiled from: PG */
public final class C50696ah extends C62934bn implements C63001dt {
    public C50696ah() {
        super(C50697ai.f131903b);
    }

    /* renamed from: a */
    public final void mo53426a(Iterable iterable) {
        copyOnWrite();
        C50697ai aiVar = (C50697ai) this.instance;
        C50697ai aiVar2 = C50697ai.f131903b;
        C62971cq cqVar = aiVar.f131905a;
        if (!cqVar.mo58948c()) {
            aiVar.f131905a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aiVar.f131905a);
    }
}

package com.google.assistant.p3886c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.c.a */
/* compiled from: PG */
public final class C50664a extends C62934bn implements C63001dt {
    public C50664a() {
        super(C50715b.f131973d);
    }

    /* renamed from: a */
    public final void mo53417a(Iterable iterable) {
        copyOnWrite();
        C50715b bVar = (C50715b) this.instance;
        C50715b bVar2 = C50715b.f131973d;
        C62971cq cqVar = bVar.f131977c;
        if (!cqVar.mo58948c()) {
            bVar.f131977c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f131977c);
    }
}

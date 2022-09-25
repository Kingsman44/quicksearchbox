package com.google.speech.p5208h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.speech.h.bx */
/* compiled from: PG */
public final class C66598bx extends C62934bn implements C63001dt {
    public C66598bx() {
        super(C66599by.f181159p);
    }

    /* renamed from: a */
    public final void mo59682a(Iterable iterable) {
        copyOnWrite();
        C66599by byVar = (C66599by) this.instance;
        C66599by byVar2 = C66599by.f181159p;
        C62971cq cqVar = byVar.f181165d;
        if (!cqVar.mo58948c()) {
            byVar.f181165d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) byVar.f181165d);
    }

    /* renamed from: b */
    public final void mo59683b(Iterable iterable) {
        copyOnWrite();
        C66599by byVar = (C66599by) this.instance;
        C66599by byVar2 = C66599by.f181159p;
        byVar.mo59684a();
        C62947c.addAll(iterable, (List) byVar.f181166e);
    }
}

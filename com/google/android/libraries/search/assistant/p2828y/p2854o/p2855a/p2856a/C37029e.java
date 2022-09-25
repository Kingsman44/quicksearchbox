package com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.y.o.a.a.e */
/* compiled from: PG */
public final class C37029e extends C62934bn implements C63001dt {
    public C37029e() {
        super(C37030f.f96461d);
    }

    /* renamed from: a */
    public final void mo40544a(Iterable iterable) {
        copyOnWrite();
        C37030f fVar = (C37030f) this.instance;
        C37030f fVar2 = C37030f.f96461d;
        C62971cq cqVar = fVar.f96466c;
        if (!cqVar.mo58948c()) {
            fVar.f96466c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar.f96466c);
    }
}

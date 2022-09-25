package com.google.android.libraries.search.p2904c.p2952o.p2957d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.search.c.o.d.d */
/* compiled from: PG */
public final class C37931d extends C62934bn implements C63001dt {
    public C37931d() {
        super(C37932e.f100542b);
    }

    /* renamed from: a */
    public final void mo41158a(Iterable iterable) {
        copyOnWrite();
        C37932e eVar = (C37932e) this.instance;
        C37932e eVar2 = C37932e.f100542b;
        C62971cq cqVar = eVar.f100544a;
        if (!cqVar.mo58948c()) {
            eVar.f100544a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) eVar.f100544a);
    }
}

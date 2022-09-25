package com.google.protos.p5129p.p5130a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Iterator;

/* renamed from: com.google.protos.p.a.d */
/* compiled from: PG */
public final class C65719d extends C62934bn implements C63001dt {
    public C65719d() {
        super(C65720e.f178550l);
    }

    /* renamed from: a */
    public final void mo59418a(Iterable iterable) {
        copyOnWrite();
        C65720e eVar = (C65720e) this.instance;
        C62962ci ciVar = C65720e.f178549c;
        eVar.mo59420a();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            eVar.f178553b.mo58916g(((C65753ak) it.next()).f178757bE);
        }
    }

    /* renamed from: b */
    public final void mo59419b(C65753ak akVar) {
        copyOnWrite();
        C65720e eVar = (C65720e) this.instance;
        C62962ci ciVar = C65720e.f178549c;
        akVar.getClass();
        eVar.mo59420a();
        eVar.f178553b.mo58916g(akVar.f178757bE);
    }
}

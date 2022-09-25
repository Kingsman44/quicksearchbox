package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.ap.b.a.l */
/* compiled from: PG */
public final class C63701l extends C62934bn implements C63001dt {
    public C63701l() {
        super(C63706q.f172241d);
    }

    /* renamed from: a */
    public final void mo59231a(Iterable iterable) {
        copyOnWrite();
        C63706q qVar = (C63706q) this.instance;
        C63706q qVar2 = C63706q.f172241d;
        qVar.mo59233a();
        C62947c.addAll(iterable, (List) qVar.f172244b);
    }

    /* renamed from: b */
    public final void mo59232b(C63702m mVar) {
        copyOnWrite();
        C63706q qVar = (C63706q) this.instance;
        C63705p pVar = (C63705p) mVar.build();
        C63706q qVar2 = C63706q.f172241d;
        pVar.getClass();
        qVar.mo59233a();
        qVar.f172244b.add(pVar);
    }
}

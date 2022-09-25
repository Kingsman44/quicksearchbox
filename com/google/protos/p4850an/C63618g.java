package com.google.protos.p4850an;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;
import java.util.List;

/* renamed from: com.google.protos.an.g */
/* compiled from: PG */
public final class C63618g extends C62934bn implements C63001dt {
    public C63618g() {
        super(C63624h.f172070b);
    }

    /* renamed from: a */
    public final void mo59220a(Iterable iterable) {
        copyOnWrite();
        C63624h hVar = (C63624h) this.instance;
        C63624h hVar2 = C63624h.f172070b;
        hVar.mo59222a();
        C62947c.addAll(iterable, (List) hVar.f172072a);
    }

    /* renamed from: b */
    public final void mo59221b(C63772a aVar) {
        copyOnWrite();
        C63624h hVar = (C63624h) this.instance;
        C63775d dVar = (C63775d) aVar.build();
        C63624h hVar2 = C63624h.f172070b;
        dVar.getClass();
        hVar.mo59222a();
        hVar.f172072a.add(dVar);
    }
}

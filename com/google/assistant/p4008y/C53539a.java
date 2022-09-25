package com.google.assistant.p4008y;

import com.google.assistant.p4008y.p4013d.C53659k;
import com.google.assistant.p4008y.p4013d.C53660l;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.y.a */
/* compiled from: PG */
public final class C53539a extends C62934bn implements C63001dt {
    public C53539a() {
        super(C53618b.f140732c);
    }

    /* renamed from: a */
    public final void mo53993a(C53660l lVar) {
        C53660l lVar2;
        copyOnWrite();
        C53618b bVar = (C53618b) this.instance;
        C53618b bVar2 = C53618b.f140732c;
        lVar.getClass();
        C53660l lVar3 = bVar.f140735b;
        if (!(lVar3 == null || lVar3 == (lVar2 = C53660l.f140838d))) {
            C53659k kVar = (C53659k) lVar2.createBuilder(lVar3);
            kVar.mergeFrom(lVar);
            lVar = (C53660l) kVar.buildPartial();
        }
        bVar.f140735b = lVar;
        bVar.f140734a |= 1;
    }
}

package com.google.p4438c.p4439a;

import com.google.p4419bx.C57860a;
import com.google.p4419bx.C57863d;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.c.a.a */
/* compiled from: PG */
public final class C57912a extends C62934bn implements C63001dt {
    public C57912a() {
        super(C57913b.f154898e);
    }

    /* renamed from: a */
    public final void mo54538a(C57863d dVar) {
        C57863d dVar2;
        copyOnWrite();
        C57913b bVar = (C57913b) this.instance;
        C57913b bVar2 = C57913b.f154898e;
        dVar.getClass();
        C57863d dVar3 = bVar.f154902c;
        if (!(dVar3 == null || dVar3 == (dVar2 = C57863d.f154580d))) {
            C57860a aVar = (C57860a) dVar2.createBuilder(dVar3);
            aVar.mergeFrom(dVar);
            dVar = (C57863d) aVar.buildPartial();
        }
        bVar.f154902c = dVar;
        bVar.f154900a |= 2;
    }
}

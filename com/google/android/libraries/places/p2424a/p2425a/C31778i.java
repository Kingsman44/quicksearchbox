package com.google.android.libraries.places.p2424a.p2425a;

import com.google.common.p4552o.adr;
import com.google.common.p4552o.adt;
import com.google.common.p4552o.p4564j.C60004a;
import com.google.common.p4552o.p4564j.C60009ae;
import com.google.common.p4552o.p4564j.C60012ah;
import com.google.common.p4552o.p4564j.C60027b;

/* renamed from: com.google.android.libraries.places.a.a.i */
/* compiled from: PG */
public final class C31778i {
    /* renamed from: a */
    public static adt m59134a(C60012ah ahVar) {
        adr adr = (adr) adt.f158403d.createBuilder();
        adr.copyOnWrite();
        adt adt = (adt) adr.instance;
        adt.f158406b = 1;
        adt.f158405a = 1 | adt.f158405a;
        adr.copyOnWrite();
        adt adt2 = (adt) adr.instance;
        ahVar.getClass();
        adt2.f158407c = ahVar;
        adt2.f158405a |= 2;
        return (adt) adr.build();
    }

    /* renamed from: b */
    public static C60009ae m59135b(C31773d dVar) {
        int c = dVar.mo37375c();
        int i = c - 1;
        if (c != 0) {
            int i2 = i != 0 ? i != 1 ? 1 : 4 : 2;
            C60009ae aeVar = (C60009ae) C60012ah.f162194m.createBuilder();
            C60004a aVar = (C60004a) C60027b.f162249d.createBuilder();
            String b = dVar.mo37374b();
            aVar.copyOnWrite();
            C60027b bVar = (C60027b) aVar.instance;
            b.getClass();
            bVar.f162251a |= 1;
            bVar.f162252b = b;
            int a = dVar.mo37373a();
            aVar.copyOnWrite();
            C60027b bVar2 = (C60027b) aVar.instance;
            bVar2.f162251a = 2 | bVar2.f162251a;
            bVar2.f162253c = a;
            C60027b bVar3 = (C60027b) aVar.build();
            aeVar.copyOnWrite();
            C60012ah ahVar = (C60012ah) aeVar.instance;
            bVar3.getClass();
            ahVar.f162198c = bVar3;
            ahVar.f162196a |= 4;
            aeVar.copyOnWrite();
            C60012ah ahVar2 = (C60012ah) aeVar.instance;
            ahVar2.f162196a |= 16777216;
            ahVar2.f162203h = true;
            aeVar.copyOnWrite();
            C60012ah ahVar3 = (C60012ah) aeVar.instance;
            ahVar3.f162206k = i2 - 1;
            ahVar3.f162196a |= 536870912;
            aeVar.copyOnWrite();
            C60012ah ahVar4 = (C60012ah) aeVar.instance;
            ahVar4.f162196a |= 134217728;
            ahVar4.f162205j = "2.7.0";
            return aeVar;
        }
        throw null;
    }
}

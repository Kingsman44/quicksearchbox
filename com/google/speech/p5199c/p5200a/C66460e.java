package com.google.speech.p5199c.p5200a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.speech.c.a.e */
/* compiled from: PG */
public final class C66460e extends C62934bn implements C63001dt {
    public C66460e() {
        super(C66461f.f180719g);
    }

    /* renamed from: a */
    public final void mo59632a(C66477v vVar) {
        C66477v vVar2;
        copyOnWrite();
        C66461f fVar = (C66461f) this.instance;
        C66461f fVar2 = C66461f.f180719g;
        vVar.getClass();
        C66477v vVar3 = fVar.f180722b;
        if (!(vVar3 == null || vVar3 == (vVar2 = C66477v.f180755j))) {
            C66469n nVar = (C66469n) vVar2.createBuilder(vVar3);
            nVar.mergeFrom(vVar);
            vVar = (C66477v) nVar.buildPartial();
        }
        fVar.f180722b = vVar;
        fVar.f180721a |= 1;
    }
}

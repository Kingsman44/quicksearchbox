package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.nk */
/* compiled from: PG */
public final class C60298nk extends C62934bn implements C63001dt {
    public C60298nk() {
        super(C60300nm.f163138H);
    }

    /* renamed from: a */
    public final void mo57080a(C60261mb mbVar) {
        C60261mb mbVar2;
        copyOnWrite();
        C60300nm nmVar = (C60300nm) this.instance;
        C60300nm nmVar2 = C60300nm.f163138H;
        mbVar.getClass();
        C60261mb mbVar3 = nmVar.f163152f;
        if (!(mbVar3 == null || mbVar3 == (mbVar2 = C60261mb.f163036g))) {
            C60251ly lyVar = (C60251ly) mbVar2.createBuilder(mbVar3);
            lyVar.mergeFrom(mbVar);
            mbVar = (C60261mb) lyVar.buildPartial();
        }
        nmVar.f163152f = mbVar;
        nmVar.f163147a |= 2048;
    }
}

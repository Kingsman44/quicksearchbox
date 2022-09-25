package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.e.j.dx */
/* compiled from: PG */
public final class C51808dx extends C62934bn implements C63001dt {
    public C51808dx() {
        super(C51809dy.f135933f);
    }

    /* renamed from: a */
    public final void mo53736a(C51807dw dwVar) {
        C51807dw dwVar2;
        copyOnWrite();
        C51809dy dyVar = (C51809dy) this.instance;
        C51809dy dyVar2 = C51809dy.f135933f;
        dwVar.getClass();
        C51807dw dwVar3 = dyVar.f135938d;
        if (!(dwVar3 == null || dwVar3 == (dwVar2 = C51807dw.f135930b))) {
            C51806dv dvVar = (C51806dv) dwVar2.createBuilder(dwVar3);
            dvVar.mergeFrom(dwVar);
            dwVar = (C51807dw) dvVar.buildPartial();
        }
        dyVar.f135938d = dwVar;
        dyVar.f135935a |= 4;
    }
}

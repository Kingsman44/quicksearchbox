package com.google.protos.p5127o.p5128a;

import com.google.p4152bb.p4153a.C55090fm;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.o.a.g */
/* compiled from: PG */
public final class C65626g extends C62934bn implements C63001dt {
    public C65626g() {
        super(C65629j.f178340d);
    }

    /* renamed from: a */
    public final void mo59411a(C55093fp fpVar) {
        C55093fp fpVar2;
        copyOnWrite();
        C65629j jVar = (C65629j) this.instance;
        C65629j jVar2 = C65629j.f178340d;
        fpVar.getClass();
        C55093fp fpVar3 = jVar.f178343b;
        if (!(fpVar3 == null || fpVar3 == (fpVar2 = C55093fp.f144965l))) {
            C55090fm fmVar = (C55090fm) fpVar2.createBuilder(fpVar3);
            fmVar.mergeFrom(fpVar);
            fpVar = (C55093fp) fmVar.buildPartial();
        }
        jVar.f178343b = fpVar;
        jVar.f178342a |= 1;
    }
}

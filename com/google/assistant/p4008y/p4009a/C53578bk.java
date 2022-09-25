package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.y.a.bk */
/* compiled from: PG */
public final class C53578bk extends C62934bn implements C63001dt {
    public C53578bk() {
        super(C53579bl.f140625d);
    }

    /* renamed from: a */
    public final void mo54002a(C53580bm bmVar) {
        copyOnWrite();
        C53579bl blVar = (C53579bl) this.instance;
        C53581bn bnVar = (C53581bn) bmVar.build();
        C53579bl blVar2 = C53579bl.f140625d;
        bnVar.getClass();
        C62971cq cqVar = blVar.f140629c;
        if (!cqVar.mo58948c()) {
            blVar.f140629c = C62942bv.mutableCopy(cqVar);
        }
        blVar.f140629c.add(bnVar);
    }
}

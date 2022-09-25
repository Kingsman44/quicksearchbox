package com.google.protos.p4816ai.p4817a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.ai.a.a */
/* compiled from: PG */
public final class C63187a extends C62934bn implements C63001dt {
    public C63187a() {
        super(C63193g.f170718h);
    }

    /* renamed from: a */
    public final void mo59193a(Iterable iterable) {
        copyOnWrite();
        C63193g gVar = (C63193g) this.instance;
        C63193g gVar2 = C63193g.f170718h;
        C62971cq cqVar = gVar.f170725f;
        if (!cqVar.mo58948c()) {
            gVar.f170725f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) gVar.f170725f);
    }
}

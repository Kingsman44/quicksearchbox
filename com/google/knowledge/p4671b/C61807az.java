package com.google.knowledge.p4671b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.knowledge.b.az */
/* compiled from: PG */
public final class C61807az extends C62934bn implements C63001dt {
    public C61807az() {
        super(C61809ba.f166976e);
    }

    /* renamed from: a */
    public final void mo58197a(String str) {
        copyOnWrite();
        C61809ba baVar = (C61809ba) this.instance;
        C61809ba baVar2 = C61809ba.f166976e;
        str.getClass();
        C62971cq cqVar = baVar.f166980c;
        if (!cqVar.mo58948c()) {
            baVar.f166980c = C62942bv.mutableCopy(cqVar);
        }
        baVar.f166980c.add(str);
    }
}

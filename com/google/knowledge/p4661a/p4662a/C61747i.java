package com.google.knowledge.p4661a.p4662a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.knowledge.a.a.i */
/* compiled from: PG */
public final class C61747i extends C62934bn implements C63001dt {
    public C61747i() {
        super(C61748j.f166800d);
    }

    /* renamed from: a */
    public final void mo58181a(Iterable iterable) {
        copyOnWrite();
        C61748j jVar = (C61748j) this.instance;
        C61748j jVar2 = C61748j.f166800d;
        C62971cq cqVar = jVar.f166804c;
        if (!cqVar.mo58948c()) {
            jVar.f166804c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) jVar.f166804c);
    }
}

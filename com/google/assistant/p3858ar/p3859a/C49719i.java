package com.google.assistant.p3858ar.p3859a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.ar.a.i */
/* compiled from: PG */
public final class C49719i extends C62934bn implements C63001dt {
    public C49719i() {
        super(C49720j.f128316l);
    }

    /* renamed from: a */
    public final void mo53343a(Iterable iterable) {
        copyOnWrite();
        C49720j jVar = (C49720j) this.instance;
        C49720j jVar2 = C49720j.f128316l;
        C62971cq cqVar = jVar.f128327j;
        if (!cqVar.mo58948c()) {
            jVar.f128327j = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) jVar.f128327j);
    }

    /* renamed from: b */
    public final void mo53344b(String str) {
        copyOnWrite();
        C49720j jVar = (C49720j) this.instance;
        C49720j jVar2 = C49720j.f128316l;
        str.getClass();
        C62971cq cqVar = jVar.f128321d;
        if (!cqVar.mo58948c()) {
            jVar.f128321d = C62942bv.mutableCopy(cqVar);
        }
        jVar.f128321d.add(str);
    }
}

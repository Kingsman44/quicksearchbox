package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.kw */
/* compiled from: PG */
public final class C60103kw extends C62934bn implements C63001dt {
    public C60103kw() {
        super(C60106kz.f162531p);
    }

    /* renamed from: a */
    public final void mo57065a(C60099ks ksVar) {
        copyOnWrite();
        C60106kz kzVar = (C60106kz) this.instance;
        C60102kv kvVar = (C60102kv) ksVar.build();
        C60106kz kzVar2 = C60106kz.f162531p;
        kvVar.getClass();
        C62971cq cqVar = kzVar.f162547o;
        if (!cqVar.mo58948c()) {
            kzVar.f162547o = C62942bv.mutableCopy(cqVar);
        }
        kzVar.f162547o.add(kvVar);
    }

    /* renamed from: b */
    public final void mo57066b(String str) {
        copyOnWrite();
        C60106kz kzVar = (C60106kz) this.instance;
        C60106kz kzVar2 = C60106kz.f162531p;
        str.getClass();
        C62971cq cqVar = kzVar.f162538f;
        if (!cqVar.mo58948c()) {
            kzVar.f162538f = C62942bv.mutableCopy(cqVar);
        }
        kzVar.f162538f.add(str);
    }
}

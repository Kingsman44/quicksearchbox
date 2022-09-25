package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.i.a.hy */
/* compiled from: PG */
public final class C51444hy extends C62934bn implements C63001dt {
    public C51444hy() {
        super(C51450id.f133992h);
    }

    /* renamed from: a */
    public final void mo53616a(Iterable iterable) {
        copyOnWrite();
        C51450id idVar = (C51450id) this.instance;
        C51450id idVar2 = C51450id.f133992h;
        C62971cq cqVar = idVar.f133999f;
        if (!cqVar.mo58948c()) {
            idVar.f133999f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) idVar.f133999f);
    }

    /* renamed from: b */
    public final void mo53617b(Iterable iterable) {
        copyOnWrite();
        C51450id idVar = (C51450id) this.instance;
        C51450id idVar2 = C51450id.f133992h;
        idVar.mo53621a();
        C62947c.addAll(iterable, (List) idVar.f133995b);
    }

    /* renamed from: c */
    public final void mo53618c(C51447ia iaVar) {
        copyOnWrite();
        C51450id idVar = (C51450id) this.instance;
        C51450id idVar2 = C51450id.f133992h;
        iaVar.getClass();
        idVar.mo53621a();
        idVar.f133995b.add(iaVar);
    }

    /* renamed from: d */
    public final void mo53619d(C51449ic icVar) {
        copyOnWrite();
        C51450id idVar = (C51450id) this.instance;
        C51450id idVar2 = C51450id.f133992h;
        icVar.getClass();
        C62971cq cqVar = idVar.f134000g;
        if (!cqVar.mo58948c()) {
            idVar.f134000g = C62942bv.mutableCopy(cqVar);
        }
        idVar.f134000g.add(icVar);
    }
}

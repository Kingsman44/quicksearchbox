package com.google.assistant.p3886c.p3887a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.c.a.m */
/* compiled from: PG */
public final class C50677m extends C62934bn implements C63001dt {
    public C50677m() {
        super(C50678n.f131835l);
    }

    /* renamed from: a */
    public final void mo53420a(Iterable iterable) {
        copyOnWrite();
        C50678n nVar = (C50678n) this.instance;
        C50678n nVar2 = C50678n.f131835l;
        C62971cq cqVar = nVar.f131840d;
        if (!cqVar.mo58948c()) {
            nVar.f131840d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) nVar.f131840d);
    }

    /* renamed from: b */
    public final void mo53421b(Iterable iterable) {
        copyOnWrite();
        C50678n nVar = (C50678n) this.instance;
        C50678n nVar2 = C50678n.f131835l;
        C62971cq cqVar = nVar.f131847k;
        if (!cqVar.mo58948c()) {
            nVar.f131847k = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) nVar.f131847k);
    }
}

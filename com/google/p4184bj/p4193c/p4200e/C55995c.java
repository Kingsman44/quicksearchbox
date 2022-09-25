package com.google.p4184bj.p4193c.p4200e;

import com.google.assistant.p3897e.p3912f.C51207b;
import com.google.assistant.p3897e.p3912f.C51220o;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bj.c.e.c */
/* compiled from: PG */
public final class C55995c extends C62934bn implements C63001dt {
    public C55995c() {
        super(C55996d.f149115h);
    }

    /* renamed from: a */
    public final void mo54308a(C51207b bVar) {
        copyOnWrite();
        C55996d dVar = (C55996d) this.instance;
        C55996d dVar2 = C55996d.f149115h;
        bVar.getClass();
        C62971cq cqVar = dVar.f149121e;
        if (!cqVar.mo58948c()) {
            dVar.f149121e = C62942bv.mutableCopy(cqVar);
        }
        dVar.f149121e.add(bVar);
    }

    /* renamed from: b */
    public final void mo54309b(C51220o oVar) {
        copyOnWrite();
        C55996d dVar = (C55996d) this.instance;
        C55996d dVar2 = C55996d.f149115h;
        oVar.getClass();
        C62971cq cqVar = dVar.f149120d;
        if (!cqVar.mo58948c()) {
            dVar.f149120d = C62942bv.mutableCopy(cqVar);
        }
        dVar.f149120d.add(oVar);
    }

    @Deprecated
    /* renamed from: c */
    public final void mo54310c(C51220o oVar) {
        copyOnWrite();
        C55996d dVar = (C55996d) this.instance;
        C55996d dVar2 = C55996d.f149115h;
        oVar.getClass();
        dVar.mo54311a();
        dVar.f149119c.add(oVar);
    }
}

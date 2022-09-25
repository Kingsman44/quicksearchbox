package com.google.android.apps.p489g;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.g.l */
/* compiled from: PG */
public final class C9294l extends C62934bn implements C63001dt {
    public C9294l() {
        super(C9297o.f32274d);
    }

    /* renamed from: a */
    public final C9296n mo17481a(int i) {
        return (C9296n) ((C9297o) this.instance).f32278c.get(i);
    }

    /* renamed from: b */
    public final void mo17482b(C9296n nVar) {
        copyOnWrite();
        C9297o oVar = (C9297o) this.instance;
        C9297o oVar2 = C9297o.f32274d;
        nVar.getClass();
        oVar.mo17484a();
        oVar.f32278c.add(nVar);
    }

    /* renamed from: c */
    public final void mo17483c(int i, C9296n nVar) {
        copyOnWrite();
        C9297o oVar = (C9297o) this.instance;
        C9297o oVar2 = C9297o.f32274d;
        nVar.getClass();
        oVar.mo17484a();
        oVar.f32278c.set(i, nVar);
    }
}

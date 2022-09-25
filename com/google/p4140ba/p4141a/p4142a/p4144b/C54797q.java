package com.google.p4140ba.p4141a.p4142a.p4144b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.ba.a.a.b.q */
/* compiled from: PG */
public final class C54797q extends C62934bn implements C63001dt {
    public C54797q() {
        super(C54803w.f143767d);
    }

    /* renamed from: a */
    public final C54800t mo54153a(int i) {
        return (C54800t) ((C54803w) this.instance).f143771c.get(i);
    }

    /* renamed from: b */
    public final void mo54154b(C54798r rVar) {
        copyOnWrite();
        C54803w wVar = (C54803w) this.instance;
        C54800t tVar = (C54800t) rVar.build();
        C54803w wVar2 = C54803w.f143767d;
        tVar.getClass();
        wVar.mo54156a();
        wVar.f143771c.add(tVar);
    }

    /* renamed from: c */
    public final void mo54155c(int i, C54800t tVar) {
        copyOnWrite();
        C54803w wVar = (C54803w) this.instance;
        C54803w wVar2 = C54803w.f143767d;
        tVar.getClass();
        wVar.mo54156a();
        wVar.f143771c.set(i, tVar);
    }
}

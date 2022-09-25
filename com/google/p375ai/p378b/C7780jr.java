package com.google.p375ai.p378b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.ai.b.jr */
/* compiled from: PG */
public final class C7780jr extends C62934bn implements C63001dt {
    public C7780jr() {
        super(C7783ju.f27241c);
    }

    /* renamed from: a */
    public final C7782jt mo16959a(int i) {
        return (C7782jt) ((C7783ju) this.instance).f27244b.get(i);
    }

    /* renamed from: b */
    public final void mo16960b(C7781js jsVar) {
        copyOnWrite();
        C7783ju juVar = (C7783ju) this.instance;
        C7782jt jtVar = (C7782jt) jsVar.build();
        C7783ju juVar2 = C7783ju.f27241c;
        jtVar.getClass();
        juVar.mo16966b();
        juVar.f27244b.add(jtVar);
    }

    /* renamed from: c */
    public final void mo16961c(int i, C7782jt jtVar) {
        copyOnWrite();
        C7783ju juVar = (C7783ju) this.instance;
        C7783ju juVar2 = C7783ju.f27241c;
        jtVar.getClass();
        juVar.mo16966b();
        juVar.f27244b.set(i, jtVar);
    }
}

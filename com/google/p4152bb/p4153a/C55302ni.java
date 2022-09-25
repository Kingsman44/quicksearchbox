package com.google.p4152bb.p4153a;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;

/* renamed from: com.google.bb.a.ni */
/* compiled from: PG */
public final class C55302ni extends C62936bp implements C62938br {
    public C55302ni() {
        super(C55305nl.f145689r);
    }

    /* renamed from: a */
    public final C55240la mo54235a(int i) {
        return (C55240la) ((C55305nl) this.instance).f145692b.get(i);
    }

    /* renamed from: b */
    public final C55240la mo54236b(int i) {
        return (C55240la) ((C55305nl) this.instance).f145693c.get(i);
    }

    /* renamed from: c */
    public final void mo54237c(int i, C55238kz kzVar) {
        copyOnWrite();
        C55305nl nlVar = (C55305nl) this.instance;
        C55240la laVar = (C55240la) kzVar.build();
        C55305nl nlVar2 = C55305nl.f145689r;
        laVar.getClass();
        nlVar.mo54238a();
        nlVar.f145692b.set(i, laVar);
    }
}

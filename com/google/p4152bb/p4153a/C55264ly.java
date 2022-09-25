package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bb.a.ly */
/* compiled from: PG */
public final class C55264ly extends C62934bn implements C63001dt {
    public C55264ly() {
        super(C55265lz.f145555l);
    }

    /* renamed from: a */
    public final C55213ka mo54222a(int i) {
        return (C55213ka) ((C55265lz) this.instance).f145559b.get(i);
    }

    /* renamed from: b */
    public final C55305nl mo54223b(int i) {
        return (C55305nl) ((C55265lz) this.instance).f145560c.get(i);
    }

    /* renamed from: c */
    public final void mo54224c(C55213ka kaVar) {
        copyOnWrite();
        C55265lz lzVar = (C55265lz) this.instance;
        C55265lz lzVar2 = C55265lz.f145555l;
        kaVar.getClass();
        lzVar.mo54226a();
        lzVar.f145559b.add(kaVar);
    }

    /* renamed from: d */
    public final void mo54225d(int i, C55302ni niVar) {
        copyOnWrite();
        C55265lz lzVar = (C55265lz) this.instance;
        C55305nl nlVar = (C55305nl) niVar.build();
        C55265lz lzVar2 = C55265lz.f145555l;
        nlVar.getClass();
        lzVar.mo54227b();
        lzVar.f145560c.set(i, nlVar);
    }
}

package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bb.a.dg */
/* compiled from: PG */
public final class C55030dg extends C62934bn implements C63001dt {
    public C55030dg() {
        super(C55035dl.f144790f);
    }

    /* renamed from: a */
    public final C55032di mo54170a(int i) {
        return (C55032di) ((C55035dl) this.instance).f144796d.get(i);
    }

    /* renamed from: b */
    public final void mo54171b(C55032di diVar) {
        copyOnWrite();
        C55035dl dlVar = (C55035dl) this.instance;
        C55035dl dlVar2 = C55035dl.f144790f;
        diVar.getClass();
        dlVar.mo54173a();
        dlVar.f144796d.add(diVar);
    }

    /* renamed from: c */
    public final void mo54172c(int i, C55031dh dhVar) {
        copyOnWrite();
        C55035dl dlVar = (C55035dl) this.instance;
        C55032di diVar = (C55032di) dhVar.build();
        C55035dl dlVar2 = C55035dl.f144790f;
        diVar.getClass();
        dlVar.mo54173a();
        dlVar.f144796d.set(i, diVar);
    }
}

package com.facebook.litho;

/* renamed from: com.facebook.litho.bh */
/* compiled from: PG */
public final class C6127bh extends C6154cb {

    /* renamed from: a */
    private final C6154cb f18141a;

    /* renamed from: e */
    private final C6154cb f18142e;

    protected C6127bh(C6154cb cbVar, C6154cb cbVar2) {
        super((C6168cp) null, -1, (Object[]) null);
        this.f18141a = cbVar;
        this.f18142e = cbVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6154cb) obj);
    }

    /* renamed from: c */
    public final boolean mo13110c(C6154cb cbVar) {
        if (this == cbVar) {
            return true;
        }
        if (cbVar == null || cbVar.getClass() != getClass()) {
            return false;
        }
        C6127bh bhVar = (C6127bh) cbVar;
        return this.f18141a.mo13057a(bhVar.f18141a) && this.f18142e.mo13057a(bhVar.f18142e);
    }

    /* renamed from: fD */
    public final void mo13111fD(Object obj) {
        this.f18141a.mo13111fD(obj);
        this.f18142e.mo13111fD(obj);
    }
}

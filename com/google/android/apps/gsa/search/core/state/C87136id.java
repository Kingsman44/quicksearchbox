package com.google.android.apps.gsa.search.core.state;

/* renamed from: com.google.android.apps.gsa.search.core.state.id */
/* compiled from: PG */
public final class C87136id extends C87135ic {

    /* renamed from: b */
    public final C87116hk f235424b;

    public C87136id(C87117hl hlVar, C87116hk hkVar) {
        super(hlVar);
        this.f235424b = hkVar;
    }

    /* renamed from: a */
    public final boolean mo80754a(int i) {
        C87141ii.m140836ap(i);
        return this.f235424b.f235369a.get(i);
    }

    public final String toString() {
        C87117hl hlVar = this.f235423a;
        return "Event ".concat(String.valueOf(String.valueOf(hlVar != null ? hlVar.mo80745a(this.f235424b.mo80741b()).toString() : this.f235424b)));
    }
}

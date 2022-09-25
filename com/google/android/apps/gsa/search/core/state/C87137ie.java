package com.google.android.apps.gsa.search.core.state;

import java.util.BitSet;

/* renamed from: com.google.android.apps.gsa.search.core.state.ie */
/* compiled from: PG */
final class C87137ie extends C87135ic {

    /* renamed from: b */
    public final BitSet f235425b;

    public C87137ie(C87117hl hlVar, BitSet bitSet) {
        super(hlVar);
        this.f235425b = bitSet;
    }

    /* renamed from: a */
    public final boolean mo80754a(int i) {
        C87141ii.m140836ap(i);
        return this.f235425b.get(i);
    }

    public final String toString() {
        C87117hl hlVar = this.f235423a;
        return "Event ".concat(String.valueOf(String.valueOf(hlVar != null ? hlVar.mo80745a(this.f235425b).toString() : this.f235425b)));
    }
}

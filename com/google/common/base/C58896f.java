package com.google.common.base;

import java.util.BitSet;

/* renamed from: com.google.common.base.f */
/* compiled from: PG */
public final class C58896f extends C58912v {

    /* renamed from: a */
    final C58912v f156733a;

    /* renamed from: b */
    final C58912v f156734b;

    public C58896f(C58912v vVar, C58912v vVar2) {
        this.f156733a = vVar;
        this.f156734b = vVar2;
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.f156733a.mo56143b(bitSet2);
        BitSet bitSet3 = new BitSet();
        this.f156734b.mo56143b(bitSet3);
        bitSet2.and(bitSet3);
        bitSet.or(bitSet2);
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        return this.f156733a.mo56144c(c) && this.f156734b.mo56144c(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f156733a + ", " + this.f156734b + ")";
    }
}

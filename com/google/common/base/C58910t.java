package com.google.common.base;

import java.util.BitSet;

/* renamed from: com.google.common.base.t */
/* compiled from: PG */
public final class C58910t extends C58912v {

    /* renamed from: a */
    final C58912v f156748a;

    /* renamed from: b */
    final C58912v f156749b;

    public C58910t(C58912v vVar, C58912v vVar2) {
        this.f156748a = vVar;
        vVar2.getClass();
        this.f156749b = vVar2;
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        this.f156748a.mo56143b(bitSet);
        this.f156749b.mo56143b(bitSet);
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        return this.f156748a.mo56144c(c) || this.f156749b.mo56144c(c);
    }

    public final String toString() {
        return "CharMatcher.or(" + this.f156748a + ", " + this.f156749b + ")";
    }
}

package com.google.common.base;

import java.util.BitSet;

/* renamed from: com.google.common.base.l */
/* compiled from: PG */
public final class C58902l extends C58901k {

    /* renamed from: a */
    private final char f156739a;

    /* renamed from: b */
    private final char f156740b;

    public C58902l(char c, char c2) {
        C58838bb.m90868c(c2 >= c);
        this.f156739a = c;
        this.f156740b = c2;
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        bitSet.set(this.f156739a, this.f156740b + 1);
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        return this.f156739a <= c && c <= this.f156740b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + C58912v.m91036n(this.f156739a) + "', '" + C58912v.m91036n(this.f156740b) + "')";
    }
}

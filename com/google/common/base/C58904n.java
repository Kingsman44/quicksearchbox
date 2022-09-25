package com.google.common.base;

import java.util.BitSet;

/* renamed from: com.google.common.base.n */
/* compiled from: PG */
final class C58904n extends C58901k {

    /* renamed from: a */
    private final char f156742a;

    /* renamed from: b */
    private final char f156743b;

    public C58904n(char c, char c2) {
        this.f156742a = c;
        this.f156743b = c2;
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        bitSet.set(this.f156742a);
        bitSet.set(this.f156743b);
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        return c == this.f156742a || c == this.f156743b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + C58912v.m91036n(this.f156742a) + C58912v.m91036n(this.f156743b) + "\")";
    }
}

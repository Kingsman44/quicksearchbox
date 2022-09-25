package com.google.common.base;

import java.util.BitSet;

/* renamed from: com.google.common.base.m */
/* compiled from: PG */
public final class C58903m extends C58901k {

    /* renamed from: a */
    private final char f156741a;

    public C58903m(char c) {
        this.f156741a = c;
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        bitSet.set(this.f156741a);
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        return c == this.f156741a;
    }

    /* renamed from: e */
    public final C58912v mo56182e(C58912v vVar) {
        return vVar.mo56144c(this.f156741a) ? vVar : new C58910t(this, vVar);
    }

    /* renamed from: f */
    public final String mo56183f(CharSequence charSequence) {
        return charSequence.toString().replace(this.f156741a, '.');
    }

    public final String toString() {
        return "CharMatcher.is('" + C58912v.m91036n(this.f156741a) + "')";
    }
}

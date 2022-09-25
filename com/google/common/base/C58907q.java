package com.google.common.base;

import java.util.BitSet;

/* renamed from: com.google.common.base.q */
/* compiled from: PG */
public class C58907q extends C58912v {

    /* renamed from: b */
    final C58912v f156746b;

    public C58907q(C58912v vVar) {
        this.f156746b = vVar;
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.f156746b.mo56143b(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        return !this.f156746b.mo56144c(c);
    }

    /* renamed from: g */
    public final boolean mo56188g(CharSequence charSequence) {
        return this.f156746b.mo56189h(charSequence);
    }

    /* renamed from: h */
    public final boolean mo56189h(CharSequence charSequence) {
        return this.f156746b.mo56188g(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C58912v vVar = this.f156746b;
        sb.append(vVar);
        return vVar.toString().concat(".negate()");
    }
}

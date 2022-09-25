package com.google.common.base;

import java.util.BitSet;

/* renamed from: com.google.common.base.i */
/* compiled from: PG */
final class C58899i extends C58906p {

    /* renamed from: a */
    private final BitSet f156737a;

    public C58899i(BitSet bitSet, String str) {
        super(str);
        this.f156737a = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        bitSet.or(this.f156737a);
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        return this.f156737a.get(c);
    }
}

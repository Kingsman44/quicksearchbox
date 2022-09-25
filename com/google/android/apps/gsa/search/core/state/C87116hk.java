package com.google.android.apps.gsa.search.core.state;

import java.util.Arrays;
import java.util.BitSet;

/* renamed from: com.google.android.apps.gsa.search.core.state.hk */
/* compiled from: PG */
public final class C87116hk {

    /* renamed from: a */
    public final BitSet f235369a;

    public C87116hk(BitSet bitSet) {
        this.f235369a = bitSet;
    }

    /* renamed from: a */
    public static C87116hk m140776a(BitSet bitSet) {
        BitSet bitSet2 = new BitSet(250);
        bitSet2.or(bitSet);
        return new C87116hk(bitSet2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final BitSet mo80741b() {
        BitSet bitSet = new BitSet(250);
        bitSet.or(this.f235369a);
        return bitSet;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C87116hk)) {
            return false;
        }
        return this.f235369a.equals(((C87116hk) obj).f235369a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f235369a});
    }

    public final String toString() {
        return this.f235369a.toString();
    }
}

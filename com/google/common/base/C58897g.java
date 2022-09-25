package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;

/* renamed from: com.google.common.base.g */
/* compiled from: PG */
final class C58897g extends C58912v {

    /* renamed from: a */
    private final char[] f156735a;

    public C58897g(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.f156735a = charArray;
        Arrays.sort(charArray);
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        for (char c : this.f156735a) {
            bitSet.set(c);
        }
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        return Arrays.binarySearch(this.f156735a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char n : this.f156735a) {
            sb.append(C58912v.m91036n(n));
        }
        sb.append("\")");
        return sb.toString();
    }
}

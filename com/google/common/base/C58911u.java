package com.google.common.base;

import java.util.BitSet;

/* renamed from: com.google.common.base.u */
/* compiled from: PG */
public final class C58911u extends C58906p {

    /* renamed from: a */
    static final int f156750a = Integer.numberOfLeadingZeros(31);

    /* renamed from: b */
    public static final C58911u f156751b = new C58911u();

    public C58911u() {
        super("CharMatcher.whitespace()");
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        for (int i = 0; i < 32; i++) {
            bitSet.set(" 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt(i));
        }
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> f156750a) == c;
    }
}

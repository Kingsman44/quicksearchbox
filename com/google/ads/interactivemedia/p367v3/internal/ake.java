package com.google.ads.interactivemedia.p367v3.internal;

import java.util.BitSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ake */
/* compiled from: PG */
final class ake extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        BitSet bitSet = new BitSet();
        alb.mo14822a();
        int p = alb.mo14838p();
        int i = 0;
        while (p != 2) {
            int i2 = p - 1;
            if (p != 0) {
                if (i2 == 5) {
                    String g = alb.mo14829g();
                    try {
                        if (Integer.parseInt(g) == 0) {
                            i++;
                            p = alb.mo14838p();
                        }
                    } catch (NumberFormatException unused) {
                        throw new agq("Error: Expecting: bitset number value (1, 0), Found: ".concat(String.valueOf(g)));
                    }
                } else if (i2 != 6) {
                    if (i2 != 7) {
                        throw new agq("Invalid bitset value type: ".concat(alc.m18902a(p)));
                    } else if (!alb.mo14830h()) {
                        i++;
                        p = alb.mo14838p();
                    }
                } else if (alb.mo14834l() == 0) {
                    i++;
                    p = alb.mo14838p();
                }
                bitSet.set(i);
                i++;
                p = alb.mo14838p();
            } else {
                throw null;
            }
        }
        alb.mo14823b();
        return bitSet;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        BitSet bitSet = (BitSet) obj;
        ald.mo14844b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            ald.mo14852h(bitSet.get(i) ? 1 : 0);
        }
        ald.mo14847d();
    }
}

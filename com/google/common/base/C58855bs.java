package com.google.common.base;

import java.util.BitSet;

/* renamed from: com.google.common.base.bs */
/* compiled from: PG */
final class C58855bs extends C58906p {

    /* renamed from: a */
    private final char[] f156653a;

    /* renamed from: b */
    private final boolean f156654b;

    /* renamed from: c */
    private final long f156655c;

    public C58855bs(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.f156653a = cArr;
        this.f156655c = j;
        this.f156654b = z;
    }

    /* renamed from: r */
    static int m90915r(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    /* renamed from: b */
    public final void mo56143b(BitSet bitSet) {
        if (this.f156654b) {
            bitSet.set(0);
        }
        for (char c : this.f156653a) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        if (c == 0) {
            return this.f156654b;
        }
        if (((this.f156655c >> c) & 1) == 1) {
            int length = this.f156653a.length - 1;
            int r = m90915r(c) & length;
            int i = r;
            do {
                char c2 = this.f156653a[i];
                if (c2 == 0) {
                    return false;
                }
                if (c2 == c) {
                    return true;
                }
                i = (i + 1) & length;
            } while (i != r);
        }
        return false;
    }
}

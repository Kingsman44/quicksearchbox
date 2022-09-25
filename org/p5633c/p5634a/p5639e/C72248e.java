package org.p5633c.p5634a.p5639e;

import org.p5633c.p5634a.C72283g;

/* renamed from: org.c.a.e.e */
/* compiled from: PG */
final class C72248e extends C72252i {
    public C72248e(C72283g gVar, int i) {
        super(gVar, i, false, i);
    }

    /* renamed from: c */
    public final int mo63606c(C72264u uVar, String str, int i) {
        int i2;
        char charAt;
        int c = super.mo63606c(uVar, str, i);
        if (c < 0 || c == (i2 = this.f192247b + i)) {
            return c;
        }
        if (this.f192248c && ((charAt = str.charAt(i)) == '-' || charAt == '+')) {
            i2++;
        }
        if (c > i2) {
            return (i2 + 1) ^ -1;
        }
        return c < i2 ? c ^ -1 : c;
    }
}

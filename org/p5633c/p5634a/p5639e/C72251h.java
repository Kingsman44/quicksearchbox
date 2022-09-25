package org.p5633c.p5634a.p5639e;

import org.p5633c.p5634a.C72283g;

/* renamed from: org.c.a.e.h */
/* compiled from: PG */
abstract class C72251h implements C72265v, C72261r {

    /* renamed from: a */
    protected final C72283g f192246a;

    /* renamed from: b */
    protected final int f192247b;

    /* renamed from: c */
    protected final boolean f192248c;

    public C72251h(C72283g gVar, int i, boolean z) {
        this.f192246a = gVar;
        this.f192247b = i;
        this.f192248c = z;
    }

    /* renamed from: a */
    public final int mo63604a() {
        return this.f192247b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r1 = r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo63606c(org.p5633c.p5634a.p5639e.C72264u r10, java.lang.String r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.f192247b
            int r1 = r11.length()
            int r1 = r1 - r12
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000e:
            if (r2 >= r0) goto L_0x005b
            int r4 = r12 + r2
            char r4 = r11.charAt(r4)
            r5 = 57
            r6 = 48
            if (r2 != 0) goto L_0x0053
            r2 = 45
            if (r4 == r2) goto L_0x0029
            r7 = 43
            if (r4 != r7) goto L_0x0027
            r4 = 43
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x0053
        L_0x0029:
            boolean r7 = r9.f192248c
            if (r7 == 0) goto L_0x0027
            r3 = 1
            if (r4 != r2) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            if (r0 <= r3) goto L_0x0051
            int r3 = r12 + 1
            char r8 = r11.charAt(r3)
            if (r8 < r6) goto L_0x0051
            if (r8 <= r5) goto L_0x0040
            goto L_0x0051
        L_0x0040:
            if (r4 == r2) goto L_0x0043
            r12 = r3
        L_0x0043:
            int r0 = r0 + 1
            int r2 = r11.length()
            int r2 = r2 - r12
            int r0 = java.lang.Math.min(r0, r2)
            r2 = r7
            r3 = r2
            goto L_0x000e
        L_0x0051:
            r3 = r7
            goto L_0x005c
        L_0x0053:
            if (r4 < r6) goto L_0x005b
            if (r4 <= r5) goto L_0x0058
            goto L_0x005b
        L_0x0058:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x005b:
            r1 = r2
        L_0x005c:
            if (r1 != 0) goto L_0x0061
            r10 = r12 ^ -1
            return r10
        L_0x0061:
            r0 = 9
            if (r1 < r0) goto L_0x006f
            int r1 = r1 + r12
            java.lang.String r11 = r11.substring(r12, r1)
            int r11 = java.lang.Integer.parseInt(r11)
            goto L_0x0094
        L_0x006f:
            if (r3 == 0) goto L_0x0074
            int r0 = r12 + 1
            goto L_0x0075
        L_0x0074:
            r0 = r12
        L_0x0075:
            int r2 = r0 + 1
            char r0 = r11.charAt(r0)     // Catch:{ StringIndexOutOfBoundsException -> 0x009a }
            int r0 = r0 + -48
            int r1 = r1 + r12
        L_0x007e:
            if (r2 >= r1) goto L_0x008f
            int r12 = r2 + 1
            int r4 = r0 << 3
            int r0 = r0 + r0
            int r4 = r4 + r0
            char r0 = r11.charAt(r2)
            int r4 = r4 + r0
            int r0 = r4 + -48
            r2 = r12
            goto L_0x007e
        L_0x008f:
            if (r3 == 0) goto L_0x0093
            int r11 = -r0
            goto L_0x0094
        L_0x0093:
            r11 = r0
        L_0x0094:
            org.c.a.g r12 = r9.f192246a
            r10.mo63640d(r12, r11)
            return r1
        L_0x009a:
            r10 = r12 ^ -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5639e.C72251h.mo63606c(org.c.a.e.u, java.lang.String, int):int");
    }
}

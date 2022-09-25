package com.google.p4583d.p4584a.p4586b;

import com.google.p4583d.p4584a.p4587c.C60972c;
import com.google.p4583d.p4584a.p4588d.C60984k;

/* renamed from: com.google.d.a.b.c */
/* compiled from: PG */
public final class C60957c extends C60984k {

    /* renamed from: b */
    private final C60972c f165075b;

    public C60957c(C60972c cVar) {
        this.f165075b = cVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: fK */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4583d.p4584a.p4588d.C60987n mo57452fK(java.lang.String r17, com.google.p4583d.p4584a.C61012g r18, java.util.List r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = 4
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = 2
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = 3
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x0143
            if (r4 == r15) goto L_0x0117
            if (r4 == r14) goto L_0x00e8
            if (r4 == r7) goto L_0x00d4
            if (r4 == r6) goto L_0x0099
            r6 = 5
            if (r4 == r6) goto L_0x0064
            com.google.d.a.d.n r1 = super.mo57452fK(r17, r18, r19)
            return r1
        L_0x0064:
            com.google.p4583d.p4584a.C61013h.m93265g(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r4 = r2.f165215b
            com.google.d.a.d.n r1 = r4.mo57519a(r2, r1)
            java.lang.String r1 = r1.mo57475i()
            java.lang.Object r3 = r3.get(r15)
            com.google.d.a.d.n r3 = (com.google.p4583d.p4584a.p4588d.C60987n) r3
            com.google.d.a.e.c r4 = r2.f165215b
            com.google.d.a.d.n r2 = r4.mo57519a(r2, r3)
            com.google.d.a.c.c r3 = r0.f165075b
            com.google.d.a.c.b r3 = r3.f165095b
            java.lang.Object r4 = com.google.p4583d.p4584a.C61013h.m93263e(r2)
            if (r4 != 0) goto L_0x0093
            java.util.Map r3 = r3.f165093c
            r3.remove(r1)
            goto L_0x0098
        L_0x0093:
            java.util.Map r3 = r3.f165093c
            r3.put(r1, r4)
        L_0x0098:
            return r2
        L_0x0099:
            com.google.p4583d.p4584a.C61013h.m93265g(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r3 = r2.f165215b
            com.google.d.a.d.n r1 = r3.mo57519a(r2, r1)
            com.google.d.a.d.n r2 = f165114f
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00cc
            com.google.d.a.d.n r2 = f165115g
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00cc
            com.google.d.a.c.c r2 = r0.f165075b
            com.google.d.a.c.b r2 = r2.f165095b
            java.lang.String r3 = r1.mo57475i()
            r2.f165091a = r3
            com.google.d.a.d.r r2 = new com.google.d.a.d.r
            java.lang.String r1 = r1.mo57475i()
            r2.<init>(r1)
            return r2
        L_0x00cc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00d4:
            com.google.p4583d.p4584a.C61013h.m93265g(r12, r5, r3)
            com.google.d.a.c.c r1 = r0.f165075b
            com.google.d.a.c.b r1 = r1.f165095b
            com.google.d.a.d.f r2 = new com.google.d.a.d.f
            long r3 = r1.f165092b
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e8:
            com.google.p4583d.p4584a.C61013h.m93265g(r10, r5, r3)
            com.google.d.a.c.c r1 = r0.f165075b
            com.google.d.a.c.b r1 = r1.f165095b
            java.util.Map r1 = r1.f165093c
            com.google.d.a.d.k r2 = new com.google.d.a.d.k
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fe:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0116
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            com.google.d.a.d.n r5 = com.google.p4583d.p4584a.p4585a.C60953a.m93113b(r5)
            r2.mo57484q(r4, r5)
            goto L_0x00fe
        L_0x0116:
            return r2
        L_0x0117:
            com.google.p4583d.p4584a.C61013h.m93265g(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r3 = r2.f165215b
            com.google.d.a.d.n r1 = r3.mo57519a(r2, r1)
            java.lang.String r1 = r1.mo57475i()
            com.google.d.a.c.c r2 = r0.f165075b
            com.google.d.a.c.b r2 = r2.f165095b
            java.util.Map r3 = r2.f165093c
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x013d
            java.util.Map r2 = r2.f165093c
            java.lang.Object r1 = r2.get(r1)
            goto L_0x013e
        L_0x013d:
            r1 = 0
        L_0x013e:
            com.google.d.a.d.n r1 = com.google.p4583d.p4584a.p4585a.C60953a.m93113b(r1)
            return r1
        L_0x0143:
            com.google.p4583d.p4584a.C61013h.m93265g(r13, r5, r3)
            com.google.d.a.c.c r1 = r0.f165075b
            com.google.d.a.c.b r1 = r1.f165095b
            com.google.d.a.d.r r2 = new com.google.d.a.d.r
            java.lang.String r1 = r1.f165091a
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4583d.p4584a.p4586b.C60957c.mo57452fK(java.lang.String, com.google.d.a.g, java.util.List):com.google.d.a.d.n");
    }
}

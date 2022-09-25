package com.google.p4272br;

/* renamed from: com.google.br.y */
/* compiled from: PG */
final class C56456y {
    /* renamed from: b */
    private static C56455x m88192b(int i, int i2, C56455x xVar, C56455x xVar2) {
        int i3 = xVar.f150800j;
        if (i3 == 2) {
            return xVar;
        }
        if (i == i3 && (i2 & 32) == (xVar.f150792b & 32)) {
            return xVar;
        }
        if (xVar2 != null && xVar2.f150800j == i && (xVar2.f150792b & 32) == (i2 & 32) && xVar == xVar2.f150793c[0]) {
            return xVar2;
        }
        C56455x xVar3 = new C56455x(i);
        xVar3.f150792b = i2;
        xVar3.f150793c = new C56455x[]{xVar};
        return xVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.p4272br.C56455x m88191a(com.google.p4272br.C56455x r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r12.f150800j
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x0119
            r1 = 0
            switch(r2) {
                case 12: goto L_0x00ee;
                case 13: goto L_0x00dd;
                case 14: goto L_0x00dd;
                case 15: goto L_0x00dd;
                case 16: goto L_0x000f;
                case 17: goto L_0x00ee;
                case 18: goto L_0x00ee;
                default: goto L_0x000e;
            }
        L_0x000e:
            return r12
        L_0x000f:
            int r2 = r12.f150795e
            r3 = 2
            if (r2 != 0) goto L_0x001f
            int r2 = r12.f150796f
            if (r2 == 0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            com.google.br.x r12 = new com.google.br.x
            r12.<init>((int) r3)
            return r12
        L_0x001f:
            com.google.br.x[] r2 = r12.f150793c
            r2 = r2[r1]
            com.google.br.x r2 = m88191a(r2)
            int r4 = r12.f150796f
            r5 = 18
            r6 = -1
            r7 = 1
            if (r4 != r6) goto L_0x0074
            int r3 = r12.f150795e
            if (r3 != 0) goto L_0x003c
            r1 = 14
            int r12 = r12.f150792b
            com.google.br.x r12 = m88192b(r1, r12, r2, r0)
            return r12
        L_0x003c:
            r4 = 15
            if (r3 != r7) goto L_0x0047
            int r12 = r12.f150792b
            com.google.br.x r12 = m88192b(r4, r12, r2, r0)
            return r12
        L_0x0047:
            com.google.br.x r3 = new com.google.br.x
            r3.<init>((int) r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0051:
            int r7 = r12.f150795e
            int r7 = r7 + r6
            if (r1 >= r7) goto L_0x005c
            r5.add(r2)
            int r1 = r1 + 1
            goto L_0x0051
        L_0x005c:
            int r12 = r12.f150792b
            com.google.br.x r12 = m88192b(r4, r12, r2, r0)
            r5.add(r12)
            int r12 = r5.size()
            com.google.br.x[] r12 = new com.google.p4272br.C56455x[r12]
            java.lang.Object[] r12 = r5.toArray(r12)
            com.google.br.x[] r12 = (com.google.p4272br.C56455x[]) r12
            r3.f150793c = r12
            return r3
        L_0x0074:
            int r6 = r12.f150795e
            if (r6 != r7) goto L_0x007c
            if (r4 == r7) goto L_0x007b
            goto L_0x0080
        L_0x007b:
            return r2
        L_0x007c:
            if (r6 > 0) goto L_0x0080
            r4 = r0
            goto L_0x0090
        L_0x0080:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
        L_0x0086:
            int r8 = r12.f150795e
            if (r6 >= r8) goto L_0x0090
            r4.add(r2)
            int r6 = r6 + 1
            goto L_0x0086
        L_0x0090:
            int r6 = r12.f150796f
            int r8 = r12.f150795e
            if (r6 <= r8) goto L_0x00c1
            int r6 = r12.f150792b
            r8 = 16
            com.google.br.x r6 = m88192b(r8, r6, r2, r0)
            int r9 = r12.f150795e
            int r9 = r9 + r7
        L_0x00a1:
            int r10 = r12.f150796f
            if (r9 >= r10) goto L_0x00bb
            com.google.br.x r10 = new com.google.br.x
            r10.<init>((int) r5)
            com.google.br.x[] r11 = new com.google.p4272br.C56455x[r3]
            r11[r1] = r2
            r11[r7] = r6
            r10.f150793c = r11
            int r6 = r12.f150792b
            com.google.br.x r6 = m88192b(r8, r6, r10, r0)
            int r9 = r9 + 1
            goto L_0x00a1
        L_0x00bb:
            if (r4 != 0) goto L_0x00be
            return r6
        L_0x00be:
            r4.add(r6)
        L_0x00c1:
            if (r4 == 0) goto L_0x00d7
            com.google.br.x r12 = new com.google.br.x
            r12.<init>((int) r5)
            int r0 = r4.size()
            com.google.br.x[] r0 = new com.google.p4272br.C56455x[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            com.google.br.x[] r0 = (com.google.p4272br.C56455x[]) r0
            r12.f150793c = r0
            return r12
        L_0x00d7:
            com.google.br.x r12 = new com.google.br.x
            r12.<init>((int) r7)
            return r12
        L_0x00dd:
            com.google.br.x[] r0 = r12.f150793c
            r0 = r0[r1]
            com.google.br.x r0 = m88191a(r0)
            int r1 = r12.f150800j
            int r2 = r12.f150792b
            com.google.br.x r12 = m88192b(r1, r2, r0, r12)
            return r12
        L_0x00ee:
            r3 = r12
            r2 = 0
        L_0x00f0:
            com.google.br.x[] r4 = r12.f150793c
            int r5 = r4.length
            if (r2 >= r5) goto L_0x0118
            r4 = r4[r2]
            com.google.br.x r5 = m88191a(r4)
            if (r3 != r12) goto L_0x010f
            if (r5 == r4) goto L_0x010f
            com.google.br.x r3 = new com.google.br.x
            r3.<init>((com.google.p4272br.C56455x) r12)
            r3.f150794d = r0
            com.google.br.x[] r4 = r12.f150793c
            int r6 = r4.length
            com.google.br.x[] r4 = com.google.p4272br.C56448q.m88160k(r4, r1, r6)
            r3.f150793c = r4
        L_0x010f:
            if (r3 == r12) goto L_0x0115
            com.google.br.x[] r4 = r3.f150793c
            r4[r2] = r5
        L_0x0115:
            int r2 = r2 + 1
            goto L_0x00f0
        L_0x0118:
            return r3
        L_0x0119:
            goto L_0x011b
        L_0x011a:
            throw r0
        L_0x011b:
            goto L_0x011a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4272br.C56456y.m88191a(com.google.br.x):com.google.br.x");
    }
}

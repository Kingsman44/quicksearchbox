package com.google.common.p4526f.p4533e;

/* renamed from: com.google.common.f.e.b */
/* compiled from: PG */
public final class C59074b extends C59078f {

    /* renamed from: a */
    public static final C59078f f157038a = new C59074b();

    private C59074b() {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.common.f.e.c, com.google.common.f.d.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo56338a(com.google.common.p4526f.p4533e.C59075c r7, int r8, java.lang.String r9, int r10, int r11, int r12) {
        /*
            r6 = this;
            int r0 = r12 + 1
            char r1 = r9.charAt(r12)
            r2 = r1 & 32
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x000e
            r5 = 1
            goto L_0x000f
        L_0x000e:
            r5 = 0
        L_0x000f:
            com.google.common.f.b.c r11 = com.google.common.p4526f.p4528b.C59028c.m91264b(r9, r11, r12, r5)
            int r12 = com.google.common.p4526f.p4528b.C59016b.m91243a(r1)
            com.google.common.f.b.b[] r5 = com.google.common.p4526f.p4528b.C59016b.f156922k
            r12 = r5[r12]
            if (r2 == 0) goto L_0x001e
            goto L_0x0028
        L_0x001e:
            r2 = 0
            if (r12 == 0) goto L_0x0027
            int r5 = r12.f156926n
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x0028
        L_0x0027:
            r12 = r2
        L_0x0028:
            if (r12 == 0) goto L_0x0042
            int r1 = r12.f156926n
            com.google.common.f.b.d r2 = r12.f156925m
            boolean r2 = r2.f156951f
            boolean r1 = r11.mo56296e(r1, r2)
            if (r1 == 0) goto L_0x003b
            com.google.common.f.d.e r8 = com.google.common.p4526f.p4532d.C59070e.m91329b(r8, r12, r11)
            goto L_0x0096
        L_0x003b:
            java.lang.String r7 = "invalid format specifier"
            com.google.common.f.e.e r7 = com.google.common.p4526f.p4533e.C59077e.m91340b(r7, r9, r10, r0)
            throw r7
        L_0x0042:
            r12 = 116(0x74, float:1.63E-43)
            r2 = 160(0xa0, float:2.24E-43)
            java.lang.String r5 = "invalid format specification"
            if (r1 == r12) goto L_0x006f
            r12 = 84
            if (r1 != r12) goto L_0x004f
            goto L_0x006f
        L_0x004f:
            r12 = 104(0x68, float:1.46E-43)
            if (r1 == r12) goto L_0x005d
            r12 = 72
            if (r1 != r12) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            com.google.common.f.e.e r7 = com.google.common.p4526f.p4533e.C59077e.m91340b(r5, r9, r10, r0)
            throw r7
        L_0x005d:
            boolean r12 = r11.mo56296e(r2, r3)
            if (r12 == 0) goto L_0x006a
            com.google.common.f.e.a r9 = new com.google.common.f.e.a
            r9.<init>(r11, r8)
            r8 = r9
            goto L_0x0096
        L_0x006a:
            com.google.common.f.e.e r7 = com.google.common.p4526f.p4533e.C59077e.m91340b(r5, r9, r10, r0)
            throw r7
        L_0x006f:
            boolean r12 = r11.mo56296e(r2, r3)
            if (r12 == 0) goto L_0x00ea
            int r12 = r0 + 1
            int r1 = r9.length()
            if (r12 > r1) goto L_0x00e3
            char r1 = r9.charAt(r0)
            java.util.Map r2 = com.google.common.p4526f.p4532d.C59066a.f157003F
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r1 = r2.get(r1)
            com.google.common.f.d.a r1 = (com.google.common.p4526f.p4532d.C59066a) r1
            if (r1 == 0) goto L_0x00dc
            com.google.common.f.d.b r9 = new com.google.common.f.d.b
            r9.<init>(r11, r8, r1)
            r8 = r9
            r0 = r12
        L_0x0096:
            int r9 = r8.f157033a
            r11 = 32
            if (r9 >= r11) goto L_0x00a3
            int r11 = r7.f157040e
            int r12 = r4 << r9
            r11 = r11 | r12
            r7.f157040e = r11
        L_0x00a3:
            int r11 = r7.f157041f
            int r9 = java.lang.Math.max(r11, r9)
            r7.f157041f = r9
            com.google.common.f.b.aj r9 = r7.f157039d
            com.google.common.f.e.d r11 = r9.f156910a
            r12 = r7
            com.google.common.f.b.a r12 = (com.google.common.p4526f.p4528b.C58981a) r12
            java.lang.StringBuilder r1 = r12.f156843b
            java.lang.String r9 = r9.f156911b
            int r2 = r12.f156844c
            r11.mo56340c(r1, r9, r2, r10)
            java.lang.Object[] r9 = r12.f156842a
            int r10 = r8.f157033a
            int r11 = r9.length
            if (r10 >= r11) goto L_0x00d2
            r9 = r9[r10]
            if (r9 == 0) goto L_0x00ca
            r8.mo56336a(r7, r9)
            goto L_0x00d9
        L_0x00ca:
            java.lang.StringBuilder r7 = r12.f156843b
            java.lang.String r8 = "null"
            r7.append(r8)
            goto L_0x00d9
        L_0x00d2:
            java.lang.StringBuilder r7 = r12.f156843b
            java.lang.String r8 = "[ERROR: MISSING LOG ARGUMENT]"
            r7.append(r8)
        L_0x00d9:
            r12.f156844c = r0
            return r0
        L_0x00dc:
            java.lang.String r7 = "illegal date/time conversion"
            com.google.common.f.e.e r7 = com.google.common.p4526f.p4533e.C59077e.m91339a(r7, r9, r0)
            throw r7
        L_0x00e3:
            java.lang.String r7 = "truncated format specifier"
            com.google.common.f.e.e r7 = com.google.common.p4526f.p4533e.C59077e.m91339a(r7, r9, r10)
            throw r7
        L_0x00ea:
            com.google.common.f.e.e r7 = com.google.common.p4526f.p4533e.C59077e.m91340b(r5, r9, r10, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4526f.p4533e.C59074b.mo56338a(com.google.common.f.e.c, int, java.lang.String, int, int, int):int");
    }
}

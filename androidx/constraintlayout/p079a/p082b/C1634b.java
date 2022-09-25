package androidx.constraintlayout.p079a.p082b;

/* renamed from: androidx.constraintlayout.a.b.b */
/* compiled from: PG */
public final class C1634b {
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02bd, code lost:
        if (r3.f4570d == r9) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        if (r5.f4570d == r4) goto L_0x012e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x073f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4389a(androidx.constraintlayout.p079a.p082b.C1639g r36, androidx.constraintlayout.p079a.C1649d r37, java.util.ArrayList r38, int r39) {
        /*
            r0 = r36
            r10 = r37
            r11 = r38
            r12 = 2
            r13 = 0
            if (r39 != 0) goto L_0x0013
            int r1 = r0.f4675aQ
            androidx.constraintlayout.a.b.c[] r2 = r0.f4678aT
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001b
        L_0x0013:
            int r1 = r0.f4676aR
            androidx.constraintlayout.a.b.c[] r2 = r0.f4677aS
            r14 = r1
            r15 = r2
            r16 = 2
        L_0x001b:
            r9 = 0
        L_0x001c:
            if (r9 >= r14) goto L_0x076d
            r1 = r15[r9]
            boolean r2 = r1.f4566t
            r8 = 8
            r17 = 0
            r7 = 1
            if (r2 != 0) goto L_0x0184
            int r2 = r1.f4561o
            int r2 = r2 + r2
            androidx.constraintlayout.a.b.f r4 = r1.f4547a
            r5 = r4
            r6 = 0
        L_0x0030:
            if (r6 != 0) goto L_0x0140
            int r6 = r1.f4555i
            int r6 = r6 + r7
            r1.f4555i = r6
            androidx.constraintlayout.a.b.f[] r6 = r4.f4616aI
            int r3 = r1.f4561o
            r6[r3] = r17
            androidx.constraintlayout.a.b.f[] r6 = r4.f4615aH
            r6[r3] = r17
            int r6 = r4.f4637aq
            if (r6 == r8) goto L_0x010c
            int r6 = r1.f4558l
            int r6 = r6 + r7
            r1.f4558l = r6
            if (r3 != 0) goto L_0x0051
            androidx.constraintlayout.a.b.e[] r3 = r4.f4605Y
            r3 = r3[r13]
            goto L_0x0055
        L_0x0051:
            androidx.constraintlayout.a.b.e[] r3 = r4.f4605Y
            r3 = r3[r7]
        L_0x0055:
            androidx.constraintlayout.a.b.e r6 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r3 == r6) goto L_0x006b
            int r3 = r1.f4559m
            int r6 = r1.f4561o
            if (r6 != 0) goto L_0x0064
            int r6 = r4.mo4631i()
            goto L_0x0068
        L_0x0064:
            int r6 = r4.mo4630h()
        L_0x0068:
            int r3 = r3 + r6
            r1.f4559m = r3
        L_0x006b:
            int r3 = r1.f4559m
            androidx.constraintlayout.a.b.d[] r6 = r4.f4602V
            r6 = r6[r2]
            int r6 = r6.mo4601b()
            int r3 = r3 + r6
            r1.f4559m = r3
            int r6 = r2 + 1
            androidx.constraintlayout.a.b.d[] r13 = r4.f4602V
            r13 = r13[r6]
            int r13 = r13.mo4601b()
            int r3 = r3 + r13
            r1.f4559m = r3
            int r3 = r1.f4560n
            androidx.constraintlayout.a.b.d[] r13 = r4.f4602V
            r13 = r13[r2]
            int r13 = r13.mo4601b()
            int r3 = r3 + r13
            r1.f4560n = r3
            androidx.constraintlayout.a.b.d[] r13 = r4.f4602V
            r6 = r13[r6]
            int r6 = r6.mo4601b()
            int r3 = r3 + r6
            r1.f4560n = r3
            androidx.constraintlayout.a.b.f r3 = r1.f4548b
            if (r3 != 0) goto L_0x00a3
            r1.f4548b = r4
        L_0x00a3:
            r1.f4550d = r4
            androidx.constraintlayout.a.b.e[] r3 = r4.f4605Y
            int r6 = r1.f4561o
            r3 = r3[r6]
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r3 != r13) goto L_0x010c
            int[] r13 = r4.f4666v
            r13 = r13[r6]
            r8 = 3
            if (r13 == 0) goto L_0x00bb
            if (r13 == r8) goto L_0x00bb
            if (r13 != r12) goto L_0x010a
            r13 = 2
        L_0x00bb:
            int r12 = r1.f4556j
            int r12 = r12 + r7
            r1.f4556j = r12
            float[] r12 = r4.f4614aG
            r6 = r12[r6]
            r12 = 0
            int r21 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r21 <= 0) goto L_0x00ce
            float r12 = r1.f4557k
            float r12 = r12 + r6
            r1.f4557k = r12
        L_0x00ce:
            int r12 = r4.f4637aq
            r7 = 8
            if (r12 == r7) goto L_0x00f8
            androidx.constraintlayout.a.b.e r7 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r3 != r7) goto L_0x00f8
            if (r13 == 0) goto L_0x00dc
            if (r13 != r8) goto L_0x00f8
        L_0x00dc:
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x00e5
            r3 = 1
            r1.f4563q = r3
            goto L_0x00e8
        L_0x00e5:
            r3 = 1
            r1.f4564r = r3
        L_0x00e8:
            java.util.ArrayList r3 = r1.f4554h
            if (r3 != 0) goto L_0x00f3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f4554h = r3
        L_0x00f3:
            java.util.ArrayList r3 = r1.f4554h
            r3.add(r4)
        L_0x00f8:
            androidx.constraintlayout.a.b.f r3 = r1.f4552f
            if (r3 != 0) goto L_0x00fe
            r1.f4552f = r4
        L_0x00fe:
            androidx.constraintlayout.a.b.f r3 = r1.f4553g
            if (r3 == 0) goto L_0x0108
            androidx.constraintlayout.a.b.f[] r3 = r3.f4615aH
            int r6 = r1.f4561o
            r3[r6] = r4
        L_0x0108:
            r1.f4553g = r4
        L_0x010a:
            int r3 = r1.f4561o
        L_0x010c:
            if (r5 == r4) goto L_0x0114
            androidx.constraintlayout.a.b.f[] r3 = r5.f4616aI
            int r5 = r1.f4561o
            r3[r5] = r4
        L_0x0114:
            androidx.constraintlayout.a.b.d[] r3 = r4.f4602V
            int r5 = r2 + 1
            r3 = r3[r5]
            androidx.constraintlayout.a.b.d r3 = r3.f4571e
            if (r3 == 0) goto L_0x012c
            androidx.constraintlayout.a.b.f r3 = r3.f4570d
            androidx.constraintlayout.a.b.d[] r5 = r3.f4602V
            r5 = r5[r2]
            androidx.constraintlayout.a.b.d r5 = r5.f4571e
            if (r5 == 0) goto L_0x012c
            androidx.constraintlayout.a.b.f r5 = r5.f4570d
            if (r5 == r4) goto L_0x012e
        L_0x012c:
            r3 = r17
        L_0x012e:
            if (r3 == 0) goto L_0x0132
            r6 = 0
            goto L_0x0133
        L_0x0132:
            r6 = 1
        L_0x0133:
            if (r3 == 0) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r3 = r4
        L_0x0137:
            r5 = r4
            r7 = 1
            r8 = 8
            r12 = 2
            r13 = 0
            r4 = r3
            goto L_0x0030
        L_0x0140:
            androidx.constraintlayout.a.b.f r3 = r1.f4548b
            if (r3 == 0) goto L_0x0151
            int r5 = r1.f4559m
            androidx.constraintlayout.a.b.d[] r3 = r3.f4602V
            r3 = r3[r2]
            int r3 = r3.mo4601b()
            int r5 = r5 - r3
            r1.f4559m = r5
        L_0x0151:
            androidx.constraintlayout.a.b.f r3 = r1.f4550d
            if (r3 == 0) goto L_0x0164
            int r5 = r1.f4559m
            androidx.constraintlayout.a.b.d[] r3 = r3.f4602V
            int r2 = r2 + 1
            r2 = r3[r2]
            int r2 = r2.mo4601b()
            int r5 = r5 - r2
            r1.f4559m = r5
        L_0x0164:
            r1.f4549c = r4
            int r2 = r1.f4561o
            if (r2 != 0) goto L_0x0173
            boolean r2 = r1.f4562p
            if (r2 == 0) goto L_0x0173
            androidx.constraintlayout.a.b.f r2 = r1.f4549c
            r1.f4551e = r2
            goto L_0x0177
        L_0x0173:
            androidx.constraintlayout.a.b.f r2 = r1.f4547a
            r1.f4551e = r2
        L_0x0177:
            boolean r2 = r1.f4564r
            if (r2 == 0) goto L_0x0181
            boolean r2 = r1.f4563q
            if (r2 == 0) goto L_0x0181
            r2 = 1
            goto L_0x0182
        L_0x0181:
            r2 = 0
        L_0x0182:
            r1.f4565s = r2
        L_0x0184:
            r2 = 1
            r1.f4566t = r2
            if (r11 == 0) goto L_0x019c
            androidx.constraintlayout.a.b.f r2 = r1.f4547a
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L_0x0192
            goto L_0x019c
        L_0x0192:
            r23 = r9
            r28 = r14
            r29 = r15
            r22 = 2
            goto L_0x075f
        L_0x019c:
            androidx.constraintlayout.a.b.f r12 = r1.f4547a
            androidx.constraintlayout.a.b.f r13 = r1.f4549c
            androidx.constraintlayout.a.b.f r8 = r1.f4548b
            androidx.constraintlayout.a.b.f r7 = r1.f4550d
            androidx.constraintlayout.a.b.f r2 = r1.f4551e
            float r3 = r1.f4557k
            androidx.constraintlayout.a.b.f r4 = r1.f4552f
            androidx.constraintlayout.a.b.f r4 = r1.f4553g
            androidx.constraintlayout.a.b.e[] r4 = r0.f4605Y
            r4 = r4[r39]
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r39 != 0) goto L_0x01d9
            int r6 = r2.f4610aC
            if (r6 != 0) goto L_0x01be
            r22 = r3
            r3 = 1
            r21 = 1
            goto L_0x01c3
        L_0x01be:
            r22 = r3
            r3 = 1
            r21 = 0
        L_0x01c3:
            if (r6 != r3) goto L_0x01cb
            r23 = r9
            r9 = 2
            r20 = 1
            goto L_0x01d0
        L_0x01cb:
            r23 = r9
            r9 = 2
            r20 = 0
        L_0x01d0:
            if (r6 != r9) goto L_0x01d4
            r6 = 1
            goto L_0x01d5
        L_0x01d4:
            r6 = 0
        L_0x01d5:
            r9 = r12
            r24 = r21
            goto L_0x01f7
        L_0x01d9:
            r22 = r3
            r23 = r9
            r3 = 1
            r9 = 2
            int r6 = r2.f4611aD
            if (r6 != 0) goto L_0x01e6
            r20 = 1
            goto L_0x01e8
        L_0x01e6:
            r20 = 0
        L_0x01e8:
            if (r6 != r3) goto L_0x01ec
            r3 = 1
            goto L_0x01ed
        L_0x01ec:
            r3 = 0
        L_0x01ed:
            if (r6 != r9) goto L_0x01f1
            r6 = 1
            goto L_0x01f2
        L_0x01f1:
            r6 = 0
        L_0x01f2:
            r9 = r12
            r24 = r20
            r20 = r3
        L_0x01f7:
            r3 = 0
        L_0x01f8:
            if (r3 != 0) goto L_0x02d3
            androidx.constraintlayout.a.b.d[] r3 = r9.f4602V
            r3 = r3[r16]
            r11 = 1
            if (r11 == r6) goto L_0x0204
            r27 = 4
            goto L_0x0206
        L_0x0204:
            r27 = 1
        L_0x0206:
            int r11 = r3.mo4601b()
            r28 = r14
            androidx.constraintlayout.a.b.e[] r14 = r9.f4605Y
            r14 = r14[r39]
            r29 = r15
            androidx.constraintlayout.a.b.e r15 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r14 != r15) goto L_0x021e
            int[] r14 = r9.f4666v
            r14 = r14[r39]
            if (r14 != 0) goto L_0x021e
            r14 = 1
            goto L_0x021f
        L_0x021e:
            r14 = 0
        L_0x021f:
            androidx.constraintlayout.a.b.d r15 = r3.f4571e
            if (r15 == 0) goto L_0x022b
            if (r9 == r12) goto L_0x022b
            int r30 = r15.mo4601b()
            int r11 = r11 + r30
        L_0x022b:
            if (r6 == 0) goto L_0x0233
            if (r9 == r12) goto L_0x0233
            if (r9 == r8) goto L_0x0233
            r27 = 8
        L_0x0233:
            if (r15 == 0) goto L_0x026f
            if (r9 != r8) goto L_0x0244
            r30 = r2
            androidx.constraintlayout.a.i r2 = r3.f4574h
            androidx.constraintlayout.a.i r15 = r15.f4574h
            r31 = r12
            r12 = 6
            r10.mo4679g(r2, r15, r11, r12)
            goto L_0x0251
        L_0x0244:
            r30 = r2
            r31 = r12
            androidx.constraintlayout.a.i r2 = r3.f4574h
            androidx.constraintlayout.a.i r12 = r15.f4574h
            r15 = 8
            r10.mo4679g(r2, r12, r11, r15)
        L_0x0251:
            if (r14 == 0) goto L_0x0257
            if (r6 != 0) goto L_0x0257
            r27 = 5
        L_0x0257:
            if (r9 != r8) goto L_0x0263
            if (r6 == 0) goto L_0x0263
            boolean[] r2 = r9.f4604X
            boolean r2 = r2[r39]
            if (r2 == 0) goto L_0x0263
            r2 = 5
            goto L_0x0265
        L_0x0263:
            r2 = r27
        L_0x0265:
            androidx.constraintlayout.a.i r12 = r3.f4574h
            androidx.constraintlayout.a.b.d r3 = r3.f4571e
            androidx.constraintlayout.a.i r3 = r3.f4574h
            r10.mo4684l(r12, r3, r11, r2)
            goto L_0x0273
        L_0x026f:
            r30 = r2
            r31 = r12
        L_0x0273:
            if (r4 != r5) goto L_0x02a7
            int r2 = r9.f4637aq
            r3 = 8
            if (r2 == r3) goto L_0x0295
            androidx.constraintlayout.a.b.e[] r2 = r9.f4605Y
            r2 = r2[r39]
            androidx.constraintlayout.a.b.e r3 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x0295
            androidx.constraintlayout.a.b.d[] r2 = r9.f4602V
            int r3 = r16 + 1
            r3 = r2[r3]
            androidx.constraintlayout.a.i r3 = r3.f4574h
            r2 = r2[r16]
            androidx.constraintlayout.a.i r2 = r2.f4574h
            r11 = 5
            r12 = 0
            r10.mo4679g(r3, r2, r12, r11)
            goto L_0x0296
        L_0x0295:
            r12 = 0
        L_0x0296:
            androidx.constraintlayout.a.b.d[] r2 = r9.f4602V
            r2 = r2[r16]
            androidx.constraintlayout.a.i r2 = r2.f4574h
            androidx.constraintlayout.a.b.d[] r3 = r0.f4602V
            r3 = r3[r16]
            androidx.constraintlayout.a.i r3 = r3.f4574h
            r11 = 8
            r10.mo4679g(r2, r3, r12, r11)
        L_0x02a7:
            androidx.constraintlayout.a.b.d[] r2 = r9.f4602V
            int r3 = r16 + 1
            r2 = r2[r3]
            androidx.constraintlayout.a.b.d r2 = r2.f4571e
            if (r2 == 0) goto L_0x02bf
            androidx.constraintlayout.a.b.f r2 = r2.f4570d
            androidx.constraintlayout.a.b.d[] r3 = r2.f4602V
            r3 = r3[r16]
            androidx.constraintlayout.a.b.d r3 = r3.f4571e
            if (r3 == 0) goto L_0x02bf
            androidx.constraintlayout.a.b.f r3 = r3.f4570d
            if (r3 == r9) goto L_0x02c1
        L_0x02bf:
            r2 = r17
        L_0x02c1:
            if (r2 == 0) goto L_0x02c5
            r3 = 0
            goto L_0x02c6
        L_0x02c5:
            r3 = 1
        L_0x02c6:
            if (r2 == 0) goto L_0x02c9
            r9 = r2
        L_0x02c9:
            r14 = r28
            r15 = r29
            r2 = r30
            r12 = r31
            goto L_0x01f8
        L_0x02d3:
            r30 = r2
            r31 = r12
            r28 = r14
            r29 = r15
            if (r7 == 0) goto L_0x0337
            int r2 = r16 + 1
            androidx.constraintlayout.a.b.d[] r3 = r13.f4602V
            r3 = r3[r2]
            androidx.constraintlayout.a.b.d r3 = r3.f4571e
            if (r3 == 0) goto L_0x0337
            androidx.constraintlayout.a.b.d[] r3 = r7.f4602V
            r3 = r3[r2]
            androidx.constraintlayout.a.b.e[] r9 = r7.f4605Y
            r9 = r9[r39]
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x030f
            int[] r9 = r7.f4666v
            r9 = r9[r39]
            if (r9 != 0) goto L_0x030f
            if (r6 != 0) goto L_0x030f
            androidx.constraintlayout.a.b.d r9 = r3.f4571e
            androidx.constraintlayout.a.b.f r11 = r9.f4570d
            if (r11 != r0) goto L_0x030f
            androidx.constraintlayout.a.i r11 = r3.f4574h
            androidx.constraintlayout.a.i r9 = r9.f4574h
            int r12 = r3.mo4601b()
            int r12 = -r12
            r14 = 5
            r10.mo4684l(r11, r9, r12, r14)
            goto L_0x0324
        L_0x030f:
            if (r6 == 0) goto L_0x0324
            androidx.constraintlayout.a.b.d r9 = r3.f4571e
            androidx.constraintlayout.a.b.f r11 = r9.f4570d
            if (r11 != r0) goto L_0x0324
            androidx.constraintlayout.a.i r11 = r3.f4574h
            androidx.constraintlayout.a.i r9 = r9.f4574h
            int r12 = r3.mo4601b()
            int r12 = -r12
            r14 = 4
            r10.mo4684l(r11, r9, r12, r14)
        L_0x0324:
            androidx.constraintlayout.a.i r9 = r3.f4574h
            androidx.constraintlayout.a.b.d[] r11 = r13.f4602V
            r2 = r11[r2]
            androidx.constraintlayout.a.b.d r2 = r2.f4571e
            androidx.constraintlayout.a.i r2 = r2.f4574h
            int r3 = r3.mo4601b()
            int r3 = -r3
            r11 = 6
            r10.mo4680h(r9, r2, r3, r11)
        L_0x0337:
            if (r4 != r5) goto L_0x0350
            androidx.constraintlayout.a.b.d[] r2 = r0.f4602V
            int r3 = r16 + 1
            r2 = r2[r3]
            androidx.constraintlayout.a.i r2 = r2.f4574h
            androidx.constraintlayout.a.b.d[] r4 = r13.f4602V
            r3 = r4[r3]
            androidx.constraintlayout.a.i r4 = r3.f4574h
            int r3 = r3.mo4601b()
            r5 = 8
            r10.mo4679g(r2, r4, r3, r5)
        L_0x0350:
            java.util.ArrayList r2 = r1.f4554h
            if (r2 == 0) goto L_0x0464
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x0464
            boolean r4 = r1.f4563q
            if (r4 == 0) goto L_0x0367
            boolean r4 = r1.f4565s
            if (r4 != 0) goto L_0x0367
            int r4 = r1.f4556j
            float r4 = (float) r4
            goto L_0x0369
        L_0x0367:
            r4 = r22
        L_0x0369:
            r9 = r17
            r5 = 0
            r12 = 0
        L_0x036d:
            if (r12 >= r3) goto L_0x0464
            java.lang.Object r11 = r2.get(r12)
            androidx.constraintlayout.a.b.f r11 = (androidx.constraintlayout.p079a.p082b.C1638f) r11
            float[] r14 = r11.f4614aG
            r14 = r14[r39]
            r18 = 0
            int r22 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r22 >= 0) goto L_0x039a
            boolean r14 = r1.f4565s
            if (r14 == 0) goto L_0x0396
            androidx.constraintlayout.a.b.d[] r11 = r11.f4602V
            int r14 = r16 + 1
            r14 = r11[r14]
            androidx.constraintlayout.a.i r14 = r14.f4574h
            r11 = r11[r16]
            androidx.constraintlayout.a.i r11 = r11.f4574h
            r0 = 0
            r15 = 4
            r10.mo4684l(r14, r11, r0, r15)
            r15 = 0
            goto L_0x03b3
        L_0x0396:
            r0 = 4
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x039b
        L_0x039a:
            r0 = 4
        L_0x039b:
            r18 = 0
            int r22 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r22 != 0) goto L_0x03bb
            androidx.constraintlayout.a.b.d[] r11 = r11.f4602V
            int r14 = r16 + 1
            r14 = r11[r14]
            androidx.constraintlayout.a.i r14 = r14.f4574h
            r11 = r11[r16]
            androidx.constraintlayout.a.i r11 = r11.f4574h
            r0 = 8
            r15 = 0
            r10.mo4684l(r14, r11, r15, r0)
        L_0x03b3:
            r18 = r1
            r32 = r2
            r22 = r3
            goto L_0x0458
        L_0x03bb:
            r0 = 0
            if (r9 == 0) goto L_0x044d
            androidx.constraintlayout.a.b.d[] r9 = r9.f4602V
            r0 = r9[r16]
            androidx.constraintlayout.a.i r0 = r0.f4574h
            int r22 = r16 + 1
            r9 = r9[r22]
            androidx.constraintlayout.a.i r9 = r9.f4574h
            androidx.constraintlayout.a.b.d[] r15 = r11.f4602V
            r32 = r2
            r2 = r15[r16]
            androidx.constraintlayout.a.i r2 = r2.f4574h
            r15 = r15[r22]
            androidx.constraintlayout.a.i r15 = r15.f4574h
            r22 = r3
            androidx.constraintlayout.a.b r3 = r37.mo4673a()
            r33 = r11
            r11 = 0
            r3.f4478b = r11
            r18 = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r34 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r34 == 0) goto L_0x0431
            int r34 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r34 != 0) goto L_0x03ee
            goto L_0x0431
        L_0x03ee:
            int r34 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r34 != 0) goto L_0x03ff
            androidx.constraintlayout.a.a r2 = r3.f4481e
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.mo4507g(r0, r5)
            androidx.constraintlayout.a.a r0 = r3.f4481e
            r0.mo4507g(r9, r1)
            goto L_0x0449
        L_0x03ff:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r34 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r34 != 0) goto L_0x0412
            androidx.constraintlayout.a.a r0 = r3.f4481e
            r0.mo4507g(r2, r1)
            androidx.constraintlayout.a.a r0 = r3.f4481e
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo4507g(r15, r1)
            goto L_0x0449
        L_0x0412:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r5 / r4
            float r34 = r14 / r4
            float r5 = r5 / r34
            androidx.constraintlayout.a.a r11 = r3.f4481e
            r11.mo4507g(r0, r1)
            androidx.constraintlayout.a.a r0 = r3.f4481e
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo4507g(r9, r11)
            androidx.constraintlayout.a.a r0 = r3.f4481e
            r0.mo4507g(r15, r5)
            androidx.constraintlayout.a.a r0 = r3.f4481e
            float r1 = -r5
            r0.mo4507g(r2, r1)
            goto L_0x0449
        L_0x0431:
            r1 = 1065353216(0x3f800000, float:1.0)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            androidx.constraintlayout.a.a r5 = r3.f4481e
            r5.mo4507g(r0, r1)
            androidx.constraintlayout.a.a r0 = r3.f4481e
            r0.mo4507g(r9, r11)
            androidx.constraintlayout.a.a r0 = r3.f4481e
            r0.mo4507g(r15, r1)
            androidx.constraintlayout.a.a r0 = r3.f4481e
            r0.mo4507g(r2, r11)
        L_0x0449:
            r10.mo4677e(r3)
            goto L_0x0455
        L_0x044d:
            r18 = r1
            r32 = r2
            r22 = r3
            r33 = r11
        L_0x0455:
            r5 = r14
            r9 = r33
        L_0x0458:
            int r12 = r12 + 1
            r0 = r36
            r1 = r18
            r3 = r22
            r2 = r32
            goto L_0x036d
        L_0x0464:
            r18 = r1
            if (r8 == 0) goto L_0x04ca
            if (r8 == r7) goto L_0x046c
            if (r6 == 0) goto L_0x04ca
        L_0x046c:
            r0 = r31
            androidx.constraintlayout.a.b.d[] r0 = r0.f4602V
            r0 = r0[r16]
            int r1 = r16 + 1
            androidx.constraintlayout.a.b.d[] r2 = r13.f4602V
            r2 = r2[r1]
            androidx.constraintlayout.a.b.d r0 = r0.f4571e
            if (r0 == 0) goto L_0x0480
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r3 = r0
            goto L_0x0482
        L_0x0480:
            r3 = r17
        L_0x0482:
            androidx.constraintlayout.a.b.d r0 = r2.f4571e
            if (r0 == 0) goto L_0x048a
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r6 = r0
            goto L_0x048c
        L_0x048a:
            r6 = r17
        L_0x048c:
            androidx.constraintlayout.a.b.d[] r0 = r8.f4602V
            r0 = r0[r16]
            if (r7 == 0) goto L_0x0496
            androidx.constraintlayout.a.b.d[] r2 = r7.f4602V
            r2 = r2[r1]
        L_0x0496:
            if (r3 == 0) goto L_0x04c4
            if (r6 == 0) goto L_0x04c4
            if (r39 != 0) goto L_0x04a1
            r1 = r30
            float r1 = r1.f4634an
            goto L_0x04a5
        L_0x04a1:
            r1 = r30
            float r1 = r1.f4635ao
        L_0x04a5:
            r5 = r1
            int r4 = r0.mo4601b()
            int r9 = r2.mo4601b()
            androidx.constraintlayout.a.i r0 = r0.f4574h
            androidx.constraintlayout.a.i r11 = r2.f4574h
            r12 = 7
            r1 = r37
            r2 = r0
            r14 = r7
            r7 = r11
            r11 = r8
            r8 = r9
            r15 = r23
            r22 = 2
            r9 = r12
            r1.mo4676d(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0703
        L_0x04c4:
            r14 = r7
            r11 = r8
            r22 = 2
            goto L_0x0703
        L_0x04ca:
            r14 = r7
            r11 = r8
            r15 = r23
            r0 = r31
            r22 = 2
            if (r24 == 0) goto L_0x05d2
            if (r11 == 0) goto L_0x05d2
            r1 = r18
            int r2 = r1.f4556j
            if (r2 <= 0) goto L_0x04e2
            int r1 = r1.f4555i
            if (r1 != r2) goto L_0x04e2
            r12 = 1
            goto L_0x04e3
        L_0x04e2:
            r12 = 0
        L_0x04e3:
            r8 = r11
            r9 = r8
        L_0x04e5:
            if (r9 == 0) goto L_0x05ce
            androidx.constraintlayout.a.b.f[] r1 = r9.f4616aI
            r1 = r1[r39]
            r7 = r1
        L_0x04ec:
            if (r7 == 0) goto L_0x04f9
            int r1 = r7.f4637aq
            r6 = 8
            if (r1 != r6) goto L_0x04fb
            androidx.constraintlayout.a.b.f[] r1 = r7.f4616aI
            r7 = r1[r39]
            goto L_0x04ec
        L_0x04f9:
            r6 = 8
        L_0x04fb:
            if (r7 != 0) goto L_0x050a
            if (r9 != r14) goto L_0x0500
            goto L_0x050a
        L_0x0500:
            r18 = r7
            r19 = r12
            r23 = r15
            r15 = r8
        L_0x0507:
            r12 = r9
            goto L_0x05bd
        L_0x050a:
            androidx.constraintlayout.a.b.d[] r1 = r9.f4602V
            r1 = r1[r16]
            androidx.constraintlayout.a.i r2 = r1.f4574h
            androidx.constraintlayout.a.b.d r3 = r1.f4571e
            if (r3 == 0) goto L_0x0517
            androidx.constraintlayout.a.i r3 = r3.f4574h
            goto L_0x0519
        L_0x0517:
            r3 = r17
        L_0x0519:
            if (r8 == r9) goto L_0x0524
            androidx.constraintlayout.a.b.d[] r3 = r8.f4602V
            int r4 = r16 + 1
            r3 = r3[r4]
            androidx.constraintlayout.a.i r3 = r3.f4574h
            goto L_0x0533
        L_0x0524:
            if (r9 != r11) goto L_0x0533
            androidx.constraintlayout.a.b.d[] r3 = r0.f4602V
            r3 = r3[r16]
            androidx.constraintlayout.a.b.d r3 = r3.f4571e
            if (r3 == 0) goto L_0x0531
            androidx.constraintlayout.a.i r3 = r3.f4574h
            goto L_0x0533
        L_0x0531:
            r3 = r17
        L_0x0533:
            int r1 = r1.mo4601b()
            int r4 = r16 + 1
            androidx.constraintlayout.a.b.d[] r5 = r9.f4602V
            r5 = r5[r4]
            int r5 = r5.mo4601b()
            if (r7 == 0) goto L_0x054e
            androidx.constraintlayout.a.b.d[] r6 = r7.f4602V
            r6 = r6[r16]
            r18 = r7
            androidx.constraintlayout.a.i r7 = r6.f4574h
        L_0x054b:
            r23 = r15
            goto L_0x055f
        L_0x054e:
            r18 = r7
            androidx.constraintlayout.a.b.d[] r6 = r13.f4602V
            r6 = r6[r4]
            androidx.constraintlayout.a.b.d r6 = r6.f4571e
            if (r6 == 0) goto L_0x055b
            androidx.constraintlayout.a.i r7 = r6.f4574h
            goto L_0x054b
        L_0x055b:
            r23 = r15
            r7 = r17
        L_0x055f:
            androidx.constraintlayout.a.b.d[] r15 = r9.f4602V
            r15 = r15[r4]
            androidx.constraintlayout.a.i r15 = r15.f4574h
            if (r6 == 0) goto L_0x056c
            int r6 = r6.mo4601b()
            int r5 = r5 + r6
        L_0x056c:
            androidx.constraintlayout.a.b.d[] r6 = r8.f4602V
            r6 = r6[r4]
            int r6 = r6.mo4601b()
            int r1 = r1 + r6
            if (r2 == 0) goto L_0x05b8
            if (r3 == 0) goto L_0x05b8
            if (r7 == 0) goto L_0x05b8
            if (r15 == 0) goto L_0x05b8
            if (r9 != r11) goto L_0x0587
            androidx.constraintlayout.a.b.d[] r1 = r11.f4602V
            r1 = r1[r16]
            int r1 = r1.mo4601b()
        L_0x0587:
            r6 = r1
            if (r9 != r14) goto L_0x0595
            androidx.constraintlayout.a.b.d[] r1 = r14.f4602V
            r1 = r1[r4]
            int r1 = r1.mo4601b()
            r21 = r1
            goto L_0x0597
        L_0x0595:
            r21 = r5
        L_0x0597:
            r5 = 1
            if (r5 == r12) goto L_0x059d
            r25 = 5
            goto L_0x059f
        L_0x059d:
            r25 = 8
        L_0x059f:
            r26 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r4 = r6
            r27 = 1
            r5 = r26
            r19 = 8
            r6 = r7
            r7 = r15
            r15 = r8
            r8 = r21
            r19 = r12
            r12 = r9
            r9 = r25
            r1.mo4676d(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x05bd
        L_0x05b8:
            r15 = r8
            r19 = r12
            goto L_0x0507
        L_0x05bd:
            int r1 = r12.f4637aq
            r9 = 8
            if (r1 == r9) goto L_0x05c5
            r8 = r12
            goto L_0x05c6
        L_0x05c5:
            r8 = r15
        L_0x05c6:
            r9 = r18
            r12 = r19
            r15 = r23
            goto L_0x04e5
        L_0x05ce:
            r23 = r15
            goto L_0x0703
        L_0x05d2:
            r23 = r15
            r1 = r18
            r9 = 8
            if (r20 == 0) goto L_0x0703
            if (r11 == 0) goto L_0x0703
            int r2 = r1.f4556j
            if (r2 <= 0) goto L_0x05e6
            int r1 = r1.f4555i
            if (r1 != r2) goto L_0x05e6
            r12 = 1
            goto L_0x05e7
        L_0x05e6:
            r12 = 0
        L_0x05e7:
            r8 = r11
            r15 = r8
        L_0x05e9:
            if (r15 == 0) goto L_0x06b1
            androidx.constraintlayout.a.b.f[] r1 = r15.f4616aI
            r1 = r1[r39]
        L_0x05ef:
            if (r1 == 0) goto L_0x05fa
            int r2 = r1.f4637aq
            if (r2 != r9) goto L_0x05fa
            androidx.constraintlayout.a.b.f[] r1 = r1.f4616aI
            r1 = r1[r39]
            goto L_0x05ef
        L_0x05fa:
            if (r15 == r11) goto L_0x0696
            if (r15 == r14) goto L_0x0696
            if (r1 == 0) goto L_0x0696
            if (r1 != r14) goto L_0x0605
            r7 = r17
            goto L_0x0606
        L_0x0605:
            r7 = r1
        L_0x0606:
            androidx.constraintlayout.a.b.d[] r1 = r15.f4602V
            r1 = r1[r16]
            androidx.constraintlayout.a.i r2 = r1.f4574h
            androidx.constraintlayout.a.b.d r3 = r1.f4571e
            int r3 = r16 + 1
            androidx.constraintlayout.a.b.d[] r4 = r8.f4602V
            r4 = r4[r3]
            androidx.constraintlayout.a.i r4 = r4.f4574h
            int r1 = r1.mo4601b()
            androidx.constraintlayout.a.b.d[] r5 = r15.f4602V
            r5 = r5[r3]
            int r5 = r5.mo4601b()
            if (r7 == 0) goto L_0x063b
            androidx.constraintlayout.a.b.d[] r6 = r7.f4602V
            r6 = r6[r16]
            androidx.constraintlayout.a.i r9 = r6.f4574h
            r18 = r7
            androidx.constraintlayout.a.b.d r7 = r6.f4571e
            if (r7 == 0) goto L_0x0633
            androidx.constraintlayout.a.i r7 = r7.f4574h
            goto L_0x0635
        L_0x0633:
            r7 = r17
        L_0x0635:
            r35 = r9
            r9 = r7
            r7 = r35
            goto L_0x064e
        L_0x063b:
            r18 = r7
            androidx.constraintlayout.a.b.d[] r6 = r14.f4602V
            r6 = r6[r16]
            if (r6 == 0) goto L_0x0646
            androidx.constraintlayout.a.i r7 = r6.f4574h
            goto L_0x0648
        L_0x0646:
            r7 = r17
        L_0x0648:
            androidx.constraintlayout.a.b.d[] r9 = r15.f4602V
            r9 = r9[r3]
            androidx.constraintlayout.a.i r9 = r9.f4574h
        L_0x064e:
            if (r6 == 0) goto L_0x0655
            int r6 = r6.mo4601b()
            int r5 = r5 + r6
        L_0x0655:
            r19 = r5
            androidx.constraintlayout.a.b.d[] r5 = r8.f4602V
            r3 = r5[r3]
            int r3 = r3.mo4601b()
            int r5 = r1 + r3
            r6 = 1
            if (r6 == r12) goto L_0x0667
            r21 = 4
            goto L_0x0669
        L_0x0667:
            r21 = 8
        L_0x0669:
            if (r2 == 0) goto L_0x068b
            if (r4 == 0) goto L_0x068b
            if (r7 == 0) goto L_0x068b
            if (r9 == 0) goto L_0x068b
            r25 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r3 = r4
            r4 = r5
            r5 = r25
            r25 = 1
            r6 = r7
            r7 = r9
            r26 = r8
            r8 = r19
            r19 = r12
            r12 = 8
            r9 = r21
            r1.mo4676d(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0693
        L_0x068b:
            r26 = r8
            r19 = r12
            r12 = 8
            r25 = 1
        L_0x0693:
            r8 = r18
            goto L_0x069f
        L_0x0696:
            r26 = r8
            r19 = r12
            r12 = 8
            r25 = 1
            r8 = r1
        L_0x069f:
            int r1 = r15.f4637aq
            if (r1 == r12) goto L_0x06a4
            goto L_0x06a6
        L_0x06a4:
            r15 = r26
        L_0x06a6:
            r12 = r19
            r9 = 8
            r35 = r15
            r15 = r8
            r8 = r35
            goto L_0x05e9
        L_0x06b1:
            androidx.constraintlayout.a.b.d[] r1 = r11.f4602V
            r1 = r1[r16]
            androidx.constraintlayout.a.b.d[] r0 = r0.f4602V
            r0 = r0[r16]
            androidx.constraintlayout.a.b.d r0 = r0.f4571e
            int r2 = r16 + 1
            androidx.constraintlayout.a.b.d[] r3 = r14.f4602V
            r12 = r3[r2]
            androidx.constraintlayout.a.b.d[] r3 = r13.f4602V
            r2 = r3[r2]
            androidx.constraintlayout.a.b.d r15 = r2.f4571e
            if (r0 == 0) goto L_0x06f2
            if (r11 == r14) goto L_0x06d8
            androidx.constraintlayout.a.i r2 = r1.f4574h
            androidx.constraintlayout.a.i r0 = r0.f4574h
            int r1 = r1.mo4601b()
            r3 = 5
            r10.mo4684l(r2, r0, r1, r3)
            goto L_0x06f2
        L_0x06d8:
            if (r15 == 0) goto L_0x06f2
            androidx.constraintlayout.a.i r2 = r1.f4574h
            androidx.constraintlayout.a.i r3 = r0.f4574h
            int r4 = r1.mo4601b()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.a.i r6 = r12.f4574h
            androidx.constraintlayout.a.i r7 = r15.f4574h
            int r8 = r12.mo4601b()
            r9 = 5
            r1 = r37
            r1.mo4676d(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x06f2:
            if (r15 == 0) goto L_0x0703
            if (r11 == r14) goto L_0x0703
            androidx.constraintlayout.a.i r0 = r12.f4574h
            androidx.constraintlayout.a.i r1 = r15.f4574h
            int r2 = r12.mo4601b()
            int r2 = -r2
            r3 = 5
            r10.mo4684l(r0, r1, r2, r3)
        L_0x0703:
            if (r24 != 0) goto L_0x0707
            if (r20 == 0) goto L_0x075f
        L_0x0707:
            if (r11 == 0) goto L_0x075f
            if (r11 == r14) goto L_0x075f
            androidx.constraintlayout.a.b.d[] r0 = r11.f4602V
            r1 = r0[r16]
            if (r14 != 0) goto L_0x0713
            r8 = r11
            goto L_0x0714
        L_0x0713:
            r8 = r14
        L_0x0714:
            int r2 = r16 + 1
            androidx.constraintlayout.a.b.d[] r3 = r8.f4602V
            r3 = r3[r2]
            androidx.constraintlayout.a.b.d r4 = r1.f4571e
            if (r4 == 0) goto L_0x0721
            androidx.constraintlayout.a.i r4 = r4.f4574h
            goto L_0x0723
        L_0x0721:
            r4 = r17
        L_0x0723:
            androidx.constraintlayout.a.b.d r5 = r3.f4571e
            if (r5 == 0) goto L_0x072a
            androidx.constraintlayout.a.i r5 = r5.f4574h
            goto L_0x072c
        L_0x072a:
            r5 = r17
        L_0x072c:
            if (r13 == r8) goto L_0x073c
            androidx.constraintlayout.a.b.d[] r5 = r13.f4602V
            r5 = r5[r2]
            androidx.constraintlayout.a.b.d r5 = r5.f4571e
            if (r5 == 0) goto L_0x0739
            androidx.constraintlayout.a.i r5 = r5.f4574h
            goto L_0x073c
        L_0x0739:
            r6 = r17
            goto L_0x073d
        L_0x073c:
            r6 = r5
        L_0x073d:
            if (r11 != r8) goto L_0x0741
            r3 = r0[r2]
        L_0x0741:
            if (r4 == 0) goto L_0x075f
            if (r6 == 0) goto L_0x075f
            int r0 = r1.mo4601b()
            androidx.constraintlayout.a.b.d[] r5 = r8.f4602V
            r2 = r5[r2]
            int r8 = r2.mo4601b()
            androidx.constraintlayout.a.i r2 = r1.f4574h
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.a.i r7 = r3.f4574h
            r9 = 5
            r1 = r37
            r3 = r4
            r4 = r0
            r1.mo4676d(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x075f:
            int r9 = r23 + 1
            r12 = 2
            r0 = r36
            r11 = r38
            r14 = r28
            r15 = r29
            r13 = 0
            goto L_0x001c
        L_0x076d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.C1634b.m4389a(androidx.constraintlayout.a.b.g, androidx.constraintlayout.a.d, java.util.ArrayList, int):void");
    }
}

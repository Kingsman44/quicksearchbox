package org.p5633c.p5634a.p5637c;

/* renamed from: org.c.a.c.f */
/* compiled from: PG */
public final class C72197f {

    /* renamed from: a */
    public final C72194c[] f192166a;

    /* renamed from: b */
    private C72196e[] f192167b = new C72196e[16];

    public C72197f(C72194c[] cVarArr) {
        this.f192166a = cVarArr;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0105 A[EDGE_INSN: B:93:0x0105->B:67:0x0105 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    public final org.p5633c.p5634a.p5637c.C72194c mo63539a(java.lang.Class r14) {
        /*
            r13 = this;
            org.c.a.c.e[] r0 = r13.f192167b
            int r1 = r0.length
            r2 = 0
            if (r14 != 0) goto L_0x0008
        L_0x0006:
            r3 = 0
            goto L_0x000f
        L_0x0008:
            int r3 = r14.hashCode()
            int r4 = r1 + -1
            r3 = r3 & r4
        L_0x000f:
            r4 = r0[r3]
            if (r4 == 0) goto L_0x001f
            java.lang.Class r5 = r4.f192164a
            if (r5 != r14) goto L_0x001a
            org.c.a.c.c r14 = r4.f192165b
            return r14
        L_0x001a:
            int r3 = r3 + 1
            if (r3 < r1) goto L_0x000f
            goto L_0x0006
        L_0x001f:
            org.c.a.c.c[] r4 = r13.f192166a
            int r5 = r4.length
            r7 = r13
            r6 = r5
        L_0x0024:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x0044
            r8 = r4[r5]
            java.lang.Class r9 = r8.mo63536g()
            if (r9 != r14) goto L_0x0032
            goto L_0x00cc
        L_0x0032:
            if (r9 == 0) goto L_0x003c
            if (r14 == 0) goto L_0x0024
            boolean r8 = r9.isAssignableFrom(r14)
            if (r8 != 0) goto L_0x0024
        L_0x003c:
            org.c.a.c.f r7 = r7.mo63540b(r5)
            org.c.a.c.c[] r4 = r7.f192166a
            int r6 = r4.length
            goto L_0x0024
        L_0x0044:
            r8 = 0
            if (r14 == 0) goto L_0x00cc
            if (r6 != 0) goto L_0x004b
            goto L_0x00cc
        L_0x004b:
            r5 = 1
            if (r6 != r5) goto L_0x0052
            r8 = r4[r2]
            goto L_0x00cc
        L_0x0052:
            r9 = r7
            r7 = r6
        L_0x0054:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x007f
            r10 = r4[r6]
            java.lang.Class r10 = r10.mo63536g()
            r11 = r9
            r9 = r7
        L_0x0060:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x007c
            if (r7 == r6) goto L_0x0060
            r12 = r4[r7]
            java.lang.Class r12 = r12.mo63536g()
            boolean r12 = r12.isAssignableFrom(r10)
            if (r12 == 0) goto L_0x0060
            org.c.a.c.f r11 = r11.mo63540b(r7)
            org.c.a.c.c[] r4 = r11.f192166a
            int r9 = r4.length
            int r6 = r9 + -1
            goto L_0x0060
        L_0x007c:
            r7 = r9
            r9 = r11
            goto L_0x0054
        L_0x007f:
            if (r7 != r5) goto L_0x0084
            r8 = r4[r2]
            goto L_0x00cc
        L_0x0084:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to find best converter for type \""
            r0.<init>(r1)
            java.lang.String r14 = r14.getName()
            r0.append(r14)
            java.lang.String r14 = "\" from remaining set: "
            r0.append(r14)
        L_0x0097:
            if (r2 >= r7) goto L_0x00c2
            r14 = r4[r2]
            java.lang.Class r1 = r14.mo63536g()
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getName()
            r0.append(r14)
            r14 = 91
            r0.append(r14)
            if (r1 != 0) goto L_0x00b3
            r14 = r8
            goto L_0x00b7
        L_0x00b3:
            java.lang.String r14 = r1.getName()
        L_0x00b7:
            r0.append(r14)
            java.lang.String r14 = "], "
            r0.append(r14)
            int r2 = r2 + 1
            goto L_0x0097
        L_0x00c2:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x00cc:
            org.c.a.c.e r4 = new org.c.a.c.e
            r4.<init>(r14, r8)
            java.lang.Object r14 = r0.clone()
            org.c.a.c.e[] r14 = (org.p5633c.p5634a.p5637c.C72196e[]) r14
            r14[r3] = r4
            r0 = 0
        L_0x00da:
            if (r0 >= r1) goto L_0x00e6
            r3 = r14[r0]
            if (r3 != 0) goto L_0x00e3
            r13.f192167b = r14
            return r8
        L_0x00e3:
            int r0 = r0 + 1
            goto L_0x00da
        L_0x00e6:
            int r0 = r1 + r1
            org.c.a.c.e[] r3 = new org.p5633c.p5634a.p5637c.C72196e[r0]
            r4 = 0
        L_0x00eb:
            if (r4 >= r1) goto L_0x010a
            r5 = r14[r4]
            java.lang.Class r6 = r5.f192164a
            if (r6 != 0) goto L_0x00f5
        L_0x00f3:
            r6 = 0
            goto L_0x00fc
        L_0x00f5:
            int r6 = r6.hashCode()
            int r7 = r0 + -1
            r6 = r6 & r7
        L_0x00fc:
            r7 = r3[r6]
            if (r7 == 0) goto L_0x0105
            int r6 = r6 + 1
            if (r6 < r0) goto L_0x00fc
            goto L_0x00f3
        L_0x0105:
            r3[r6] = r5
            int r4 = r4 + 1
            goto L_0x00eb
        L_0x010a:
            r13.f192167b = r3
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5637c.C72197f.mo63539a(java.lang.Class):org.c.a.c.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C72197f mo63540b(int i) {
        C72194c[] cVarArr = this.f192166a;
        int length = cVarArr.length;
        if (i < length) {
            C72194c[] cVarArr2 = new C72194c[(length - 1)];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 != i) {
                    cVarArr2[i2] = cVarArr[i3];
                    i2++;
                }
            }
            return new C72197f(cVarArr2);
        }
        throw new IndexOutOfBoundsException();
    }
}

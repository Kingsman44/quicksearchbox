package androidx.constraintlayout.p079a.p082b;

import java.util.HashMap;

/* renamed from: androidx.constraintlayout.a.b.a */
/* compiled from: PG */
public final class C1615a extends C1643k {

    /* renamed from: a */
    public int f4482a = 0;

    /* renamed from: b */
    public boolean f4483b = true;

    /* renamed from: c */
    public int f4484c = 0;

    /* renamed from: d */
    boolean f4485d = false;

    /* renamed from: a */
    public final int mo4559a() {
        int i = this.f4482a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fa, code lost:
        if (r6 != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fe, code lost:
        if (r7 != false) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x019b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4560b(androidx.constraintlayout.p079a.C1649d r14, boolean r15) {
        /*
            r13 = this;
            androidx.constraintlayout.a.b.d[] r15 = r13.f4602V
            androidx.constraintlayout.a.b.d r0 = r13.f4594N
            r1 = 0
            r15[r1] = r0
            androidx.constraintlayout.a.b.d r0 = r13.f4595O
            r2 = 2
            r15[r2] = r0
            androidx.constraintlayout.a.b.d r0 = r13.f4596P
            r3 = 1
            r15[r3] = r0
            androidx.constraintlayout.a.b.d r0 = r13.f4597Q
            r4 = 3
            r15[r4] = r0
            r15 = 0
        L_0x0017:
            androidx.constraintlayout.a.b.d[] r0 = r13.f4602V
            int r5 = r0.length
            r5 = 6
            if (r15 >= r5) goto L_0x0028
            r0 = r0[r15]
            androidx.constraintlayout.a.i r5 = r14.mo4674b(r0)
            r0.f4574h = r5
            int r15 = r15 + 1
            goto L_0x0017
        L_0x0028:
            int r15 = r13.f4482a
            if (r15 < 0) goto L_0x0212
            r5 = 4
            if (r15 >= r5) goto L_0x0212
            r15 = r0[r15]
            boolean r0 = r13.f4485d
            if (r0 != 0) goto L_0x0038
            r13.mo4562d()
        L_0x0038:
            boolean r0 = r13.f4485d
            if (r0 == 0) goto L_0x0071
            r13.f4485d = r1
            int r15 = r13.f4482a
            if (r15 == 0) goto L_0x005e
            if (r15 != r3) goto L_0x0045
            goto L_0x005e
        L_0x0045:
            if (r15 == r2) goto L_0x004b
            if (r15 != r4) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            return
        L_0x004b:
            androidx.constraintlayout.a.b.d r15 = r13.f4595O
            androidx.constraintlayout.a.i r15 = r15.f4574h
            int r0 = r13.f4626af
            r14.mo4678f(r15, r0)
            androidx.constraintlayout.a.b.d r15 = r13.f4597Q
            androidx.constraintlayout.a.i r15 = r15.f4574h
            int r0 = r13.f4626af
            r14.mo4678f(r15, r0)
            return
        L_0x005e:
            androidx.constraintlayout.a.b.d r15 = r13.f4594N
            androidx.constraintlayout.a.i r15 = r15.f4574h
            int r0 = r13.f4625ae
            r14.mo4678f(r15, r0)
            androidx.constraintlayout.a.b.d r15 = r13.f4596P
            androidx.constraintlayout.a.i r15 = r15.f4574h
            int r0 = r13.f4625ae
            r14.mo4678f(r15, r0)
            return
        L_0x0071:
            r0 = 0
        L_0x0072:
            int r6 = r13.f4743bf
            if (r0 >= r6) goto L_0x00bf
            androidx.constraintlayout.a.b.f[] r6 = r13.f4742be
            r6 = r6[r0]
            boolean r7 = r13.f4483b
            if (r7 != 0) goto L_0x0085
            boolean r7 = r6.mo4563e()
            if (r7 != 0) goto L_0x0085
            goto L_0x00bc
        L_0x0085:
            int r7 = r13.f4482a
            if (r7 == 0) goto L_0x008b
            if (r7 != r3) goto L_0x00a1
        L_0x008b:
            androidx.constraintlayout.a.b.e[] r7 = r6.f4605Y
            r7 = r7[r1]
            androidx.constraintlayout.a.b.e r8 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x00a1
            androidx.constraintlayout.a.b.d r7 = r6.f4594N
            androidx.constraintlayout.a.b.d r7 = r7.f4571e
            if (r7 == 0) goto L_0x00a1
            androidx.constraintlayout.a.b.d r7 = r6.f4596P
            androidx.constraintlayout.a.b.d r7 = r7.f4571e
            if (r7 == 0) goto L_0x00a1
        L_0x009f:
            r0 = 1
            goto L_0x00c0
        L_0x00a1:
            int r7 = r13.f4482a
            if (r7 == r2) goto L_0x00a7
            if (r7 != r4) goto L_0x00bc
        L_0x00a7:
            androidx.constraintlayout.a.b.e[] r7 = r6.f4605Y
            r7 = r7[r3]
            androidx.constraintlayout.a.b.e r8 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x00bc
            androidx.constraintlayout.a.b.d r7 = r6.f4595O
            androidx.constraintlayout.a.b.d r7 = r7.f4571e
            if (r7 == 0) goto L_0x00bc
            androidx.constraintlayout.a.b.d r6 = r6.f4597Q
            androidx.constraintlayout.a.b.d r6 = r6.f4571e
            if (r6 == 0) goto L_0x00bc
            goto L_0x009f
        L_0x00bc:
            int r0 = r0 + 1
            goto L_0x0072
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            androidx.constraintlayout.a.b.d r6 = r13.f4594N
            boolean r6 = r6.mo4607h()
            if (r6 != 0) goto L_0x00d3
            androidx.constraintlayout.a.b.d r6 = r13.f4596P
            boolean r6 = r6.mo4607h()
            if (r6 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r6 = 0
            goto L_0x00d4
        L_0x00d3:
            r6 = 1
        L_0x00d4:
            androidx.constraintlayout.a.b.d r7 = r13.f4595O
            boolean r7 = r7.mo4607h()
            if (r7 != 0) goto L_0x00e7
            androidx.constraintlayout.a.b.d r7 = r13.f4597Q
            boolean r7 = r7.mo4607h()
            if (r7 == 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r7 = 0
            goto L_0x00e8
        L_0x00e7:
            r7 = 1
        L_0x00e8:
            if (r0 != 0) goto L_0x0101
            int r0 = r13.f4482a
            r8 = 5
            if (r0 != 0) goto L_0x00f3
            if (r6 != 0) goto L_0x0102
            r0 = 0
            r6 = 0
        L_0x00f3:
            if (r0 != r2) goto L_0x00f8
            if (r7 != 0) goto L_0x0102
            r7 = 0
        L_0x00f8:
            if (r0 != r3) goto L_0x00fc
            if (r6 != 0) goto L_0x0102
        L_0x00fc:
            if (r0 != r4) goto L_0x0101
            if (r7 == 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r8 = 4
        L_0x0102:
            r0 = 0
        L_0x0103:
            int r6 = r13.f4743bf
            if (r0 >= r6) goto L_0x016f
            androidx.constraintlayout.a.b.f[] r6 = r13.f4742be
            r6 = r6[r0]
            boolean r7 = r13.f4483b
            if (r7 != 0) goto L_0x0116
            boolean r7 = r6.mo4563e()
            if (r7 != 0) goto L_0x0116
            goto L_0x016c
        L_0x0116:
            androidx.constraintlayout.a.b.d[] r7 = r6.f4602V
            int r9 = r13.f4482a
            r7 = r7[r9]
            androidx.constraintlayout.a.i r7 = r14.mo4674b(r7)
            androidx.constraintlayout.a.b.d[] r6 = r6.f4602V
            int r9 = r13.f4482a
            r6 = r6[r9]
            r6.f4574h = r7
            androidx.constraintlayout.a.b.d r10 = r6.f4571e
            if (r10 == 0) goto L_0x0133
            androidx.constraintlayout.a.b.f r10 = r10.f4570d
            if (r10 != r13) goto L_0x0133
            int r6 = r6.f4572f
            goto L_0x0134
        L_0x0133:
            r6 = 0
        L_0x0134:
            if (r9 == 0) goto L_0x014f
            if (r9 != r2) goto L_0x0139
            goto L_0x014f
        L_0x0139:
            androidx.constraintlayout.a.i r9 = r15.f4574h
            int r10 = r13.f4484c
            androidx.constraintlayout.a.b r11 = r14.mo4673a()
            androidx.constraintlayout.a.i r12 = r14.mo4675c()
            r12.f4791e = r1
            int r10 = r10 + r6
            r11.mo4554h(r9, r7, r12, r10)
            r14.mo4677e(r11)
            goto L_0x0164
        L_0x014f:
            androidx.constraintlayout.a.i r9 = r15.f4574h
            int r10 = r13.f4484c
            androidx.constraintlayout.a.b r11 = r14.mo4673a()
            androidx.constraintlayout.a.i r12 = r14.mo4675c()
            r12.f4791e = r1
            int r10 = r10 - r6
            r11.mo4555i(r9, r7, r12, r10)
            r14.mo4677e(r11)
        L_0x0164:
            androidx.constraintlayout.a.i r9 = r15.f4574h
            int r10 = r13.f4484c
            int r10 = r10 + r6
            r14.mo4684l(r9, r7, r10, r8)
        L_0x016c:
            int r0 = r0 + 1
            goto L_0x0103
        L_0x016f:
            int r15 = r13.f4482a
            r0 = 8
            if (r15 != 0) goto L_0x019b
            androidx.constraintlayout.a.b.d r15 = r13.f4596P
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.d r2 = r13.f4594N
            androidx.constraintlayout.a.i r2 = r2.f4574h
            r14.mo4684l(r15, r2, r1, r0)
            androidx.constraintlayout.a.b.d r15 = r13.f4594N
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.f r0 = r13.f4606Z
            androidx.constraintlayout.a.b.d r0 = r0.f4596P
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r14.mo4684l(r15, r0, r1, r5)
            androidx.constraintlayout.a.b.d r15 = r13.f4594N
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.f r0 = r13.f4606Z
            androidx.constraintlayout.a.b.d r0 = r0.f4594N
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r14.mo4684l(r15, r0, r1, r1)
            return
        L_0x019b:
            if (r15 != r3) goto L_0x01c3
            androidx.constraintlayout.a.b.d r15 = r13.f4594N
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.d r2 = r13.f4596P
            androidx.constraintlayout.a.i r2 = r2.f4574h
            r14.mo4684l(r15, r2, r1, r0)
            androidx.constraintlayout.a.b.d r15 = r13.f4594N
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.f r0 = r13.f4606Z
            androidx.constraintlayout.a.b.d r0 = r0.f4594N
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r14.mo4684l(r15, r0, r1, r5)
            androidx.constraintlayout.a.b.d r15 = r13.f4594N
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.f r0 = r13.f4606Z
            androidx.constraintlayout.a.b.d r0 = r0.f4596P
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r14.mo4684l(r15, r0, r1, r1)
            return
        L_0x01c3:
            if (r15 != r2) goto L_0x01eb
            androidx.constraintlayout.a.b.d r15 = r13.f4597Q
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.d r2 = r13.f4595O
            androidx.constraintlayout.a.i r2 = r2.f4574h
            r14.mo4684l(r15, r2, r1, r0)
            androidx.constraintlayout.a.b.d r15 = r13.f4595O
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.f r0 = r13.f4606Z
            androidx.constraintlayout.a.b.d r0 = r0.f4597Q
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r14.mo4684l(r15, r0, r1, r5)
            androidx.constraintlayout.a.b.d r15 = r13.f4595O
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.f r0 = r13.f4606Z
            androidx.constraintlayout.a.b.d r0 = r0.f4595O
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r14.mo4684l(r15, r0, r1, r1)
            return
        L_0x01eb:
            if (r15 != r4) goto L_0x0212
            androidx.constraintlayout.a.b.d r15 = r13.f4595O
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.d r2 = r13.f4597Q
            androidx.constraintlayout.a.i r2 = r2.f4574h
            r14.mo4684l(r15, r2, r1, r0)
            androidx.constraintlayout.a.b.d r15 = r13.f4595O
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.f r0 = r13.f4606Z
            androidx.constraintlayout.a.b.d r0 = r0.f4595O
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r14.mo4684l(r15, r0, r1, r5)
            androidx.constraintlayout.a.b.d r15 = r13.f4595O
            androidx.constraintlayout.a.i r15 = r15.f4574h
            androidx.constraintlayout.a.b.f r0 = r13.f4606Z
            androidx.constraintlayout.a.b.d r0 = r0.f4597Q
            androidx.constraintlayout.a.i r0 = r0.f4574h
            r14.mo4684l(r15, r0, r1, r1)
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.C1615a.mo4560b(androidx.constraintlayout.a.d, boolean):void");
    }

    /* renamed from: c */
    public final void mo4561c(C1638f fVar, HashMap hashMap) {
        super.mo4561c(fVar, hashMap);
        C1615a aVar = (C1615a) fVar;
        this.f4482a = aVar.f4482a;
        this.f4483b = aVar.f4483b;
        this.f4484c = aVar.f4484c;
    }

    /* renamed from: d */
    public final boolean mo4562d() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f4743bf;
            if (i4 >= i) {
                break;
            }
            C1638f fVar = this.f4742be[i4];
            if ((this.f4483b || fVar.mo4563e()) && ((((i2 = this.f4482a) == 0 || i2 == 1) && !fVar.mo4564f()) || (((i3 = this.f4482a) == 2 || i3 == 3) && !fVar.mo4565g()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f4743bf; i6++) {
            C1638f fVar2 = this.f4742be[i6];
            if (this.f4483b || fVar2.mo4563e()) {
                if (!z2) {
                    int i7 = this.f4482a;
                    if (i7 == 0) {
                        i5 = fVar2.mo4626L(2).mo4600a();
                    } else if (i7 == 1) {
                        i5 = fVar2.mo4626L(4).mo4600a();
                    } else if (i7 == 2) {
                        i5 = fVar2.mo4626L(3).mo4600a();
                    } else if (i7 == 3) {
                        i5 = fVar2.mo4626L(5).mo4600a();
                    }
                }
                int i8 = this.f4482a;
                if (i8 == 0) {
                    i5 = Math.min(i5, fVar2.mo4626L(2).mo4600a());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, fVar2.mo4626L(4).mo4600a());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, fVar2.mo4626L(3).mo4600a());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, fVar2.mo4626L(5).mo4600a());
                }
                z2 = true;
            }
        }
        int i9 = i5 + this.f4484c;
        int i10 = this.f4482a;
        if (i10 == 0 || i10 == 1) {
            mo4646x(i9, i9);
        } else {
            mo4647y(i9, i9);
        }
        this.f4485d = true;
        return true;
    }

    /* renamed from: e */
    public final boolean mo4563e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo4564f() {
        return this.f4485d;
    }

    /* renamed from: g */
    public final boolean mo4565g() {
        return this.f4485d;
    }

    public final String toString() {
        String str = "[Barrier] " + this.f4638ar + " {";
        for (int i = 0; i < this.f4743bf; i++) {
            C1638f fVar = this.f4742be[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str.concat(String.valueOf(fVar.f4638ar));
        }
        return str.concat("}");
    }
}

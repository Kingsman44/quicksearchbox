package androidx.constraintlayout.p079a.p082b;

/* renamed from: androidx.constraintlayout.a.b.h */
/* compiled from: PG */
final class C1640h {

    /* renamed from: a */
    public C1638f f4692a = null;

    /* renamed from: b */
    int f4693b = 0;

    /* renamed from: c */
    public int f4694c = 0;

    /* renamed from: d */
    public int f4695d = 0;

    /* renamed from: e */
    public int f4696e = 0;

    /* renamed from: f */
    public int f4697f = 0;

    /* renamed from: g */
    public int f4698g = 0;

    /* renamed from: h */
    final /* synthetic */ C1641i f4699h;

    /* renamed from: i */
    private int f4700i;

    /* renamed from: j */
    private C1636d f4701j;

    /* renamed from: k */
    private C1636d f4702k;

    /* renamed from: l */
    private C1636d f4703l;

    /* renamed from: m */
    private C1636d f4704m;

    /* renamed from: n */
    private int f4705n;

    /* renamed from: o */
    private int f4706o = 0;

    /* renamed from: p */
    private int f4707p;

    /* renamed from: q */
    private int f4708q = 0;

    /* renamed from: r */
    private int f4709r;

    public C1640h(C1641i iVar, int i, C1636d dVar, C1636d dVar2, C1636d dVar3, C1636d dVar4, int i2) {
        this.f4699h = iVar;
        this.f4700i = i;
        this.f4701j = dVar;
        this.f4702k = dVar2;
        this.f4703l = dVar3;
        this.f4704m = dVar4;
        this.f4705n = iVar.f4749bk;
        this.f4706o = iVar.f4745bg;
        this.f4707p = iVar.f4750bl;
        this.f4708q = iVar.f4746bh;
        this.f4709r = i2;
    }

    /* renamed from: a */
    public final int mo4654a() {
        return this.f4700i == 1 ? this.f4695d - this.f4699h.f4720aW : this.f4695d;
    }

    /* renamed from: b */
    public final int mo4655b() {
        return this.f4700i == 0 ? this.f4694c - this.f4699h.f4719aV : this.f4694c;
    }

    /* renamed from: c */
    public final void mo4656c(C1638f fVar) {
        int i = 0;
        if (this.f4700i == 0) {
            int d = this.f4699h.mo4662d(fVar, this.f4709r);
            if (fVar.f4605Y[0] == C1637e.MATCH_CONSTRAINT) {
                this.f4698g++;
                d = 0;
            }
            C1641i iVar = this.f4699h;
            int i2 = iVar.f4719aV;
            if (fVar.f4637aq != 8) {
                i = i2;
            }
            this.f4694c += d + i;
            int a = iVar.mo4661a(fVar, this.f4709r);
            if (this.f4692a == null || this.f4693b < a) {
                this.f4692a = fVar;
                this.f4693b = a;
                this.f4695d = a;
            }
        } else {
            int d2 = this.f4699h.mo4662d(fVar, this.f4709r);
            int a2 = this.f4699h.mo4661a(fVar, this.f4709r);
            if (fVar.f4605Y[1] == C1637e.MATCH_CONSTRAINT) {
                this.f4698g++;
                a2 = 0;
            }
            int i3 = this.f4699h.f4720aW;
            if (fVar.f4637aq != 8) {
                i = i3;
            }
            this.f4695d += a2 + i;
            if (this.f4692a == null || this.f4693b < d2) {
                this.f4692a = fVar;
                this.f4693b = d2;
                this.f4694c = d2;
            }
        }
        this.f4697f++;
    }

    /* renamed from: e */
    public final void mo4658e(int i) {
        int i2 = this.f4698g;
        if (i2 != 0) {
            int i3 = this.f4697f;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.f4696e + i5;
                C1641i iVar = this.f4699h;
                if (i6 >= iVar.f4728bd) {
                    break;
                }
                C1638f fVar = iVar.f4727bc[i6];
                if (this.f4700i == 0) {
                    if (fVar != null && fVar.f4605Y[0] == C1637e.MATCH_CONSTRAINT && fVar.f4664t == 0) {
                        this.f4699h.mo4670V(fVar, C1637e.FIXED, i4, fVar.f4605Y[1], fVar.mo4630h());
                    }
                } else if (fVar != null && fVar.f4605Y[1] == C1637e.MATCH_CONSTRAINT && fVar.f4665u == 0) {
                    this.f4699h.mo4670V(fVar, fVar.f4605Y[0], fVar.mo4631i(), C1637e.FIXED, i4);
                }
            }
            this.f4694c = 0;
            this.f4695d = 0;
            this.f4692a = null;
            this.f4693b = 0;
            int i7 = this.f4697f;
            int i8 = 0;
            while (i8 < i7) {
                int i9 = this.f4696e + i8;
                C1641i iVar2 = this.f4699h;
                if (i9 < iVar2.f4728bd) {
                    C1638f fVar2 = iVar2.f4727bc[i9];
                    if (this.f4700i == 0) {
                        int i10 = fVar2.mo4631i();
                        C1641i iVar3 = this.f4699h;
                        int i11 = iVar3.f4719aV;
                        if (fVar2.f4637aq == 8) {
                            i11 = 0;
                        }
                        this.f4694c += i10 + i11;
                        int a = iVar3.mo4661a(fVar2, this.f4709r);
                        if (this.f4692a == null || this.f4693b < a) {
                            this.f4692a = fVar2;
                            this.f4693b = a;
                            this.f4695d = a;
                        }
                    } else {
                        int d = iVar2.mo4662d(fVar2, this.f4709r);
                        int a2 = this.f4699h.mo4661a(fVar2, this.f4709r);
                        int i12 = this.f4699h.f4720aW;
                        if (fVar2.f4637aq == 8) {
                            i12 = 0;
                        }
                        this.f4695d += a2 + i12;
                        if (this.f4692a == null || this.f4693b < d) {
                            this.f4692a = fVar2;
                            this.f4693b = d;
                            this.f4694c = d;
                        }
                    }
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo4659f(int i, C1636d dVar, C1636d dVar2, C1636d dVar3, C1636d dVar4, int i2, int i3, int i4, int i5, int i6) {
        this.f4700i = i;
        this.f4701j = dVar;
        this.f4702k = dVar2;
        this.f4703l = dVar3;
        this.f4704m = dVar4;
        this.f4705n = i2;
        this.f4706o = i3;
        this.f4707p = i4;
        this.f4708q = i5;
        this.f4709r = i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x010e, code lost:
        if (r17 != false) goto L_0x00ff;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4657d(boolean r17, int r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f4697f
            r2 = 0
            r3 = 0
        L_0x0006:
            if (r3 >= r1) goto L_0x001e
            int r4 = r0.f4696e
            int r4 = r4 + r3
            androidx.constraintlayout.a.b.i r5 = r0.f4699h
            int r6 = r5.f4728bd
            if (r4 < r6) goto L_0x0012
            goto L_0x001e
        L_0x0012:
            androidx.constraintlayout.a.b.f[] r5 = r5.f4727bc
            r4 = r5[r4]
            if (r4 == 0) goto L_0x001b
            r4.mo4642t()
        L_0x001b:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x001e:
            if (r1 == 0) goto L_0x02f6
            androidx.constraintlayout.a.b.f r3 = r0.f4692a
            if (r3 != 0) goto L_0x0026
            goto L_0x02f6
        L_0x0026:
            if (r19 == 0) goto L_0x002d
            if (r18 != 0) goto L_0x002d
            r4 = 0
            r5 = 1
            goto L_0x0030
        L_0x002d:
            r4 = r18
            r5 = 0
        L_0x0030:
            r6 = -1
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x0034:
            if (r7 >= r1) goto L_0x0058
            if (r17 == 0) goto L_0x003c
            int r10 = r1 + -1
            int r10 = r10 - r7
            goto L_0x003d
        L_0x003c:
            r10 = r7
        L_0x003d:
            int r11 = r0.f4696e
            int r11 = r11 + r10
            androidx.constraintlayout.a.b.i r10 = r0.f4699h
            int r12 = r10.f4728bd
            if (r11 < r12) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            androidx.constraintlayout.a.b.f[] r10 = r10.f4727bc
            r10 = r10[r11]
            if (r10 == 0) goto L_0x0055
            int r10 = r10.f4637aq
            if (r10 != 0) goto L_0x0055
            if (r9 != r6) goto L_0x0054
            r9 = r7
        L_0x0054:
            r8 = r7
        L_0x0055:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0058:
            int r7 = r0.f4700i
            r10 = 0
            if (r7 != 0) goto L_0x01ac
            androidx.constraintlayout.a.b.f r7 = r0.f4692a
            androidx.constraintlayout.a.b.i r11 = r0.f4699h
            int r12 = r11.f4724b
            r7.f4611aD = r12
            int r12 = r0.f4706o
            if (r4 <= 0) goto L_0x006c
            int r11 = r11.f4720aW
            int r12 = r12 + r11
        L_0x006c:
            androidx.constraintlayout.a.b.d r11 = r7.f4595O
            androidx.constraintlayout.a.b.d r13 = r0.f4702k
            r11.mo4611l(r13, r12)
            if (r19 == 0) goto L_0x007e
            androidx.constraintlayout.a.b.d r11 = r7.f4597Q
            androidx.constraintlayout.a.b.d r12 = r0.f4704m
            int r13 = r0.f4708q
            r11.mo4611l(r12, r13)
        L_0x007e:
            if (r4 <= 0) goto L_0x008b
            androidx.constraintlayout.a.b.d r4 = r0.f4702k
            androidx.constraintlayout.a.b.f r4 = r4.f4570d
            androidx.constraintlayout.a.b.d r4 = r4.f4597Q
            androidx.constraintlayout.a.b.d r11 = r7.f4595O
            r4.mo4611l(r11, r2)
        L_0x008b:
            androidx.constraintlayout.a.b.i r4 = r0.f4699h
            int r4 = r4.f4722aY
            r11 = 3
            if (r4 != r11) goto L_0x00b6
            boolean r4 = r7.f4589I
            if (r4 != 0) goto L_0x00b6
            r4 = 0
        L_0x0097:
            if (r4 >= r1) goto L_0x00b6
            if (r17 == 0) goto L_0x009f
            int r12 = r1 + -1
            int r12 = r12 - r4
            goto L_0x00a0
        L_0x009f:
            r12 = r4
        L_0x00a0:
            int r13 = r0.f4696e
            int r13 = r13 + r12
            androidx.constraintlayout.a.b.i r12 = r0.f4699h
            int r14 = r12.f4728bd
            if (r13 < r14) goto L_0x00aa
            goto L_0x00b6
        L_0x00aa:
            androidx.constraintlayout.a.b.f[] r12 = r12.f4727bc
            r12 = r12[r13]
            boolean r13 = r12.f4589I
            if (r13 == 0) goto L_0x00b3
            goto L_0x00b7
        L_0x00b3:
            int r4 = r4 + 1
            goto L_0x0097
        L_0x00b6:
            r12 = r7
        L_0x00b7:
            r4 = 0
        L_0x00b8:
            if (r4 >= r1) goto L_0x02f6
            if (r17 == 0) goto L_0x00c0
            int r13 = r1 + -1
            int r13 = r13 - r4
            goto L_0x00c1
        L_0x00c0:
            r13 = r4
        L_0x00c1:
            int r14 = r0.f4696e
            int r14 = r14 + r13
            androidx.constraintlayout.a.b.i r15 = r0.f4699h
            int r11 = r15.f4728bd
            if (r14 < r11) goto L_0x00cc
            goto L_0x02f6
        L_0x00cc:
            androidx.constraintlayout.a.b.f[] r11 = r15.f4727bc
            r11 = r11[r14]
            if (r11 != 0) goto L_0x00d6
            r2 = 1
            r3 = 3
            goto L_0x01a7
        L_0x00d6:
            if (r4 != 0) goto L_0x00e2
            androidx.constraintlayout.a.b.d r4 = r11.f4594N
            androidx.constraintlayout.a.b.d r14 = r0.f4701j
            int r15 = r0.f4705n
            r11.mo4638p(r4, r14, r15)
            r4 = 0
        L_0x00e2:
            if (r13 != 0) goto L_0x0115
            androidx.constraintlayout.a.b.i r13 = r0.f4699h
            int r14 = r13.f4710a
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r17 == 0) goto L_0x00f1
            float r3 = r13.f4713aP
            float r3 = r15 - r3
            goto L_0x00f3
        L_0x00f1:
            float r3 = r13.f4713aP
        L_0x00f3:
            int r2 = r0.f4696e
            if (r2 != 0) goto L_0x0106
            int r2 = r13.f4733c
            if (r2 == r6) goto L_0x0106
            if (r17 == 0) goto L_0x0102
            float r3 = r13.f4715aR
        L_0x00ff:
            float r15 = r15 - r3
            r3 = r15
            goto L_0x0104
        L_0x0102:
            float r3 = r13.f4715aR
        L_0x0104:
            r14 = r2
            goto L_0x0111
        L_0x0106:
            if (r19 == 0) goto L_0x0111
            int r2 = r13.f4711aN
            if (r2 == r6) goto L_0x0111
            float r3 = r13.f4717aT
            if (r17 == 0) goto L_0x0104
            goto L_0x00ff
        L_0x0111:
            r11.f4610aC = r14
            r11.f4634an = r3
        L_0x0115:
            int r2 = r1 + -1
            if (r4 != r2) goto L_0x0122
            androidx.constraintlayout.a.b.d r2 = r11.f4596P
            androidx.constraintlayout.a.b.d r3 = r0.f4703l
            int r13 = r0.f4707p
            r11.mo4638p(r2, r3, r13)
        L_0x0122:
            if (r10 == 0) goto L_0x014c
            androidx.constraintlayout.a.b.d r2 = r11.f4594N
            androidx.constraintlayout.a.b.d r3 = r10.f4596P
            androidx.constraintlayout.a.b.i r13 = r0.f4699h
            int r13 = r13.f4719aV
            r2.mo4611l(r3, r13)
            if (r4 != r9) goto L_0x0138
            androidx.constraintlayout.a.b.d r2 = r11.f4594N
            int r3 = r0.f4705n
            r2.mo4606g(r3)
        L_0x0138:
            androidx.constraintlayout.a.b.d r2 = r10.f4596P
            androidx.constraintlayout.a.b.d r3 = r11.f4594N
            r13 = 0
            r2.mo4611l(r3, r13)
            r2 = 1
            int r3 = r8 + 1
            if (r4 != r3) goto L_0x014c
            androidx.constraintlayout.a.b.d r2 = r10.f4596P
            int r3 = r0.f4707p
            r2.mo4606g(r3)
        L_0x014c:
            if (r11 == r7) goto L_0x01a4
            androidx.constraintlayout.a.b.i r2 = r0.f4699h
            int r2 = r2.f4722aY
            r3 = 3
            if (r2 != r3) goto L_0x0168
            boolean r2 = r12.f4589I
            if (r2 == 0) goto L_0x016d
            if (r11 == r12) goto L_0x016d
            boolean r2 = r11.f4589I
            if (r2 == 0) goto L_0x016d
            androidx.constraintlayout.a.b.d r2 = r11.f4598R
            androidx.constraintlayout.a.b.d r10 = r12.f4598R
            r13 = 0
            r2.mo4611l(r10, r13)
            goto L_0x01a5
        L_0x0168:
            if (r2 == 0) goto L_0x019b
            r10 = 1
            if (r2 == r10) goto L_0x0192
        L_0x016d:
            if (r5 == 0) goto L_0x0182
            androidx.constraintlayout.a.b.d r2 = r11.f4595O
            androidx.constraintlayout.a.b.d r10 = r0.f4702k
            int r13 = r0.f4706o
            r2.mo4611l(r10, r13)
            androidx.constraintlayout.a.b.d r2 = r11.f4597Q
            androidx.constraintlayout.a.b.d r10 = r0.f4704m
            int r13 = r0.f4708q
            r2.mo4611l(r10, r13)
            goto L_0x01a5
        L_0x0182:
            androidx.constraintlayout.a.b.d r2 = r11.f4595O
            androidx.constraintlayout.a.b.d r10 = r7.f4595O
            r13 = 0
            r2.mo4611l(r10, r13)
            androidx.constraintlayout.a.b.d r2 = r11.f4597Q
            androidx.constraintlayout.a.b.d r10 = r7.f4597Q
            r2.mo4611l(r10, r13)
            goto L_0x01a5
        L_0x0192:
            r13 = 0
            androidx.constraintlayout.a.b.d r2 = r11.f4597Q
            androidx.constraintlayout.a.b.d r10 = r7.f4597Q
            r2.mo4611l(r10, r13)
            goto L_0x01a5
        L_0x019b:
            r13 = 0
            androidx.constraintlayout.a.b.d r2 = r11.f4595O
            androidx.constraintlayout.a.b.d r10 = r7.f4595O
            r2.mo4611l(r10, r13)
            goto L_0x01a5
        L_0x01a4:
            r3 = 3
        L_0x01a5:
            r10 = r11
            r2 = 1
        L_0x01a7:
            int r4 = r4 + r2
            r2 = 0
            r11 = 3
            goto L_0x00b8
        L_0x01ac:
            androidx.constraintlayout.a.b.f r2 = r0.f4692a
            androidx.constraintlayout.a.b.i r3 = r0.f4699h
            int r7 = r3.f4710a
            r2.f4610aC = r7
            int r7 = r0.f4705n
            if (r4 <= 0) goto L_0x01bb
            int r3 = r3.f4719aV
            int r7 = r7 + r3
        L_0x01bb:
            if (r17 == 0) goto L_0x01de
            androidx.constraintlayout.a.b.d r3 = r2.f4596P
            androidx.constraintlayout.a.b.d r11 = r0.f4703l
            r3.mo4611l(r11, r7)
            if (r19 == 0) goto L_0x01cf
            androidx.constraintlayout.a.b.d r3 = r2.f4594N
            androidx.constraintlayout.a.b.d r7 = r0.f4701j
            int r11 = r0.f4707p
            r3.mo4611l(r7, r11)
        L_0x01cf:
            if (r4 <= 0) goto L_0x01fe
            androidx.constraintlayout.a.b.d r3 = r0.f4703l
            androidx.constraintlayout.a.b.f r3 = r3.f4570d
            androidx.constraintlayout.a.b.d r3 = r3.f4594N
            androidx.constraintlayout.a.b.d r4 = r2.f4596P
            r7 = 0
            r3.mo4611l(r4, r7)
            goto L_0x01fe
        L_0x01de:
            androidx.constraintlayout.a.b.d r3 = r2.f4594N
            androidx.constraintlayout.a.b.d r11 = r0.f4701j
            r3.mo4611l(r11, r7)
            if (r19 == 0) goto L_0x01f0
            androidx.constraintlayout.a.b.d r3 = r2.f4596P
            androidx.constraintlayout.a.b.d r7 = r0.f4703l
            int r11 = r0.f4707p
            r3.mo4611l(r7, r11)
        L_0x01f0:
            if (r4 <= 0) goto L_0x01fe
            androidx.constraintlayout.a.b.d r3 = r0.f4701j
            androidx.constraintlayout.a.b.f r3 = r3.f4570d
            androidx.constraintlayout.a.b.d r3 = r3.f4596P
            androidx.constraintlayout.a.b.d r4 = r2.f4594N
            r7 = 0
            r3.mo4611l(r4, r7)
        L_0x01fe:
            r3 = 0
        L_0x01ff:
            if (r3 >= r1) goto L_0x02f6
            int r4 = r0.f4696e
            int r4 = r4 + r3
            androidx.constraintlayout.a.b.i r7 = r0.f4699h
            int r11 = r7.f4728bd
            if (r4 >= r11) goto L_0x02f6
            androidx.constraintlayout.a.b.f[] r7 = r7.f4727bc
            r4 = r7[r4]
            if (r4 != 0) goto L_0x0215
            r4 = r10
            r7 = 1
            r10 = 0
            goto L_0x02f2
        L_0x0215:
            if (r3 != 0) goto L_0x0241
            androidx.constraintlayout.a.b.d r3 = r4.f4595O
            androidx.constraintlayout.a.b.d r7 = r0.f4702k
            int r11 = r0.f4706o
            r4.mo4638p(r3, r7, r11)
            androidx.constraintlayout.a.b.i r3 = r0.f4699h
            int r7 = r3.f4724b
            float r11 = r3.f4714aQ
            int r12 = r0.f4696e
            if (r12 != 0) goto L_0x0232
            int r12 = r3.f4734d
            if (r12 == r6) goto L_0x0232
            float r11 = r3.f4716aS
        L_0x0230:
            r7 = r12
            goto L_0x023b
        L_0x0232:
            if (r19 == 0) goto L_0x023b
            int r12 = r3.f4712aO
            if (r12 == r6) goto L_0x023b
            float r11 = r3.f4718aU
            goto L_0x0230
        L_0x023b:
            r4.f4611aD = r7
            r4.f4635ao = r11
            r13 = 0
            goto L_0x0242
        L_0x0241:
            r13 = r3
        L_0x0242:
            int r3 = r1 + -1
            if (r13 != r3) goto L_0x024f
            androidx.constraintlayout.a.b.d r3 = r4.f4597Q
            androidx.constraintlayout.a.b.d r7 = r0.f4704m
            int r11 = r0.f4708q
            r4.mo4638p(r3, r7, r11)
        L_0x024f:
            if (r10 == 0) goto L_0x0279
            androidx.constraintlayout.a.b.d r3 = r4.f4595O
            androidx.constraintlayout.a.b.d r7 = r10.f4597Q
            androidx.constraintlayout.a.b.i r11 = r0.f4699h
            int r11 = r11.f4720aW
            r3.mo4611l(r7, r11)
            if (r13 != r9) goto L_0x0265
            androidx.constraintlayout.a.b.d r3 = r4.f4595O
            int r7 = r0.f4706o
            r3.mo4606g(r7)
        L_0x0265:
            androidx.constraintlayout.a.b.d r3 = r10.f4597Q
            androidx.constraintlayout.a.b.d r7 = r4.f4595O
            r11 = 0
            r3.mo4611l(r7, r11)
            r3 = 1
            int r7 = r8 + 1
            if (r13 != r7) goto L_0x0279
            androidx.constraintlayout.a.b.d r3 = r10.f4597Q
            int r7 = r0.f4708q
            r3.mo4606g(r7)
        L_0x0279:
            if (r4 == r2) goto L_0x02ef
            r3 = 2
            if (r17 == 0) goto L_0x02ac
            androidx.constraintlayout.a.b.i r7 = r0.f4699h
            int r7 = r7.f4721aX
            if (r7 == 0) goto L_0x02a3
            r10 = 1
            if (r7 == r10) goto L_0x029a
            if (r7 == r3) goto L_0x028a
            goto L_0x02ef
        L_0x028a:
            androidx.constraintlayout.a.b.d r3 = r4.f4594N
            androidx.constraintlayout.a.b.d r7 = r2.f4594N
            r10 = 0
            r3.mo4611l(r7, r10)
            androidx.constraintlayout.a.b.d r3 = r4.f4596P
            androidx.constraintlayout.a.b.d r7 = r2.f4596P
            r3.mo4611l(r7, r10)
            goto L_0x02f0
        L_0x029a:
            r10 = 0
            androidx.constraintlayout.a.b.d r3 = r4.f4594N
            androidx.constraintlayout.a.b.d r7 = r2.f4594N
            r3.mo4611l(r7, r10)
            goto L_0x02f0
        L_0x02a3:
            r10 = 0
            androidx.constraintlayout.a.b.d r3 = r4.f4596P
            androidx.constraintlayout.a.b.d r7 = r2.f4596P
            r3.mo4611l(r7, r10)
            goto L_0x02f0
        L_0x02ac:
            androidx.constraintlayout.a.b.i r7 = r0.f4699h
            int r7 = r7.f4721aX
            if (r7 == 0) goto L_0x02e6
            r10 = 1
            if (r7 == r10) goto L_0x02dd
            if (r7 == r3) goto L_0x02b8
            goto L_0x02ef
        L_0x02b8:
            if (r5 == 0) goto L_0x02cd
            androidx.constraintlayout.a.b.d r3 = r4.f4594N
            androidx.constraintlayout.a.b.d r7 = r0.f4701j
            int r10 = r0.f4705n
            r3.mo4611l(r7, r10)
            androidx.constraintlayout.a.b.d r3 = r4.f4596P
            androidx.constraintlayout.a.b.d r7 = r0.f4703l
            int r10 = r0.f4707p
            r3.mo4611l(r7, r10)
            goto L_0x02ef
        L_0x02cd:
            androidx.constraintlayout.a.b.d r3 = r4.f4594N
            androidx.constraintlayout.a.b.d r7 = r2.f4594N
            r10 = 0
            r3.mo4611l(r7, r10)
            androidx.constraintlayout.a.b.d r3 = r4.f4596P
            androidx.constraintlayout.a.b.d r7 = r2.f4596P
            r3.mo4611l(r7, r10)
            goto L_0x02f0
        L_0x02dd:
            r10 = 0
            androidx.constraintlayout.a.b.d r3 = r4.f4596P
            androidx.constraintlayout.a.b.d r7 = r2.f4596P
            r3.mo4611l(r7, r10)
            goto L_0x02f0
        L_0x02e6:
            r10 = 0
            androidx.constraintlayout.a.b.d r3 = r4.f4594N
            androidx.constraintlayout.a.b.d r7 = r2.f4594N
            r3.mo4611l(r7, r10)
            goto L_0x02f0
        L_0x02ef:
            r10 = 0
        L_0x02f0:
            r3 = r13
            r7 = 1
        L_0x02f2:
            int r3 = r3 + r7
            r10 = r4
            goto L_0x01ff
        L_0x02f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.C1640h.mo4657d(boolean, int, boolean):void");
    }
}

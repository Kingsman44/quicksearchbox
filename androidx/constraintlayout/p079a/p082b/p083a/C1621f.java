package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1636d;
import androidx.constraintlayout.p079a.p082b.C1637e;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1639g;
import androidx.constraintlayout.p079a.p082b.C1642j;
import androidx.constraintlayout.p079a.p082b.C1643k;
import androidx.constraintlayout.widget.C1746e;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.a.b.a.f */
/* compiled from: PG */
public final class C1621f {

    /* renamed from: a */
    public final C1639g f4501a;

    /* renamed from: b */
    public boolean f4502b = true;

    /* renamed from: c */
    public boolean f4503c = true;

    /* renamed from: d */
    public final C1639g f4504d;

    /* renamed from: e */
    public final ArrayList f4505e = new ArrayList();

    /* renamed from: f */
    final ArrayList f4506f;

    /* renamed from: g */
    public C1746e f4507g;

    /* renamed from: h */
    private final C1617b f4508h;

    public C1621f(C1639g gVar) {
        new ArrayList();
        this.f4507g = null;
        this.f4508h = new C1617b();
        this.f4506f = new ArrayList();
        this.f4501a = gVar;
        this.f4504d = gVar;
    }

    /* renamed from: f */
    private final void m4322f(C1633r rVar, int i, ArrayList arrayList) {
        for (C1620e eVar : rVar.f4544j.f4518j) {
            if (eVar instanceof C1622g) {
                m4324h((C1622g) eVar, i, rVar.f4545k, arrayList, (C1629n) null);
            } else if (eVar instanceof C1633r) {
                m4324h(((C1633r) eVar).f4544j, i, rVar.f4545k, arrayList, (C1629n) null);
            }
        }
        for (C1620e eVar2 : rVar.f4545k.f4518j) {
            if (eVar2 instanceof C1622g) {
                m4324h((C1622g) eVar2, i, rVar.f4544j, arrayList, (C1629n) null);
            } else if (eVar2 instanceof C1633r) {
                m4324h(((C1633r) eVar2).f4545k, i, rVar.f4544j, arrayList, (C1629n) null);
            }
        }
        if (i == 1) {
            for (C1620e eVar3 : ((C1630o) rVar).f4529a.f4518j) {
                if (eVar3 instanceof C1622g) {
                    m4324h((C1622g) eVar3, 1, (C1622g) null, arrayList, (C1629n) null);
                }
            }
        }
    }

    /* renamed from: g */
    private final void m4323g(C1638f fVar, C1637e eVar, int i, C1637e eVar2, int i2) {
        C1617b bVar = this.f4508h;
        bVar.f4486a = eVar;
        bVar.f4487b = eVar2;
        bVar.f4488c = i;
        bVar.f4489d = i2;
        this.f4507g.mo4865a(fVar, bVar);
        fVar.mo4618D(this.f4508h.f4490e);
        fVar.mo4648z(this.f4508h.f4491f);
        C1617b bVar2 = this.f4508h;
        fVar.f4589I = bVar2.f4493h;
        fVar.mo4645w(bVar2.f4492g);
    }

    /* renamed from: h */
    private final void m4324h(C1622g gVar, int i, C1622g gVar2, ArrayList arrayList, C1629n nVar) {
        C1633r rVar = gVar.f4512d;
        if (rVar.f4539e == null) {
            C1639g gVar3 = this.f4501a;
            if (rVar != gVar3.f4652h && rVar != gVar3.f4653i) {
                if (nVar == null) {
                    nVar = new C1629n(rVar);
                    arrayList.add(nVar);
                }
                rVar.f4539e = nVar;
                nVar.f4528c.add(rVar);
                for (C1620e eVar : rVar.f4544j.f4518j) {
                    if (eVar instanceof C1622g) {
                        m4324h((C1622g) eVar, i, gVar2, arrayList, nVar);
                    }
                }
                for (C1620e eVar2 : rVar.f4545k.f4518j) {
                    if (eVar2 instanceof C1622g) {
                        m4324h((C1622g) eVar2, i, gVar2, arrayList, nVar);
                    }
                }
                if (i == 1 && (rVar instanceof C1630o)) {
                    for (C1620e eVar3 : ((C1630o) rVar).f4529a.f4518j) {
                        if (eVar3 instanceof C1622g) {
                            m4324h((C1622g) eVar3, 1, gVar2, arrayList, nVar);
                        }
                    }
                }
                for (C1622g h : rVar.f4544j.f4519k) {
                    m4324h(h, i, gVar2, arrayList, nVar);
                }
                for (C1622g h2 : rVar.f4545k.f4519k) {
                    m4324h(h2, i, gVar2, arrayList, nVar);
                }
                if (i == 1 && (rVar instanceof C1630o)) {
                    for (C1622g h3 : ((C1630o) rVar).f4529a.f4519k) {
                        m4324h(h3, 1, gVar2, arrayList, nVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo4577a(C1639g gVar, int i) {
        long j;
        C1621f fVar = this;
        C1639g gVar2 = gVar;
        int i2 = i;
        int size = fVar.f4506f.size();
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        while (i3 < size) {
            C1629n nVar = (C1629n) fVar.f4506f.get(i3);
            C1633r rVar = nVar.f4527b;
            if (!(rVar instanceof C1619d) ? i2 != 0 ? (rVar instanceof C1630o) : (rVar instanceof C1628m) : ((C1619d) rVar).f4542h == i2) {
                C1622g gVar3 = i2 == 0 ? gVar2.f4652h.f4544j : gVar2.f4653i.f4544j;
                C1622g gVar4 = i2 == 0 ? gVar2.f4652h.f4545k : gVar2.f4653i.f4545k;
                boolean contains = rVar.f4544j.f4519k.contains(gVar3);
                boolean contains2 = nVar.f4527b.f4545k.f4519k.contains(gVar4);
                long a = nVar.f4527b.mo4570a();
                if (contains && contains2) {
                    long b = nVar.mo4589b(nVar.f4527b.f4544j, j2);
                    long a2 = nVar.mo4588a(nVar.f4527b.f4545k, j2);
                    long j4 = b - a;
                    C1633r rVar2 = nVar.f4527b;
                    int i4 = rVar2.f4545k.f4513e;
                    if (j4 >= ((long) (-i4))) {
                        j4 += (long) i4;
                    }
                    long j5 = (long) rVar2.f4544j.f4513e;
                    long j6 = ((-a2) - a) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    C1638f fVar2 = rVar2.f4538d;
                    float f = i2 == 0 ? fVar2.f4634an : fVar2.f4635ao;
                    float f2 = (float) (f > 0.0f ? (long) ((((float) j6) / f) + (((float) j4) / (1.0f - f))) : 0);
                    j = (j5 + ((((long) ((f2 * f) + 0.5f)) + a) + ((long) ((f2 * (1.0f - f)) + 0.5f)))) - ((long) i4);
                } else if (contains) {
                    C1622g gVar5 = nVar.f4527b.f4544j;
                    j = Math.max(nVar.mo4589b(gVar5, (long) gVar5.f4513e), ((long) nVar.f4527b.f4544j.f4513e) + a);
                } else if (contains2) {
                    C1622g gVar6 = nVar.f4527b.f4545k;
                    j = Math.max(-nVar.mo4588a(gVar6, (long) gVar6.f4513e), ((long) (-nVar.f4527b.f4545k.f4513e)) + a);
                } else {
                    C1633r rVar3 = nVar.f4527b;
                    j = (((long) rVar3.f4544j.f4513e) + rVar3.mo4570a()) - ((long) nVar.f4527b.f4545k.f4513e);
                }
            } else {
                j = j2;
            }
            j3 = Math.max(j3, j);
            i3++;
            fVar = this;
            gVar2 = gVar;
            j2 = 0;
        }
        return (int) j3;
    }

    /* renamed from: b */
    public final void mo4578b() {
        ArrayList arrayList = this.f4505e;
        arrayList.clear();
        this.f4504d.f4652h.mo4573d();
        this.f4504d.f4653i.mo4573d();
        arrayList.add(this.f4504d.f4652h);
        arrayList.add(this.f4504d.f4653i);
        ArrayList arrayList2 = this.f4504d.f4756be;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            C1638f fVar = (C1638f) arrayList2.get(i);
            if (fVar instanceof C1642j) {
                arrayList.add(new C1626k(fVar));
            } else {
                if (fVar.mo4623I()) {
                    if (fVar.f4650f == null) {
                        fVar.f4650f = new C1619d(fVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(fVar.f4650f);
                } else {
                    arrayList.add(fVar.f4652h);
                }
                if (fVar.mo4624J()) {
                    if (fVar.f4651g == null) {
                        fVar.f4651g = new C1619d(fVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(fVar.f4651g);
                } else {
                    arrayList.add(fVar.f4653i);
                }
                if (fVar instanceof C1643k) {
                    arrayList.add(new C1627l(fVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C1633r) arrayList.get(i2)).mo4573d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C1633r rVar = (C1633r) arrayList.get(i3);
            if (rVar.f4538d != this.f4504d) {
                rVar.mo4571b();
            }
        }
        this.f4506f.clear();
        C1629n.f4526a = 0;
        m4322f(this.f4501a.f4652h, 0, this.f4506f);
        m4322f(this.f4501a.f4653i, 1, this.f4506f);
        this.f4502b = false;
    }

    /* renamed from: c */
    public final void mo4579c() {
        C1623h hVar;
        ArrayList arrayList = this.f4501a.f4756be;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1638f fVar = (C1638f) arrayList.get(i);
            if (!fVar.f4649e) {
                C1637e[] eVarArr = fVar.f4605Y;
                C1637e eVar = eVarArr[0];
                C1637e eVar2 = eVarArr[1];
                int i2 = fVar.f4664t;
                int i3 = fVar.f4665u;
                boolean z = eVar == C1637e.WRAP_CONTENT || (eVar == C1637e.MATCH_CONSTRAINT && i2 == 1);
                C1637e eVar3 = C1637e.WRAP_CONTENT;
                boolean z2 = eVar2 == eVar3 || (eVar2 == C1637e.MATCH_CONSTRAINT && i3 == 1);
                C1623h hVar2 = fVar.f4652h.f4541g;
                boolean z3 = hVar2.f4517i;
                C1623h hVar3 = fVar.f4653i.f4541g;
                boolean z4 = hVar3.f4517i;
                if (z3 && z4) {
                    C1637e eVar4 = C1637e.FIXED;
                    m4323g(fVar, eVar4, hVar2.f4514f, eVar4, hVar3.f4514f);
                    fVar.f4649e = true;
                } else if (z3 && z2) {
                    m4323g(fVar, C1637e.FIXED, hVar2.f4514f, eVar3, hVar3.f4514f);
                    if (eVar2 == C1637e.MATCH_CONSTRAINT) {
                        fVar.f4653i.f4541g.f4521m = fVar.mo4630h();
                    } else {
                        fVar.f4653i.f4541g.mo4584c(fVar.mo4630h());
                        fVar.f4649e = true;
                    }
                } else if (z4 && z) {
                    m4323g(fVar, eVar3, hVar2.f4514f, C1637e.FIXED, hVar3.f4514f);
                    if (eVar == C1637e.MATCH_CONSTRAINT) {
                        fVar.f4652h.f4541g.f4521m = fVar.mo4631i();
                    } else {
                        fVar.f4652h.f4541g.mo4584c(fVar.mo4631i());
                        fVar.f4649e = true;
                    }
                }
                if (fVar.f4649e && (hVar = fVar.f4653i.f4530b) != null) {
                    hVar.mo4584c(fVar.f4631ak);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0143 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4580d(boolean r11, int r12) {
        /*
            r10 = this;
            androidx.constraintlayout.a.b.g r0 = r10.f4501a
            androidx.constraintlayout.a.b.e[] r1 = r0.f4605Y
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r1 = r1[r4]
            int r0 = r0.mo4632j()
            androidx.constraintlayout.a.b.g r5 = r10.f4501a
            int r5 = r5.mo4633k()
            if (r11 == 0) goto L_0x0084
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r3 == r11) goto L_0x001e
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r1 != r11) goto L_0x0084
        L_0x001e:
            java.util.ArrayList r11 = r10.f4505e
            int r6 = r11.size()
            r7 = 0
        L_0x0025:
            if (r7 >= r6) goto L_0x003c
            java.lang.Object r8 = r11.get(r7)
            androidx.constraintlayout.a.b.a.r r8 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r8
            int r9 = r8.f4542h
            if (r9 != r12) goto L_0x0039
            boolean r8 = r8.mo4574e()
            if (r8 != 0) goto L_0x0039
            r11 = 0
            goto L_0x003d
        L_0x0039:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x003c:
            r11 = 1
        L_0x003d:
            if (r12 != 0) goto L_0x0062
            if (r11 == 0) goto L_0x0084
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r3 != r11) goto L_0x0084
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.e r6 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            androidx.constraintlayout.a.b.e[] r7 = r11.f4605Y
            r7[r2] = r6
            int r6 = r10.mo4577a(r11, r2)
            r11.mo4618D(r6)
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.a.m r6 = r11.f4652h
            androidx.constraintlayout.a.b.a.h r6 = r6.f4541g
            int r11 = r11.mo4631i()
            r6.mo4584c(r11)
            goto L_0x0084
        L_0x0062:
            if (r11 == 0) goto L_0x0084
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r1 != r11) goto L_0x0084
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.e r6 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            androidx.constraintlayout.a.b.e[] r7 = r11.f4605Y
            r7[r4] = r6
            int r6 = r10.mo4577a(r11, r4)
            r11.mo4648z(r6)
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.a.o r6 = r11.f4653i
            androidx.constraintlayout.a.b.a.h r6 = r6.f4541g
            int r11 = r11.mo4630h()
            r6.mo4584c(r11)
        L_0x0084:
            if (r12 != 0) goto L_0x00b3
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.e[] r11 = r11.f4605Y
            r11 = r11[r2]
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r11 == r5) goto L_0x009a
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.e[] r11 = r11.f4605Y
            r11 = r11[r2]
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r11 != r5) goto L_0x00c8
        L_0x009a:
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            int r5 = r11.mo4631i()
            int r5 = r5 + r0
            androidx.constraintlayout.a.b.a.m r11 = r11.f4652h
            androidx.constraintlayout.a.b.a.g r11 = r11.f4545k
            r11.mo4584c(r5)
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.a.m r11 = r11.f4652h
            androidx.constraintlayout.a.b.a.h r11 = r11.f4541g
            int r5 = r5 - r0
            r11.mo4584c(r5)
            goto L_0x00e2
        L_0x00b3:
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.e[] r11 = r11.f4605Y
            r11 = r11[r4]
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r11 == r0) goto L_0x00ca
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.e[] r11 = r11.f4605Y
            r11 = r11[r4]
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r11 != r0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r11 = 0
            goto L_0x00e3
        L_0x00ca:
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            int r0 = r11.mo4630h()
            int r0 = r0 + r5
            androidx.constraintlayout.a.b.a.o r11 = r11.f4653i
            androidx.constraintlayout.a.b.a.g r11 = r11.f4545k
            r11.mo4584c(r0)
            androidx.constraintlayout.a.b.g r11 = r10.f4501a
            androidx.constraintlayout.a.b.a.o r11 = r11.f4653i
            androidx.constraintlayout.a.b.a.h r11 = r11.f4541g
            int r0 = r0 - r5
            r11.mo4584c(r0)
        L_0x00e2:
            r11 = 1
        L_0x00e3:
            r10.mo4579c()
            java.util.ArrayList r0 = r10.f4505e
            int r5 = r0.size()
            r6 = 0
        L_0x00ed:
            if (r6 >= r5) goto L_0x010a
            java.lang.Object r7 = r0.get(r6)
            androidx.constraintlayout.a.b.a.r r7 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r7
            int r8 = r7.f4542h
            if (r8 == r12) goto L_0x00fa
            goto L_0x0107
        L_0x00fa:
            androidx.constraintlayout.a.b.f r8 = r7.f4538d
            androidx.constraintlayout.a.b.g r9 = r10.f4501a
            if (r8 != r9) goto L_0x0104
            boolean r8 = r7.f4543i
            if (r8 == 0) goto L_0x0107
        L_0x0104:
            r7.mo4572c()
        L_0x0107:
            int r6 = r6 + 1
            goto L_0x00ed
        L_0x010a:
            java.util.ArrayList r0 = r10.f4505e
            int r5 = r0.size()
            r6 = 0
        L_0x0111:
            if (r6 >= r5) goto L_0x0143
            java.lang.Object r7 = r0.get(r6)
            androidx.constraintlayout.a.b.a.r r7 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r7
            int r8 = r7.f4542h
            if (r8 == r12) goto L_0x011e
            goto L_0x0140
        L_0x011e:
            if (r11 != 0) goto L_0x0126
            androidx.constraintlayout.a.b.f r8 = r7.f4538d
            androidx.constraintlayout.a.b.g r9 = r10.f4501a
            if (r8 == r9) goto L_0x0140
        L_0x0126:
            androidx.constraintlayout.a.b.a.g r8 = r7.f4544j
            boolean r8 = r8.f4517i
            if (r8 != 0) goto L_0x012e
        L_0x012c:
            r11 = 0
            goto L_0x0144
        L_0x012e:
            androidx.constraintlayout.a.b.a.g r8 = r7.f4545k
            boolean r8 = r8.f4517i
            if (r8 != 0) goto L_0x0135
            goto L_0x012c
        L_0x0135:
            boolean r8 = r7 instanceof androidx.constraintlayout.p079a.p082b.p083a.C1619d
            if (r8 != 0) goto L_0x0140
            androidx.constraintlayout.a.b.a.h r7 = r7.f4541g
            boolean r7 = r7.f4517i
            if (r7 != 0) goto L_0x0140
            goto L_0x012c
        L_0x0140:
            int r6 = r6 + 1
            goto L_0x0111
        L_0x0143:
            r11 = 1
        L_0x0144:
            androidx.constraintlayout.a.b.g r12 = r10.f4501a
            androidx.constraintlayout.a.b.e[] r12 = r12.f4605Y
            r12[r2] = r3
            r12[r4] = r1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.p083a.C1621f.mo4580d(boolean, int):boolean");
    }

    /* renamed from: e */
    public final void mo4581e(C1639g gVar) {
        C1637e eVar;
        C1637e eVar2;
        int i;
        int i2;
        C1639g gVar2 = gVar;
        ArrayList arrayList = gVar2.f4756be;
        int size = arrayList.size();
        char c = 0;
        int i3 = 0;
        while (i3 < size) {
            C1638f fVar = (C1638f) arrayList.get(i3);
            C1637e[] eVarArr = fVar.f4605Y;
            C1637e eVar3 = eVarArr[c];
            C1637e eVar4 = eVarArr[1];
            if (fVar.f4637aq == 8) {
                fVar.f4649e = true;
            } else {
                if (fVar.f4669y < 1.0f && eVar3 == C1637e.MATCH_CONSTRAINT) {
                    fVar.f4664t = 2;
                }
                if (fVar.f4582B < 1.0f && eVar4 == C1637e.MATCH_CONSTRAINT) {
                    fVar.f4665u = 2;
                }
                if (fVar.f4623ac > 0.0f) {
                    if (eVar3 == C1637e.MATCH_CONSTRAINT && (eVar4 == C1637e.WRAP_CONTENT || eVar4 == C1637e.FIXED)) {
                        fVar.f4664t = 3;
                    } else {
                        C1637e eVar5 = C1637e.MATCH_CONSTRAINT;
                        if (eVar4 == eVar5 && (eVar3 == C1637e.WRAP_CONTENT || eVar3 == C1637e.FIXED)) {
                            fVar.f4665u = 3;
                        } else if (eVar3 == eVar5 && eVar4 == eVar5) {
                            if (fVar.f4664t == 0) {
                                fVar.f4664t = 3;
                            }
                            if (fVar.f4665u == 0) {
                                fVar.f4665u = 3;
                            }
                        }
                    }
                }
                if (eVar3 == C1637e.MATCH_CONSTRAINT && fVar.f4664t == 1 && (fVar.f4594N.f4571e == null || fVar.f4596P.f4571e == null)) {
                    eVar3 = C1637e.WRAP_CONTENT;
                }
                C1637e eVar6 = eVar3;
                C1637e eVar7 = C1637e.MATCH_CONSTRAINT;
                if (eVar4 == eVar7 && fVar.f4665u == 1 && (fVar.f4595O.f4571e == null || fVar.f4597Q.f4571e == null)) {
                    eVar4 = C1637e.WRAP_CONTENT;
                }
                C1637e eVar8 = eVar4;
                C1628m mVar = fVar.f4652h;
                mVar.f4540f = eVar6;
                int i4 = fVar.f4664t;
                mVar.f4537c = i4;
                C1630o oVar = fVar.f4653i;
                oVar.f4540f = eVar8;
                int i5 = fVar.f4665u;
                oVar.f4537c = i5;
                C1637e eVar9 = C1637e.MATCH_PARENT;
                if ((eVar6 == eVar9 || eVar6 == C1637e.FIXED || eVar6 == C1637e.WRAP_CONTENT) && (eVar8 == eVar9 || eVar8 == C1637e.FIXED || eVar8 == C1637e.WRAP_CONTENT)) {
                    int i6 = fVar.mo4631i();
                    if (eVar6 == C1637e.MATCH_PARENT) {
                        i = (gVar.mo4631i() - fVar.f4594N.f4572f) - fVar.f4596P.f4572f;
                        eVar6 = C1637e.FIXED;
                    } else {
                        i = i6;
                    }
                    int h = fVar.mo4630h();
                    if (eVar8 == C1637e.MATCH_PARENT) {
                        i2 = (gVar.mo4630h() - fVar.f4595O.f4572f) - fVar.f4597Q.f4572f;
                        eVar8 = C1637e.FIXED;
                    } else {
                        i2 = h;
                    }
                    m4323g(fVar, eVar6, i, eVar8, i2);
                    fVar.f4652h.f4541g.mo4584c(fVar.mo4631i());
                    fVar.f4653i.f4541g.mo4584c(fVar.mo4630h());
                    fVar.f4649e = true;
                    i3++;
                    c = 0;
                } else {
                    if (eVar6 == eVar7 && (eVar8 == (eVar2 = C1637e.WRAP_CONTENT) || eVar8 == C1637e.FIXED)) {
                        if (i4 == 3) {
                            if (eVar8 == eVar2) {
                                m4323g(fVar, eVar2, 0, eVar2, 0);
                            }
                            int h2 = fVar.mo4630h();
                            float f = fVar.f4623ac;
                            C1637e eVar10 = C1637e.FIXED;
                            m4323g(fVar, eVar10, (int) ((((float) h2) * f) + 0.5f), eVar10, h2);
                            fVar.f4652h.f4541g.mo4584c(fVar.mo4631i());
                            fVar.f4653i.f4541g.mo4584c(fVar.mo4630h());
                            fVar.f4649e = true;
                        } else if (i4 == 1) {
                            m4323g(fVar, eVar2, 0, eVar8, 0);
                            fVar.f4652h.f4541g.f4521m = fVar.mo4631i();
                        } else if (i4 == 2) {
                            C1637e eVar11 = gVar2.f4605Y[0];
                            if (eVar11 == C1637e.FIXED || eVar11 == eVar9) {
                                float f2 = fVar.f4669y;
                                int i7 = gVar.mo4631i();
                                C1638f fVar2 = fVar;
                                m4323g(fVar2, C1637e.FIXED, (int) ((f2 * ((float) i7)) + 0.5f), eVar8, fVar.mo4630h());
                                fVar.f4652h.f4541g.mo4584c(fVar.mo4631i());
                                fVar.f4653i.f4541g.mo4584c(fVar.mo4630h());
                                fVar.f4649e = true;
                            }
                        } else {
                            C1636d[] dVarArr = fVar.f4602V;
                            if (dVarArr[0].f4571e == null || dVarArr[1].f4571e == null) {
                                m4323g(fVar, eVar2, 0, eVar8, 0);
                                fVar.f4652h.f4541g.mo4584c(fVar.mo4631i());
                                fVar.f4653i.f4541g.mo4584c(fVar.mo4630h());
                                fVar.f4649e = true;
                            }
                        }
                    }
                    if (eVar8 == eVar7 && (eVar6 == (eVar = C1637e.WRAP_CONTENT) || eVar6 == C1637e.FIXED)) {
                        if (i5 == 3) {
                            if (eVar6 == eVar) {
                                m4323g(fVar, eVar, 0, eVar, 0);
                            }
                            int i8 = fVar.mo4631i();
                            float f3 = fVar.f4623ac;
                            if (fVar.f4624ad == -1) {
                                f3 = 1.0f / f3;
                            }
                            C1637e eVar12 = C1637e.FIXED;
                            m4323g(fVar, eVar12, i8, eVar12, (int) ((((float) i8) * f3) + 0.5f));
                            fVar.f4652h.f4541g.mo4584c(fVar.mo4631i());
                            fVar.f4653i.f4541g.mo4584c(fVar.mo4630h());
                            fVar.f4649e = true;
                        } else if (i5 == 1) {
                            m4323g(fVar, eVar6, 0, eVar, 0);
                            fVar.f4653i.f4541g.f4521m = fVar.mo4630h();
                        } else if (i5 == 2) {
                            C1637e eVar13 = gVar2.f4605Y[1];
                            if (eVar13 == C1637e.FIXED || eVar13 == eVar9) {
                                float f4 = fVar.f4582B;
                                C1638f fVar3 = fVar;
                                m4323g(fVar3, eVar6, fVar.mo4631i(), C1637e.FIXED, (int) ((f4 * ((float) gVar.mo4630h())) + 0.5f));
                                fVar.f4652h.f4541g.mo4584c(fVar.mo4631i());
                                fVar.f4653i.f4541g.mo4584c(fVar.mo4630h());
                                fVar.f4649e = true;
                            }
                        } else {
                            C1636d[] dVarArr2 = fVar.f4602V;
                            if (dVarArr2[2].f4571e == null || dVarArr2[3].f4571e == null) {
                                m4323g(fVar, eVar, 0, eVar8, 0);
                                fVar.f4652h.f4541g.mo4584c(fVar.mo4631i());
                                fVar.f4653i.f4541g.mo4584c(fVar.mo4630h());
                                fVar.f4649e = true;
                            }
                        }
                    }
                    if (eVar6 == eVar7 && eVar8 == eVar7) {
                        if (i4 == 1 || i5 == 1) {
                            C1637e eVar14 = C1637e.WRAP_CONTENT;
                            m4323g(fVar, eVar14, 0, eVar14, 0);
                            fVar.f4652h.f4541g.f4521m = fVar.mo4631i();
                            fVar.f4653i.f4541g.f4521m = fVar.mo4630h();
                            i3++;
                            c = 0;
                        } else if (i5 == 2 && i4 == 2) {
                            C1637e[] eVarArr2 = gVar2.f4605Y;
                            C1637e eVar15 = eVarArr2[0];
                            C1637e eVar16 = C1637e.FIXED;
                            if (eVar15 == eVar16 && eVarArr2[1] == eVar16) {
                                float f5 = fVar.f4669y;
                                float f6 = fVar.f4582B;
                                m4323g(fVar, eVar16, (int) ((f5 * ((float) gVar.mo4631i())) + 0.5f), eVar16, (int) ((f6 * ((float) gVar.mo4630h())) + 0.5f));
                                fVar.f4652h.f4541g.mo4584c(fVar.mo4631i());
                                fVar.f4653i.f4541g.mo4584c(fVar.mo4630h());
                                fVar.f4649e = true;
                            }
                            i3++;
                            c = 0;
                        }
                    }
                }
            }
            i3++;
            c = 0;
        }
    }
}

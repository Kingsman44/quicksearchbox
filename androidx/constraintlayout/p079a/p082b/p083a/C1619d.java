package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1636d;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1639g;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.b.a.d */
/* compiled from: PG */
public final class C1619d extends C1633r {

    /* renamed from: a */
    ArrayList f4499a = new ArrayList();

    /* renamed from: b */
    private int f4500b;

    public C1619d(C1638f fVar, int i) {
        super(fVar);
        C1638f fVar2;
        this.f4542h = i;
        C1638f fVar3 = this.f4538d;
        C1638f m = fVar3.mo4635m(i);
        while (true) {
            C1638f fVar4 = m;
            fVar2 = fVar3;
            fVar3 = fVar4;
            if (fVar3 == null) {
                break;
            }
            m = fVar3.mo4635m(this.f4542h);
        }
        this.f4538d = fVar2;
        this.f4499a.add(fVar2.mo4636n(this.f4542h));
        C1638f l = fVar2.mo4634l(this.f4542h);
        while (l != null) {
            this.f4499a.add(l.mo4636n(this.f4542h));
            l = l.mo4634l(this.f4542h);
        }
        ArrayList arrayList = this.f4499a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1633r rVar = (C1633r) arrayList.get(i2);
            int i3 = this.f4542h;
            if (i3 == 0) {
                rVar.f4538d.f4650f = this;
            } else if (i3 == 1) {
                rVar.f4538d.f4651g = this;
            }
        }
        if (this.f4542h == 0 && ((C1639g) this.f4538d.f4606Z).f4691d && this.f4499a.size() > 1) {
            ArrayList arrayList2 = this.f4499a;
            this.f4538d = ((C1633r) arrayList2.get(arrayList2.size() - 1)).f4538d;
        }
        this.f4500b = this.f4542h == 0 ? this.f4538d.f4610aC : this.f4538d.f4611aD;
    }

    /* renamed from: g */
    private final C1638f m4313g() {
        for (int i = 0; i < this.f4499a.size(); i++) {
            C1638f fVar = ((C1633r) this.f4499a.get(i)).f4538d;
            if (fVar.f4637aq != 8) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: n */
    private final C1638f m4314n() {
        C1638f fVar;
        int size = this.f4499a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            fVar = ((C1633r) this.f4499a.get(size)).f4538d;
        } while (fVar.f4637aq == 8);
        return fVar;
    }

    /* renamed from: a */
    public final long mo4570a() {
        int size = this.f4499a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C1633r rVar = (C1633r) this.f4499a.get(i);
            j = j + ((long) rVar.f4544j.f4513e) + rVar.mo4570a() + ((long) rVar.f4545k.f4513e);
        }
        return j;
    }

    /* renamed from: b */
    public final void mo4571b() {
        ArrayList arrayList = this.f4499a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1633r) arrayList.get(i)).mo4571b();
        }
        int size2 = this.f4499a.size();
        if (size2 > 0) {
            C1638f fVar = ((C1633r) this.f4499a.get(0)).f4538d;
            C1638f fVar2 = ((C1633r) this.f4499a.get(size2 - 1)).f4538d;
            if (this.f4542h == 0) {
                C1636d dVar = fVar.f4594N;
                C1636d dVar2 = fVar2.f4596P;
                C1622g l = m4379l(dVar, 0);
                int b = dVar.mo4601b();
                C1638f g = m4313g();
                if (g != null) {
                    b = g.f4594N.mo4601b();
                }
                if (l != null) {
                    m4377j(this.f4544j, l, b);
                }
                C1622g l2 = m4379l(dVar2, 0);
                int b2 = dVar2.mo4601b();
                C1638f n = m4314n();
                if (n != null) {
                    b2 = n.f4596P.mo4601b();
                }
                if (l2 != null) {
                    m4377j(this.f4545k, l2, -b2);
                }
            } else {
                C1636d dVar3 = fVar.f4595O;
                C1636d dVar4 = fVar2.f4597Q;
                C1622g l3 = m4379l(dVar3, 1);
                int b3 = dVar3.mo4601b();
                C1638f g2 = m4313g();
                if (g2 != null) {
                    b3 = g2.f4595O.mo4601b();
                }
                if (l3 != null) {
                    m4377j(this.f4544j, l3, b3);
                }
                C1622g l4 = m4379l(dVar4, 1);
                int b4 = dVar4.mo4601b();
                C1638f n2 = m4314n();
                if (n2 != null) {
                    b4 = n2.f4597Q.mo4601b();
                }
                if (l4 != null) {
                    m4377j(this.f4545k, l4, -b4);
                }
            }
            this.f4544j.f4509a = this;
            this.f4545k.f4509a = this;
        }
    }

    /* renamed from: c */
    public final void mo4572c() {
        for (int i = 0; i < this.f4499a.size(); i++) {
            ((C1633r) this.f4499a.get(i)).mo4572c();
        }
    }

    /* renamed from: d */
    public final void mo4573d() {
        this.f4539e = null;
        ArrayList arrayList = this.f4499a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1633r) arrayList.get(i)).mo4573d();
        }
    }

    /* renamed from: e */
    public final boolean mo4574e() {
        int size = this.f4499a.size();
        for (int i = 0; i < size; i++) {
            if (!((C1633r) this.f4499a.get(i)).mo4574e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c0, code lost:
        if (r6.f4541g.f4517i != false) goto L_0x00c2;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4575f() {
        /*
            r26 = this;
            r0 = r26
            androidx.constraintlayout.a.b.a.g r1 = r0.f4544j
            boolean r2 = r1.f4517i
            if (r2 == 0) goto L_0x0406
            androidx.constraintlayout.a.b.a.g r2 = r0.f4545k
            boolean r3 = r2.f4517i
            if (r3 != 0) goto L_0x0010
            goto L_0x0406
        L_0x0010:
            androidx.constraintlayout.a.b.f r3 = r0.f4538d
            androidx.constraintlayout.a.b.f r3 = r3.f4606Z
            boolean r4 = r3 instanceof androidx.constraintlayout.p079a.p082b.C1639g
            if (r4 == 0) goto L_0x001d
            androidx.constraintlayout.a.b.g r3 = (androidx.constraintlayout.p079a.p082b.C1639g) r3
            boolean r3 = r3.f4691d
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r2 = r2.f4514f
            int r1 = r1.f4514f
            int r2 = r2 - r1
            java.util.ArrayList r1 = r0.f4499a
            int r1 = r1.size()
            r4 = 0
        L_0x002a:
            r7 = 8
            if (r4 >= r1) goto L_0x003f
            java.util.ArrayList r8 = r0.f4499a
            java.lang.Object r8 = r8.get(r4)
            androidx.constraintlayout.a.b.a.r r8 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r8
            androidx.constraintlayout.a.b.f r8 = r8.f4538d
            int r8 = r8.f4637aq
            if (r8 != r7) goto L_0x0040
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003f:
            r4 = -1
        L_0x0040:
            int r8 = r1 + -1
            r9 = r8
        L_0x0043:
            if (r9 < 0) goto L_0x0056
            java.util.ArrayList r10 = r0.f4499a
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.a.b.a.r r10 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r10
            androidx.constraintlayout.a.b.f r10 = r10.f4538d
            int r10 = r10.f4637aq
            if (r10 != r7) goto L_0x0057
            int r9 = r9 + -1
            goto L_0x0043
        L_0x0056:
            r9 = -1
        L_0x0057:
            r10 = 0
        L_0x0058:
            r11 = 0
            r12 = 2
            r13 = 1
            if (r10 >= r12) goto L_0x00f8
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0065:
            if (r14 >= r1) goto L_0x00e8
            java.util.ArrayList r6 = r0.f4499a
            java.lang.Object r6 = r6.get(r14)
            androidx.constraintlayout.a.b.a.r r6 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r6
            androidx.constraintlayout.a.b.f r5 = r6.f4538d
            int r5 = r5.f4637aq
            if (r5 != r7) goto L_0x0077
            goto L_0x00e1
        L_0x0077:
            int r18 = r18 + 1
            if (r14 <= 0) goto L_0x0082
            if (r14 < r4) goto L_0x0082
            androidx.constraintlayout.a.b.a.g r5 = r6.f4544j
            int r5 = r5.f4513e
            int r15 = r15 + r5
        L_0x0082:
            androidx.constraintlayout.a.b.a.h r5 = r6.f4541g
            int r5 = r5.f4514f
            androidx.constraintlayout.a.b.e r12 = r6.f4540f
            androidx.constraintlayout.a.b.e r7 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r12 == r7) goto L_0x008e
            r7 = 1
            goto L_0x008f
        L_0x008e:
            r7 = 0
        L_0x008f:
            if (r7 == 0) goto L_0x00af
            int r12 = r0.f4542h
            if (r12 != 0) goto L_0x00a1
            androidx.constraintlayout.a.b.f r12 = r6.f4538d
            androidx.constraintlayout.a.b.a.m r12 = r12.f4652h
            androidx.constraintlayout.a.b.a.h r12 = r12.f4541g
            boolean r12 = r12.f4517i
            if (r12 == 0) goto L_0x00a0
            goto L_0x00c3
        L_0x00a0:
            return
        L_0x00a1:
            if (r12 != r13) goto L_0x00c3
            androidx.constraintlayout.a.b.f r12 = r6.f4538d
            androidx.constraintlayout.a.b.a.o r12 = r12.f4653i
            androidx.constraintlayout.a.b.a.h r12 = r12.f4541g
            boolean r12 = r12.f4517i
            if (r12 == 0) goto L_0x00ae
            goto L_0x00c3
        L_0x00ae:
            return
        L_0x00af:
            int r12 = r6.f4537c
            if (r12 != r13) goto L_0x00bc
            if (r10 != 0) goto L_0x00bc
            androidx.constraintlayout.a.b.a.h r5 = r6.f4541g
            int r5 = r5.f4521m
            int r16 = r16 + 1
            goto L_0x00c2
        L_0x00bc:
            androidx.constraintlayout.a.b.a.h r12 = r6.f4541g
            boolean r12 = r12.f4517i
            if (r12 == 0) goto L_0x00c3
        L_0x00c2:
            r7 = 1
        L_0x00c3:
            if (r7 != 0) goto L_0x00d6
            int r16 = r16 + 1
            androidx.constraintlayout.a.b.f r5 = r6.f4538d
            float[] r5 = r5.f4614aG
            int r7 = r0.f4542h
            r5 = r5[r7]
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x00d7
            float r17 = r17 + r5
            goto L_0x00d7
        L_0x00d6:
            int r15 = r15 + r5
        L_0x00d7:
            if (r14 >= r8) goto L_0x00e1
            if (r14 >= r9) goto L_0x00e1
            androidx.constraintlayout.a.b.a.g r5 = r6.f4545k
            int r5 = r5.f4513e
            int r5 = -r5
            int r15 = r15 + r5
        L_0x00e1:
            int r14 = r14 + 1
            r7 = 8
            r12 = 2
            goto L_0x0065
        L_0x00e8:
            if (r15 < r2) goto L_0x00f3
            if (r16 != 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            int r10 = r10 + 1
            r7 = 8
            goto L_0x0058
        L_0x00f3:
            r5 = r16
            r6 = r18
            goto L_0x00fd
        L_0x00f8:
            r5 = 0
            r6 = 0
            r15 = 0
            r17 = 0
        L_0x00fd:
            androidx.constraintlayout.a.b.a.g r7 = r0.f4544j
            int r7 = r7.f4514f
            if (r3 == 0) goto L_0x0107
            androidx.constraintlayout.a.b.a.g r7 = r0.f4545k
            int r7 = r7.f4514f
        L_0x0107:
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r2) goto L_0x011e
            r12 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0117
            int r14 = r15 - r2
            float r14 = (float) r14
            float r14 = r14 / r12
            float r14 = r14 + r10
            int r12 = (int) r14
            int r7 = r7 + r12
            goto L_0x011e
        L_0x0117:
            int r14 = r15 - r2
            float r14 = (float) r14
            float r14 = r14 / r12
            float r14 = r14 + r10
            int r12 = (int) r14
            int r7 = r7 - r12
        L_0x011e:
            if (r5 <= 0) goto L_0x020e
            int r12 = r2 - r15
            float r12 = (float) r12
            float r14 = (float) r5
            float r14 = r12 / r14
            float r14 = r14 + r10
            int r14 = (int) r14
            r13 = 0
            r18 = 0
        L_0x012b:
            if (r13 >= r1) goto L_0x01c3
            java.util.ArrayList r10 = r0.f4499a
            java.lang.Object r10 = r10.get(r13)
            androidx.constraintlayout.a.b.a.r r10 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r10
            androidx.constraintlayout.a.b.f r11 = r10.f4538d
            int r11 = r11.f4637aq
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0149
        L_0x013f:
            r24 = r3
            r23 = r7
            r22 = r12
            r21 = r15
            goto L_0x01b2
        L_0x0149:
            androidx.constraintlayout.a.b.e r11 = r10.f4540f
            androidx.constraintlayout.a.b.e r14 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x013f
            androidx.constraintlayout.a.b.a.h r11 = r10.f4541g
            boolean r14 = r11.f4517i
            if (r14 != 0) goto L_0x013f
            r14 = 0
            int r19 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r19 <= 0) goto L_0x016d
            androidx.constraintlayout.a.b.f r14 = r10.f4538d
            float[] r14 = r14.f4614aG
            r21 = r15
            int r15 = r0.f4542h
            r14 = r14[r15]
            float r14 = r14 * r12
            float r14 = r14 / r17
            r15 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r15
            int r14 = (int) r14
            goto L_0x0171
        L_0x016d:
            r21 = r15
            r14 = r20
        L_0x0171:
            int r15 = r0.f4542h
            if (r15 != 0) goto L_0x0180
            androidx.constraintlayout.a.b.f r15 = r10.f4538d
            r22 = r12
            int r12 = r15.f4668x
            int r15 = r15.f4667w
            r23 = r7
            goto L_0x018f
        L_0x0180:
            r22 = r12
            androidx.constraintlayout.a.b.f r12 = r10.f4538d
            int r15 = r12.f4581A
            int r12 = r12.f4670z
            r23 = r7
            r25 = r15
            r15 = r12
            r12 = r25
        L_0x018f:
            int r7 = r10.f4537c
            r24 = r3
            r3 = 1
            if (r7 != r3) goto L_0x019d
            int r3 = r11.f4521m
            int r3 = java.lang.Math.min(r14, r3)
            goto L_0x019e
        L_0x019d:
            r3 = r14
        L_0x019e:
            int r3 = java.lang.Math.max(r15, r3)
            if (r12 <= 0) goto L_0x01a8
            int r3 = java.lang.Math.min(r12, r3)
        L_0x01a8:
            if (r3 == r14) goto L_0x01ad
            int r18 = r18 + 1
            r14 = r3
        L_0x01ad:
            androidx.constraintlayout.a.b.a.h r3 = r10.f4541g
            r3.mo4584c(r14)
        L_0x01b2:
            int r13 = r13 + 1
            r14 = r20
            r15 = r21
            r12 = r22
            r7 = r23
            r3 = r24
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 0
            goto L_0x012b
        L_0x01c3:
            r24 = r3
            r23 = r7
            r21 = r15
            if (r18 <= 0) goto L_0x01ff
            int r5 = r5 - r18
            r3 = 0
            r7 = 0
        L_0x01cf:
            if (r3 >= r1) goto L_0x01fd
            java.util.ArrayList r10 = r0.f4499a
            java.lang.Object r10 = r10.get(r3)
            androidx.constraintlayout.a.b.a.r r10 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r10
            androidx.constraintlayout.a.b.f r11 = r10.f4538d
            int r11 = r11.f4637aq
            r12 = 8
            if (r11 != r12) goto L_0x01e2
            goto L_0x01fa
        L_0x01e2:
            if (r3 <= 0) goto L_0x01eb
            if (r3 < r4) goto L_0x01eb
            androidx.constraintlayout.a.b.a.g r11 = r10.f4544j
            int r11 = r11.f4513e
            int r7 = r7 + r11
        L_0x01eb:
            androidx.constraintlayout.a.b.a.h r11 = r10.f4541g
            int r11 = r11.f4514f
            int r7 = r7 + r11
            if (r3 >= r8) goto L_0x01fa
            if (r3 >= r9) goto L_0x01fa
            androidx.constraintlayout.a.b.a.g r10 = r10.f4545k
            int r10 = r10.f4513e
            int r10 = -r10
            int r7 = r7 + r10
        L_0x01fa:
            int r3 = r3 + 1
            goto L_0x01cf
        L_0x01fd:
            r15 = r7
            goto L_0x0201
        L_0x01ff:
            r15 = r21
        L_0x0201:
            int r3 = r0.f4500b
            r7 = 2
            if (r3 != r7) goto L_0x020c
            if (r18 != 0) goto L_0x020c
            r3 = 0
            r0.f4500b = r3
            goto L_0x0216
        L_0x020c:
            r3 = 0
            goto L_0x0216
        L_0x020e:
            r24 = r3
            r23 = r7
            r21 = r15
            r3 = 0
            r7 = 2
        L_0x0216:
            if (r15 <= r2) goto L_0x021a
            r0.f4500b = r7
        L_0x021a:
            if (r6 <= 0) goto L_0x0223
            if (r5 != 0) goto L_0x0223
            if (r4 != r9) goto L_0x0222
            r0.f4500b = r7
        L_0x0222:
            r5 = 0
        L_0x0223:
            int r7 = r0.f4500b
            r10 = 1
            if (r7 != r10) goto L_0x02c5
            if (r6 <= r10) goto L_0x022f
            int r2 = r2 - r15
            r7 = -1
            int r6 = r6 + r7
            int r2 = r2 / r6
            goto L_0x0236
        L_0x022f:
            if (r6 != r10) goto L_0x0235
            int r2 = r2 - r15
            r6 = 2
            int r2 = r2 / r6
            goto L_0x0236
        L_0x0235:
            r2 = 0
        L_0x0236:
            if (r5 <= 0) goto L_0x0239
            r2 = 0
        L_0x0239:
            r7 = r23
            r5 = 0
        L_0x023c:
            if (r5 >= r1) goto L_0x0406
            if (r24 == 0) goto L_0x0245
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x0246
        L_0x0245:
            r3 = r5
        L_0x0246:
            java.util.ArrayList r6 = r0.f4499a
            java.lang.Object r3 = r6.get(r3)
            androidx.constraintlayout.a.b.a.r r3 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r3
            androidx.constraintlayout.a.b.f r6 = r3.f4538d
            int r6 = r6.f4637aq
            r10 = 8
            if (r6 != r10) goto L_0x0261
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            r6.mo4584c(r7)
            androidx.constraintlayout.a.b.a.g r3 = r3.f4545k
            r3.mo4584c(r7)
            goto L_0x02c1
        L_0x0261:
            if (r5 <= 0) goto L_0x0268
            if (r24 == 0) goto L_0x0267
            int r7 = r7 - r2
            goto L_0x0268
        L_0x0267:
            int r7 = r7 + r2
        L_0x0268:
            if (r5 <= 0) goto L_0x0279
            if (r5 < r4) goto L_0x0279
            if (r24 == 0) goto L_0x0274
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            int r6 = r6.f4513e
            int r7 = r7 - r6
            goto L_0x0279
        L_0x0274:
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            int r6 = r6.f4513e
            int r7 = r7 + r6
        L_0x0279:
            if (r24 == 0) goto L_0x0281
            androidx.constraintlayout.a.b.a.g r6 = r3.f4545k
            r6.mo4584c(r7)
            goto L_0x0286
        L_0x0281:
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            r6.mo4584c(r7)
        L_0x0286:
            androidx.constraintlayout.a.b.a.h r6 = r3.f4541g
            int r6 = r6.f4514f
            androidx.constraintlayout.a.b.e r10 = r3.f4540f
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x0299
            int r10 = r3.f4537c
            r11 = 1
            if (r10 != r11) goto L_0x0299
            androidx.constraintlayout.a.b.a.h r6 = r3.f4541g
            int r6 = r6.f4521m
        L_0x0299:
            if (r24 == 0) goto L_0x029d
            int r7 = r7 - r6
            goto L_0x029e
        L_0x029d:
            int r7 = r7 + r6
        L_0x029e:
            if (r24 == 0) goto L_0x02a6
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            r6.mo4584c(r7)
            goto L_0x02ab
        L_0x02a6:
            androidx.constraintlayout.a.b.a.g r6 = r3.f4545k
            r6.mo4584c(r7)
        L_0x02ab:
            r6 = 1
            r3.f4543i = r6
            if (r5 >= r8) goto L_0x02c1
            if (r5 >= r9) goto L_0x02c1
            if (r24 == 0) goto L_0x02bb
            androidx.constraintlayout.a.b.a.g r3 = r3.f4545k
            int r3 = r3.f4513e
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x02c1
        L_0x02bb:
            androidx.constraintlayout.a.b.a.g r3 = r3.f4545k
            int r3 = r3.f4513e
            int r3 = -r3
            int r7 = r7 + r3
        L_0x02c1:
            int r5 = r5 + 1
            goto L_0x023c
        L_0x02c5:
            if (r7 != 0) goto L_0x0359
            int r2 = r2 - r15
            r7 = 1
            int r6 = r6 + r7
            int r2 = r2 / r6
            if (r5 <= 0) goto L_0x02ce
            r2 = 0
        L_0x02ce:
            r7 = r23
            r5 = 0
        L_0x02d1:
            if (r5 >= r1) goto L_0x0406
            if (r24 == 0) goto L_0x02da
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x02db
        L_0x02da:
            r3 = r5
        L_0x02db:
            java.util.ArrayList r6 = r0.f4499a
            java.lang.Object r3 = r6.get(r3)
            androidx.constraintlayout.a.b.a.r r3 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r3
            androidx.constraintlayout.a.b.f r6 = r3.f4538d
            int r6 = r6.f4637aq
            r10 = 8
            if (r6 != r10) goto L_0x02f6
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            r6.mo4584c(r7)
            androidx.constraintlayout.a.b.a.g r3 = r3.f4545k
            r3.mo4584c(r7)
            goto L_0x0355
        L_0x02f6:
            if (r24 == 0) goto L_0x02fa
            int r7 = r7 - r2
            goto L_0x02fb
        L_0x02fa:
            int r7 = r7 + r2
        L_0x02fb:
            if (r5 <= 0) goto L_0x030c
            if (r5 < r4) goto L_0x030c
            if (r24 == 0) goto L_0x0307
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            int r6 = r6.f4513e
            int r7 = r7 - r6
            goto L_0x030c
        L_0x0307:
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            int r6 = r6.f4513e
            int r7 = r7 + r6
        L_0x030c:
            if (r24 == 0) goto L_0x0314
            androidx.constraintlayout.a.b.a.g r6 = r3.f4545k
            r6.mo4584c(r7)
            goto L_0x0319
        L_0x0314:
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            r6.mo4584c(r7)
        L_0x0319:
            androidx.constraintlayout.a.b.a.h r6 = r3.f4541g
            int r6 = r6.f4514f
            androidx.constraintlayout.a.b.e r10 = r3.f4540f
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x0330
            int r10 = r3.f4537c
            r11 = 1
            if (r10 != r11) goto L_0x0330
            androidx.constraintlayout.a.b.a.h r10 = r3.f4541g
            int r10 = r10.f4521m
            int r6 = java.lang.Math.min(r6, r10)
        L_0x0330:
            if (r24 == 0) goto L_0x0334
            int r7 = r7 - r6
            goto L_0x0335
        L_0x0334:
            int r7 = r7 + r6
        L_0x0335:
            if (r24 == 0) goto L_0x033d
            androidx.constraintlayout.a.b.a.g r6 = r3.f4544j
            r6.mo4584c(r7)
            goto L_0x0342
        L_0x033d:
            androidx.constraintlayout.a.b.a.g r6 = r3.f4545k
            r6.mo4584c(r7)
        L_0x0342:
            if (r5 >= r8) goto L_0x0355
            if (r5 >= r9) goto L_0x0355
            if (r24 == 0) goto L_0x034f
            androidx.constraintlayout.a.b.a.g r3 = r3.f4545k
            int r3 = r3.f4513e
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x0355
        L_0x034f:
            androidx.constraintlayout.a.b.a.g r3 = r3.f4545k
            int r3 = r3.f4513e
            int r3 = -r3
            int r7 = r7 + r3
        L_0x0355:
            int r5 = r5 + 1
            goto L_0x02d1
        L_0x0359:
            r6 = 2
            if (r7 != r6) goto L_0x0406
            int r6 = r0.f4542h
            if (r6 != 0) goto L_0x0365
            androidx.constraintlayout.a.b.f r6 = r0.f4538d
            float r6 = r6.f4634an
            goto L_0x0369
        L_0x0365:
            androidx.constraintlayout.a.b.f r6 = r0.f4538d
            float r6 = r6.f4635ao
        L_0x0369:
            if (r24 == 0) goto L_0x036f
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r7 - r6
        L_0x036f:
            int r2 = r2 - r15
            float r2 = (float) r2
            float r2 = r2 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r6
            int r2 = (int) r2
            if (r2 < 0) goto L_0x037b
            if (r5 <= 0) goto L_0x037c
        L_0x037b:
            r2 = 0
        L_0x037c:
            if (r24 == 0) goto L_0x0381
            int r7 = r23 - r2
            goto L_0x0383
        L_0x0381:
            int r7 = r23 + r2
        L_0x0383:
            r5 = 0
        L_0x0384:
            if (r5 >= r1) goto L_0x0406
            if (r24 == 0) goto L_0x038d
            int r2 = r5 + 1
            int r2 = r1 - r2
            goto L_0x038e
        L_0x038d:
            r2 = r5
        L_0x038e:
            java.util.ArrayList r3 = r0.f4499a
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.a.b.a.r r2 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r2
            androidx.constraintlayout.a.b.f r3 = r2.f4538d
            int r3 = r3.f4637aq
            r6 = 8
            if (r3 != r6) goto L_0x03aa
            androidx.constraintlayout.a.b.a.g r3 = r2.f4544j
            r3.mo4584c(r7)
            androidx.constraintlayout.a.b.a.g r2 = r2.f4545k
            r2.mo4584c(r7)
            r11 = 1
            goto L_0x0402
        L_0x03aa:
            if (r5 <= 0) goto L_0x03bb
            if (r5 < r4) goto L_0x03bb
            if (r24 == 0) goto L_0x03b6
            androidx.constraintlayout.a.b.a.g r3 = r2.f4544j
            int r3 = r3.f4513e
            int r7 = r7 - r3
            goto L_0x03bb
        L_0x03b6:
            androidx.constraintlayout.a.b.a.g r3 = r2.f4544j
            int r3 = r3.f4513e
            int r7 = r7 + r3
        L_0x03bb:
            if (r24 == 0) goto L_0x03c3
            androidx.constraintlayout.a.b.a.g r3 = r2.f4545k
            r3.mo4584c(r7)
            goto L_0x03c8
        L_0x03c3:
            androidx.constraintlayout.a.b.a.g r3 = r2.f4544j
            r3.mo4584c(r7)
        L_0x03c8:
            androidx.constraintlayout.a.b.a.h r3 = r2.f4541g
            int r3 = r3.f4514f
            androidx.constraintlayout.a.b.e r10 = r2.f4540f
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x03dc
            int r10 = r2.f4537c
            r11 = 1
            if (r10 != r11) goto L_0x03dd
            androidx.constraintlayout.a.b.a.h r3 = r2.f4541g
            int r3 = r3.f4521m
            goto L_0x03dd
        L_0x03dc:
            r11 = 1
        L_0x03dd:
            if (r24 == 0) goto L_0x03e1
            int r7 = r7 - r3
            goto L_0x03e2
        L_0x03e1:
            int r7 = r7 + r3
        L_0x03e2:
            if (r24 == 0) goto L_0x03ea
            androidx.constraintlayout.a.b.a.g r3 = r2.f4544j
            r3.mo4584c(r7)
            goto L_0x03ef
        L_0x03ea:
            androidx.constraintlayout.a.b.a.g r3 = r2.f4545k
            r3.mo4584c(r7)
        L_0x03ef:
            if (r5 >= r8) goto L_0x0402
            if (r5 >= r9) goto L_0x0402
            if (r24 == 0) goto L_0x03fc
            androidx.constraintlayout.a.b.a.g r2 = r2.f4545k
            int r2 = r2.f4513e
            int r2 = -r2
            int r7 = r7 - r2
            goto L_0x0402
        L_0x03fc:
            androidx.constraintlayout.a.b.a.g r2 = r2.f4545k
            int r2 = r2.f4513e
            int r2 = -r2
            int r7 = r7 + r2
        L_0x0402:
            int r5 = r5 + 1
            goto L_0x0384
        L_0x0406:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.p083a.C1619d.mo4575f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f4542h == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f4499a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("<");
            sb.append((C1633r) arrayList.get(i));
            sb.append("> ");
        }
        return sb.toString();
    }
}

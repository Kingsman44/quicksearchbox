package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1636d;
import androidx.constraintlayout.p079a.p082b.C1637e;
import androidx.constraintlayout.p079a.p082b.C1638f;

/* renamed from: androidx.constraintlayout.a.b.a.r */
/* compiled from: PG */
public abstract class C1633r implements C1620e {

    /* renamed from: c */
    public int f4537c;

    /* renamed from: d */
    public C1638f f4538d;

    /* renamed from: e */
    C1629n f4539e;

    /* renamed from: f */
    protected C1637e f4540f;

    /* renamed from: g */
    public final C1623h f4541g = new C1623h(this);

    /* renamed from: h */
    public int f4542h = 0;

    /* renamed from: i */
    public boolean f4543i = false;

    /* renamed from: j */
    public final C1622g f4544j = new C1622g(this);

    /* renamed from: k */
    public final C1622g f4545k = new C1622g(this);

    /* renamed from: l */
    protected int f4546l = 1;

    public C1633r(C1638f fVar) {
        this.f4538d = fVar;
    }

    /* renamed from: j */
    protected static final void m4377j(C1622g gVar, C1622g gVar2, int i) {
        gVar.f4519k.add(gVar2);
        gVar.f4513e = i;
        gVar2.f4518j.add(gVar);
    }

    /* renamed from: k */
    protected static final C1622g m4378k(C1636d dVar) {
        C1636d dVar2 = dVar.f4571e;
        if (dVar2 == null) {
            return null;
        }
        C1638f fVar = dVar2.f4570d;
        int i = dVar2.f4575i - 1;
        if (i == 1) {
            return fVar.f4652h.f4544j;
        }
        if (i == 2) {
            return fVar.f4653i.f4544j;
        }
        if (i == 3) {
            return fVar.f4652h.f4545k;
        }
        if (i == 4) {
            return fVar.f4653i.f4545k;
        }
        if (i != 5) {
            return null;
        }
        return fVar.f4653i.f4529a;
    }

    /* renamed from: l */
    protected static final C1622g m4379l(C1636d dVar, int i) {
        C1633r rVar;
        C1636d dVar2 = dVar.f4571e;
        if (dVar2 == null) {
            return null;
        }
        C1638f fVar = dVar2.f4570d;
        if (i == 0) {
            rVar = fVar.f4652h;
        } else {
            rVar = fVar.f4653i;
        }
        int i2 = dVar2.f4575i - 1;
        if (i2 == 1 || i2 == 2) {
            return rVar.f4544j;
        }
        if (i2 == 3 || i2 == 4) {
            return rVar.f4545k;
        }
        return null;
    }

    /* renamed from: a */
    public long mo4570a() {
        C1623h hVar = this.f4541g;
        if (hVar.f4517i) {
            return (long) hVar.f4514f;
        }
        return 0;
    }

    /* renamed from: b */
    public abstract void mo4571b();

    /* renamed from: c */
    public abstract void mo4572c();

    /* renamed from: d */
    public abstract void mo4573d();

    /* renamed from: e */
    public abstract boolean mo4574e();

    /* renamed from: f */
    public void mo4575f() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo4597h(int i, int i2) {
        if (i2 == 0) {
            C1638f fVar = this.f4538d;
            int i3 = fVar.f4668x;
            int max = Math.max(fVar.f4667w, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
            return max;
        }
        C1638f fVar2 = this.f4538d;
        int i4 = fVar2.f4581A;
        int max2 = Math.max(fVar2.f4670z, i);
        if (i4 > 0) {
            max2 = Math.min(i4, i);
        }
        return max2 == i ? i : max2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo4598i(C1622g gVar, C1622g gVar2, int i, C1623h hVar) {
        gVar.f4519k.add(gVar2);
        gVar.f4519k.add(this.f4541g);
        gVar.f4515g = i;
        gVar.f4516h = hVar;
        gVar2.f4518j.add(gVar);
        hVar.f4518j.add(gVar);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [androidx.constraintlayout.a.b.a.o] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r5.f4537c == 3) goto L_0x00bf;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4599m(androidx.constraintlayout.p079a.p082b.C1636d r12, androidx.constraintlayout.p079a.p082b.C1636d r13, int r14) {
        /*
            r11 = this;
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r12)
            androidx.constraintlayout.a.b.a.g r1 = m4378k(r13)
            boolean r2 = r0.f4517i
            if (r2 == 0) goto L_0x0104
            boolean r2 = r1.f4517i
            if (r2 != 0) goto L_0x0012
            goto L_0x0104
        L_0x0012:
            int r2 = r0.f4514f
            int r12 = r12.mo4601b()
            int r2 = r2 + r12
            int r12 = r1.f4514f
            int r13 = r13.mo4601b()
            int r12 = r12 - r13
            int r13 = r12 - r2
            androidx.constraintlayout.a.b.a.h r3 = r11.f4541g
            boolean r3 = r3.f4517i
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r3 != 0) goto L_0x00bf
            androidx.constraintlayout.a.b.e r3 = r11.f4540f
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x00bf
            int r3 = r11.f4537c
            if (r3 == 0) goto L_0x00b6
            r6 = 1
            if (r3 == r6) goto L_0x00a4
            r7 = 2
            if (r3 == r7) goto L_0x0079
            r7 = 3
            if (r3 == r7) goto L_0x003f
            goto L_0x00bf
        L_0x003f:
            androidx.constraintlayout.a.b.f r3 = r11.f4538d
            androidx.constraintlayout.a.b.a.m r8 = r3.f4652h
            androidx.constraintlayout.a.b.e r9 = r8.f4540f
            if (r9 != r5) goto L_0x0057
            int r5 = r8.f4537c
            if (r5 != r7) goto L_0x0057
            androidx.constraintlayout.a.b.a.o r5 = r3.f4653i
            androidx.constraintlayout.a.b.e r9 = r5.f4540f
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0057
            int r5 = r5.f4537c
            if (r5 == r7) goto L_0x00bf
        L_0x0057:
            if (r14 != 0) goto L_0x005b
            androidx.constraintlayout.a.b.a.o r8 = r3.f4653i
        L_0x005b:
            androidx.constraintlayout.a.b.a.h r5 = r8.f4541g
            boolean r7 = r5.f4517i
            if (r7 == 0) goto L_0x00bf
            float r3 = r3.f4623ac
            if (r14 != r6) goto L_0x006c
            int r5 = r5.f4514f
            float r5 = (float) r5
            float r5 = r5 / r3
            float r5 = r5 + r4
            int r3 = (int) r5
            goto L_0x0073
        L_0x006c:
            int r5 = r5.f4514f
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r4
            int r3 = (int) r3
        L_0x0073:
            androidx.constraintlayout.a.b.a.h r5 = r11.f4541g
            r5.mo4584c(r3)
            goto L_0x00bf
        L_0x0079:
            androidx.constraintlayout.a.b.f r3 = r11.f4538d
            androidx.constraintlayout.a.b.f r5 = r3.f4606Z
            if (r5 == 0) goto L_0x00bf
            if (r14 != 0) goto L_0x0084
            androidx.constraintlayout.a.b.a.m r5 = r5.f4652h
            goto L_0x0086
        L_0x0084:
            androidx.constraintlayout.a.b.a.o r5 = r5.f4653i
        L_0x0086:
            androidx.constraintlayout.a.b.a.h r5 = r5.f4541g
            boolean r6 = r5.f4517i
            if (r6 == 0) goto L_0x00bf
            if (r14 != 0) goto L_0x0091
            float r3 = r3.f4669y
            goto L_0x0093
        L_0x0091:
            float r3 = r3.f4582B
        L_0x0093:
            int r5 = r5.f4514f
            androidx.constraintlayout.a.b.a.h r6 = r11.f4541g
            float r5 = (float) r5
            float r5 = r5 * r3
            float r5 = r5 + r4
            int r3 = (int) r5
            int r3 = r11.mo4597h(r3, r14)
            r6.mo4584c(r3)
            goto L_0x00bf
        L_0x00a4:
            androidx.constraintlayout.a.b.a.h r3 = r11.f4541g
            int r3 = r3.f4521m
            int r3 = r11.mo4597h(r3, r14)
            androidx.constraintlayout.a.b.a.h r5 = r11.f4541g
            int r3 = java.lang.Math.min(r3, r13)
            r5.mo4584c(r3)
            goto L_0x00bf
        L_0x00b6:
            androidx.constraintlayout.a.b.a.h r3 = r11.f4541g
            int r5 = r11.mo4597h(r13, r14)
            r3.mo4584c(r5)
        L_0x00bf:
            androidx.constraintlayout.a.b.a.h r3 = r11.f4541g
            boolean r5 = r3.f4517i
            if (r5 != 0) goto L_0x00c6
            return
        L_0x00c6:
            int r3 = r3.f4514f
            if (r3 != r13) goto L_0x00d5
            androidx.constraintlayout.a.b.a.g r13 = r11.f4544j
            r13.mo4584c(r2)
            androidx.constraintlayout.a.b.a.g r13 = r11.f4545k
            r13.mo4584c(r12)
            return
        L_0x00d5:
            if (r14 != 0) goto L_0x00dc
            androidx.constraintlayout.a.b.f r13 = r11.f4538d
            float r13 = r13.f4634an
            goto L_0x00e0
        L_0x00dc:
            androidx.constraintlayout.a.b.f r13 = r11.f4538d
            float r13 = r13.f4635ao
        L_0x00e0:
            if (r0 != r1) goto L_0x00e8
            int r2 = r0.f4514f
            int r12 = r1.f4514f
            r13 = 1056964608(0x3f000000, float:0.5)
        L_0x00e8:
            androidx.constraintlayout.a.b.a.g r14 = r11.f4544j
            float r0 = (float) r2
            float r0 = r0 + r4
            int r12 = r12 - r2
            int r12 = r12 - r3
            float r12 = (float) r12
            float r12 = r12 * r13
            float r0 = r0 + r12
            int r12 = (int) r0
            r14.mo4584c(r12)
            androidx.constraintlayout.a.b.a.g r12 = r11.f4545k
            androidx.constraintlayout.a.b.a.g r13 = r11.f4544j
            int r13 = r13.f4514f
            androidx.constraintlayout.a.b.a.h r14 = r11.f4541g
            int r14 = r14.f4514f
            int r13 = r13 + r14
            r12.mo4584c(r13)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.p083a.C1633r.mo4599m(androidx.constraintlayout.a.b.d, androidx.constraintlayout.a.b.d, int):void");
    }
}

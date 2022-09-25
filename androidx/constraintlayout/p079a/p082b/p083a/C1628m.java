package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1637e;
import androidx.constraintlayout.p079a.p082b.C1638f;

/* renamed from: androidx.constraintlayout.a.b.a.m */
/* compiled from: PG */
public final class C1628m extends C1633r {

    /* renamed from: a */
    private static final int[] f4525a = new int[2];

    public C1628m(C1638f fVar) {
        super(fVar);
        this.f4544j.f4520l = 4;
        this.f4545k.f4520l = 5;
        this.f4542h = 0;
    }

    /* renamed from: n */
    private static final void m4358n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 != 0) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        } else {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        r0 = r8.f4538d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        r3 = r8.f4538d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4571b() {
        /*
            r8 = this;
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            boolean r1 = r0.f4649e
            if (r1 == 0) goto L_0x000f
            androidx.constraintlayout.a.b.a.h r1 = r8.f4541g
            int r0 = r0.mo4631i()
            r1.mo4584c(r0)
        L_0x000f:
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            boolean r0 = r0.f4517i
            r1 = 0
            if (r0 != 0) goto L_0x008a
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.e[] r0 = r0.f4605Y
            r0 = r0[r1]
            r8.f4540f = r0
            androidx.constraintlayout.a.b.e r0 = r8.f4540f
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r0 == r2) goto L_0x00c6
            androidx.constraintlayout.a.b.e r0 = r8.f4540f
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r0 != r2) goto L_0x007a
            androidx.constraintlayout.a.b.f r3 = r8.f4538d
            androidx.constraintlayout.a.b.f r4 = r3.f4606Z
            if (r4 == 0) goto L_0x007a
            androidx.constraintlayout.a.b.e[] r5 = r4.f4605Y
            r6 = r5[r1]
            androidx.constraintlayout.a.b.e r7 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r6 == r7) goto L_0x003d
            r5 = r5[r1]
            if (r5 == r2) goto L_0x003d
            goto L_0x007a
        L_0x003d:
            int r0 = r4.mo4631i()
            androidx.constraintlayout.a.b.d r1 = r3.f4594N
            int r1 = r1.mo4601b()
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.d r2 = r2.f4596P
            int r2 = r2.mo4601b()
            androidx.constraintlayout.a.b.a.g r3 = r8.f4544j
            androidx.constraintlayout.a.b.a.m r5 = r4.f4652h
            androidx.constraintlayout.a.b.a.g r5 = r5.f4544j
            androidx.constraintlayout.a.b.f r6 = r8.f4538d
            androidx.constraintlayout.a.b.d r6 = r6.f4594N
            int r6 = r6.mo4601b()
            m4377j(r3, r5, r6)
            androidx.constraintlayout.a.b.a.g r3 = r8.f4545k
            androidx.constraintlayout.a.b.a.m r4 = r4.f4652h
            androidx.constraintlayout.a.b.a.g r4 = r4.f4545k
            androidx.constraintlayout.a.b.f r5 = r8.f4538d
            androidx.constraintlayout.a.b.d r5 = r5.f4596P
            int r5 = r5.mo4601b()
            int r5 = -r5
            m4377j(r3, r4, r5)
            androidx.constraintlayout.a.b.a.h r3 = r8.f4541g
            int r0 = r0 - r1
            int r0 = r0 - r2
            r3.mo4584c(r0)
            return
        L_0x007a:
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r0 != r2) goto L_0x00c6
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            int r2 = r2.mo4631i()
            r0.mo4584c(r2)
            goto L_0x00c6
        L_0x008a:
            androidx.constraintlayout.a.b.e r0 = r8.f4540f
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r0 != r2) goto L_0x00c6
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.f r2 = r0.f4606Z
            if (r2 == 0) goto L_0x00c6
            androidx.constraintlayout.a.b.e[] r3 = r2.f4605Y
            r4 = r3[r1]
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r4 == r5) goto L_0x00a4
            r3 = r3[r1]
            androidx.constraintlayout.a.b.e r4 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r3 != r4) goto L_0x00c6
        L_0x00a4:
            androidx.constraintlayout.a.b.a.g r1 = r8.f4544j
            androidx.constraintlayout.a.b.a.m r3 = r2.f4652h
            androidx.constraintlayout.a.b.a.g r3 = r3.f4544j
            androidx.constraintlayout.a.b.d r0 = r0.f4594N
            int r0 = r0.mo4601b()
            m4377j(r1, r3, r0)
            androidx.constraintlayout.a.b.a.g r0 = r8.f4545k
            androidx.constraintlayout.a.b.a.m r1 = r2.f4652h
            androidx.constraintlayout.a.b.a.g r1 = r1.f4545k
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.d r2 = r2.f4596P
            int r2 = r2.mo4601b()
            int r2 = -r2
            m4377j(r0, r1, r2)
            return
        L_0x00c6:
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            boolean r2 = r0.f4517i
            r3 = 1
            if (r2 == 0) goto L_0x01bf
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            boolean r4 = r2.f4649e
            if (r4 == 0) goto L_0x01bf
            androidx.constraintlayout.a.b.d[] r0 = r2.f4602V
            r4 = r0[r1]
            androidx.constraintlayout.a.b.d r5 = r4.f4571e
            if (r5 == 0) goto L_0x0145
            r6 = r0[r3]
            androidx.constraintlayout.a.b.d r6 = r6.f4571e
            if (r6 == 0) goto L_0x0145
            boolean r0 = r2.mo4623I()
            if (r0 == 0) goto L_0x0105
            androidx.constraintlayout.a.b.a.g r0 = r8.f4544j
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r1 = r2[r1]
            int r1 = r1.mo4601b()
            r0.f4513e = r1
            androidx.constraintlayout.a.b.a.g r0 = r8.f4545k
            androidx.constraintlayout.a.b.f r1 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r1 = r1.f4602V
            r1 = r1[r3]
            int r1 = r1.mo4601b()
            int r1 = -r1
            r0.f4513e = r1
            return
        L_0x0105:
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r0 = r0.f4602V
            r0 = r0[r1]
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r0)
            if (r0 == 0) goto L_0x0120
            androidx.constraintlayout.a.b.a.g r2 = r8.f4544j
            androidx.constraintlayout.a.b.f r4 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r4 = r4.f4602V
            r1 = r4[r1]
            int r1 = r1.mo4601b()
            m4377j(r2, r0, r1)
        L_0x0120:
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r0 = r0.f4602V
            r0 = r0[r3]
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r0)
            if (r0 == 0) goto L_0x013c
            androidx.constraintlayout.a.b.a.g r1 = r8.f4545k
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r2 = r2[r3]
            int r2 = r2.mo4601b()
            int r2 = -r2
            m4377j(r1, r0, r2)
        L_0x013c:
            androidx.constraintlayout.a.b.a.g r0 = r8.f4544j
            r0.f4510b = r3
            androidx.constraintlayout.a.b.a.g r0 = r8.f4545k
            r0.f4510b = r3
            return
        L_0x0145:
            if (r5 == 0) goto L_0x0168
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r4)
            if (r0 == 0) goto L_0x03aa
            androidx.constraintlayout.a.b.a.g r2 = r8.f4544j
            androidx.constraintlayout.a.b.f r3 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r3 = r3.f4602V
            r1 = r3[r1]
            int r1 = r1.mo4601b()
            m4377j(r2, r0, r1)
            androidx.constraintlayout.a.b.a.g r0 = r8.f4545k
            androidx.constraintlayout.a.b.a.g r1 = r8.f4544j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            int r2 = r2.f4514f
            m4377j(r0, r1, r2)
            return
        L_0x0168:
            r0 = r0[r3]
            androidx.constraintlayout.a.b.d r1 = r0.f4571e
            if (r1 == 0) goto L_0x0191
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r0)
            if (r0 == 0) goto L_0x03aa
            androidx.constraintlayout.a.b.a.g r1 = r8.f4545k
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r2 = r2[r3]
            int r2 = r2.mo4601b()
            int r2 = -r2
            m4377j(r1, r0, r2)
            androidx.constraintlayout.a.b.a.g r0 = r8.f4544j
            androidx.constraintlayout.a.b.a.g r1 = r8.f4545k
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            int r2 = r2.f4514f
            int r2 = -r2
            m4377j(r0, r1, r2)
            return
        L_0x0191:
            boolean r0 = r2 instanceof androidx.constraintlayout.p079a.p082b.C1643k
            if (r0 != 0) goto L_0x03aa
            androidx.constraintlayout.a.b.f r0 = r2.f4606Z
            if (r0 == 0) goto L_0x03aa
            r0 = 7
            androidx.constraintlayout.a.b.d r0 = r2.mo4626L(r0)
            androidx.constraintlayout.a.b.d r0 = r0.f4571e
            if (r0 != 0) goto L_0x03aa
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.f r1 = r0.f4606Z
            androidx.constraintlayout.a.b.a.m r1 = r1.f4652h
            androidx.constraintlayout.a.b.a.g r1 = r1.f4544j
            androidx.constraintlayout.a.b.a.g r2 = r8.f4544j
            int r0 = r0.mo4632j()
            m4377j(r2, r1, r0)
            androidx.constraintlayout.a.b.a.g r0 = r8.f4545k
            androidx.constraintlayout.a.b.a.g r1 = r8.f4544j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            int r2 = r2.f4514f
            m4377j(r0, r1, r2)
            return
        L_0x01bf:
            androidx.constraintlayout.a.b.e r2 = r8.f4540f
            androidx.constraintlayout.a.b.e r4 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x02ee
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            int r4 = r2.f4664t
            r5 = 2
            if (r4 == r5) goto L_0x02c6
            r5 = 3
            if (r4 == r5) goto L_0x01d1
            goto L_0x02ee
        L_0x01d1:
            int r4 = r2.f4665u
            if (r4 != r5) goto L_0x0275
            androidx.constraintlayout.a.b.a.g r4 = r8.f4544j
            r4.f4509a = r8
            androidx.constraintlayout.a.b.a.g r4 = r8.f4545k
            r4.f4509a = r8
            androidx.constraintlayout.a.b.a.o r4 = r2.f4653i
            androidx.constraintlayout.a.b.a.g r5 = r4.f4544j
            r5.f4509a = r8
            androidx.constraintlayout.a.b.a.g r4 = r4.f4545k
            r4.f4509a = r8
            r0.f4509a = r8
            boolean r0 = r2.mo4624J()
            if (r0 == 0) goto L_0x0243
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            java.util.List r0 = r0.f4519k
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r2 = r2.f4653i
            androidx.constraintlayout.a.b.a.h r2 = r2.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.h r2 = r0.f4541g
            r2.f4509a = r8
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            java.util.List r2 = r2.f4519k
            androidx.constraintlayout.a.b.a.g r0 = r0.f4544j
            r2.add(r0)
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            java.util.List r0 = r0.f4519k
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r2 = r2.f4653i
            androidx.constraintlayout.a.b.a.g r2 = r2.f4545k
            r0.add(r2)
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.g r0 = r0.f4544j
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.g r0 = r0.f4545k
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            goto L_0x02ee
        L_0x0243:
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            boolean r0 = r0.mo4623I()
            if (r0 == 0) goto L_0x0267
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            java.util.List r0 = r0.f4519k
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r2 = r2.f4653i
            androidx.constraintlayout.a.b.a.h r2 = r2.f4541g
            r0.add(r2)
            goto L_0x02ee
        L_0x0267:
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            java.util.List r0 = r0.f4519k
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            goto L_0x02ee
        L_0x0275:
            androidx.constraintlayout.a.b.a.o r2 = r2.f4653i
            androidx.constraintlayout.a.b.a.h r2 = r2.f4541g
            java.util.List r0 = r0.f4519k
            r0.add(r2)
            java.util.List r0 = r2.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.g r0 = r0.f4544j
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.g r0 = r0.f4545k
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            r0.f4510b = r3
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.g r2 = r8.f4544j
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.g r2 = r8.f4545k
            r0.add(r2)
            androidx.constraintlayout.a.b.a.g r0 = r8.f4544j
            java.util.List r0 = r0.f4519k
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.g r0 = r8.f4545k
            java.util.List r0 = r0.f4519k
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            goto L_0x02ee
        L_0x02c6:
            androidx.constraintlayout.a.b.f r2 = r2.f4606Z
            if (r2 == 0) goto L_0x02ee
            androidx.constraintlayout.a.b.a.o r2 = r2.f4653i
            androidx.constraintlayout.a.b.a.h r2 = r2.f4541g
            java.util.List r0 = r0.f4519k
            r0.add(r2)
            java.util.List r0 = r2.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            r0.f4510b = r3
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.g r2 = r8.f4544j
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r8.f4541g
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.g r2 = r8.f4545k
            r0.add(r2)
        L_0x02ee:
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r0.f4602V
            r4 = r2[r1]
            androidx.constraintlayout.a.b.d r5 = r4.f4571e
            if (r5 == 0) goto L_0x0344
            r6 = r2[r3]
            androidx.constraintlayout.a.b.d r6 = r6.f4571e
            if (r6 == 0) goto L_0x0344
            boolean r0 = r0.mo4623I()
            if (r0 == 0) goto L_0x0322
            androidx.constraintlayout.a.b.a.g r0 = r8.f4544j
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r1 = r2[r1]
            int r1 = r1.mo4601b()
            r0.f4513e = r1
            androidx.constraintlayout.a.b.a.g r0 = r8.f4545k
            androidx.constraintlayout.a.b.f r1 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r1 = r1.f4602V
            r1 = r1[r3]
            int r1 = r1.mo4601b()
            int r1 = -r1
            r0.f4513e = r1
            return
        L_0x0322:
            androidx.constraintlayout.a.b.f r0 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r0 = r0.f4602V
            r0 = r0[r1]
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r0)
            androidx.constraintlayout.a.b.f r1 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r1 = r1.f4602V
            r1 = r1[r3]
            androidx.constraintlayout.a.b.a.g r1 = m4378k(r1)
            if (r0 == 0) goto L_0x033b
            r0.mo4582a(r8)
        L_0x033b:
            if (r1 == 0) goto L_0x0340
            r1.mo4582a(r8)
        L_0x0340:
            r0 = 4
            r8.f4546l = r0
            return
        L_0x0344:
            if (r5 == 0) goto L_0x0365
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r4)
            if (r0 == 0) goto L_0x03aa
            androidx.constraintlayout.a.b.a.g r2 = r8.f4544j
            androidx.constraintlayout.a.b.f r4 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r4 = r4.f4602V
            r1 = r4[r1]
            int r1 = r1.mo4601b()
            m4377j(r2, r0, r1)
            androidx.constraintlayout.a.b.a.g r0 = r8.f4545k
            androidx.constraintlayout.a.b.a.g r1 = r8.f4544j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r8.mo4598i(r0, r1, r3, r2)
            return
        L_0x0365:
            r1 = r2[r3]
            androidx.constraintlayout.a.b.d r2 = r1.f4571e
            if (r2 == 0) goto L_0x038c
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r1)
            if (r0 == 0) goto L_0x03aa
            androidx.constraintlayout.a.b.a.g r1 = r8.f4545k
            androidx.constraintlayout.a.b.f r2 = r8.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r2 = r2[r3]
            int r2 = r2.mo4601b()
            int r2 = -r2
            m4377j(r1, r0, r2)
            androidx.constraintlayout.a.b.a.g r0 = r8.f4544j
            androidx.constraintlayout.a.b.a.g r1 = r8.f4545k
            r2 = -1
            androidx.constraintlayout.a.b.a.h r3 = r8.f4541g
            r8.mo4598i(r0, r1, r2, r3)
            return
        L_0x038c:
            boolean r1 = r0 instanceof androidx.constraintlayout.p079a.p082b.C1643k
            if (r1 != 0) goto L_0x03aa
            androidx.constraintlayout.a.b.f r1 = r0.f4606Z
            if (r1 == 0) goto L_0x03aa
            androidx.constraintlayout.a.b.a.m r1 = r1.f4652h
            androidx.constraintlayout.a.b.a.g r1 = r1.f4544j
            androidx.constraintlayout.a.b.a.g r2 = r8.f4544j
            int r0 = r0.mo4632j()
            m4377j(r2, r1, r0)
            androidx.constraintlayout.a.b.a.g r0 = r8.f4545k
            androidx.constraintlayout.a.b.a.g r1 = r8.f4544j
            androidx.constraintlayout.a.b.a.h r2 = r8.f4541g
            r8.mo4598i(r0, r1, r3, r2)
        L_0x03aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.p083a.C1628m.mo4571b():void");
    }

    /* renamed from: c */
    public final void mo4572c() {
        C1622g gVar = this.f4544j;
        if (gVar.f4517i) {
            this.f4538d.f4625ae = gVar.f4514f;
        }
    }

    /* renamed from: d */
    public final void mo4573d() {
        this.f4539e = null;
        this.f4544j.mo4583b();
        this.f4545k.mo4583b();
        this.f4541g.mo4583b();
        this.f4543i = false;
    }

    /* renamed from: e */
    public final boolean mo4574e() {
        if (this.f4540f != C1637e.MATCH_CONSTRAINT || this.f4538d.f4664t == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo4586g() {
        this.f4543i = false;
        this.f4544j.mo4583b();
        this.f4544j.f4517i = false;
        this.f4545k.mo4583b();
        this.f4545k.f4517i = false;
        this.f4541g.f4517i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.f4538d.f4638ar));
    }

    /* renamed from: f */
    public final void mo4575f() {
        float f;
        float f2;
        float f3;
        int i = this.f4546l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 3) {
            if (!this.f4541g.f4517i && this.f4540f == C1637e.MATCH_CONSTRAINT) {
                C1638f fVar = this.f4538d;
                int i3 = fVar.f4664t;
                if (i3 == 2) {
                    C1638f fVar2 = fVar.f4606Z;
                    if (fVar2 != null) {
                        C1623h hVar = fVar2.f4652h.f4541g;
                        if (hVar.f4517i) {
                            this.f4541g.mo4584c((int) ((((float) hVar.f4514f) * fVar.f4669y) + 0.5f));
                        }
                    }
                } else if (i3 == 3) {
                    int i4 = fVar.f4665u;
                    if (i4 == 0 || i4 == 3) {
                        C1630o oVar = fVar.f4653i;
                        C1622g gVar = oVar.f4544j;
                        C1622g gVar2 = oVar.f4545k;
                        boolean z = fVar.f4594N.f4571e != null;
                        boolean z2 = fVar.f4595O.f4571e != null;
                        boolean z3 = fVar.f4596P.f4571e != null;
                        boolean z4 = fVar.f4597Q.f4571e != null;
                        int i5 = fVar.f4624ad;
                        if (!z || !z2 || !z3 || !z4) {
                            int i6 = i5;
                            if (z && z3) {
                                C1622g gVar3 = this.f4544j;
                                if (gVar3.f4511c && this.f4545k.f4511c) {
                                    float f4 = fVar.f4623ac;
                                    int i7 = ((C1622g) gVar3.f4519k.get(0)).f4514f + this.f4544j.f4513e;
                                    int i8 = ((C1622g) this.f4545k.f4519k.get(0)).f4514f - this.f4545k.f4513e;
                                    if (i6 == -1 || i6 == 0) {
                                        int h = mo4597h(i8 - i7, 0);
                                        int i9 = (int) ((((float) h) * f4) + 0.5f);
                                        int h2 = mo4597h(i9, 1);
                                        if (i9 != h2) {
                                            h = (int) ((((float) h2) / f4) + 0.5f);
                                        }
                                        this.f4541g.mo4584c(h);
                                        this.f4538d.f4653i.f4541g.mo4584c(h2);
                                    } else {
                                        int h3 = mo4597h(i8 - i7, 0);
                                        int i10 = (int) ((((float) h3) / f4) + 0.5f);
                                        int h4 = mo4597h(i10, 1);
                                        if (i10 != h4) {
                                            h3 = (int) ((((float) h4) * f4) + 0.5f);
                                        }
                                        this.f4541g.mo4584c(h3);
                                        this.f4538d.f4653i.f4541g.mo4584c(h4);
                                    }
                                } else {
                                    return;
                                }
                            } else if (z2 && z4) {
                                if (gVar.f4511c && gVar2.f4511c) {
                                    float f5 = fVar.f4623ac;
                                    int i11 = ((C1622g) gVar.f4519k.get(0)).f4514f + gVar.f4513e;
                                    int i12 = ((C1622g) gVar2.f4519k.get(0)).f4514f - gVar2.f4513e;
                                    if (i6 != 0) {
                                        int h5 = mo4597h(i12 - i11, 1);
                                        int i13 = (int) ((((float) h5) / f5) + 0.5f);
                                        int h6 = mo4597h(i13, 0);
                                        if (i13 != h6) {
                                            h5 = (int) ((((float) h6) * f5) + 0.5f);
                                        }
                                        this.f4541g.mo4584c(h6);
                                        this.f4538d.f4653i.f4541g.mo4584c(h5);
                                    } else {
                                        int h7 = mo4597h(i12 - i11, 1);
                                        int i14 = (int) ((((float) h7) * f5) + 0.5f);
                                        int h8 = mo4597h(i14, 0);
                                        if (i14 != h8) {
                                            h7 = (int) ((((float) h8) / f5) + 0.5f);
                                        }
                                        this.f4541g.mo4584c(h8);
                                        this.f4538d.f4653i.f4541g.mo4584c(h7);
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            float f6 = fVar.f4623ac;
                            if (!gVar.f4517i || !gVar2.f4517i) {
                                int i15 = i5;
                                C1622g gVar4 = this.f4544j;
                                if (gVar4.f4517i) {
                                    C1622g gVar5 = this.f4545k;
                                    if (gVar5.f4517i) {
                                        if (gVar.f4511c && gVar2.f4511c) {
                                            int i16 = gVar4.f4514f;
                                            int i17 = gVar4.f4513e;
                                            int i18 = gVar5.f4514f;
                                            int i19 = gVar5.f4513e;
                                            int i20 = ((C1622g) gVar.f4519k.get(0)).f4514f;
                                            int i21 = gVar.f4513e;
                                            int i22 = ((C1622g) gVar2.f4519k.get(0)).f4514f;
                                            int i23 = gVar2.f4513e;
                                            int[] iArr = f4525a;
                                            m4358n(iArr, i17 + i16, i18 - i19, i20 + i21, i22 - i23, f6, i15);
                                            this.f4541g.mo4584c(iArr[0]);
                                            this.f4538d.f4653i.f4541g.mo4584c(iArr[1]);
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                C1622g gVar6 = this.f4544j;
                                if (gVar6.f4511c && this.f4545k.f4511c && gVar.f4511c && gVar2.f4511c) {
                                    int i24 = ((C1622g) gVar6.f4519k.get(0)).f4514f;
                                    int i25 = this.f4544j.f4513e;
                                    int i26 = ((C1622g) this.f4545k.f4519k.get(0)).f4514f;
                                    int i27 = this.f4545k.f4513e;
                                    int i28 = ((C1622g) gVar.f4519k.get(0)).f4514f;
                                    int i29 = gVar.f4513e;
                                    int i30 = ((C1622g) gVar2.f4519k.get(0)).f4514f;
                                    int i31 = gVar2.f4513e;
                                    int[] iArr2 = f4525a;
                                    m4358n(iArr2, i24 + i25, i26 - i27, i28 + i29, i30 - i31, f6, i15);
                                    this.f4541g.mo4584c(iArr2[0]);
                                    this.f4538d.f4653i.f4541g.mo4584c(iArr2[1]);
                                } else {
                                    return;
                                }
                            } else {
                                C1622g gVar7 = this.f4544j;
                                if (gVar7.f4511c && this.f4545k.f4511c) {
                                    int i32 = ((C1622g) gVar7.f4519k.get(0)).f4514f;
                                    int i33 = this.f4544j.f4513e;
                                    int i34 = ((C1622g) this.f4545k.f4519k.get(0)).f4514f;
                                    int i35 = this.f4545k.f4513e;
                                    int i36 = gVar.f4514f;
                                    int i37 = gVar.f4513e;
                                    int i38 = gVar2.f4514f;
                                    int i39 = gVar2.f4513e;
                                    int[] iArr3 = f4525a;
                                    m4358n(iArr3, i32 + i33, i34 - i35, i36 + i37, i38 - i39, f6, i5);
                                    this.f4541g.mo4584c(iArr3[0]);
                                    this.f4538d.f4653i.f4541g.mo4584c(iArr3[1]);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        int i40 = fVar.f4624ad;
                        if (i40 == -1) {
                            f3 = (float) fVar.f4653i.f4541g.f4514f;
                            f2 = fVar.f4623ac;
                        } else if (i40 != 0) {
                            f3 = (float) fVar.f4653i.f4541g.f4514f;
                            f2 = fVar.f4623ac;
                        } else {
                            f = ((float) fVar.f4653i.f4541g.f4514f) / fVar.f4623ac;
                            this.f4541g.mo4584c((int) (f + 0.5f));
                        }
                        f = f3 * f2;
                        this.f4541g.mo4584c((int) (f + 0.5f));
                    }
                }
            }
            C1622g gVar8 = this.f4544j;
            if (gVar8.f4511c) {
                C1622g gVar9 = this.f4545k;
                if (gVar9.f4511c) {
                    if (!gVar8.f4517i || !gVar9.f4517i || !this.f4541g.f4517i) {
                        if (!this.f4541g.f4517i && this.f4540f == C1637e.MATCH_CONSTRAINT) {
                            C1638f fVar3 = this.f4538d;
                            if (fVar3.f4664t == 0 && !fVar3.mo4623I()) {
                                int i41 = ((C1622g) this.f4544j.f4519k.get(0)).f4514f;
                                C1622g gVar10 = this.f4544j;
                                int i42 = i41 + gVar10.f4513e;
                                int i43 = ((C1622g) this.f4545k.f4519k.get(0)).f4514f + this.f4545k.f4513e;
                                gVar10.mo4584c(i42);
                                this.f4545k.mo4584c(i43);
                                this.f4541g.mo4584c(i43 - i42);
                                return;
                            }
                        }
                        if (!this.f4541g.f4517i && this.f4540f == C1637e.MATCH_CONSTRAINT && this.f4537c == 1 && this.f4544j.f4519k.size() > 0 && this.f4545k.f4519k.size() > 0) {
                            int min = Math.min((((C1622g) this.f4545k.f4519k.get(0)).f4514f + this.f4545k.f4513e) - (((C1622g) this.f4544j.f4519k.get(0)).f4514f + this.f4544j.f4513e), this.f4541g.f4521m);
                            C1638f fVar4 = this.f4538d;
                            int i44 = fVar4.f4668x;
                            int max = Math.max(fVar4.f4667w, min);
                            if (i44 > 0) {
                                max = Math.min(i44, max);
                            }
                            this.f4541g.mo4584c(max);
                        }
                        if (this.f4541g.f4517i) {
                            C1622g gVar11 = (C1622g) this.f4544j.f4519k.get(0);
                            C1622g gVar12 = (C1622g) this.f4545k.f4519k.get(0);
                            int i45 = gVar11.f4514f;
                            C1622g gVar13 = this.f4544j;
                            int i46 = gVar13.f4513e + i45;
                            int i47 = gVar12.f4514f;
                            int i48 = this.f4545k.f4513e + i47;
                            float f7 = this.f4538d.f4634an;
                            if (gVar11 == gVar12) {
                                f7 = 0.5f;
                            }
                            if (gVar11 != gVar12) {
                                i47 = i48;
                            }
                            if (gVar11 != gVar12) {
                                i45 = i46;
                            }
                            gVar13.mo4584c((int) (((float) i45) + 0.5f + (((float) ((i47 - i45) - this.f4541g.f4514f)) * f7)));
                            this.f4545k.mo4584c(this.f4544j.f4514f + this.f4541g.f4514f);
                        }
                    }
                }
            }
        } else {
            C1638f fVar5 = this.f4538d;
            mo4599m(fVar5.f4594N, fVar5.f4596P, 0);
        }
    }
}

package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1637e;
import androidx.constraintlayout.p079a.p082b.C1638f;

/* renamed from: androidx.constraintlayout.a.b.a.o */
/* compiled from: PG */
public final class C1630o extends C1633r {

    /* renamed from: a */
    public final C1622g f4529a;

    /* renamed from: b */
    C1623h f4530b = null;

    public C1630o(C1638f fVar) {
        super(fVar);
        C1622g gVar = new C1622g(this);
        this.f4529a = gVar;
        this.f4544j.f4520l = 6;
        this.f4545k.f4520l = 7;
        gVar.f4520l = 8;
        this.f4542h = 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r10.f4538d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        r0 = r10.f4538d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4571b() {
        /*
            r10 = this;
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            boolean r1 = r0.f4649e
            if (r1 == 0) goto L_0x000f
            androidx.constraintlayout.a.b.a.h r1 = r10.f4541g
            int r0 = r0.mo4630h()
            r1.mo4584c(r0)
        L_0x000f:
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            boolean r0 = r0.f4517i
            r1 = 1
            if (r0 != 0) goto L_0x0091
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            androidx.constraintlayout.a.b.e[] r2 = r0.f4605Y
            r2 = r2[r1]
            r10.f4540f = r2
            boolean r0 = r0.f4589I
            if (r0 == 0) goto L_0x0029
            androidx.constraintlayout.a.b.a.a r0 = new androidx.constraintlayout.a.b.a.a
            r0.<init>(r10)
            r10.f4530b = r0
        L_0x0029:
            androidx.constraintlayout.a.b.e r0 = r10.f4540f
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r0 == r2) goto L_0x00c7
            androidx.constraintlayout.a.b.e r0 = r10.f4540f
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r0 != r2) goto L_0x0081
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.f r3 = r2.f4606Z
            if (r3 == 0) goto L_0x0081
            androidx.constraintlayout.a.b.e[] r4 = r3.f4605Y
            r4 = r4[r1]
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r4 == r5) goto L_0x0044
            goto L_0x0081
        L_0x0044:
            int r0 = r3.mo4630h()
            androidx.constraintlayout.a.b.d r1 = r2.f4595O
            int r1 = r1.mo4601b()
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.d r2 = r2.f4597Q
            int r2 = r2.mo4601b()
            androidx.constraintlayout.a.b.a.g r4 = r10.f4544j
            androidx.constraintlayout.a.b.a.o r5 = r3.f4653i
            androidx.constraintlayout.a.b.a.g r5 = r5.f4544j
            androidx.constraintlayout.a.b.f r6 = r10.f4538d
            androidx.constraintlayout.a.b.d r6 = r6.f4595O
            int r6 = r6.mo4601b()
            m4377j(r4, r5, r6)
            androidx.constraintlayout.a.b.a.g r4 = r10.f4545k
            androidx.constraintlayout.a.b.a.o r3 = r3.f4653i
            androidx.constraintlayout.a.b.a.g r3 = r3.f4545k
            androidx.constraintlayout.a.b.f r5 = r10.f4538d
            androidx.constraintlayout.a.b.d r5 = r5.f4597Q
            int r5 = r5.mo4601b()
            int r5 = -r5
            m4377j(r4, r3, r5)
            androidx.constraintlayout.a.b.a.h r3 = r10.f4541g
            int r0 = r0 - r1
            int r0 = r0 - r2
            r3.mo4584c(r0)
            return
        L_0x0081:
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r0 != r2) goto L_0x00c7
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            int r2 = r2.mo4630h()
            r0.mo4584c(r2)
            goto L_0x00c7
        L_0x0091:
            androidx.constraintlayout.a.b.e r0 = r10.f4540f
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r0 != r2) goto L_0x00c7
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            androidx.constraintlayout.a.b.f r2 = r0.f4606Z
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.a.b.e[] r3 = r2.f4605Y
            r3 = r3[r1]
            androidx.constraintlayout.a.b.e r4 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r3 != r4) goto L_0x00c7
            androidx.constraintlayout.a.b.a.g r1 = r10.f4544j
            androidx.constraintlayout.a.b.a.o r3 = r2.f4653i
            androidx.constraintlayout.a.b.a.g r3 = r3.f4544j
            androidx.constraintlayout.a.b.d r0 = r0.f4595O
            int r0 = r0.mo4601b()
            m4377j(r1, r3, r0)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            androidx.constraintlayout.a.b.a.o r1 = r2.f4653i
            androidx.constraintlayout.a.b.a.g r1 = r1.f4545k
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.d r2 = r2.f4597Q
            int r2 = r2.mo4601b()
            int r2 = -r2
            m4377j(r0, r1, r2)
            return
        L_0x00c7:
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            boolean r2 = r0.f4517i
            r3 = 0
            r4 = 4
            r5 = 2
            r6 = 3
            if (r2 == 0) goto L_0x0228
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            boolean r7 = r2.f4649e
            if (r7 == 0) goto L_0x0293
            androidx.constraintlayout.a.b.d[] r0 = r2.f4602V
            r7 = r0[r5]
            androidx.constraintlayout.a.b.d r8 = r7.f4571e
            if (r8 == 0) goto L_0x0158
            r9 = r0[r6]
            androidx.constraintlayout.a.b.d r9 = r9.f4571e
            if (r9 == 0) goto L_0x0158
            boolean r0 = r2.mo4624J()
            if (r0 == 0) goto L_0x0109
            androidx.constraintlayout.a.b.a.g r0 = r10.f4544j
            androidx.constraintlayout.a.b.f r1 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r1 = r1.f4602V
            r1 = r1[r5]
            int r1 = r1.mo4601b()
            r0.f4513e = r1
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            androidx.constraintlayout.a.b.f r1 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r1 = r1.f4602V
            r1 = r1[r6]
            int r1 = r1.mo4601b()
            int r1 = -r1
            r0.f4513e = r1
            goto L_0x0148
        L_0x0109:
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r0 = r0.f4602V
            r0 = r0[r5]
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r0)
            if (r0 == 0) goto L_0x0124
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            androidx.constraintlayout.a.b.f r3 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r3 = r3.f4602V
            r3 = r3[r5]
            int r3 = r3.mo4601b()
            m4377j(r2, r0, r3)
        L_0x0124:
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r0 = r0.f4602V
            r0 = r0[r6]
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r0)
            if (r0 == 0) goto L_0x0140
            androidx.constraintlayout.a.b.a.g r2 = r10.f4545k
            androidx.constraintlayout.a.b.f r3 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r3 = r3.f4602V
            r3 = r3[r6]
            int r3 = r3.mo4601b()
            int r3 = -r3
            m4377j(r2, r0, r3)
        L_0x0140:
            androidx.constraintlayout.a.b.a.g r0 = r10.f4544j
            r0.f4510b = r1
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            r0.f4510b = r1
        L_0x0148:
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            boolean r1 = r0.f4589I
            if (r1 == 0) goto L_0x041f
            androidx.constraintlayout.a.b.a.g r1 = r10.f4529a
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            int r0 = r0.f4631ak
            m4377j(r1, r2, r0)
            return
        L_0x0158:
            if (r8 == 0) goto L_0x018a
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r7)
            if (r0 == 0) goto L_0x041f
            androidx.constraintlayout.a.b.a.g r1 = r10.f4544j
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r2 = r2[r5]
            int r2 = r2.mo4601b()
            m4377j(r1, r0, r2)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            androidx.constraintlayout.a.b.a.g r1 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r2 = r10.f4541g
            int r2 = r2.f4514f
            m4377j(r0, r1, r2)
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            boolean r1 = r0.f4589I
            if (r1 == 0) goto L_0x041f
            androidx.constraintlayout.a.b.a.g r1 = r10.f4529a
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            int r0 = r0.f4631ak
            m4377j(r1, r2, r0)
            return
        L_0x018a:
            r1 = r0[r6]
            androidx.constraintlayout.a.b.d r5 = r1.f4571e
            if (r5 == 0) goto L_0x01c2
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r1)
            if (r0 == 0) goto L_0x01b2
            androidx.constraintlayout.a.b.a.g r1 = r10.f4545k
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r2 = r2[r6]
            int r2 = r2.mo4601b()
            int r2 = -r2
            m4377j(r1, r0, r2)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4544j
            androidx.constraintlayout.a.b.a.g r1 = r10.f4545k
            androidx.constraintlayout.a.b.a.h r2 = r10.f4541g
            int r2 = r2.f4514f
            int r2 = -r2
            m4377j(r0, r1, r2)
        L_0x01b2:
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            boolean r1 = r0.f4589I
            if (r1 == 0) goto L_0x041f
            androidx.constraintlayout.a.b.a.g r1 = r10.f4529a
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            int r0 = r0.f4631ak
            m4377j(r1, r2, r0)
            return
        L_0x01c2:
            r0 = r0[r4]
            androidx.constraintlayout.a.b.d r1 = r0.f4571e
            if (r1 == 0) goto L_0x01eb
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r0)
            if (r0 == 0) goto L_0x041f
            androidx.constraintlayout.a.b.a.g r1 = r10.f4529a
            m4377j(r1, r0, r3)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4544j
            androidx.constraintlayout.a.b.a.g r1 = r10.f4529a
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            int r2 = r2.f4631ak
            int r2 = -r2
            m4377j(r0, r1, r2)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            androidx.constraintlayout.a.b.a.g r1 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r2 = r10.f4541g
            int r2 = r2.f4514f
            m4377j(r0, r1, r2)
            return
        L_0x01eb:
            boolean r0 = r2 instanceof androidx.constraintlayout.p079a.p082b.C1643k
            if (r0 != 0) goto L_0x041f
            androidx.constraintlayout.a.b.f r0 = r2.f4606Z
            if (r0 == 0) goto L_0x041f
            r0 = 7
            androidx.constraintlayout.a.b.d r0 = r2.mo4626L(r0)
            androidx.constraintlayout.a.b.d r0 = r0.f4571e
            if (r0 != 0) goto L_0x041f
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            androidx.constraintlayout.a.b.f r1 = r0.f4606Z
            androidx.constraintlayout.a.b.a.o r1 = r1.f4653i
            androidx.constraintlayout.a.b.a.g r1 = r1.f4544j
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            int r0 = r0.mo4633k()
            m4377j(r2, r1, r0)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            androidx.constraintlayout.a.b.a.g r1 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r2 = r10.f4541g
            int r2 = r2.f4514f
            m4377j(r0, r1, r2)
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            boolean r1 = r0.f4589I
            if (r1 == 0) goto L_0x041f
            androidx.constraintlayout.a.b.a.g r1 = r10.f4529a
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            int r0 = r0.f4631ak
            m4377j(r1, r2, r0)
            return
        L_0x0228:
            androidx.constraintlayout.a.b.e r2 = r10.f4540f
            androidx.constraintlayout.a.b.e r7 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r2 != r7) goto L_0x0293
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            int r7 = r2.f4665u
            if (r7 == r5) goto L_0x026a
            if (r7 == r6) goto L_0x0237
            goto L_0x0296
        L_0x0237:
            boolean r0 = r2.mo4624J()
            if (r0 != 0) goto L_0x0296
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            int r2 = r0.f4664t
            if (r2 == r6) goto L_0x0296
            androidx.constraintlayout.a.b.a.m r0 = r0.f4652h
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            androidx.constraintlayout.a.b.a.h r2 = r10.f4541g
            java.util.List r2 = r2.f4519k
            r2.add(r0)
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r10.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            r0.f4510b = r1
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.g r2 = r10.f4545k
            r0.add(r2)
            goto L_0x0296
        L_0x026a:
            androidx.constraintlayout.a.b.f r2 = r2.f4606Z
            if (r2 == 0) goto L_0x0296
            androidx.constraintlayout.a.b.a.o r2 = r2.f4653i
            androidx.constraintlayout.a.b.a.h r2 = r2.f4541g
            java.util.List r0 = r0.f4519k
            r0.add(r2)
            java.util.List r0 = r2.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r10.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            r0.f4510b = r1
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.g r2 = r10.f4545k
            r0.add(r2)
            goto L_0x0296
        L_0x0293:
            r0.mo4582a(r10)
        L_0x0296:
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r0.f4602V
            r7 = r2[r5]
            androidx.constraintlayout.a.b.d r8 = r7.f4571e
            if (r8 == 0) goto L_0x02fb
            r9 = r2[r6]
            androidx.constraintlayout.a.b.d r9 = r9.f4571e
            if (r9 == 0) goto L_0x02fb
            boolean r0 = r0.mo4624J()
            if (r0 == 0) goto L_0x02ca
            androidx.constraintlayout.a.b.a.g r0 = r10.f4544j
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r2 = r2[r5]
            int r2 = r2.mo4601b()
            r0.f4513e = r2
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r2 = r2[r6]
            int r2 = r2.mo4601b()
            int r2 = -r2
            r0.f4513e = r2
            goto L_0x02ea
        L_0x02ca:
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r0 = r0.f4602V
            r0 = r0[r5]
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r0)
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r2 = r2.f4602V
            r2 = r2[r6]
            androidx.constraintlayout.a.b.a.g r2 = m4378k(r2)
            if (r0 == 0) goto L_0x02e3
            r0.mo4582a(r10)
        L_0x02e3:
            if (r2 == 0) goto L_0x02e8
            r2.mo4582a(r10)
        L_0x02e8:
            r10.f4546l = r4
        L_0x02ea:
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            boolean r0 = r0.f4589I
            if (r0 == 0) goto L_0x0411
            androidx.constraintlayout.a.b.a.g r0 = r10.f4529a
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r3 = r10.f4530b
            r10.mo4598i(r0, r2, r1, r3)
            goto L_0x0411
        L_0x02fb:
            r9 = 0
            if (r8 == 0) goto L_0x035b
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r7)
            if (r0 == 0) goto L_0x0411
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            androidx.constraintlayout.a.b.f r3 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r3 = r3.f4602V
            r3 = r3[r5]
            int r3 = r3.mo4601b()
            m4377j(r2, r0, r3)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r3 = r10.f4541g
            r10.mo4598i(r0, r2, r1, r3)
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            boolean r0 = r0.f4589I
            if (r0 == 0) goto L_0x032b
            androidx.constraintlayout.a.b.a.g r0 = r10.f4529a
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r3 = r10.f4530b
            r10.mo4598i(r0, r2, r1, r3)
        L_0x032b:
            androidx.constraintlayout.a.b.e r0 = r10.f4540f
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x0411
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            float r3 = r0.f4623ac
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0411
            androidx.constraintlayout.a.b.a.m r0 = r0.f4652h
            androidx.constraintlayout.a.b.e r3 = r0.f4540f
            if (r3 != r2) goto L_0x0411
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r10.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            java.util.List r0 = r0.f4519k
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.a.m r2 = r2.f4652h
            androidx.constraintlayout.a.b.a.h r2 = r2.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            r0.f4509a = r10
            goto L_0x0411
        L_0x035b:
            r5 = r2[r6]
            androidx.constraintlayout.a.b.d r7 = r5.f4571e
            r8 = -1
            if (r7 == 0) goto L_0x0392
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r5)
            if (r0 == 0) goto L_0x0411
            androidx.constraintlayout.a.b.a.g r2 = r10.f4545k
            androidx.constraintlayout.a.b.f r3 = r10.f4538d
            androidx.constraintlayout.a.b.d[] r3 = r3.f4602V
            r3 = r3[r6]
            int r3 = r3.mo4601b()
            int r3 = -r3
            m4377j(r2, r0, r3)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4544j
            androidx.constraintlayout.a.b.a.g r2 = r10.f4545k
            androidx.constraintlayout.a.b.a.h r3 = r10.f4541g
            r10.mo4598i(r0, r2, r8, r3)
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            boolean r0 = r0.f4589I
            if (r0 == 0) goto L_0x0411
            androidx.constraintlayout.a.b.a.g r0 = r10.f4529a
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r3 = r10.f4530b
            r10.mo4598i(r0, r2, r1, r3)
            goto L_0x0411
        L_0x0392:
            r2 = r2[r4]
            androidx.constraintlayout.a.b.d r4 = r2.f4571e
            if (r4 == 0) goto L_0x03b6
            androidx.constraintlayout.a.b.a.g r0 = m4378k(r2)
            if (r0 == 0) goto L_0x0411
            androidx.constraintlayout.a.b.a.g r2 = r10.f4529a
            m4377j(r2, r0, r3)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4544j
            androidx.constraintlayout.a.b.a.g r2 = r10.f4529a
            androidx.constraintlayout.a.b.a.h r3 = r10.f4530b
            r10.mo4598i(r0, r2, r8, r3)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r3 = r10.f4541g
            r10.mo4598i(r0, r2, r1, r3)
            goto L_0x0411
        L_0x03b6:
            boolean r2 = r0 instanceof androidx.constraintlayout.p079a.p082b.C1643k
            if (r2 != 0) goto L_0x0411
            androidx.constraintlayout.a.b.f r2 = r0.f4606Z
            if (r2 == 0) goto L_0x0411
            androidx.constraintlayout.a.b.a.o r2 = r2.f4653i
            androidx.constraintlayout.a.b.a.g r2 = r2.f4544j
            androidx.constraintlayout.a.b.a.g r3 = r10.f4544j
            int r0 = r0.mo4633k()
            m4377j(r3, r2, r0)
            androidx.constraintlayout.a.b.a.g r0 = r10.f4545k
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r3 = r10.f4541g
            r10.mo4598i(r0, r2, r1, r3)
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            boolean r0 = r0.f4589I
            if (r0 == 0) goto L_0x03e3
            androidx.constraintlayout.a.b.a.g r0 = r10.f4529a
            androidx.constraintlayout.a.b.a.g r2 = r10.f4544j
            androidx.constraintlayout.a.b.a.h r3 = r10.f4530b
            r10.mo4598i(r0, r2, r1, r3)
        L_0x03e3:
            androidx.constraintlayout.a.b.e r0 = r10.f4540f
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x0411
            androidx.constraintlayout.a.b.f r0 = r10.f4538d
            float r3 = r0.f4623ac
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0411
            androidx.constraintlayout.a.b.a.m r0 = r0.f4652h
            androidx.constraintlayout.a.b.e r3 = r0.f4540f
            if (r3 != r2) goto L_0x0411
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            java.util.List r0 = r0.f4518j
            androidx.constraintlayout.a.b.a.h r2 = r10.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            java.util.List r0 = r0.f4519k
            androidx.constraintlayout.a.b.f r2 = r10.f4538d
            androidx.constraintlayout.a.b.a.m r2 = r2.f4652h
            androidx.constraintlayout.a.b.a.h r2 = r2.f4541g
            r0.add(r2)
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            r0.f4509a = r10
        L_0x0411:
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            java.util.List r0 = r0.f4519k
            int r0 = r0.size()
            if (r0 != 0) goto L_0x041f
            androidx.constraintlayout.a.b.a.h r0 = r10.f4541g
            r0.f4511c = r1
        L_0x041f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.p083a.C1630o.mo4571b():void");
    }

    /* renamed from: c */
    public final void mo4572c() {
        C1622g gVar = this.f4544j;
        if (gVar.f4517i) {
            this.f4538d.f4626af = gVar.f4514f;
        }
    }

    /* renamed from: d */
    public final void mo4573d() {
        this.f4539e = null;
        this.f4544j.mo4583b();
        this.f4545k.mo4583b();
        this.f4529a.mo4583b();
        this.f4541g.mo4583b();
        this.f4543i = false;
    }

    /* renamed from: e */
    public final boolean mo4574e() {
        if (this.f4540f != C1637e.MATCH_CONSTRAINT || this.f4538d.f4665u == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo4590g() {
        this.f4543i = false;
        this.f4544j.mo4583b();
        this.f4544j.f4517i = false;
        this.f4545k.mo4583b();
        this.f4545k.f4517i = false;
        this.f4529a.mo4583b();
        this.f4529a.f4517i = false;
        this.f4541g.f4517i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.f4538d.f4638ar));
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
            C1623h hVar = this.f4541g;
            if (hVar.f4511c && !hVar.f4517i && this.f4540f == C1637e.MATCH_CONSTRAINT) {
                C1638f fVar = this.f4538d;
                int i3 = fVar.f4665u;
                if (i3 == 2) {
                    C1638f fVar2 = fVar.f4606Z;
                    if (fVar2 != null) {
                        C1623h hVar2 = fVar2.f4653i.f4541g;
                        if (hVar2.f4517i) {
                            this.f4541g.mo4584c((int) ((((float) hVar2.f4514f) * fVar.f4582B) + 0.5f));
                        }
                    }
                } else if (i3 == 3) {
                    C1623h hVar3 = fVar.f4652h.f4541g;
                    if (hVar3.f4517i) {
                        int i4 = fVar.f4624ad;
                        if (i4 == -1) {
                            f2 = (float) hVar3.f4514f;
                            f3 = fVar.f4623ac;
                        } else if (i4 != 0) {
                            f2 = (float) hVar3.f4514f;
                            f3 = fVar.f4623ac;
                        } else {
                            f = ((float) hVar3.f4514f) * fVar.f4623ac;
                            this.f4541g.mo4584c((int) (f + 0.5f));
                        }
                        f = f2 / f3;
                        this.f4541g.mo4584c((int) (f + 0.5f));
                    }
                }
            }
            C1622g gVar = this.f4544j;
            if (gVar.f4511c) {
                C1622g gVar2 = this.f4545k;
                if (gVar2.f4511c) {
                    if (!gVar.f4517i || !gVar2.f4517i || !this.f4541g.f4517i) {
                        if (!this.f4541g.f4517i && this.f4540f == C1637e.MATCH_CONSTRAINT) {
                            C1638f fVar3 = this.f4538d;
                            if (fVar3.f4664t == 0 && !fVar3.mo4624J()) {
                                int i5 = ((C1622g) this.f4544j.f4519k.get(0)).f4514f;
                                C1622g gVar3 = this.f4544j;
                                int i6 = i5 + gVar3.f4513e;
                                int i7 = ((C1622g) this.f4545k.f4519k.get(0)).f4514f + this.f4545k.f4513e;
                                gVar3.mo4584c(i6);
                                this.f4545k.mo4584c(i7);
                                this.f4541g.mo4584c(i7 - i6);
                                return;
                            }
                        }
                        if (!this.f4541g.f4517i && this.f4540f == C1637e.MATCH_CONSTRAINT && this.f4537c == 1 && this.f4544j.f4519k.size() > 0 && this.f4545k.f4519k.size() > 0) {
                            int i8 = (((C1622g) this.f4545k.f4519k.get(0)).f4514f + this.f4545k.f4513e) - (((C1622g) this.f4544j.f4519k.get(0)).f4514f + this.f4544j.f4513e);
                            C1623h hVar4 = this.f4541g;
                            int i9 = hVar4.f4521m;
                            if (i8 < i9) {
                                hVar4.mo4584c(i8);
                            } else {
                                hVar4.mo4584c(i9);
                            }
                        }
                        if (this.f4541g.f4517i && this.f4544j.f4519k.size() > 0 && this.f4545k.f4519k.size() > 0) {
                            C1622g gVar4 = (C1622g) this.f4544j.f4519k.get(0);
                            C1622g gVar5 = (C1622g) this.f4545k.f4519k.get(0);
                            int i10 = gVar4.f4514f;
                            C1622g gVar6 = this.f4544j;
                            int i11 = gVar6.f4513e + i10;
                            int i12 = gVar5.f4514f;
                            int i13 = this.f4545k.f4513e + i12;
                            float f4 = this.f4538d.f4635ao;
                            if (gVar4 == gVar5) {
                                f4 = 0.5f;
                            }
                            if (gVar4 != gVar5) {
                                i12 = i13;
                            }
                            if (gVar4 != gVar5) {
                                i10 = i11;
                            }
                            gVar6.mo4584c((int) (((float) i10) + 0.5f + (((float) ((i12 - i10) - this.f4541g.f4514f)) * f4)));
                            this.f4545k.mo4584c(this.f4544j.f4514f + this.f4541g.f4514f);
                        }
                    }
                }
            }
        } else {
            C1638f fVar4 = this.f4538d;
            mo4599m(fVar4.f4595O, fVar4.f4597Q, 1);
        }
    }
}

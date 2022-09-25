package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1615a;
import androidx.constraintlayout.p079a.p082b.C1637e;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1639g;
import androidx.constraintlayout.widget.C1746e;

/* renamed from: androidx.constraintlayout.a.b.a.i */
/* compiled from: PG */
public final class C1624i {

    /* renamed from: a */
    public static final C1617b f4522a = new C1617b();

    /* renamed from: b */
    public static int f4523b = 0;

    /* renamed from: c */
    public static int f4524c = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        r4 = r12.f4596P.f4571e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        r4 = r15.f4571e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4335a(int r16, androidx.constraintlayout.p079a.p082b.C1638f r17, androidx.constraintlayout.widget.C1746e r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f4659o
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            int r3 = f4523b
            r4 = 1
            int r3 = r3 + r4
            f4523b = r3
            boolean r3 = r0 instanceof androidx.constraintlayout.p079a.p082b.C1639g
            if (r3 != 0) goto L_0x0029
            boolean r3 = r17.mo4625K()
            if (r3 == 0) goto L_0x0029
            boolean r3 = m4337c(r17)
            if (r3 == 0) goto L_0x0029
            androidx.constraintlayout.a.b.a.b r3 = new androidx.constraintlayout.a.b.a.b
            r3.<init>()
            androidx.constraintlayout.p079a.p082b.C1639g.m4445S(r0, r1, r3)
        L_0x0029:
            r3 = 2
            androidx.constraintlayout.a.b.d r3 = r0.mo4626L(r3)
            r5 = 4
            androidx.constraintlayout.a.b.d r5 = r0.mo4626L(r5)
            int r6 = r3.mo4600a()
            int r7 = r5.mo4600a()
            java.util.HashSet r8 = r3.f4567a
            r10 = 8
            r11 = 0
            if (r8 == 0) goto L_0x0117
            boolean r3 = r3.f4569c
            if (r3 == 0) goto L_0x0117
            java.util.Iterator r3 = r8.iterator()
        L_0x004a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0117
            java.lang.Object r8 = r3.next()
            androidx.constraintlayout.a.b.d r8 = (androidx.constraintlayout.p079a.p082b.C1636d) r8
            androidx.constraintlayout.a.b.f r12 = r8.f4570d
            int r13 = r16 + 1
            boolean r14 = m4337c(r12)
            boolean r15 = r12.mo4625K()
            if (r15 == 0) goto L_0x006e
            if (r14 == 0) goto L_0x006e
            androidx.constraintlayout.a.b.a.b r15 = new androidx.constraintlayout.a.b.a.b
            r15.<init>()
            androidx.constraintlayout.p079a.p082b.C1639g.m4445S(r12, r1, r15)
        L_0x006e:
            androidx.constraintlayout.a.b.d r15 = r12.f4594N
            if (r8 != r15) goto L_0x007f
            androidx.constraintlayout.a.b.d r4 = r12.f4596P
            androidx.constraintlayout.a.b.d r4 = r4.f4571e
            if (r4 == 0) goto L_0x007f
            boolean r4 = r4.f4569c
            if (r4 != 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r4 = 1
            goto L_0x008d
        L_0x007f:
            androidx.constraintlayout.a.b.d r4 = r12.f4596P
            if (r8 != r4) goto L_0x008c
            androidx.constraintlayout.a.b.d r4 = r15.f4571e
            if (r4 == 0) goto L_0x008c
            boolean r4 = r4.f4569c
            if (r4 == 0) goto L_0x008c
            goto L_0x007d
        L_0x008c:
            r4 = 0
        L_0x008d:
            androidx.constraintlayout.a.b.e[] r15 = r12.f4605Y
            r15 = r15[r11]
            androidx.constraintlayout.a.b.e r9 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r15 != r9) goto L_0x00cd
            if (r14 == 0) goto L_0x0098
            goto L_0x00cd
        L_0x0098:
            androidx.constraintlayout.a.b.e[] r8 = r12.f4605Y
            r8 = r8[r11]
            androidx.constraintlayout.a.b.e r9 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x0114
            int r8 = r12.f4668x
            if (r8 < 0) goto L_0x0114
            int r8 = r12.f4667w
            if (r8 < 0) goto L_0x0114
            int r8 = r12.f4637aq
            if (r8 == r10) goto L_0x00b7
            int r8 = r12.f4664t
            if (r8 != 0) goto L_0x0114
            float r8 = r12.f4623ac
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0114
        L_0x00b7:
            boolean r8 = r12.mo4623I()
            if (r8 != 0) goto L_0x0114
            boolean r8 = r12.f4591K
            if (r8 != 0) goto L_0x0114
            if (r4 == 0) goto L_0x0114
            boolean r4 = r12.mo4623I()
            if (r4 != 0) goto L_0x0114
            m4340f(r13, r0, r1, r12, r2)
            goto L_0x0114
        L_0x00cd:
            boolean r9 = r12.mo4625K()
            if (r9 != 0) goto L_0x0114
            androidx.constraintlayout.a.b.d r9 = r12.f4594N
            if (r8 != r9) goto L_0x00ee
            androidx.constraintlayout.a.b.d r14 = r12.f4596P
            androidx.constraintlayout.a.b.d r14 = r14.f4571e
            if (r14 != 0) goto L_0x00ee
            int r4 = r9.mo4601b()
            int r4 = r4 + r6
            int r8 = r12.mo4631i()
            int r8 = r8 + r4
            r12.mo4646x(r4, r8)
            m4335a(r13, r12, r1, r2)
            goto L_0x0114
        L_0x00ee:
            androidx.constraintlayout.a.b.d r14 = r12.f4596P
            if (r8 != r14) goto L_0x0109
            androidx.constraintlayout.a.b.d r8 = r9.f4571e
            if (r8 != 0) goto L_0x0109
            int r4 = r14.mo4601b()
            int r4 = r6 - r4
            int r8 = r12.mo4631i()
            int r8 = r4 - r8
            r12.mo4646x(r8, r4)
            m4335a(r13, r12, r1, r2)
            goto L_0x0114
        L_0x0109:
            if (r4 == 0) goto L_0x0114
            boolean r4 = r12.mo4623I()
            if (r4 != 0) goto L_0x0114
            m4339e(r13, r1, r12, r2)
        L_0x0114:
            r4 = 1
            goto L_0x004a
        L_0x0117:
            boolean r3 = r0 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r3 != 0) goto L_0x01fd
            java.util.HashSet r3 = r5.f4567a
            if (r3 == 0) goto L_0x01fa
            boolean r4 = r5.f4569c
            if (r4 == 0) goto L_0x01fa
            java.util.Iterator r3 = r3.iterator()
        L_0x0127:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01fa
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.a.b.d r4 = (androidx.constraintlayout.p079a.p082b.C1636d) r4
            androidx.constraintlayout.a.b.f r5 = r4.f4570d
            r6 = 1
            int r8 = r16 + 1
            boolean r6 = m4337c(r5)
            boolean r9 = r5.mo4625K()
            if (r9 == 0) goto L_0x014c
            if (r6 == 0) goto L_0x014c
            androidx.constraintlayout.a.b.a.b r9 = new androidx.constraintlayout.a.b.a.b
            r9.<init>()
            androidx.constraintlayout.p079a.p082b.C1639g.m4445S(r5, r1, r9)
        L_0x014c:
            androidx.constraintlayout.a.b.d r9 = r5.f4594N
            if (r4 != r9) goto L_0x015d
            androidx.constraintlayout.a.b.d r12 = r5.f4596P
            androidx.constraintlayout.a.b.d r12 = r12.f4571e
            if (r12 == 0) goto L_0x015d
            boolean r12 = r12.f4569c
            if (r12 != 0) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            r9 = 1
            goto L_0x016b
        L_0x015d:
            androidx.constraintlayout.a.b.d r12 = r5.f4596P
            if (r4 != r12) goto L_0x016a
            androidx.constraintlayout.a.b.d r9 = r9.f4571e
            if (r9 == 0) goto L_0x016a
            boolean r9 = r9.f4569c
            if (r9 == 0) goto L_0x016a
            goto L_0x015b
        L_0x016a:
            r9 = 0
        L_0x016b:
            androidx.constraintlayout.a.b.e[] r12 = r5.f4605Y
            r12 = r12[r11]
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01ae
            if (r6 == 0) goto L_0x0176
            goto L_0x01ae
        L_0x0176:
            androidx.constraintlayout.a.b.e[] r4 = r5.f4605Y
            r4 = r4[r11]
            androidx.constraintlayout.a.b.e r6 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0127
            int r4 = r5.f4668x
            if (r4 < 0) goto L_0x0127
            int r4 = r5.f4667w
            if (r4 < 0) goto L_0x0127
            int r4 = r5.f4637aq
            if (r4 == r10) goto L_0x0196
            int r4 = r5.f4664t
            if (r4 != 0) goto L_0x0127
            float r4 = r5.f4623ac
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0127
            goto L_0x0197
        L_0x0196:
            r6 = 0
        L_0x0197:
            boolean r4 = r5.mo4623I()
            if (r4 != 0) goto L_0x0127
            boolean r4 = r5.f4591K
            if (r4 != 0) goto L_0x0127
            if (r9 == 0) goto L_0x0127
            boolean r4 = r5.mo4623I()
            if (r4 != 0) goto L_0x0127
            m4340f(r8, r0, r1, r5, r2)
            goto L_0x0127
        L_0x01ae:
            r6 = 0
            boolean r12 = r5.mo4625K()
            if (r12 != 0) goto L_0x0127
            androidx.constraintlayout.a.b.d r12 = r5.f4594N
            if (r4 != r12) goto L_0x01d1
            androidx.constraintlayout.a.b.d r13 = r5.f4596P
            androidx.constraintlayout.a.b.d r13 = r13.f4571e
            if (r13 != 0) goto L_0x01d1
            int r4 = r12.mo4601b()
            int r4 = r4 + r7
            int r9 = r5.mo4631i()
            int r9 = r9 + r4
            r5.mo4646x(r4, r9)
            m4335a(r8, r5, r1, r2)
            goto L_0x0127
        L_0x01d1:
            androidx.constraintlayout.a.b.d r13 = r5.f4596P
            if (r4 != r13) goto L_0x01ed
            androidx.constraintlayout.a.b.d r4 = r12.f4571e
            if (r4 != 0) goto L_0x01ed
            int r4 = r13.mo4601b()
            int r4 = r7 - r4
            int r9 = r5.mo4631i()
            int r9 = r4 - r9
            r5.mo4646x(r9, r4)
            m4335a(r8, r5, r1, r2)
            goto L_0x0127
        L_0x01ed:
            if (r9 == 0) goto L_0x0127
            boolean r4 = r5.mo4623I()
            if (r4 != 0) goto L_0x0127
            m4339e(r8, r1, r5, r2)
            goto L_0x0127
        L_0x01fa:
            r1 = 1
            r0.f4659o = r1
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4335a(int, androidx.constraintlayout.a.b.f, androidx.constraintlayout.widget.e, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        r15 = r11.f4597Q.f4571e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        r14 = r14.f4571e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4336b(int r16, androidx.constraintlayout.p079a.p082b.C1638f r17, androidx.constraintlayout.widget.C1746e r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.f4660p
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            int r2 = f4524c
            r3 = 1
            int r2 = r2 + r3
            f4524c = r2
            boolean r2 = r0 instanceof androidx.constraintlayout.p079a.p082b.C1639g
            if (r2 != 0) goto L_0x0027
            boolean r2 = r17.mo4625K()
            if (r2 == 0) goto L_0x0027
            boolean r2 = m4337c(r17)
            if (r2 == 0) goto L_0x0027
            androidx.constraintlayout.a.b.a.b r2 = new androidx.constraintlayout.a.b.a.b
            r2.<init>()
            androidx.constraintlayout.p079a.p082b.C1639g.m4445S(r0, r1, r2)
        L_0x0027:
            r2 = 3
            androidx.constraintlayout.a.b.d r2 = r0.mo4626L(r2)
            r4 = 5
            androidx.constraintlayout.a.b.d r4 = r0.mo4626L(r4)
            int r5 = r2.mo4600a()
            int r6 = r4.mo4600a()
            java.util.HashSet r7 = r2.f4567a
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L_0x0116
            boolean r2 = r2.f4569c
            if (r2 == 0) goto L_0x0116
            java.util.Iterator r2 = r7.iterator()
        L_0x0048:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0116
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.a.b.d r7 = (androidx.constraintlayout.p079a.p082b.C1636d) r7
            androidx.constraintlayout.a.b.f r11 = r7.f4570d
            int r12 = r16 + 1
            boolean r13 = m4337c(r11)
            boolean r14 = r11.mo4625K()
            if (r14 == 0) goto L_0x006c
            if (r13 == 0) goto L_0x006c
            androidx.constraintlayout.a.b.a.b r14 = new androidx.constraintlayout.a.b.a.b
            r14.<init>()
            androidx.constraintlayout.p079a.p082b.C1639g.m4445S(r11, r1, r14)
        L_0x006c:
            androidx.constraintlayout.a.b.d r14 = r11.f4595O
            if (r7 != r14) goto L_0x007d
            androidx.constraintlayout.a.b.d r15 = r11.f4597Q
            androidx.constraintlayout.a.b.d r15 = r15.f4571e
            if (r15 == 0) goto L_0x007d
            boolean r15 = r15.f4569c
            if (r15 != 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r14 = 1
            goto L_0x008b
        L_0x007d:
            androidx.constraintlayout.a.b.d r15 = r11.f4597Q
            if (r7 != r15) goto L_0x008a
            androidx.constraintlayout.a.b.d r14 = r14.f4571e
            if (r14 == 0) goto L_0x008a
            boolean r14 = r14.f4569c
            if (r14 == 0) goto L_0x008a
            goto L_0x007b
        L_0x008a:
            r14 = 0
        L_0x008b:
            androidx.constraintlayout.a.b.e[] r15 = r11.f4605Y
            r15 = r15[r3]
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r15 != r10) goto L_0x00cb
            if (r13 == 0) goto L_0x0096
            goto L_0x00cb
        L_0x0096:
            androidx.constraintlayout.a.b.e[] r7 = r11.f4605Y
            r7 = r7[r3]
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r7 != r10) goto L_0x0048
            int r7 = r11.f4581A
            if (r7 < 0) goto L_0x0048
            int r7 = r11.f4670z
            if (r7 < 0) goto L_0x0048
            int r7 = r11.f4637aq
            if (r7 == r9) goto L_0x00b4
            int r7 = r11.f4665u
            if (r7 != 0) goto L_0x0048
            float r7 = r11.f4623ac
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0048
        L_0x00b4:
            boolean r7 = r11.mo4624J()
            if (r7 != 0) goto L_0x0048
            boolean r7 = r11.f4591K
            if (r7 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0048
            boolean r7 = r11.mo4624J()
            if (r7 != 0) goto L_0x0048
            m4342h(r12, r0, r1, r11)
            goto L_0x0048
        L_0x00cb:
            boolean r10 = r11.mo4625K()
            if (r10 != 0) goto L_0x0048
            androidx.constraintlayout.a.b.d r10 = r11.f4595O
            if (r7 != r10) goto L_0x00ed
            androidx.constraintlayout.a.b.d r13 = r11.f4597Q
            androidx.constraintlayout.a.b.d r13 = r13.f4571e
            if (r13 != 0) goto L_0x00ed
            int r7 = r10.mo4601b()
            int r7 = r7 + r5
            int r10 = r11.mo4630h()
            int r10 = r10 + r7
            r11.mo4647y(r7, r10)
            m4336b(r12, r11, r1)
            goto L_0x0048
        L_0x00ed:
            androidx.constraintlayout.a.b.d r13 = r11.f4597Q
            if (r7 != r13) goto L_0x0109
            androidx.constraintlayout.a.b.d r7 = r10.f4571e
            if (r7 != 0) goto L_0x0109
            int r7 = r13.mo4601b()
            int r7 = r5 - r7
            int r10 = r11.mo4630h()
            int r10 = r7 - r10
            r11.mo4647y(r10, r7)
            m4336b(r12, r11, r1)
            goto L_0x0048
        L_0x0109:
            if (r14 == 0) goto L_0x0048
            boolean r7 = r11.mo4624J()
            if (r7 != 0) goto L_0x0048
            m4341g(r12, r1, r11)
            goto L_0x0048
        L_0x0116:
            boolean r2 = r0 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r2 != 0) goto L_0x026c
            java.util.HashSet r2 = r4.f4567a
            if (r2 == 0) goto L_0x01f4
            boolean r4 = r4.f4569c
            if (r4 == 0) goto L_0x01f4
            java.util.Iterator r2 = r2.iterator()
        L_0x0126:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01f4
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.a.b.d r4 = (androidx.constraintlayout.p079a.p082b.C1636d) r4
            androidx.constraintlayout.a.b.f r5 = r4.f4570d
            int r7 = r16 + 1
            boolean r10 = m4337c(r5)
            boolean r11 = r5.mo4625K()
            if (r11 == 0) goto L_0x014a
            if (r10 == 0) goto L_0x014a
            androidx.constraintlayout.a.b.a.b r11 = new androidx.constraintlayout.a.b.a.b
            r11.<init>()
            androidx.constraintlayout.p079a.p082b.C1639g.m4445S(r5, r1, r11)
        L_0x014a:
            androidx.constraintlayout.a.b.d r11 = r5.f4595O
            if (r4 != r11) goto L_0x015b
            androidx.constraintlayout.a.b.d r12 = r5.f4597Q
            androidx.constraintlayout.a.b.d r12 = r12.f4571e
            if (r12 == 0) goto L_0x015b
            boolean r12 = r12.f4569c
            if (r12 != 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r11 = 1
            goto L_0x0169
        L_0x015b:
            androidx.constraintlayout.a.b.d r12 = r5.f4597Q
            if (r4 != r12) goto L_0x0168
            androidx.constraintlayout.a.b.d r11 = r11.f4571e
            if (r11 == 0) goto L_0x0168
            boolean r11 = r11.f4569c
            if (r11 == 0) goto L_0x0168
            goto L_0x0159
        L_0x0168:
            r11 = 0
        L_0x0169:
            androidx.constraintlayout.a.b.e[] r12 = r5.f4605Y
            r12 = r12[r3]
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01a9
            if (r10 == 0) goto L_0x0174
            goto L_0x01a9
        L_0x0174:
            androidx.constraintlayout.a.b.e[] r4 = r5.f4605Y
            r4 = r4[r3]
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r4 != r10) goto L_0x0126
            int r4 = r5.f4581A
            if (r4 < 0) goto L_0x0126
            int r4 = r5.f4670z
            if (r4 < 0) goto L_0x0126
            int r4 = r5.f4637aq
            if (r4 == r9) goto L_0x0192
            int r4 = r5.f4665u
            if (r4 != 0) goto L_0x0126
            float r4 = r5.f4623ac
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0126
        L_0x0192:
            boolean r4 = r5.mo4624J()
            if (r4 != 0) goto L_0x0126
            boolean r4 = r5.f4591K
            if (r4 != 0) goto L_0x0126
            if (r11 == 0) goto L_0x0126
            boolean r4 = r5.mo4624J()
            if (r4 != 0) goto L_0x0126
            m4342h(r7, r0, r1, r5)
            goto L_0x0126
        L_0x01a9:
            boolean r10 = r5.mo4625K()
            if (r10 != 0) goto L_0x0126
            androidx.constraintlayout.a.b.d r10 = r5.f4595O
            if (r4 != r10) goto L_0x01cb
            androidx.constraintlayout.a.b.d r12 = r5.f4597Q
            androidx.constraintlayout.a.b.d r12 = r12.f4571e
            if (r12 != 0) goto L_0x01cb
            int r4 = r10.mo4601b()
            int r4 = r4 + r6
            int r10 = r5.mo4630h()
            int r10 = r10 + r4
            r5.mo4647y(r4, r10)
            m4336b(r7, r5, r1)
            goto L_0x0126
        L_0x01cb:
            androidx.constraintlayout.a.b.d r12 = r5.f4597Q
            if (r4 != r12) goto L_0x01e7
            androidx.constraintlayout.a.b.d r4 = r10.f4571e
            if (r4 != 0) goto L_0x01e7
            int r4 = r12.mo4601b()
            int r4 = r6 - r4
            int r10 = r5.mo4630h()
            int r10 = r4 - r10
            r5.mo4647y(r10, r4)
            m4336b(r7, r5, r1)
            goto L_0x0126
        L_0x01e7:
            if (r11 == 0) goto L_0x0126
            boolean r4 = r5.mo4624J()
            if (r4 != 0) goto L_0x0126
            m4341g(r7, r1, r5)
            goto L_0x0126
        L_0x01f4:
            r2 = 6
            androidx.constraintlayout.a.b.d r2 = r0.mo4626L(r2)
            java.util.HashSet r4 = r2.f4567a
            if (r4 == 0) goto L_0x026a
            boolean r4 = r2.f4569c
            if (r4 == 0) goto L_0x026a
            int r4 = r2.mo4600a()
            java.util.HashSet r2 = r2.f4567a
            java.util.Iterator r2 = r2.iterator()
        L_0x020b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x026a
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.a.b.d r5 = (androidx.constraintlayout.p079a.p082b.C1636d) r5
            androidx.constraintlayout.a.b.f r6 = r5.f4570d
            int r7 = r16 + 1
            boolean r8 = m4337c(r6)
            boolean r9 = r6.mo4625K()
            if (r9 == 0) goto L_0x022f
            if (r8 == 0) goto L_0x022f
            androidx.constraintlayout.a.b.a.b r9 = new androidx.constraintlayout.a.b.a.b
            r9.<init>()
            androidx.constraintlayout.p079a.p082b.C1639g.m4445S(r6, r1, r9)
        L_0x022f:
            androidx.constraintlayout.a.b.e[] r9 = r6.f4605Y
            r9 = r9[r3]
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0239
            if (r8 == 0) goto L_0x020b
        L_0x0239:
            boolean r8 = r6.mo4625K()
            if (r8 != 0) goto L_0x020b
            androidx.constraintlayout.a.b.d r8 = r6.f4598R
            if (r5 != r8) goto L_0x020b
            int r5 = r5.mo4601b()
            int r5 = r5 + r4
            boolean r8 = r6.f4589I
            if (r8 == 0) goto L_0x0266
            int r8 = r6.f4631ak
            int r8 = r5 - r8
            int r9 = r6.f4622ab
            r6.f4626af = r8
            androidx.constraintlayout.a.b.d r10 = r6.f4595O
            r10.mo4605f(r8)
            androidx.constraintlayout.a.b.d r10 = r6.f4597Q
            int r8 = r8 + r9
            r10.mo4605f(r8)
            androidx.constraintlayout.a.b.d r8 = r6.f4598R
            r8.mo4605f(r5)
            r6.f4658n = r3
        L_0x0266:
            m4336b(r7, r6, r1)     // Catch:{ all -> 0x026d }
            goto L_0x020b
        L_0x026a:
            r0.f4660p = r3
        L_0x026c:
            return
        L_0x026d:
            r0 = move-exception
            r1 = r0
            goto L_0x0271
        L_0x0270:
            throw r1
        L_0x0271:
            goto L_0x0270
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4336b(int, androidx.constraintlayout.a.b.f, androidx.constraintlayout.widget.e):void");
    }

    /* renamed from: c */
    public static boolean m4337c(C1638f fVar) {
        C1637e[] eVarArr = fVar.f4605Y;
        C1637e eVar = eVarArr[0];
        C1637e eVar2 = eVarArr[1];
        C1638f fVar2 = fVar.f4606Z;
        C1639g gVar = fVar2 != null ? (C1639g) fVar2 : null;
        if (gVar != null) {
            C1637e eVar3 = gVar.f4605Y[0];
            C1637e eVar4 = C1637e.FIXED;
        }
        if (gVar != null) {
            C1637e eVar5 = gVar.f4605Y[1];
            C1637e eVar6 = C1637e.FIXED;
        }
        boolean z = eVar == C1637e.FIXED || fVar.mo4564f() || eVar == C1637e.WRAP_CONTENT || (eVar == C1637e.MATCH_CONSTRAINT && fVar.f4664t == 0 && fVar.f4623ac == 0.0f && fVar.mo4621G(0)) || (eVar == C1637e.MATCH_CONSTRAINT && fVar.f4664t == 1 && fVar.mo4622H(0, fVar.mo4631i()));
        boolean z2 = eVar2 == C1637e.FIXED || fVar.mo4565g() || eVar2 == C1637e.WRAP_CONTENT || (eVar2 == C1637e.MATCH_CONSTRAINT && fVar.f4665u == 0 && fVar.f4623ac == 0.0f && fVar.mo4621G(1)) || (eVar2 == C1637e.MATCH_CONSTRAINT && fVar.f4665u == 1 && fVar.mo4622H(1, fVar.mo4630h()));
        if (fVar.f4623ac > 0.0f) {
            if (z || z2) {
                return true;
            }
            z2 = false;
            z = false;
        }
        return z && z2;
    }

    /* renamed from: d */
    public static void m4338d(C1615a aVar, C1746e eVar, int i, boolean z) {
        if (!aVar.mo4562d()) {
            return;
        }
        if (i == 0) {
            m4335a(1, aVar, eVar, z);
        } else {
            m4336b(1, aVar, eVar);
        }
    }

    /* renamed from: e */
    private static void m4339e(int i, C1746e eVar, C1638f fVar, boolean z) {
        float f = fVar.f4634an;
        int a = fVar.f4594N.f4571e.mo4600a();
        int a2 = fVar.f4596P.f4571e.mo4600a();
        int b = fVar.f4594N.mo4601b() + a;
        int b2 = a2 - fVar.f4596P.mo4601b();
        if (a == a2) {
            b2 = a2;
        }
        if (a == a2) {
            b = a;
        }
        if (a == a2) {
            f = 0.5f;
        }
        int i2 = fVar.mo4631i();
        int i3 = (b2 - b) - i2;
        if (b > b2) {
            i3 = (b - b2) - i2;
        }
        int i4 = ((int) (i3 > 0 ? (f * ((float) i3)) + 0.5f : f * ((float) i3))) + b;
        int i5 = i4 + i2;
        if (b > b2) {
            i5 = i4 - i2;
        }
        fVar.mo4646x(i4, i5);
        m4335a(i + 1, fVar, eVar, z);
    }

    /* renamed from: f */
    private static void m4340f(int i, C1638f fVar, C1746e eVar, C1638f fVar2, boolean z) {
        int i2;
        float f = fVar2.f4634an;
        int a = fVar2.f4594N.f4571e.mo4600a() + fVar2.f4594N.mo4601b();
        int a2 = fVar2.f4596P.f4571e.mo4600a() - fVar2.f4596P.mo4601b();
        if (a2 >= a) {
            int i3 = fVar2.mo4631i();
            if (fVar2.f4637aq != 8) {
                int i4 = fVar2.f4664t;
                if (i4 == 2) {
                    if (fVar instanceof C1639g) {
                        i2 = fVar.mo4631i();
                    } else {
                        i2 = fVar.f4606Z.mo4631i();
                    }
                    i3 = (int) (fVar2.f4634an * 0.5f * ((float) i2));
                } else if (i4 == 0) {
                    i3 = a2 - a;
                }
                i3 = Math.max(fVar2.f4667w, i3);
                int i5 = fVar2.f4668x;
                if (i5 > 0) {
                    i3 = Math.min(i5, i3);
                }
            }
            int i6 = a + ((int) ((f * ((float) ((a2 - a) - i3))) + 0.5f));
            fVar2.mo4646x(i6, i3 + i6);
            m4335a(i + 1, fVar2, eVar, z);
        }
    }

    /* renamed from: g */
    private static void m4341g(int i, C1746e eVar, C1638f fVar) {
        float f = fVar.f4635ao;
        int a = fVar.f4595O.f4571e.mo4600a();
        int a2 = fVar.f4597Q.f4571e.mo4600a();
        int b = fVar.f4595O.mo4601b() + a;
        int b2 = a2 - fVar.f4597Q.mo4601b();
        if (a == a2) {
            b2 = a2;
        }
        if (a == a2) {
            b = a;
        }
        if (a == a2) {
            f = 0.5f;
        }
        int h = fVar.mo4630h();
        int i2 = (b2 - b) - h;
        if (b > b2) {
            i2 = (b - b2) - h;
        }
        int i3 = (int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2));
        int i4 = b + i3;
        int i5 = i4 + h;
        if (b > b2) {
            i4 = b - i3;
            i5 = i4 - h;
        }
        fVar.mo4647y(i4, i5);
        m4336b(i + 1, fVar, eVar);
    }

    /* renamed from: h */
    private static void m4342h(int i, C1638f fVar, C1746e eVar, C1638f fVar2) {
        int i2;
        float f = fVar2.f4635ao;
        int a = fVar2.f4595O.f4571e.mo4600a() + fVar2.f4595O.mo4601b();
        int a2 = fVar2.f4597Q.f4571e.mo4600a() - fVar2.f4597Q.mo4601b();
        if (a2 >= a) {
            int h = fVar2.mo4630h();
            if (fVar2.f4637aq != 8) {
                int i3 = fVar2.f4665u;
                if (i3 == 2) {
                    if (fVar instanceof C1639g) {
                        i2 = fVar.mo4630h();
                    } else {
                        i2 = fVar.f4606Z.mo4630h();
                    }
                    h = (int) (f * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    h = a2 - a;
                }
                h = Math.max(fVar2.f4670z, h);
                int i4 = fVar2.f4581A;
                if (i4 > 0) {
                    h = Math.min(i4, h);
                }
            }
            int i5 = a + ((int) ((f * ((float) ((a2 - a) - h))) + 0.5f));
            fVar2.mo4647y(i5, h + i5);
            m4336b(i + 1, fVar2, eVar);
        }
    }
}

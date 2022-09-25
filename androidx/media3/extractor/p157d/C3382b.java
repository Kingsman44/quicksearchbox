package androidx.media3.extractor.p157d;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3363ba;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.d.b */
/* compiled from: PG */
public final class C3382b implements C3326aa {

    /* renamed from: a */
    private final C2604ac f10230a = new C2604ac(4);

    /* renamed from: b */
    private final C2604ac f10231b = new C2604ac(9);

    /* renamed from: c */
    private final C2604ac f10232c = new C2604ac(11);

    /* renamed from: d */
    private final C2604ac f10233d = new C2604ac();

    /* renamed from: e */
    private final C3383c f10234e = new C3383c();

    /* renamed from: f */
    private C3329ad f10235f;

    /* renamed from: g */
    private int f10236g = 1;

    /* renamed from: h */
    private boolean f10237h;

    /* renamed from: i */
    private long f10238i;

    /* renamed from: j */
    private int f10239j;

    /* renamed from: k */
    private int f10240k;

    /* renamed from: l */
    private int f10241l;

    /* renamed from: m */
    private long f10242m;

    /* renamed from: n */
    private boolean f10243n;

    /* renamed from: o */
    private C3381a f10244o;

    /* renamed from: p */
    private C3386f f10245p;

    /* renamed from: f */
    private final C2604ac m9776f(C3327ab abVar) {
        int i = this.f10241l;
        C2604ac acVar = this.f10233d;
        int length = acVar.f7234a.length;
        if (i > length) {
            acVar.mo6157y(new byte[Math.max(length + length, i)], 0);
        } else {
            acVar.mo6131A(0);
        }
        this.f10233d.mo6158z(this.f10241l);
        ((C3627q) abVar).mo7321p(this.f10233d.f7234a, 0, this.f10241l, false);
        return this.f10233d;
    }

    /* renamed from: g */
    private final void m9777g() {
        if (!this.f10243n) {
            this.f10235f.mo6989q(new C3363ba(-9223372036854775807L, 0));
            this.f10243n = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r17, androidx.media3.extractor.C3350ay r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            androidx.media3.extractor.ad r2 = r0.f10235f
            androidx.media3.common.p136b.C2601a.m6829a(r2)
        L_0x0009:
            int r2 = r0.f10236g
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x0116
            r10 = 3
            if (r2 == r6) goto L_0x0108
            if (r2 == r10) goto L_0x00bf
            if (r2 != r7) goto L_0x00b9
            boolean r2 = r0.f10237h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.f10238i
            long r14 = r0.f10242m
            long r2 = r2 + r14
            goto L_0x0039
        L_0x002c:
            androidx.media3.extractor.d.c r2 = r0.f10234e
            long r2 = r2.f10246a
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0037
            r2 = 0
            goto L_0x0039
        L_0x0037:
            long r2 = r0.f10242m
        L_0x0039:
            int r14 = r0.f10240k
            if (r14 != r4) goto L_0x0050
            androidx.media3.extractor.d.a r14 = r0.f10244o
            if (r14 == 0) goto L_0x0051
            r16.m9777g()
            androidx.media3.extractor.d.a r4 = r0.f10244o
            androidx.media3.common.b.ac r5 = r16.m9776f(r17)
            boolean r2 = r4.mo7370c(r5, r2)
        L_0x004e:
            r3 = 1
            goto L_0x009a
        L_0x0050:
            r4 = r14
        L_0x0051:
            if (r4 != r5) goto L_0x0065
            androidx.media3.extractor.d.f r4 = r0.f10245p
            if (r4 == 0) goto L_0x0090
            r16.m9777g()
            androidx.media3.extractor.d.f r4 = r0.f10245p
            androidx.media3.common.b.ac r5 = r16.m9776f(r17)
            boolean r2 = r4.mo7370c(r5, r2)
            goto L_0x004e
        L_0x0065:
            r5 = 18
            if (r4 != r5) goto L_0x0090
            boolean r4 = r0.f10243n
            if (r4 != 0) goto L_0x0090
            androidx.media3.extractor.d.c r4 = r0.f10234e
            androidx.media3.common.b.ac r5 = r16.m9776f(r17)
            boolean r2 = r4.mo7370c(r5, r2)
            androidx.media3.extractor.d.c r3 = r0.f10234e
            long r4 = r3.f10246a
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x004e
            androidx.media3.extractor.ad r14 = r0.f10235f
            androidx.media3.extractor.aq r15 = new androidx.media3.extractor.aq
            long[] r10 = r3.f10248c
            long[] r3 = r3.f10247b
            r15.<init>(r10, r3, r4)
            r14.mo6989q(r15)
            r0.f10243n = r9
            goto L_0x004e
        L_0x0090:
            int r2 = r0.f10241l
            r3 = r1
            androidx.media3.extractor.q r3 = (androidx.media3.extractor.C3627q) r3
            r3.mo7639q(r2)
            r2 = 0
            r3 = 0
        L_0x009a:
            boolean r4 = r0.f10237h
            if (r4 != 0) goto L_0x00b2
            if (r2 == 0) goto L_0x00b2
            r0.f10237h = r9
            androidx.media3.extractor.d.c r2 = r0.f10234e
            long r4 = r2.f10246a
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00ae
            long r4 = r0.f10242m
            long r10 = -r4
            goto L_0x00b0
        L_0x00ae:
            r10 = 0
        L_0x00b0:
            r0.f10238i = r10
        L_0x00b2:
            r0.f10239j = r7
            r0.f10236g = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00b9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00bf:
            androidx.media3.common.b.ac r2 = r0.f10232c
            byte[] r2 = r2.f7234a
            r4 = 11
            boolean r2 = r1.mo7321p(r2, r8, r4, r9)
            if (r2 != 0) goto L_0x00cc
            return r3
        L_0x00cc:
            androidx.media3.common.b.ac r2 = r0.f10232c
            r2.mo6131A(r8)
            androidx.media3.common.b.ac r2 = r0.f10232c
            int r2 = r2.mo6139g()
            r0.f10240k = r2
            androidx.media3.common.b.ac r2 = r0.f10232c
            int r2 = r2.mo6140h()
            r0.f10241l = r2
            androidx.media3.common.b.ac r2 = r0.f10232c
            int r2 = r2.mo6140h()
            long r2 = (long) r2
            r0.f10242m = r2
            androidx.media3.common.b.ac r2 = r0.f10232c
            int r2 = r2.mo6139g()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.f10242m
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.f10242m = r2
            androidx.media3.common.b.ac r2 = r0.f10232c
            int r3 = r2.f7235b
            int r3 = r3 + r10
            r2.mo6131A(r3)
            r0.f10236g = r7
            goto L_0x0009
        L_0x0108:
            int r2 = r0.f10239j
            r3 = r1
            androidx.media3.extractor.q r3 = (androidx.media3.extractor.C3627q) r3
            r3.mo7639q(r2)
            r0.f10239j = r8
            r0.f10236g = r10
            goto L_0x0009
        L_0x0116:
            androidx.media3.common.b.ac r2 = r0.f10231b
            byte[] r2 = r2.f7234a
            boolean r2 = r1.mo7321p(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x0121
            return r3
        L_0x0121:
            androidx.media3.common.b.ac r2 = r0.f10231b
            r2.mo6131A(r8)
            androidx.media3.common.b.ac r2 = r0.f10231b
            int r3 = r2.f7235b
            int r3 = r3 + r7
            r2.mo6131A(r3)
            androidx.media3.common.b.ac r2 = r0.f10231b
            int r2 = r2.mo6139g()
            r3 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x014a
            androidx.media3.extractor.d.a r2 = r0.f10244o
            if (r2 != 0) goto L_0x014a
            androidx.media3.extractor.d.a r2 = new androidx.media3.extractor.d.a
            androidx.media3.extractor.ad r7 = r0.f10235f
            androidx.media3.extractor.bf r4 = r7.mo6987eZ(r4, r9)
            r2.<init>(r4)
            r0.f10244o = r2
        L_0x014a:
            if (r3 == 0) goto L_0x015d
            androidx.media3.extractor.d.f r2 = r0.f10245p
            if (r2 != 0) goto L_0x015d
            androidx.media3.extractor.d.f r2 = new androidx.media3.extractor.d.f
            androidx.media3.extractor.ad r3 = r0.f10235f
            androidx.media3.extractor.bf r3 = r3.mo6987eZ(r5, r6)
            r2.<init>(r3)
            r0.f10245p = r2
        L_0x015d:
            androidx.media3.extractor.ad r2 = r0.f10235f
            r2.mo6988fa()
            androidx.media3.common.b.ac r2 = r0.f10231b
            int r2 = r2.mo6134b()
            int r2 = r2 + -5
            r0.f10239j = r2
            r0.f10236g = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p157d.C3382b.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        if (j == 0) {
            this.f10236g = 1;
            this.f10237h = false;
        } else {
            this.f10236g = 3;
        }
        this.f10239j = 0;
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        C3627q qVar = (C3627q) abVar;
        qVar.mo7320o(this.f10230a.f7234a, 0, 3, false);
        this.f10230a.mo6131A(0);
        if (this.f10230a.mo6140h() != 4607062) {
            return false;
        }
        qVar.mo7320o(this.f10230a.f7234a, 0, 2, false);
        this.f10230a.mo6131A(0);
        if ((this.f10230a.mo6142j() & 250) != 0) {
            return false;
        }
        qVar.mo7320o(this.f10230a.f7234a, 0, 4, false);
        this.f10230a.mo6131A(0);
        int b = this.f10230a.mo6134b();
        qVar.f11568e = 0;
        qVar.mo7319n(b, false);
        qVar.mo7320o(this.f10230a.f7234a, 0, 4, false);
        this.f10230a.mo6131A(0);
        if (this.f10230a.mo6134b() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f10235f = adVar;
    }
}

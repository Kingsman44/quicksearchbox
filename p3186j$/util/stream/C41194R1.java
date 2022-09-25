package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.R1 */
final class C41194R1 extends C41236d {

    /* renamed from: j */
    private final C41232c f107797j;

    /* renamed from: k */
    private final IntFunction f107798k;

    /* renamed from: l */
    private final long f107799l;

    /* renamed from: m */
    private final long f107800m;

    /* renamed from: n */
    private long f107801n;

    /* renamed from: o */
    private volatile boolean f107802o;

    C41194R1(C41194R1 r1, Spliterator spliterator) {
        super((C41236d) r1, spliterator);
        this.f107797j = r1.f107797j;
        this.f107798k = r1.f107798k;
        this.f107799l = r1.f107799l;
        this.f107800m = r1.f107800m;
    }

    C41194R1(C41232c cVar, C41232c cVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super((C41241e0) cVar2, spliterator);
        this.f107797j = cVar;
        this.f107798k = intFunction;
        this.f107799l = j;
        this.f107800m = j2;
    }

    /* renamed from: k */
    private long m71914k(long j) {
        if (this.f107802o) {
            return this.f107801n;
        }
        C41194R1 r1 = (C41194R1) this.f107896d;
        C41194R1 r12 = (C41194R1) this.f107897e;
        if (r1 == null || r12 == null) {
            return this.f107801n;
        }
        long k = r1.m71914k(j);
        return k >= j ? k : k + r12.m71914k(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo43697a() {
        boolean z;
        if (mo43848d() == null) {
            z = true;
        } else {
            z = false;
        }
        long j = -1;
        if (z) {
            if (C41259i2.SIZED.mo43856h(this.f107797j.f107854j)) {
                j = this.f107797j.mo43814K(this.f107894b);
            }
            C41257i0 T = this.f107797j.mo43702T(j, this.f107798k);
            C41171L1 l0 = this.f107797j.mo43658l0(this.f107893a.mo43815P(), T);
            C41241e0 e0Var = this.f107893a;
            e0Var.mo43813H(this.f107894b, e0Var.mo43817Y(l0));
            return T.build();
        }
        C41257i0 T2 = this.f107797j.mo43702T(-1, this.f107798k);
        if (this.f107799l == 0) {
            C41171L1 l02 = this.f107797j.mo43658l0(this.f107893a.mo43815P(), T2);
            C41241e0 e0Var2 = this.f107893a;
            e0Var2.mo43813H(this.f107894b, e0Var2.mo43817Y(l02));
        } else {
            this.f107893a.mo43816X(this.f107894b, T2);
        }
        C41277n0 build = T2.build();
        this.f107801n = build.count();
        this.f107802o = true;
        this.f107894b = null;
        return build;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C41244f mo43698e(Spliterator spliterator) {
        return new C41194R1(this, spliterator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo43790h() {
        this.f107868i = true;
        if (this.f107802o) {
            mo43832f(mo43699j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C41154H0 mo43699j() {
        return C41241e0.m72076J(this.f107797j.mo43710e0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCompletion(java.util.concurrent.CountedCompleter r15) {
        /*
            r14 = this;
            j$.util.stream.f r0 = r14.f107896d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            r4 = 0
            if (r3 != 0) goto L_0x008e
            j$.util.stream.R1 r0 = (p3186j$.util.stream.C41194R1) r0
            long r6 = r0.f107801n
            j$.util.stream.f r0 = r14.f107897e
            j$.util.stream.R1 r0 = (p3186j$.util.stream.C41194R1) r0
            long r8 = r0.f107801n
            long r6 = r6 + r8
            r14.f107801n = r6
            boolean r0 = r14.f107868i
            if (r0 == 0) goto L_0x0021
            r14.f107801n = r4
            goto L_0x0027
        L_0x0021:
            long r6 = r14.f107801n
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
        L_0x0027:
            j$.util.stream.H0 r0 = r14.mo43699j()
        L_0x002b:
            r6 = r0
            goto L_0x0061
        L_0x002d:
            j$.util.stream.f r0 = r14.f107896d
            j$.util.stream.R1 r0 = (p3186j$.util.stream.C41194R1) r0
            long r6 = r0.f107801n
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0042
            j$.util.stream.f r0 = r14.f107897e
            j$.util.stream.R1 r0 = (p3186j$.util.stream.C41194R1) r0
            java.lang.Object r0 = r0.mo43830c()
            j$.util.stream.n0 r0 = (p3186j$.util.stream.C41277n0) r0
            goto L_0x002b
        L_0x0042:
            j$.util.stream.c r0 = r14.f107797j
            j$.util.stream.j2 r0 = r0.mo43710e0()
            j$.util.stream.f r3 = r14.f107896d
            j$.util.stream.R1 r3 = (p3186j$.util.stream.C41194R1) r3
            java.lang.Object r3 = r3.mo43830c()
            j$.util.stream.n0 r3 = (p3186j$.util.stream.C41277n0) r3
            j$.util.stream.f r6 = r14.f107897e
            j$.util.stream.R1 r6 = (p3186j$.util.stream.C41194R1) r6
            java.lang.Object r6 = r6.mo43830c()
            j$.util.stream.n0 r6 = (p3186j$.util.stream.C41277n0) r6
            j$.util.stream.q0 r0 = p3186j$.util.stream.C41241e0.m72074F(r0, r3, r6)
            goto L_0x002b
        L_0x0061:
            j$.util.stream.f r0 = r14.mo43848d()
            if (r0 != 0) goto L_0x0069
            r0 = 1
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            if (r0 == 0) goto L_0x0089
            long r7 = r14.f107800m
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
            long r9 = r6.count()
            long r11 = r14.f107799l
            long r11 = r11 + r7
            long r7 = java.lang.Math.min(r9, r11)
            goto L_0x0080
        L_0x007e:
            long r7 = r14.f107801n
        L_0x0080:
            r9 = r7
            long r7 = r14.f107799l
            j$.util.function.IntFunction r11 = r14.f107798k
            j$.util.stream.n0 r6 = r6.mo43653n(r7, r9, r11)
        L_0x0089:
            r14.mo43832f(r6)
            r14.f107802o = r1
        L_0x008e:
            long r6 = r14.f107800m
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e6
            j$.util.stream.f r0 = r14.mo43848d()
            if (r0 != 0) goto L_0x009c
            r0 = 1
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r0 != 0) goto L_0x00e6
            long r3 = r14.f107799l
            long r5 = r14.f107800m
            long r3 = r3 + r5
            boolean r0 = r14.f107802o
            if (r0 == 0) goto L_0x00ab
            long r5 = r14.f107801n
            goto L_0x00af
        L_0x00ab:
            long r5 = r14.m71914k(r3)
        L_0x00af:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00b4
            goto L_0x00e1
        L_0x00b4:
            j$.util.stream.f r0 = r14.mo43848d()
            j$.util.stream.R1 r0 = (p3186j$.util.stream.C41194R1) r0
            r7 = r14
        L_0x00bb:
            if (r0 == 0) goto L_0x00db
            j$.util.stream.f r8 = r0.f107897e
            if (r7 != r8) goto L_0x00d1
            j$.util.stream.f r7 = r0.f107896d
            j$.util.stream.R1 r7 = (p3186j$.util.stream.C41194R1) r7
            if (r7 == 0) goto L_0x00d1
            long r7 = r7.m71914k(r3)
            long r5 = r5 + r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x00d1
            goto L_0x00e1
        L_0x00d1:
            j$.util.stream.f r7 = r0.mo43848d()
            j$.util.stream.R1 r7 = (p3186j$.util.stream.C41194R1) r7
            r13 = r7
            r7 = r0
            r0 = r13
            goto L_0x00bb
        L_0x00db:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            if (r1 == 0) goto L_0x00e6
            r14.mo43834i()
        L_0x00e6:
            super.onCompletion(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.stream.C41194R1.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}

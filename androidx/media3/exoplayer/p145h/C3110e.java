package androidx.media3.exoplayer.p145h;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2897cz;

/* renamed from: androidx.media3.exoplayer.h.e */
/* compiled from: PG */
public final class C3110e implements C3034aq, C3033ap {

    /* renamed from: a */
    public final C3034aq f9115a;

    /* renamed from: b */
    public long f9116b;

    /* renamed from: c */
    public long f9117c;

    /* renamed from: d */
    public C3111f f9118d;

    /* renamed from: e */
    private C3033ap f9119e;

    /* renamed from: f */
    private C3109d[] f9120f = new C3109d[0];

    /* renamed from: g */
    private long f9121g;

    public C3110e(C3034aq aqVar, boolean z, long j, long j2) {
        this.f9115a = aqVar;
        this.f9121g = true != z ? -9223372036854775807L : j;
        this.f9116b = j;
        this.f9117c = j2;
    }

    /* renamed from: a */
    public final long mo6807a(long j, C2897cz czVar) {
        long j2 = this.f9116b;
        if (j == j2) {
            return j2;
        }
        long s = C2612ak.m6994s(czVar.f8204c, 0, j - j2);
        long j3 = czVar.f8205d;
        long j4 = this.f9117c;
        long s2 = C2612ak.m6994s(j3, 0, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (!(s == czVar.f8204c && s2 == czVar.f8205d)) {
            czVar = new C2897cz(s, s2);
        }
        return this.f9115a.mo6807a(j, czVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6617b(C3097ch chVar) {
        C3034aq aqVar = (C3034aq) chVar;
        C3033ap apVar = this.f9119e;
        apVar.getClass();
        apVar.mo6617b(this);
    }

    /* renamed from: c */
    public final long mo6808c() {
        long c = this.f9115a.mo6808c();
        if (c != Long.MIN_VALUE) {
            long j = this.f9117c;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: d */
    public final long mo6809d() {
        long d = this.f9115a.mo6809d();
        if (d != Long.MIN_VALUE) {
            long j = this.f9117c;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: e */
    public final long mo6810e() {
        if (mo7100k()) {
            long j = this.f9121g;
            this.f9121g = -9223372036854775807L;
            long e = mo6810e();
            return e != -9223372036854775807L ? e : j;
        }
        long e2 = this.f9115a.mo6810e();
        if (e2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        C2601a.m6832d(e2 >= this.f9116b);
        long j2 = this.f9117c;
        if (j2 == Long.MIN_VALUE || e2 <= j2) {
            z = true;
        }
        C2601a.m6832d(z);
        return e2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r8) goto L_0x0035;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo6811f(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f9121g = r0
            androidx.media3.exoplayer.h.d[] r0 = r7.f9120f
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0017
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0014
            r4.f9113b = r2
        L_0x0014:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0017:
            androidx.media3.exoplayer.h.aq r0 = r7.f9115a
            long r0 = r0.mo6811f(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0034
            long r8 = r7.f9116b
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0035
            long r8 = r7.f9117c
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            androidx.media3.common.p136b.C2601a.m6832d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3110e.mo6811f(long):long");
    }

    /* renamed from: fc */
    public final void mo6812fc(C3033ap apVar, long j) {
        this.f9119e = apVar;
        this.f9115a.mo6812fc(this, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r1 > r4) goto L_0x007e;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo6813g(androidx.media3.exoplayer.p150j.C3197ad[] r16, boolean[] r17, androidx.media3.exoplayer.p145h.C3095cf[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            androidx.media3.exoplayer.h.d[] r2 = new androidx.media3.exoplayer.p145h.C3109d[r1]
            r0.f9120f = r2
            androidx.media3.exoplayer.h.cf[] r10 = new androidx.media3.exoplayer.p145h.C3095cf[r1]
            r11 = 0
            r1 = 0
        L_0x000e:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L_0x0023
            androidx.media3.exoplayer.h.d[] r2 = r0.f9120f
            r3 = r9[r1]
            androidx.media3.exoplayer.h.d r3 = (androidx.media3.exoplayer.p145h.C3109d) r3
            r2[r1] = r3
            if (r3 == 0) goto L_0x001e
            androidx.media3.exoplayer.h.cf r12 = r3.f9112a
        L_0x001e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0023:
            androidx.media3.exoplayer.h.aq r1 = r0.f9115a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.mo6813g(r2, r3, r4, r5, r6)
            boolean r3 = r15.mo7100k()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x0064
            long r6 = r0.f9116b
            int r3 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            r13 = 0
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0064
            int r3 = r8.length
            r6 = 0
        L_0x004b:
            if (r6 >= r3) goto L_0x0064
            r7 = r8[r6]
            if (r7 == 0) goto L_0x0061
            androidx.media3.common.x r7 = r7.mo7034l()
            java.lang.String r13 = r7.f7496n
            java.lang.String r7 = r7.f7493k
            boolean r7 = androidx.media3.common.C2598ay.m6811j(r13, r7)
            if (r7 != 0) goto L_0x0061
            r4 = r1
            goto L_0x0064
        L_0x0061:
            int r6 = r6 + 1
            goto L_0x004b
        L_0x0064:
            r0.f9121g = r4
            r3 = 1
            int r4 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x007f
            long r4 = r0.f9116b
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x007e
            long r4 = r0.f9117c
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x007f
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r3 = 0
        L_0x007f:
            androidx.media3.common.p136b.C2601a.m6832d(r3)
        L_0x0082:
            int r3 = r9.length
            if (r11 >= r3) goto L_0x00a8
            r3 = r10[r11]
            if (r3 != 0) goto L_0x008e
            androidx.media3.exoplayer.h.d[] r3 = r0.f9120f
            r3[r11] = r12
            goto L_0x009f
        L_0x008e:
            androidx.media3.exoplayer.h.d[] r4 = r0.f9120f
            r5 = r4[r11]
            if (r5 == 0) goto L_0x0098
            androidx.media3.exoplayer.h.cf r5 = r5.f9112a
            if (r5 == r3) goto L_0x009f
        L_0x0098:
            androidx.media3.exoplayer.h.d r5 = new androidx.media3.exoplayer.h.d
            r5.<init>(r15, r3)
            r4[r11] = r5
        L_0x009f:
            androidx.media3.exoplayer.h.d[] r3 = r0.f9120f
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L_0x0082
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3110e.mo6813g(androidx.media3.exoplayer.j.ad[], boolean[], androidx.media3.exoplayer.h.cf[], boolean[], long):long");
    }

    /* renamed from: h */
    public final C3107cr mo6814h() {
        return this.f9115a.mo6814h();
    }

    /* renamed from: i */
    public final void mo6815i(long j, boolean z) {
        this.f9115a.mo6815i(j, z);
    }

    /* renamed from: j */
    public final void mo6816j() {
        C3111f fVar = this.f9118d;
        if (fVar == null) {
            this.f9115a.mo6816j();
            return;
        }
        throw fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo7100k() {
        return this.f9121g != -9223372036854775807L;
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
        this.f9115a.mo6818m(j);
    }

    /* renamed from: n */
    public final boolean mo6819n(long j) {
        return this.f9115a.mo6819n(j);
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        return this.f9115a.mo6820o();
    }

    /* renamed from: eY */
    public final void mo6620eY(C3034aq aqVar) {
        if (this.f9118d == null) {
            C3033ap apVar = this.f9119e;
            apVar.getClass();
            apVar.mo6620eY(this);
        }
    }
}

package com.google.ads.interactivemedia.p367v3.internal;

import android.os.SystemClock;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bj */
/* compiled from: PG */
public final class C6822bj {

    /* renamed from: a */
    private final float f21609a = 0.97f;

    /* renamed from: b */
    private final float f21610b = 1.03f;

    /* renamed from: c */
    private final long f21611c = 500;

    /* renamed from: d */
    private final float f21612d = 5.0E-8f;

    /* renamed from: e */
    private C6871de f21613e = C6871de.f21845a;

    /* renamed from: f */
    private long f21614f = -9223372036854775807L;

    /* renamed from: g */
    private float f21615g = 1.0f;

    /* renamed from: h */
    private long f21616h = -9223372036854775807L;

    public /* synthetic */ C6822bj(float f, float f2, long j, float f3) {
    }

    /* renamed from: a */
    public final void mo15528a(C6871de deVar) {
        this.f21613e = deVar;
        this.f21616h = -9223372036854775807L;
    }

    /* renamed from: b */
    public final void mo15529b(long j) {
        this.f21614f = j;
        this.f21616h = -9223372036854775807L;
    }

    /* renamed from: c */
    public final float mo15530c(long j) {
        long d = mo15531d();
        if (d == -9223372036854775807L) {
            return 1.0f;
        }
        if (this.f21616h != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f21616h < 500) {
            return this.f21615g;
        }
        this.f21616h = SystemClock.elapsedRealtime();
        long j2 = j - d;
        if (Math.abs(j2) < 5000) {
            this.f21615g = 1.0f;
            return 1.0f;
        }
        float f = (((float) j2) * 5.0E-8f) + 1.0f;
        C6871de deVar = this.f21613e;
        float f2 = deVar.f21847c;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        float f3 = deVar.f21848d;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        float J = aeu.m18492J(f, f2, f3);
        this.f21615g = J;
        return J;
    }

    /* renamed from: d */
    public final long mo15531d() {
        long j = this.f21614f;
        if (j == -9223372036854775807L || this.f21613e.f21846b == -9223372036854775807L) {
            return C6821bi.m19755b(this.f21613e.f21846b);
        }
        return j;
    }
}

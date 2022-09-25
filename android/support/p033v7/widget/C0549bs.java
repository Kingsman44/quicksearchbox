package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.bs */
/* compiled from: PG */
final class C0549bs {

    /* renamed from: a */
    long f2139a = 0;

    /* renamed from: b */
    C0549bs f2140b;

    /* renamed from: h */
    private final void m2024h() {
        if (this.f2140b == null) {
            this.f2140b = new C0549bs();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo2593a(int i) {
        C0549bs bsVar = this.f2140b;
        if (bsVar == null) {
            if (i >= 64) {
                return Long.bitCount(this.f2139a);
            }
            return Long.bitCount(this.f2139a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.f2139a & ((1 << i) - 1));
        } else {
            return bsVar.mo2593a(i - 64) + Long.bitCount(this.f2139a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2594b(int i) {
        if (i >= 64) {
            C0549bs bsVar = this.f2140b;
            if (bsVar != null) {
                bsVar.mo2594b(i - 64);
                return;
            }
            return;
        }
        this.f2139a &= (1 << i) ^ -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo2595c(int i, boolean z) {
        if (i >= 64) {
            m2024h();
            this.f2140b.mo2595c(i - 64, z);
            return;
        }
        long j = this.f2139a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        long j3 = (-1 ^ j2) & j;
        this.f2139a = (j & j2) | (j3 + j3);
        if (z) {
            mo2597e(i);
        } else {
            mo2594b(i);
        }
        if (z2 || this.f2140b != null) {
            m2024h();
            this.f2140b.mo2595c(0, z2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo2596d() {
        this.f2139a = 0;
        C0549bs bsVar = this.f2140b;
        if (bsVar != null) {
            bsVar.mo2596d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo2597e(int i) {
        if (i >= 64) {
            m2024h();
            this.f2140b.mo2597e(i - 64);
            return;
        }
        this.f2139a |= 1 << i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo2598f(int i) {
        if (i < 64) {
            return (this.f2139a & (1 << i)) != 0;
        }
        m2024h();
        return this.f2140b.mo2598f(i - 64);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo2599g(int i) {
        if (i >= 64) {
            m2024h();
            return this.f2140b.mo2599g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f2139a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (j ^ -1);
        this.f2139a = j3;
        long j4 = j - 1;
        this.f2139a = Long.rotateRight((j4 ^ -1) & j3, 1) | (j3 & j4);
        C0549bs bsVar = this.f2140b;
        if (bsVar != null) {
            if (bsVar.mo2598f(0)) {
                mo2597e(63);
            }
            this.f2140b.mo2599g(0);
        }
        return z;
    }

    public final String toString() {
        if (this.f2140b == null) {
            return Long.toBinaryString(this.f2139a);
        }
        return this.f2140b.toString() + "xx" + Long.toBinaryString(this.f2139a);
    }
}

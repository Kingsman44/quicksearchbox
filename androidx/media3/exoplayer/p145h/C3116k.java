package androidx.media3.exoplayer.p145h;

/* renamed from: androidx.media3.exoplayer.h.k */
/* compiled from: PG */
public final class C3116k implements C3097ch {

    /* renamed from: a */
    protected final C3097ch[] f9134a;

    public C3116k(C3097ch[] chVarArr) {
        this.f9134a = chVarArr;
    }

    /* renamed from: c */
    public final long mo6808c() {
        long j = Long.MAX_VALUE;
        for (C3097ch c : this.f9134a) {
            long c2 = c.mo6808c();
            if (c2 != Long.MIN_VALUE) {
                j = Math.min(j, c2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: d */
    public final long mo6809d() {
        long j = Long.MAX_VALUE;
        for (C3097ch d : this.f9134a) {
            long d2 = d.mo6809d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
        for (C3097ch m : this.f9134a) {
            m.mo6818m(j);
        }
    }

    /* renamed from: n */
    public final boolean mo6819n(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long d = mo6809d();
            if (d != Long.MIN_VALUE) {
                boolean z2 = false;
                for (C3097ch chVar : this.f9134a) {
                    long d2 = chVar.mo6809d();
                    boolean z3 = d2 != Long.MIN_VALUE && d2 <= j2;
                    if (d2 == d || z3) {
                        z2 |= chVar.mo6819n(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        for (C3097ch o : this.f9134a) {
            if (o.mo6820o()) {
                return true;
            }
        }
        return false;
    }
}

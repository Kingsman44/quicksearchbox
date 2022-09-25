package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tb */
/* compiled from: PG */
public final class C7300tb implements C7356vd {

    /* renamed from: a */
    protected final C7356vd[] f23794a;

    public C7300tb(C7356vd[] vdVarArr) {
        this.f23794a = vdVarArr;
    }

    /* renamed from: f */
    public final void mo16502f(long j) {
        for (C7356vd f : this.f23794a) {
            f.mo16502f(j);
        }
    }

    /* renamed from: h */
    public final long mo16504h() {
        long j = Long.MAX_VALUE;
        for (C7356vd h : this.f23794a) {
            long h2 = h.mo16504h();
            if (h2 != Long.MIN_VALUE) {
                j = Math.min(j, h2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: l */
    public final long mo16507l() {
        long j = Long.MAX_VALUE;
        for (C7356vd l : this.f23794a) {
            long l2 = l.mo16507l();
            if (l2 != Long.MIN_VALUE) {
                j = Math.min(j, l2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: n */
    public final boolean mo16508n(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long l = mo16507l();
            if (l != Long.MIN_VALUE) {
                boolean z2 = false;
                for (C7356vd vdVar : this.f23794a) {
                    long l2 = vdVar.mo16507l();
                    boolean z3 = l2 != Long.MIN_VALUE && l2 <= j2;
                    if (l2 == l || z3) {
                        z2 |= vdVar.mo16508n(j2);
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
    public final boolean mo16509o() {
        for (C7356vd o : this.f23794a) {
            if (o.mo16509o()) {
                return true;
            }
        }
        return false;
    }
}

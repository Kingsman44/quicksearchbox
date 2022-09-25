package com.google.common.p4543n.p4546c;

import com.google.common.base.C58838bb;
import com.google.common.p4535g.C59203do;
import com.google.common.p4573p.C60718h;
import java.util.Arrays;

/* renamed from: com.google.common.n.c.m */
/* compiled from: PG */
public final class C59405m extends C59407o {

    /* renamed from: a */
    private final C59407o f157615a;

    /* renamed from: b */
    private final double f157616b;

    public C59405m(C59407o oVar, double d) {
        boolean z = true;
        boolean z2 = d >= C59203do.f157270a;
        Double valueOf = Double.valueOf(d);
        C58838bb.m90873h(z2, "randomnessFactor (%s) must be >= 0.0", valueOf);
        C58838bb.m90873h(d > 1.0d ? false : z, "randomnessFactor (%s) must be <= 1.0", valueOf);
        this.f157615a = oVar;
        this.f157616b = d;
    }

    /* renamed from: k */
    private final long m92303k(long j) {
        double random = Math.random() - 8.0d;
        double d = (double) j;
        Double.isNaN(d);
        return C60718h.m92652f(j, (long) ((random + random) * d * this.f157616b));
    }

    /* renamed from: a */
    public final long mo56909a(int i) {
        long a = this.f157615a.mo56909a(i);
        if (a <= 0) {
            return a;
        }
        return m92303k(a);
    }

    /* renamed from: c */
    public final long mo56917c(int i, long j) {
        long c = this.f157615a.mo56917c(i, j);
        if (c <= 0) {
            return c;
        }
        return m92303k(c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59405m) {
            C59405m mVar = (C59405m) obj;
            if (!this.f157615a.equals(mVar.f157615a) || this.f157616b != mVar.f157616b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f157615a, Double.valueOf(this.f157616b)});
    }

    public final String toString() {
        String obj = this.f157615a.toString();
        double d = this.f157616b;
        return obj + ".withRandomization(" + d + ")";
    }
}

package com.google.common.p4543n.p4546c;

import com.google.common.base.C58838bb;
import com.google.common.p4535g.C59203do;
import java.util.Arrays;

/* renamed from: com.google.common.n.c.k */
/* compiled from: PG */
class C59403k extends C59407o {

    /* renamed from: a */
    final int f157611a;

    /* renamed from: b */
    final long f157612b;

    /* renamed from: c */
    final double f157613c;

    public C59403k(long j, double d, int i) {
        C59407o.m92312i(i);
        this.f157611a = i;
        C59407o.m92313j(j, "firstDelayMillis");
        this.f157612b = j;
        C58838bb.m90879n(d > C59203do.f157270a, "%s (%s) must be > 0", "multiplier", Double.valueOf(d));
        this.f157613c = d;
    }

    /* renamed from: a */
    public final long mo56909a(int i) {
        if (i == 0) {
            return 0;
        }
        if (!mo56912b(i)) {
            return -1;
        }
        double d = (double) this.f157612b;
        double pow = Math.pow(this.f157613c, (double) (i - 1));
        Double.isNaN(d);
        return (long) (d * pow);
    }

    /* renamed from: b */
    public final boolean mo56912b(int i) {
        C59407o.m92310g(i);
        return i < this.f157611a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59403k) {
            C59403k kVar = (C59403k) obj;
            if (this.f157612b == kVar.f157612b && this.f157613c == kVar.f157613c && this.f157611a == kVar.f157611a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f157611a), Long.valueOf(this.f157612b), Double.valueOf(this.f157613c)});
    }
}

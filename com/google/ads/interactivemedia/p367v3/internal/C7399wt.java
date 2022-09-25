package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wt */
/* compiled from: PG */
final class C7399wt {

    /* renamed from: a */
    public final boolean f24206a;

    /* renamed from: b */
    public final long f24207b;

    /* renamed from: c */
    public final long f24208c;

    private C7399wt(boolean z, long j, long j2) {
        this.f24206a = z;
        this.f24207b = j;
        this.f24208c = j2;
    }

    /* renamed from: a */
    public static C7399wt m22300a(C7421xo xoVar, long j, long j2) {
        boolean z;
        boolean z2;
        C7421xo xoVar2 = xoVar;
        long j3 = j;
        long j4 = j2;
        int size = xoVar2.f24329c.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            int i2 = ((C7415xi) xoVar2.f24329c.get(i)).f24290b;
            if (i2 == 1 || i2 == 2) {
                z = true;
            } else {
                i++;
            }
        }
        long j5 = Long.MAX_VALUE;
        long j6 = 0;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i3 < size) {
            C7415xi xiVar = (C7415xi) xoVar2.f24329c.get(i3);
            List list = xiVar.f24291c;
            if ((!z || xiVar.f24290b != 3) && !list.isEmpty()) {
                C7403wx l = ((C7426xt) list.get(0)).mo16783l();
                if (l == null) {
                    return new C7399wt(true, 0, j);
                }
                z3 |= l.mo16737j();
                int h = l.mo16735h(j3, j4);
                if (h == 0) {
                    z2 = z;
                    j6 = 0;
                    j5 = 0;
                    z4 = true;
                } else if (!z4) {
                    z2 = z;
                    long f = l.mo16733f(j3, j4);
                    j6 = Math.max(j6, l.mo16729b(f));
                    long j7 = (f + ((long) h)) - 1;
                    j5 = Math.min(j5, l.mo16729b(j7) + l.mo16730c(j7, j3));
                }
                i3++;
                xoVar2 = xoVar;
                j4 = j2;
                z = z2;
            }
            z2 = z;
            i3++;
            xoVar2 = xoVar;
            j4 = j2;
            z = z2;
        }
        return new C7399wt(z3, j6, j5);
    }
}

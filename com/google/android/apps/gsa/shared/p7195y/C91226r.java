package com.google.android.apps.gsa.shared.p7195y;

import com.bumptech.glide.load.p299c.p300a.C5873v;

/* renamed from: com.google.android.apps.gsa.shared.y.r */
/* compiled from: PG */
public final class C91226r extends C5873v {

    /* renamed from: h */
    private final C91230v f254639h;

    /* renamed from: i */
    private final float f254640i;

    /* renamed from: j */
    private final long f254641j;

    /* renamed from: k */
    private final boolean f254642k;

    public C91226r(C91230v vVar) {
        this.f254639h = vVar;
        this.f254640i = vVar.mo85493a();
        this.f254641j = vVar.mo85494b();
        this.f254642k = vVar.mo85495c();
    }

    /* renamed from: a */
    public final float mo12332a(int i, int i2, int i3, int i4) {
        long j;
        float max = Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        if (!this.f254642k) {
            max = Math.min(max, 1.0f);
        }
        float f = this.f254640i;
        if (f == Float.MAX_VALUE && this.f254641j == Long.MAX_VALUE) {
            return max;
        }
        if (f == Float.MAX_VALUE) {
            j = this.f254641j;
        } else {
            long j2 = this.f254641j;
            j = (long) (((float) (i3 * i4)) * f);
            if (j2 != Long.MAX_VALUE) {
                j = Math.min(j, j2);
            }
        }
        double d = (double) j;
        double d2 = (double) (i * i2);
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.min(max, (float) Math.sqrt(d / d2));
    }

    /* renamed from: b */
    public final int mo12333b(int i, int i2, int i3, int i4) {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91226r) {
            return this.f254639h.equals(((C91226r) obj).f254639h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f254639h.hashCode();
    }
}

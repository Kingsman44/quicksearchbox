package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.af */
/* compiled from: PG */
public final class C126378af {

    /* renamed from: a */
    public final double f348087a;

    public /* synthetic */ C126378af(double d) {
        this.f348087a = d;
    }

    public final boolean equals(Object obj) {
        double d = this.f348087a;
        if (!(obj instanceof C126378af)) {
            return false;
        }
        return C69664n.m101066l(Double.valueOf(d), Double.valueOf(((C126378af) obj).f348087a));
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f348087a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        double d = this.f348087a;
        return "BucketStats(rms=" + d + ")";
    }
}

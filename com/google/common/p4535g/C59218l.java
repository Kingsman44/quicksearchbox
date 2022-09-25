package com.google.common.p4535g;

import com.google.common.p4575r.C60757n;
import java.io.Serializable;

/* renamed from: com.google.common.g.l */
/* compiled from: PG */
public final class C59218l implements Comparable, Serializable {

    /* renamed from: a */
    public static final C59218l f157297a = new C59218l(Double.POSITIVE_INFINITY);

    /* renamed from: b */
    public static final C59218l f157298b = new C59218l(C59203do.f157270a);

    /* renamed from: c */
    public final double f157299c;

    public C59218l() {
        this.f157299c = C59203do.f157270a;
    }

    public C59218l(double d) {
        this.f157299c = d;
    }

    /* renamed from: b */
    public static C59218l m91868b(double d) {
        return new C59218l(d * 0.017453292519943295d);
    }

    /* renamed from: c */
    public static C59218l m91869c(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return m91868b(d * 1.0E-7d);
    }

    /* renamed from: d */
    public static C59218l m91870d(C59218l lVar, C59218l lVar2) {
        return lVar2.f157299c > lVar.f157299c ? lVar : lVar2;
    }

    /* renamed from: a */
    public final int mo56611a() {
        return C60757n.m92740a(Math.round(this.f157299c * 57.29577951308232d * 1.0E7d));
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        double d = this.f157299c;
        double d2 = ((C59218l) obj).f157299c;
        if (d < d2) {
            return -1;
        }
        return d <= d2 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59218l) || this.f157299c != ((C59218l) obj).f157299c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f157299c);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return (this.f157299c * 57.29577951308232d) + "d";
    }
}

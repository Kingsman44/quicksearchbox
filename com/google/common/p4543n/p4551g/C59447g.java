package com.google.common.p4543n.p4551g;

import java.io.Serializable;

/* renamed from: com.google.common.n.g.g */
/* compiled from: PG */
public class C59447g implements Comparable, Serializable {

    /* renamed from: b */
    public final double f157702b;

    /* renamed from: c */
    public final C59446f f157703c;

    protected C59447g(C59446f fVar, double d) {
        this.f157703c = fVar;
        this.f157702b = d;
    }

    /* renamed from: b */
    public static double m92356b(double d, C59446f fVar, C59446f fVar2) {
        if (fVar.equals(fVar2)) {
            return d;
        }
        double d2 = (double) (((long) fVar2.f157698a) * ((long) fVar.f157699b));
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) (((long) fVar2.f157699b) * ((long) fVar.f157698a));
        Double.isNaN(d4);
        return d3 / d4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final double mo56964c(C59447g gVar) {
        return m92356b(gVar.f157702b, gVar.f157703c, this.f157703c);
    }

    /* renamed from: d */
    public final int compareTo(C59447g gVar) {
        if (this == gVar) {
            return 0;
        }
        return Double.compare(this.f157702b, mo56964c(gVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C59447g) && this.f157702b == mo56964c((C59447g) obj);
    }

    public int hashCode() {
        return ((int) (this.f157702b * 413.0d)) + this.f157703c.hashCode();
    }

    public String toString() {
        return Double.toString(this.f157702b);
    }
}

package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.f */
/* compiled from: PG */
public final class C59212f implements Comparable, Serializable {

    /* renamed from: a */
    public final C59136bb f157287a;

    /* renamed from: b */
    private final double f157288b;

    public C59212f(double d, C59136bb bbVar) {
        this.f157288b = d;
        this.f157287a = bbVar;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C59212f fVar = (C59212f) obj;
        int compare = Double.compare(this.f157288b, fVar.f157288b);
        if (compare != 0) {
            return compare;
        }
        return this.f157287a.compareTo(fVar.f157287a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59212f) {
            C59212f fVar = (C59212f) obj;
            if (this.f157288b != fVar.f157288b || !this.f157287a.mo56506q(fVar.f157287a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f157287a.hashCode();
    }
}

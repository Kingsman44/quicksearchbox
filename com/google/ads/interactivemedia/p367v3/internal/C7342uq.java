package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uq */
/* compiled from: PG */
final class C7342uq {

    /* renamed from: a */
    public final int f23918a;

    /* renamed from: b */
    public final boolean f23919b;

    public C7342uq(int i, boolean z) {
        this.f23918a = i;
        this.f23919b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7342uq uqVar = (C7342uq) obj;
            return this.f23918a == uqVar.f23918a && this.f23919b == uqVar.f23919b;
        }
    }

    public final int hashCode() {
        return (this.f23918a * 31) + (this.f23919b ? 1 : 0);
    }
}

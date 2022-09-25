package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ix */
/* compiled from: PG */
public final class C7025ix {

    /* renamed from: a */
    public final int f22520a = 0;

    /* renamed from: b */
    public final int f22521b;

    /* renamed from: c */
    public final int f22522c;

    public C7025ix(int i, int i2) {
        this.f22521b = i;
        this.f22522c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7025ix)) {
            return false;
        }
        C7025ix ixVar = (C7025ix) obj;
        int i = ixVar.f22520a;
        return this.f22521b == ixVar.f22521b && this.f22522c == ixVar.f22522c;
    }

    public final int hashCode() {
        return ((this.f22521b + 16337) * 31) + this.f22522c;
    }
}

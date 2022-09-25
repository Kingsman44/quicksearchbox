package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aun */
/* compiled from: PG */
final class aun {

    /* renamed from: a */
    private final Object f21568a;

    /* renamed from: b */
    private final int f21569b;

    public aun(Object obj) {
        this.f21569b = System.identityHashCode(obj);
        this.f21568a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aun)) {
            return false;
        }
        aun aun = (aun) obj;
        if (this.f21569b == aun.f21569b && this.f21568a == aun.f21568a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21569b;
    }
}

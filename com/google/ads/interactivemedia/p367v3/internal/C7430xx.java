package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xx */
/* compiled from: PG */
public final class C7430xx {

    /* renamed from: a */
    final long f24358a;

    /* renamed from: b */
    final long f24359b;

    public C7430xx(long j, long j2) {
        this.f24358a = j;
        this.f24359b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7430xx xxVar = (C7430xx) obj;
            return this.f24358a == xxVar.f24358a && this.f24359b == xxVar.f24359b;
        }
    }

    public final int hashCode() {
        return (((int) this.f24358a) * 31) + ((int) this.f24359b);
    }
}

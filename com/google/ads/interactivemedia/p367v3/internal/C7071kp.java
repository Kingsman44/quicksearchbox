package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kp */
/* compiled from: PG */
public final class C7071kp {

    /* renamed from: a */
    public static final C7071kp f22629a = new C7071kp(0, 0);

    /* renamed from: b */
    public final long f22630b;

    /* renamed from: c */
    public final long f22631c;

    public C7071kp(long j, long j2) {
        this.f22630b = j;
        this.f22631c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7071kp kpVar = (C7071kp) obj;
            return this.f22630b == kpVar.f22630b && this.f22631c == kpVar.f22631c;
        }
    }

    public final int hashCode() {
        return (((int) this.f22630b) * 31) + ((int) this.f22631c);
    }

    public final String toString() {
        long j = this.f22630b;
        long j2 = this.f22631c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}

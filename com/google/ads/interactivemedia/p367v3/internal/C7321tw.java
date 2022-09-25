package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tw */
/* compiled from: PG */
public final class C7321tw {

    /* renamed from: a */
    public final Object f23859a;

    /* renamed from: b */
    public final int f23860b;

    /* renamed from: c */
    public final int f23861c;

    /* renamed from: d */
    public final long f23862d;

    /* renamed from: e */
    public final int f23863e;

    public C7321tw(Object obj) {
        this(obj, -1, -1, -1, -1);
    }

    private C7321tw(Object obj, int i, int i2, long j, int i3) {
        this.f23859a = obj;
        this.f23860b = i;
        this.f23861c = i2;
        this.f23862d = j;
        this.f23863e = i3;
    }

    /* renamed from: a */
    public final C7321tw mo16541a(Object obj) {
        if (this.f23859a.equals(obj)) {
            return this;
        }
        return new C7321tw(obj, this.f23860b, this.f23861c, this.f23862d, this.f23863e);
    }

    /* renamed from: b */
    public final boolean mo16542b() {
        return this.f23860b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7321tw twVar = (C7321tw) obj;
            return this.f23859a.equals(twVar.f23859a) && this.f23860b == twVar.f23860b && this.f23861c == twVar.f23861c && this.f23862d == twVar.f23862d && this.f23863e == twVar.f23863e;
        }
    }

    public final int hashCode() {
        return ((((((((this.f23859a.hashCode() + 527) * 31) + this.f23860b) * 31) + this.f23861c) * 31) + ((int) this.f23862d)) * 31) + this.f23863e;
    }

    public C7321tw(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public C7321tw(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}

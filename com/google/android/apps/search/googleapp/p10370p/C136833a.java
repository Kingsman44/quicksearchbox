package com.google.android.apps.search.googleapp.p10370p;

/* renamed from: com.google.android.apps.search.googleapp.p.a */
/* compiled from: PG */
final class C136833a extends C136847an {

    /* renamed from: a */
    public final int f372454a;

    /* renamed from: b */
    public final int f372455b;

    public C136833a(int i, int i2) {
        this.f372454a = i;
        this.f372455b = i2;
    }

    /* renamed from: a */
    public final int mo113406a() {
        return this.f372455b;
    }

    /* renamed from: b */
    public final int mo113407b() {
        return this.f372454a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C136847an) {
            C136847an anVar = (C136847an) obj;
            return this.f372454a == anVar.mo113407b() && this.f372455b == anVar.mo113406a();
        }
    }

    public final int hashCode() {
        return ((this.f372454a ^ 1000003) * 1000003) ^ this.f372455b;
    }

    public final String toString() {
        int i = this.f372454a;
        int i2 = this.f372455b;
        return "UniqueAndTotalUsage{uniqueUsage=" + i + ", totalUsage=" + i2 + "}";
    }
}

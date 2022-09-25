package com.google.android.apps.search.googleapp.search.suggest.p10449b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.a */
/* compiled from: PG */
public final class C138036a extends C138051h {

    /* renamed from: a */
    public final int f375592a;

    /* renamed from: b */
    public final int f375593b;

    /* renamed from: c */
    public final String f375594c;

    public C138036a(int i, int i2, String str) {
        this.f375592a = i;
        this.f375593b = i2;
        this.f375594c = str;
    }

    /* renamed from: a */
    public final int mo114086a() {
        return this.f375593b;
    }

    /* renamed from: b */
    public final int mo114087b() {
        return this.f375592a;
    }

    /* renamed from: c */
    public final String mo114088c() {
        return this.f375594c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C138051h) {
            C138051h hVar = (C138051h) obj;
            return this.f375592a == hVar.mo114087b() && this.f375593b == hVar.mo114086a() && this.f375594c.equals(hVar.mo114088c());
        }
    }

    public final int hashCode() {
        return ((((this.f375592a ^ 1000003) * 1000003) ^ this.f375593b) * 1000003) ^ this.f375594c.hashCode();
    }

    public final String toString() {
        int i = this.f375592a;
        int i2 = this.f375593b;
        String str = this.f375594c;
        return "RTTData{totalRoundTripTimeMsec=" + i + ", maxRoundTripTimeMsec=" + i2 + ", compressedRoundTripHistogram=" + str + "}";
    }
}

package com.google.android.libraries.p10915aa.p10920b;

/* renamed from: com.google.android.libraries.aa.b.t */
/* compiled from: PG */
final class C146697t extends C146660ah {

    /* renamed from: a */
    private final C146659ag f396139a;

    /* renamed from: b */
    private final int f396140b;

    public C146697t(C146659ag agVar, int i) {
        this.f396139a = agVar;
        this.f396140b = i;
    }

    /* renamed from: a */
    public final C146659ag mo123439a() {
        return this.f396139a;
    }

    /* renamed from: b */
    public final int mo123440b() {
        return this.f396140b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146660ah) {
            C146660ah ahVar = (C146660ah) obj;
            return this.f396139a.equals(ahVar.mo123439a()) && this.f396140b == ahVar.mo123440b();
        }
    }

    public final int hashCode() {
        return ((this.f396139a.hashCode() ^ 1000003) * 1000003) ^ this.f396140b;
    }

    public final String toString() {
        String obj = this.f396139a.toString();
        String num = Integer.toString(this.f396140b - 1);
        return "ProcessedReference{conditions=" + obj + ", disambiguationType=" + num + "}";
    }
}

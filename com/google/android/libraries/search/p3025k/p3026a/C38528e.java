package com.google.android.libraries.search.p3025k.p3026a;

/* renamed from: com.google.android.libraries.search.k.a.e */
/* compiled from: PG */
final class C38528e extends C38539p {

    /* renamed from: a */
    private final int f101901a;

    public C38528e(int i) {
        this.f101901a = i;
    }

    /* renamed from: d */
    public final long mo41471d() {
        return 1;
    }

    /* renamed from: e */
    public final int mo41472e() {
        return this.f101901a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38539p) {
            C38539p pVar = (C38539p) obj;
            return this.f101901a == pVar.mo41472e() && pVar.mo41471d() == 1;
        }
    }

    public final int hashCode() {
        return ((this.f101901a ^ 1000003) * 1000003) ^ 1;
    }

    public final String toString() {
        String str = this.f101901a != 1 ? "OPENED_EXTERNAL_APP" : "SRP_RENDERED";
        return "SearchTextSearchSuccessMtvMetric{reason=" + str + ", count=1}";
    }
}

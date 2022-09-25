package com.google.android.libraries.search.p3025k.p3026a;

/* renamed from: com.google.android.libraries.search.k.a.d */
/* compiled from: PG */
final class C38527d extends C38538o {

    /* renamed from: a */
    private final int f101900a;

    public C38527d(int i) {
        this.f101900a = i;
    }

    /* renamed from: d */
    public final long mo41466d() {
        return 1;
    }

    /* renamed from: e */
    public final int mo41467e() {
        return this.f101900a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38538o) {
            C38538o oVar = (C38538o) obj;
            return this.f101900a == oVar.mo41467e() && oVar.mo41466d() == 1;
        }
    }

    public final int hashCode() {
        return ((this.f101900a ^ 1000003) * 1000003) ^ 1;
    }

    public final String toString() {
        int i = this.f101900a;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "GENERIC_ERROR" : "REQUEST_DATA_ERROR" : "CAPTCHA_SHOWN" : "CONNECTIVITY_ERROR" : "SSL_ERROR";
        return "SearchTextSearchFailureMtvMetric{reason=" + str + ", count=1}";
    }
}

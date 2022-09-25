package com.google.android.libraries.search.p3025k.p3026a;

/* renamed from: com.google.android.libraries.search.k.a.c */
/* compiled from: PG */
final class C38526c extends C38537n {

    /* renamed from: a */
    private final long f101897a = 1;

    /* renamed from: b */
    private final int f101898b;

    /* renamed from: c */
    private final int f101899c;

    public C38526c(int i, int i2, long j) {
        this.f101898b = i;
        this.f101899c = i2;
    }

    /* renamed from: d */
    public final long mo41460d() {
        return 1;
    }

    /* renamed from: e */
    public final int mo41461e() {
        return this.f101899c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38537n) {
            C38537n nVar = (C38537n) obj;
            return this.f101898b == nVar.mo41463f() && this.f101899c == nVar.mo41461e() && nVar.mo41460d() == 1;
        }
    }

    /* renamed from: f */
    public final int mo41463f() {
        return this.f101898b;
    }

    public final int hashCode() {
        return ((((this.f101898b ^ 1000003) * 1000003) ^ this.f101899c) * 1000003) ^ 1;
    }

    public final String toString() {
        int i = this.f101898b;
        String str = i != 1 ? i != 2 ? "NEW_REQUEST" : "BACK_PRESS" : "UNSPECIFIED";
        String str2 = this.f101899c != 2 ? "RENDERING" : "AWAITING_RESPONSE";
        return "SearchTextSearchCancelMtvMetric{reason=" + str + ", process=" + str2 + ", count=1}";
    }
}

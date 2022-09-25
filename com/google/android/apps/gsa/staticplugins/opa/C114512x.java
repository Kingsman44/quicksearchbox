package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x */
/* compiled from: PG */
final class C114512x extends C109354kq {

    /* renamed from: a */
    private final Query f317545a;

    /* renamed from: b */
    private final long f317546b;

    public C114512x(Query query, long j) {
        if (query != null) {
            this.f317545a = query;
            this.f317546b = j;
            return;
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: a */
    public final long mo97793a() {
        return this.f317546b;
    }

    /* renamed from: b */
    public final Query mo97794b() {
        return this.f317545a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C109354kq) {
            C109354kq kqVar = (C109354kq) obj;
            return this.f317545a.equals(kqVar.mo97794b()) && this.f317546b == kqVar.mo97793a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f317545a.hashCode();
        long j = this.f317546b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f317545a.toString();
        long j = this.f317546b;
        return "LogParams{query=" + obj + ", assistSessionId=" + j + "}";
    }
}

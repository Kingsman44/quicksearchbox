package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hi */
/* compiled from: PG */
public final class C82496hi extends C82725pv {

    /* renamed from: a */
    private final String f225409a = "SODA_SESSION_DURATION";

    /* renamed from: b */
    private final Double f225410b;

    public C82496hi(String str, Double d) {
        this.f225410b = d;
    }

    /* renamed from: b */
    public final Double mo76472b() {
        return this.f225410b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225409a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82725pv) {
            C82725pv pvVar = (C82725pv) obj;
            return this.f225409a.equals(pvVar.mo75583d()) && this.f225410b.equals(pvVar.mo76472b());
        }
    }

    public final int hashCode() {
        return ((this.f225409a.hashCode() ^ 1000003) * 1000003) ^ this.f225410b.hashCode();
    }

    public final String toString() {
        String str = this.f225409a;
        Double d = this.f225410b;
        return "SodaSessionDurationEvent{token=" + str + ", value=" + d + "}";
    }
}

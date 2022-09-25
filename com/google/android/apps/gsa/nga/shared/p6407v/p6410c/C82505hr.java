package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hr */
/* compiled from: PG */
public final class C82505hr extends C82735qe {

    /* renamed from: a */
    private final String f225444a = "UNINTENDED_QUERY_SUPPRESSION_LATENCY";

    /* renamed from: b */
    private final Double f225445b;

    /* renamed from: c */
    private final String f225446c;

    public C82505hr(String str, Double d, String str2) {
        this.f225445b = d;
        this.f225446c = str2;
    }

    /* renamed from: b */
    public final Double mo76521b() {
        return this.f225445b;
    }

    /* renamed from: c */
    public final String mo76522c() {
        return this.f225446c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225444a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82735qe) {
            C82735qe qeVar = (C82735qe) obj;
            return this.f225444a.equals(qeVar.mo75583d()) && this.f225445b.equals(qeVar.mo76521b()) && this.f225446c.equals(qeVar.mo76522c());
        }
    }

    public final int hashCode() {
        return ((((this.f225444a.hashCode() ^ 1000003) * 1000003) ^ this.f225445b.hashCode()) * 1000003) ^ this.f225446c.hashCode();
    }

    public final String toString() {
        String str = this.f225444a;
        Double d = this.f225445b;
        String str2 = this.f225446c;
        return "UnintendedQuerySuppressionLatencyEvent{token=" + str + ", value=" + d + ", language=" + str2 + "}";
    }
}

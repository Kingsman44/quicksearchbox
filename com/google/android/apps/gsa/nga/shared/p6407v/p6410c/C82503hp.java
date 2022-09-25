package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hp */
/* compiled from: PG */
final class C82503hp extends C82733qc {

    /* renamed from: a */
    private final String f225433a;

    /* renamed from: b */
    private final String f225434b;

    /* renamed from: c */
    private final String f225435c;

    public C82503hp(String str, String str2, String str3) {
        this.f225433a = str;
        this.f225434b = str2;
        this.f225435c = str3;
    }

    /* renamed from: b */
    public final String mo76506b() {
        return this.f225435c;
    }

    /* renamed from: c */
    public final String mo76507c() {
        return this.f225434b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225433a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82733qc) {
            C82733qc qcVar = (C82733qc) obj;
            return this.f225433a.equals(qcVar.mo75583d()) && this.f225434b.equals(qcVar.mo76507c()) && this.f225435c.equals(qcVar.mo76506b());
        }
    }

    public final int hashCode() {
        return ((((this.f225433a.hashCode() ^ 1000003) * 1000003) ^ this.f225434b.hashCode()) * 1000003) ^ this.f225435c.hashCode();
    }

    public final String toString() {
        String str = this.f225433a;
        String str2 = this.f225434b;
        String str3 = this.f225435c;
        return "UnintendedQuerySuppressionErrorCountEvent{token=" + str + ", language=" + str2 + ", errorMessage=" + str3 + "}";
    }
}

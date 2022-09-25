package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cs */
/* compiled from: PG */
public final class C82371cs extends C82601lf {

    /* renamed from: a */
    private final String f225033a = "NGA_ICING_EMAIL_KEYWORDS_COUNT";

    /* renamed from: b */
    private final Double f225034b;

    public C82371cs(String str, Double d) {
        this.f225034b = d;
    }

    /* renamed from: b */
    public final Double mo75905b() {
        return this.f225034b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225033a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82601lf) {
            C82601lf lfVar = (C82601lf) obj;
            return this.f225033a.equals(lfVar.mo75583d()) && this.f225034b.equals(lfVar.mo75905b());
        }
    }

    public final int hashCode() {
        return ((this.f225033a.hashCode() ^ 1000003) * 1000003) ^ this.f225034b.hashCode();
    }

    public final String toString() {
        String str = this.f225033a;
        Double d = this.f225034b;
        return "NgaIcingEmailKeywordsCountEvent{token=" + str + ", value=" + d + "}";
    }
}

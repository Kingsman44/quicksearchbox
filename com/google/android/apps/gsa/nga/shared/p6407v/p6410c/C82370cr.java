package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cr */
/* compiled from: PG */
public final class C82370cr extends C82600le {

    /* renamed from: a */
    private final String f225031a = "NGA_ICING_EMAIL_AVAILABLE_KEYWORDS_COUNT";

    /* renamed from: b */
    private final Double f225032b;

    public C82370cr(String str, Double d) {
        this.f225032b = d;
    }

    /* renamed from: b */
    public final Double mo75901b() {
        return this.f225032b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225031a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82600le) {
            C82600le leVar = (C82600le) obj;
            return this.f225031a.equals(leVar.mo75583d()) && this.f225032b.equals(leVar.mo75901b());
        }
    }

    public final int hashCode() {
        return ((this.f225031a.hashCode() ^ 1000003) * 1000003) ^ this.f225032b.hashCode();
    }

    public final String toString() {
        String str = this.f225031a;
        Double d = this.f225032b;
        return "NgaIcingEmailAvailableKeywordsCountEvent{token=" + str + ", value=" + d + "}";
    }
}
